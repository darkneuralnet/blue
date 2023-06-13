package p000;

import com.google.android.gms.internal.vision.C17551E;
import com.google.android.gms.internal.vision.zzjk;
/* renamed from: IL8 */
/* loaded from: classes6.dex */
public class IL8 {

    /* renamed from: d */
    public static final C17551E f15388d = C17551E.m50997b();

    /* renamed from: a */
    public AbstractC53119zy8 f15389a;

    /* renamed from: b */
    public volatile InterfaceC44489lQ8 f15390b;

    /* renamed from: c */
    public volatile AbstractC53119zy8 f15391c;

    /* renamed from: a */
    public final InterfaceC44489lQ8 m102465a(InterfaceC44489lQ8 interfaceC44489lQ8) {
        InterfaceC44489lQ8 interfaceC44489lQ82 = this.f15390b;
        this.f15389a = null;
        this.f15391c = null;
        this.f15390b = interfaceC44489lQ8;
        return interfaceC44489lQ82;
    }

    /* renamed from: b */
    public final int m102464b() {
        if (this.f15391c != null) {
            return this.f15391c.mo44b();
        }
        if (this.f15390b != null) {
            return this.f15390b.mo27298b();
        }
        return 0;
    }

    /* renamed from: c */
    public final InterfaceC44489lQ8 m102463c(InterfaceC44489lQ8 interfaceC44489lQ8) {
        if (this.f15390b == null) {
            synchronized (this) {
                if (this.f15390b == null) {
                    try {
                        this.f15390b = interfaceC44489lQ8;
                        this.f15391c = AbstractC53119zy8.f122544c;
                    } catch (zzjk unused) {
                        this.f15390b = interfaceC44489lQ8;
                        this.f15391c = AbstractC53119zy8.f122544c;
                    }
                }
            }
        }
        return this.f15390b;
    }

    /* renamed from: d */
    public final AbstractC53119zy8 m102462d() {
        if (this.f15391c != null) {
            return this.f15391c;
        }
        synchronized (this) {
            if (this.f15391c != null) {
                return this.f15391c;
            }
            if (this.f15390b == null) {
                this.f15391c = AbstractC53119zy8.f122544c;
            } else {
                this.f15391c = this.f15390b.zzg();
            }
            return this.f15391c;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IL8)) {
            return false;
        }
        IL8 il8 = (IL8) obj;
        InterfaceC44489lQ8 interfaceC44489lQ8 = this.f15390b;
        InterfaceC44489lQ8 interfaceC44489lQ82 = il8.f15390b;
        if (interfaceC44489lQ8 == null && interfaceC44489lQ82 == null) {
            return m102462d().equals(il8.m102462d());
        }
        if (interfaceC44489lQ8 != null && interfaceC44489lQ82 != null) {
            return interfaceC44489lQ8.equals(interfaceC44489lQ82);
        }
        if (interfaceC44489lQ8 != null) {
            return interfaceC44489lQ8.equals(il8.m102463c(interfaceC44489lQ8.mo50980k()));
        }
        return m102463c(interfaceC44489lQ82.mo50980k()).equals(interfaceC44489lQ82);
    }

    public int hashCode() {
        return 1;
    }
}
