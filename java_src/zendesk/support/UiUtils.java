package zendesk.support;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.Locale;
/* loaded from: classes8.dex */
public class UiUtils {
    private static UiUtils IMPL = new UiUtils();
    private static final String LOG_TAG = "UiUtils";

    private UiUtils() {
    }

    public static CharSequence decodeHtmlEntities(String str) {
        return Html.fromHtml(str, 0);
    }

    public static void dismissKeyboard(Activity activity) {
        IMPL.internalDismissKeyboard(activity);
    }

    public static int resolveColor(int i, Context context) {
        return IMPL.internalResolveColor(i, context);
    }

    public static void setTint(int i, Drawable drawable, View view) {
        IMPL.internalSetTint(i, drawable, view);
    }

    public static void setUiUtils(UiUtils uiUtils) {
        IMPL = uiUtils;
    }

    public static void setVisibility(View view, int i) {
        if (view == null) {
            C33694Ix2.m101447l(LOG_TAG, "View is null and can't change visibility", new Object[0]);
        } else {
            view.setVisibility(i);
        }
    }

    public static void showKeyboard(View view) {
        IMPL.internalShowKeyboard(view);
    }

    public static int themeAttributeToColor(int i, Context context, int i2) {
        return IMPL.internalThemeAttributeToColor(i, context, i2);
    }

    public void internalDismissKeyboard(Activity activity) {
        if (activity == null) {
            C33694Ix2.m101447l(LOG_TAG, "Cannot dismiss the keyboard when fragment is detached or the activity is null.", new Object[0]);
            return;
        }
        Object systemService = activity.getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                return;
            } else {
                C33694Ix2.m101447l(LOG_TAG, "Cannot hide soft input because window token could not be obtained", new Object[0]);
                return;
            }
        }
        C33694Ix2.m101447l(LOG_TAG, "Cannot hide soft input because we could not get the InputMethodManager", new Object[0]);
    }

    public int internalResolveColor(int i, Context context) {
        return NA0.m94301c(context, i);
    }

    public void internalSetTint(int i, Drawable drawable, View view) {
        if (drawable == null) {
            C33694Ix2.m101454e(LOG_TAG, "Drawable is null, cannot apply a tint", new Object[0]);
            return;
        }
        P61.m90838n(P61.m90834r(drawable).mutate(), i);
        if (view != null) {
            view.invalidate();
        }
    }

    public void internalShowKeyboard(View view) {
        if (view == null) {
            C33694Ix2.m101447l(LOG_TAG, "Cannot show soft input because window token could not be obtained", new Object[0]);
            return;
        }
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            ((InputMethodManager) systemService).showSoftInput(view, 1);
        } else {
            C33694Ix2.m101447l(LOG_TAG, "Cannot hide soft input because we could not get the InputMethodManager", new Object[0]);
        }
    }

    public int internalThemeAttributeToColor(int i, Context context, int i2) {
        if (i != 0 && context != null && i2 != 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
                C33694Ix2.m101454e(LOG_TAG, String.format(Locale.US, "Resource %d not found. Resource is either missing or you are using a non-ui context.", Integer.valueOf(i)), new Object[0]);
                return resolveColor(i2, context);
            }
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                return typedValue.data;
            }
            return resolveColor(i3, context);
        }
        C33694Ix2.m101457b(LOG_TAG, "themeAttributeId, context, and fallbackColorId are required.", new Object[0]);
        return -16777216;
    }

    public int internalThemeAttributeToPixels(int i, Context context, int i2, float f) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            C33694Ix2.m101454e(LOG_TAG, String.format(Locale.US, "Resource %d not found. Resource is either missing or you are using a non-ui context.", Integer.valueOf(i)), new Object[0]);
            return Math.round(TypedValue.applyDimension(i2, f, context.getResources().getDisplayMetrics()));
        }
        return Math.round(typedValue.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static void dismissKeyboard(View view) {
        IMPL.internalDismissKeyboard(view);
    }

    public void internalDismissKeyboard(View view) {
        if (view == null) {
            C33694Ix2.m101447l(LOG_TAG, "Cannot hide soft input because window token could not be obtained", new Object[0]);
            return;
        }
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } else {
            C33694Ix2.m101447l(LOG_TAG, "Cannot hide soft input because we could not get the InputMethodManager", new Object[0]);
        }
    }
}
