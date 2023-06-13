package p000;

import android.content.Context;
import com.google.android.gms.clearcut.C17477a;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.util.VisibleForTesting;
/* renamed from: O68 */
/* loaded from: classes5.dex */
public final class O68 extends GoogleApi<Api.ApiOptions.NoOptions> implements YB7 {
    @VisibleForTesting
    public O68(Context context) {
        super(context, C17477a.f70292p, (Api.ApiOptions) null, new ApiExceptionMapper());
    }

    /* renamed from: i */
    public static YB7 m92899i(Context context) {
        return new O68(context);
    }

    @Override // p000.YB7
    /* renamed from: d */
    public final PendingResult<Status> mo75465d(zze zzeVar) {
        return doBestEffortWrite((O68) new C33430Ht8(zzeVar, asGoogleApiClient()));
    }
}
