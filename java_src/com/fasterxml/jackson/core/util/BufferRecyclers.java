package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.p030io.JsonStringEncoder;
import java.lang.ref.SoftReference;
/* loaded from: classes5.dex */
public class BufferRecyclers {
    public static final String SYSTEM_PROPERTY_TRACK_REUSABLE_BUFFERS = "com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers";
    private static final ThreadLocalBufferManager _bufferRecyclerTracker;
    protected static final ThreadLocal<SoftReference<BufferRecycler>> _recyclerRef;

    static {
        boolean z;
        ThreadLocalBufferManager threadLocalBufferManager;
        try {
            z = "true".equals(System.getProperty(SYSTEM_PROPERTY_TRACK_REUSABLE_BUFFERS));
        } catch (SecurityException unused) {
            z = false;
        }
        if (z) {
            threadLocalBufferManager = ThreadLocalBufferManager.instance();
        } else {
            threadLocalBufferManager = null;
        }
        _bufferRecyclerTracker = threadLocalBufferManager;
        _recyclerRef = new ThreadLocal<>();
    }

    @Deprecated
    public static byte[] encodeAsUTF8(String str) {
        return JsonStringEncoder.getInstance().encodeAsUTF8(str);
    }

    public static BufferRecycler getBufferRecycler() {
        BufferRecycler bufferRecycler;
        SoftReference<BufferRecycler> softReference;
        ThreadLocal<SoftReference<BufferRecycler>> threadLocal = _recyclerRef;
        SoftReference<BufferRecycler> softReference2 = threadLocal.get();
        if (softReference2 == null) {
            bufferRecycler = null;
        } else {
            bufferRecycler = softReference2.get();
        }
        if (bufferRecycler == null) {
            bufferRecycler = new BufferRecycler();
            ThreadLocalBufferManager threadLocalBufferManager = _bufferRecyclerTracker;
            if (threadLocalBufferManager != null) {
                softReference = threadLocalBufferManager.wrapAndTrack(bufferRecycler);
            } else {
                softReference = new SoftReference<>(bufferRecycler);
            }
            threadLocal.set(softReference);
        }
        return bufferRecycler;
    }

    @Deprecated
    public static JsonStringEncoder getJsonStringEncoder() {
        return JsonStringEncoder.getInstance();
    }

    @Deprecated
    public static char[] quoteAsJsonText(String str) {
        return JsonStringEncoder.getInstance().quoteAsString(str);
    }

    @Deprecated
    public static byte[] quoteAsJsonUTF8(String str) {
        return JsonStringEncoder.getInstance().quoteAsUTF8(str);
    }

    public static int releaseBuffers() {
        ThreadLocalBufferManager threadLocalBufferManager = _bufferRecyclerTracker;
        if (threadLocalBufferManager != null) {
            return threadLocalBufferManager.releaseBuffers();
        }
        return -1;
    }

    @Deprecated
    public static void quoteAsJsonText(CharSequence charSequence, StringBuilder sb) {
        JsonStringEncoder.getInstance().quoteAsString(charSequence, sb);
    }
}
