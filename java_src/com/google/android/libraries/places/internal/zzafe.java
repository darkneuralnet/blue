package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class zzafe {
    private static final Class zza;
    private static final zzaft zzb;
    private static final zzaft zzc;
    private static final zzaft zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzZ(false);
        zzc = zzZ(true);
        zzd = new zzafv();
    }

    public static zzaft zzA() {
        return zzc;
    }

    public static zzaft zzB() {
        return zzd;
    }

    public static void zzC(zzada zzadaVar, Object obj, Object obj2) {
        zzadaVar.zza(obj2);
        throw null;
    }

    public static void zzD(zzaft zzaftVar, Object obj, Object obj2) {
        zzaftVar.zzf(obj, zzaftVar.zzd(zzaftVar.zzc(obj), zzaftVar.zzc(obj2)));
    }

    public static void zzE(Class cls) {
        Class cls2;
        if (!zzadk.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzG(zzaem zzaemVar, Object obj, Object obj2, long j) {
        zzael zzaelVar = (zzael) zzagd.zzf(obj, j);
        zzael zzaelVar2 = (zzael) zzagd.zzf(obj2, j);
        if (!zzaelVar2.isEmpty()) {
            if (!zzaelVar.zzd()) {
                zzaelVar = zzaelVar.zza();
            }
            zzaelVar.zzc(zzaelVar2);
        }
        zzagd.zzs(obj, j, zzaelVar);
    }

    public static void zzH(int i, List list, zzacy zzacyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzc(i, list, z);
        }
    }

    public static void zzI(int i, List list, zzacy zzacyVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zze(i, list);
        }
    }

    public static void zzJ(int i, List list, zzacy zzacyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzg(i, list, z);
        }
    }

    public static void zzK(int i, List list, zzacy zzacyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzi(i, list, z);
        }
    }

    public static void zzL(int i, List list, zzacy zzacyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzk(i, list, z);
        }
    }

    public static void zzM(int i, List list, zzacy zzacyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzm(i, list, z);
        }
    }

    public static void zzN(int i, List list, zzacy zzacyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzo(i, list, z);
        }
    }

    public static void zzO(int i, List list, zzacy zzacyVar, zzafc zzafcVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzacyVar.zzp(i, list.get(i2), zzafcVar);
            }
        }
    }

    public static void zzP(int i, List list, zzacy zzacyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzr(i, list, z);
        }
    }

    public static void zzQ(int i, List list, zzacy zzacyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzt(i, list, z);
        }
    }

    public static void zzR(int i, List list, zzacy zzacyVar, zzafc zzafcVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzacyVar.zzu(i, list.get(i2), zzafcVar);
            }
        }
    }

    public static void zzS(int i, List list, zzacy zzacyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzw(i, list, z);
        }
    }

    public static void zzT(int i, List list, zzacy zzacyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzy(i, list, z);
        }
    }

    public static void zzU(int i, List list, zzacy zzacyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzA(i, list, z);
        }
    }

    public static void zzV(int i, List list, zzacy zzacyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzC(i, list, z);
        }
    }

    public static void zzW(int i, List list, zzacy zzacyVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzE(i, list);
        }
    }

    public static void zzX(int i, List list, zzacy zzacyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzG(i, list, z);
        }
    }

    public static void zzY(int i, List list, zzacy zzacyVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzacyVar.zzI(i, list, z);
        }
    }

    private static zzaft zzZ(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzaft) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzacx.zzA(i << 3) + 1);
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = size * zzacx.zzz(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzz += zzacx.zzt((zzacp) list.get(i2));
        }
        return zzz;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzacx.zzz(i));
    }

    public static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadl) {
            zzadl zzadlVar = (zzadl) list;
            i = 0;
            while (i2 < size) {
                i += zzacx.zzv(zzadlVar.zzd(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzacx.zzv(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzacx.zzA(i << 3) + 4);
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzacx.zzA(i << 3) + 8);
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List list, zzafc zzafcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzacx.zzu(i, (zzaer) list.get(i3), zzafcVar);
        }
        return i2;
    }

    public static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzacx.zzz(i));
    }

    public static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadl) {
            zzadl zzadlVar = (zzadl) list;
            i = 0;
            while (i2 < size) {
                i += zzacx.zzv(zzadlVar.zzd(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzacx.zzv(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzacx.zzz(i));
    }

    public static int zzn(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeg) {
            zzaeg zzaegVar = (zzaeg) list;
            i = 0;
            while (i2 < size) {
                i += zzacx.zzB(zzaegVar.zzd(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzacx.zzB(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzo(int i, Object obj, zzafc zzafcVar) {
        if (obj instanceof zzadx) {
            int zzA = zzacx.zzA(i << 3);
            int zza2 = ((zzadx) obj).zza();
            return zzA + zzacx.zzA(zza2) + zza2;
        }
        return zzacx.zzA(i << 3) + zzacx.zzx((zzaer) obj, zzafcVar);
    }

    public static int zzp(int i, List list, zzafc zzafcVar) {
        int zzx;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzacx.zzz(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzadx) {
                zzx = zzacx.zzw((zzadx) obj);
            } else {
                zzx = zzacx.zzx((zzaer) obj, zzafcVar);
            }
            zzz += zzx;
        }
        return zzz;
    }

    public static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzacx.zzz(i));
    }

    public static int zzr(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadl) {
            zzadl zzadlVar = (zzadl) list;
            i = 0;
            while (i2 < size) {
                int zzd2 = zzadlVar.zzd(i2);
                i += zzacx.zzA((zzd2 >> 31) ^ (zzd2 + zzd2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzacx.zzA((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzacx.zzz(i));
    }

    public static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeg) {
            zzaeg zzaegVar = (zzaeg) list;
            i = 0;
            while (i2 < size) {
                long zzd2 = zzaegVar.zzd(i2);
                i += zzacx.zzB((zzd2 >> 63) ^ (zzd2 + zzd2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzacx.zzB((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzu(int i, List list) {
        int zzy;
        int zzy2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzacx.zzz(i) * size;
        if (list instanceof zzadz) {
            zzadz zzadzVar = (zzadz) list;
            while (i2 < size) {
                Object zze = zzadzVar.zze(i2);
                if (zze instanceof zzacp) {
                    zzy2 = zzacx.zzt((zzacp) zze);
                } else {
                    zzy2 = zzacx.zzy((String) zze);
                }
                zzz += zzy2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzacp) {
                    zzy = zzacx.zzt((zzacp) obj);
                } else {
                    zzy = zzacx.zzy((String) obj);
                }
                zzz += zzy;
                i2++;
            }
        }
        return zzz;
    }

    public static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzacx.zzz(i));
    }

    public static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadl) {
            zzadl zzadlVar = (zzadl) list;
            i = 0;
            while (i2 < size) {
                i += zzacx.zzA(zzadlVar.zzd(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzacx.zzA(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzacx.zzz(i));
    }

    public static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeg) {
            zzaeg zzaegVar = (zzaeg) list;
            i = 0;
            while (i2 < size) {
                i += zzacx.zzB(zzaegVar.zzd(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzacx.zzB(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzaft zzz() {
        return zzb;
    }
}
