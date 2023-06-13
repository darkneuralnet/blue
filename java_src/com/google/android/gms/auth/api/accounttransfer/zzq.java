package com.google.android.gms.auth.api.accounttransfer;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes5.dex */
public final class zzq implements Api.ApiOptions.Optional {
    public static final zzq zza;
    private final Bundle zzb;

    static {
        Bundle bundle = new Bundle();
        if (!bundle.containsKey("accountTypes")) {
            bundle.putStringArrayList("accountTypes", new ArrayList<>(0));
        }
        zza = new zzq(bundle, null);
    }

    public /* synthetic */ zzq(Bundle bundle, zzp zzpVar) {
        this.zzb = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzq)) {
            return false;
        }
        Bundle zza2 = zza();
        Bundle zza3 = ((zzq) obj).zza();
        if (zza2.size() != zza3.size()) {
            return false;
        }
        for (String str : zza2.keySet()) {
            if (!zza3.containsKey(str) || !Objects.equal(zza2.get(str), zza3.get(str))) {
                return false;
            }
            while (r3.hasNext()) {
            }
        }
        return true;
    }

    public final int hashCode() {
        Bundle zza2 = zza();
        int size = zza2.size();
        ArrayList arrayList = new ArrayList(size + size);
        ArrayList arrayList2 = new ArrayList(zza2.keySet());
        Collections.sort(arrayList2);
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            String str = (String) arrayList2.get(i);
            arrayList.add(str);
            arrayList.add(zza2.get(str));
        }
        return Objects.hashCode(arrayList);
    }

    public final Bundle zza() {
        return new Bundle(this.zzb);
    }
}
