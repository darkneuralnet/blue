package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0001ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"!\u0010\u001a\u001a\u00020\u0016*\u00020\u00048FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018\"!\u0010\u001f\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\"!\u0010\u001f\u001a\u00020\u0004*\u00020 8FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001d\u0010#\u001a\u0004\b!\u0010\"\"!\u0010\u001f\u001a\u00020\u0004*\u00020$8FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001d\u0010'\u001a\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, m28432d2 = {"", "value", "LO26;", "type", "LM26;", C17296a.f69688o, "(FJ)J", "", "unitType", "v", "i", "(JF)J", "", "b", "(J)V", "c", "(JJ)V", "start", "stop", "fraction", "h", "(JJF)J", "", "g", "(J)Z", "isUnspecified--R2X_6o$annotations", "isUnspecified", "e", "(F)J", "getSp$annotations", "(F)V", "sp", "", DateTokenConverter.CONVERTER_KEY, "(D)J", "(D)V", "", "f", "(I)J", "(I)V", "ui-unit_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,388:1\n250#1:389\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n264#1:389\n*E\n"})
/* renamed from: N26 */
/* loaded from: classes.dex */
public final class N26 {
    /* renamed from: a */
    public static final long m94419a(float f, long j) {
        return m94411i(j, f);
    }

    @PublishedApi
    /* renamed from: b */
    public static final void m94418b(long j) {
        if (!(!m94413g(j))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    @PublishedApi
    /* renamed from: c */
    public static final void m94417c(long j, long j2) {
        boolean z;
        if (!m94413g(j) && !m94413g(j2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (O26.m92975g(M26.m95973g(j), M26.m95973g(j2))) {
                return;
            }
            throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) O26.m92973i(M26.m95973g(j))) + " and " + ((Object) O26.m92973i(M26.m95973g(j2)))).toString());
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    /* renamed from: d */
    public static final long m94416d(double d) {
        return m94411i(4294967296L, (float) d);
    }

    /* renamed from: e */
    public static final long m94415e(float f) {
        return m94411i(4294967296L, f);
    }

    /* renamed from: f */
    public static final long m94414f(int i) {
        return m94411i(4294967296L, i);
    }

    /* renamed from: g */
    public static final boolean m94413g(long j) {
        return M26.m95974f(j) == 0;
    }

    /* renamed from: h */
    public static final long m94412h(long j, long j2, float f) {
        m94417c(j, j2);
        return m94411i(M26.m95974f(j), YM2.m75146a(M26.m95972h(j), M26.m95972h(j2), f));
    }

    @PublishedApi
    /* renamed from: i */
    public static final long m94411i(long j, float f) {
        return M26.m95977c(j | (Float.floatToIntBits(f) & 4294967295L));
    }
}
