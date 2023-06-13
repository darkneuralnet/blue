package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
/* loaded from: classes5.dex */
public class GoogleSignInClient extends GoogleApi<GoogleSignInOptions> {
    private static final zbb zbb = new zbb(null);
    @VisibleForTesting
    static int zba = 1;

    public GoogleSignInClient(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    private final synchronized int zba() {
        if (zba == 1) {
            Context applicationContext = getApplicationContext();
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (isGooglePlayServicesAvailable == 0) {
                zba = 4;
            } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, isGooglePlayServicesAvailable, null) == null && DynamiteModule.m51595a(applicationContext, "com.google.android.gms.auth.api.fallback") != 0) {
                zba = 3;
            } else {
                zba = 2;
            }
        }
        return zba;
    }

    public Intent getSignInIntent() {
        Context applicationContext = getApplicationContext();
        int zba2 = zba();
        int i = zba2 - 1;
        if (zba2 != 0) {
            if (i != 2) {
                if (i != 3) {
                    return zbm.zbb(applicationContext, getApiOptions());
                }
                return zbm.zbc(applicationContext, getApiOptions());
            }
            return zbm.zba(applicationContext, getApiOptions());
        }
        throw null;
    }

    public Task<Void> revokeAccess() {
        boolean z;
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        if (zba() == 3) {
            z = true;
        } else {
            z = false;
        }
        return PendingResultUtil.toVoidTask(zbm.zbf(asGoogleApiClient, applicationContext, z));
    }

    public Task<Void> signOut() {
        boolean z;
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        if (zba() == 3) {
            z = true;
        } else {
            z = false;
        }
        return PendingResultUtil.toVoidTask(zbm.zbg(asGoogleApiClient, applicationContext, z));
    }

    public Task<GoogleSignInAccount> silentSignIn() {
        boolean z;
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        GoogleSignInOptions apiOptions = getApiOptions();
        if (zba() == 3) {
            z = true;
        } else {
            z = false;
        }
        return PendingResultUtil.toTask(zbm.zbe(asGoogleApiClient, applicationContext, apiOptions, z), zbb);
    }

    public GoogleSignInClient(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, new ApiExceptionMapper());
    }
}
