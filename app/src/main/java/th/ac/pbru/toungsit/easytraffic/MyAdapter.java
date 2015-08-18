package th.ac.pbru.toungsit.easytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Lab on 8/18/2015.
 */
public class MyAdapter extends BaseAdapter {
    //Explicit
    private Context objContext;
    private int[] iconInts;  // กด ปุ่ม Ctrl+Enter เพื่อสร้างชื่อตัวแปรให้อัตโนมัติ
    private String[] titleStrings;

    // Method กำหนดค่าให้กับตัวแปรด้านบน
    public MyAdapter(Context objContext, int[] iconInts, String[] titleStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
    } // Constructor

    @Override
    public int getCount() {
        return titleStrings.length;    // นับจำนวนของรูปที่มีอยู่
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = objLayoutInflater.inflate(R.layout.listview_traffic, parent, false);
        //Show Image
        ImageView iconImageView = (ImageView) view.findViewById(R.id.imvIcon);
        iconImageView.setImageResource(iconInts[position]);

        TextView titleTextView = (TextView) view.findViewById(R.id.txtShowTitle);
        titleTextView.setText(titleStrings[position]);

        return view;
    } //getView
} // Main Class
