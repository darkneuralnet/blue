package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0010\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"LEw1;", "", "", "h", "(I)Ljava/lang/String;", "", "g", "(I)I", LegacyRepairType.OTHER_KEY, "", "e", "(ILjava/lang/Object;)Z", C17296a.f69688o, "I", "getValue", "()I", "value", DateTokenConverter.CONVERTER_KEY, "b", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: Ew1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32748Ew1 {

    /* renamed from: b */
    public static final C2023a f8309b = new C2023a(null);

    /* renamed from: c */
    public static final int f8310c = m108208d(0);

    /* renamed from: d */
    public static final int f8311d = m108208d(1);

    /* renamed from: a */
    public final int f8312a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, m28432d2 = {"LEw1$a;", "", "LEw1;", "Normal", "I", "b", "()I", "Italic", C17296a.f69688o, "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ew1$a */
    /* loaded from: classes.dex */
    public static final class C2023a {
        public /* synthetic */ C2023a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m108202a() {
            return C32748Ew1.f8311d;
        }

        /* renamed from: b */
        public final int m108201b() {
            return C32748Ew1.f8310c;
        }

        private C2023a() {
        }
    }

    public /* synthetic */ C32748Ew1(int i) {
        this.f8312a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C32748Ew1 m108209c(int i) {
        return new C32748Ew1(i);
    }

    /* renamed from: d */
    public static int m108208d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m108207e(int i, Object obj) {
        return (obj instanceof C32748Ew1) && i == ((C32748Ew1) obj).m108203i();
    }

    /* renamed from: f */
    public static final boolean m108206f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m108205g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static String m108204h(int i) {
        if (m108206f(i, f8310c)) {
            return "Normal";
        }
        if (m108206f(i, f8311d)) {
            return "Italic";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m108207e(this.f8312a, obj);
    }

    public int hashCode() {
        return m108205g(this.f8312a);
    }

    /* renamed from: i */
    public final /* synthetic */ int m108203i() {
        return this.f8312a;
    }

    public String toString() {
        return m108204h(this.f8312a);
    }
}
