package com.uoft.zuohanmu.dribbbo.view.shot_list;

import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.uoft.zuohanmu.dribbbo.R;
import com.uoft.zuohanmu.dribbbo.view.base.BaseViewHolder;

import butterknife.BindView;

class ShotViewHolder extends BaseViewHolder {

    @BindView(R.id.shot_clickable_cover) View cover;
    @BindView(R.id.shot_like_count) TextView likeCount;
    @BindView(R.id.shot_bucket_count) TextView bucketCount;
    @BindView(R.id.shot_view_count) TextView viewCount;
    @BindView(R.id.shot_image) SimpleDraweeView image;

    public ShotViewHolder(View itemView) {
        super(itemView);
    }
}
