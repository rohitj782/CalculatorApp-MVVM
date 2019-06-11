package rohitrj.com.calculatorapp.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.main_fragment.*
import rohitrj.com.calculatorapp.R
import kotlin.math.min

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        textViewResult.text = viewModel.getMessage()

        lateinit var value: String

        //retrieving values when any  button is clicked
        one.setOnClickListener {
            value = one.text.toString()
            performOperation(value)
        }
        two.setOnClickListener {
            value = two.text.toString()
            performOperation(value)
        }
        three.setOnClickListener {
            value = three.text.toString()
            performOperation(value)
        }
        four.setOnClickListener {
            value = four.text.toString()
            performOperation(value)
        }
        five.setOnClickListener {
            value = five.text.toString()
            performOperation(value)
        }
        six.setOnClickListener {
            value = six.text.toString()
            performOperation(value)
        }
        seven.setOnClickListener {
            value = seven.text.toString()
            performOperation(value)
        }
        eight.setOnClickListener {
            value = eight.text.toString()
            performOperation(value)
        }
        nine.setOnClickListener {
            value = nine.text.toString()
            performOperation(value)
        }
        zero.setOnClickListener {
            value = zero.text.toString()
            performOperation(value)
        }

        clear.setOnClickListener {
            value = clear.text.toString()
            performOperation(value)
        }
        left.setOnClickListener {
            value = left.text.toString()
            performOperation(value)
        }
        right.setOnClickListener {
            value = right.text.toString()
            performOperation(value)
        }
        delete.setOnClickListener {
            value = delete.text.toString()
            performOperation(value)
        }
        plus.setOnClickListener {
            value = plus.text.toString()
            performOperation(value)
        }
        minus.setOnClickListener {
            value = minus.text.toString()
            performOperation(value)
        }

        multiply.setOnClickListener {
            value = multiply.text.toString()
            performOperation(value)
        }

        divide.setOnClickListener {
            value = divide.text.toString()
            performOperation(value)
        }
        decimal.setOnClickListener {
            value = decimal.text.toString()
            performOperation(value)
        }

        equals.setOnClickListener {
            value = equals.text.toString()
            performOperation(value)
        }


    }

    fun performOperation(value: String) {

        Toast.makeText(context, value+"", Toast.LENGTH_SHORT).show()
    }

}
