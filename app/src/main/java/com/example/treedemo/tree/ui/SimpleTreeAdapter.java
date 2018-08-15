package com.example.treedemo.tree.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.treedemo.R;
import com.example.treedemo.tree.view.Node;
import com.example.treedemo.tree.view.TreeListViewAdapter;

import java.util.List;

/**
 * Created by Administrator on 2018/8/9.
 */

public class SimpleTreeAdapter extends TreeListViewAdapter {

    public SimpleTreeAdapter(ListView mTree, Context context, List<Node> datas, int defaultExpandLevel) {
        super(mTree, context, datas, defaultExpandLevel);
    }

    @Override
    public View getConvertView(final Node node, int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_receiver_select_title, parent, false);
            holder = new ViewHolder();
            holder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
            holder.cb = (CheckBox) convertView.findViewById(R.id.check_box);
            holder.iv = (ImageView) convertView.findViewById(R.id.iv_right);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setChecked(node, holder.cb.isChecked());
            }
        });

        if (node.isChecked()) {
            holder.cb.setChecked(true);
            holder.tvName.setTextColor(Color.parseColor("#1FCC7C"));
        } else {
            holder.cb.setChecked(false);
            holder.tvName.setTextColor(Color.parseColor("#000000"));
        }

        if (node.getIcon() == -1) {
            holder.iv.setVisibility(View.INVISIBLE);
        } else {
            holder.iv.setVisibility(View.VISIBLE);
            holder.iv.setImageResource(node.getIcon());
        }

        holder.tvName.setText(node.getName());
        return convertView;
    }

    class ViewHolder {
        TextView tvName;
        CheckBox cb;
        ImageView iv;
    }
}
