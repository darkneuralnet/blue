package co.bird.android.widget;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.ControlButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 :2\u00020\u0001:\u0003\u000e\u0013\u001bB\u0011\b\u0016\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106B\u001b\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b5\u00107B#\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u00108\u001a\u00020\u0002¢\u0006\u0004\b5\u00109J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR*\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010!\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010&\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010,\u001a\u00020'2\u0006\u0010\u0012\u001a\u00020'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u00102\u001a\u0004\u0018\u00010-2\b\u0010\u0012\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006;"}, m28432d2 = {"Lco/bird/android/widget/ControlButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "", "contentDescription", "setContentDescription", "Landroid/util/AttributeSet;", "attrs", "h", "Lqt6;", "b", "Lqt6;", "binding", "Lco/bird/android/widget/ControlButton$b;", "value", "c", "Lco/bird/android/widget/ControlButton$b;", "getCallToAction", "()Lco/bird/android/widget/ControlButton$b;", "setCallToAction", "(Lco/bird/android/widget/ControlButton$b;)V", "callToAction", "Lco/bird/android/widget/ControlButton$d;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/widget/ControlButton$d;", "g", "()Lco/bird/android/widget/ControlButton$d;", "setStyle", "(Lco/bird/android/widget/ControlButton$d;)V", "style", "getActionText", "()Ljava/lang/CharSequence;", "setActionText", "(Ljava/lang/CharSequence;)V", "actionText", "", "getInProgress", "()Z", "setInProgress", "(Z)V", "inProgress", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "icon", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "e", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nControlButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlButton.kt\nco/bird/android/widget/ControlButton\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,134:1\n260#2:135\n*S KotlinDebug\n*F\n+ 1 ControlButton.kt\nco/bird/android/widget/ControlButton\n*L\n65#1:135\n*E\n"})
/* loaded from: classes4.dex */
public final class ControlButton extends ConstraintLayout {

    /* renamed from: e */
    public static final C16490c f67269e = new C16490c(null);

    /* renamed from: b */
    public final C47732qt6 f67270b;

    /* renamed from: c */
    public EnumC16489b f67271c;

