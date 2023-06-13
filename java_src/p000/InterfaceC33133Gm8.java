package p000;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.tasks.Task;
/* renamed from: Gm8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC33133Gm8 extends HasApiKey<Api.ApiOptions.NoOptions> {
    /* renamed from: a */
    Task<Bundle> mo85137a(Account account);

    /* renamed from: c */
    Task<Bundle> mo85136c(String str);

    /* renamed from: e */
    Task<AccountChangeEventsResponse> mo85135e(AccountChangeEventsRequest accountChangeEventsRequest);

    /* renamed from: f */
    Task<Void> mo85134f(zzbw zzbwVar);

    /* renamed from: h */
    Task<Bundle> mo85133h(Account account, String str, Bundle bundle);
}
