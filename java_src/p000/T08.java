package p000;

import java.io.Serializable;
/* renamed from: T08 */
/* loaded from: classes5.dex */
public final class T08<T> implements Serializable, G08 {

    /* renamed from: b */
    public final G08<T> f34622b;

    /* renamed from: c */
    public volatile transient boolean f34623c;

    /* renamed from: d */
    public transient T f34624d;

    public T08(G08<T> g08) {
        g08.getClass();
        this.f34622b = g08;
    }

    public final String toString() {
        Object obj;
        if (this.f34623c) {
            String valueOf = String.valueOf(this.f34624d);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f34622b;
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
        if (!this.f34623c) {
            synchronized (this) {
                if (!this.f34623c) {
                    T zza = this.f34622b.zza();
                    this.f34624d = zza;
                    this.f34623c = true;
                    return zza;
                }
            }
        }
        return this.f34624d;
    }
}
