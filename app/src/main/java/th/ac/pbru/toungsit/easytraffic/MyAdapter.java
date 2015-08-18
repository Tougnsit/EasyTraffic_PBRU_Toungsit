package th.ac.pbru.toungsit.easytraffic;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Lab on 8/18/2015.
 */
public class MyAdapter extends BaseAdapter{
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
       // LayoutInflater objLayoutInflater = (LayoutInflater)


        return null;
    } //getView
} // Main Class
