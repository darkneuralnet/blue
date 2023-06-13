package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J \u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\u0010"}, m28432d2 = {"Lmh;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "Landroid/widget/EdgeEffect;", C17296a.f69688o, "edgeEffect", "", "deltaDistance", "displacement", "c", "b", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mh */
/* loaded from: classes.dex */
public final class C26165mh {

    /* renamed from: a */
    public static final C26165mh f98568a = new C26165mh();

    private C26165mh() {
    }

    /* renamed from: a */
    public final EdgeEffect m25167a(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            C25761lh.m27004a();
            return C24983jh.m30109a(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* renamed from: b */
    public final float m25166b(EdgeEffect edgeEffect) {
        float distance;
        Intrinsics.checkNotNullParameter(edgeEffect, "edgeEffect");
        try {
            distance = edgeEffect.getDistance();
            return distance;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* renamed from: c */
    public final float m25165c(EdgeEffect edgeEffect, float f, float f2) {
        float onPullDistance;
        Intrinsics.checkNotNullParameter(edgeEffect, "edgeEffect");
        try {
            onPullDistance = edgeEffect.onPullDistance(f, f2);
            return onPullDistance;
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
