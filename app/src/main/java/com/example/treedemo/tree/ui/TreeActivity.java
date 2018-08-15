package com.example.treedemo.tree.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.treedemo.R;
import com.example.treedemo.tree.view.Node;

import java.util.ArrayList;
import java.util.List;

public class TreeActivity extends Activity {

    private ListView mListview;
    private List<Node> mDatas = new ArrayList<>();
    private SimpleTreeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);
        initView();
        setListData();
    }

    private void initView() {
        mListview = (ListView) findViewById(R.id.mlistview);
    }

    private void setListData() {
        // id , pid , label , 其他属性
        mDatas.add(new Node("1", "0", "根节点"));

        mDatas.add(new Node("2", "1", "二层节点"));
        mDatas.add(new Node("3", "1", "二层节点"));
        mDatas.add(new Node("4", "1", "二层节点"));

        mDatas.add(new Node("5", "2", "三层节点"));
        mDatas.add(new Node("6", "2", "三层节点"));

        mDatas.add(new Node("7", "4", "三层节点"));
        mDatas.add(new Node("8", "4", "三层节点"));

        mDatas.add(new Node("9", "7", "四层节点"));
        mDatas.add(new Node("10", "7", "四层节点"));
        mDatas.add(new Node("11", "7", "四层节点"));
        mDatas.add(new Node("12", "8", "四层节点"));

        //给 ListView 设置 Adapter
        mAdapter = new SimpleTreeAdapter(mListview, TreeActivity.this, mDatas, 10);
        mListview.setAdapter(mAdapter);
    }
}
