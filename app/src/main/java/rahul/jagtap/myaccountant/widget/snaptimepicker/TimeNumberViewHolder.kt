package rahul.jagtap.myaccountant.widget.snaptimepicker

import androidx.recyclerview.widget.RecyclerView
import rahul.jagtap.myaccountant.databinding.LayoutSnapTimePickerNumberItemBinding

class TimeNumberViewHolder(
    private val binding: LayoutSnapTimePickerNumberItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun setNumber(number: String?) {
        binding.textViewNumber.text = number ?: "-"
    }
}
