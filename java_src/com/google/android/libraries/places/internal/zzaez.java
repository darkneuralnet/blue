package com.google.android.libraries.places.internal;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class zzaez {
    private static final zzaez zza = new zzaez();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzafd zzb = new zzaej();

    private zzaez() {
    }

    public static zzaez zza() {
        return zza;
    }

    public final zzafc zzb(Class cls) {
        zzads.zzf(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        zzafc zzafcVar = (zzafc) this.zzc.get(cls);
        if (zzafcVar == null) {
            zzafcVar = this.zzb.zza(cls);
            zzads.zzf(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
            zzads.zzf(zzafcVar, "schema");
            zzafc zzafcVar2 = (zzafc) this.zzc.putIfAbsent(cls, zzafcVar);
            if (zzafcVar2 != null) {
                return zzafcVar2;
            }
        }
        return zzafcVar;
    }
}
