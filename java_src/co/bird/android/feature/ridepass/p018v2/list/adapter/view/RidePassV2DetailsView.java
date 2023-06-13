package co.bird.android.feature.ridepass.p018v2.list.adapter.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/ridepass/v2/list/adapter/view/RidePassV2DetailsView;", "Landroid/widget/LinearLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setDetails", "", "detailBodyList", "", "", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nRidePassV2DetailsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2DetailsView.kt\nco/bird/android/feature/ridepass/v2/list/adapter/view/RidePassV2DetailsView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1855#2:28\n1856#2:30\n1#3:29\n*S KotlinDebug\n*F\n+ 1 RidePassV2DetailsView.kt\nco/bird/android/feature/ridepass/v2/list/adapter/view/RidePassV2DetailsView\n*L\n20#1:28\n20#1:30\n*E\n"})
/* renamed from: co.bird.android.feature.ridepass.v2.list.adapter.view.RidePassV2DetailsView */
/* loaded from: classes3.dex */
public final class RidePassV2DetailsView extends LinearLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RidePassV2DetailsView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setDetails(List<String> detailBodyList) {
        Intrinsics.checkNotNullParameter(detailBodyList, "detailBodyList");
        for (String str : detailBodyList) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            View m41761u = C40788fB0.m41761u(context, C33102Gj4.view_ride_pass_v2_detail, this, false);
            ((TextView) C49520tu6.m11243h(m41761u, C36126Th4.content)).setText(str);
            addView(m41761u);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RidePassV2DetailsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RidePassV2DetailsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RidePassV2DetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(C33102Gj4.view_ride_pass_v2_details, this);
    }
}
