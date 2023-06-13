package com.amazonaws.services.p026s3.model;
@Deprecated
/* renamed from: com.amazonaws.services.s3.model.ProgressEvent */
/* loaded from: classes3.dex */
public class ProgressEvent extends com.amazonaws.event.ProgressEvent {
    public ProgressEvent(int i) {
        super(i);
    }

    @Deprecated
    public int getBytesTransfered() {
        return (int) getBytesTransferred();
    }

    @Deprecated
    public void setBytesTransfered(int i) {
        setBytesTransferred(i);
    }

    public ProgressEvent(int i, long j) {
        super(i, j);
    }
}
