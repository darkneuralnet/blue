package p000;

import java.io.Serializable;
/* renamed from: XD8 */
/* loaded from: classes5.dex */
public final class XD8 implements Serializable, LD8 {

    /* renamed from: b */
    public final LD8 f42904b;

    /* renamed from: c */
    public volatile transient boolean f42905c;

    /* renamed from: d */
    public transient Object f42906d;

    public XD8(LD8 ld8) {
        ld8.getClass();
        this.f42904b = ld8;
    }

    public final String toString() {
        Object obj;
        if (this.f42905c) {
            obj = "<supplier that returned " + String.valueOf(this.f42906d) + ">";
        } else {
            obj = this.f42904b;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // p000.LD8
    public final Object zza() {
        if (!this.f42905c) {
            synchronized (this) {
                if (!this.f42905c) {
                    Object zza = this.f42904b.zza();
                    this.f42906d = zza;
                    this.f42905c = true;
                    return zza;
                }
            }
        }
        return this.f42906d;
    }
}
