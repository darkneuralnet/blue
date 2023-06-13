package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\"!\u0010\u0010\u001a\u00020\u000b*\u00020\u00038FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\"!\u0010\u0013\u001a\u00020\u000b*\u00020\u00038FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m28432d2 = {"", "x", "y", "LCe3;", C17296a.f69688o, "(FF)J", "start", "stop", "fraction", DateTokenConverter.CONVERTER_KEY, "(JJF)J", "", "b", "(J)Z", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite", "c", "isSpecified-k-4lQ0M$annotations", "isSpecified", "ui-geometry_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n25#2,3:267\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n31#1:267,3\n*E\n"})
/* renamed from: Ge3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33056Ge3 {
    /* renamed from: a */
    public static final long m104938a(float f, float f2) {
        return C32120Ce3.m111952g((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    /* renamed from: b */
    public static final boolean m104937b(long j) {
        float m111944o = C32120Ce3.m111944o(j);
        if ((Float.isInfinite(m111944o) || Float.isNaN(m111944o)) ? false : true) {
            float m111943p = C32120Ce3.m111943p(j);
            if ((Float.isInfinite(m111943p) || Float.isNaN(m111943p)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m104936c(long j) {
        return j != C32120Ce3.f4427b.m111933b();
    }

    /* renamed from: d */
    public static final long m104935d(long j, long j2, float f) {
        return m104938a(YM2.m75146a(C32120Ce3.m111944o(j), C32120Ce3.m111944o(j2), f), YM2.m75146a(C32120Ce3.m111943p(j), C32120Ce3.m111943p(j2), f));
    }
}
