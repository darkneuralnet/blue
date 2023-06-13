package p000;

import android.view.View;
import android.widget.CheckBox;
/* renamed from: zc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52893zc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CheckBox f121623a;

    public C52893zc2(CheckBox checkBox) {
        this.f121623a = checkBox;
    }

    /* renamed from: a */
    public static C52893zc2 m1021a(View view) {
        if (view != null) {
            return new C52893zc2((CheckBox) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CheckBox getRoot() {
        return this.f121623a;
    }
}
