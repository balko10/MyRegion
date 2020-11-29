package com.myregion.util;

import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

/**
 * Created by Alexander Crepaz on 28.11.2020.
 */

public class RepositoryUtil<T> {

    Boolean receivedAnswer = false;

    public void insertObject(String tag, T object) {
        RepositoryConstants.db.collection(tag)
                .add(object)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d("Repository Util", "inserted succeccfully");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.e("Repository Util", "insert failed");
                    }
                });
    }

    public void getAllObjects(String tag, Class<T> toCast, RepositoryListCallback<T> callback) {
        RepositoryConstants.db.collection(tag)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            if (task.getResult() == null) {
                                return;
                            }
                            List<T> resultList = new ArrayList<>();
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                resultList.add(document.toObject(toCast));
                            }
                            callback.onListCallback(resultList);
                        }

                    }
                });
    }

}
