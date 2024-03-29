package com.example.walikeproject.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.walikeproject.Fragments.CallsFragment;
import com.example.walikeproject.Fragments.ChatsFragment;
import com.example.walikeproject.Fragments.StatusFragment;

public class FragmentsAdapter extends FragmentStateAdapter {
    public FragmentsAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 : return new ChatsFragment();
            case 1 : return new StatusFragment();
            case 2 : return new CallsFragment();
            default: return new ChatsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
