package br.com.sportingforlife.ui.perfil;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class PerfilViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PerfilViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Perfil fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}