package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
/* renamed from: Pi0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35195Pi0 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final Chip f28931a;

    public C35195Pi0(Chip chip) {
        this.f28931a = chip;
    }

    /* renamed from: a */
    public static C35195Pi0 m89911a(View view) {
        if (view != null) {
            return new C35195Pi0((Chip) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C35195Pi0 m89909c(LayoutInflater layoutInflater) {
        return m89908d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C35195Pi0 m89908d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45268mk4.chip_rating_tag, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m89911a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public Chip getRoot() {
        return this.f28931a;
    }
}
