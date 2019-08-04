package com.ddivine.travelmantics;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FirebaseUtil {

        public static FirebaseDatabase mFirebaseDatabase;
        public static DatabaseReference mDatabaseReference;
        public static ArrayList<TravelDeal> mDeals;
        private  static com.ddivine.travelmantics.FirebaseUtil firebaseUtil;

                public static void openFbReference(String ref) {
            if (firebaseUtil == null) {
                firebaseUtil = new com.ddivine.travelmantics.FirebaseUtil();
                mFirebaseDatabase = FirebaseDatabase.getInstance();
                mDeals = new ArrayList<TravelDeal>();
            }
            mDatabaseReference = mFirebaseDatabase.getReference().child(ref);
        };

private void FirebaseUtil () {}
}
