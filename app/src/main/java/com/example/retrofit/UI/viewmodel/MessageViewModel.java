package com.example.retrofit.UI.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


import com.example.retrofit.domain.MessageRespose;

import java.util.List;

public class MessageViewModel extends ViewModel {
    private  MutableLiveData<List<MessageRespose.DataBean>> mData;
    public  MutableLiveData<List<MessageRespose.DataBean>> getmData() {
        if (mData == null) {
            mData = new MutableLiveData<>();
            mData.setValue(null);
        }
        return mData;
    }
    public  void addDataBean(MessageRespose.DataBean dataBean){
        System.out.println("加入一个dataBean");
        mData.getValue().add(dataBean);
    }


}
