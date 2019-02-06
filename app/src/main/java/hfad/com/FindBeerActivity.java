package hfad.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

import hfad.com.beerabviser.BeerExpert;

public class FindBeerActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    public void onClickFindBeer(View view){
        TextView brands=(TextView) findViewById(R.id.brands);
        Spinner color=(Spinner) findViewById(R.id.color);
        String beerType=String.valueOf(color.getSelectedItemId());
        //Получить рекомендации от класса BeerExpert
          List<String> brandsList = expert.getBrands(beerType);
          StringBuilder brandsFormatted = new StringBuilder();
          for (String brand : brandsList) {
              brandsFormatted.append(brand).append('\n');        }
              //Вывести сорта пива
               brands.setText(brandsFormatted);

    }
}
