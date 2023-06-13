package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
/* renamed from: vd2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50531vd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final AppCompatCheckBox f114418a;

    public C50531vd2(AppCompatCheckBox appCompatCheckBox) {
        this.f114418a = appCompatCheckBox;
    }

    /* renamed from: a */
    public static C50531vd2 m8337a(View view) {
        if (view != null) {
            return new C50531vd2((AppCompatCheckBox) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public AppCompatCheckBox getRoot() {
        return this.f114418a;
    }
}
