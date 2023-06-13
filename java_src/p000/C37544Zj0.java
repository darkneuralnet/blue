package p000;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LZj0;", "", "Landroid/view/MotionEvent;", "event", "", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/PointF;", "b", "Landroid/graphics/PointF;", "startPoint", "<init>", "(Landroid/content/Context;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Zj0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37544Zj0 {

    /* renamed from: a */
    public final Context f49000a;

    /* renamed from: b */
    public final PointF f49001b;

    public C37544Zj0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49000a = context;
        this.f49001b = new PointF();
    }

    /* renamed from: a */
    public final boolean m72646a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1 || Math.sqrt(Math.pow(event.getX() - this.f49001b.x, 2.0d) + Math.pow(event.getY() - this.f49001b.y, 2.0d)) >= ViewConfiguration.get(this.f49000a).getScaledTouchSlop()) {
                return false;
            }
            return true;
        }
        this.f49001b.set(event.getX(), event.getY());
        return false;
    }
}
