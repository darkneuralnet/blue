package p000;

import com.google.android.gms.internal.places.C17527a;
import com.google.android.gms.internal.places.zzbk;
/* renamed from: eM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C40301eM7 {

    /* renamed from: d */
    public static final C17527a f78278d = C17527a.m51231b();

    /* renamed from: a */
    public AbstractC43604jv9 f78279a;

    /* renamed from: b */
    public volatile InterfaceC52815zT7 f78280b;

    /* renamed from: c */
    public volatile AbstractC43604jv9 f78281c;

    /* renamed from: a */
    public final int m42997a() {
        if (this.f78281c != null) {
            return this.f78281c.size();
        }
        if (this.f78280b != null) {
            return this.f78280b.mo1329g();
        }
        return 0;
    }

    /* renamed from: b */
    public final InterfaceC52815zT7 m42996b(InterfaceC52815zT7 interfaceC52815zT7) {
        if (this.f78280b == null) {
            synchronized (this) {
                if (this.f78280b == null) {
                    try {
                        this.f78280b = interfaceC52815zT7;
                        this.f78281c = AbstractC43604jv9.f93538c;
                    } catch (zzbk unused) {
                        this.f78280b = interfaceC52815zT7;
                        this.f78281c = AbstractC43604jv9.f93538c;
                    }
                }
            }
        }
        return this.f78280b;
    }

    /* renamed from: c */
    public final InterfaceC52815zT7 m42995c(InterfaceC52815zT7 interfaceC52815zT7) {
        InterfaceC52815zT7 interfaceC52815zT72 = this.f78280b;
        this.f78279a = null;
        this.f78281c = null;
        this.f78280b = interfaceC52815zT7;
        return interfaceC52815zT72;
    }

    /* renamed from: d */
    public final AbstractC43604jv9 m42994d() {
        if (this.f78281c != null) {
            return this.f78281c;
        }
        synchronized (this) {
            if (this.f78281c != null) {
                return this.f78281c;
            }
            if (this.f78280b == null) {
                this.f78281c = AbstractC43604jv9.f93538c;
            } else {
                this.f78281c = this.f78280b.zzv();
            }
            return this.f78281c;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40301eM7)) {
            return false;
        }
        C40301eM7 c40301eM7 = (C40301eM7) obj;
        InterfaceC52815zT7 interfaceC52815zT7 = this.f78280b;
        InterfaceC52815zT7 interfaceC52815zT72 = c40301eM7.f78280b;
        if (interfaceC52815zT7 == null && interfaceC52815zT72 == null) {
            return m42994d().equals(c40301eM7.m42994d());
        }
        if (interfaceC52815zT7 != null && interfaceC52815zT72 != null) {
            return interfaceC52815zT7.equals(interfaceC52815zT72);
        }
        if (interfaceC52815zT7 != null) {
            return interfaceC52815zT7.equals(c40301eM7.m42996b(interfaceC52815zT7.mo51219d()));
        }
        return m42996b(interfaceC52815zT72.mo51219d()).equals(interfaceC52815zT72);
    }

    public int hashCode() {
        return 1;
    }
}
