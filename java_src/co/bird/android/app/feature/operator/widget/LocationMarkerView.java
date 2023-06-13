package co.bird.android.app.feature.operator.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.BirdLocation;
import com.facebook.share.internal.C17296a;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/app/feature/operator/widget/LocationMarkerView;", "Landroid/widget/LinearLayout;", "Lco/bird/android/model/BirdLocation;", "birdLocation", "", C17296a.f69688o, "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "info", "c", FraudDetectionData.KEY_TIMESTAMP, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LocationMarkerView extends LinearLayout {

    /* renamed from: b */
    public final TextView f61928b;

    /* renamed from: c */
    public final TextView f61929c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LocationMarkerView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final void m60206a(BirdLocation birdLocation) {
        String str;
        Intrinsics.checkNotNullParameter(birdLocation, "birdLocation");
        this.f61928b.setText(birdLocation.getDisplayName());
        TextView textView = this.f61929c;
        DateTime createdAt = birdLocation.getCreatedAt();
        boolean z = true;
        if (createdAt != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            str = C46880pT0.m19259c(createdAt, context, true);
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = this.f61929c;
        if (birdLocation.getCreatedAt() == null) {
            z = false;
        }
        C49520tu6.show$default(textView2, z, 0, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LocationMarkerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LocationMarkerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LocationMarkerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(C39311cj4.view_location_marker, this);
        this.f61928b = (TextView) C49520tu6.m11243h(this, C36585Vg4.info);
        this.f61929c = (TextView) C49520tu6.m11243h(this, C36585Vg4.timestamp);
    }
}
