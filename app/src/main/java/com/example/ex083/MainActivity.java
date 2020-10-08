package com.example.ex083;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener{
    Spinner mainland,country;
    ListView city;
    TextView num,size;
    String [] null1={"country1","country2","country3","country4","country5","country6","country7"};
    String [][] countries= new String[4][8];
    String [][][] cities= new String[4][7][5];
    String [][][][] information= new String[4][7][5][2];
    int remember1,remember2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainland = (Spinner) findViewById(R.id.mainland);
        country = (Spinner) findViewById(R.id.country);
        city = (ListView) findViewById(R.id.city);
        num = (TextView) findViewById(R.id.num);
        size = (TextView) findViewById(R.id.size);
        ArrayAdapter<String> adp1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.continents));
        mainland.setAdapter(adp1);

        mainland.setOnItemSelectedListener(this);

        countries[0]= new String[]{"Countries","Nepal", "China", "India", "Japan", "Iran", "Lebanon", "Singapore"};
        countries[1]= new String[]{"Countries","Brazil", "Mexico", "Colombia", "Argentina", "Canada", "Peru", "Chile"};
        countries[2]= new String[]{"Countries","Nigeria", "Ethiopia", "Kenya", "Algeria", "Sudan", "Zimbabwe", "Tanzania"};
        countries[3]= new String[]{"Countries","France", "Poland", "Italy", "Germany", "Spain", "Portugal", "Sweden"};

        cities[0][0]= new String[]{"Kathmandu","Pokhara","Patan","Biratnagar","Birgunj"};
        cities[0][1]= new String[]{"Shanghai","Beijing","Tianjin","Guangzhou","Shenzhen"};
        cities[0][2]= new String[]{"Mumbai","Delhi","Bengaluru","Kolkata","Chennai"};
        cities[0][3]= new String[]{"Tokyo","Yokohama","Osaka","Nagoya","Sapporo"};
        cities[0][4]= new String[]{"Teharn","Mashhad","Isfahan","Karaj","Tabriz"};
        cities[0][5]= new String[]{"Beirut","Tripoli","Sidon","Tyre","Jbail"};
        cities[0][6]= new String[]{"Singapore"};

        cities[1][0]= new String[]{"Sao Paulo","Rio De Janeiro","Salvador","Fortaleza","Brasillia"};
        cities[1][1]= new String[]{"Mexico City","Iztapallapa","Guadalajara","Puebla","Juarez"};
        cities[1][2]= new String[]{"Bogota","Cali","Medellin","Cucuta","Bello"};
        cities[1][3]= new String[]{"Buenos Aires","Cordoba","Rosario","Mendoza","Salta"};
        cities[1][4]= new String[]{"Toronto","Montreal","Calgary","Ottawa","Edmonton"};
        cities[1][5]= new String[]{"Lima","Callao","Piura","Cusco","Tacna"};
        cities[1][6]= new String[]{"Santiago","Puente","Antofagasta","Temuco","Talca"};

        cities[2][0]= new String[]{"Lagos","Kano","Ibadan","Kaduna","Zaria"};
        cities[2][1]= new String[]{"Addis Ababa","Dire Dawa","Gondar","Dese","Bahir Dar"};
        cities[2][2]= new String[]{"Nairobi","Mombasa","Nakuru","Siaya","Busia"};
        cities[2][3]= new String[]{"Algiers","Oran","Biskra","Setif","Batna"};
        cities[2][4]= new String[]{"Khartoum","Omdurman","Juba","Al Qadarif","Sinnar"};
        cities[2][5]= new String[]{"Harare","Bulawayo","Chitungwiza","Gweru","Kadoma"};
        cities[2][6]= new String[]{"Mwanza","Zanzibar","Arusha","Mbeya","Tanga"};

        cities[3][0]= new String[]{"Paris","Marseille","Lyon","Nice","Lille"};
        cities[3][1]= new String[]{"Warsaw","Lodz","Krakow","Wroclaw","Poznan"};
        cities[3][2]= new String[]{"Rome","Milan","Naples","Turin","Palermo"};
        cities[3][3]= new String[]{"Berlin","Hamburg","Munich","Koeln","Essen"};
        cities[3][4]= new String[]{"Madrid","Barcelona","Valencia","Sevilla","Malaga"};
        cities[3][5]= new String[]{"Lisbon","Porto","Amadora","Braga","Setubal"};
        cities[3][6]= new String[]{"Stockholm","Goeteborg","Malmoe","Uppsala","Lund"};




        information[0][0][0]= new String[]{"1,442,271","49.45km^2"};
        information[0][0][1]= new String[]{"200,000","464.2km^2"};
        information[0][0][2]= new String[]{"183,310","17.8km^2"};
        information[0][0][3]= new String[]{"182,324","58.48km^2"};
        information[0][0][4]= new String[]{"133,238","75.24km^2"};

        information[0][1][0]= new String[]{"22,315,474","6,340km^2"};
        information[0][1][1]= new String[]{"11,716,620","16,808km^2"};
        information[0][1][2]= new String[]{"11,090,314","11,760km^2"};
        information[0][1][3]= new String[]{"11,071,424","7,434km^2"};
        information[0][1][4]= new String[]{"10,358,381","2,050km^2"};

        information[0][2][0]= new String[]{"12,691,836","603.4km^2"};
        information[0][2][1]= new String[]{"10,927,986","1,484km^2"};
        information[0][2][2]= new String[]{"5,104,047","709km^2"};
        information[0][2][3]= new String[]{"4,631,392","206.1km^2"};
        information[0][2][4]= new String[]{"4,328,063","426km^2"};

        information[0][3][0]= new String[]{"8,336,599","622km^2"};
        information[0][3][1]= new String[]{"3,574,443","437.4km^2"};
        information[0][3][2]= new String[]{"2,592,413","223km^2"};
        information[0][3][3]= new String[]{"2,191,279","326.4km^2"};
        information[0][3][4]= new String[]{"1,883,027","1,121km^2"};

        information[0][4][0]= new String[]{"7,153,309","730km^2"};
        information[0][4][1]= new String[]{"2,307,177","328km^2"};
        information[0][4][2]= new String[]{"1,547,164","551km^2"};
        information[0][4][3]= new String[]{"1,448,075","162km^2"};
        information[0][4][4]= new String[]{"1,424,641","324km^2"};

        information[0][5][0]= new String[]{"1,916,100","19.8km^2"};
        information[0][5][1]= new String[]{"229,398","1,507km^2"};
        information[0][5][2]= new String[]{"163,554","7km^2"};
        information[0][5][3]= new String[]{"135,204","4km^2"};
        information[0][5][4]= new String[]{"20,784","5km^2"};

        information[0][6][0]= new String[]{"3,547,809","712.5km^2"};//סינגפור היא עיר מדינה


        information[1][0][0]= new String[]{"10,021,295","1,521km^2"};
        information[1][0][1]= new String[]{"6,023,699","1,255km^2"};
        information[1][0][2]= new String[]{"2,711,840","693.8km^2"};
        information[1][0][3]= new String[]{"2,400,000","313.8km^2"};
        information[1][0][4]= new String[]{"2,207,718","5,802km^2"};

        information[1][1][0]= new String[]{"12,294,193","1,485km^2"};
        information[1][1][1]= new String[]{"1,815,786","116.1km^2"};
        information[1][1][2]= new String[]{"1,495,182","187.9km^2"};
        information[1][1][3]= new String[]{"1,434,062","206.6km^2"};
        information[1][1][4]= new String[]{"1,321,004","321.2km^2"};

        information[1][2][0]= new String[]{"7,674,366","1,775km^2"};
        information[1][2][1]= new String[]{"2,392,877","619km^2"};
        information[1][2][2]= new String[]{"1,999,979","382km^2"};
        information[1][2][3]= new String[]{"721,398","1,176km^2"};
        information[1][2][4]= new String[]{"392,939","149km^2"};

        information[1][3][0]= new String[]{"13,076,300","203km^2"};
        information[1][3][1]= new String[]{"1,428,214","1,253km^2"};
        information[1][3][2]= new String[]{"1,173,533","178.7km^2"};
        information[1][3][3]= new String[]{"876,884","54km^2"};
        information[1][3][4]= new String[]{"512,686","60km^2"};

        information[1][4][0]= new String[]{"2,600,000","630.2km^2"};
        information[1][4][1]= new String[]{"1,600,600","431.5km^2"};
        information[1][4][2]= new String[]{"1,019,942","825.3km^2"};
        information[1][4][3]= new String[]{"812,129","2,790km^2"};
        information[1][4][4]= new String[]{"712,391","684km^2"};

        information[1][5][0]= new String[]{"7,737,002","2,672km^2"};
        information[1][5][1]= new String[]{"813,264","147km^2"};
        information[1][5][2]= new String[]{"325,460","621.2km^2"};
        information[1][5][3]= new String[]{"312,140","385.1km^2"};
        information[1][5][4]= new String[]{"280,098","14,767km^2"};

        information[1][6][0]= new String[]{"4,837,295","641km^2"};
        information[1][6][1]= new String[]{"510,417","88km^2"};
        information[1][6][2]= new String[]{"309,832","30,718km^2"};
        information[1][6][3]= new String[]{"238,129","464km^2"};
        information[1][6][4]= new String[]{"197,470","232,007km^2"};


        information[2][0][0]= new String[]{"9,000,000","1,171km^2"};
        information[2][0][1]= new String[]{"3,626,068","499km^2"};
        information[2][0][2]= new String[]{"3,565,108","3,080km^2"};
        information[2][0][3]= new String[]{"1,582,102","413km^2"};
        information[2][0][4]= new String[]{"975,153","563km^2"};

        information[2][1][0]= new String[]{"2,757,729","527km^2"};
        information[2][1][1]= new String[]{"252,279","1,213km^2"};
        information[2][1][2]= new String[]{"153,914","192.3km^2"};
        information[2][1][3]= new String[]{"136,056","15.08km^2"};
        information[2][1][4]= new String[]{"168,899","28km^2"};

        information[2][2][0]= new String[]{"2,750,547","696km^2"};
        information[2][2][1]= new String[]{"799,668","294.7km^2"};
        information[2][2][2]= new String[]{"259,903","7,510km^2"};
        information[2][2][3]= new String[]{"15,354","2,496km^2"};
        information[2][2][4]= new String[]{"51,981","1,694km^2"};

        information[2][3][0]= new String[]{"1,977,663","363km^2"};
        information[2][3][1]= new String[]{"645,984","2,121km^2"};
        information[2][3][2]= new String[]{"307,987","127.6km^2"};
        information[2][3][3]= new String[]{"288,461","127.3km^2"};
        information[2][3][4]= new String[]{"280,798","85km^2"};

        information[2][4][0]= new String[]{"1,974,647","22,142km^2"};
        information[2][4][1]= new String[]{"1,200,000","614.9km^2"};
        information[2][4][2]= new String[]{"450,000","52km^2"};
        information[2][4][3]= new String[]{"363,945","65.263km^2"};
        information[2][4][4]= new String[]{"130,122","195km^2"};

        information[2][5][0]= new String[]{"1,542,813","960.6km^2"};
        information[2][5][1]= new String[]{"699,385","1,707km^2"};
        information[2][5][2]= new String[]{"340,360","45km^2"};
        information[2][5][3]= new String[]{"146,073","? km^2"};
        information[2][5][4]= new String[]{"79,174","? km^2"};

        information[2][6][0]= new String[]{"436,801","9,467km^2"};
        information[2][6][1]= new String[]{"403,658","2,461km^2"};
        information[2][6][2]= new String[]{"341,136","37,576km^2"};
        information[2][6][3]= new String[]{"291,649","35,954km^2"};
        information[2][6][4]= new String[]{"224,876","26,677km^2"};


        information[3][0][0]= new String[]{"2,138,551","105.4km^2"};
        information[3][0][1]= new String[]{"794,811","240.6km^2"};
        information[3][0][2]= new String[]{"472,317","47.87km^2"};
        information[3][0][3]= new String[]{"338,620","71.92km^2"};
        information[3][0][4]= new String[]{"228,328","34.8km^2"};

        information[3][1][0]= new String[]{"1,702,139","517.2km^2"};
        information[3][1][1]= new String[]{"768,755","293.2km^2"};
        information[3][1][2]= new String[]{"755,050","327km^2"};
        information[3][1][3]= new String[]{"634,893","292.8km^2"};
        information[3][1][4]= new String[]{"570,352","216.8km^2"};

        information[3][2][0]= new String[]{"2,318,895","1,285km^2"};
        information[3][2][1]= new String[]{"1,236,837","181.8km^2"};
        information[3][2][2]= new String[]{"959,470","119km^2"};
        information[3][2][3]= new String[]{"870,456","130.2km^2"};
        information[3][2][4]= new String[]{"648,260","158.9km^2"};

        information[3][3][0]= new String[]{"3,426,354","891.8km^2"};
        information[3][3][1]= new String[]{"1,739,117","755.2km^2"};
        information[3][3][2]= new String[]{"1,260,391","310.4km^2"};
        information[3][3][3]= new String[]{"963,395","405.2km^2"};
        information[3][3][4]= new String[]{"593,085","210.3km^2"};

        information[3][4][0]= new String[]{"3,255,944","604.3km^2"};
        information[3][4][1]= new String[]{"1,621,537","101.9km^2"};
        information[3][4][2]= new String[]{"814,208","134.6km^2"};
        information[3][4][3]= new String[]{"703,206","140.8km^2"};
        information[3][4][4]= new String[]{"568,305","398km^2"};

        information[3][5][0]= new String[]{"517,802","100km^2"};
        information[3][5][1]= new String[]{"249,633","41.42km^2"};
        information[3][5][2]= new String[]{"178,858","23.77km^2"};
        information[3][5][3]= new String[]{"121,394","183.5km^2"};
        information[3][5][4]= new String[]{"117,110","171.9km^2"};

        information[3][6][0]= new String[]{"1,515,017","188km^2"};
        information[3][6][1]= new String[]{"572,799","447.8km^2"};
        information[3][6][2]= new String[]{"301,706","76.81km^2"};
        information[3][6][3]= new String[]{"149,706","48.77km^2"};
        information[3][6][4]= new String[]{"87,244,","25.75km^2"};
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId()==(R.id.mainland)) {
            if (position != 0) {
                country.setVisibility(View.VISIBLE);
                ArrayAdapter<String> adp2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, countries[position-1]);
                country.setAdapter(adp2);

                country.setOnItemSelectedListener(this);
            }
            else {
                country.setVisibility(View.INVISIBLE);
                city.setVisibility(View.INVISIBLE);
                size.setVisibility(View.INVISIBLE);
                num.setVisibility(View.INVISIBLE);
            }
            remember1=position;
        }
        if (parent.getId()==(R.id.country)){
            if (remember1 != 0) {
                if (position != 0) {
                city.setVisibility(View.VISIBLE);

                ArrayAdapter<String> adp2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities[remember1 - 1][position - 1]);
                city.setAdapter(adp2);

                city.setOnItemClickListener(this);

                }
                else{
                    city.setVisibility(View.INVISIBLE);
                    size.setVisibility(View.INVISIBLE);
                    num.setVisibility(View.INVISIBLE);
                }
            }
            remember2=position;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if ((remember2!=0)){
            size.setVisibility(View.VISIBLE);
            num.setVisibility(View.VISIBLE);
            size.setText(information[remember1-1][remember2-1][position][1]);
            num.setText(information[remember1-1][remember2-1][position][0]);
        }
        else{
            size.setVisibility(View.INVISIBLE);
            num.setVisibility(View.INVISIBLE);
        }
    }
}