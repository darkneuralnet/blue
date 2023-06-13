package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.stripe.android.financialconnections.domain.Entry;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import net.danlew.android.joda.DateUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: nr6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C45933nr6 {

    /* renamed from: a */
    public static final String f100925a = "nr6";

    /* renamed from: b */
    public static WeakReference<View> f100926b = new WeakReference<>(null);

    /* renamed from: c */
    public static Method f100927c = null;

    /* renamed from: a */
    public static View m22291a(View view) {
        if (TD0.m84203d(C45933nr6.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (m22275q(view)) {
                    return view;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } catch (Throwable th) {
                TD0.m84205b(th, C45933nr6.class);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static List<View> m22290b(View view) {
        if (TD0.m84203d(C45933nr6.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(viewGroup.getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return null;
        }
    }

    /* renamed from: c */
    public static int m22289c(View view) {
        int i;
        if (TD0.m84203d(C45933nr6.class)) {
            return 0;
        }
        try {
            if (view instanceof ImageView) {
                i = 2;
            } else {
                i = 0;
            }
            if (view.isClickable()) {
                i |= 32;
            }
            if (m22277o(view)) {
                i |= 512;
            }
            if (view instanceof TextView) {
                int i2 = i | 1024 | 1;
                if (view instanceof Button) {
                    i2 |= 4;
                    if (view instanceof Switch) {
                        i2 |= 8192;
                    } else if (view instanceof CheckBox) {
                        i2 |= DateUtils.FORMAT_ABBREV_WEEKDAY;
                    }
                }
                if (view instanceof EditText) {
                    return i2 | 2048;
                }
                return i2;
            }
            if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                if (view instanceof RatingBar) {
                    return i | 65536;
                }
                if (view instanceof RadioGroup) {
                    return i | 16384;
                }
                if ((view instanceof ViewGroup) && m22276p(view, f100926b.get())) {
                    return i | 64;
                }
                return i;
            }
            return i | 4096;
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return 0;
        }
    }

    /* renamed from: d */
    public static JSONObject m22288d(View view) {
        if (TD0.m84203d(C45933nr6.class)) {
            return null;
        }
        try {
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                f100926b = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m22273s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> m22290b = m22290b(view);
                for (int i = 0; i < m22290b.size(); i++) {
                    jSONArray.put(m22288d(m22290b.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e) {
                Log.e(f100925a, "Failed to create JSONObject for view.", e);
            }
            return jSONObject;
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return null;
        }
    }

    /* renamed from: e */
    public static JSONObject m22287e(View view) {
        if (TD0.m84203d(C45933nr6.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e) {
                Log.e(f100925a, "Failed to create JSONObject for dimension.", e);
            }
            return jSONObject;
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return null;
        }
    }

    /* renamed from: f */
    public static Class<?> m22286f(String str) {
        if (TD0.m84203d(C45933nr6.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return null;
        }
    }

    /* renamed from: g */
    public static View.OnClickListener m22285g(View view) {
        Field declaredField;
        if (TD0.m84203d(C45933nr6.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnClickListener) declaredField.get(obj);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return null;
        }
    }

    /* renamed from: h */
    public static View.OnTouchListener m22284h(View view) {
        Field declaredField;
        try {
            if (TD0.m84203d(C45933nr6.class)) {
                return null;
            }
            try {
                Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
                Object obj = declaredField2.get(view);
                if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                    return null;
                }
                declaredField.setAccessible(true);
                return (View.OnTouchListener) declaredField.get(obj);
            } catch (ClassNotFoundException e) {
                C52364yi6.m2854X(f100925a, e);
                return null;
            } catch (IllegalAccessException e2) {
                C52364yi6.m2854X(f100925a, e2);
                return null;
            } catch (NoSuchFieldException e3) {
                C52364yi6.m2854X(f100925a, e3);
                return null;
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return null;
        }
    }

    /* renamed from: i */
    public static String m22283i(View view) {
        CharSequence charSequence;
        if (TD0.m84203d(C45933nr6.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else if (view instanceof TextView) {
                charSequence = ((TextView) view).getHint();
            } else {
                charSequence = null;
            }
            if (charSequence == null) {
                return "";
            }
            return charSequence.toString();
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return null;
        }
    }

    /* renamed from: j */
    public static ViewGroup m22282j(View view) {
        if (TD0.m84203d(C45933nr6.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            return (ViewGroup) parent;
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd A[Catch: all -> 0x00e2, TRY_LEAVE, TryCatch #0 {all -> 0x00e2, blocks: (B:5:0x000a, B:7:0x000e, B:9:0x0019, B:43:0x00dd, B:14:0x0029, B:16:0x002d, B:18:0x0036, B:20:0x003e, B:21:0x0043, B:23:0x004a, B:24:0x0074, B:26:0x0078, B:27:0x009f, B:29:0x00a3, B:31:0x00af, B:33:0x00b9, B:35:0x00bd, B:36:0x00c5, B:37:0x00c8, B:39:0x00cc), top: B:48:0x000a }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m22281k(View view) {
        CharSequence valueOf;
        CharSequence text;
        Object selectedItem;
        if (TD0.m84203d(C45933nr6.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    if (((Switch) view).isChecked()) {
                        text = "1";
                    } else {
                        text = "0";
                    }
                    valueOf = text;
                    break;
                }
                if (valueOf != null) {
                    return "";
                }
                return valueOf.toString();
            }
            if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    text = selectedItem.toString();
                    valueOf = text;
                    break;
                }
                valueOf = null;
            } else {
                if (view instanceof DatePicker) {
                    DatePicker datePicker = (DatePicker) view;
                    valueOf = String.format("%04d-%02d-%02d", Integer.valueOf(datePicker.getYear()), Integer.valueOf(datePicker.getMonth()), Integer.valueOf(datePicker.getDayOfMonth()));
                } else if (view instanceof TimePicker) {
                    TimePicker timePicker = (TimePicker) view;
                    valueOf = String.format("%02d:%02d", Integer.valueOf(timePicker.getCurrentHour().intValue()), Integer.valueOf(timePicker.getCurrentMinute().intValue()));
                } else {
                    if (view instanceof RadioGroup) {
                        RadioGroup radioGroup = (RadioGroup) view;
                        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                        int childCount = radioGroup.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = radioGroup.getChildAt(i);
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                text = ((RadioButton) childAt).getText();
                                valueOf = text;
                                break;
                            }
                        }
                    } else if (view instanceof RatingBar) {
                        valueOf = String.valueOf(((RatingBar) view).getRating());
                    }
                    valueOf = null;
                }
            }
            if (valueOf != null) {
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return null;
        }
        TD0.m84205b(th, C45933nr6.class);
        return null;
    }

    /* renamed from: l */
    public static View m22280l(float[] fArr, View view) {
        if (TD0.m84203d(C45933nr6.class)) {
            return null;
        }
        try {
            m22278n();
            Method method = f100927c;
            if (method != null && view != null) {
                try {
                    View view2 = (View) method.invoke(null, fArr, view);
                    if (view2 != null && view2.getId() > 0) {
                        View view3 = (View) view2.getParent();
                        if (view3 == null) {
                            return null;
                        }
                        return view3;
                    }
                } catch (IllegalAccessException e) {
                    C52364yi6.m2854X(f100925a, e);
                } catch (InvocationTargetException e2) {
                    C52364yi6.m2854X(f100925a, e2);
                }
            }
            return null;
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return null;
        }
    }

    /* renamed from: m */
    public static float[] m22279m(View view) {
        if (TD0.m84203d(C45933nr6.class)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{iArr[0], iArr[1]};
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return null;
        }
    }

    /* renamed from: n */
    public static void m22278n() {
        if (TD0.m84203d(C45933nr6.class)) {
            return;
        }
        try {
            if (f100927c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f100927c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e) {
                C52364yi6.m2854X(f100925a, e);
            } catch (NoSuchMethodException e2) {
                C52364yi6.m2854X(f100925a, e2);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
        }
    }

    /* renamed from: o */
    public static boolean m22277o(View view) {
        if (TD0.m84203d(C45933nr6.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            Class<?> m22286f = m22286f("android.support.v4.view.NestedScrollingChild");
            if (m22286f != null && m22286f.isInstance(parent)) {
                return true;
            }
            Class<?> m22286f2 = m22286f("androidx.core.view.NestedScrollingChild");
            if (m22286f2 != null) {
                if (m22286f2.isInstance(parent)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return false;
        }
    }

    /* renamed from: p */
    public static boolean m22276p(View view, View view2) {
        View m22280l;
        if (TD0.m84203d(C45933nr6.class)) {
            return false;
        }
        try {
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup") || (m22280l = m22280l(m22279m(view), view2)) == null) {
                return false;
            }
            if (m22280l.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m22275q(View view) {
        if (TD0.m84203d(C45933nr6.class)) {
            return false;
        }
        try {
            return view.getClass().getName().equals("com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
            return false;
        }
    }

    /* renamed from: r */
    public static void m22274r(View view, View.OnClickListener onClickListener) {
        Field field;
        Field field2;
        if (TD0.m84203d(C45933nr6.class)) {
            return;
        }
        Object obj = null;
        try {
            try {
                field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            } catch (ClassNotFoundException | NoSuchFieldException unused) {
                field = null;
            }
            try {
                field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                field2 = null;
                if (field == null) {
                }
                view.setOnClickListener(onClickListener);
            }
            if (field == null && field2 != null) {
                field.setAccessible(true);
                field2.setAccessible(true);
                try {
                    field.setAccessible(true);
                    obj = field.get(view);
                } catch (IllegalAccessException unused3) {
                }
                if (obj == null) {
                    view.setOnClickListener(onClickListener);
                    return;
                } else {
                    field2.set(obj, onClickListener);
                    return;
                }
            }
            view.setOnClickListener(onClickListener);
        } catch (Exception unused4) {
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
        }
    }

    /* renamed from: s */
    public static void m22273s(View view, JSONObject jSONObject) {
        try {
            if (TD0.m84203d(C45933nr6.class)) {
                return;
            }
            try {
                String m22281k = m22281k(view);
                String m22283i = m22283i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", m22289c(view));
                jSONObject.put("id", view.getId());
                if (!C32482Ds5.m109830g(view)) {
                    jSONObject.put(Entry.TYPE_TEXT, C52364yi6.m2837h(C52364yi6.m2808v0(m22281k), ""));
                } else {
                    jSONObject.put(Entry.TYPE_TEXT, "");
                    jSONObject.put("is_user_input", true);
                }
                jSONObject.put("hint", C52364yi6.m2837h(C52364yi6.m2808v0(m22283i), ""));
                if (tag != null) {
                    jSONObject.put("tag", C52364yi6.m2837h(C52364yi6.m2808v0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", C52364yi6.m2837h(C52364yi6.m2808v0(contentDescription.toString()), ""));
                }
                jSONObject.put("dimension", m22287e(view));
            } catch (JSONException e) {
                C52364yi6.m2854X(f100925a, e);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C45933nr6.class);
        }
    }
}
