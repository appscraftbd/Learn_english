package com.appscraftbd.learnenglish;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;


public class ListFragment extends Fragment {


    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);

        listView = view.findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);



        return view;
    }public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 20;
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

            View myView = LayoutInflater.from(getContext()).inflate(R.layout.post,parent,false);
            return myView;
        }
    }
}