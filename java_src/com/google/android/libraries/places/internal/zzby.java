package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.Map;
import p000.EM4;
/* loaded from: classes6.dex */
public final class zzby {
    private final C40864fJ4 zza;

    public zzby(C40864fJ4 c40864fJ4) {
        this.zza = c40864fJ4;
    }

    public static /* synthetic */ void zza(TaskCompletionSource taskCompletionSource, VolleyError volleyError) {
        ApiException zza;
        try {
            O73 o73 = volleyError.f68612b;
            if (o73 != null) {
                int i = o73.f25918a;
                if (i != 400) {
                    if (i == 403) {
                        zza = new ApiException(new Status((int) PlacesStatusCodes.REQUEST_DENIED, "The provided API key is invalid."));
                    }
                } else {
                    zza = new ApiException(new Status((int) PlacesStatusCodes.INVALID_REQUEST, "The provided parameters are invalid (did you include a max width or height?)."));
                }
                taskCompletionSource.trySetException(zza);
            }
            zza = zzbm.zza(volleyError);
            taskCompletionSource.trySetException(zza);
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    public static /* synthetic */ void zzc(zzcn zzcnVar, TaskCompletionSource taskCompletionSource, Bitmap bitmap) {
        try {
            zzcnVar.zzb(bitmap);
            taskCompletionSource.trySetResult(zzcnVar.zza());
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    public final Task zzb(zzca zzcaVar, final zzcn zzcnVar) {
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
        final zzbx zzbxVar = new zzbx(this, zzc, new EM4.InterfaceC1800b(taskCompletionSource2, null) { // from class: com.google.android.libraries.places.internal.zzbv
            public final /* synthetic */ TaskCompletionSource zza;

            @Override // p000.EM4.InterfaceC1800b
            public final void onResponse(Object obj) {
                zzby.zzc(zzcn.this, this.zza, (Bitmap) obj);
            }
        }, 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new EM4.InterfaceC1799a() { // from class: com.google.android.libraries.places.internal.zzbu
            @Override // p000.EM4.InterfaceC1799a
            public final void onErrorResponse(VolleyError volleyError) {
                zzby.zza(TaskCompletionSource.this, volleyError);
            }
        }, zzd);
        if (zza != null) {
            zza.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzbw
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final void onCanceled() {
                    OX1.this.cancel();
                }
            });
        }
        this.zza.m41571a(zzbxVar);
        return taskCompletionSource2.getTask();
    }
}
