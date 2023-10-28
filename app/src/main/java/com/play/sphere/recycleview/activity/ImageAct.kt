package com.play.sphere.recycleview.activity

import android.os.Bundle
import android.util.Log
import android.util.SparseArray
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import at.huber.youtubeExtractor.VideoMeta
import at.huber.youtubeExtractor.YouTubeExtractor
import at.huber.youtubeExtractor.YtFile
import com.play.sphere.recycleview.R
import com.play.sphere.recycleview.adapter.AdapterImage
import com.play.sphere.recycleview.dataclass.DataImage


class ImageAct : AppCompatActivity() {
    private lateinit var rcvImage:RecyclerView
    private lateinit var mAdapterImage: AdapterImage

    val listOfURL= arrayListOf<DataImage>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

//        listOfURL.add(DataImage(
//            url = "https://youtu.be/U619hZfuo0A?si=Okop7LhKVmlQ60yX",
//            name = "Eye")
//        )
//
//        listOfURL.add(DataImage(
//            url = "https://players.brightcove.net/3910869736001/default_default/index.min.js",
//            name = "Eye")
//        )
        listOfURL.add(DataImage(
            url = "https://www.youtube.com/watch?v=mF2BHtQh4EI&ab_channel=SonyMusicIndia",
            name = "Eye")
        )
//        listOfURL.add(DataImage(
//            url = "https://www.simplilearn.com/ice9/free_resources_article_thumb/what_is_image_Processing.jpg",
//            name = "Eye")
//        )
//        listOfURL.add(DataImage(
//            url = "https://www.simplilearn.com/ice9/free_resources_article_thumb/what_is_image_Processing.jpg",
//            name = "Eye")
//        )

//        Log.d("TAG", "onCreate:${listOfURL.size} ")
        bindView()
        bindClick()
    }

    private fun bindView() {
        rcvImage=findViewById(R.id.rcvImage)
        mAdapterImage= AdapterImage(this,listOfURL)


        rcvImage.layoutManager=GridLayoutManager(this,1)
        rcvImage.adapter=mAdapterImage

    }

    private fun bindClick() {

    }
}