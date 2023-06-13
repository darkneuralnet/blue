package p000;
/* renamed from: oa9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC46359oa9<V> extends AbstractC43683k39<V> implements Runnable {

    /* renamed from: i */
    public Mb9<V> f102160i;

    public RunnableC46359oa9(Mb9<V> mb9) {
        this.f102160i = mb9;
    }

    @Override // p000.AbstractC50204v39
    /* renamed from: e */
    public final String mo9253e() {
        Mb9<V> mb9 = this.f102160i;
        if (mb9 != null) {
            String valueOf = String.valueOf(mb9);
            StringBuilder sb = new StringBuilder(valueOf.length() + 11);
            sb.append("delegate=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        return null;
    }

    @Override // p000.AbstractC50204v39
    /* renamed from: f */
    public final void mo9252f() {
        this.f102160i = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Mb9<V> mb9 = this.f102160i;
        if (mb9 != null) {
            mo9251g(mb9);
        }
    }
}
