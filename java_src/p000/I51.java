package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0088\u0001\u000f\u0092\u0001\u00020\u000eø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"LI51;", "", LegacyRepairType.OTHER_KEY, "", C17296a.f69688o, "(JJ)I", "", "c", "(J)F", "distance", "", DateTokenConverter.CONVERTER_KEY, "(J)Z", "isInLayer", "", "packedValue", "b", "(J)J", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,340:1\n34#2:341\n62#2:342\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n*L\n319#1:341\n322#1:342\n*E\n"})
/* renamed from: I51 */
/* loaded from: classes.dex */
public final class I51 {
    /* renamed from: a */
    public static final int m102994a(long j, long j2) {
        boolean m102991d = m102991d(j);
        if (m102991d != m102991d(j2)) {
            if (m102991d) {
                return -1;
            }
            return 1;
        }
        return (int) Math.signum(m102992c(j) - m102992c(j2));
    }

    /* renamed from: b */
    public static long m102993b(long j) {
        return j;
    }

    /* renamed from: c */
    public static final float m102992c(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: d */
    public static final boolean m102991d(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }
}
