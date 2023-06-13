package p000;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: i58  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42516i58 extends AbstractRunnableC46657p48 {

    /* renamed from: f */
    public final /* synthetic */ Bundle f86724f;

    /* renamed from: g */
    public final /* synthetic */ Activity f86725g;

    /* renamed from: h */
    public final /* synthetic */ C43139j88 f86726h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42516i58(C43139j88 c43139j88, Bundle bundle, Activity activity) {
        super(c43139j88.f92214b, true);
        this.f86726h = c43139j88;
        this.f86724f = bundle;
        this.f86725g = activity;
    }

    @Override // p000.AbstractRunnableC46657p48
    /* renamed from: a */
    public final void mo4150a() throws RemoteException {
        Bundle bundle;
        InterfaceC45683nR7 interfaceC45683nR7;
        if (this.f86724f != null) {
            bundle = new Bundle();
            if (this.f86724f.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f86724f.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        interfaceC45683nR7 = this.f86726h.f92214b.f118819i;
        ((InterfaceC45683nR7) Preconditions.checkNotNull(interfaceC45683nR7)).onActivityCreated(BinderC36557Vd3.m79636e5(this.f86725g), bundle, this.f103109c);
    }
}
