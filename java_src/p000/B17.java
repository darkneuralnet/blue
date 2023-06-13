package p000;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;
/* renamed from: B17 */
/* loaded from: classes5.dex */
public final class B17 implements CredentialRequestResult {

    /* renamed from: b */
    public final Status f1547b;

    /* renamed from: c */
    public final Credential f1548c;

    public B17(Status status, Credential credential) {
        this.f1547b = status;
        this.f1548c = credential;
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialRequestResult
    public final Credential getCredential() {
        return this.f1548c;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f1547b;
    }
}
