package id.ac.ui.cs.mobileprogramming.lab4;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private MutableLiveData<Item> selected = new MutableLiveData<>();

    public void setSelected(Item item) {
        selected.setValue(item);
    }

    public MutableLiveData<Item> getSelected() {
        return selected;
    }
}