package co.bird.android.widget.actions;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.card.MaterialCardView;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/widget/actions/BirdActionButton;", "Lcom/google/android/material/card/MaterialCardView;", "", "s", "I", "imageSize", "t", "padding", "Landroid/widget/ImageView;", "u", "Landroid/widget/ImageView;", Entry.TYPE_IMAGE, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdActionsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdActionsView.kt\nco/bird/android/widget/actions/BirdActionButton\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,225:1\n52#2,9:226\n*S KotlinDebug\n*F\n+ 1 BirdActionsView.kt\nco/bird/android/widget/actions/BirdActionButton\n*L\n220#1:226,9\n*E\n"})
/* loaded from: classes4.dex */
public final class BirdActionButton extends MaterialCardView {

    /* renamed from: s */
    public final int f67721s;

    /* renamed from: t */
    public final int f67722t;

    /* renamed from: u */
    public final ImageView f67723u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BirdActionButton(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BirdActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BirdActionButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BirdActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int m11240k = C49520tu6.m11240k(this, C37278Yf4.bird_action_button_image_size);
        this.f67721s = m11240k;
        int m11240k2 = C49520tu6.m11240k(this, C37278Yf4.bird_action_button_image_padding);
        this.f67722t = m11240k2;
        ImageView imageView = new ImageView(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(m11240k, m11240k);
        marginLayoutParams.setMargins(m11240k2, m11240k2, m11240k2, m11240k2);
        imageView.setLayoutParams(marginLayoutParams);
        imageView.setImageTintList(ColorStateList.valueOf(-1));
        this.f67723u = imageView;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setCardElevation(0.0f);
        setClickable(true);
        setCardBackgroundColor(C49520tu6.m11241j(this, C32364Df4.bird_action_button_background));
        setStrokeColor(C49520tu6.m11241j(this, C32364Df4.bird_action_button_outline));
        setStrokeWidth(C49520tu6.m11240k(this, C37278Yf4.bird_action_button_stroke_width));
        setRadius(m11240k + ((m11240k2 * 2) / 2.0f));
        addView(imageView);
        int[] BirdActionButton = C34290Ll4.BirdActionButton;
        Intrinsics.checkNotNullExpressionValue(BirdActionButton, "BirdActionButton");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BirdActionButton, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        imageView.setImageDrawable(C33032Gb6.m104981c(obtainStyledAttributes, C34290Ll4.BirdActionButton_src));
        obtainStyledAttributes.recycle();
    }
}
