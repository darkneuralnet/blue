package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"LNS5;", "", "", "i", "(I)Ljava/lang/String;", "", "h", "(I)I", LegacyRepairType.OTHER_KEY, "", "f", "(ILjava/lang/Object;)Z", C17296a.f69688o, "I", "value", "e", "b", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: NS5 */
/* loaded from: classes.dex */
public final class NS5 {

    /* renamed from: b */
    public static final C5579a f24612b = new C5579a(null);

    /* renamed from: c */
    public static final int f24613c = m93885e(0);

    /* renamed from: d */
    public static final int f24614d = m93885e(1);

    /* renamed from: e */
    public static final int f24615e = m93885e(2);

    /* renamed from: a */
    public final int f24616a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, m28432d2 = {"LNS5$a;", "", "LNS5;", "Miter", "I", "b", "()I", "Round", "c", "Bevel", C17296a.f69688o, "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: NS5$a */
    /* loaded from: classes.dex */
    public static final class C5579a {
        public /* synthetic */ C5579a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m93879a() {
            return NS5.f24615e;
        }

        /* renamed from: b */
        public final int m93878b() {
            return NS5.f24613c;
        }

        /* renamed from: c */
        public final int m93877c() {
            return NS5.f24614d;
        }

        private C5579a() {
        }
    }

    public /* synthetic */ NS5(int i) {
        this.f24616a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ NS5 m93886d(int i) {
        return new NS5(i);
    }

    /* renamed from: e */
    public static int m93885e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m93884f(int i, Object obj) {
        return (obj instanceof NS5) && i == ((NS5) obj).m93880j();
    }

    /* renamed from: g */
    public static final boolean m93883g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m93882h(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: i */
    public static String m93881i(int i) {
        if (m93883g(i, f24613c)) {
            return "Miter";
        }
        if (m93883g(i, f24614d)) {
            return "Round";
        }
        if (m93883g(i, f24615e)) {
            return "Bevel";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m93884f(this.f24616a, obj);
    }

    public int hashCode() {
        return m93882h(this.f24616a);
    }

    /* renamed from: j */
    public final /* synthetic */ int m93880j() {
        return this.f24616a;
    }

    public String toString() {
        return m93881i(this.f24616a);
    }
}
