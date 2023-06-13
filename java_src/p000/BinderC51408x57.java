package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
/* renamed from: x57  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC51408x57 extends BinderC51358x07 {

    /* renamed from: a */
    public final BaseImplementation.ResultHolder<Status> f117093a;

    public BinderC51408x57(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f117093a = resultHolder;
    }

    @Override // p000.BinderC51358x07, p000.R97
    public final void zbc(Status status) {
        this.f117093a.setResult(status);
    }
}
