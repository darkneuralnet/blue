package com.google.android.filament.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes5.dex */
public class RemoteServer {
    private long mNativeObject;

    /* loaded from: classes5.dex */
    public static class ReceivedMessage {
        public ByteBuffer buffer;
        public String label;
    }

    public RemoteServer(int i) {
        long nCreate = nCreate(i);
        this.mNativeObject = nCreate;
        if (nCreate != 0) {
            return;
        }
        throw new IllegalStateException("Couldn't create RemoteServer");
    }

    public static boolean isBinary(String str) {
        if (str != null && !str.endsWith(".json")) {
            return true;
        }
        return false;
    }

    public static boolean isJson(String str) {
        if (str != null && str.endsWith(".json")) {
            return true;
        }
        return false;
    }

    private static native void nAcquireReceivedMessage(long j, ByteBuffer byteBuffer, int i);

    private static native long nCreate(int i);

    private static native void nDestroy(long j);

    private static native String nPeekIncomingLabel(long j);

    private static native int nPeekReceivedBufferLength(long j);

    private static native String nPeekReceivedLabel(long j);

    public ReceivedMessage acquireReceivedMessage() {
        int nPeekReceivedBufferLength = nPeekReceivedBufferLength(this.mNativeObject);
        if (nPeekReceivedBufferLength == 0) {
            return null;
        }
        ReceivedMessage receivedMessage = new ReceivedMessage();
        receivedMessage.label = nPeekReceivedLabel(this.mNativeObject);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(nPeekReceivedBufferLength);
        receivedMessage.buffer = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        nAcquireReceivedMessage(this.mNativeObject, receivedMessage.buffer, nPeekReceivedBufferLength);
        return receivedMessage;
    }

    public void close() {
        nDestroy(this.mNativeObject);
        this.mNativeObject = 0L;
    }

    public void finalize() throws Throwable {
        nDestroy(this.mNativeObject);
        super.finalize();
    }

    public String peekIncomingLabel() {
        return nPeekIncomingLabel(this.mNativeObject);
    }
}
