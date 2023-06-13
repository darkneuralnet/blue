package p000;

import java.util.concurrent.Callable;
/* renamed from: lp8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC44729lp8 implements Callable {

    /* renamed from: b */
    public final /* synthetic */ String f96781b;

    /* renamed from: c */
    public final /* synthetic */ String f96782c;

    /* renamed from: d */
    public final /* synthetic */ String f96783d;

    /* renamed from: e */
    public final /* synthetic */ BinderC39423cs8 f96784e;

    public CallableC44729lp8(BinderC39423cs8 binderC39423cs8, String str, String str2, String str3) {
        this.f96784e = binderC39423cs8;
        this.f96781b = str;
        this.f96782c = str2;
        this.f96783d = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C42162hV8 c42162hV8;
        C42162hV8 c42162hV82;
        c42162hV8 = this.f96784e.f75753a;
        c42162hV8.m36295b();
        c42162hV82 = this.f96784e.f75753a;
        return c42162hV82.m36300W().m11663a0(this.f96781b, this.f96782c, this.f96783d);
    }
}
