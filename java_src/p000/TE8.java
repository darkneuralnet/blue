package p000;

import android.os.Bundle;
/* renamed from: TE8 */
/* loaded from: classes6.dex */
public final class TE8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Bundle f35033b;

    /* renamed from: c */
    public final /* synthetic */ C50902wE8 f35034c;

    /* renamed from: d */
    public final /* synthetic */ C50902wE8 f35035d;

    /* renamed from: e */
    public final /* synthetic */ long f35036e;

    /* renamed from: f */
    public final /* synthetic */ C45585nG8 f35037f;

    public TE8(C45585nG8 c45585nG8, Bundle bundle, C50902wE8 c50902wE8, C50902wE8 c50902wE82, long j) {
        this.f35037f = c45585nG8;
        this.f35033b = bundle;
        this.f35034c = c50902wE8;
        this.f35035d = c50902wE82;
        this.f35036e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C45585nG8.m24003t(this.f35037f, this.f35033b, this.f35034c, this.f35035d, this.f35036e);
    }
}
