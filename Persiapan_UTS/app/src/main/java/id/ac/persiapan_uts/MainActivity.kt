package id.ac.persiapan_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.tkr,"TKR","TEKNIK KENDARAAN RINGAN","Teknik Kendaraan Ringan Otomotif " +
                "adalah sebuah ilmu yang mempelajari kompetisi keahlian bidang teknik otomotif yang menekankan pada bidang jasa perbaikan kendaraan ringan (mobil). " +
                "SMK 3 TEGAL"))

        data?.add(DataModel(R.drawable.tkj,"TKJ","TEKNIK KOMPUTER JARINGAN", "TKJ (Teknik Komputer dan Jaringan) adalah " +
                "ilmu berbasis Teknologi Informasi dan Komunikasi terkait kemampuan algoritma, dan pemrograman komputer, perakitan komputer,  " +
                "perakitan jaringan komputer, dan pengoperasian perangkat lunak, dan internet. Teknik komputer, dan jaringan"))

        data?.add(DataModel(R.drawable.tgb,"TEKNIK GAMBAR BANGUNAN","Rp22.000", "Pizza asli berasal dari Italia " +
                "dan bisa ditemui di Pizzeria (toko Pizza) yang tiap porsi pizzanya berdiameter kira-kira 30 cm atau lebih, " +
                "dengan adonan yang telah ditarik tipis."))

        data?.add(DataModel(R.drawable.av,"AV","AUDIO VIDEO", "Ini adalah makanan pokok dalam " +
                "masakan Italia tradisional. Karena berbentuk seperti mie, kebanyakan orang menyebutnya mie dari Italia meskipun " +
                "banyak varian pasta lainnya yang berbentuk seperti mie"))

        data?.add(DataModel(R.drawable.tsm,"TSM","TEKNIK SEPEDA MOTOR", "Martabak manis atau yang aslinya bernama " +
                "Hok Lo Pan awalnya adalah makanan khas Bangka Belitung. Hok Lo Pan atau Martabak diciptakan oleh orang-orang Hakka (Khek) " +
                "Bangka"))

        data?.add(DataModel(R.drawable.nkpi,"NKPI","NAUTIKA PENANGKAPAN IKAN", "Pizza asli berasal dari Italia " +
                "dan bisa ditemui di Pizzeria (toko Pizza) yang tiap porsi pizzanya berdiameter kira-kira 30 cm atau lebih, " +
                "dengan adonan yang telah ditarik tipis."))

        data?.add(DataModel(R.drawable.tp,"TP","TEKNIK PEMESINAN", "Ini adalah makanan pokok dalam " +
                "masakan Italia tradisional. Karena berbentuk seperti mie, kebanyakan orang menyebutnya mie dari Italia meskipun " +
                "banyak varian pasta lainnya yang berbentuk seperti mie"))


        data?.add(DataModel(R.drawable.tkpi,"TKPI","TEKNIK PENANGKAP IKAN", "Martabak manis atau yang aslinya bernama " +
                "Hok Lo Pan awalnya adalah makanan khas Bangka Belitung. Hok Lo Pan atau Martabak diciptakan oleh orang-orang Hakka (Khek) " +
                "Bangka"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.jurusan)
                intent.putExtra("harga", item?.nama_jurusan)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }
        })
    }
}