package com.mvc.architecturecomponents

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

/**
 * A fragment with a Google +1 button.
 * Activities that contain this fragment must implement the
 * [DFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [DFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_d, container, false)
        view.findViewById<View>(R.id.button).setOnClickListener {
            val navController = Navigation.findNavController(view)
            navController.navigate(R.id.action_b_graph_pop)
        }
        return view
    }

}// Required empty public constructor
