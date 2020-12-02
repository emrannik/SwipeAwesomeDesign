package com.emrannik.androidnik.emrannik.swipeawesomedesign;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {

    private RecyclerView rvMyArticle;
    private AdapterMyArticles mAdapter;
    String articles[]={"article1","article2","article3","article4"};

    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_account, container, false);
        rvMyArticle = v.findViewById(R.id.rvMyArticle);
        rvMyArticle.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        rvMyArticle.setLayoutManager(layoutManager);

        ArrayList<String> dataArticles = new ArrayList<>();
        dataArticles.add(articles[0]);
        dataArticles.add(articles[1]);
        dataArticles.add(articles[2]);
        dataArticles.add(articles[3]);

        mAdapter    = new AdapterMyArticles(dataArticles,getActivity());
        rvMyArticle.setAdapter(mAdapter);

        return v;
    }

}
