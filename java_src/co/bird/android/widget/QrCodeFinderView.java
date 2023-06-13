package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.dm7.barcodescanner.core.ViewFinderView;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/widget/QrCodeFinderView;", "Lme/dm7/barcodescanner/core/ViewFinderView;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class QrCodeFinderView extends ViewFinderView {
    public QrCodeFinderView(Context context) {
        super(context);
        setLaserEnabled(false);
        setMaskColor(0);
        setSquareViewFinder(false);
        setBorderColor(0);
        setLaserColor(0);
        setLaserEnabled(false);
        setBorderStrokeWidth(0);
        setBorderLineLength(0);
        setMaskColor(0);
        setBorderCornerRounded(false);
        setBorderCornerRadius(0);
        setSquareViewFinder(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrCodeFinderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
