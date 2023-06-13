package com.google.android.libraries.places.internal;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes6.dex */
final class zzjy extends zzjs {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicLong zzb = new AtomicLong();
    private static final ConcurrentLinkedQueue zzc = new ConcurrentLinkedQueue();
    private volatile zzja zzd;

    private zzjy(String str) {
        super(str);
        boolean z;
        boolean z2;
        String str2 = Build.FINGERPRINT;
        boolean z3 = true;
        if (str2 != null && !"robolectric".equals(str2)) {
            z = false;
        } else {
            z = true;
        }
        String str3 = Build.HARDWARE;
        if (!"goldfish".equals(str3) && !"ranchu".equals(str3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str4 = Build.TYPE;
        if (!"eng".equals(str4) && !"userdebug".equals(str4)) {
            z3 = false;
        }
        if (!z && !z2) {
            if (z3) {
                this.zzd = new zzka().zzb(false).zza(zza());
                return;
            } else {
                this.zzd = null;
                return;
            }
        }
        this.zzd = new zzjt().zza(zza());
    }

    public static zzja zzb(String str) {
        AtomicReference atomicReference = zza;
        if (atomicReference.get() != null) {
            return ((zzju) atomicReference.get()).zza(str);
        }
        zzjy zzjyVar = new zzjy(str.replace('$', CoreConstants.DOT));
        zzjw.zza.offer(zzjyVar);
        if (atomicReference.get() != null) {
            while (true) {
                zzjy zzjyVar2 = (zzjy) zzjw.zza.poll();
                if (zzjyVar2 == null) {
                    break;
                }
                zzjyVar2.zzd = ((zzju) zza.get()).zza(zzjyVar2.zza());
            }
            if (((zzjx) zzc.poll()) != null) {
                zzb.getAndDecrement();
                throw null;
            }
        }
        return zzjyVar;
    }
}
