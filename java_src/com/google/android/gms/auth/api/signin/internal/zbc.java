package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public final class zbc extends AbstractC25501kp<Void> implements SignInConnectionListener {
    private final Semaphore zba;
    private final Set<GoogleApiClient> zbb;

    public zbc(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.zba = new Semaphore(0);
        this.zbb = set;
    }

    @Override // p000.AbstractC25501kp
    public final /* bridge */ /* synthetic */ Void loadInBackground() {
        int i = 0;
        for (GoogleApiClient googleApiClient : this.zbb) {
            if (googleApiClient.maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.zba.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.zba.release();
    }

    @Override // p000.C48913st2
    public final void onStartLoading() {
        this.zba.drainPermits();
        forceLoad();
    }
}