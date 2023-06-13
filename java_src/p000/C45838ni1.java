package p000;
/* renamed from: ni1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45838ni1 {

    /* renamed from: a */
    public final boolean f100366a;

    /* renamed from: b */
    public final ES0 f100367b;

    /* renamed from: c */
    public final ES0 f100368c;

    /* renamed from: d */
    public final C45285mm1 f100369d;

    public C45838ni1(ES0 es0, ES0 es02, C45285mm1 c45285mm1, boolean z) {
        this.f100367b = es0;
        this.f100368c = es02;
        this.f100369d = c45285mm1;
        this.f100366a = z;
    }

    /* renamed from: a */
    public static boolean m23288a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    public static int m23284e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: b */
    public C45285mm1 m23287b() {
        return this.f100369d;
    }

    /* renamed from: c */
    public ES0 m23286c() {
        return this.f100367b;
    }

    /* renamed from: d */
    public ES0 m23285d() {
        return this.f100368c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C45838ni1)) {
            return false;
        }
        C45838ni1 c45838ni1 = (C45838ni1) obj;
        if (!m23288a(this.f100367b, c45838ni1.f100367b) || !m23288a(this.f100368c, c45838ni1.f100368c) || !m23288a(this.f100369d, c45838ni1.f100369d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m23283f() {
        return this.f100368c == null;
    }

    public int hashCode() {
        return (m23284e(this.f100367b) ^ m23284e(this.f100368c)) ^ m23284e(this.f100369d);
    }

    public String toString() {
        Object valueOf;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f100367b);
        sb.append(" , ");
        sb.append(this.f100368c);
        sb.append(" : ");
        C45285mm1 c45285mm1 = this.f100369d;
        if (c45285mm1 == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(c45285mm1.m25033c());
        }
        sb.append(valueOf);
        sb.append(" ]");
        return sb.toString();
    }
}
