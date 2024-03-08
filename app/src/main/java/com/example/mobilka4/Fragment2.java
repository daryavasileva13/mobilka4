package com.example.mobilka4;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Fragment2 extends Fragment {
    private static final String TAG = "MyApp";
    private int defaultValue = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment2, container, false);

        View view = inflater.inflate(R.layout.fragment2, container, false);
        return view;

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Item> items = new ArrayList<>();
        for (int i = 0; i <= 200; i++) {
            items.add(new Item(R.drawable.img, "ListView"));
        }

        ListView itemsList1 = view.findViewById(R.id.list1);
        MyCustomListAdapter adapter = new MyCustomListAdapter(getContext(), R.layout.list_item, items);
        itemsList1.setAdapter(adapter);

        itemsList1.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(getContext(),"Нажатие на элемент списка " + position, Toast.LENGTH_LONG)
                        .show();
                Log.i(TAG, "Нажатие на элемент списка " + position);
            } });






        }



}


//
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        //Button button = view.findViewById(R.id.button_sign_up);
        //Button button_back = view.findViewById(R.id.button_end2);

//        EditText sectionEditText = view.findViewById(R.id.section);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle result = new Bundle();
//
//                String sectionToPass = sectionEditText.getText().toString();
//
//                result.putString("bundleKey", sectionToPass);
//                getParentFragmentManager().setFragmentResult("requestKey", result);
//
//                //Log Log = null;
//                Log.i(TAG, "Кнопка нажата (Программная реализация)");
//                openNextFragment2();
//            }
//        });

//
//        button_back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG, "Назад (Программная реализация)");
//                goBackToFragment1();
//            }
//        });
//
//
//    }
//
//    public void openNextFragment2(){
//        Fragment nextFragment = new Fragment3();
//
//        Bundle bundle = new Bundle();
//        // Добавьте данные в Bundle, если необходимо
//
//        nextFragment.setArguments(bundle);
//
//        getActivity()
//                .getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.fragment_container_view, nextFragment)
//                .commit();
//    }
//
//    public void goBackToFragment1(){
//        Fragment backFragment = new Fragment1();
//
//        Bundle bundle = new Bundle();
//        // Добавьте данные в Bundle, если необходимо
//
//        backFragment.setArguments(bundle);
//
//        getActivity()
//                .getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.fragment_container_view, backFragment)
//                .commit();
//
//    }

//
//}
