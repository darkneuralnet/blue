package p000;

import androidx.work.WorkerParameters;
/* renamed from: lP5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC44477lP5 implements Runnable {

    /* renamed from: b */
    public C37830aD6 f96160b;

    /* renamed from: c */
    public C42698iP5 f96161c;

    /* renamed from: d */
    public WorkerParameters.C12119a f96162d;

    public RunnableC44477lP5(C37830aD6 c37830aD6, C42698iP5 c42698iP5, WorkerParameters.C12119a c12119a) {
        this.f96160b = c37830aD6;
        this.f96161c = c42698iP5;
        this.f96162d = c12119a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f96160b.m71759r().m34412q(this.f96161c, this.f96162d);
    }
}
