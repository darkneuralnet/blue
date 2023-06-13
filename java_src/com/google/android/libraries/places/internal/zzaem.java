package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes6.dex */
final class zzaem {
    public static final int zza(int i, Object obj, Object obj2) {
        zzael zzaelVar = (zzael) obj;
        zzaek zzaekVar = (zzaek) obj2;
        if (!zzaelVar.isEmpty()) {
            Iterator it = zzaelVar.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }
}
