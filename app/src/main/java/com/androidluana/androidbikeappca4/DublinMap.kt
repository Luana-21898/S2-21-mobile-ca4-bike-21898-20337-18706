package com.androidluana.androidbikeappca4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class DublinMap : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dublin_map)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        val DubLatLng = LatLng(53.3244431,-6.3857855)
        val zoomLevel = 10f
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(DubLatLng,zoomLevel))
        val Dublocations= arrayListOf<LatLng>(LatLng(53.349562,-6.278198), LatLng(53.353462,-6.265305), LatLng(53.336021,-6.26298), LatLng(53.359405,-6.276142), LatLng(53.33796,-6.24153), LatLng(53.343368
            ,-6.27012), LatLng(53.334123,-6.265436), LatLng(53.344304,-6.250427), LatLng(53.338755,-6.262003), LatLng(53.347777,-6.244239), LatLng(53.336074,-6.252825), LatLng(53.330091,-6.268044),
            LatLng(53.350929,-6.265125), LatLng(53.341515,-6.256853),LatLng(53.348279,-6.254662), LatLng(53.35893,-6.280337), LatLng(53.357841,-6.251557), LatLng(53.344115,-6.237153),
            LatLng(53.343893,-6.280531), LatLng(53.347477,-6.28525), LatLng(53.339005,-6.300217), LatLng(53.344153,-6.233451), LatLng(53.334295,-6.258503), LatLng(53.340803,-6.267732),
            LatLng(53.351464,-6.255265), LatLng(53.333653,-6.248345), LatLng(53.343105,-6.277167), LatLng(53.341428,-6.24672), LatLng(53.338614,-6.248606), LatLng(53.341833,-6.231291), LatLng(53.346637,-6.246154),
            LatLng(53.343034,-6.263578), LatLng(53.346867,-6.230852), LatLng(53.3547,-6.272314), LatLng(53.33403,-6.260714), LatLng(53.346026,-6.243576), LatLng(53.330662,-6.260177), LatLng(53.342113,-6.310015),
            LatLng(53.357043,-6.263232), LatLng(53.348875,-6.267459), LatLng(53.342081,-6.275233), LatLng(53.346874,-6.272976), LatLng(53.347932,-6.240928), LatLng(53.334432,-6.245575),
            LatLng(53.343565,-6.275071), LatLng(53.354929,-6.269425), LatLng(53.350974,-6.25294), LatLng(53.337132,-6.26059), LatLng(53.339218,-6.240642), LatLng(53.347122,-6.234749), LatLng(53.355173,-6.278424),
            LatLng(53.350291,-6.273507), LatLng(53.354845,-6.247579), LatLng(53.335742,-6.24551), LatLng(53.343653,-6.231755), LatLng(53.347884,-6.248048), LatLng(53.341288,-6.258117), LatLng(53.347508,-6.252192),
            LatLng(53.341805,-6.305085), LatLng(53.341645,-6.29719), LatLng(53.342296,-6.287661), LatLng(53.337757,-6.267699), LatLng(53.358115,-6.265601), LatLng(53.342638,-6.238695), LatLng(53.339434,-6.246548),
            LatLng(53.339334,-6.264699), LatLng(53.337494,-6.26199), LatLng(53.35561,-6.261397), LatLng(53.343897,-6.29706), LatLng(53.346985,-6.297804), LatLng(53.355954,-6.278378), LatLng(53.337824,-6.256035),
            LatLng(53.346603,-6.296924), LatLng(53.345922,-6.254614), LatLng(53.35023,-6.279696), LatLng(53.356307,-6.273717), LatLng(53.359246,-6.269779), LatLng(53.330362,-6.265163), LatLng(53.359967,-6.264828),
            LatLng(53.356769,-6.26814), LatLng(53.356769,-6.26814), LatLng(53.343456,-6.287409), LatLng(53.356717,-6.256359), LatLng(53.339764,-6.251988), LatLng(53.34744,-6.238523), LatLng(53.355473,-6.264423),
            LatLng(53.347972,-6.291804), LatLng(53.344007,-6.266802), LatLng(53.347106,-6.292041), LatLng(53.352149,-6.260533), LatLng(53.345203,-6.247163), LatLng(53.353331,-6.249319), LatLng(53.338776,-6.30395),
            LatLng(53.359157,-6.281866), LatLng(53.349013,-6.260311), LatLng(53.358437,-6.260641), LatLng(53.335211,-6.2509), LatLng(53.339629,-6.243778), LatLng(53.341359,-6.292951), LatLng(53.332763,-6.257942),
            LatLng(53.351182,-6.269859), LatLng(53.3483,-6.266651), LatLng(53.346057,-6.268001), LatLng(53.354663,-6.278681), LatLng(53.356299,-6.258586), LatLng(53.332383,-6.252717), LatLng(53.340714,-6.308191),
            LatLng(53.347802,-6.292432), LatLng(53.34218,-6.254485), LatLng(53.3488,-6.281637))

        for(i in Dublocations.indices){
            mMap.addMarker(MarkerOptions().position(Dublocations[i]))
        }
    }
}