    /* renamed from: d */
    public EnumC16491d f67272d;

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, m28432d2 = {"co/bird/android/widget/ControlButton$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.ControlButton$a */
    /* loaded from: classes4.dex */
    public static final class C16487a extends ViewOutlineProvider {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.widget.ControlButton$a$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C16488a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC16491d.values().length];
                try {
                    iArr[EnumC16491d.CIRCLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC16491d.PILL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C16487a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int i = C16488a.$EnumSwitchMapping$0[ControlButton.this.m54636g().ordinal()];
            if (i != 1) {
                if (i == 2 && outline != null) {
                    outline.setRoundRect(ControlButton.this.getBackground().getBounds(), C49347td3.m12001b(155));
                }
            } else if (outline != null) {
                outline.setOval(ControlButton.this.getBackground().getBounds());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/widget/ControlButton$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.ControlButton$b */
    /* loaded from: classes4.dex */
    public enum EnumC16489b {
        TEXT,
        ICON
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lco/bird/android/widget/ControlButton$c;", "", "", "CIRCLE_SIZE_DP", "I", "PILL_HEIGHT_DP", "PILL_RADIUS_DP", "PILL_WIDTH_DP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.ControlButton$c */
    /* loaded from: classes4.dex */
    public static final class C16490c {
        public /* synthetic */ C16490c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16490c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/widget/ControlButton$d;", "", "", "b", "I", "()I", "resId", "<init>", "(Ljava/lang/String;II)V", "c", DateTokenConverter.CONVERTER_KEY, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.ControlButton$d */
    /* loaded from: classes4.dex */
    public enum EnumC16491d {
        CIRCLE(C33309Hg4.control_background_circle),
        PILL(C33309Hg4.control_background_pill);
        

        /* renamed from: b */
        public final int f67280b;

        EnumC16491d(int i) {
            this.f67280b = i;
        }

        /* renamed from: b */
        public final int m54631b() {
            return this.f67280b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlButton(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C47732qt6 m16805b = C47732qt6.m16805b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m16805b, "inflate(context.layoutInflater, this)");
        this.f67270b = m16805b;
        this.f67271c = EnumC16489b.TEXT;
        this.f67272d = EnumC16491d.CIRCLE;
        LayoutInflater.from(getContext()).inflate(C45268mk4.view_ride_control, this);
        setOutlineProvider(new C16487a());
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), C40474ef4.flat_button_anim));
        post(new Runnable() { // from class: mB0
            @Override // java.lang.Runnable
            public final void run() {
                ControlButton.m54637f(ControlButton.this);
            }
        });
    }

    /* renamed from: f */
    public static final void m54637f(ControlButton this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.invalidateOutline();
    }

    /* renamed from: i */
    public static final int m54634i(int i) {
        return View.MeasureSpec.getMode(i);
    }

    /* renamed from: g */
    public final EnumC16491d m54636g() {
        return this.f67272d;
    }

    /* renamed from: h */
    public final void m54635h(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.ControlButton);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr….styleable.ControlButton)");
        try {
            setStyle(EnumC16491d.values()[obtainStyledAttributes.getInt(C34290Ll4.ControlButton_controlStyle, 0)]);
            setCallToAction(EnumC16489b.values()[obtainStyledAttributes.getInt(C34290Ll4.ControlButton_callToAction, 0)]);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (m54634i(i) != 1073741824) {
            EnumC16491d enumC16491d = this.f67272d;
            if (enumC16491d == EnumC16491d.CIRCLE) {
                i = View.MeasureSpec.makeMeasureSpec((int) C49347td3.m12001b(115), 1073741824);
            } else if (enumC16491d == EnumC16491d.PILL) {
                i = View.MeasureSpec.makeMeasureSpec((int) C49347td3.m12001b(232), 1073741824);
            }
        }
        if (m54634i(i2) != 1073741824) {
            EnumC16491d enumC16491d2 = this.f67272d;
            if (enumC16491d2 == EnumC16491d.CIRCLE) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) C49347td3.m12001b(115), 1073741824);
            } else if (enumC16491d2 == EnumC16491d.PILL) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) C49347td3.m12001b(48), 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setActionText(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67270b.f106040b.setText(value);
    }

    public final void setCallToAction(EnumC16489b value) {
        boolean z;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67271c = value;
        AppCompatTextView appCompatTextView = this.f67270b.f106040b;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.action");
        boolean z2 = true;
        if (this.f67271c == EnumC16489b.TEXT) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(appCompatTextView, z, 0, 2, null);
        AppCompatImageView appCompatImageView = this.f67270b.f106041c;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.actionIcon");
        if (this.f67271c != EnumC16489b.ICON) {
            z2 = false;
        }
        C49520tu6.show$default(appCompatImageView, z2, 0, 2, null);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(getContext().getString(C45871nl4.accessibility_button_format, charSequence));
    }

    public final void setIcon(Drawable drawable) {
        this.f67270b.f106041c.setImageDrawable(drawable);
    }

    public final void setInProgress(boolean z) {
        setClickable(!z);
        CircularProgressIndicator circularProgressIndicator = this.f67270b.f106042d;
        Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "binding.progressCircle");
        C49520tu6.show$default(circularProgressIndicator, z, 0, 2, null);
    }

    public final void setStyle(EnumC16491d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67272d = value;
        setBackgroundResource(value.m54631b());
        invalidateOutline();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C47732qt6 m16805b = C47732qt6.m16805b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m16805b, "inflate(context.layoutInflater, this)");
        this.f67270b = m16805b;
        this.f67271c = EnumC16489b.TEXT;
        this.f67272d = EnumC16491d.CIRCLE;
        LayoutInflater.from(getContext()).inflate(C45268mk4.view_ride_control, this);
        setOutlineProvider(new C16487a());
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), C40474ef4.flat_button_anim));
        post(new Runnable() { // from class: mB0
            @Override // java.lang.Runnable
            public final void run() {
                ControlButton.m54637f(ControlButton.this);
            }
        });
        m54635h(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C47732qt6 m16805b = C47732qt6.m16805b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m16805b, "inflate(context.layoutInflater, this)");
        this.f67270b = m16805b;
        this.f67271c = EnumC16489b.TEXT;
        this.f67272d = EnumC16491d.CIRCLE;
        LayoutInflater.from(getContext()).inflate(C45268mk4.view_ride_control, this);
        setOutlineProvider(new C16487a());
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), C40474ef4.flat_button_anim));
        post(new Runnable() { // from class: mB0
            @Override // java.lang.Runnable
            public final void run() {
                ControlButton.m54637f(ControlButton.this);
            }
        });
        m54635h(attributeSet);
    }
}
