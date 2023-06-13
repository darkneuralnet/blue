package p000;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000b\u001a\u00020\b*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0012\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\r\u001a\u00020\fJ\u0012\u0010\u0011\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bR\u0015\u0010\u0014\u001a\u00020\b*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lu91;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "Landroid/widget/EdgeEffect;", C17296a.f69688o, "", "deltaDistance", "displacement", DateTokenConverter.CONVERTER_KEY, "", "velocity", "", "c", "delta", "e", "b", "(Landroid/widget/EdgeEffect;)F", "distanceCompat", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: u91  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49664u91 {

    /* renamed from: a */
    public static final C49664u91 f111813a = new C49664u91();

    private C49664u91() {
    }

    /* renamed from: a */
    public final EdgeEffect m10782a(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            return C26165mh.f98568a.m25167a(context, attributeSet);
        }
        return new XC1(context);
    }

    /* renamed from: b */
    public final float m10781b(EdgeEffect edgeEffect) {
        Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C26165mh.f98568a.m25166b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public final void m10780c(EdgeEffect edgeEffect, int i) {
        Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    /* renamed from: d */
    public final float m10779d(EdgeEffect edgeEffect, float f, float f2) {
        Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C26165mh.f98568a.m25165c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    /* renamed from: e */
    public final void m10778e(EdgeEffect edgeEffect, float f) {
        Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
        if (edgeEffect instanceof XC1) {
            ((XC1) edgeEffect).m77189a(f);
        } else {
            edgeEffect.onRelease();
        }
    }
}
