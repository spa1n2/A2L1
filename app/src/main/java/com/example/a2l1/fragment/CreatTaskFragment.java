package com.example.a2l1.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a2l1.R;
import com.example.a2l1.databinding.FragmentCreatTaskBinding;

public class CreatTaskFragment extends Fragment {

    FragmentCreatTaskBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCreatTaskBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupListener();
        openOnBoard();
    }

    private void openOnBoard() {
        binding.btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(requireView()).navigate(R.id.onBoardFragment);
            }
        });
    }


    private void setupListener() {
        binding.btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = binding.etText.getText().toString().trim();
                Bundle bundle = new Bundle();
                CreatTaskFragment creatTaskFragment = new CreatTaskFragment();
                bundle.putString("key", s);
                creatTaskFragment.setArguments(bundle);
                click();
            }

            private void click() {
                Navigation.findNavController(requireView()).navigate(R.id.taskFragment);

            }
        });
    }
}