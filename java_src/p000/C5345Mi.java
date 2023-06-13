package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import ch.qos.logback.core.joran.action.Action;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: Mi */
/* loaded from: classes.dex */
public class C5345Mi {

    /* renamed from: b */
    public static final Class<?>[] f23406b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f23407c = {16843375};

    /* renamed from: d */
    public static final int[] f23408d = {16844160};

    /* renamed from: e */
    public static final int[] f23409e = {16844156};

    /* renamed from: f */
    public static final int[] f23410f = {16844148};

    /* renamed from: g */
    public static final String[] f23411g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final NA5<String, Constructor<? extends View>> f23412h = new NA5<>();

    /* renamed from: a */
    public final Object[] f23413a = new Object[2];

    /* renamed from: Mi$a */
    /* loaded from: classes.dex */
    public static class View$OnClickListenerC5346a implements View.OnClickListener {

        /* renamed from: b */
        public final View f23414b;

        /* renamed from: c */
        public final String f23415c;

        /* renamed from: d */
        public Method f23416d;

        /* renamed from: e */
        public Context f23417e;

        public View$OnClickListenerC5346a(View view, String str) {
            this.f23414b = view;
            this.f23415c = str;
        }

        /* renamed from: a */
        public final void m95013a(Context context) {
            int id;
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f23415c, View.class)) != null) {
                        this.f23416d = method;
                        this.f23417e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            if (this.f23414b.getId() == -1) {
                str = "";
            } else {
                str = " with id '" + this.f23414b.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f23415c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f23414b.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f23416d == null) {
                m95013a(this.f23414b.getContext());
            }
            try {
                this.f23416d.invoke(this.f23417e, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: u */
    public static Context m95015u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C43509jm4.View, 0, 0);
        if (z) {
            i = obtainStyledAttributes.getResourceId(C43509jm4.View_android_theme, 0);
        } else {
            i = 0;
        }
        if (z2 && i == 0 && (i = obtainStyledAttributes.getResourceId(C43509jm4.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (i != 0) {
            if (!(context instanceof C37806aB0) || ((C37806aB0) context).m71801c() != i) {
                return new C37806aB0(context, i);
            }
            return context;
        }
        return context;
    }

    /* renamed from: a */
    public final void m95030a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f23408d);
        if (obtainStyledAttributes.hasValue(0)) {
            C38790bq6.m62450w0(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f23409e);
        if (obtainStyledAttributes2.hasValue(0)) {
            C38790bq6.m62446y0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f23410f);
        if (obtainStyledAttributes3.hasValue(0)) {
            C38790bq6.m62511V0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    /* renamed from: b */
    public final void m95029b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && C38790bq6.m62514U(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f23407c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new View$OnClickListenerC5346a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public AppCompatAutoCompleteTextView mo48556c(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* renamed from: d */
    public AppCompatButton mo48555d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* renamed from: e */
    public AppCompatCheckBox mo48554e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* renamed from: f */
    public AppCompatCheckedTextView m95028f(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    /* renamed from: g */
    public AppCompatEditText m95027g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* renamed from: h */
    public AppCompatImageButton m95026h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* renamed from: i */
    public AppCompatImageView m95025i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* renamed from: j */
    public AppCompatMultiAutoCompleteTextView m95024j(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    /* renamed from: k */
    public AppCompatRadioButton mo48553k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* renamed from: l */
    public AppCompatRatingBar m95023l(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* renamed from: m */
    public AppCompatSeekBar m95022m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    /* renamed from: n */
    public AppCompatSpinner m95021n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* renamed from: o */
    public AppCompatTextView mo48552o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: p */
    public AppCompatToggleButton m95020p(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    /* renamed from: q */
    public View m95019q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: r */
    public final View m95018r(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View m95023l;
        if (z && view != null) {
            context2 = view.getContext();
        } else {
            context2 = context;
        }
        if (z2 || z3) {
            context2 = m95015u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = W46.m78859b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m95023l = m95023l(context2, attributeSet);
                m95014v(m95023l, str);
                break;
            case 1:
                m95023l = m95028f(context2, attributeSet);
                m95014v(m95023l, str);
                break;
            case 2:
                m95023l = m95024j(context2, attributeSet);
                m95014v(m95023l, str);
                break;
            case 3:
                m95023l = mo48552o(context2, attributeSet);
                m95014v(m95023l, str);
                break;
            case 4:
                m95023l = m95026h(context2, attributeSet);
                m95014v(m95023l, str);
                break;
            case 5:
                m95023l = m95022m(context2, attributeSet);
                m95014v(m95023l, str);
                break;
            case 6:
                m95023l = m95021n(context2, attributeSet);
                m95014v(m95023l, str);
                break;
            case 7:
                m95023l = mo48553k(context2, attributeSet);
                m95014v(m95023l, str);
                break;
            case '\b':
                m95023l = m95020p(context2, attributeSet);
                m95014v(m95023l, str);
                break;
            case '\t':
                m95023l = m95025i(context2, attributeSet);
                m95014v(m95023l, str);
                break;
            case '\n':
                m95023l = mo48556c(context2, attributeSet);
                m95014v(m95023l, str);
                break;
            case 11:
                m95023l = mo48554e(context2, attributeSet);
                m95014v(m95023l, str);
                break;
            case '\f':
                m95023l = m95027g(context2, attributeSet);
                m95014v(m95023l, str);
                break;
            case '\r':
                m95023l = mo48555d(context2, attributeSet);
                m95014v(m95023l, str);
                break;
            default:
                m95023l = m95019q(context2, str, attributeSet);
                break;
        }
        if (m95023l == null && context != context2) {
            m95023l = m95016t(context2, str, attributeSet);
        }
        if (m95023l != null) {
            m95029b(m95023l, attributeSet);
            m95030a(context2, m95023l, attributeSet);
        }
        return m95023l;
    }

    /* renamed from: s */
    public final View m95017s(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        NA5<String, Constructor<? extends View>> na5 = f23412h;
        Constructor<? extends View> constructor = na5.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f23406b);
            na5.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f23413a);
    }

    /* renamed from: t */
    public final View m95016t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, Action.CLASS_ATTRIBUTE);
        }
        try {
            Object[] objArr = this.f23413a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = f23411g;
                    if (i >= strArr.length) {
                        return null;
                    }
                    View m95017s = m95017s(context, str, strArr[i]);
                    if (m95017s != null) {
                        return m95017s;
                    }
                    i++;
                }
            } else {
                return m95017s(context, str, null);
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f23413a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* renamed from: v */
    public final void m95014v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
