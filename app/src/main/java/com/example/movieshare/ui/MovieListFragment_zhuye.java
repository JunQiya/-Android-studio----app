package com.example.movieshare.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.movieshare.MovieActivity;
import com.example.movieshare.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MovieListFragment_zhuye#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MovieListFragment_zhuye extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MovieListFragment_zhuye() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MovieListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MovieListFragment_zhuye newInstance(String param1, String param2) {
        MovieListFragment_zhuye fragment = new MovieListFragment_zhuye();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_layout_zhuye, container, false);
    }


//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View rootView = inflater.inflate(R.layout.fragment_layout_zhuye, container, false);
//
//        // 获取 CardView 的引用，假设 CardView 的 ID 是 zxsy_cardview
//        CardView cardView = rootView.findViewById(R.id.zxsy_cardview); // 替换为你的实际 CardView ID
//
//        // 设置 CardView 的点击监听器
//        cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // 点击事件的处理逻辑
//                // 启动一个新的Activity，这里是 MovieActivity
//                Intent intent = new Intent(getActivity(), MovieActivity.class);
//                // 你可能需要传递一些数据到 MovieActivity，例如电影的ID等
//                // intent.putExtra("movie_id", movieId);
//                startActivity(intent);
//            }
//        });
//
//        return rootView;
//    }




}
