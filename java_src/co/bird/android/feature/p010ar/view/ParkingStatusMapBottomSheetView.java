package co.bird.android.feature.p010ar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.p010ar.view.ParkingStatusMapBottomSheetView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/ViewPropertyAnimator;", "k", "n", "La00;", "b", "La00;", "binding", "Lco/bird/android/feature/ar/view/SemiCircleMapView;", "c", "Lco/bird/android/feature/ar/view/SemiCircleMapView;", "i", "()Lco/bird/android/feature/ar/view/SemiCircleMapView;", "mapView", "Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;", "j", "()Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;", "parkingStatus", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.ar.view.ParkingStatusMapBottomSheetView */
/* loaded from: classes3.dex */
public final class ParkingStatusMapBottomSheetView extends ConstraintLayout {

    /* renamed from: b */
    public final C37697a00 f63234b;

    /* renamed from: c */
    public final SemiCircleMapView f63235c;

    /* renamed from: d */
    public final ParkingStatusBottomSheetView f63236d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ParkingStatusMapBottomSheetView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: l */
    public static final void m58878l(ParkingStatusMapBottomSheetView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTranslationY(this$0.getHeight());
        this$0.setVisibility(0);
    }

    /* renamed from: m */
    public static final void m58877m(ParkingStatusMapBottomSheetView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTranslationY(0.0f);
    }

    /* renamed from: o */
    public static final void m58875o(ParkingStatusMapBottomSheetView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTranslationY(0.0f);
    }

    /* renamed from: p */
    public static final void m58874p(ParkingStatusMapBottomSheetView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTranslationY(this$0.getHeight());
        this$0.setVisibility(4);
    }

    /* renamed from: i */
    public final SemiCircleMapView m58881i() {
        return this.f63235c;
    }

    /* renamed from: j */
    public final ParkingStatusBottomSheetView m58880j() {
        return this.f63236d;
    }

    /* renamed from: k */
    public final ViewPropertyAnimator m58879k() {
        ViewPropertyAnimator withEndAction = animate().setStartDelay(100L).setDuration(100L).translationY(0.0f).withStartAction(new Runnable() { // from class: IH3
            @Override // java.lang.Runnable
            public final void run() {
                ParkingStatusMapBottomSheetView.m58878l(ParkingStatusMapBottomSheetView.this);
            }
        }).withEndAction(new Runnable() { // from class: JH3
            @Override // java.lang.Runnable
            public final void run() {
                ParkingStatusMapBottomSheetView.m58877m(ParkingStatusMapBottomSheetView.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(withEndAction, "animate()\n      .setStar…translationY = 0f\n      }");
        return withEndAction;
    }

    /* renamed from: n */
    public final ViewPropertyAnimator m58876n() {
        ViewPropertyAnimator withEndAction = animate().setDuration(100L).translationY(getHeight()).withStartAction(new Runnable() { // from class: GH3
            @Override // java.lang.Runnable
            public final void run() {
                ParkingStatusMapBottomSheetView.m58875o(ParkingStatusMapBottomSheetView.this);
            }
        }).withEndAction(new Runnable() { // from class: HH3
            @Override // java.lang.Runnable
            public final void run() {
                ParkingStatusMapBottomSheetView.m58874p(ParkingStatusMapBottomSheetView.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(withEndAction, "animate()\n      .setDura… = View.INVISIBLE\n      }");
        return withEndAction;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ParkingStatusMapBottomSheetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ParkingStatusMapBottomSheetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ParkingStatusMapBottomSheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C37697a00 m72135c = C37697a00.m72135c(C40788fB0.m41772j(context), this, true);
        Intrinsics.checkNotNullExpressionValue(m72135c, "inflate(context.layoutInflater, this, true)");
        this.f63234b = m72135c;
        SemiCircleMapView semiCircleMapView = m72135c.f49628b;
        Intrinsics.checkNotNullExpressionValue(semiCircleMapView, "binding.mapView");
        this.f63235c = semiCircleMapView;
        ParkingStatusBottomSheetView parkingStatusBottomSheetView = m72135c.f49629c;
        Intrinsics.checkNotNullExpressionValue(parkingStatusBottomSheetView, "binding.parkingStatus");
        this.f63236d = parkingStatusBottomSheetView;
        setVisibility(4);
    }
}
