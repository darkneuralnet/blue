package com.google.android.gms.auth.api.identity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes5.dex */
public final class Identity {
    private Identity() {
    }

    public static CredentialSavingClient getCredentialSavingClient(Activity activity) {
        return new C43957kX6((Activity) Preconditions.checkNotNull(activity), new zbc());
    }

    public static SignInClient getSignInClient(Activity activity) {
        return new WX6((Activity) Preconditions.checkNotNull(activity), new zbl());
    }

    public static CredentialSavingClient getCredentialSavingClient(Context context) {
        return new C43957kX6((Context) Preconditions.checkNotNull(context), new zbc());
    }

    public static SignInClient getSignInClient(Context context) {
        return new WX6((Context) Preconditions.checkNotNull(context), new zbl());
    }
}
