package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\rB\u0012\u0012\u0006\u0010\u000f\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0088\u0001\u000f\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"LO26;", "", "", "i", "(J)Ljava/lang/String;", "", "h", "(J)I", LegacyRepairType.OTHER_KEY, "", "f", "(JLjava/lang/Object;)Z", "", C17296a.f69688o, "J", "type", "e", "(J)J", "b", "ui-unit_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: O26 */
/* loaded from: classes.dex */
public final class O26 {

    /* renamed from: b */
    public static final C5817a f25571b = new C5817a(null);

    /* renamed from: c */
    public static final long f25572c = m92977e(0);

    /* renamed from: d */
    public static final long f25573d = m92977e(4294967296L);

    /* renamed from: e */
    public static final long f25574e = m92977e(8589934592L);

    /* renamed from: a */
    public final long f25575a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, m28432d2 = {"LO26$a;", "", "LO26;", "Unspecified", "J", "c", "()J", "Sp", "b", "Em", C17296a.f69688o, "<init>", "()V", "ui-unit_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: O26$a */
    /* loaded from: classes.dex */
    public static final class C5817a {
        public /* synthetic */ C5817a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m92971a() {
            return O26.f25574e;
        }

        /* renamed from: b */
        public final long m92970b() {
            return O26.f25573d;
        }

        /* renamed from: c */
        public final long m92969c() {
            return O26.f25572c;
        }

        private C5817a() {
        }
    }

    public /* synthetic */ O26(long j) {
        this.f25575a = j;
    }

    /* renamed from: d */
    public static final /* synthetic */ O26 m92978d(long j) {
        return new O26(j);
    }

    /* renamed from: e */
    public static long m92977e(long j) {
        return j;
    }

    /* renamed from: f */
    public static boolean m92976f(long j, Object obj) {
        return (obj instanceof O26) && j == ((O26) obj).m92972j();
    }

    /* renamed from: g */
    public static final boolean m92975g(long j, long j2) {
        return j == j2;
    }

    /* renamed from: h */
    public static int m92974h(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: i */
    public static String m92973i(long j) {
        if (m92975g(j, f25572c)) {
            return "Unspecified";
        }
        if (m92975g(j, f25573d)) {
            return "Sp";
        }
        if (m92975g(j, f25574e)) {
            return "Em";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m92976f(this.f25575a, obj);
    }

    public int hashCode() {
        return m92974h(this.f25575a);
    }

    /* renamed from: j */
    public final /* synthetic */ long m92972j() {
        return this.f25575a;
    }

    public String toString() {
        return m92973i(this.f25575a);
    }
}
