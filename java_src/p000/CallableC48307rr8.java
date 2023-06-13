package p000;

import java.util.concurrent.Callable;
/* renamed from: rr8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC48307rr8 implements Callable {

    /* renamed from: b */
    public final /* synthetic */ String f107799b;

    /* renamed from: c */
    public final /* synthetic */ BinderC39423cs8 f107800c;

    public CallableC48307rr8(BinderC39423cs8 binderC39423cs8, String str) {
        this.f107800c = binderC39423cs8;
        this.f107799b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C42162hV8 c42162hV8;
        C42162hV8 c42162hV82;
        c42162hV8 = this.f107800c.f75753a;
        c42162hV8.m36295b();
        c42162hV82 = this.f107800c.f75753a;
        return c42162hV82.m36300W().m11661c0(this.f107799b);
    }
}
