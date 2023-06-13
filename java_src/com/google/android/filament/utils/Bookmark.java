package com.google.android.filament.utils;
/* loaded from: classes5.dex */
public class Bookmark {
    private long mNativeObject;

    public Bookmark(long j) {
        this.mNativeObject = j;
    }

    private static native void nDestroyBookmark(long j);

    public void finalize() throws Throwable {
        nDestroyBookmark(this.mNativeObject);
        super.finalize();
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }
}
