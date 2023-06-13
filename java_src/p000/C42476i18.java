package p000;
/* renamed from: i18  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42476i18<T> implements G08<T> {

    /* renamed from: b */
    public volatile G08<T> f86290b;

    /* renamed from: c */
    public volatile boolean f86291c;

    /* renamed from: d */
    public T f86292d;

    public C42476i18(G08<T> g08) {
        g08.getClass();
        this.f86290b = g08;
    }

    public final String toString() {
        Object obj = this.f86290b;
        if (obj == null) {
            String valueOf = String.valueOf(this.f86292d);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // p000.G08
    public final T zza() {
        if (!this.f86291c) {
            synchronized (this) {
                if (!this.f86291c) {
                    G08<T> g08 = this.f86290b;
                    g08.getClass();
                    T zza = g08.zza();
                    this.f86292d = zza;
                    this.f86291c = true;
                    this.f86290b = null;
                    return zza;
                }
            }
        }
        return this.f86292d;
    }
}
