package com.listview.img;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

	//variables declaration
	ArrayList<Planet> arrayPlanet;
	ListView listViewPlanet;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);
		arrayPlanet=new ArrayList<Planet>();

		Planet mercurio=new Planet(R.drawable.mercurio, "4.879,4 Km.", "Mercurio", "0");
		Planet venus=new Planet(R.drawable.venus, "12.103,6 km.", "Venus", "0");
		Planet tierra=new Planet(R.drawable.tierra, "12.756 km.","La Tierra", "1 (natural)");
		Planet marte=new Planet(R.drawable.marte, "6.794 km.","Marte", "2");
		Planet ceres=new Planet(R.drawable.ceres, "952,4 km2","Ceres", "0");
		Planet jupiter=new Planet(R.drawable.jupiter,"142.984 km.","Júpiter", "67 (conocidos)");
		Planet saturno=new Planet(R.drawable.saturno, "108.728 km.","Saturno", "200 observados (61 con órbitas)");
		Planet urano=new Planet(R.drawable.urano, "51.118 km.","Urano", "27 (conocidos)");
		Planet neptuno=new Planet(R.drawable.neptuno, "49.532 km.","Neptuno", "14 (conocidos)");	
		Planet pluton=new Planet(R.drawable.pluton, "2.320 km.","Plutón", "0");	
		Planet haumea=new Planet(R.drawable.haumea, "1.300–1.900 km","Haumea", "0");
		Planet makemake=new Planet(R.drawable.makemake, "1.300–1.900 km","Makemake", "0");
		Planet eris=new Planet(R.drawable.eris, "2.326 km","Eris", "0");
		
		arrayPlanet.add(mercurio);
		arrayPlanet.add(venus);
		arrayPlanet.add(tierra);
		arrayPlanet.add(marte);
		arrayPlanet.add(ceres);
		arrayPlanet.add(jupiter);
		arrayPlanet.add(saturno);
		arrayPlanet.add(urano);
		arrayPlanet.add(neptuno);
		arrayPlanet.add(pluton);
		arrayPlanet.add(haumea);
		arrayPlanet.add(makemake);
		arrayPlanet.add(eris);

		listViewPlanet = (ListView) findViewById(R.id.list_planet);
		ListPlanetAdapter adapter = new ListPlanetAdapter(this, arrayPlanet);
		listViewPlanet.setAdapter(adapter);
		listViewPlanet.setOnItemClickListener(this);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return true;
		
    }
		
		@Override
		public boolean onOptionsItemSelected(MenuItem item)
		{
			switch (item.getItemId())
			{
				case R.id.action_code:
					startActivity(new Intent(this, CodeActivity.class));
					return true;
				default:
					return super.onOptionsItemSelected(item);
					
			}				
		}
		
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Planet selectedPlanet = arrayPlanet.get(position);
		Toast.makeText(this,"Se ha seleccionado " + selectedPlanet.getDiametro()+
				" "+selectedPlanet.getCategoria()
				,Toast.LENGTH_SHORT).show();

	}

}

