package com.androidluana.androidbikeappca4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var map: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.map_options, menu)
        return true
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
        map = googleMap
        val DubLatLng = LatLng(53.3244431,-6.3857855)
        val zoomLevel = 10f
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(DubLatLng,zoomLevel))
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
            map.addMarker(MarkerOptions().position(Dublocations[i]))
        }

        val LyonLatLng=LatLng(45.7200911,4.688865)
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(LyonLatLng,zoomLevel))
        val Lyonlocations= arrayListOf<LatLng>(LatLng(45.743317,4.815747),LatLng(45.75197,4.821662),LatLng(45.846034,4.832409),LatLng(45.768896,4.844845), LatLng(45.750945,4.83927), LatLng(45.776239,4.871634), LatLng(45.756204,4.802727), LatLng(45.787522,4.814418),
                LatLng(45.767467,4.874032), LatLng(45.78458,4.859664), LatLng(45.780403,4.904954), LatLng(45.769226,4.880491), LatLng(45.70597,4.900886), LatLng(45.779702,4.860029), LatLng(45.778767,4.841109), LatLng(45.79169,4.843452), LatLng(45.719399,4.854681), LatLng(45.750251,4.857919),
                LatLng(45.784023,4.897102), LatLng(45.725891,4.858428), LatLng(45.749622,4.85299), LatLng(45.774754,4.887977),LatLng(45.745824,4.817176),LatLng(45.775425,4.817888),LatLng(45.755768,4.891542),LatLng(45.778175,4.810716),LatLng(45.754296,4.86359),LatLng(45.770309,4.86196),
                LatLng(45.757847,4.826103),LatLng(45.75251,4.846278),LatLng(45.748504,4.840505),LatLng(45.732366,4.865101),LatLng(45.779786,4.827635),LatLng(45.725403,4.881292),LatLng(45.772229,4.819389),LatLng(45.751827,4.8526),LatLng(45.743163,4.834165),LatLng(45.784812,4.856432),
                LatLng(45.759932,4.832111),LatLng(45.749563,4.875934),LatLng(45.744447,4.860889),LatLng(45.748346,4.875955),LatLng(45.73586,4.856888),LatLng(45.780422,4.904505),LatLng(45.750344,4.845048),LatLng(45.749565,4.887311),LatLng(45.77591,4.825394),
                LatLng(45.774581,4.87406),LatLng(45.768023,4.831733),LatLng(45.757112,4.853405),LatLng(45.747251,4.865386),LatLng(45.750497,4.788819),LatLng(45.771902,4.955721),LatLng(45.785456,4.854085),LatLng(45.774366,4.832716),LatLng(45.769383,4.842364),
                LatLng(45.773468,4.800286),LatLng(45.746163,4.82548),LatLng(45.763065,4.83425),LatLng(45.760042,4.861734),LatLng(45.767057,4.827014),LatLng(45.750116,4.82801),LatLng(45.768127,4.879096),LatLng(45.742932,4.90863),LatLng(45.737503,4.837484),
                LatLng(45.737745,4.824495),LatLng(45.762055,4.868486),LatLng(45.774061,4.82516),LatLng(45.7548502313005,4.85748756866509),LatLng(45.763717,4.843791),LatLng(45.761801,4.880735),LatLng(45.770136,4.80516),LatLng(45.760912,4.845291),LatLng(45.801192,4.825451),
                LatLng(45.759743,4.889938),LatLng(45.742639,4.850538),LatLng(45.766372,4.865058),LatLng(45.745828,4.870631),LatLng(45.753528,4.857784), LatLng(45.731361,4.860139),LatLng(45.770508,4.800869),LatLng(45.832495,4.848795),LatLng(45.772277,4.865774),
                LatLng(45.773358,4.821234), LatLng(45.764062,4.865802), LatLng(45.759494,4.830161), LatLng(45.777521,4.844922), LatLng(45.764821,4.841567), LatLng(45.74222,4.860219), LatLng(45.752074,4.91466), LatLng(45.749431,4.834816), LatLng(45.746681,4.844455),
                LatLng(45.741922,4.894068), LatLng(45.727881,4.86355), LatLng(45.740492,4.888084), LatLng(45.7620452080746,4.82872732991442), LatLng(45.765214,4.909808), LatLng(45.776217,4.862636), LatLng(45.768223,4.827533), LatLng(45.791621,4.808426), LatLng(45.771034,4.79644),
                LatLng(45.764345,4.853492), LatLng(45.761825,4.886156), LatLng(45.758974,4.853599), LatLng(45.766284,4.856848), LatLng(45.753452,4.804401), LatLng(45.743569,4.870083), LatLng(45.797415,4.829038), LatLng(45.790414,4.816359), LatLng(45.781699,4.820596),
                LatLng(45.77939,4.863068), LatLng(45.766708,4.852073), LatLng(45.75958,4.882739), LatLng(45.770664,4.849946), LatLng(45.75597,4.818904), LatLng(45.738671,4.878117), LatLng(45.747956,4.824898), LatLng(45.73403,4.908777), LatLng(45.759379,4.835414),
                LatLng(45.749588,4.800967),LatLng(45.775679,4.805314),LatLng(45.753077,4.829706),LatLng(45.740865,4.868244),LatLng(45.751073,4.848018),LatLng(45.753455,4.833367),LatLng(45.727494,4.831145),LatLng(45.730788,4.887513),LatLng(45.735653,4.853042),LatLng(45.767912,4.819872),
                LatLng(45.774193,4.827743),LatLng(45.720156,4.798426),LatLng(45.760689,4.863069),LatLng(45.779332,4.820259),LatLng(45.815973,4.887019),LatLng(45.75991,4.857555),LatLng(45.771561,4.890378),LatLng(45.755988,4.877409),LatLng(45.770006,4.829274),LatLng(45.753683,4.889285),
                LatLng(45.778385,4.879673),LatLng(45.761595,4.850477),LatLng(45.770743,4.856713),LatLng(45.729771,4.868157),LatLng(45.763244,4.778641),LatLng(45.789194,4.799308),LatLng(45.76438,4.919276),LatLng(45.763755,4.847082),LatLng(45.767957,4.887232),LatLng(45.77696,4.876552),
                LatLng(45.776646,4.902366),LatLng(45.77608,4.832543),LatLng(45.771143,4.88504),LatLng(45.769158,4.89678),LatLng(45.729791,4.838138),LatLng(45.759648,4.848139),LatLng(45.759361,4.842308),LatLng(45.753049,4.828297),LatLng(45.73674,4.834106),LatLng(45.697863,4.794658),
                LatLng(45.772846,4.856274),LatLng(45.7228,4.842706),LatLng(45.733317,4.878607),LatLng(45.727691,4.837392),LatLng(45.775112,4.778531),LatLng(45.735741,4.827725),LatLng(45.746691,4.867501),LatLng(45.774228,4.864269),LatLng(45.703245,4.821204),LatLng(45.774526,4.848443),
                LatLng(45.760908,4.920569),LatLng(45.776428,4.866976),LatLng(45.773232,4.841949),LatLng(45.757808,4.861512),LatLng(45.760056,4.798366),LatLng(45.750002,4.864587),LatLng(45.78037,4.904694),LatLng(45.770225,4.863102),LatLng(45.769803,4.812681),LatLng(45.727309,4.814779),
                LatLng(45.782855,4.807288),LatLng(45.771794,4.84459),LatLng(45.73648,4.869789),LatLng(45.761468,4.872466),LatLng(45.759842,4.835776),LatLng(45.757192,4.840495),LatLng(45.752453,4.858785),LatLng(45.778639,4.8071),LatLng(45.757484,4.858386),LatLng(45.754415,4.885249),
                LatLng(45.788204,4.818572),LatLng(45.714426,4.930975),LatLng(45.724775,4.870745),LatLng(45.756775,4.833917),LatLng(45.736722,4.841079),LatLng(45.766073,4.832849),LatLng(45.764013,4.849933),LatLng(45.751233,4.82688),LatLng(45.777431,4.820526),LatLng(45.751902,4.843812),
                LatLng(45.773125,4.807831),LatLng(45.757042,4.86532),LatLng(45.748535,4.861533),LatLng(45.75377,4.848043),LatLng(45.771912,4.87907),LatLng(45.780403,4.904869),LatLng(45.737481,4.865503),LatLng(45.767051,4.892467),LatLng(45.740052,4.85941),LatLng(45.752907,4.863923),
                LatLng(45.746779,4.842051),LatLng(45.708561,4.854821),LatLng(45.756535,4.796616),LatLng(45.783533,4.871294),LatLng(45.786533,4.811446),LatLng(45.730786,4.823733),LatLng(45.736633,4.917009),LatLng(45.791748,4.823595),LatLng(45.752553,4.855756),LatLng(45.757646,4.883377),
                LatLng(45.751123,4.855604),LatLng(45.714039,4.806642),LatLng(45.758733,4.834136),LatLng(45.772191,4.837917),LatLng(45.760762,4.834305),LatLng(45.782287,4.849378),LatLng(45.777873,4.884238),LatLng(45.762184,4.836023),LatLng(45.732483,4.853406),LatLng(45.748193,4.880641),
                LatLng(45.752989,4.841417),LatLng(45.745018,4.866424),LatLng(45.777287,4.803297),LatLng(45.757173,4.89998),LatLng(45.728542,4.877279),LatLng(45.758,4.834594),LatLng(45.744438,4.822152),LatLng(45.745528,4.82359),LatLng(45.759488,4.869346),LatLng(45.735375,4.88954),
                LatLng(45.769289,4.830127),LatLng(45.739652,4.814984),LatLng(45.756813,4.828342),LatLng(45.767736,4.832114),LatLng(45.765944,4.831089),LatLng(45.755783,4.840745),LatLng(45.784526,4.877482),LatLng(45.775409,4.880261),LatLng(45.756757,4.783206),LatLng(45.747835,4.872261),
                LatLng(45.770099,4.876728),LatLng(45.740324,4.874192),LatLng(45.745304,4.888964),LatLng(45.762013,4.802751),LatLng(45.759176,4.875958),LatLng(45.754181,4.90528),LatLng(45.758399,4.885601),LatLng(45.766921,4.870087),LatLng(45.757864,4.868337),LatLng(45.741336,4.885538),
                LatLng(45.754468,4.833041),LatLng(45.769837,4.889629),LatLng(45.743756,4.847406),LatLng(45.764567,4.892349),LatLng(45.792478,4.820567),LatLng(45.776087,4.799725),LatLng(45.748286,4.896975),LatLng(45.769684,4.824607),LatLng(45.763139,4.900492),LatLng(45.766278,4.827425),
                LatLng(45.775435,4.83512),LatLng(45.784698,4.851896),LatLng(45.747933,4.856358),LatLng(45.75882,4.846453),LatLng(45.76884,4.884276),LatLng(45.736289,4.883667),LatLng(45.770991,4.807578),LatLng(45.766032,4.862063),LatLng(45.7684,4.858972),LatLng(45.736216,4.815348),
                LatLng(45.760468,4.826548),LatLng(45.773845,4.893851),LatLng(45.767194,4.900597),LatLng(45.731708,4.874205),LatLng(45.769508,4.837495),LatLng(45.759906,4.844511),LatLng(45.785632,4.882366),LatLng(45.753975,4.867336),LatLng(45.766893,4.858922),LatLng(45.717001,4.814072),
                LatLng(45.757931,4.910776),LatLng(45.782631,4.825576),LatLng(45.761532,4.895763),LatLng(45.779062,4.866874),LatLng(45.758874,4.878683),LatLng(45.77762,4.83453),LatLng(45.739827,4.840308),LatLng(45.783698,4.794485),LatLng(45.760603,4.900702),LatLng(45.774632,4.813425),
                LatLng(45.752923,4.898891),LatLng(45.733388,4.818954),LatLng(45.708123,4.861905),LatLng(45.770392,4.814254),LatLng(45.782994,4.890614),LatLng(45.757916,4.81317),LatLng(45.760779,4.85276),LatLng(45.734027,4.862906),LatLng(45.740279,4.832061),LatLng(45.760698,4.836279),
                LatLng(45.779066,4.871581),LatLng(45.752967,4.850271),LatLng(45.7708541,4.8726116),LatLng(45.779731,4.834708),LatLng(45.74541,4.847843),LatLng(45.776002,4.829628),LatLng(45.876622,4.838578),LatLng(45.755068,4.871457),LatLng(45.757578,4.846117),LatLng(45.770705,4.867201),
                LatLng(45.730083,4.82781),LatLng(45.758333,4.821075),LatLng(45.751404,4.836395),LatLng(45.743396,4.87897),LatLng(45.762876,4.862249),LatLng(45.769654,4.852366),LatLng(45.77291,4.837315),LatLng(45.786546,4.797107),LatLng(45.727951,4.823563),LatLng(45.765811,4.844767),
                LatLng(45.781008,4.871219),LatLng(45.766821,4.841095),LatLng(45.753705,4.838283),LatLng(45.766763,4.832942),LatLng(45.764812,4.884311),LatLng(45.736219,4.879855),LatLng(45.757936,4.921156),LatLng(45.747358,4.836009),LatLng(45.805207,4.88477),LatLng(45.729714,4.854338),
                LatLng(45.779429,4.873992),LatLng(45.785796,4.833733),LatLng(45.743975,4.841463),LatLng(45.75254,4.894272),LatLng(45.719746,4.888457),LatLng(45.76611,4.898539),LatLng(45.724352,4.826821),LatLng(45.780679,4.88356),LatLng(45.763906,4.792643),LatLng(45.729454,4.844228),
                LatLng(45.781574,4.832866),LatLng(45.767611,4.836619),LatLng(45.751873,4.824763),LatLng(45.71532,4.878337),LatLng(45.773815,4.809566),LatLng(45.72284,4.915219),LatLng(45.785465,4.847838),LatLng(45.762974,4.855071),LatLng(45.774241,4.805676),LatLng(45.760526,4.905877),
                LatLng(45.779487,4.891692),LatLng(45.773304,4.852001),LatLng(45.786262,4.926788),LatLng(45.782222,4.876951),LatLng(45.748925,4.847714),LatLng(45.754978,4.812427),LatLng(45.830874,4.846988),LatLng(45.870877,4.839595),LatLng(45.778178,4.920544),LatLng(45.776715,4.859573),
                LatLng(45.767062,4.834294),LatLng(45.742617,4.820464),LatLng(45.735158,4.872803),LatLng(45.762023,4.841053),LatLng(45.874978,4.833024),LatLng(45.708509,4.886939),LatLng(45.764489,4.877894),LatLng(45.763652,4.873158),LatLng(45.738301,4.862727),LatLng(45.757268,4.855193),
                LatLng(45.763383,4.829024),LatLng(45.757147,4.858975),LatLng(45.787941,4.853035),LatLng(45.75118,4.884795),LatLng(45.762054,4.833194),LatLng(45.74656,4.842265),LatLng(45.754654,4.78821),LatLng(45.749257,4.82984),LatLng(45.757092,4.92731),LatLng(45.799742,4.819607),
                LatLng(45.766576,4.820214),LatLng(45.764695,4.828969),LatLng(45.754727,4.85346),LatLng(45.741425,4.879733),LatLng(45.749627,4.795546),LatLng(45.738135,4.886885),LatLng(45.752779,4.868748),LatLng(45.835406,4.8457),LatLng(45.766861,4.880059),LatLng(45.765789,4.836906),
                LatLng(45.77435,4.859157),LatLng(45.757571,4.837183),LatLng(45.764079,4.835554),LatLng(45.724172,4.854165),LatLng(45.734712,4.835486),LatLng(45.712362,4.855202),LatLng(45.745939,4.851214),LatLng(45.754875,4.843627),LatLng(45.783885,4.852156),LatLng(45.73182,4.833996),
                LatLng(45.747091,4.860196),LatLng(45.768395,4.849402),LatLng(45.748545,4.843249),LatLng(45.764961,4.901018),LatLng(45.740675,4.819284),LatLng(45.767165,4.836334),LatLng(45.755054,4.807811),LatLng(45.738617,4.852412),LatLng(45.747735,4.85162),LatLng(45.758149,4.830428),
                LatLng(45.762768,4.852563),LatLng(45.779786,4.804666),LatLng(45.745296,4.871604),LatLng(45.774204,4.867512),LatLng(45.767484,4.805626),LatLng(45.757319,4.815064),LatLng(45.756596,4.848442))

        for(i in Lyonlocations.indices){
            map.addMarker(MarkerOptions().position(Lyonlocations[i]))
        }






    }
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        // Change the map type based on the user's selection.
        R.id.normal_map -> {
            map.mapType = GoogleMap.MAP_TYPE_NORMAL
            true
        }
        R.id.hybrid_map -> {
            map.mapType = GoogleMap.MAP_TYPE_HYBRID
            true
        }
        R.id.satellite_map -> {
            map.mapType = GoogleMap.MAP_TYPE_SATELLITE
            true
        }
        R.id.terrain_map -> {
            map.mapType = GoogleMap.MAP_TYPE_TERRAIN
            true
        }
        else -> super.onOptionsItemSelected(item)
    }

}