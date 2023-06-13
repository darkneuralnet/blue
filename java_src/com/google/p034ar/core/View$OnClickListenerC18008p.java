package com.google.p034ar.core;

import android.view.View;
import com.google.p034ar.core.exceptions.UnavailableUserDeclinedInstallationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.p */
/* loaded from: classes6.dex */
public final class View$OnClickListenerC18008p implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ InstallActivity f73822a;

    /* renamed from: b */
    private final /* synthetic */ int f73823b;

    public View$OnClickListenerC18008p(InstallActivity installActivity, int i) {
        this.f73823b = i;
        this.f73822a = installActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f73823b != 0) {
            this.f73822a.finishWithFailure(new UnavailableUserDeclinedInstallationException());
            return;
        }
        this.f73822a.animateToSpinner();
        this.f73822a.startInstaller();
    }
}
