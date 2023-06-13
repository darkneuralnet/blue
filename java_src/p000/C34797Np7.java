package p000;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccount;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
/* renamed from: Np7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34797Np7 implements WorkAccountApi {

    /* renamed from: a */
    public static final Status f25234a = new Status(13);

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final PendingResult<WorkAccountApi.AddAccountResult> addWorkAccount(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.execute(new C31935Bj7(this, WorkAccount.API, googleApiClient, str));
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final PendingResult<Result> removeWorkAccount(GoogleApiClient googleApiClient, Account account) {
        return googleApiClient.execute(new C49431tl7(this, WorkAccount.API, googleApiClient, account));
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final void setWorkAuthenticatorEnabled(GoogleApiClient googleApiClient, boolean z) {
        setWorkAuthenticatorEnabledWithResult(googleApiClient, z);
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi
    public final PendingResult<Result> setWorkAuthenticatorEnabledWithResult(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.execute(new C34725Nh7(this, WorkAccount.API, googleApiClient, z));
    }
}
