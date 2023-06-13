package p000;

import java.util.concurrent.Callable;
/* renamed from: Zo8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC37597Zo8 implements Callable {

    /* renamed from: b */
    public final /* synthetic */ String f49284b;

    /* renamed from: c */
    public final /* synthetic */ String f49285c;

    /* renamed from: d */
    public final /* synthetic */ String f49286d;

    /* renamed from: e */
    public final /* synthetic */ BinderC39423cs8 f49287e;

    public CallableC37597Zo8(BinderC39423cs8 binderC39423cs8, String str, String str2, String str3) {
        this.f49287e = binderC39423cs8;
        this.f49284b = str;
        this.f49285c = str2;
        this.f49286d = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C42162hV8 c42162hV8;
        C42162hV8 c42162hV82;
        c42162hV8 = this.f49287e.f75753a;
        c42162hV8.m36295b();
        c42162hV82 = this.f49287e.f75753a;
        return c42162hV82.m36300W().m11660d0(this.f49284b, this.f49285c, this.f49286d);
    }
}
