package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zacd implements OnCompleteListener {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey zac;
    private final long zad;
    private final long zae;

    @VisibleForTesting
    public zacd(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
        this.zae = j2;
    }

    public static zacd zaa(GoogleApiManager googleApiManager, int i, ApiKey apiKey) {
        boolean z;
        long j;
        long j2;
        if (!googleApiManager.zaF()) {
            return null;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null) {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            z = config.getMethodTimingTelemetryEnabled();
            zabq zak = googleApiManager.zak(apiKey);
            if (zak != null) {
                if (!(zak.zaf() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, i);
                    if (zab == null) {
                        return null;
                    }
                    zak.zaq();
                    z = zab.getMethodTimingTelemetryEnabled();
                }
            }
        } else {
            z = true;
        }
        if (z) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        if (z) {
            j2 = SystemClock.elapsedRealtime();
        } else {
            j2 = 0;
        }
        return new zacd(googleApiManager, i, apiKey, j, j2, null, null);
    }

    private static ConnectionTelemetryConfiguration zab(zabq zabqVar, BaseGmsClient baseGmsClient, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        zabq zak;
        boolean z;
        int i;
        int i2;
        int i3;
        int errorCode;
        int i4;
        long j;
        long j2;
        int i5;
        if (!this.zaa.zaF()) {
            return;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zak = this.zaa.zak(this.zac)) != null && (zak.zaf() instanceof BaseGmsClient)) {
            BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
            boolean z2 = true;
            int i6 = 0;
            if (this.zad > 0) {
                z = true;
            } else {
                z = false;
            }
            int gCoreServiceId = baseGmsClient.getGCoreServiceId();
            if (config != null) {
                z &= config.getMethodTimingTelemetryEnabled();
                int batchPeriodMillis = config.getBatchPeriodMillis();
                int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                i = config.getVersion();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration zab = zab(zak, baseGmsClient, this.zab);
                    if (zab == null) {
                        return;
                    }
                    if (!zab.getMethodTimingTelemetryEnabled() || this.zad <= 0) {
                        z2 = false;
                    }
                    maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                    z = z2;
                }
                i3 = batchPeriodMillis;
                i2 = maxMethodInvocationsInBatch;
            } else {
                i = 0;
                i2 = 100;
                i3 = 5000;
            }
            GoogleApiManager googleApiManager = this.zaa;
            if (task.isSuccessful()) {
                i4 = 0;
            } else {
                if (task.isCanceled()) {
                    i6 = 100;
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof ApiException) {
                        Status status = ((ApiException) exception).getStatus();
                        int statusCode = status.getStatusCode();
                        ConnectionResult connectionResult = status.getConnectionResult();
                        if (connectionResult == null) {
                            errorCode = -1;
                        } else {
                            errorCode = connectionResult.getErrorCode();
                        }
                        i4 = errorCode;
                        i6 = statusCode;
                    } else {
                        i6 = 101;
                    }
                }
                i4 = -1;
            }
            if (z) {
                long j3 = this.zad;
                long currentTimeMillis = System.currentTimeMillis();
                i5 = (int) (SystemClock.elapsedRealtime() - this.zae);
                j = j3;
                j2 = currentTimeMillis;
            } else {
                j = 0;
                j2 = 0;
                i5 = -1;
            }
            googleApiManager.zay(new MethodInvocation(this.zab, i6, i4, j, j2, null, null, gCoreServiceId, i5), i, i3, i2);
        }
    }
}