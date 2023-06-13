package com.stripe.android.financialconnections.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/financialconnections/utils/ConflatedJob;", "", "Lzh2;", "newJob", "", "plusAssign", "cancel", "start", "job", "Lzh2;", "prevJob", "", "isActive", "()Z", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ConflatedJob {
    private InterfaceC52943zh2 job;
    private InterfaceC52943zh2 prevJob;

    public final void cancel() {
        InterfaceC52943zh2 interfaceC52943zh2 = this.job;
        if (interfaceC52943zh2 != null) {
            InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
        }
        this.prevJob = this.job;
    }

    public final boolean isActive() {
        InterfaceC52943zh2 interfaceC52943zh2 = this.job;
        if (interfaceC52943zh2 != null) {
            return interfaceC52943zh2.mo555b();
        }
        return false;
    }

    public final synchronized void plusAssign(InterfaceC52943zh2 newJob) {
        Intrinsics.checkNotNullParameter(newJob, "newJob");
        cancel();
        this.job = newJob;
    }

    public final void start() {
        InterfaceC52943zh2 interfaceC52943zh2 = this.job;
        if (interfaceC52943zh2 != null) {
            interfaceC52943zh2.start();
        }
    }
}
