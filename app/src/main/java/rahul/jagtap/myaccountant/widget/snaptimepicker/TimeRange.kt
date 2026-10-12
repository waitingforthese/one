package rahul.jagtap.myaccountant.widget.snaptimepicker

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import rahul.jagtap.myaccountant.widget.snaptimepicker.TimeValue

@Parcelize
data class TimeRange(
    var start: TimeValue?,
    var end: TimeValue?
) : Parcelable
