package p000;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: Ly8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC34411Ly8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f22375b;

    /* renamed from: c */
    public final /* synthetic */ String f22376c;

    /* renamed from: d */
    public final /* synthetic */ String f22377d;

    /* renamed from: e */
    public final /* synthetic */ RC8 f22378e;

    public RunnableC34411Ly8(RC8 rc8, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f22378e = rc8;
        this.f22375b = atomicReference;
        this.f22376c = str2;
        this.f22377d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22378e.f100966a.m89778L().m88560U(this.f22375b, null, this.f22376c, this.f22377d);
    }
}
