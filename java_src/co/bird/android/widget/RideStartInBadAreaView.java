package co.bird.android.widget;

import android.content.Context;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000f\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/widget/RideStartInBadAreaView;", "Landroidx/cardview/widget/CardView;", "", "remainingSeconds", "", "r", "Lco/bird/android/widget/RideStartInBadAreaView$a;", "type", "setBadAreaType", "Lvt6;", "k", "Lvt6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RideStartInBadAreaView extends CardView {

    /* renamed from: k */
    public final C50695vt6 f67634k;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/widget/RideStartInBadAreaView$a;", "", "", "b", "I", "()I", "instructionsText", "<init>", "(Ljava/lang/String;II)V", "c", DateTokenConverter.CONVERTER_KEY, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.RideStartInBadAreaView$a */
    /* loaded from: classes4.dex */
    public enum EnumC16576a {
        OUTSIDE_OPERATING_AREA(C45871nl4.ride_start_outside_operating_area_banner_instructions_updated),
        IN_NO_RIDE_AREA(C45871nl4.ride_start_in_no_ride_area_banner_instructions_updated);
        

        /* renamed from: b */
        public final int f67638b;

        EnumC16576a(int i) {
            this.f67638b = i;
        }

        /* renamed from: b */
        public final int m54396b() {
            return this.f67638b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideStartInBadAreaView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C50695vt6 m7848c = C50695vt6.m7848c(C40788fB0.m41772j(context2), this, true);
        Intrinsics.checkNotNullExpressionValue(m7848c, "inflate(context.layoutInflater, this, true)");
        this.f67634k = m7848c;
    }

    /* renamed from: r */
    public final void m54398r(int i) {
        CountdownView countdownView = this.f67634k.f114864b;
        Intrinsics.checkNotNullExpressionValue(countdownView, "binding.countDown");
        CountdownView.init$default(countdownView, i, null, null, null, Integer.valueOf(C45871nl4.ride_start_in_bad_area_timer_warning), new StyleSpan(1), null, null, 206, null);
    }

    public final void setBadAreaType(EnumC16576a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f67634k.f114866d.setText(getContext().getString(type.m54396b()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideStartInBadAreaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C50695vt6 m7848c = C50695vt6.m7848c(C40788fB0.m41772j(context2), this, true);
        Intrinsics.checkNotNullExpressionValue(m7848c, "inflate(context.layoutInflater, this, true)");
        this.f67634k = m7848c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideStartInBadAreaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C50695vt6 m7848c = C50695vt6.m7848c(C40788fB0.m41772j(context2), this, true);
        Intrinsics.checkNotNullExpressionValue(m7848c, "inflate(context.layoutInflater, this, true)");
        this.f67634k = m7848c;
    }
}
