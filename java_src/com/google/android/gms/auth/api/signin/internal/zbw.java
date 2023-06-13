package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import p000.AbstractC49506tt2;
/* loaded from: classes5.dex */
final class zbw implements AbstractC49506tt2.InterfaceC28959a<Void> {
    final /* synthetic */ SignInHubActivity zba;

    public /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // p000.AbstractC49506tt2.InterfaceC28959a
    public final C48913st2<Void> onCreateLoader(int i, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // p000.AbstractC49506tt2.InterfaceC28959a
    public final /* bridge */ /* synthetic */ void onLoadFinished(C48913st2<Void> c48913st2, Void r3) {
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(SignInHubActivity.zba(signInHubActivity), SignInHubActivity.zbb(this.zba));
        this.zba.finish();
    }

    @Override // p000.AbstractC49506tt2.InterfaceC28959a
    public final void onLoaderReset(C48913st2<Void> c48913st2) {
    }
}
