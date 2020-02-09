package com.santanu.android.loglibrary

import android.util.Log

class LogMassage {

    companion object {
        public fun info(tag: String, massage: String) {
            Log.d(tag, "LogMassage{} : info() >>" +
                " [line ${Thread.currentThread().stackTrace[2].lineNumber}] :: $massage"
            )
        }

        public fun debug(tag: String, massage: String) {
            Log.d(tag, "LogMassage{} : debug() >>" +
                " [line ${Thread.currentThread().stackTrace[2].lineNumber}] :: $massage"
            )
        }

        public fun error(tag: String, massage: String) {
            Log.d(tag, "LogMassage{} : error() >>" +
                " [line ${Thread.currentThread().stackTrace[2].lineNumber}] :: $massage"
            )
        }

        public fun warning(tag: String, massage: String) {
            Log.d(tag, "LogMassage{} : warning() >>" +
                " [line ${Thread.currentThread().stackTrace[2].lineNumber}] :: $massage"
            )
        }
    }
}