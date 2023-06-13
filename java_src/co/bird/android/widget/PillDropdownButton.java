package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0012\u0010\u0016B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/widget/PillDropdownButton;", "Landroid/widget/LinearLayout;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "", "label", "setLabel", "imageUrl", "setIcon", "LDs6;", "b", "LDs6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "c", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class PillDropdownButton extends LinearLayout {

    /* renamed from: c */
    public static final C16558a f67510c = new C16558a(null);

    /* renamed from: b */
    public final C32483Ds6 f67511b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"Lco/bird/android/widget/PillDropdownButton$a;", "", "", "DEFAULT_HEIGHT_DP", "I", "PADDING_DP", "PADDING_END_DP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.PillDropdownButton$a */
    /* loaded from: classes4.dex */
    public static final class C16558a {
        public /* synthetic */ C16558a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16558a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PillDropdownButton(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C32483Ds6 m109828b = C32483Ds6.m109828b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m109828b, "inflate(context.layoutInflater, this)");
        this.f67511b = m109828b;
        setBackground(NA0.m94299e(getContext(), C33309Hg4.button_pill_selector_gray));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "context");
        setPaddingRelative((int) C49347td3.m12002a(4, context3), (int) C49347td3.m12002a(4, context4), (int) C49347td3.m12002a(16, context5), (int) C49347td3.m12002a(4, context6));
        setGravity(16);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            super.onMeasure(i, (int) C49347td3.m12002a(48, context));
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setIcon(String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        ComponentCallbacks2C17096a.m53138t(getContext()).m81653k(imageUrl).m16096R0(this.f67511b.f6455b);
    }

    public final void setLabel(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f67511b.f6456c.setText(label);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PillDropdownButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C32483Ds6 m109828b = C32483Ds6.m109828b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m109828b, "inflate(context.layoutInflater, this)");
        this.f67511b = m109828b;
        setBackground(NA0.m94299e(getContext(), C33309Hg4.button_pill_selector_gray));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "context");
        setPaddingRelative((int) C49347td3.m12002a(4, context3), (int) C49347td3.m12002a(4, context4), (int) C49347td3.m12002a(16, context5), (int) C49347td3.m12002a(4, context6));
        setGravity(16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PillDropdownButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C32483Ds6 m109828b = C32483Ds6.m109828b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m109828b, "inflate(context.layoutInflater, this)");
        this.f67511b = m109828b;
        setBackground(NA0.m94299e(getContext(), C33309Hg4.button_pill_selector_gray));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "context");
        setPaddingRelative((int) C49347td3.m12002a(4, context3), (int) C49347td3.m12002a(4, context4), (int) C49347td3.m12002a(16, context5), (int) C49347td3.m12002a(4, context6));
        setGravity(16);
    }
}
