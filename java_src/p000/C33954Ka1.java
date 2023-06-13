package p000;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C11581c;
/* renamed from: Ka1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C33954Ka1 implements TransformationMethod {

    /* renamed from: a */
    public final TransformationMethod f19879a;

    public C33954Ka1(TransformationMethod transformationMethod) {
        this.f19879a = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod m98728a() {
        return this.f19879a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f19879a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && C11581c.m67529c().m67525g() == 1) {
            return C11581c.m67529c().m67514r(charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f19879a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
