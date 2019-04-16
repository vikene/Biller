package com.vigneashsundar.biller.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.vigneashsundar.biller.R;

public class paymentDialog {
    Activity mContext;
    Dialog mDialog;
    public paymentDialog(Activity appContext){
        mContext = appContext;
    }
    public void showDialog(){
        mDialog = new Dialog(mContext);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(R.layout.paymentdialog);
        ImageView statusImage = mDialog.findViewById(R.id.processedImageDisplay);
        Glide.with(mContext)
                .load(R.drawable.checkmark)
                .centerCrop()
                .into(statusImage);
        mDialog.show();
    }
    public void cancelDialog(){
        mDialog.dismiss();
    }
}
