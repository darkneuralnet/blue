package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.Button;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.p027ui.R$dimen;
import com.appboy.p027ui.R$drawable;
import com.appboy.p027ui.R$id;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0007J0\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¨\u0006\u001b"}, m28432d2 = {"LiZ1;", "", "", "Landroid/view/View;", "buttonViews", "LmT2;", "messageButtons", "", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "button", "messageButton", "", "strokeWidth", "strokeFocusedWidth", "c", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "drawableId", "Landroid/graphics/drawable/Drawable;", "b", "newStrokeWidth", "", "isFocused", C17296a.f69688o, "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: iZ1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42784iZ1 {

    /* renamed from: a */
    public static final C42784iZ1 f87474a = new C42784iZ1();

    private C42784iZ1() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Drawable m33809a(Context context, C45103mT2 messageButton, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        Drawable m33808b = m33808b(context, R$drawable.com_braze_inappmessage_button_background);
        m33808b.mutate();
        Drawable findDrawableByLayerId = ((RippleDrawable) m33808b).findDrawableByLayerId(R$id.com_braze_inappmessage_button_background_ripple_internal_gradient);
        if (findDrawableByLayerId != null) {
            GradientDrawable gradientDrawable = (GradientDrawable) findDrawableByLayerId;
            if (z) {
                i = i2;
            }
            gradientDrawable.setStroke(i, messageButton.m25550w());
            gradientDrawable.setColor(messageButton.getBackgroundColor());
            return m33808b;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
    }

    @JvmStatic
    /* renamed from: b */
    public static final Drawable m33808b(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = context.getResources().getDrawable(i);
        Intrinsics.checkNotNullExpressionValue(drawable, "context.resources.getDrawable(drawableId)");
        return drawable;
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m33807c(Button button, C45103mT2 messageButton, int i, int i2) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        button.setText(messageButton.m25547z());
        button.setContentDescription(messageButton.m25547z());
        DZ1.m110179i(button, messageButton.m25557A());
        StateListDrawable stateListDrawable = new StateListDrawable();
        button.setStateListAnimator(null);
        Context context = button.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "button.context");
        Drawable m33809a = m33809a(context, messageButton, i, i2, false);
        Context context2 = button.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "button.context");
        stateListDrawable.addState(new int[]{16842908}, m33809a(context2, messageButton, i, i2, true));
        stateListDrawable.addState(new int[]{16842910}, m33809a);
        button.setBackground(stateListDrawable);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m33806d(List<? extends View> buttonViews, List<? extends C45103mT2> messageButtons) {
        Intrinsics.checkNotNullParameter(buttonViews, "buttonViews");
        Intrinsics.checkNotNullParameter(messageButtons, "messageButtons");
        int size = buttonViews.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            View view = buttonViews.get(i);
            C45103mT2 c45103mT2 = messageButtons.get(i);
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_button_border_stroke);
            int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(R$dimen.com_braze_inappmessage_button_border_stroke_focused);
            if (messageButtons.size() <= i) {
                view.setVisibility(8);
            } else if (view instanceof Button) {
                m33807c((Button) view, c45103mT2, dimensionPixelSize, dimensionPixelSize2);
            }
            i = i2;
        }
    }
}
