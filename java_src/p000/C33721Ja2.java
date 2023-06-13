package p000;

import android.view.View;
import android.widget.RadioGroup;
/* renamed from: Ja2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33721Ja2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RadioGroup f17857a;

    public C33721Ja2(RadioGroup radioGroup) {
        this.f17857a = radioGroup;
    }

    /* renamed from: a */
    public static C33721Ja2 m100184a(View view) {
        if (view != null) {
            return new C33721Ja2((RadioGroup) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RadioGroup getRoot() {
        return this.f17857a;
    }
}
