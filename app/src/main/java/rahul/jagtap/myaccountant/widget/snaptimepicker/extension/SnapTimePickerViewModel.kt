package rahul.jagtap.myaccountant.widget.snaptimepicker.extension

import androidx.lifecycle.ViewModel
import rahul.jagtap.myaccountant.widget.snaptimepicker.extension.TimePickedEvent
import rahul.jagtap.myaccountant.widget.snaptimepicker.extension.TimePickedLiveData

class SnapTimePickerViewModel : ViewModel() {
    val timePickedEvent =
        TimePickedLiveData<TimePickedEvent>()

    fun onTimePicked(hour: Int, minute: Int) {
        timePickedEvent.value = TimePickedEvent(hour, minute)
    }
}
