package p000;

import co.bird.android.feature.coreinventory.scan.CoreInventoryScanActivity;
import co.bird.android.feature.coreinventory.scan.CoreInventoryScanPresenter;
import co.bird.android.feature.coreinventory.scan.adapters.CoreInventoryScanConverter;
import dagger.MembersInjector;
/* renamed from: jC0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43169jC0 implements MembersInjector<CoreInventoryScanActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f92276a;

    /* renamed from: b */
    public final Y94<C22454gl> f92277b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f92278c;

    /* renamed from: d */
    public final Y94<CoreInventoryScanPresenter> f92279d;

    /* renamed from: e */
    public final Y94<CoreInventoryScanConverter> f92280e;

    /* renamed from: a */
    public static void m31022a(CoreInventoryScanActivity coreInventoryScanActivity, CoreInventoryScanConverter coreInventoryScanConverter) {
        coreInventoryScanActivity.f63807k = coreInventoryScanConverter;
    }

    /* renamed from: c */
    public static void m31020c(CoreInventoryScanActivity coreInventoryScanActivity, CoreInventoryScanPresenter coreInventoryScanPresenter) {
        coreInventoryScanActivity.f63806j = coreInventoryScanPresenter;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(CoreInventoryScanActivity coreInventoryScanActivity) {
        C4650Ky.m98043b(coreInventoryScanActivity, this.f92276a.get());
        C4650Ky.m98042c(coreInventoryScanActivity, this.f92277b.get());
        C4650Ky.m98041d(coreInventoryScanActivity, this.f92278c.get());
        m31020c(coreInventoryScanActivity, this.f92279d.get());
        m31022a(coreInventoryScanActivity, this.f92280e.get());
    }
}
