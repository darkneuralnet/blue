package co.bird.android.feature.p010ar.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.MapView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0012\u0010\u0016B!\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0018J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/ar/view/SemiCircleMapView;", "Lcom/google/android/gms/maps/MapView;", "", "w", "h", "oldw", "oldh", "", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "Landroid/graphics/Path;", "c", "Landroid/graphics/Path;", "maskPath", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.ar.view.SemiCircleMapView */
/* loaded from: classes3.dex */
public final class SemiCircleMapView extends MapView {

    /* renamed from: c */
    public final Path f63243c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemiCircleMapView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f63243c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.clipPath(this.f63243c);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f63243c.reset();
        float f = i;
        float f2 = i2;
        float f3 = 0.25f * f2;
        this.f63243c.moveTo(0.0f, f3);
        this.f63243c.quadTo(f / 2.0f, 0.0f, f, f3);
        this.f63243c.lineTo(f, f2);
        this.f63243c.lineTo(0.0f, f2);
        this.f63243c.close();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemiCircleMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f63243c = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemiCircleMapView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f63243c = new Path();
    }
}
