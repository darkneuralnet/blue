package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes5.dex */
public abstract class zzae extends HB7 implements zzaf {
    public static zzaf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof zzaf) {
            return (zzaf) queryLocalInterface;
        }
        return new zzad(iBinder);
    }
}