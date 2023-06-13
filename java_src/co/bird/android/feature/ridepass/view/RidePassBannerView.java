package co.bird.android.feature.ridepass.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.RidePassView;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000f\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u000f\u0010\u0016J\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/feature/ridepass/view/RidePassBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Lco/bird/android/model/persistence/RidePassView;", "ridePasses", "", "alwaysShowStaticTitle", "", "e", "Lst6;", "b", "Lst6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePassBannerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassBannerView.kt\nco/bird/android/feature/ridepass/view/RidePassBannerView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1747#2,3:41\n*S KotlinDebug\n*F\n+ 1 RidePassBannerView.kt\nco/bird/android/feature/ridepass/view/RidePassBannerView\n*L\n22#1:41,3\n*E\n"})
/* loaded from: classes3.dex */
public final class RidePassBannerView extends ConstraintLayout {

    /* renamed from: b */
    public final C48917st6 f64868b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RidePassBannerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C48917st6 m13548b = C48917st6.m13548b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m13548b, "inflate(context.layoutInflater, this)");
        this.f64868b = m13548b;
    }

    /* renamed from: e */
    public final void m57369e(List<RidePassView> ridePasses, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(ridePasses, "ridePasses");
        List<RidePassView> list = ridePasses;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (RidePassView ridePassView : list) {
                if (ridePassView.isIneligible()) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            this.f64868b.f109458e.setText(getContext().getString(C45871nl4.ride_pass_ineligible_banner_title));
            this.f64868b.f109457d.setText(getContext().getString(C45871nl4.ride_pass_ineligible_banner_subtitle));
        } else if (ridePasses.size() == 1) {
            if (z) {
                this.f64868b.f109458e.setText(getContext().getString(C45871nl4.ride_pass_multiple_banner_title));
                this.f64868b.f109457d.setText(getContext().getString(C45871nl4.ride_pass_multiple_banner_subtitle));
                return;
            }
            this.f64868b.f109458e.setText(ridePasses.get(0).getTitle());
            this.f64868b.f109457d.setText(getContext().getString(C45871nl4.ride_pass_single_banner_subtitle));
        } else {
            this.f64868b.f109458e.setText(getContext().getString(C45871nl4.ride_pass_multiple_banner_title));
            this.f64868b.f109457d.setText(getContext().getString(C45871nl4.ride_pass_multiple_banner_subtitle));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RidePassBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C48917st6 m13548b = C48917st6.m13548b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m13548b, "inflate(context.layoutInflater, this)");
        this.f64868b = m13548b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RidePassBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C48917st6 m13548b = C48917st6.m13548b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m13548b, "inflate(context.layoutInflater, this)");
        this.f64868b = m13548b;
    }
}
