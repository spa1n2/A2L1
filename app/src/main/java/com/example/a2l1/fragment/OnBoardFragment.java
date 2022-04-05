package com.example.a2l1.fragment;

import android.content.ClipData;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a2l1.R;
import com.example.a2l1.adapters.OnBoardAdapter;
import com.example.a2l1.databinding.FragmentOnBoardBinding;
import com.example.a2l1.models.OnBoardModels;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import java.util.ArrayList;

public class OnBoardFragment extends Fragment {

    FragmentOnBoardBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentOnBoardBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initAdapter();
        setDate();
        pagerListener();

    }

    private void setDate() {
    }

    private ArrayList<OnBoardModels> getOnBoardList(){
        ArrayList<OnBoardModels> list = new ArrayList<>();
        list.add(new OnBoardModels(R.drawable.time,"save time","next"));
        list.add(new OnBoardModels(R.drawable.darts,"reach goals","next"));
        list.add(new OnBoardModels(R.drawable.flowrs,"develop","start"));
        return list;
    }

    private void initAdapter() {

        OnBoardAdapter adapter = new OnBoardAdapter(getOnBoardList());
        binding.viewPager2.setAdapter(adapter);
        binding.wormDotsIndicator.setViewPager2(binding.viewPager2);
    }

    private void pagerListener() {
        binding.viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }
}