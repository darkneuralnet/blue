package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
/* renamed from: Oi0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34961Oi0 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final Chip f27074a;

    public C34961Oi0(Chip chip) {
        this.f27074a = chip;
    }

    /* renamed from: a */
    public static C34961Oi0 m91671a(View view) {
        if (view != null) {
            return new C34961Oi0((Chip) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C34961Oi0 m91669c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37539Zi4.chip_filter_option, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m91671a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public Chip getRoot() {
        return this.f27074a;
    }
}
