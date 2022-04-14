package com.example.tablayoutusingviewpager;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyAdapter extends FragmentPagerAdapter {
    ArrayList<String>strings=new ArrayList<>();
    public MyAdapter(@NonNull FragmentManager fm)
    {
        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        MyFragment myFragment=new MyFragment();
        Bundle bundle=new Bundle();
        bundle.putString("ID",strings.get(position));
        myFragment.setArguments(bundle);
        return myFragment;
    }

    @Override
    public int getCount() {
        return strings.size();
    }
    public void add()
    {
        strings.add("Chats");
        strings.add("Calls");
        strings.add("Online");
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        return strings.get(position);
    }
}
