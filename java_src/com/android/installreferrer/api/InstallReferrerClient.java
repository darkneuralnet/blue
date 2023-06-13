package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
/* loaded from: classes4.dex */
public abstract class InstallReferrerClient {

    /* renamed from: com.android.installreferrer.api.InstallReferrerClient$b */
    /* loaded from: classes4.dex */
    public static final class C16934b {

        /* renamed from: a */
        public final Context f68609a;

        @UiThread
        /* renamed from: a */
        public InstallReferrerClient m53510a() {
            Context context = this.f68609a;
            if (context != null) {
                return new U42(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        public C16934b(Context context) {
            this.f68609a = context;
        }
    }

    @UiThread
    /* renamed from: b */
    public static C16934b m53512b(@NonNull Context context) {
        return new C16934b(context);
    }

    @UiThread
    /* renamed from: a */
    public abstract ReferrerDetails mo53513a() throws RemoteException;

    @UiThread
    /* renamed from: c */
    public abstract void mo53511c(@NonNull InstallReferrerStateListener installReferrerStateListener);
}
