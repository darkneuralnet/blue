package com.amazonaws.mobileconnectors.p025s3.transfermanager.internal;

import com.amazonaws.mobileconnectors.p025s3.transfermanager.Transfer;
/* renamed from: com.amazonaws.mobileconnectors.s3.transfermanager.internal.TransferStateChangeListener */
/* loaded from: classes2.dex */
public interface TransferStateChangeListener {
    void transferStateChanged(Transfer transfer, Transfer.TransferState transferState);
}
