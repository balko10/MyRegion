package com.myregion.activitys;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.myregion.R;
import com.myregion.entities.Contact;
import com.myregion.entities.OpeningHour;
import com.myregion.entities.Product;
import com.myregion.entities.Store;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    Store store;
    Product product;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);

        createTestValues();
        fillFrontendWithValues();


    }

    private void createTestValues() {
        store = new Store();
        store.setName("Hansi Huber Haus");
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

        product = new Product();

        product.setName("Super Brot");
        //product.setPicture();
        product.setDesc("Unser Hausgemachtes Brot wird nach einem alten Familienrezept mit den frischesten Zutaten unseres Hofes jeden Tag frisch in einem Steinofen zubereitet.");
    }

    private void fillFrontendWithValues() {
        TextView storeHeader = (TextView) findViewById(R.id.storeHeader);
        storeHeader.setText(store.getName());

        ImageView storeHeaderImage = findViewById(R.id.storeHeaderImage);
        storeHeaderImage.setImageResource(R.drawable.bauernhaus);

        TextView storeDesc = (TextView) findViewById(R.id.storeDesc);
        storeDesc.setText(store.getDescription());

        TextView monday = (TextView) findViewById(R.id.monday);
        monday.setText(store.getContact().getOpeningHour().getMonday());

        TextView tuesday = (TextView) findViewById(R.id.tuesday);
        tuesday.setText(store.getContact().getOpeningHour().getTuesday());

        TextView wednesday = (TextView) findViewById(R.id.wednesday);
        wednesday.setText(store.getContact().getOpeningHour().getWednesday());

        TextView thursday = (TextView) findViewById(R.id.thursday);
        thursday.setText(store.getContact().getOpeningHour().getThursday());

        TextView friday = (TextView) findViewById(R.id.friday);
        friday.setText(store.getContact().getOpeningHour().getFriday());

        TextView saturday = (TextView) findViewById(R.id.saturday);
        saturday.setText(store.getContact().getOpeningHour().getSaturday());

        TextView sunday = (TextView) findViewById(R.id.sunday);
        sunday.setText(store.getContact().getOpeningHour().getSunday());

        TextView email = (TextView) findViewById(R.id.email);
        email.setText(store.getContact().getEmail());

        TextView phone = (TextView) findViewById(R.id.phone);
        phone.setText(store.getContact().getTelephone());

        TextView web = (TextView) findViewById(R.id.web);
        web.setText(store.getContact().getWeb());

        TextView address = (TextView) findViewById(R.id.address);
        address.setText(store.getContact().getAddress());

        TextView productHeader = (TextView) findViewById(R.id.productHeader);
        productHeader.setText(product.getName());

        TextView productDesc = (TextView) findViewById(R.id.productDesc);
        productDesc.setText(product.getDesc());
    }

}