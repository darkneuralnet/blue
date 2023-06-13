package p000;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
/* renamed from: E27 */
/* loaded from: classes5.dex */
public final class E27 extends BinderC51358x07 {

    /* renamed from: a */
    public final /* synthetic */ C43088j37 f6885a;

    public E27(C43088j37 c43088j37) {
        this.f6885a = c43088j37;
    }

    @Override // p000.BinderC51358x07, p000.R97
    /* renamed from: p3 */
    public final void mo5990p3(Status status, Credential credential) {
        this.f6885a.setResult((C43088j37) new B17(status, credential));
    }

    @Override // p000.BinderC51358x07, p000.R97
    public final void zbc(Status status) {
        this.f6885a.setResult((C43088j37) new B17(status, null));
    }
}
