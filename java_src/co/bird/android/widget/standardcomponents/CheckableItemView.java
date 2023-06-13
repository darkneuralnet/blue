package co.bird.android.widget.standardcomponents;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0002L\u001cB\u0011\b\u0016\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HB\u0019\b\u0016\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bG\u0010IB!\b\u0016\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010J\u001a\u00020\u000b¢\u0006\u0004\bG\u0010KJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0017J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010+\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u00102\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00105\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R(\u0010;\u001a\u0004\u0018\u0001062\b\u0010-\u001a\u0004\u0018\u0001068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010A\u001a\u0004\u0018\u00010<2\b\u0010-\u001a\u0004\u0018\u00010<8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R(\u0010D\u001a\u0004\u0018\u0001062\b\u0010-\u001a\u0004\u0018\u0001068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u00108\"\u0004\bC\u0010:¨\u0006M"}, m28432d2 = {"Lco/bird/android/widget/standardcomponents/CheckableItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/Checkable;", "", "isChecked", "checked", "", "setChecked", "toggle", "enabled", "setEnabled", "", "extraSpace", "", "onCreateDrawableState", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "Lqi0;", "viewModel", "e", "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCheckChangedListener", "Landroid/util/AttributeSet;", "attrs", "f", "LXp6;", "b", "LXp6;", "binding", "LZj0;", "c", "LZj0;", "detector", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;", "checkedChangeListener", "Z", "getCanUncheck", "()Z", "setCanUncheck", "(Z)V", "canUncheck", "", "value", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "title", "getDetails", "setDetails", "details", "Landroid/content/res/ColorStateList;", "getTitleColor", "()Landroid/content/res/ColorStateList;", "setTitleColor", "(Landroid/content/res/ColorStateList;)V", "titleColor", "Landroid/graphics/drawable/Drawable;", "getButtonDrawable", "()Landroid/graphics/drawable/Drawable;", "setButtonDrawable", "(Landroid/graphics/drawable/Drawable;)V", "buttonDrawable", "getButtonTintList", "setButtonTintList", "buttonTintList", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCheckableItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckableItemView.kt\nco/bird/android/widget/standardcomponents/CheckableItemView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
/* loaded from: classes4.dex */
public final class CheckableItemView extends ConstraintLayout implements Checkable {

    /* renamed from: f */
    public static final C16698a f68118f = new C16698a(null);

    /* renamed from: g */
    public static final int[] f68119g = {16842912};

    /* renamed from: b */
    public final C37136Xp6 f68120b;

    /* renamed from: c */
    public final C37544Zj0 f68121c;

    /* renamed from: d */
    public InterfaceC16699b f68122d;

    /* renamed from: e */
    public boolean f68123e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/standardcomponents/CheckableItemView$a;", "", "", "CHECKED_STATE_LIST", "[I", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.standardcomponents.CheckableItemView$a */
    /* loaded from: classes4.dex */
    public static final class C16698a {
        public /* synthetic */ C16698a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16698a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, m28432d2 = {"Lco/bird/android/widget/standardcomponents/CheckableItemView$b;", "", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "view", "", "isChecked", "", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.standardcomponents.CheckableItemView$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC16699b {
        /* renamed from: a */
        void mo3842a(CheckableItemView checkableItemView, boolean z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckableItemView(Context context) {
        super(context);
        int paddingTop;
        int paddingBottom;
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C37136Xp6 m76229b = C37136Xp6.m76229b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m76229b, "inflate(context.layoutInflater, this)");
        this.f68120b = m76229b;
        if (getPaddingTop() == 0) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            paddingTop = C40788fB0.m41774h(context3, C37044Xf4.activity_vertical_margin);
        } else {
            paddingTop = getPaddingTop();
        }
        if (getPaddingBottom() == 0) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            paddingBottom = C40788fB0.m41774h(context4, C37044Xf4.activity_vertical_margin);
        } else {
            paddingBottom = getPaddingBottom();
        }
        setPadding(0, paddingTop, 0, paddingBottom);
        setBackground(NA0.m94299e(getContext(), C33309Hg4.ripple_white));
        C38790bq6.m62551B0(this, NA0.m94300d(getContext(), C32364Df4.work_order_item_background_state_list));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        this.f68121c = new C37544Zj0(context5);
        this.f68123e = true;
    }

    /* renamed from: e */
    public final void m53967e(AbstractC47616qi0 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        setTitle(viewModel.mo3247d());
        setDetails(viewModel.mo3249b());
        setChecked(viewModel.mo3250a());
        setEnabled(viewModel.mo3248c());
    }

    /* renamed from: f */
    public final void m53966f(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C34290Ll4.CheckableItemView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyl…temView,\n      0, 0\n    )");
        setChecked(obtainStyledAttributes.getBoolean(C34290Ll4.CheckableItemView_android_checked, false));
        setTitle(obtainStyledAttributes.getString(C34290Ll4.CheckableItemView_android_title));
        setDetails(obtainStyledAttributes.getString(C34290Ll4.CheckableItemView_android_description));
        Drawable drawable = obtainStyledAttributes.getDrawable(C34290Ll4.CheckableItemView_android_button);
        if (drawable == null) {
            drawable = NA0.m94299e(getContext(), C33309Hg4.checkbox_work_order_item);
        }
        setButtonDrawable(drawable);
        setButtonTintList(obtainStyledAttributes.getColorStateList(C34290Ll4.CheckableItemView_buttonTint));
        setTitleColor(obtainStyledAttributes.getColorStateList(C34290Ll4.CheckableItemView_titleColor));
        this.f68123e = obtainStyledAttributes.getBoolean(C34290Ll4.CheckableItemView_canUncheck, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f68120b.f44044b.isChecked();
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] drawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(drawableState, f68119g);
        }
        Intrinsics.checkNotNullExpressionValue(drawableState, "drawableState");
        return drawableState;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        drawableHotspotChanged(event.getX(), event.getY());
        int action = event.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                setPressed(false);
            }
        } else {
            setPressed(true);
        }
        if ((this.f68123e || !isChecked()) && this.f68121c.m72646a(event) && isEnabled()) {
            toggle();
            performClick();
        }
        return true;
    }

    public final void setButtonDrawable(Drawable drawable) {
        this.f68120b.f44044b.setBackground(drawable);
    }

    public final void setButtonTintList(ColorStateList colorStateList) {
        this.f68120b.f44044b.setBackgroundTintList(colorStateList);
    }

    public final void setCanUncheck(boolean z) {
        this.f68123e = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f68120b.f44044b.setChecked(z);
        refreshDrawableState();
        InterfaceC16699b interfaceC16699b = this.f68122d;
        if (interfaceC16699b != null && interfaceC16699b != null) {
            interfaceC16699b.mo3842a(this, isChecked());
        }
        setSelected(z);
    }

    public final void setDetails(CharSequence charSequence) {
        boolean z;
        boolean isBlank;
        this.f68120b.f44045c.setText(charSequence);
        TextView textView = this.f68120b.f44045c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.details");
        if (charSequence != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
            if (!isBlank) {
                z = false;
                C49520tu6.show$default(textView, !z, 0, 2, null);
            }
        }
        z = true;
        C49520tu6.show$default(textView, !z, 0, 2, null);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f68120b.f44046d.setEnabled(z);
        this.f68120b.f44045c.setEnabled(z);
    }

    public final void setOnCheckChangedListener(InterfaceC16699b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f68122d = listener;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f68120b.f44046d.setText(charSequence);
    }

    public final void setTitleColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            TextView textView = this.f68120b.f44046d;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.title");
            textView.setTextColor(colorStateList);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckableItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        int paddingTop;
        int paddingBottom;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C37136Xp6 m76229b = C37136Xp6.m76229b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m76229b, "inflate(context.layoutInflater, this)");
        this.f68120b = m76229b;
        if (getPaddingTop() == 0) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            paddingTop = C40788fB0.m41774h(context3, C37044Xf4.activity_vertical_margin);
        } else {
            paddingTop = getPaddingTop();
        }
        if (getPaddingBottom() == 0) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            paddingBottom = C40788fB0.m41774h(context4, C37044Xf4.activity_vertical_margin);
        } else {
            paddingBottom = getPaddingBottom();
        }
        setPadding(0, paddingTop, 0, paddingBottom);
        setBackground(NA0.m94299e(getContext(), C33309Hg4.ripple_white));
        C38790bq6.m62551B0(this, NA0.m94300d(getContext(), C32364Df4.work_order_item_background_state_list));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        this.f68121c = new C37544Zj0(context5);
        this.f68123e = true;
        m53966f(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckableItemView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        int paddingTop;
        int paddingBottom;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C37136Xp6 m76229b = C37136Xp6.m76229b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m76229b, "inflate(context.layoutInflater, this)");
        this.f68120b = m76229b;
        if (getPaddingTop() == 0) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            paddingTop = C40788fB0.m41774h(context3, C37044Xf4.activity_vertical_margin);
        } else {
            paddingTop = getPaddingTop();
        }
        if (getPaddingBottom() == 0) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            paddingBottom = C40788fB0.m41774h(context4, C37044Xf4.activity_vertical_margin);
        } else {
            paddingBottom = getPaddingBottom();
        }
        setPadding(0, paddingTop, 0, paddingBottom);
        setBackground(NA0.m94299e(getContext(), C33309Hg4.ripple_white));
        C38790bq6.m62551B0(this, NA0.m94300d(getContext(), C32364Df4.work_order_item_background_state_list));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        this.f68121c = new C37544Zj0(context5);
        this.f68123e = true;
        m53966f(attrs);
    }
}
