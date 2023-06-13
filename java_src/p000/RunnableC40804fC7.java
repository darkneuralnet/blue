package p000;
/* renamed from: fC7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC40804fC7 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f79660b;

    /* renamed from: c */
    public final /* synthetic */ long f79661c;

    /* renamed from: d */
    public final /* synthetic */ C38020aY7 f79662d;

    public RunnableC40804fC7(C38020aY7 c38020aY7, String str, long j) {
        this.f79662d = c38020aY7;
        this.f79660b = str;
        this.f79661c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C38020aY7.m71232g(this.f79662d, this.f79660b, this.f79661c);
    }
}
