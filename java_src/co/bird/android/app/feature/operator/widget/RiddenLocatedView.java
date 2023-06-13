package co.bird.android.app.feature.operator.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdLabel;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt__CharJVMKt;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\"\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bJ\f\u0010\u000f\u001a\u00020\u000e*\u00020\u0005H\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/app/feature/operator/widget/RiddenLocatedView;", "Landroid/widget/RelativeLayout;", "Lorg/joda/time/DateTime;", "lastRideAt", "lastTrackedAt", "Lco/bird/android/model/wire/WireBirdLabel;", "birdLabel", "", "setBirdData", "Lco/bird/android/model/wire/WireBird;", "bird", "", "title", "setTopStatusTitle", "", C17296a.f69688o, "Lpt6;", "b", "Lpt6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRiddenLocatedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiddenLocatedView.kt\nco/bird/android/app/feature/operator/widget/RiddenLocatedView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes2.dex */
public final class RiddenLocatedView extends RelativeLayout {

    /* renamed from: b */
    public final C47139pt6 f61944b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RiddenLocatedView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final int m60204a(WireBirdLabel wireBirdLabel) {
        int checkRadix;
        try {
            int color = wireBirdLabel.getColor();
            checkRadix = CharsKt__CharJVMKt.checkRadix(16);
            String num = Integer.toString(color, checkRadix);
            Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
            return Color.parseColor("#" + num);
        } catch (Exception unused) {
            return -16777216;
        }
    }

    public final void setBirdData(DateTime dateTime, DateTime dateTime2, WireBirdLabel birdLabel) {
        Unit unit;
        Intrinsics.checkNotNullParameter(birdLabel, "birdLabel");
        Unit unit2 = null;
        if (dateTime != null) {
            this.f61944b.f104229c.setText(C51916xx1.f118396a.m4390v(dateTime));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f61944b.f104229c.setText(getContext().getString(C45871nl4.bird_action_unknown));
        }
        if (dateTime2 != null) {
            this.f61944b.f104228b.setText(C51916xx1.f118396a.m4390v(dateTime2));
            unit2 = Unit.INSTANCE;
        }
        if (unit2 == null) {
            this.f61944b.f104228b.setText(getContext().getString(C45871nl4.bird_action_unknown));
        }
        this.f61944b.f104230d.setText(birdLabel.getName());
        this.f61944b.f104230d.setBackgroundColor(m60204a(birdLabel));
    }

    public final void setTopStatusTitle(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f61944b.f104231e.setText(title);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RiddenLocatedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RiddenLocatedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RiddenLocatedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C47139pt6 m18557b = C47139pt6.m18557b(C40788fB0.m41772j(context), this);
        Intrinsics.checkNotNullExpressionValue(m18557b, "inflate(context.layoutInflater, this)");
        this.f61944b = m18557b;
        setBackgroundColor(NA0.m94301c(context, C32364Df4.birdWhite));
        LayoutInflater.from(context).inflate(C39311cj4.view_ridden_located, this);
    }

    public final void setBirdData(DateTime dateTime, DateTime dateTime2, WireBird bird) {
        String m64558a;
        String m4390v;
        Intrinsics.checkNotNullParameter(bird, "bird");
        String str = "";
        this.f61944b.f104229c.setText((dateTime == null || (r4 = C51916xx1.f118396a.m4390v(dateTime)) == null) ? "" : "");
        TextView textView = this.f61944b.f104228b;
        if (dateTime2 != null && (m4390v = C51916xx1.f118396a.m4390v(dateTime2)) != null) {
            str = m4390v;
        }
        textView.setText(str);
        TextView textView2 = this.f61944b.f104230d;
        m64558a = C38529bP4.m64558a(bird);
        textView2.setText(m64558a);
        this.f61944b.f104230d.setBackgroundColor(m60204a(bird.getLabel()));
    }
}
