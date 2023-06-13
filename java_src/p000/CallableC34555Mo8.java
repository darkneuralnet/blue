package p000;

import java.util.concurrent.Callable;
/* renamed from: Mo8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC34555Mo8 implements Callable {

    /* renamed from: b */
    public final /* synthetic */ String f23620b;

    /* renamed from: c */
    public final /* synthetic */ String f23621c;

    /* renamed from: d */
    public final /* synthetic */ String f23622d;

    /* renamed from: e */
    public final /* synthetic */ BinderC39423cs8 f23623e;

    public CallableC34555Mo8(BinderC39423cs8 binderC39423cs8, String str, String str2, String str3) {
        this.f23623e = binderC39423cs8;
        this.f23620b = str;
        this.f23621c = str2;
        this.f23622d = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C42162hV8 c42162hV8;
        C42162hV8 c42162hV82;
        c42162hV8 = this.f23623e.f75753a;
        c42162hV8.m36295b();
        c42162hV82 = this.f23623e.f75753a;
        return c42162hV82.m36300W().m11660d0(this.f23620b, this.f23621c, this.f23622d);
    }
}
