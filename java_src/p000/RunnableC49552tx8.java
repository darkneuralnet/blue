package p000;

import android.os.Bundle;
/* renamed from: tx8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC49552tx8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f111410b;

    /* renamed from: c */
    public final /* synthetic */ String f111411c;

    /* renamed from: d */
    public final /* synthetic */ long f111412d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f111413e;

    /* renamed from: f */
    public final /* synthetic */ boolean f111414f;

    /* renamed from: g */
    public final /* synthetic */ boolean f111415g;

    /* renamed from: h */
    public final /* synthetic */ boolean f111416h;

    /* renamed from: i */
    public final /* synthetic */ String f111417i;

    /* renamed from: j */
    public final /* synthetic */ RC8 f111418j;

    public RunnableC49552tx8(RC8 rc8, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f111418j = rc8;
        this.f111410b = str;
        this.f111411c = str2;
        this.f111412d = j;
        this.f111413e = bundle;
        this.f111414f = z;
        this.f111415g = z2;
        this.f111416h = z3;
        this.f111417i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f111418j.m87155t(this.f111410b, this.f111411c, this.f111412d, this.f111413e, this.f111414f, this.f111415g, this.f111416h, this.f111417i);
    }
}
