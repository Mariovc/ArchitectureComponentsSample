package com.mvc.architecturecomponents

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation

/**
 * A fragment with a Google +1 button.
 * Activities that contain this fragment must implement the
 * [BFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [BFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        val button = view.findViewById<View>(R.id.button) as TextView
        button.setOnClickListener {
            val navController = Navigation.findNavController(view)
            navController.navigate(R.id.action_b_fragment_to_b_graph)
        }
        val titleTextView = view.findViewById<TextView>(R.id.title)
        titleTextView.text = String.format("%s\nwith: %s",
            titleTextView.text,
            BFragmentArgs.fromBundle(arguments).argumentText)

        return view
    }

}// Required empty public constructor
