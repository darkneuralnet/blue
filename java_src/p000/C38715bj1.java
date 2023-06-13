package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"Lbj1;", "", "", "g", "(I)Ljava/lang/String;", "", "f", "(I)I", LegacyRepairType.OTHER_KEY, "", DateTokenConverter.CONVERTER_KEY, "(ILjava/lang/Object;)Z", C17296a.f69688o, "I", "value", "c", "b", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: bj1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38715bj1 {

    /* renamed from: b */
    public static final C12486a f58000b = new C12486a(null);

    /* renamed from: c */
    public static final int f58001c = m64073c(0);

    /* renamed from: d */
    public static final int f58002d = m64073c(1);

    /* renamed from: a */
    public final int f58003a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, m28432d2 = {"Lbj1$a;", "", "Lbj1;", "End", "I", C17296a.f69688o, "()I", "<init>", "()V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bj1$a */
    /* loaded from: classes.dex */
    public static final class C12486a {
        public /* synthetic */ C12486a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m64067a() {
            return C38715bj1.f58002d;
        }

        private C12486a() {
        }
    }

    public /* synthetic */ C38715bj1(int i) {
        this.f58003a = i;
    }

    /* renamed from: b */
    public static final /* synthetic */ C38715bj1 m64074b(int i) {
        return new C38715bj1(i);
    }

    /* renamed from: c */
    public static int m64073c(int i) {
        return i;
    }

    /* renamed from: d */
    public static boolean m64072d(int i, Object obj) {
        return (obj instanceof C38715bj1) && i == ((C38715bj1) obj).m64068h();
    }

    /* renamed from: e */
    public static final boolean m64071e(int i, int i2) {
        return i == i2;
    }

    /* renamed from: f */
    public static int m64070f(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: g */
    public static String m64069g(int i) {
        return m64071e(i, f58001c) ? "FabPosition.Center" : "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return m64072d(this.f58003a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ int m64068h() {
        return this.f58003a;
    }

    public int hashCode() {
        return m64070f(this.f58003a);
    }

    public String toString() {
        return m64069g(this.f58003a);
    }
}
