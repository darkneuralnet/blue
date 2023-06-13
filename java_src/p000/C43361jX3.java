package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B^\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\n\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010D\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\bE\u0010FBr\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\n\u0012\u0006\u0010>\u001a\u00020/\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010D\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0014\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\bE\u0010GBh\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\n\u0012\u0006\u0010>\u001a\u00020/\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010D\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\bE\u0010HJ\u0006\u0010\u0003\u001a\u00020\u0002J}\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0014\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR \u0010 \u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010%\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010'\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b&\u0010\u001bR \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b(\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b)\u0010$R \u0010\u0010\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0014\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b.\u0010\u001bR\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00100R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00102R*\u0010;\u001a\u0002042\u0006\u00105\u001a\u0002048\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b,\u00106\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108R\u001a\u0010>\u001a\u00020/8GX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010:\u001a\u0004\b*\u0010<R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118GX\u0087\u0004¢\u0006\f\u0012\u0004\b@\u0010:\u001a\u0004\b!\u0010?R\u0017\u0010C\u001a\u00020\n8F¢\u0006\f\u0012\u0004\bB\u0010:\u001a\u0004\bA\u0010$\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006I"}, m28432d2 = {"LjX3;", "", "", C17296a.f69688o, "LiX3;", "id", "", "currentTime", "LCe3;", "currentPosition", "", "currentPressed", "previousTime", "previousPosition", "previousPressed", "LyX3;", "type", "", "LPM1;", "historical", "scrollDelta", "b", "(JJJZJJZILjava/util/List;J)LjX3;", "", "toString", "J", "e", "()J", "m", "uptimeMillis", "c", "f", "position", DateTokenConverter.CONVERTER_KEY, "Z", "g", "()Z", "pressed", "getPreviousUptimeMillis", "previousUptimeMillis", "i", "j", "h", "I", "l", "()I", "k", "", "Ljava/lang/Float;", "_pressure", "Ljava/util/List;", "_historical", "Lqz0;", "<set-?>", "Lqz0;", "getConsumed", "()Lqz0;", "getConsumed$annotations", "()V", "consumed", "()F", "getPressure$annotations", "pressure", "()Ljava/util/List;", "getHistorical$annotations", "n", "isConsumed$annotations", "isConsumed", "isInitiallyConsumed", "<init>", "(JJJZJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZFJJZZILjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jX3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43361jX3 {

    /* renamed from: a */
    public final long f92901a;

    /* renamed from: b */
    public final long f92902b;

    /* renamed from: c */
    public final long f92903c;

    /* renamed from: d */
    public final boolean f92904d;

    /* renamed from: e */
    public final long f92905e;

    /* renamed from: f */
    public final long f92906f;

    /* renamed from: g */
    public final boolean f92907g;

    /* renamed from: h */
    public final int f92908h;

    /* renamed from: i */
    public final long f92909i;

    /* renamed from: j */
    public Float f92910j;

    /* renamed from: k */
    public List<PM1> f92911k;

    /* renamed from: l */
    public C47786qz0 f92912l;

    public /* synthetic */ C43361jX3(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6);
    }

    /* renamed from: c */
    public static /* synthetic */ C43361jX3 m30362c(C43361jX3 c43361jX3, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        long j10;
        long j11;
        boolean z4;
        int i3;
        long j12;
        if ((i2 & 1) != 0) {
            j7 = c43361jX3.f92901a;
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = c43361jX3.f92902b;
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = c43361jX3.f92903c;
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            z3 = c43361jX3.f92904d;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            j10 = c43361jX3.f92905e;
        } else {
            j10 = j4;
        }
        if ((i2 & 32) != 0) {
            j11 = c43361jX3.f92906f;
        } else {
            j11 = j5;
        }
        if ((i2 & 64) != 0) {
            z4 = c43361jX3.f92907g;
        } else {
            z4 = z2;
        }
        if ((i2 & 128) != 0) {
            i3 = c43361jX3.f92908h;
        } else {
            i3 = i;
        }
        int i4 = i3;
        if ((i2 & 512) != 0) {
            j12 = c43361jX3.f92909i;
        } else {
            j12 = j6;
        }
        return c43361jX3.m30363b(j7, j8, j9, z3, j10, j11, z4, i4, list, j12);
    }

    /* renamed from: a */
    public final void m30364a() {
        this.f92912l.m16709c(true);
        this.f92912l.m16708d(true);
    }

    /* renamed from: b */
    public final C43361jX3 m30363b(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List<PM1> historical, long j6) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        C43361jX3 c43361jX3 = new C43361jX3(j, j2, j3, z, m30357h(), j4, j5, z2, false, i, (List) historical, j6, (DefaultConstructorMarker) null);
        c43361jX3.f92912l = this.f92912l;
        return c43361jX3;
    }

    /* renamed from: d */
    public final List<PM1> m30361d() {
        List<PM1> emptyList;
        List<PM1> list = this.f92911k;
        if (list == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return list;
    }

    /* renamed from: e */
    public final long m30360e() {
        return this.f92901a;
    }

    /* renamed from: f */
    public final long m30359f() {
        return this.f92903c;
    }

    /* renamed from: g */
    public final boolean m30358g() {
        return this.f92904d;
    }

    /* renamed from: h */
    public final float m30357h() {
        Float f = this.f92910j;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* renamed from: i */
    public final long m30356i() {
        return this.f92906f;
    }

    /* renamed from: j */
    public final boolean m30355j() {
        return this.f92907g;
    }

    /* renamed from: k */
    public final long m30354k() {
        return this.f92909i;
    }

    /* renamed from: l */
    public final int m30353l() {
        return this.f92908h;
    }

    /* renamed from: m */
    public final long m30352m() {
        return this.f92902b;
    }

    /* renamed from: n */
    public final boolean m30351n() {
        return this.f92912l.m16711a() || this.f92912l.m16710b();
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) C42768iX3.m33832f(this.f92901a)) + ", uptimeMillis=" + this.f92902b + ", position=" + ((Object) C32120Ce3.m111937v(this.f92903c)) + ", pressed=" + this.f92904d + ", pressure=" + m30357h() + ", previousUptimeMillis=" + this.f92905e + ", previousPosition=" + ((Object) C32120Ce3.m111937v(this.f92906f)) + ", previousPressed=" + this.f92907g + ", isConsumed=" + m30351n() + ", type=" + ((Object) C52254yX3.m3353i(this.f92908h)) + ", historical=" + m30361d() + ",scrollDelta=" + ((Object) C32120Ce3.m111937v(this.f92909i)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ C43361jX3(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, list, j6);
    }

    public /* synthetic */ C43361jX3(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6);
    }

    public C43361jX3(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.f92901a = j;
        this.f92902b = j2;
        this.f92903c = j3;
        this.f92904d = z;
        this.f92905e = j4;
        this.f92906f = j5;
        this.f92907g = z2;
        this.f92908h = i;
        this.f92909i = j6;
        this.f92912l = new C47786qz0(z3, z3);
    }

    public C43361jX3(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List<PM1> list, long j6) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, (DefaultConstructorMarker) null);
        this.f92911k = list;
    }

    public /* synthetic */ C43361jX3(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, (i2 & 512) != 0 ? C52254yX3.f119686a.m3349d() : i, (i2 & 1024) != 0 ? C32120Ce3.f4427b.m111932c() : j6, (DefaultConstructorMarker) null);
    }

    public C43361jX3(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6, (DefaultConstructorMarker) null);
        this.f92910j = Float.valueOf(f);
    }
}
