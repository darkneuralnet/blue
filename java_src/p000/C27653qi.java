package p000;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
/* renamed from: qi */
/* loaded from: classes.dex */
public class C27653qi {

    /* renamed from: a */
    public final TextView f105640a;

    /* renamed from: b */
    public final C33486Ia1 f105641b;

    public C27653qi(TextView textView) {
        this.f105640a = textView;
        this.f105641b = new C33486Ia1(textView, false);
    }

    /* renamed from: a */
    public InputFilter[] m17234a(InputFilter[] inputFilterArr) {
        return this.f105641b.m101924a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean m17233b() {
        return this.f105641b.m101923b();
    }

    /* renamed from: c */
    public void m17232c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f105640a.getContext().obtainStyledAttributes(attributeSet, C43509jm4.AppCompatTextView, i, 0);
        try {
            int i2 = C43509jm4.AppCompatTextView_emojiCompatEnabled;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            m17230e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: d */
    public void m17231d(boolean z) {
        this.f105641b.m101922c(z);
    }

    /* renamed from: e */
    public void m17230e(boolean z) {
        this.f105641b.m101921d(z);
    }

    /* renamed from: f */
    public TransformationMethod m17229f(TransformationMethod transformationMethod) {
        return this.f105641b.m101920e(transformationMethod);
    }
}
