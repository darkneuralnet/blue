package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import ch.qos.logback.core.CoreConstants;
import com.afollestad.materialdialogs.C16848R;
import com.afollestad.materialdialogs.ThemeKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.afollestad.materialdialogs.utils.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J%\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0014J\u0010\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u0016\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0018"}, m28432d2 = {"Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "Landroidx/appcompat/widget/AppCompatButton;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "disabledColor", "", "enabledColor", "enabledColorOverride", "Ljava/lang/Integer;", "setEnabled", "", "enabled", "", "update", "baseContext", "appContext", "stacked", "update$core", "updateTextColor", "color", "Companion", "core"}, m28431k = 1, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogActionButton extends AppCompatButton {
    private static final int CASING_UPPER = 1;
    public static final Companion Companion = new Companion(null);
    private int disabledColor;
    private int enabledColor;
    private Integer enabledColorOverride;

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/afollestad/materialdialogs/internal/button/DialogActionButton$Companion;", "", "()V", "CASING_UPPER", "", "core"}, m28431k = 1, m28430mv = {1, 1, 16})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DialogActionButton(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            Integer num = this.enabledColorOverride;
            if (num != null) {
                i = num.intValue();
            } else {
                i = this.enabledColor;
            }
        } else {
            i = this.disabledColor;
        }
        setTextColor(i);
    }

    public final void update$core(Context context, Context context2, boolean z) {
        int i;
        int i2;
        int resolveColor$default;
        MDUtil mDUtil = MDUtil.INSTANCE;
        boolean z2 = true;
        if (mDUtil.resolveInt(context2, C16848R.attr.md_button_casing, 1) != 1) {
            z2 = false;
        }
        setSupportAllCaps(z2);
        boolean inferThemeIsLight = ThemeKt.inferThemeIsLight(context2);
        this.enabledColor = MDUtil.resolveColor$default(mDUtil, context2, null, Integer.valueOf(C16848R.attr.md_color_button_text), new DialogActionButton$update$1(context2), 2, null);
        if (inferThemeIsLight) {
            i = C16848R.color.md_disabled_text_light_theme;
        } else {
            i = C16848R.color.md_disabled_text_dark_theme;
        }
        this.disabledColor = MDUtil.resolveColor$default(mDUtil, context, Integer.valueOf(i), null, null, 12, null);
        Integer num = this.enabledColorOverride;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = this.enabledColor;
        }
        setTextColor(i2);
        Drawable resolveDrawable$default = MDUtil.resolveDrawable$default(mDUtil, context, null, Integer.valueOf(C16848R.attr.md_button_selector), null, 10, null);
        if ((resolveDrawable$default instanceof RippleDrawable) && (resolveColor$default = MDUtil.resolveColor$default(mDUtil, context, null, Integer.valueOf(C16848R.attr.md_ripple_color), new DialogActionButton$update$2(context2), 2, null)) != 0) {
            ((RippleDrawable) resolveDrawable$default).setColor(ColorStateList.valueOf(resolveColor$default));
        }
        setBackground(resolveDrawable$default);
        if (z) {
            ViewsKt.setGravityEndCompat(this);
        } else {
            setGravity(17);
        }
        setEnabled(isEnabled());
    }

    public final void updateTextColor(int i) {
        this.enabledColor = i;
        this.enabledColorOverride = Integer.valueOf(i);
        setEnabled(isEnabled());
    }

    public DialogActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClickable(true);
        setFocusable(true);
    }
}
