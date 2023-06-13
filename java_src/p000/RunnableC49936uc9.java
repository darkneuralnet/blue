package p000;
/* renamed from: uc9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC49936uc9 extends AbstractC43683k39<Void> implements Runnable {

    /* renamed from: i */
    public final Runnable f112671i;

    public RunnableC49936uc9(Runnable runnable) {
        runnable.getClass();
        this.f112671i = runnable;
    }

    @Override // p000.AbstractC50204v39
    /* renamed from: e */
    public final String mo9253e() {
        String valueOf = String.valueOf(this.f112671i);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f112671i.run();
        } catch (Throwable th) {
            m9234x(th);
            CM8.m112290a(th);
            throw new RuntimeException(th);
        }
    }
}
