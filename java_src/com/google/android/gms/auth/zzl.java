package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
@ShowFirstParty
/* loaded from: classes5.dex */
public class zzl {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    @ShowFirstParty
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";
    @ShowFirstParty
    public static final String[] zza = {"com.google", "com.google.work", "cn.google"};
    @ShowFirstParty
    @SuppressLint({"InlinedApi"})
    public static final String zzb = "androidPackageName";
    private static final ComponentName zzc = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final Logger zzd = zzd.zza("GoogleAuthUtil");

    public static void clearToken(Context context, String str) throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzj(context, 8400000);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        String str3 = zzb;
        if (!bundle.containsKey(str3)) {
            bundle.putString(str3, str2);
        }
        JX7.m100267e(context);
        if (C48357rw8.m15001d() && zzm(context)) {
            InterfaceC33133Gm8 m106286a = C32962Ft8.m106286a(context);
            zzbw zzbwVar = new zzbw();
            zzbwVar.m51580s(str);
            try {
                zzh(m106286a.mo85134f(zzbwVar), "clear token");
                return;
            } catch (ApiException e) {
                zzk(e, "clear token");
            }
        }
        zzg(context, zzc, new zzh(str, bundle));
    }

    public static List<AccountChangeEvent> getAccountChangeEvents(Context context, int i, String str) throws GoogleAuthException, IOException {
        Preconditions.checkNotEmpty(str, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzj(context, 8400000);
        AccountChangeEventsRequest accountChangeEventsRequest = new AccountChangeEventsRequest();
        accountChangeEventsRequest.setAccountName(str);
        accountChangeEventsRequest.setEventIndex(i);
        JX7.m100267e(context);
        if (C48357rw8.m15002c() && zzm(context)) {
            try {
                AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) zzh(C32962Ft8.m106286a(context).mo85135e(accountChangeEventsRequest), "account change events retrieval");
                zzi(accountChangeEventsResponse);
                return accountChangeEventsResponse.getEvents();
            } catch (ApiException e) {
                zzk(e, "account change events retrieval");
            }
        }
        return (List) zzg(context, zzc, new zzi(accountChangeEventsRequest));
    }

    public static String getAccountId(Context context, String str) throws GoogleAuthException, IOException {
        Preconditions.checkNotEmpty(str, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzj(context, 8400000);
        return getToken(context, str, "^^_account_id_^^", new Bundle());
    }

    public static String getToken(Context context, Account account, String str) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return getToken(context, account, str, new Bundle());
    }

    @Deprecated
    public static void invalidateToken(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    @ShowFirstParty
    @TargetApi(23)
    public static Bundle removeAccount(Context context, final Account account) throws GoogleAuthException, IOException {
        Preconditions.checkNotNull(context);
        zzl(account);
        zzj(context, 8400000);
        JX7.m100267e(context);
        if (C48357rw8.m15001d() && zzm(context)) {
            try {
                Bundle bundle = (Bundle) zzh(C32962Ft8.m106286a(context).mo85137a(account), "account removal");
                zzi(bundle);
                return bundle;
            } catch (ApiException e) {
                zzk(e, "account removal");
            }
        }
        return (Bundle) zzg(context, zzc, new zzk() { // from class: com.google.android.gms.auth.zzf
            @Override // com.google.android.gms.auth.zzk
            public final Object zza(IBinder iBinder) {
                Bundle mo83231X0 = M68.m95812c5(iBinder).mo83231X0(account);
                if (mo83231X0 != null) {
                    return mo83231X0;
                }
                throw new IOException("Service call returned null.");
            }
        });
    }

    @TargetApi(26)
    public static Boolean requestGoogleAccountsAccess(Context context) throws GoogleAuthException, IOException {
        Preconditions.checkNotNull(context);
        zzj(context, 11400000);
        String str = context.getApplicationInfo().packageName;
        JX7.m100267e(context);
        if (C48357rw8.m15001d() && zzm(context)) {
            try {
                Bundle bundle = (Bundle) zzh(C32962Ft8.m106286a(context).mo85136c(str), "google accounts access request");
                String string = bundle.getString("Error");
                Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
                EnumC39125cP7 m61423a = EnumC39125cP7.m61423a(string);
                if (EnumC39125cP7.SUCCESS.equals(m61423a)) {
                    return Boolean.TRUE;
                }
                if (EnumC39125cP7.m61422b(m61423a)) {
                    Logger logger = zzd;
                    String valueOf = String.valueOf(m61423a);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 31);
                    sb.append("isUserRecoverableError status: ");
                    sb.append(valueOf);
                    logger.m51596w("GoogleAuthUtil", sb.toString());
                    throw new UserRecoverableAuthException(string, intent);
                }
                throw new GoogleAuthException(string);
            } catch (ApiException e) {
                zzk(e, "google accounts access request");
            }
        }
        return (Boolean) zzg(context, zzc, new zzj(str));
    }

    public static TokenData zza(Context context, final Account account, final String str, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        final Bundle bundle2;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        Preconditions.checkNotEmpty(str, "Scope cannot be empty or null.");
        zzl(account);
        zzj(context, 8400000);
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        String str3 = zzb;
        if (TextUtils.isEmpty(bundle2.getString(str3))) {
            bundle2.putString(str3, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        JX7.m100267e(context);
        if (C48357rw8.m15001d() && zzm(context)) {
            try {
                Bundle bundle3 = (Bundle) zzh(C32962Ft8.m106286a(context).mo85133h(account, str, bundle2), "token retrieval");
                zzi(bundle3);
                return zzf(bundle3);
            } catch (ApiException e) {
                zzk(e, "token retrieval");
            }
        }
        return (TokenData) zzg(context, zzc, new zzk() { // from class: com.google.android.gms.auth.zzg
            @Override // com.google.android.gms.auth.zzk
            public final Object zza(IBinder iBinder) {
                return zzl.zzb(account, str, bundle2, iBinder);
            }
        });
    }

    public static /* synthetic */ TokenData zzb(Account account, String str, Bundle bundle, IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Bundle mo83232T3 = M68.m95812c5(iBinder).mo83232T3(account, str, bundle);
        if (mo83232T3 != null) {
            return zzf(mo83232T3);
        }
        throw new IOException("Service call returned null");
    }

    public static void zze(Intent intent) {
        if (intent != null) {
            try {
                Intent.parseUri(intent.toUri(1), 1);
                return;
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
            }
        }
        throw new IllegalArgumentException("Callback cannot be null.");
    }

    private static TokenData zzf(Bundle bundle) throws GoogleAuthException, IOException {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        EnumC39125cP7 m61423a = EnumC39125cP7.m61423a(string);
        if (!EnumC39125cP7.m61422b(m61423a)) {
            if (!EnumC39125cP7.NETWORK_ERROR.equals(m61423a) && !EnumC39125cP7.SERVICE_UNAVAILABLE.equals(m61423a) && !EnumC39125cP7.INTNERNAL_ERROR.equals(m61423a) && !EnumC39125cP7.AUTH_SECURITY_ERROR.equals(m61423a)) {
                throw new GoogleAuthException(string);
            }
            throw new IOException(string);
        }
        Logger logger = zzd;
        String valueOf = String.valueOf(m61423a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 31);
        sb.append("isUserRecoverableError status: ");
        sb.append(valueOf);
        logger.m51596w("GoogleAuthUtil", sb.toString());
        throw new UserRecoverableAuthException(string, intent);
    }

    private static <T> T zzg(Context context, ComponentName componentName, zzk<T> zzkVar) throws IOException, GoogleAuthException {
        BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
        GmsClientSupervisor gmsClientSupervisor = GmsClientSupervisor.getInstance(context);
        try {
            try {
                if (gmsClientSupervisor.bindService(componentName, blockingServiceConnection, "GoogleAuthUtil")) {
                    try {
                        return zzkVar.zza(blockingServiceConnection.getService());
                    } catch (RemoteException | InterruptedException e) {
                        Log.i("GoogleAuthUtil", "Error on service connection.", e);
                        throw new IOException("Error on service connection.", e);
                    }
                }
                throw new IOException("Could not bind to service.");
            } finally {
                gmsClientSupervisor.unbindService(componentName, blockingServiceConnection, "GoogleAuthUtil");
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    private static <ResultT> ResultT zzh(Task<ResultT> task, String str) throws IOException, ApiException {
        try {
            return (ResultT) Tasks.await(task);
        } catch (InterruptedException e) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            zzd.m51596w(format, new Object[0]);
            throw new IOException(format, e);
        } catch (CancellationException e2) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            zzd.m51596w(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof ApiException) {
                throw ((ApiException) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            zzd.m51596w(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T zzi(T t) throws IOException {
        if (t != null) {
            return t;
        }
        zzd.m51596w("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void zzj(Context context, int i) throws GoogleAuthException {
        try {
            GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context.getApplicationContext(), i);
        } catch (GooglePlayServicesIncorrectManifestValueException e) {
            e = e;
            throw new GoogleAuthException(e.getMessage(), e);
        } catch (GooglePlayServicesNotAvailableException e2) {
            e = e2;
            throw new GoogleAuthException(e.getMessage(), e);
        } catch (GooglePlayServicesRepairableException e3) {
            throw new GooglePlayServicesAvailabilityException(e3.getConnectionStatusCode(), e3.getMessage(), e3.getIntent());
        }
    }

    private static void zzk(ApiException apiException, String str) {
        zzd.m51596w("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(apiException));
    }

    private static void zzl(Account account) {
        if (account != null) {
            if (!TextUtils.isEmpty(account.name)) {
                String[] strArr = zza;
                for (int i = 0; i < 3; i++) {
                    if (strArr[i].equals(account.type)) {
                        return;
                    }
                }
                throw new IllegalArgumentException("Account type not supported");
            }
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        throw new IllegalArgumentException("Account cannot be null");
    }

    private static boolean zzm(Context context) {
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context, 17895000) != 0) {
            return false;
        }
        String str = context.getApplicationInfo().packageName;
        for (String str2 : C48357rw8.m15004a().m42372k()) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static String getToken(Context context, Account account, String str, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        zzl(account);
        return zza(context, account, str, bundle).zza();
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return getToken(context, new Account(str, "com.google"), str2);
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return getToken(context, new Account(str, "com.google"), str2, bundle);
    }
}
