package com.google.firebase.crashlytics.internal;

import android.util.Log;
/* loaded from: classes6.dex */
public class Logger {
    private int logLevel = 4;
    private final String tag;
    public static final String TAG = "FirebaseCrashlytics";
    static final Logger DEFAULT_LOGGER = new Logger(TAG);

    public Logger(String str) {
        this.tag = str;
    }

    private boolean canLog(int i) {
        return this.logLevel <= i || Log.isLoggable(this.tag, i);
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    /* renamed from: d */
    public void m47340d(String str, Throwable th) {
        if (canLog(3)) {
            Log.d(this.tag, str, th);
        }
    }

    /* renamed from: e */
    public void m47338e(String str, Throwable th) {
        if (canLog(6)) {
            Log.e(this.tag, str, th);
        }
    }

    /* renamed from: i */
    public void m47336i(String str, Throwable th) {
        if (canLog(4)) {
            Log.i(this.tag, str, th);
        }
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    /* renamed from: v */
    public void m47334v(String str, Throwable th) {
        if (canLog(2)) {
            Log.v(this.tag, str, th);
        }
    }

    /* renamed from: w */
    public void m47332w(String str, Throwable th) {
        if (canLog(5)) {
            Log.w(this.tag, str, th);
        }
    }

    public void log(int i, String str, boolean z) {
        if (z || canLog(i)) {
            Log.println(i, this.tag, str);
        }
    }

    /* renamed from: d */
    public void m47341d(String str) {
        m47340d(str, null);
    }

    /* renamed from: e */
    public void m47339e(String str) {
        m47338e(str, null);
    }

    /* renamed from: i */
    public void m47337i(String str) {
        m47336i(str, null);
    }

    /* renamed from: v */
    public void m47335v(String str) {
        m47334v(str, null);
    }

    /* renamed from: w */
    public void m47333w(String str) {
        m47332w(str, null);
    }
}
