package com.stripe.android.stripe3ds2.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.init.p048ui.Customization;
import com.stripe.android.stripe3ds2.init.p048ui.UiCustomization;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\b\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0007J\u0017\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\b\u0018J\u001f\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0018J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0007J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0007J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0016H\u0007J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011H\u0007J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$2\b\b\u0001\u0010%\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;", "", "()V", "DEFAULT_DARKEN_FACTOR", "", "applyProgressBarColor", "", "progressBar", "Landroid/widget/ProgressBar;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "applyProgressBarColor$3ds2sdk_release", "buildStyledText", "Landroid/text/SpannableString;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", Entry.TYPE_TEXT, "", "customization", "Lcom/stripe/android/stripe3ds2/init/ui/Customization;", "colorIntToHex", "color", "", "darken", "darken$3ds2sdk_release", "factor", "requireValidColor", "hexColor", "requireValidDimension", "dimension", "requireValidFontSize", "fontSize", "requireValidString", "string", "setStatusBarColor", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "statusBarColor", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CustomizeUtils {
    private static final float DEFAULT_DARKEN_FACTOR = 0.8f;
    public static final CustomizeUtils INSTANCE = new CustomizeUtils();

    private CustomizeUtils() {
    }

    @JvmStatic
    public static final String colorIntToHex(int i) {
        int alpha = Color.alpha(i);
        int blue = Color.blue(i);
        int green = Color.green(i);
        int red = Color.red(i);
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.ENGLISH;
        String format = String.format(locale, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(alpha)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        sb.append(format);
        String format2 = String.format(locale, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(red)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(locale, format, *args)");
        sb.append(format2);
        String format3 = String.format(locale, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(green)}, 1));
        Intrinsics.checkNotNullExpressionValue(format3, "format(locale, format, *args)");
        sb.append(format3);
        String format4 = String.format(locale, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(blue)}, 1));
        Intrinsics.checkNotNullExpressionValue(format4, "format(locale, format, *args)");
        sb.append(format4);
        return sb.toString();
    }

    @JvmStatic
    public static final String requireValidColor(String hexColor) throws InvalidInputException {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(hexColor, "hexColor");
        try {
            Result.Companion companion = Result.Companion;
            Color.parseColor(hexColor);
            m116783constructorimpl = Result.m116783constructorimpl(hexColor);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m116786exceptionOrNullimpl(m116783constructorimpl) == null) {
            return (String) m116783constructorimpl;
        }
        throw new InvalidInputException("Unable to parse color: " + hexColor, null, 2, null);
    }

    @JvmStatic
    public static final int requireValidDimension(int i) throws InvalidInputException {
        if (i >= 0) {
            return i;
        }
        throw new InvalidInputException("Dimension must be greater or equal to 0", null, 2, null);
    }

    @JvmStatic
    public static final int requireValidFontSize(int i) throws InvalidInputException {
        if (i > 0) {
            return i;
        }
        throw new InvalidInputException("Font size must be greater than 0", null, 2, null);
    }

    @JvmStatic
    public static final String requireValidString(String string) throws InvalidInputException {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(string, "string");
        isBlank = StringsKt__StringsJVMKt.isBlank(string);
        if (!isBlank) {
            return string;
        }
        throw new InvalidInputException("String must not be null or empty", null, 2, null);
    }

    public final void applyProgressBarColor$3ds2sdk_release(ProgressBar progressBar, UiCustomization uiCustomization) {
        String accentColor;
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        if (uiCustomization != null && (accentColor = uiCustomization.getAccentColor()) != null) {
            progressBar.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor(accentColor)));
        }
    }

    public final SpannableString buildStyledText(Context context, String text, Customization customization) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(customization, "customization");
        SpannableString spannableString = new SpannableString(text);
        String textColor = customization.getTextColor();
        if (textColor != null) {
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(textColor)), 0, spannableString.length(), 0);
        }
        Integer valueOf = Integer.valueOf(customization.getTextFontSize());
        if (valueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            spannableString.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, valueOf.intValue(), context.getResources().getDisplayMetrics())), 0, spannableString.length(), 0);
        }
        String textFontName = customization.getTextFontName();
        if (textFontName != null) {
            spannableString.setSpan(new TypefaceSpan(textFontName), 0, spannableString.length(), 0);
        }
        return spannableString;
    }

    public final int darken$3ds2sdk_release(int i, float f) {
        return Color.argb(Color.alpha(i), Math.min(Math.max((int) (Color.red(i) * f), 0), (int) KotlinVersion.MAX_COMPONENT_VALUE), Math.min(Math.max((int) (Color.green(i) * f), 0), (int) KotlinVersion.MAX_COMPONENT_VALUE), Math.min(Math.max((int) (Color.blue(i) * f), 0), (int) KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public final void setStatusBarColor(AppCompatActivity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getWindow().setStatusBarColor(i);
    }

    public final int darken$3ds2sdk_release(int i) {
        return darken$3ds2sdk_release(i, DEFAULT_DARKEN_FACTOR);
    }
}
