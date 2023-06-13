package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"Ll32;", "", "", "h", "(I)Ljava/lang/String;", "", "g", "(I)I", LegacyRepairType.OTHER_KEY, "", "e", "(ILjava/lang/Object;)Z", C17296a.f69688o, "I", "value", DateTokenConverter.CONVERTER_KEY, "b", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: l32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44269l32 {

    /* renamed from: b */
    public static final C25593a f95397b = new C25593a(null);

    /* renamed from: c */
    public static final int f95398c = m27989d(1);

    /* renamed from: d */
    public static final int f95399d = m27989d(2);

    /* renamed from: a */
    public final int f95400a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, m28432d2 = {"Ll32$a;", "", "Ll32;", "Touch", "I", "b", "()I", "Keyboard", C17296a.f69688o, "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: l32$a */
    /* loaded from: classes.dex */
    public static final class C25593a {
        public /* synthetic */ C25593a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m27983a() {
            return C44269l32.f95399d;
        }

        /* renamed from: b */
        public final int m27982b() {
            return C44269l32.f95398c;
        }

        private C25593a() {
        }
    }

    public /* synthetic */ C44269l32(int i) {
        this.f95400a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C44269l32 m27990c(int i) {
        return new C44269l32(i);
    }

    /* renamed from: d */
    public static int m27989d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m27988e(int i, Object obj) {
        return (obj instanceof C44269l32) && i == ((C44269l32) obj).m27984i();
    }

    /* renamed from: f */
    public static final boolean m27987f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m27986g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static String m27985h(int i) {
        if (m27987f(i, f95398c)) {
            return "Touch";
        }
        if (m27987f(i, f95399d)) {
            return "Keyboard";
        }
        return "Error";
    }

    public boolean equals(Object obj) {
        return m27988e(this.f95400a, obj);
    }

    public int hashCode() {
        return m27986g(this.f95400a);
    }

    /* renamed from: i */
    public final /* synthetic */ int m27984i() {
        return this.f95400a;
    }

    public String toString() {
        return m27985h(this.f95400a);
    }
}
