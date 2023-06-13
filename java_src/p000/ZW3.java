package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0007*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a \u0010\f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, m28432d2 = {"LjX3;", "", C17296a.f69688o, "b", "c", DateTokenConverter.CONVERTER_KEY, "j", "LCe3;", "g", "(LjX3;)J", "h", "ignoreConsumed", "i", "(LjX3;Z)J", "LG52;", "size", "e", "(LjX3;J)Z", "LxB5;", "extendedTouchPadding", "f", "(LjX3;JJ)Z", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ZW3 */
/* loaded from: classes.dex */
public final class ZW3 {
    /* renamed from: a */
    public static final boolean m72998a(C43361jX3 c43361jX3) {
        Intrinsics.checkNotNullParameter(c43361jX3, "<this>");
        if (!c43361jX3.m30351n() && !c43361jX3.m30355j() && c43361jX3.m30358g()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m72997b(C43361jX3 c43361jX3) {
        Intrinsics.checkNotNullParameter(c43361jX3, "<this>");
        if (!c43361jX3.m30355j() && c43361jX3.m30358g()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m72996c(C43361jX3 c43361jX3) {
        Intrinsics.checkNotNullParameter(c43361jX3, "<this>");
        if (!c43361jX3.m30351n() && c43361jX3.m30355j() && !c43361jX3.m30358g()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m72995d(C43361jX3 c43361jX3) {
        Intrinsics.checkNotNullParameter(c43361jX3, "<this>");
        if (c43361jX3.m30355j() && !c43361jX3.m30358g()) {
            return true;
        }
        return false;
    }

    @Deprecated(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @ReplaceWith(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    /* renamed from: e */
    public static final boolean m72994e(C43361jX3 isOutOfBounds, long j) {
        Intrinsics.checkNotNullParameter(isOutOfBounds, "$this$isOutOfBounds");
        long m30359f = isOutOfBounds.m30359f();
        float m111944o = C32120Ce3.m111944o(m30359f);
        float m111943p = C32120Ce3.m111943p(m30359f);
        int m105829g = G52.m105829g(j);
        int m105830f = G52.m105830f(j);
        if (m111944o >= 0.0f && m111944o <= m105829g && m111943p >= 0.0f && m111943p <= m105830f) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final boolean m72993f(C43361jX3 isOutOfBounds, long j, long j2) {
        Intrinsics.checkNotNullParameter(isOutOfBounds, "$this$isOutOfBounds");
        if (!C52254yX3.m3355g(isOutOfBounds.m30353l(), C52254yX3.f119686a.m3349d())) {
            return m72994e(isOutOfBounds, j);
        }
        long m30359f = isOutOfBounds.m30359f();
        float m111944o = C32120Ce3.m111944o(m30359f);
        float m111943p = C32120Ce3.m111943p(m30359f);
        float m105829g = G52.m105829g(j) + C51465xB5.m5730i(j2);
        float f = -C51465xB5.m5732g(j2);
        float m105830f = G52.m105830f(j) + C51465xB5.m5732g(j2);
        if (m111944o >= (-C51465xB5.m5730i(j2)) && m111944o <= m105829g && m111943p >= f && m111943p <= m105830f) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static final long m72992g(C43361jX3 c43361jX3) {
        Intrinsics.checkNotNullParameter(c43361jX3, "<this>");
        return m72990i(c43361jX3, false);
    }

    /* renamed from: h */
    public static final long m72991h(C43361jX3 c43361jX3) {
        Intrinsics.checkNotNullParameter(c43361jX3, "<this>");
        return m72990i(c43361jX3, true);
    }

    /* renamed from: i */
    public static final long m72990i(C43361jX3 c43361jX3, boolean z) {
        long m111940s = C32120Ce3.m111940s(c43361jX3.m30359f(), c43361jX3.m30356i());
        if (!z && c43361jX3.m30351n()) {
            return C32120Ce3.f4427b.m111932c();
        }
        return m111940s;
    }

    /* renamed from: j */
    public static final boolean m72989j(C43361jX3 c43361jX3) {
        Intrinsics.checkNotNullParameter(c43361jX3, "<this>");
        return !C32120Ce3.m111947l(m72990i(c43361jX3, true), C32120Ce3.f4427b.m111932c());
    }
}
