package uz.gita.evos_app.presentation.viewModels

import androidx.lifecycle.LiveData

interface FoodPageViewModel {
    val foodAdapterLiveData:LiveData<Unit>

}