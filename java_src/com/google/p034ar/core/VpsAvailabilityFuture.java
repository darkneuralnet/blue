package com.google.p034ar.core;

import com.google.p034ar.core.annotations.UsedByNative;
import java.util.function.Consumer;
/* renamed from: com.google.ar.core.VpsAvailabilityFuture */
/* loaded from: classes6.dex */
public class VpsAvailabilityFuture {
    final long nativeCallbackContext;
    final long nativeFuture;
    final long nativeSymbolTableHandle;
    final Session session;

    /* renamed from: com.google.ar.core.VpsAvailabilityFuture$CallbackWrapper */
    /* loaded from: classes6.dex */
    public static class CallbackWrapper {

        /* renamed from: a */
        private final Consumer f73731a;

        public CallbackWrapper(Consumer consumer) {
            this.f73731a = consumer;
        }

        @UsedByNative("session_jni.cc")
        public void accept(int i) {
            this.f73731a.accept(VpsAvailability.forNumber(i));
        }
    }

    public VpsAvailabilityFuture(Session session, long j, long j2) {
        this.session = session;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
        this.nativeFuture = j;
        this.nativeCallbackContext = j2;
    }

    public static native void nativeReleaseFuture(long j, long j2);

    public boolean cancel() {
        return nativeCancel(this.session.nativeWrapperHandle, this.nativeFuture, this.nativeCallbackContext);
    }

    public void finalize() throws Throwable {
        nativeReleaseFuture(this.nativeSymbolTableHandle, this.nativeFuture);
        super.finalize();
    }

    public VpsAvailability getResult() {
        return VpsAvailability.forNumber(nativeGetResult(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    public FutureState getState() {
        return FutureState.forNumber(nativeGetState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    public native boolean nativeCancel(long j, long j2, long j3);

    public native int nativeGetResult(long j, long j2);

    public native int nativeGetState(long j, long j2);
}
