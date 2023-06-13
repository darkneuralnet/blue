package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* renamed from: hr6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42375hr6 implements InterfaceC42968ir6 {

    /* renamed from: a */
    public final ViewGroupOverlay f86004a;

    public C42375hr6(ViewGroup viewGroup) {
        this.f86004a = viewGroup.getOverlay();
    }

    @Override // p000.InterfaceC53057zs6
    /* renamed from: a */
    public void mo194a(Drawable drawable) {
        this.f86004a.remove(drawable);
    }

    @Override // p000.InterfaceC53057zs6
    /* renamed from: b */
    public void mo193b(Drawable drawable) {
        this.f86004a.add(drawable);
    }

    @Override // p000.InterfaceC42968ir6
    /* renamed from: c */
    public void mo31749c(View view) {
        this.f86004a.add(view);
    }

    @Override // p000.InterfaceC42968ir6
    /* renamed from: d */
    public void mo31748d(View view) {
        this.f86004a.remove(view);
    }
}
