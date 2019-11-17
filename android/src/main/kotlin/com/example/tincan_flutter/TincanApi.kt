package com.example.tincan_flutter

import android.content.Context
import android.util.Log
import com.rs.RSTinCanOfflineConnector
import com.rs.TCOfflineStatementCollection
import com.rusticisoftware.tincan.Statement

class TincanApi {
    lateinit var tincan: com.rs.RSTinCanOfflineConnector;
    constructor(option: Map<String, Object>, context: Context){
        tincan = RSTinCanOfflineConnector(option, context);
    }


    fun enqueueStatement(statement: Statement) {
        tincan.enqueueStatement(statement, object : TCOfflineStatementCollection.addStatementInterface {
            override
            fun completionBlock() {
                Log.d("enqueueStatement", "completionBlock");
            }

            override
            fun errorBlock(s: String) {
                Log.d("enqueueStatement:", s)

            }
        })
    }

//    fun

}