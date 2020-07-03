package com.icandothisallday2020.ex45fragmentpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Page3Fragment extends Fragment {
    //페이지 3 에서 보여줄 대량의 String 데이터들
    ArrayList<String> data=new ArrayList<>();
    ListView listView;
    ArrayAdapter adapter;
    //Fragment 가 처음 생성될 때만 호출(only once)
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //대량의 데이터를 DB나 Network 에서 가져오는 작업 실행
        data.add(new String("hero's load"));
        data.add(new String("follow your willing"));
        data.add(new String("safe"));
    }
    //Fragment 가 화면에 보여지기 위해 만들어질때마다 매번 호출
    //---화면에서 보이지 않을때 onDestroy() 가 실행되고 화면에 로드될때 다시 생성되기 때문
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_page3,container,false);
        listView=view.findViewById(R.id.lv);
        adapter=new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);
        return view;
    }
}