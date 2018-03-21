package main.activity.people_class_order.delegate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.renyajie.yuyue.R;

import java.util.List;

import main.activity.people_class_order.adapter.PeopleClassBriefAdapter;
import main.activity.people_class_order.model.PeopleClassBriefModel;
import utils.SuperDelegate;
import utils.ViewHolderType;

/**
 * Created by Thor on 2018/3/12.
 *
 * 团课预约的课程列表部分，包含一个ListView，里面有开始时间，课程名称，教师名称等等
 */

public class PeopleClassBriefDelegate extends SuperDelegate {

    private Context context;
    private LayoutInflater layoutInflater;
    private List<PeopleClassBriefModel> peopleClassBriefModelList;
    private PeopleClassBriefAdapter adapter;
    private boolean showRecommendTitle;

    public PeopleClassBriefDelegate(Context context) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        showRecommendTitle = false;
    }

    public void setPeopleClassBriefModelList(List<PeopleClassBriefModel> peopleClassBriefModelList) {
        this.peopleClassBriefModelList = peopleClassBriefModelList;
    }

    public void setShowRecommendTitle(boolean showRecommendTitle) {
        this.showRecommendTitle = showRecommendTitle;
    }

    @Override
    public ViewHolderType getViewHolderType() {
        return ViewHolderType.PeopleClassBrief;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        return new PeopleClassBriefViewHolder(layoutInflater.inflate(
                R.layout.activity_main_people_class_order_class_list, parent, false));
    }

    @Override
    public <T extends RecyclerView.ViewHolder> void onBindViewHolder(T viewHolder) {
        Log.d("PlaceAndDateDelegate", "onBindViewHolder");

        // 防止刷新UI

        if(!uiFlag) {
            return;
        }
        uiFlag = false;

        //开始刷新UI
        adapter = new PeopleClassBriefAdapter(context, peopleClassBriefModelList);
        ((PeopleClassBriefViewHolder)viewHolder).listView.setAdapter(adapter);
        ((PeopleClassBriefViewHolder)viewHolder).listView.setOnItemClickListener(adapter);

        if (showRecommendTitle) {
            ((PeopleClassBriefViewHolder)viewHolder).title.setText("-团课推荐-");
        }else {
            ((PeopleClassBriefViewHolder)viewHolder).title.setVisibility(View.GONE);
        }
    }

    public static class PeopleClassBriefViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ListView listView;

        public PeopleClassBriefViewHolder(View itemView) {
            super(itemView);
            listView = itemView.findViewById(R.id.list_view);
            title = itemView.findViewById(R.id.title);
        }
    }
}