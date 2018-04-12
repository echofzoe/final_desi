package main.activity.recommand_class.delegate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.renyajie.yuyue.R;

import java.util.ArrayList;
import java.util.List;

import main.activity.people_class_order.model.PlaceModel;
import utils.SuperDelegate;
import utils.UtilsMethod;
import utils.ViewHolderType;

/**
 * Created by Thor on 2018/3/12.
 *
 * 团课预约中选择场馆和日期的部分
 */

public class DateDelegate extends SuperDelegate
        implements RadioGroup.OnCheckedChangeListener{

    private Context context;
    private LayoutInflater layoutInflater;
    private DateViewHolder dateViewHolder;
    private ChangeDate changeDate;
    private String placeName;

    private Integer amount = 0;

    public interface ChangeDate {
        void changeDate(int amount);
    }

    public DateDelegate(Context context) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        changeDate = (ChangeDate) context;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    @Override
    public ViewHolderType getViewHolderType() {
        return ViewHolderType.Date;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        return new DateViewHolder(
                layoutInflater.inflate(
                        R.layout.activity_main_recommand_class_date,
                        parent, false));
    }

    @Override
    public <T extends RecyclerView.ViewHolder> void onBindViewHolder(T viewHolder) {
        Log.d("recycler", "bind DateDelegate");

        // 防止刷新UI
        if(!uiFlag) {
            return;
        }
        uiFlag = false;

        //开始刷新UI
        dateViewHolder = (DateViewHolder)viewHolder;

        dateViewHolder.placeName.setText(placeName);

        //设置日期，默认选中今天
        dateViewHolder.radioGroup.setOnCheckedChangeListener(this);
        dateViewHolder.today.setText(UtilsMethod.theNextNDayWithText(0));
        dateViewHolder.tomorrow.setText(UtilsMethod.theNextNDayWithText(1));
        dateViewHolder.theDayAfterTomorrow.setText(UtilsMethod.theNextNDayWithText(2));
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.today:
                this.amount = 0;
                changeDate.changeDate(amount);
                break;
            case R.id.tomorrow:
                this.amount = 1;
                changeDate.changeDate(amount);
                break;
            case R.id.the_day_after_tomorrow:
                this.amount = 2;
                changeDate.changeDate(amount);
                break;
            default:
                break;
        }
    }


    public static class DateViewHolder extends RecyclerView.ViewHolder {

        TextView placeName;
        RadioGroup radioGroup;
        RadioButton today, tomorrow, theDayAfterTomorrow;

        public DateViewHolder(View itemView) {
            super(itemView);
            placeName = itemView.findViewById(R.id.place_name);
            radioGroup = itemView.findViewById(R.id.radio_group);
            today = itemView.findViewById(R.id.today);
            tomorrow = itemView.findViewById(R.id.tomorrow);
            theDayAfterTomorrow = itemView.findViewById(R.id.the_day_after_tomorrow);
        }
    }
}
