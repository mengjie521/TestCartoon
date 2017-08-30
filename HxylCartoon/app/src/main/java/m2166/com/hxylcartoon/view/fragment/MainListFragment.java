package m2166.com.hxylcartoon.view.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import m2166.com.hxylcartoon.R;
import m2166.com.hxylcartoon.view.adapter.MainFragmentAdapter;

/**
 * author： mengjie on 2017/8/30.
 * email: weidadajie@163.com
 */

public class MainListFragment extends Fragment {
    @BindView(R.id.rv_main_fragment)
    RecyclerView rvMainFragment;
    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_list, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvMainFragment.setLayoutManager(new LinearLayoutManager(getActivity()));
        MainFragmentAdapter mainFragmentAdapter = new MainFragmentAdapter(getActivity());
        rvMainFragment.setAdapter(mainFragmentAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
