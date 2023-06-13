package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
/* renamed from: Ii7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC33564Ii7 extends BinderC47070pm7 {

    /* renamed from: a */
    public final /* synthetic */ C31935Bj7 f16112a;

    public BinderC33564Ii7(C31935Bj7 c31935Bj7) {
        this.f16112a = c31935Bj7;
    }

    @Override // p000.BinderC47070pm7, com.google.android.gms.auth.account.zzb
    public final void zzb(Account account) {
        Status status;
        C31935Bj7 c31935Bj7 = this.f16112a;
        if (account != null) {
            status = Status.RESULT_SUCCESS;
        } else {
            status = C34797Np7.f25234a;
        }
        c31935Bj7.setResult((C31935Bj7) new C43522jn7(status, account));
    }
}
