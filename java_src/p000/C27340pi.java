package p000;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
/* renamed from: pi */
/* loaded from: classes.dex */
public class C27340pi {

    /* renamed from: a */
    public final EditText f103955a;

    /* renamed from: b */
    public final C31614Aa1 f103956b;

    public C27340pi(EditText editText) {
        this.f103955a = editText;
        this.f103956b = new C31614Aa1(editText, false);
    }

    /* renamed from: a */
    public KeyListener m18958a(KeyListener keyListener) {
        if (m18957b(keyListener)) {
            return this.f103956b.m115508a(keyListener);
        }
        return keyListener;
    }

    /* renamed from: b */
    public boolean m18957b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* renamed from: c */
    public boolean m18956c() {
        return this.f103956b.m115507b();
    }

    /* renamed from: d */
    public void m18955d(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f103955a.getContext().obtainStyledAttributes(attributeSet, C43509jm4.AppCompatTextView, i, 0);
        try {
            int i2 = C43509jm4.AppCompatTextView_emojiCompatEnabled;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            m18953f(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: e */
    public InputConnection m18954e(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f103956b.m115506c(inputConnection, editorInfo);
    }

    /* renamed from: f */
    public void m18953f(boolean z) {
        this.f103956b.m115505d(z);
    }
}
