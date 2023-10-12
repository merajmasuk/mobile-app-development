package com.example.busroutemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tvStart, tvDest, tvBuses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStart = findViewById(R.id.tvStart);
        tvDest = findViewById(R.id.tvDest);
        tvBuses = findViewById(R.id.tvBuses);

        String txtStart = getIntent().getStringExtra("txtStart");
        String txtDest = getIntent().getStringExtra("txtDest");

        tvStart.setText(txtStart);
        tvDest.setText(txtDest);

        String buses = "";
        ArrayList<BusModal> list = getBusModal();
        for (BusModal bus : list) {
            if (bus.getBusStops().contains(txtStart) && bus.getBusStops().contains(txtDest)) {
                buses += " " + bus.getBusName();
            }
        }

        tvBuses.setText(buses);
    }

    private ArrayList<BusModal> getBusModal() {
        ArrayList<BusModal> list = new ArrayList<>();

        list.add(new BusModal("Ullash", "Gulistan, Jatrabari, Jurain, Postogola, Dholeswari, Pagla, Fatullah, Panchaboti, Narayangonj"));
        list.add(new BusModal("VIP", "Azimpur, New Market, City College, Kolabagan, Asad Gate, Farmgate, Mohakhali, Kakoli, Kuril, Khilkhet, Airport, Uttara, Abdullahpur, Tongi"));
        list.add(new BusModal("Victor", "Sadarghat, Gulistan, Paltan, Kakrail, Malibagh, Rampura, Badda, Shahzadpur, Notun Bazar, Basundhara, Kuril, Khilkhet, Airport, Uttara"));;
        list.add(new BusModal("Suprovat", "Sadarghat, Gulistan, Paltan, Kakrail, Malibagh, Rampura, Badda, Shahzadpur, Notun Bazar, Basundhara, Kuril, Khilkhet, Airport, Uttara"));;
        list.add(new BusModal("Tangil", "Sadarghat, Gulistan, Paltan, Press Club, Shahbagh, Banglamotor, Farmgate, Asad Gate, College Gate, Shishumela, Shyamoli, Kallyanpur, Technical, Ansar Camp, Mirpur-1"));
        list.add(new BusModal("Turag", "Sayedabad, Maniknagar, Kamalapur, Malibagh, Rampura, Badda, American Ambassy, Baridhara, Airport, Uttara, Tongi"));
        list.add(new BusModal("Shikor", "Jatrabari, Shapla Chattar, Bangabandhu Stadium, Paltan, Press Club, Shahbagh, Banglamotor, Farmgate, Shaorapara, Kajipara, Mirpur-10, Pallabi, Mirpur-12"));
        list.add(new BusModal("Shotabdi", "Shapla Chattar, Bangabandhu Stadium, Paltan, Press Club, Shahbagh, Sciencelab, Jigatola, Dhanmondi, Star Kabab, Shonkor, Asad Gate, College Gate, Shishumela, Shyamoli"));
        list.add(new BusModal("Skyline", "Sadarghat, Gulistan, Paltan, Press Club, Shahbagh, Banglamotor, Farmgate, Mohakhali, Kakoli, Kuril, Khilkhet, Airport, Uttara, Abdullahpur, Tongi, Shofipur"));
        list.add(new BusModal("Rayda", "Postogola, Jatrabari, Sayedabad, Maniknagar, Kamalapur, Malibagh, Moghbazar, Saat Rasta, Nabisko, Mohakhali, Airport, Uttara, Tongi, Gazipur"));
        list.add(new BusModal("Salsabil", "Sayedabad, Maniknagar, Kamalapur, Malibagh, Rampura, Badda, American Ambassy, Baridhara, Airport, Uttara, Tongi"));
        list.add(new BusModal("Salsabil", "Basabo, Malibagh, Rampura, Badda, Shahzadpur, Notun Bazar, Basundhara, Kuril, Khilkhet, Airport, Uttara, Tongi"));
        list.add(new BusModal("Shakalpo", "Kamalapur, Rajarbagh Police Line, Moghbazar, Banglamotor, Farmgate, Agargaon, Shaorapara, Kajipara, Mirpur-10, Mirpur-2, Mirpur-1, Mirpur Chiriyakhana"));
        list.add(new BusModal("4 No", "Jatrabari, Shapla Chattar, Bangabandhu Stadium, Paltan, Press Club, Shahbagh, Banglamotor, Farmgate, Asad Gate, College Gate, Shishumela, Shyamoli, Kallyanpur, Technical, Gabtoli"));
        list.add(new BusModal("Panjeri", "Gulistan, Paltan, Kakrail, Moghbazar, Saat Rasta, Tibet, Nabisko, Mohakhali, Banani, Kakoli, Khilkhet, Airport, Rajlakkhi, House Building, Abdullahpur, Tongi, Kamarpara"));
        list.add(new BusModal("Provati Banashree", "Gulistan, Paltan, Kakrail, Moghbazar, Saat Rasta, Mohakhali, Kakoli, Kuril, Khilkhet, Airport, Abdullahpur, Uttara, Tongi, Shofipur, Kaliakoir"));
        list.add(new BusModal("6 No", "Motijheel, Kamalapur, Malibagh, Moghbazar, Iskaton, Kawran Bazar, Farmgate, Mohakhali, Banani"));
        list.add(new BusModal("7 No", "Sadarghat, Gulistan, Paltan, Press Club, Shahbagh, Banglamotor, Farmgate, Sciencelab, City College, Kolabagan, Asad Gate, College Gate, Shishumela, Shyamoli, Kallyanpur, Technical, Gabtoli"));
        list.add(new BusModal("8 No", "Gulistan, Motijheel, Paltam, Shahbagh, Sheratan, Kawran Bazar, Farmgate, Asad Gate, Shyamoli, Kallyanpur, Gabtoli"));
        list.add(new BusModal("Labbayak", "Jatrabari, Sayedabad, Maniknagar, Mugda, Basabo, Khilgao, Asad Gate, College Gate, Shyamoli, Kallyanpur, Technical, Gabtoli"));

        return list;
    }
}