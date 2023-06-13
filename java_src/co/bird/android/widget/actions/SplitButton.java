package co.bird.android.widget.actions;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.widget.actions.SplitButton;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\f¢\u0006\u0004\b,\u0010-J\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u001a\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ#\u0010\u000f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R(\u0010#\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010&\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"¨\u0006."}, m28432d2 = {"Lco/bird/android/widget/actions/SplitButton;", "Lcom/google/android/material/card/MaterialCardView;", "Lkotlin/Function1;", "Landroid/view/View;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnLeftButtonClickedListener", "setOnRightButtonClickedListener", "", "selected", "setLeftButtonSelected", "setRightButtonSelected", "", "size", "padding", "D", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/widget/FrameLayout;", "s", "Landroid/widget/FrameLayout;", "leftImageContainer", "Landroid/widget/ImageView;", "t", "Landroid/widget/ImageView;", "leftImage", "u", "rightImageContainer", "v", "rightImage", "Landroid/graphics/drawable/Drawable;", "value", "getLeftDrawable", "()Landroid/graphics/drawable/Drawable;", "setLeftDrawable", "(Landroid/graphics/drawable/Drawable;)V", "leftDrawable", "getRightDrawable", "setRightDrawable", "rightDrawable", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSplitButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplitButton.kt\nco/bird/android/widget/actions/SplitButton\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,126:1\n52#2,9:127\n177#3,2:136\n177#3,2:138\n315#3:140\n329#3,4:141\n316#3:145\n315#3:146\n329#3,4:147\n316#3:151\n*S KotlinDebug\n*F\n+ 1 SplitButton.kt\nco/bird/android/widget/actions/SplitButton\n*L\n53#1:127,9\n110#1:136,2\n111#1:138,2\n115#1:140\n115#1:141,4\n115#1:145\n119#1:146\n119#1:147,4\n119#1:151\n*E\n"})
/* loaded from: classes4.dex */
public final class SplitButton extends MaterialCardView {

    /* renamed from: s */
    public final FrameLayout f67789s;

    /* renamed from: t */
    public final ImageView f67790t;

    /* renamed from: u */
    public final FrameLayout f67791u;

    /* renamed from: v */
    public final ImageView f67792v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SplitButton(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: B */
    public static final void m54248B(Function1 tmp0, View view) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(view);
    }

    /* renamed from: C */
    public static final void m54247C(Function1 tmp0, View view) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(view);
    }

    /* renamed from: D */
    public final void m54246D(Integer num, Integer num2) {
        if (num == null && num2 == null) {
            return;
        }
        if (num2 != null) {
            FrameLayout frameLayout = this.f67789s;
            int intValue = num2.intValue();
            frameLayout.setPadding(intValue, intValue, intValue, intValue);
            FrameLayout frameLayout2 = this.f67791u;
            int intValue2 = num2.intValue();
            frameLayout2.setPadding(intValue2, intValue2, intValue2, intValue2);
        }
        if (num != null) {
            ImageView imageView = this.f67790t;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = num.intValue();
                layoutParams.height = num.intValue();
                imageView.setLayoutParams(layoutParams);
                ImageView imageView2 = this.f67792v;
                ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = num.intValue();
                    layoutParams2.height = num.intValue();
                    imageView2.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final void setLeftButtonSelected(boolean z) {
        this.f67789s.setSelected(z);
        this.f67791u.setSelected(!z);
    }

    public final void setLeftDrawable(Drawable drawable) {
        this.f67790t.setImageDrawable(drawable);
    }

    public final void setOnLeftButtonClickedListener(final Function1<? super View, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f67789s.setOnClickListener(new View.OnClickListener() { // from class: ZN5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SplitButton.m54248B(Function1.this, view);
            }
        });
    }

    public final void setOnRightButtonClickedListener(final Function1<? super View, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f67791u.setOnClickListener(new View.OnClickListener() { // from class: YN5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SplitButton.m54247C(Function1.this, view);
            }
        });
    }

    public final void setRightButtonSelected(boolean z) {
        this.f67789s.setSelected(!z);
        this.f67791u.setSelected(z);
    }

    public final void setRightDrawable(Drawable drawable) {
        this.f67792v.setImageDrawable(drawable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SplitButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SplitButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SplitButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setCardBackgroundColor(C49520tu6.m11241j(this, C32364Df4.bird_action_button_background));
        setRadius(C49520tu6.m11240k(this, C37278Yf4.split_button_corner_radius));
        setStrokeWidth(C49520tu6.m11240k(this, C37278Yf4.bird_action_button_stroke_width));
        setStrokeColor(C49520tu6.m11241j(this, C32364Df4.bird_action_button_outline));
        View.inflate(context, C45268mk4.view_split_button, this);
        View findViewById = findViewById(C52955zi4.leftImageContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.leftImageContainer)");
        this.f67789s = (FrameLayout) findViewById;
        View findViewById2 = findViewById(C52955zi4.leftImage);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.leftImage)");
        ImageView imageView = (ImageView) findViewById2;
        this.f67790t = imageView;
        imageView.setImageTintList(ColorStateList.valueOf(-1));
        View findViewById3 = findViewById(C52955zi4.rightImageContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.rightImageContainer)");
        this.f67791u = (FrameLayout) findViewById3;
        View findViewById4 = findViewById(C52955zi4.rightImage);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.rightImage)");
        ImageView imageView2 = (ImageView) findViewById4;
        this.f67792v = imageView2;
        imageView2.setImageTintList(ColorStateList.valueOf(-1));
        int[] SplitButton = C34290Ll4.SplitButton;
        Intrinsics.checkNotNullExpressionValue(SplitButton, "SplitButton");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SplitButton, i, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        int i2 = C34290Ll4.SplitButton_leftButtonDrawable;
        if (obtainStyledAttributes.hasValue(i2)) {
            setLeftDrawable(C33032Gb6.m104981c(obtainStyledAttributes, i2));
            imageView.setContentDescription(obtainStyledAttributes.getString(C34290Ll4.SplitButton_contentDescriptionLeft));
        }
        int i3 = C34290Ll4.SplitButton_rightButtonDrawable;
        if (obtainStyledAttributes.hasValue(i3)) {
            setRightDrawable(C33032Gb6.m104981c(obtainStyledAttributes, i3));
            imageView2.setContentDescription(obtainStyledAttributes.getString(C34290Ll4.SplitButton_contentDescriptionRight));
        }
        int i4 = C34290Ll4.SplitButton_imageSize;
        Integer valueOf = obtainStyledAttributes.hasValue(i4) ? Integer.valueOf(C33032Gb6.m104982b(obtainStyledAttributes, i4)) : null;
        int i5 = C34290Ll4.SplitButton_imagePadding;
        m54246D(valueOf, obtainStyledAttributes.hasValue(i5) ? Integer.valueOf(C33032Gb6.m104982b(obtainStyledAttributes, i5)) : null);
        obtainStyledAttributes.recycle();
    }
}
