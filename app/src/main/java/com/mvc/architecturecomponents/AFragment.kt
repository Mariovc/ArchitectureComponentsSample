package com.mvc.architecturecomponents

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras

/**
 * A fragment with a Google +1 button.
 * Activities that contain this fragment must implement the
 * [AFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [AFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        val titleTextView = view.findViewById<View>(R.id.titleA)
        view.findViewById<View>(R.id.button).setOnClickListener {
            FragmentNavigatorExtras()
            val extras = FragmentNavigatorExtras(
                titleTextView to "titleSharedTransition"
            )
            val navController = Navigation.findNavController(view)
            val action = AFragmentDirections.actionAToB()
            action.setArgumentText("argument safe passed")
//            navController.navigate(action, extras)
            navController.navigate(R.id.b_fragment, null, null, extras)
        }
        view.findViewById<View>(R.id.button2).setOnClickListener {
            val navController = androidx.navigation.Navigation.findNavController(view)
            navController.navigate(R.id.action_a_fragment_to_b_graph2)
        }

        return view
    }



}// Required empty public constructor
