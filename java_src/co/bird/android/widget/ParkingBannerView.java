package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/widget/ParkingBannerView;", "Landroid/widget/FrameLayout;", "LhF3;", "parkingBannerType", "", C17296a.f69688o, "LBs6;", "b", "LBs6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ParkingBannerView extends FrameLayout {

    /* renamed from: b */
    public final C32015Bs6 f67444b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParkingBannerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C32015Bs6 m113421b = C32015Bs6.m113421b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m113421b, "inflate(context.layoutInflater, this)");
        this.f67444b = m113421b;
        LayoutInflater.from(getContext()).inflate(C45268mk4.view_parking_banner, this);
    }

    /* renamed from: a */
    public final void m54512a(EnumC42013hF3 parkingBannerType) {
        Intrinsics.checkNotNullParameter(parkingBannerType, "parkingBannerType");
        this.f67444b.f2987b.setText(getContext().getString(parkingBannerType.m36574c()));
        this.f67444b.f2987b.setBackgroundColor(NA0.m94301c(getContext(), parkingBannerType.m36575b()));
        this.f67444b.f2987b.setTextColor(NA0.m94301c(getContext(), parkingBannerType.m36573d()));
        C49520tu6.m11233r(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParkingBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C32015Bs6 m113421b = C32015Bs6.m113421b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m113421b, "inflate(context.layoutInflater, this)");
        this.f67444b = m113421b;
        LayoutInflater.from(getContext()).inflate(C45268mk4.view_parking_banner, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParkingBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C32015Bs6 m113421b = C32015Bs6.m113421b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m113421b, "inflate(context.layoutInflater, this)");
        this.f67444b = m113421b;
        LayoutInflater.from(getContext()).inflate(C45268mk4.view_parking_banner, this);
    }
}
