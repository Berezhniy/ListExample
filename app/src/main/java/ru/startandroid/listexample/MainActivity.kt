package ru.startandroid.listexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listExample = ListExample()
        fun initAll() {
            listExample.myList
            listExample.myMutableList
            listExample.zz
            listExample.getById(0)
            listExample.indexOf(0)
            listExample.lastIndexOf(0)
            listExample.lastIndex()
            listExample.commonCount()
            listExample.showSize()
            listExample.paramsCount()
            listExample.firstElement()
            listExample.lastElement()
            listExample.findLast()
            listExample.findFirst()
            listExample.forEach()
            listExample.commonFor()
            listExample.forEachIndexed()
            listExample.commonSorted()
            listExample.sortedDescending()
            listExample.commonReversed()
            listExample.commonContains()
            listExample.unCommonContains()
            listExample.commonAdd()
            listExample.addAll()
            listExample.commonShuffle()
            listExample.removeAt()
            listExample.retainAll()
            listExample.commonSet()
            listExample.commonClear()
            listExample.commonSlice()
            listExample.commonMax()
            listExample.commonFilter()
            listExample.commonMap()
            listExample.commonTotal()
            listExample.reduceRight()
            listExample.commonFold()
            listExample.commonChunked()
            listExample.commonPartition()
            listExample.commonAny()
            listExample.commonAll()
            listExample.commonDrop()
            listExample.dropLast()
            listExample.commonTake()
            listExample.takeLast()


        }
    }
}