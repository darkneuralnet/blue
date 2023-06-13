package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0088\u0001\b\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"LRl1;", "", "", "f", "(I)Ljava/lang/String;", "", "e", "(I)I", "value", "c", C17296a.f69688o, "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: Rl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35691Rl1 {

    /* renamed from: a */
    public static final C7267a f32551a = new C7267a(null);

    /* renamed from: b */
    public static final int f32552b = m86332c(0);

    /* renamed from: c */
    public static final int f32553c = m86332c(1);

    /* renamed from: d */
    public static final int f32554d = m86332c(2);

    /* renamed from: e */
    public static final int f32555e = m86332c(3);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, m28432d2 = {"LRl1$a;", "", "LRl1;", "None", "I", "b", "()I", "Low", C17296a.f69688o, "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Rl1$a */
    /* loaded from: classes.dex */
    public static final class C7267a {
        public /* synthetic */ C7267a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m86328a() {
            return C35691Rl1.f32553c;
        }

        /* renamed from: b */
        public final int m86327b() {
            return C35691Rl1.f32552b;
        }

        private C7267a() {
        }
    }

    /* renamed from: c */
    public static int m86332c(int i) {
        return i;
    }

    /* renamed from: d */
    public static final boolean m86331d(int i, int i2) {
        return i == i2;
    }

    /* renamed from: e */
    public static int m86330e(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: f */
    public static String m86329f(int i) {
        if (m86331d(i, f32552b)) {
            return "None";
        }
        if (m86331d(i, f32553c)) {
            return "Low";
        }
        if (m86331d(i, f32554d)) {
            return "Medium";
        }
        if (m86331d(i, f32555e)) {
            return "High";
        }
        return "Unknown";
    }
}
