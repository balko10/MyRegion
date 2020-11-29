package com.myregion.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SearchView;


import com.google.android.gms.tasks.OnCompleteListener;

import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.myregion.R;
import com.myregion.entities.Contact;
import com.myregion.entities.OpeningHour;
import com.myregion.entities.Store;
import com.myregion.util.RepositoryConstants;
import com.myregion.util.RepositoryUtil;


public class SearchActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    SearchView editsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.search_view);

        RepositoryConstants.createDBInstance();

        // just for testing
        Store store = testData();

        RepositoryUtil<Store> rep = new RepositoryUtil<>();
        //rep.insertObject(Store.tag, store);
        //rep.getDataFromServer(Store.tag, Store.class);
        rep.getAllObjects(Store.tag, Store.class);


        // see here: https://www.youtube.com/watch?v=66PdLHIEu1c&list=PL6Q9UqV2Sf1hnV1bPMxyGbHMWrfbokPaW&index=4
    }

    public Store testData() {
        Store store = new Store();
        store.setName("Haha Haus");
        //store.setPicture();
        store.setDescription("Wir sind ein kleines Familienunternehmen, das sich seit Generationen auf das Backen von Brot mit unseren hauseigenen Eiern spezialisiert hat. Bei uns bekommen sie Eier, Brot und auch Milch die frischer nicht sein könnten. Des Weiteren werden unsere Tiere mit dem besten Versorgt, das unser Feld zu bieten hat.");

        OpeningHour openingHour = new OpeningHour();
        openingHour.setMonday("Mo: " + "08:00 - 16:00");
        openingHour.setTuesday("Di:   " + "08:00 - 16:00");
        openingHour.setWednesday("Mi:  " + "08:00 - 16:00");
        openingHour.setThursday("Do:  " + "08:00 - 16:00");
        openingHour.setFriday("Fr:   " + "08:00 - 16:00");
        openingHour.setSaturday("Sa:  " + "08:00 - 16:00");
        openingHour.setSunday("So:  " + "08:00 - 16:00");

        Contact contact = new Contact();
        contact.setOpeningHour(openingHour);

        contact.setEmail("Email: " + "textView@myRegion.com");
        contact.setTelephone("Tel:     " + "+4306641256800");
        contact.setWeb("Web:  " + "www.google.com");
        contact.setAddress("Adresse:  " + "Olympiastraße 17, Innsbruck");
        store.setContact(contact);
        return store;
    }

    /*
    public void getDataFromServer() {
        RepositoryConstants.db.collection(Store.tag)
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        for(QueryDocumentSnapshot document : task.getResult()) {
                            Log.e("Seach Activity", document.getId() + "=> " + document.getData());
                            Log.e("Seach Activity", document.getId() + "=> " + document.toObject(Store.class).getName());
                        }
                    }
                });
    }*/

    final View.OnClickListener loginHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        }
    };

    @Override
    public boolean onQueryTextSubmit(String query) {
        if (query != null && !query.equals("")) {
            // TODO implement me
        }
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }

}