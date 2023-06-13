package com.google.android.libraries.places.internal;

import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import org.json.JSONObject;
import p000.EM4;
/* loaded from: classes6.dex */
public final class zzbs {
    private final C40864fJ4 zza;
    private final zzde zzb;

    public zzbs(C40864fJ4 c40864fJ4, zzde zzdeVar, byte[] bArr) {
        this.zza = c40864fJ4;
        this.zzb = zzdeVar;
    }

    public static /* synthetic */ void zzc(TaskCompletionSource taskCompletionSource, VolleyError volleyError) {
        try {
            taskCompletionSource.trySetException(zzbm.zza(volleyError));
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    public final Task zza(zzca zzcaVar, final Class cls) {
        TaskCompletionSource taskCompletionSource;
        String zzc = zzcaVar.zzc();
        Map zzd = zzcaVar.zzd();
        CancellationToken zza = zzcaVar.zza();
        if (zza != null) {
            taskCompletionSource = new TaskCompletionSource(zza);
        } else {
            taskCompletionSource = new TaskCompletionSource();
        }
        final TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
        final zzbr zzbrVar = new zzbr(this, 0, zzc, null, new EM4.InterfaceC1800b() { // from class: com.google.android.libraries.places.internal.zzbp
            @Override // p000.EM4.InterfaceC1800b
            public final void onResponse(Object obj) {
                zzbs.this.zzb(cls, taskCompletionSource2, (JSONObject) obj);
            }
        }, new EM4.InterfaceC1799a() { // from class: com.google.android.libraries.places.internal.zzbo
            @Override // p000.EM4.InterfaceC1799a
            public final void onErrorResponse(VolleyError volleyError) {
                zzbs.zzc(TaskCompletionSource.this, volleyError);
            }
        }, zzd);
        if (zza != null) {
            zza.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzbq
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final void onCanceled() {
                    C36367Ui2.this.cancel();
                }
            });
        }
        this.zza.m41571a(zzbrVar);
        return taskCompletionSource2.getTask();
    }

    public final /* synthetic */ void zzb(Class cls, TaskCompletionSource taskCompletionSource, JSONObject jSONObject) {
        try {
            try {
                taskCompletionSource.trySetResult((zzcb) this.zzb.zza(jSONObject.toString(), cls));
            } catch (zzcc e) {
                taskCompletionSource.trySetException(new ApiException(new Status(8, e.getMessage())));
            }
        } catch (Error | RuntimeException e2) {
            zzev.zzb(e2);
            throw e2;
        }
    }
}
