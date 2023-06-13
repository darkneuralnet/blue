package com.amazonaws.mobileconnectors.p025s3.transfermanager.internal;

import java.util.concurrent.Future;
/* renamed from: com.amazonaws.mobileconnectors.s3.transfermanager.internal.TransferMonitor */
/* loaded from: classes2.dex */
public interface TransferMonitor {
    Future<?> getFuture();

    boolean isDone();
}
