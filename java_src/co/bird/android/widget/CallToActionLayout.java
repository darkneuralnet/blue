package co.bird.android.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.CallToActionLayout;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00103\u001a\u000202\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\b\b\u0002\u00106\u001a\u00020\u0004¢\u0006\u0004\b7\u00108J$\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J)\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0015J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0015J\u0010\u0010\u0019\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000eJ\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0010\u0010\u001e\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u000eJ\u000e\u0010!\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u000eJ\u000e\u0010\"\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000eJ\u000e\u0010#\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000eJ\u0010\u0010$\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000eJ\u0010\u0010&\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u0004R!\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010)R!\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b+\u0010)R!\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b-\u0010)R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00100¨\u00069"}, m28432d2 = {"Lco/bird/android/widget/CallToActionLayout;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "child", "", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "", "addView", "T", "resId", "c", "(II)Landroid/view/View;", "", "changed", "left", "top", "right", "bottom", "onLayout", "Lio/reactivex/Observable;", "b", "h", "i", "setButtonsLabel", "", Entry.TYPE_TEXT, "show", "setButtonsLabelVisibility", "setButtonText", "enabled", "setButtonEnabled", "setButtonsEnabled", "setButtonVisibility", "setSecondaryButtonVisibility", "setSecondaryButtonText", "setTertiaryButtonVisibility", "setTertiaryButtonText", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()Lio/reactivex/Observable;", "actionClicks", "e", "secondaryActionClicks", "f", "tertiaryActionClicks", "LTp6;", "LTp6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CallToActionLayout extends LinearLayout {

    /* renamed from: b */
    public final Lazy f67226b;

    /* renamed from: c */
    public final Lazy f67227c;

    /* renamed from: d */
    public final Lazy f67228d;

    /* renamed from: e */
    public final C36200Tp6 f67229e;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CallToActionLayout$a */
    /* loaded from: classes4.dex */
    public static final class C16471a extends Lambda implements Function0<Observable<Unit>> {
        public C16471a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            Button button = CallToActionLayout.this.f67229e.f36123b;
            Intrinsics.checkNotNullExpressionValue(button, "binding.button");
            return C45219mf5.m25214a(button).throttleFirst(500L, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a()).share();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "scrollable", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.CallToActionLayout$b */
    /* loaded from: classes4.dex */
    public static final class C16472b extends Lambda implements Function1<Boolean, Unit> {
        public C16472b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                CallToActionLayout.this.f67229e.f36124c.setCardElevation(CallToActionLayout.this.getContext().getResources().getDimension(C37278Yf4.button_container_scrollable_elevation));
                return;
            }
            CallToActionLayout.this.f67229e.f36124c.setCardElevation(CallToActionLayout.this.getContext().getResources().getDimension(C37278Yf4.button_container_zero_elevation));
            CallToActionLayout.this.f67229e.f36124c.setCardBackgroundColor(NA0.m94301c(CallToActionLayout.this.getContext(), 17170445));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CallToActionLayout$c */
    /* loaded from: classes4.dex */
    public static final class C16473c extends Lambda implements Function0<Observable<Unit>> {
        public C16473c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            Button button = CallToActionLayout.this.f67229e.f36130i;
            Intrinsics.checkNotNullExpressionValue(button, "binding.secondaryButton");
            return C45219mf5.m25214a(button).throttleFirst(500L, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a()).share();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CallToActionLayout$d */
    /* loaded from: classes4.dex */
    public static final class C16474d extends Lambda implements Function0<Observable<Unit>> {
        public C16474d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            Button button = CallToActionLayout.this.f67229e.f36131j;
            Intrinsics.checkNotNullExpressionValue(button, "binding.tertiaryButton");
            return C45219mf5.m25214a(button).throttleFirst(500L, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a()).share();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CallToActionLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: g */
    public static final void m54688g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Unit unit;
        LinearLayout linearLayout = (LinearLayout) C49520tu6.m11238m(this, C52955zi4.content);
        if (linearLayout != null) {
            linearLayout.addView(view, i, layoutParams);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.addView(view, i, layoutParams);
        }
    }

    /* renamed from: b */
    public final Observable<Unit> m54693b() {
        return m54691d();
    }

    /* renamed from: c */
    public final <T extends View> T m54692c(int i, int i2) {
        T t = (T) LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.f67229e.f36125d, false);
        ViewGroup.LayoutParams layoutParams = t.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = (int) getContext().getResources().getDimension(C37278Yf4.google_pay_button_height);
        Resources resources = getContext().getResources();
        int i3 = C37278Yf4.google_pay_margin;
        layoutParams2.setMarginStart((int) resources.getDimension(i3));
        layoutParams2.setMarginEnd((int) getContext().getResources().getDimension(i3));
        layoutParams2.topMargin = (int) getContext().getResources().getDimension(i3);
        this.f67229e.f36125d.addView(t, i2 + 1);
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of co.bird.android.widget.CallToActionLayout.addButtonView");
        return t;
    }

    /* renamed from: d */
    public final Observable<Unit> m54691d() {
        Object value = this.f67226b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-actionClicks>(...)");
        return (Observable) value;
    }

    /* renamed from: e */
    public final Observable<Unit> m54690e() {
        Object value = this.f67227c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-secondaryActionClicks>(...)");
        return (Observable) value;
    }

    /* renamed from: f */
    public final Observable<Unit> m54689f() {
        Object value = this.f67228d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-tertiaryActionClicks>(...)");
        return (Observable) value;
    }

    /* renamed from: h */
    public final Observable<Unit> m54687h() {
        return m54690e();
    }

    /* renamed from: i */
    public final Observable<Unit> m54686i() {
        return m54689f();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @SuppressLint({"CheckResult"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ScrollView scrollView = this.f67229e.f36129h;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.scrollView");
        AbstractC23442F<Boolean> m13410e = C48927su6.m13410e(scrollView);
        final C16472b c16472b = new C16472b();
        m13410e.subscribe(new InterfaceC23484g() { // from class: B80
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CallToActionLayout.m54688g(Function1.this, obj);
            }
        });
    }

    public final void setButtonEnabled(boolean z) {
        this.f67229e.f36123b.setEnabled(z);
    }

    public final void setButtonText(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f67229e.f36123b.setText(text);
    }

    public final void setButtonVisibility(boolean z) {
        Button button = this.f67229e.f36123b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.button");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    public final void setButtonsEnabled(boolean z) {
        int childCount = this.f67229e.f36125d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f67229e.f36125d.getChildAt(i);
            if (childAt != null) {
                childAt.setEnabled(z);
            }
        }
    }

    public final void setButtonsLabel(int i) {
        this.f67229e.f36126e.setText(getContext().getString(i));
    }

    public final void setButtonsLabelVisibility(boolean z) {
        TextView textView = this.f67229e.f36126e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.buttonsLabel");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    public final void setSecondaryButtonText(int i) {
        this.f67229e.f36130i.setText(i);
    }

    public final void setSecondaryButtonVisibility(boolean z) {
        Button button = this.f67229e.f36130i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.secondaryButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    public final void setTertiaryButtonText(int i) {
        this.f67229e.f36131j.setText(i);
    }

    public final void setTertiaryButtonVisibility(boolean z) {
        Button button = this.f67229e.f36131j;
        Intrinsics.checkNotNullExpressionValue(button, "binding.tertiaryButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CallToActionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setButtonText(int i) {
        this.f67229e.f36123b.setText(getContext().getString(i));
    }

    public final void setButtonsLabel(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f67229e.f36126e.setText(text);
    }

    public /* synthetic */ CallToActionLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CallToActionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(context, "context");
        lazy = LazyKt__LazyJVMKt.lazy(new C16471a());
        this.f67226b = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16473c());
        this.f67227c = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16474d());
        this.f67228d = lazy3;
        C36200Tp6 m82949a = C36200Tp6.m82949a(LayoutInflater.from(context).inflate(C45268mk4.view_call_to_action, this));
        Intrinsics.checkNotNullExpressionValue(m82949a, "bind(LayoutInflater.from…ew_call_to_action, this))");
        this.f67229e = m82949a;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C34290Ll4.CallToActionLayout, 0, 0);
        try {
            TextView textView = m82949a.f36126e;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.buttonsLabel");
            C49520tu6.setTextAndVisibility$default(textView, obtainStyledAttributes.getString(C34290Ll4.CallToActionLayout_buttonsLabelText), 0, 2, null);
            Button button = m82949a.f36123b;
            Intrinsics.checkNotNullExpressionValue(button, "binding.button");
            C49520tu6.setTextAndVisibility$default(button, obtainStyledAttributes.getString(C34290Ll4.CallToActionLayout_callToActionText), 0, 2, null);
            Button button2 = m82949a.f36130i;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.secondaryButton");
            C49520tu6.setTextAndVisibility$default(button2, obtainStyledAttributes.getString(C34290Ll4.CallToActionLayout_secondaryCallToActionText), 0, 2, null);
            if (!obtainStyledAttributes.getBoolean(C34290Ll4.CallToActionLayout_applyDefaultTopMargin, true)) {
                LinearLayout linearLayout = m82949a.f36127f;
                linearLayout.setPadding(linearLayout.getPaddingLeft(), 0, m82949a.f36127f.getPaddingRight(), m82949a.f36127f.getPaddingBottom());
            }
            obtainStyledAttributes.recycle();
            m82949a.f36126e.setMovementMethod(new LinkMovementMethod());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
