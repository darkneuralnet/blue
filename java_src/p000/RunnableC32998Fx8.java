package p000;
/* renamed from: Fx8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC32998Fx8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f10588b;

    /* renamed from: c */
    public final /* synthetic */ String f10589c;

    /* renamed from: d */
    public final /* synthetic */ Object f10590d;

    /* renamed from: e */
    public final /* synthetic */ long f10591e;

    /* renamed from: f */
    public final /* synthetic */ RC8 f10592f;

    public RunnableC32998Fx8(RC8 rc8, String str, String str2, Object obj, long j) {
        this.f10592f = rc8;
        this.f10588b = str;
        this.f10589c = str2;
        this.f10590d = obj;
        this.f10591e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10592f.m87183M(this.f10588b, this.f10589c, this.f10590d, this.f10591e);
    }
}
