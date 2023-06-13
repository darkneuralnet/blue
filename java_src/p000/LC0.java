package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0014\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\n\u0088\u0001\u0012\u0092\u0001\u00020\u0011ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"LLC0;", "", "", "g", "(J)Ljava/lang/String;", "", "f", "(J)I", "", DateTokenConverter.CONVERTER_KEY, "(J)F", "getX$annotations", "()V", "x", "e", "getY$annotations", "y", "", "packedValue", "b", "(J)J", C17296a.f69688o, "ui-geometry_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,164:1\n34#2:165\n41#2:166\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n49#1:165\n53#1:166\n*E\n"})
/* renamed from: LC0 */
/* loaded from: classes.dex */
public final class LC0 {

    /* renamed from: a */
    public static final C4759a f20887a = new C4759a(null);

    /* renamed from: b */
    public static final long f20888b = MC0.m95598b(0.0f, 0.0f, 2, null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m28432d2 = {"LLC0$a;", "", "LLC0;", "Zero", "J", C17296a.f69688o, "()J", "getZero-kKHJgLs$annotations", "()V", "<init>", "ui-geometry_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: LC0$a */
    /* loaded from: classes.dex */
    public static final class C4759a {
        public /* synthetic */ C4759a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m97597a() {
            return LC0.f20888b;
        }

        private C4759a() {
        }
    }

    /* renamed from: b */
    public static long m97603b(long j) {
        return j;
    }

    /* renamed from: c */
    public static final boolean m97602c(long j, long j2) {
        return j == j2;
    }

    /* renamed from: d */
    public static final float m97601d(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: e */
    public static final float m97600e(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: f */
    public static int m97599f(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: g */
    public static String m97598g(long j) {
        boolean z;
        if (m97601d(j) == m97600e(j)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "CornerRadius.circular(" + C41984hC1.m36629a(m97601d(j), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "CornerRadius.elliptical(" + C41984hC1.m36629a(m97601d(j), 1) + ", " + C41984hC1.m36629a(m97600e(j), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
