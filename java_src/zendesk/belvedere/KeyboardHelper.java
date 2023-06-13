package zendesk.belvedere;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public class KeyboardHelper extends FrameLayout {

    /* renamed from: b */
    public final int f121765b;

    /* renamed from: c */
    public int f121766c;

    /* renamed from: d */
    public int f121767d;

    /* renamed from: e */
    public boolean f121768e;

    /* renamed from: f */
    public List<WeakReference<InterfaceC31087c>> f121769f;

    /* renamed from: g */
    public InterfaceC31088d f121770g;

    /* renamed from: h */
    public EditText f121771h;

    /* renamed from: zendesk.belvedere.KeyboardHelper$a */
    /* loaded from: classes8.dex */
    public static class RunnableC31085a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ EditText f121772b;

        public RunnableC31085a(EditText editText) {
            this.f121772b = editText;
        }

        @Override // java.lang.Runnable
        public void run() {
            InputMethodManager inputMethodManager;
            if (this.f121772b.requestFocus() && (inputMethodManager = (InputMethodManager) this.f121772b.getContext().getSystemService("input_method")) != null) {
                inputMethodManager.showSoftInput(this.f121772b, 1);
            }
        }
    }

    /* renamed from: zendesk.belvedere.KeyboardHelper$b */
    /* loaded from: classes8.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC31086b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final Activity f121773b;

        public /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC31086b(KeyboardHelper keyboardHelper, Activity activity, RunnableC31085a runnableC31085a) {
            this(activity);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean z;
            int m809m = KeyboardHelper.this.m809m(this.f121773b);
            KeyboardHelper keyboardHelper = KeyboardHelper.this;
            if (m809m > 0) {
                z = true;
            } else {
                z = false;
            }
            keyboardHelper.f121768e = z;
            if (m809m > 0 && KeyboardHelper.this.f121767d != m809m) {
                KeyboardHelper.this.f121767d = m809m;
                if (KeyboardHelper.this.f121770g != null) {
                    KeyboardHelper.this.f121770g.mo673a(m809m);
                }
            }
            if (KeyboardHelper.this.f121769f != null && m809m > 0) {
                KeyboardHelper.this.m802t();
            } else {
                KeyboardHelper.this.m803s();
            }
        }

        public ViewTreeObserver$OnGlobalLayoutListenerC31086b(Activity activity) {
            this.f121773b = activity;
        }
    }

    /* renamed from: zendesk.belvedere.KeyboardHelper$c */
    /* loaded from: classes8.dex */
    public interface InterfaceC31087c {
        void onKeyboardDismissed();

        void onKeyboardVisible();
    }

    /* renamed from: zendesk.belvedere.KeyboardHelper$d */
    /* loaded from: classes8.dex */
    public interface InterfaceC31088d {
        /* renamed from: a */
        void mo673a(int i);
    }

    public KeyboardHelper(Activity activity) {
        super(activity);
        this.f121766c = -1;
        this.f121767d = -1;
        this.f121768e = false;
        this.f121769f = new ArrayList();
        this.f121765b = m808n();
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(C35874Sf4.belvedere_dummy_edit_text_size);
        setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        EditText editText = new EditText(activity);
        this.f121771h = editText;
        editText.setFocusable(true);
        this.f121771h.setFocusableInTouchMode(true);
        this.f121771h.setVisibility(0);
        this.f121771h.setImeOptions(268435456);
        this.f121771h.setInputType(16384);
        addView(this.f121771h);
        activity.getWindow().getDecorView().findViewById(16908290).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC31086b(this, activity, null));
    }

    /* renamed from: q */
    public static void m805q(Activity activity) {
        InputMethodManager inputMethodManager;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* renamed from: r */
    public static KeyboardHelper m804r(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) instanceof KeyboardHelper) {
                return (KeyboardHelper) viewGroup.getChildAt(i);
            }
        }
        KeyboardHelper keyboardHelper = new KeyboardHelper(activity);
        viewGroup.addView(keyboardHelper);
        return keyboardHelper;
    }

    /* renamed from: v */
    public static void m800v(EditText editText) {
        editText.post(new RunnableC31085a(editText));
    }

    /* renamed from: i */
    public void m813i(InterfaceC31087c interfaceC31087c) {
        this.f121769f.add(new WeakReference<>(interfaceC31087c));
    }

    /* renamed from: j */
    public final int m812j() {
        if (this.f121766c == -1) {
            this.f121766c = m807o();
        }
        return this.f121766c;
    }

    /* renamed from: k */
    public EditText m811k() {
        return this.f121771h;
    }

    /* renamed from: l */
    public int m810l() {
        return this.f121767d;
    }

    /* renamed from: m */
    public final int m809m(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return m806p() - (rect.bottom - rect.top);
    }

    /* renamed from: n */
    public final int m808n() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: o */
    public final int m807o() {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if (obj != null) {
                Field declaredField2 = obj.getClass().getDeclaredField("mStableInsets");
                declaredField2.setAccessible(true);
                return ((Rect) declaredField2.get(obj)).bottom;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: p */
    public final int m806p() {
        return (getRootView().getHeight() - this.f121765b) - m812j();
    }

    /* renamed from: s */
    public final void m803s() {
        for (WeakReference<InterfaceC31087c> weakReference : this.f121769f) {
            if (weakReference.get() != null) {
                weakReference.get().onKeyboardDismissed();
            }
        }
    }

    /* renamed from: t */
    public final void m802t() {
        for (WeakReference<InterfaceC31087c> weakReference : this.f121769f) {
            if (weakReference.get() != null) {
                weakReference.get().onKeyboardVisible();
            }
        }
    }

    /* renamed from: u */
    public void m801u(InterfaceC31088d interfaceC31088d) {
        this.f121770g = interfaceC31088d;
    }
}
