package lib.kg.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import lib.kg.recyclerview.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private val adapter = CarAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val carList = arrayListOf(
            Car("https://images.unsplash.com/photo-1605559424843-9e4c228bf1c2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8Y2Fyc3xlbnwwfHwwfHx8MA%3D%3D&w=1000&q=80", "1 Car", "2000"),
            Car("https://imgd.aeplcdn.com/370x208/n/cw/ec/128413/scorpio-exterior-right-front-three-quarter-46.jpeg?isig=0&q=75", "1 Car", "2000"),
            Car("https://stimg.cardekho.com/images/carexteriorimages/930x620/Aston-Martin/DBX/9386/1676270378012/front-left-side-47.jpg?tr=w-375", "1 Car", "2000"),
            Car("https://img.freepik.com/premium-photo/blue-premium-business-sedan-car-sports-configuration-white-background-3d-rendering_101266-26564.jpg", "1 Car", "2000"),
            Car("https://images.pexels.com/photos/3729464/pexels-photo-3729464.jpeg?cs=srgb&dl=pexels-mike-bird-3729464.jpg&fm=jpg", "1 Car", "2000"),
            Car("https://images.pexels.com/photos/3729464/pexels-photo-3729464.jpeg?cs=srgb&dl=pexels-mike-bird-3729464.jpg&fm=jpg", "1 Car", "2000"),
            Car("https://images.pexels.com/photos/3729464/pexels-photo-3729464.jpeg?cs=srgb&dl=pexels-mike-bird-3729464.jpg&fm=jpg", "1 Car", "2000"),
            Car("https://images.pexels.com/photos/3729464/pexels-photo-3729464.jpeg?cs=srgb&dl=pexels-mike-bird-3729464.jpg&fm=jpg", "1 Car", "2000"),
            Car("https://images.pexels.com/photos/3729464/pexels-photo-3729464.jpeg?cs=srgb&dl=pexels-mike-bird-3729464.jpg&fm=jpg", "1 Car", "2000"),
        )

        binding.recycler.adapter = adapter
        adapter.addListModel(carList)

    }

}