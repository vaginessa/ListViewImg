package com.listview.img;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListPlanetAdapter extends BaseAdapter {

	Context context;

	protected List<Planet> listPlanet;
	LayoutInflater inflater;

	public ListPlanetAdapter(Context context, List<Planet> listPlanet) {
		this.listPlanet = listPlanet;
		this.inflater = LayoutInflater.from(context);
		this.context = context;
	}

	public int getCount() {
		return listPlanet.size();
	}

	public Planet getItem(int position) {
		return listPlanet.get(position);
	}

	public long getItemId(int position) {
		return listPlanet.get(position).getDrawableId();
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {

			holder = new ViewHolder();
			convertView = this.inflater.inflate(R.layout.layout_list_item, parent, false);

			holder.txtDiametro = (TextView) convertView.findViewById(R.id.txt_diametro);
			holder.txtCategoria = (TextView) convertView.findViewById(R.id.txt_categoria);
			holder.txtSat = (TextView) convertView.findViewById(R.id.txt_sat);
			holder.imgPlanet   = (ImageView)convertView.findViewById(R.id.img_planet);

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		Planet planet = listPlanet.get(position);
		holder.txtDiametro.setText(planet.getDiametro());
		holder.txtCategoria.setText(planet.getCategoria());
		holder.txtSat.setText(planet.getSat());
		holder.imgPlanet.setImageResource(planet.getDrawableId());

		return convertView;
	}

	private class ViewHolder {
		TextView txtDiametro;
		TextView txtCategoria;
		TextView txtSat;
		ImageView imgPlanet;
	}

}
