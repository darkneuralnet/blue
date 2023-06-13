package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0088\u0001\b\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"LyX3;", "", "", "i", "(I)Ljava/lang/String;", "", "h", "(I)I", "value", "f", C17296a.f69688o, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: yX3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52254yX3 {

    /* renamed from: a */
    public static final C30613a f119686a = new C30613a(null);

    /* renamed from: b */
    public static final int f119687b = m3356f(0);

    /* renamed from: c */
    public static final int f119688c = m3356f(1);

    /* renamed from: d */
    public static final int f119689d = m3356f(2);

    /* renamed from: e */
    public static final int f119690e = m3356f(3);

    /* renamed from: f */
    public static final int f119691f = m3356f(4);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, m28432d2 = {"LyX3$a;", "", "LyX3;", "Unknown", "I", "e", "()I", "Touch", DateTokenConverter.CONVERTER_KEY, "Mouse", "b", "Stylus", "c", "Eraser", C17296a.f69688o, "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yX3$a */
    /* loaded from: classes.dex */
    public static final class C30613a {
        public /* synthetic */ C30613a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m3352a() {
            return C52254yX3.f119691f;
        }

        /* renamed from: b */
        public final int m3351b() {
            return C52254yX3.f119689d;
        }

        /* renamed from: c */
        public final int m3350c() {
            return C52254yX3.f119690e;
        }

        /* renamed from: d */
        public final int m3349d() {
            return C52254yX3.f119688c;
        }

        /* renamed from: e */
        public final int m3348e() {
            return C52254yX3.f119687b;
        }

        private C30613a() {
        }
    }

    /* renamed from: f */
    public static int m3356f(int i) {
        return i;
    }

    /* renamed from: g */
    public static final boolean m3355g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m3354h(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: i */
    public static String m3353i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }
}
