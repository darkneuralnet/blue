package com.google.android.libraries.places.internal;

import java.util.Comparator;
import kotlin.UByte;
/* loaded from: classes6.dex */
final class zzach implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzacp zzacpVar = (zzacp) obj;
        zzacp zzacpVar2 = (zzacp) obj2;
        zzacg zzacgVar = new zzacg(zzacpVar);
        zzacg zzacgVar2 = new zzacg(zzacpVar2);
        while (zzacgVar.hasNext() && zzacgVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzacgVar.zza() & UByte.MAX_VALUE).compareTo(Integer.valueOf(zzacgVar2.zza() & UByte.MAX_VALUE));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzacpVar.zzd()).compareTo(Integer.valueOf(zzacpVar2.zzd()));
    }
}
