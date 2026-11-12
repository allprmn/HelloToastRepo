package lat.pam.hellotoast

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel() {
    // Membuat LiveData dengan tipe Integer yang diberi nilai awal 0
    val currentName: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>(0)
    }
}