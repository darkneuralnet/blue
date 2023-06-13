package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import ch.qos.logback.core.CoreConstants;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012R\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0006J\u0012\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u0006H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/view/StripeColorUtils;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "colorAccent", "", "getColorAccent", "()I", "colorControlNormal", "getColorControlNormal", "textColorPrimary", "getTextColorPrimary", "textColorSecondary", "getTextColorSecondary", "getTintedIconWithAttribute", "Landroid/graphics/drawable/Drawable;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attributeResource", "iconResourceId", "getTypedValue", "Landroid/util/TypedValue;", "idRes", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeColorUtils {
    public static final Companion Companion = new Companion(null);
    private final int colorAccent;
    private final int colorControlNormal;
    private final Context context;
    private final int textColorPrimary;
    private final int textColorSecondary;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/view/StripeColorUtils$Companion;", "", "()V", "isColorDark", "", "color", "", "isColorTransparent", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isColorDark(int i) {
            if ((((Color.red(i) * 0.299d) + (Color.green(i) * 0.587d)) + (Color.blue(i) * 0.114d)) / ((double) KotlinVersion.MAX_COMPONENT_VALUE) <= 0.5d) {
                return true;
            }
            return false;
        }

        public final boolean isColorTransparent(int i) {
            return Color.alpha(i) < 16;
        }

        private Companion() {
        }
    }

    public StripeColorUtils(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.colorAccent = getTypedValue(16843829).data;
        this.colorControlNormal = getTypedValue(16843817).data;
        this.textColorPrimary = getTypedValue(16842806).data;
        this.textColorSecondary = getTypedValue(16842808).data;
    }

    private final TypedValue getTypedValue(int i) {
        TypedValue typedValue = new TypedValue();
        this.context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue;
    }

    public final int getColorAccent() {
        return this.colorAccent;
    }

    public final int getColorControlNormal() {
        return this.colorControlNormal;
    }

    public final int getTextColorPrimary() {
        return this.textColorPrimary;
    }

    public final int getTextColorSecondary() {
        return this.textColorSecondary;
    }

    public final Drawable getTintedIconWithAttribute(Resources.Theme theme, int i, int i2) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        int i3 = typedValue.data;
        Drawable m94299e = NA0.m94299e(this.context, i2);
        Intrinsics.checkNotNull(m94299e);
        Drawable m90834r = P61.m90834r(m94299e);
        Intrinsics.checkNotNullExpressionValue(m90834r, "wrap(icon!!)");
        P61.m90838n(m90834r.mutate(), i3);
        return m90834r;
    }
}
