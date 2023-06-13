package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0088\u0001\b\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"Lc46;", "", "", "h", "(I)Ljava/lang/String;", "", "g", "(I)I", "value", "e", C17296a.f69688o, "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: c46  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38929c46 {

    /* renamed from: a */
    public static final C13386a f60033a = new C13386a(null);

    /* renamed from: b */
    public static final int f60034b = m61962e(0);

    /* renamed from: c */
    public static final int f60035c = m61962e(1);

    /* renamed from: d */
    public static final int f60036d = m61962e(2);

    /* renamed from: e */
    public static final int f60037e = m61962e(3);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m28432d2 = {"Lc46$a;", "", "Lc46;", "Clamp", "I", C17296a.f69688o, "()I", "Repeated", DateTokenConverter.CONVERTER_KEY, "Mirror", "c", "Decal", "b", "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: c46$a */
    /* loaded from: classes.dex */
    public static final class C13386a {
        public /* synthetic */ C13386a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m61958a() {
            return C38929c46.f60034b;
        }

        /* renamed from: b */
        public final int m61957b() {
            return C38929c46.f60037e;
        }

        /* renamed from: c */
        public final int m61956c() {
            return C38929c46.f60036d;
        }

        /* renamed from: d */
        public final int m61955d() {
            return C38929c46.f60035c;
        }

        private C13386a() {
        }
    }

    /* renamed from: e */
    public static int m61962e(int i) {
        return i;
    }

    /* renamed from: f */
    public static final boolean m61961f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m61960g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static String m61959h(int i) {
        if (m61961f(i, f60034b)) {
            return "Clamp";
        }
        if (m61961f(i, f60035c)) {
            return "Repeated";
        }
        if (m61961f(i, f60036d)) {
            return "Mirror";
        }
        if (m61961f(i, f60037e)) {
            return "Decal";
        }
        return "Unknown";
    }
}
