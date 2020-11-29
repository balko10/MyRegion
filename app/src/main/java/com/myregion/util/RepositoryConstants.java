package com.myregion.util;

import com.google.firebase.firestore.FirebaseFirestore;

/**
 * Created by Alexander Crepaz on 28.11.2020.
 */

public class RepositoryConstants {

    public static final String stores = "stores";

    public static FirebaseFirestore db;

    public static void createDBInstance() {
        db = FirebaseFirestore.getInstance();
    }
}
