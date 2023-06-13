package p000;

import java.util.concurrent.Callable;
/* renamed from: xp8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC51843xp8 implements Callable {

    /* renamed from: b */
    public final /* synthetic */ String f118200b;

    /* renamed from: c */
    public final /* synthetic */ String f118201c;

    /* renamed from: d */
    public final /* synthetic */ String f118202d;

    /* renamed from: e */
    public final /* synthetic */ BinderC39423cs8 f118203e;

    public CallableC51843xp8(BinderC39423cs8 binderC39423cs8, String str, String str2, String str3) {
        this.f118203e = binderC39423cs8;
        this.f118200b = str;
        this.f118201c = str2;
        this.f118202d = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C42162hV8 c42162hV8;
        C42162hV8 c42162hV82;
        c42162hV8 = this.f118203e.f75753a;
        c42162hV8.m36295b();
        c42162hV82 = this.f118203e.f75753a;
        return c42162hV82.m36300W().m11663a0(this.f118200b, this.f118201c, this.f118202d);
    }
}
