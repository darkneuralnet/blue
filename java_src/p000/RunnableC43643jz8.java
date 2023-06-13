package p000;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: jz8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC43643jz8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f93716b;

    /* renamed from: c */
    public final /* synthetic */ String f93717c;

    /* renamed from: d */
    public final /* synthetic */ String f93718d;

    /* renamed from: e */
    public final /* synthetic */ boolean f93719e;

    /* renamed from: f */
    public final /* synthetic */ RC8 f93720f;

    public RunnableC43643jz8(RC8 rc8, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f93720f = rc8;
        this.f93716b = atomicReference;
        this.f93717c = str2;
        this.f93718d = str3;
        this.f93719e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f93720f.f100966a.m89778L().m88558W(this.f93716b, null, this.f93717c, this.f93718d, this.f93719e);
    }
}
