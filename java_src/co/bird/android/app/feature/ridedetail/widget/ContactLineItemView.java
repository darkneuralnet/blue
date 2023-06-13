package co.bird.android.app.feature.ridedetail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0013\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/app/feature/ridedetail/widget/ContactLineItemView;", "Landroid/widget/RelativeLayout;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "", "name", "number", "setContactItem", "nameAndNumber", "setBirdContactItem", "Lzb2;", "b", "Lzb2;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "c", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ContactLineItemView extends RelativeLayout {

    /* renamed from: c */
    public static final C14301a f62699c = new C14301a(null);

    /* renamed from: d */
    public static final int f62700d = 8;

    /* renamed from: b */
    public final C52883zb2 f62701b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/app/feature/ridedetail/widget/ContactLineItemView$a;", "", "", "DEFAULT_HEIGHT_DP", "I", "HORIZONTAL_PADDING_DP", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ridedetail.widget.ContactLineItemView$a */
    /* loaded from: classes2.dex */
    public static final class C14301a {
        public /* synthetic */ C14301a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14301a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactLineItemView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C52883zb2 m1061b = C52883zb2.m1061b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m1061b, "inflate(context.layoutInflater, this)");
        this.f62701b = m1061b;
        setPaddingRelative((int) C49347td3.m12001b(20), 0, (int) C49347td3.m12001b(20), 0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == 0) {
            super.onMeasure(i, (int) C49347td3.m12001b(56));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public final void setBirdContactItem(String nameAndNumber) {
        Intrinsics.checkNotNullParameter(nameAndNumber, "nameAndNumber");
        this.f62701b.f121572b.setText(nameAndNumber);
        TextView textView = this.f62701b.f121573c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.contactNumber");
        C49520tu6.m11239l(textView);
    }

    public final void setContactItem(String name, String number) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f62701b.f121572b.setText(name);
        this.f62701b.f121573c.setText(number);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactLineItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C52883zb2 m1061b = C52883zb2.m1061b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m1061b, "inflate(context.layoutInflater, this)");
        this.f62701b = m1061b;
        setPaddingRelative((int) C49347td3.m12001b(20), 0, (int) C49347td3.m12001b(20), 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactLineItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C52883zb2 m1061b = C52883zb2.m1061b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m1061b, "inflate(context.layoutInflater, this)");
        this.f62701b = m1061b;
        setPaddingRelative((int) C49347td3.m12001b(20), 0, (int) C49347td3.m12001b(20), 0);
    }
}
