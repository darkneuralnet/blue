package p000;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.Status;
/* renamed from: jn7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43522jn7 implements WorkAccountApi.AddAccountResult {

    /* renamed from: d */
    public static final Account f93360d = new Account("DUMMY_NAME", "com.google");

    /* renamed from: b */
    public final Status f93361b;

    /* renamed from: c */
    public final Account f93362c;

    public C43522jn7(Status status, Account account) {
        this.f93361b = status;
        this.f93362c = account == null ? f93360d : account;
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult
    public final Account getAccount() {
        return this.f93362c;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f93361b;
    }
}
