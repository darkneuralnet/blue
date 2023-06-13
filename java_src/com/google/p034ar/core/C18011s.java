package com.google.p034ar.core;

import com.google.p034ar.core.ArCoreApk;
import com.google.p034ar.core.exceptions.UnavailableUserDeclinedInstallationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.s */
/* loaded from: classes6.dex */
public final class C18011s {

    /* renamed from: a */
    boolean f73829a = false;

    /* renamed from: b */
    final /* synthetic */ InstallActivity f73830b;

    public C18011s(InstallActivity installActivity) {
        this.f73830b = installActivity;
    }

    /* renamed from: a */
    public final void m48402a(EnumC18012t enumC18012t) {
        boolean z;
        synchronized (this.f73830b) {
            if (this.f73829a) {
                return;
            }
            this.f73830b.lastEvent = enumC18012t;
            EnumC18012t enumC18012t2 = EnumC18012t.ACCEPTED;
            ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
            ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
            int ordinal = enumC18012t.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        z = this.f73830b.waitingForCompletion;
                        if (!z && C18002j.m48414a().f73804b) {
                            this.f73830b.closeInstaller();
                        }
                        this.f73830b.finishWithFailure(null);
                    }
                } else {
                    this.f73830b.finishWithFailure(new UnavailableUserDeclinedInstallationException());
                }
                this.f73829a = true;
            }
        }
    }

    /* renamed from: b */
    public final void m48401b(Exception exc) {
        synchronized (this.f73830b) {
            if (this.f73829a) {
                return;
            }
            this.f73829a = true;
            this.f73830b.lastEvent = EnumC18012t.CANCELLED;
            this.f73830b.finishWithFailure(exc);
        }
    }
}
