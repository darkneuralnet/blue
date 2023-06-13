package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;
/* loaded from: classes6.dex */
final class zzaeu<T> implements zzafc<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzagd.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzaer zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzaef zzk;
    private final zzaft zzl;
    private final zzada zzm;
    private final zzaew zzn;
    private final zzaem zzo;

    private zzaeu(int[] iArr, Object[] objArr, int i, int i2, zzaer zzaerVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzaew zzaewVar, zzaef zzaefVar, zzaft zzaftVar, zzada zzadaVar, zzaem zzaemVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzg = z;
        boolean z3 = false;
        if (zzadaVar != null && zzadaVar.zzc(zzaerVar)) {
            z3 = true;
        }
        this.zzf = z3;
        this.zzh = iArr2;
        this.zzi = i3;
        this.zzj = i4;
        this.zzn = zzaewVar;
        this.zzk = zzaefVar;
        this.zzl = zzaftVar;
        this.zzm = zzadaVar;
        this.zze = zzaerVar;
        this.zzo = zzaemVar;
    }

    private final boolean zzA(Object obj, int i) {
        int zzo = zzo(i);
        long j = zzo & 1048575;
        if (j == 1048575) {
            int zzq = zzq(i);
            long j2 = zzq & 1048575;
            switch (zzp(zzq)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzagd.zza(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzagd.zzb(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzagd.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzagd.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzagd.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzagd.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzagd.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzagd.zzw(obj, j2);
                case 8:
                    Object zzf = zzagd.zzf(obj, j2);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzacp) {
                        if (zzacp.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzagd.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzacp.zzb.equals(zzagd.zzf(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzagd.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzagd.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzagd.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzagd.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzagd.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzagd.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzagd.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((zzagd.zzc(obj, j) & (1 << (zzo >>> 20))) == 0) {
            return false;
        } else {
            return true;
        }
    }

    private final boolean zzB(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzA(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzC(Object obj, int i, zzafc zzafcVar) {
        return zzafcVar.zzf(zzagd.zzf(obj, i & 1048575));
    }

    private final boolean zzD(Object obj, int i, int i2) {
        if (zzagd.zzc(obj, zzo(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean zzE(Object obj, long j) {
        return ((Boolean) zzagd.zzf(obj, j)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzF(Object obj, zzacy zzacyVar) throws IOException {
        int i;
        boolean z;
        if (!this.zzf) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i2 = 1048575;
            int i3 = 1048575;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int zzq = zzq(i4);
                int[] iArr = this.zzc;
                int i6 = iArr[i4];
                int zzp = zzp(zzq);
                if (zzp <= 17) {
                    int i7 = iArr[i4 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i3) {
                        i5 = unsafe.getInt(obj, i8);
                        i3 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = zzq & i2;
                switch (zzp) {
                    case 0:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzf(i6, zzagd.zza(obj, j));
                            break;
                        }
                    case 1:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzn(i6, zzagd.zzb(obj, j));
                            break;
                        }
                    case 2:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzs(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 3:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzH(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 4:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzq(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 5:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzl(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 6:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzj(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 7:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzb(i6, zzagd.zzw(obj, j));
                            break;
                        }
                    case 8:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzH(i6, unsafe.getObject(obj, j), zzacyVar);
                            break;
                        }
                    case 9:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzu(i6, unsafe.getObject(obj, j), zzs(i4));
                            break;
                        }
                    case 10:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzd(i6, (zzacp) unsafe.getObject(obj, j));
                            break;
                        }
                    case 11:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzF(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 12:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzh(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 13:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzv(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 14:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzx(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 15:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzz(i6, unsafe.getInt(obj, j));
                            break;
                        }
                    case 16:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzB(i6, unsafe.getLong(obj, j));
                            break;
                        }
                    case 17:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzacyVar.zzp(i6, unsafe.getObject(obj, j), zzs(i4));
                            break;
                        }
                    case 18:
                        zzafe.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, false);
                        break;
                    case 19:
                        zzafe.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, false);
                        break;
                    case 20:
                        zzafe.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, false);
                        break;
                    case 21:
                        zzafe.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, false);
                        break;
                    case 22:
                        zzafe.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, false);
                        break;
                    case 23:
                        zzafe.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, false);
                        break;
                    case 24:
                        zzafe.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, false);
                        break;
                    case 25:
                        zzafe.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, false);
                        break;
                    case 26:
                        zzafe.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar);
                        break;
                    case 27:
                        zzafe.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, zzs(i4));
                        break;
                    case 28:
                        zzafe.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar);
                        break;
                    case 29:
                        z = false;
                        zzafe.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, false);
                        break;
                    case 30:
                        z = false;
                        zzafe.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, false);
                        break;
                    case 31:
                        z = false;
                        zzafe.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, false);
                        break;
                    case 32:
                        z = false;
                        zzafe.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, false);
                        break;
                    case 33:
                        z = false;
                        zzafe.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, false);
                        break;
                    case 34:
                        z = false;
                        zzafe.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, false);
                        break;
                    case 35:
                        zzafe.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, true);
                        break;
                    case 36:
                        zzafe.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, true);
                        break;
                    case 37:
                        zzafe.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, true);
                        break;
                    case 38:
                        zzafe.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, true);
                        break;
                    case 39:
                        zzafe.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, true);
                        break;
                    case 40:
                        zzafe.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, true);
                        break;
                    case 41:
                        zzafe.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, true);
                        break;
                    case 42:
                        zzafe.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, true);
                        break;
                    case 43:
                        zzafe.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, true);
                        break;
                    case 44:
                        zzafe.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, true);
                        break;
                    case 45:
                        zzafe.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, true);
                        break;
                    case 46:
                        zzafe.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, true);
                        break;
                    case 47:
                        zzafe.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, true);
                        break;
                    case 48:
                        zzafe.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, true);
                        break;
                    case 49:
                        zzafe.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzacyVar, zzs(i4));
                        break;
                    case 50:
                        zzG(zzacyVar, i6, unsafe.getObject(obj, j), i4);
                        break;
                    case 51:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzf(i6, zzj(obj, j));
                        }
                        break;
                    case 52:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzn(i6, zzk(obj, j));
                        }
                        break;
                    case 53:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzs(i6, zzr(obj, j));
                        }
                        break;
                    case 54:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzH(i6, zzr(obj, j));
                        }
                        break;
                    case 55:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzq(i6, zzn(obj, j));
                        }
                        break;
                    case 56:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzl(i6, zzr(obj, j));
                        }
                        break;
                    case 57:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzj(i6, zzn(obj, j));
                        }
                        break;
                    case 58:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzb(i6, zzE(obj, j));
                        }
                        break;
                    case 59:
                        if (zzD(obj, i6, i4)) {
                            zzH(i6, unsafe.getObject(obj, j), zzacyVar);
                        }
                        break;
                    case 60:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzu(i6, unsafe.getObject(obj, j), zzs(i4));
                        }
                        break;
                    case 61:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzd(i6, (zzacp) unsafe.getObject(obj, j));
                        }
                        break;
                    case 62:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzF(i6, zzn(obj, j));
                        }
                        break;
                    case 63:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzh(i6, zzn(obj, j));
                        }
                        break;
                    case 64:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzv(i6, zzn(obj, j));
                        }
                        break;
                    case 65:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzx(i6, zzr(obj, j));
                        }
                        break;
                    case 66:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzz(i6, zzn(obj, j));
                        }
                        break;
                    case 67:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzB(i6, zzr(obj, j));
                        }
                        break;
                    case 68:
                        if (zzD(obj, i6, i4)) {
                            zzacyVar.zzp(i6, unsafe.getObject(obj, j), zzs(i4));
                        }
                        break;
                }
                i4 += 3;
                i2 = 1048575;
            }
            zzaft zzaftVar = this.zzl;
            zzaftVar.zzg(zzaftVar.zzc(obj), zzacyVar);
            return;
        }
        this.zzm.zza(obj);
        throw null;
    }

    private final void zzG(zzacy zzacyVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzaek zzaekVar = (zzaek) zzt(i2);
        throw null;
    }

    private static final void zzH(int i, Object obj, zzacy zzacyVar) throws IOException {
        if (obj instanceof String) {
            zzacyVar.zzD(i, (String) obj);
        } else {
            zzacyVar.zzd(i, (zzacp) obj);
        }
    }

    public static zzaeu zzg(Class cls, zzaeo zzaeoVar, zzaew zzaewVar, zzaef zzaefVar, zzaft zzaftVar, zzada zzadaVar, zzaem zzaemVar) {
        if (zzaeoVar instanceof zzafb) {
            return zzh((zzafb) zzaeoVar, zzaewVar, zzaefVar, zzaftVar, zzadaVar, zzaemVar);
        }
        zzafq zzafqVar = (zzafq) zzaeoVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaeu zzh(zzafb zzafbVar, zzaew zzaewVar, zzaef zzaefVar, zzaft zzaftVar, zzada zzadaVar, zzaem zzaemVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        char charAt7;
        int i10;
        char charAt8;
        int i11;
        char charAt9;
        int i12;
        char charAt10;
        int i13;
        char charAt11;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        Object[] objArr;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        Field zzu;
        char charAt12;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field zzu2;
        Object obj2;
        Field zzu3;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        int i29;
        char charAt15;
        int i30;
        char charAt16;
        boolean z = zzafbVar.zzc() == 2;
        String zzd = zzafbVar.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (zzd.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int charAt17 = zzd.charAt(i);
        if (charAt17 >= 55296) {
            int i33 = charAt17 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                charAt16 = zzd.charAt(i32);
                if (charAt16 < 55296) {
                    break;
                }
                i33 |= (charAt16 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            charAt17 = i33 | (charAt16 << i34);
            i32 = i30;
        }
        if (charAt17 == 0) {
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i4 = 0;
            charAt3 = 0;
            i2 = 0;
            iArr = zza;
            i3 = 0;
        } else {
            int i35 = i32 + 1;
            int charAt18 = zzd.charAt(i32);
            if (charAt18 >= 55296) {
                int i36 = charAt18 & 8191;
                int i37 = 13;
                while (true) {
                    i13 = i35 + 1;
                    charAt11 = zzd.charAt(i35);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i36 |= (charAt11 & 8191) << i37;
                    i37 += 13;
                    i35 = i13;
                }
                charAt18 = i36 | (charAt11 << i37);
                i35 = i13;
            }
            int i38 = i35 + 1;
            int charAt19 = zzd.charAt(i35);
            if (charAt19 >= 55296) {
                int i39 = charAt19 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    charAt10 = zzd.charAt(i38);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i39 |= (charAt10 & 8191) << i40;
                    i40 += 13;
                    i38 = i12;
                }
                charAt19 = i39 | (charAt10 << i40);
                i38 = i12;
            }
            int i41 = i38 + 1;
            charAt = zzd.charAt(i38);
            if (charAt >= 55296) {
                int i42 = charAt & 8191;
                int i43 = 13;
                while (true) {
                    i11 = i41 + 1;
                    charAt9 = zzd.charAt(i41);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i41 = i11;
                }
                charAt = i42 | (charAt9 << i43);
                i41 = i11;
            }
            int i44 = i41 + 1;
            int charAt20 = zzd.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    charAt8 = zzd.charAt(i44);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i45 |= (charAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i10;
                }
                charAt20 = i45 | (charAt8 << i46);
                i44 = i10;
            }
            int i47 = i44 + 1;
            charAt2 = zzd.charAt(i44);
            if (charAt2 >= 55296) {
                int i48 = charAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    charAt7 = zzd.charAt(i47);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i48 |= (charAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i9;
                }
                charAt2 = i48 | (charAt7 << i49);
                i47 = i9;
            }
            int i50 = i47 + 1;
            int charAt21 = zzd.charAt(i47);
            if (charAt21 >= 55296) {
                int i51 = charAt21 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    charAt6 = zzd.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i8;
                }
                charAt21 = i51 | (charAt6 << i52);
                i50 = i8;
            }
            int i53 = i50 + 1;
            int charAt22 = zzd.charAt(i50);
            if (charAt22 >= 55296) {
                int i54 = charAt22 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    charAt5 = zzd.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i7;
                }
                charAt22 = i54 | (charAt5 << i55);
                i53 = i7;
            }
            int i56 = i53 + 1;
            charAt3 = zzd.charAt(i53);
            if (charAt3 >= 55296) {
                int i57 = charAt3 & 8191;
                int i58 = 13;
                while (true) {
                    i6 = i56 + 1;
                    charAt4 = zzd.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i6;
                }
                charAt3 = i57 | (charAt4 << i58);
                i56 = i6;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i2 = charAt18 + charAt18 + charAt19;
            i3 = charAt18;
            i32 = i56;
            int i59 = charAt21;
            i4 = charAt20;
            i5 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzafbVar.zze();
        Class<?> cls = zzafbVar.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i60 = charAt3 + i5;
        int i61 = charAt3;
        int i62 = i60;
        int i63 = 0;
        int i64 = 0;
        while (i32 < length) {
            int i65 = i32 + 1;
            int charAt23 = zzd.charAt(i32);
            if (charAt23 >= c) {
                int i66 = charAt23 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i29 = i67 + 1;
                    charAt15 = zzd.charAt(i67);
                    if (charAt15 < c) {
                        break;
                    }
                    i66 |= (charAt15 & 8191) << i68;
                    i68 += 13;
                    i67 = i29;
                }
                charAt23 = i66 | (charAt15 << i68);
                i14 = i29;
            } else {
                i14 = i65;
            }
            int i69 = i14 + 1;
            int charAt24 = zzd.charAt(i14);
            if (charAt24 >= c) {
                int i70 = charAt24 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    charAt14 = zzd.charAt(i71);
                    i15 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i70 |= (charAt14 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                    length = i15;
                }
                charAt24 = i70 | (charAt14 << i72);
                i16 = i28;
            } else {
                i15 = length;
                i16 = i69;
            }
            int i73 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i74 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            if (i73 >= 51) {
                int i75 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                if (charAt25 >= 55296) {
                    int i76 = charAt25 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i27 = i77 + 1;
                        charAt13 = zzd.charAt(i77);
                        i18 = i4;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i76 |= (charAt13 & 8191) << i78;
                        i78 += 13;
                        i77 = i27;
                        i4 = i18;
                    }
                    charAt25 = i76 | (charAt13 << i78);
                    i25 = i27;
                } else {
                    i18 = i4;
                    i25 = i75;
                }
                int i79 = i73 - 51;
                i22 = i25;
                if (i79 == 9 || i79 == 17) {
                    int i80 = i63 / 3;
                    i26 = i2 + 1;
                    objArr2[i80 + i80 + 1] = zze[i2];
                } else {
                    if (i79 == 12 && !z) {
                        int i81 = i63 / 3;
                        i26 = i2 + 1;
                        objArr2[i81 + i81 + 1] = zze[i2];
                    }
                    int i82 = charAt25 + charAt25;
                    obj = zze[i82];
                    if (!(obj instanceof Field)) {
                        zzu2 = (Field) obj;
                    } else {
                        zzu2 = zzu(cls, (String) obj);
                        zze[i82] = zzu2;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzu2);
                    int i83 = i82 + 1;
                    obj2 = zze[i83];
                    if (!(obj2 instanceof Field)) {
                        zzu3 = (Field) obj2;
                    } else {
                        zzu3 = zzu(cls, (String) obj2);
                        zze[i83] = zzu3;
                    }
                    str = zzd;
                    i21 = (int) unsafe.objectFieldOffset(zzu3);
                    objArr = objArr2;
                    objectFieldOffset = objectFieldOffset2;
                    i23 = 0;
                }
                i2 = i26;
                int i822 = charAt25 + charAt25;
                obj = zze[i822];
                if (!(obj instanceof Field)) {
                }
                iArr2 = iArr3;
                i17 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzu2);
                int i832 = i822 + 1;
                obj2 = zze[i832];
                if (!(obj2 instanceof Field)) {
                }
                str = zzd;
                i21 = (int) unsafe.objectFieldOffset(zzu3);
                objArr = objArr2;
                objectFieldOffset = objectFieldOffset22;
                i23 = 0;
            } else {
                iArr2 = iArr3;
                i17 = charAt;
                i18 = i4;
                int i84 = i2 + 1;
                Field zzu4 = zzu(cls, (String) zze[i2]);
                if (i73 == 9 || i73 == 17) {
                    int i85 = i63 / 3;
                    objArr2[i85 + i85 + 1] = zzu4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        int i86 = i63 / 3;
                        i24 = i84 + 1;
                        objArr2[i86 + i86 + 1] = zze[i84];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (!z) {
                            int i87 = i63 / 3;
                            i24 = i84 + 1;
                            objArr2[i87 + i87 + 1] = zze[i84];
                        }
                    } else if (i73 == 50) {
                        int i88 = i61 + 1;
                        iArr[i61] = i63;
                        int i89 = i63 / 3;
                        int i90 = i89 + i89;
                        int i91 = i84 + 1;
                        objArr2[i90] = zze[i84];
                        if ((charAt24 & 2048) != 0) {
                            i84 = i91 + 1;
                            objArr2[i90 + 1] = zze[i91];
                            i61 = i88;
                        } else {
                            i61 = i88;
                            i19 = i91;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzu4);
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i73 > 17) {
                                str = zzd;
                                i20 = i19;
                                i21 = 1048575;
                                i22 = i16;
                                i23 = 0;
                            } else {
                                int i92 = i16 + 1;
                                int charAt26 = zzd.charAt(i16);
                                if (charAt26 >= 55296) {
                                    int i93 = charAt26 & 8191;
                                    int i94 = 13;
                                    while (true) {
                                        i22 = i92 + 1;
                                        charAt12 = zzd.charAt(i92);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i93 |= (charAt12 & 8191) << i94;
                                        i94 += 13;
                                        i92 = i22;
                                    }
                                    charAt26 = i93 | (charAt12 << i94);
                                } else {
                                    i22 = i92;
                                }
                                int i95 = i3 + i3 + (charAt26 / 32);
                                Object obj3 = zze[i95];
                                str = zzd;
                                if (obj3 instanceof Field) {
                                    zzu = (Field) obj3;
                                } else {
                                    zzu = zzu(cls, (String) obj3);
                                    zze[i95] = zzu;
                                }
                                i20 = i19;
                                i21 = (int) unsafe.objectFieldOffset(zzu);
                                i23 = charAt26 % 32;
                            }
                            if (i73 >= 18 || i73 > 49) {
                                i2 = i20;
                            } else {
                                iArr[i62] = objectFieldOffset;
                                i2 = i20;
                                i62++;
                            }
                        }
                    }
                    i19 = i24;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzu4);
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = zzd;
                    i20 = i19;
                    i21 = 1048575;
                    i22 = i16;
                    i23 = 0;
                    if (i73 >= 18) {
                    }
                    i2 = i20;
                }
                i19 = i84;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzu4);
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                str = zzd;
                i20 = i19;
                i21 = 1048575;
                i22 = i16;
                i23 = 0;
                if (i73 >= 18) {
                }
                i2 = i20;
            }
            int i96 = i63 + 1;
            iArr2[i63] = charAt23;
            int i97 = i96 + 1;
            iArr2[i96] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i73 << 20) | objectFieldOffset;
            i63 = i97 + 1;
            iArr2[i97] = (i23 << 20) | i21;
            charAt = i17;
            charAt3 = i74;
            i32 = i22;
            length = i15;
            objArr2 = objArr;
            zzd = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new zzaeu(iArr3, objArr2, charAt, i4, zzafbVar.zza(), z, false, iArr, charAt3, i60, zzaewVar, zzaefVar, zzaftVar, zzadaVar, zzaemVar, null);
    }

    private static double zzj(Object obj, long j) {
        return ((Double) zzagd.zzf(obj, j)).doubleValue();
    }

    private static float zzk(Object obj, long j) {
        return ((Float) zzagd.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzl(Object obj) {
        int i;
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int i2;
        int zzu;
        boolean z;
        int zzd2;
        int zzi;
        int zzz;
        int zzA8;
        int i3;
        int zzA9;
        int zzA10;
        int zzA11;
        int zzB2;
        int zzA12;
        int zzd3;
        int zzA13;
        int i4;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < this.zzc.length) {
            int zzq = zzq(i7);
            int[] iArr = this.zzc;
            int i10 = iArr[i7];
            int zzp = zzp(zzq);
            if (zzp <= 17) {
                int i11 = iArr[i7 + 2];
                int i12 = i11 & i5;
                i = 1 << (i11 >>> 20);
                if (i12 != i6) {
                    i9 = unsafe.getInt(obj, i12);
                    i6 = i12;
                }
            } else {
                i = 0;
            }
            long j = zzq & i5;
            switch (zzp) {
                case 0:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA = zzacx.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i8 += zzA5;
                        break;
                    }
                case 1:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzacx.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i8 += zzA5;
                        break;
                    }
                case 2:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzA3 = zzacx.zzA(i10 << 3);
                        zzB = zzacx.zzB(j2);
                        i8 += zzA3 + zzB;
                        break;
                    }
                case 3:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        zzA3 = zzacx.zzA(i10 << 3);
                        zzB = zzacx.zzB(j3);
                        i8 += zzA3 + zzB;
                        break;
                    }
                case 4:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        zzA4 = zzacx.zzA(i10 << 3);
                        zzv = zzacx.zzv(i13);
                        i2 = zzA4 + zzv;
                        i8 += i2;
                        break;
                    }
                case 5:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA = zzacx.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i8 += zzA5;
                        break;
                    }
                case 6:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzacx.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i8 += zzA5;
                        break;
                    }
                case 7:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzacx.zzA(i10 << 3) + 1;
                        i8 += zzA5;
                        break;
                    }
                case 8:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzacp) {
                            zzA6 = zzacx.zzA(i10 << 3);
                            zzd = ((zzacp) object).zzd();
                            zzA7 = zzacx.zzA(zzd);
                            i2 = zzA6 + zzA7 + zzd;
                            i8 += i2;
                            break;
                        } else {
                            zzA4 = zzacx.zzA(i10 << 3);
                            zzv = zzacx.zzy((String) object);
                            i2 = zzA4 + zzv;
                            i8 += i2;
                        }
                    }
                case 9:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzafe.zzo(i10, unsafe.getObject(obj, j), zzs(i7));
                        i8 += zzA5;
                        break;
                    }
                case 10:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA6 = zzacx.zzA(i10 << 3);
                        zzd = ((zzacp) unsafe.getObject(obj, j)).zzd();
                        zzA7 = zzacx.zzA(zzd);
                        i2 = zzA6 + zzA7 + zzd;
                        i8 += i2;
                        break;
                    }
                case 11:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzA4 = zzacx.zzA(i10 << 3);
                        zzv = zzacx.zzA(i14);
                        i2 = zzA4 + zzv;
                        i8 += i2;
                        break;
                    }
                case 12:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j);
                        zzA4 = zzacx.zzA(i10 << 3);
                        zzv = zzacx.zzv(i15);
                        i2 = zzA4 + zzv;
                        i8 += i2;
                        break;
                    }
                case 13:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzacx.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i8 += zzA5;
                        break;
                    }
                case 14:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA = zzacx.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i8 += zzA5;
                        break;
                    }
                case 15:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i16 = unsafe.getInt(obj, j);
                        zzA4 = zzacx.zzA(i10 << 3);
                        zzv = zzacx.zzA((i16 >> 31) ^ (i16 + i16));
                        i2 = zzA4 + zzv;
                        i8 += i2;
                        break;
                    }
                case 16:
                    if ((i & i9) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        i8 += zzacx.zzA(i10 << 3) + zzacx.zzB((j4 >> 63) ^ (j4 + j4));
                        break;
                    }
                case 17:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzacx.zzu(i10, (zzaer) unsafe.getObject(obj, j), zzs(i7));
                        i8 += zzA5;
                        break;
                    }
                case 18:
                    zzA5 = zzafe.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 19:
                    zzA5 = zzafe.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 20:
                    zzA5 = zzafe.zzm(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 21:
                    zzA5 = zzafe.zzx(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 22:
                    zzA5 = zzafe.zzk(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 23:
                    zzA5 = zzafe.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 24:
                    zzA5 = zzafe.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 25:
                    zzA5 = zzafe.zza(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 26:
                    zzu = zzafe.zzu(i10, (List) unsafe.getObject(obj, j));
                    i8 += zzu;
                    break;
                case 27:
                    zzu = zzafe.zzp(i10, (List) unsafe.getObject(obj, j), zzs(i7));
                    i8 += zzu;
                    break;
                case 28:
                    zzu = zzafe.zzc(i10, (List) unsafe.getObject(obj, j));
                    i8 += zzu;
                    break;
                case 29:
                    zzu = zzafe.zzv(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzu;
                    break;
                case 30:
                    z = false;
                    zzd2 = zzafe.zzd(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 31:
                    z = false;
                    zzd2 = zzafe.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 32:
                    z = false;
                    zzd2 = zzafe.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 33:
                    z = false;
                    zzd2 = zzafe.zzq(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 34:
                    z = false;
                    zzd2 = zzafe.zzs(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 35:
                    zzi = zzafe.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzacx.zzz(i10);
                        zzA8 = zzacx.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 36:
                    zzi = zzafe.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzacx.zzz(i10);
                        zzA8 = zzacx.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 37:
                    zzi = zzafe.zzn((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzacx.zzz(i10);
                        zzA8 = zzacx.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 38:
                    zzi = zzafe.zzy((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzacx.zzz(i10);
                        zzA8 = zzacx.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 39:
                    zzi = zzafe.zzl((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzacx.zzz(i10);
                        zzA8 = zzacx.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 40:
                    zzi = zzafe.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzacx.zzz(i10);
                        zzA8 = zzacx.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 41:
                    zzi = zzafe.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzacx.zzz(i10);
                        zzA8 = zzacx.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 42:
                    zzi = zzafe.zzb((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzacx.zzz(i10);
                        zzA8 = zzacx.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 43:
                    zzi = zzafe.zzw((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzacx.zzz(i10);
                        zzA8 = zzacx.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 44:
                    zzi = zzafe.zze((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzacx.zzz(i10);
                        zzA8 = zzacx.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 45:
                    zzi = zzafe.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzacx.zzz(i10);
                        zzA8 = zzacx.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 46:
                    zzi = zzafe.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzacx.zzz(i10);
                        zzA8 = zzacx.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 47:
                    zzi = zzafe.zzr((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzacx.zzz(i10);
                        zzA8 = zzacx.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 48:
                    zzi = zzafe.zzt((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzacx.zzz(i10);
                        zzA8 = zzacx.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 49:
                    zzu = zzafe.zzj(i10, (List) unsafe.getObject(obj, j), zzs(i7));
                    i8 += zzu;
                    break;
                case 50:
                    zzaem.zza(i10, unsafe.getObject(obj, j), zzt(i7));
                    break;
                case 51:
                    if (zzD(obj, i10, i7)) {
                        zzA9 = zzacx.zzA(i10 << 3);
                        zzu = zzA9 + 8;
                        i8 += zzu;
                    }
                    break;
                case 52:
                    if (zzD(obj, i10, i7)) {
                        zzA10 = zzacx.zzA(i10 << 3);
                        zzu = zzA10 + 4;
                        i8 += zzu;
                    }
                    break;
                case 53:
                    if (zzD(obj, i10, i7)) {
                        long zzr = zzr(obj, j);
                        zzA11 = zzacx.zzA(i10 << 3);
                        zzB2 = zzacx.zzB(zzr);
                        i8 += zzA11 + zzB2;
                    }
                    break;
                case 54:
                    if (zzD(obj, i10, i7)) {
                        long zzr2 = zzr(obj, j);
                        zzA11 = zzacx.zzA(i10 << 3);
                        zzB2 = zzacx.zzB(zzr2);
                        i8 += zzA11 + zzB2;
                    }
                    break;
                case 55:
                    if (zzD(obj, i10, i7)) {
                        int zzn = zzn(obj, j);
                        i3 = zzacx.zzA(i10 << 3);
                        zzi = zzacx.zzv(zzn);
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 56:
                    if (zzD(obj, i10, i7)) {
                        zzA9 = zzacx.zzA(i10 << 3);
                        zzu = zzA9 + 8;
                        i8 += zzu;
                    }
                    break;
                case 57:
                    if (zzD(obj, i10, i7)) {
                        zzA10 = zzacx.zzA(i10 << 3);
                        zzu = zzA10 + 4;
                        i8 += zzu;
                    }
                    break;
                case 58:
                    if (zzD(obj, i10, i7)) {
                        zzu = zzacx.zzA(i10 << 3) + 1;
                        i8 += zzu;
                    }
                    break;
                case 59:
                    if (zzD(obj, i10, i7)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzacp) {
                            zzA12 = zzacx.zzA(i10 << 3);
                            zzd3 = ((zzacp) object2).zzd();
                            zzA13 = zzacx.zzA(zzd3);
                            i4 = zzA12 + zzA13 + zzd3;
                            i8 += i4;
                        } else {
                            i3 = zzacx.zzA(i10 << 3);
                            zzi = zzacx.zzy((String) object2);
                            i4 = i3 + zzi;
                            i8 += i4;
                        }
                    }
                    break;
                case 60:
                    if (zzD(obj, i10, i7)) {
                        zzu = zzafe.zzo(i10, unsafe.getObject(obj, j), zzs(i7));
                        i8 += zzu;
                    }
                    break;
                case 61:
                    if (zzD(obj, i10, i7)) {
                        zzA12 = zzacx.zzA(i10 << 3);
                        zzd3 = ((zzacp) unsafe.getObject(obj, j)).zzd();
                        zzA13 = zzacx.zzA(zzd3);
                        i4 = zzA12 + zzA13 + zzd3;
                        i8 += i4;
                    }
                    break;
                case 62:
                    if (zzD(obj, i10, i7)) {
                        int zzn2 = zzn(obj, j);
                        i3 = zzacx.zzA(i10 << 3);
                        zzi = zzacx.zzA(zzn2);
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 63:
                    if (zzD(obj, i10, i7)) {
                        int zzn3 = zzn(obj, j);
                        i3 = zzacx.zzA(i10 << 3);
                        zzi = zzacx.zzv(zzn3);
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 64:
                    if (zzD(obj, i10, i7)) {
                        zzA10 = zzacx.zzA(i10 << 3);
                        zzu = zzA10 + 4;
                        i8 += zzu;
                    }
                    break;
                case 65:
                    if (zzD(obj, i10, i7)) {
                        zzA9 = zzacx.zzA(i10 << 3);
                        zzu = zzA9 + 8;
                        i8 += zzu;
                    }
                    break;
                case 66:
                    if (zzD(obj, i10, i7)) {
                        int zzn4 = zzn(obj, j);
                        i3 = zzacx.zzA(i10 << 3);
                        zzi = zzacx.zzA((zzn4 >> 31) ^ (zzn4 + zzn4));
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 67:
                    if (zzD(obj, i10, i7)) {
                        long zzr3 = zzr(obj, j);
                        i8 += zzacx.zzA(i10 << 3) + zzacx.zzB((zzr3 >> 63) ^ (zzr3 + zzr3));
                    }
                    break;
                case 68:
                    if (zzD(obj, i10, i7)) {
                        zzu = zzacx.zzu(i10, (zzaer) unsafe.getObject(obj, j), zzs(i7));
                        i8 += zzu;
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        zzaft zzaftVar = this.zzl;
        int zza2 = i8 + zzaftVar.zza(zzaftVar.zzc(obj));
        if (!this.zzf) {
            return zza2;
        }
        this.zzm.zza(obj);
        throw null;
    }

    private final int zzm(Object obj) {
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int zzo;
        int zzz;
        int zzA8;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int zzq = zzq(i3);
            int zzp = zzp(zzq);
            int i4 = this.zzc[i3];
            long j = zzq & 1048575;
            if (zzp >= zzadf.zzJ.zza() && zzp <= zzadf.zzW.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzp) {
                case 0:
                    if (zzA(obj, i3)) {
                        zzA = zzacx.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzA(obj, i3)) {
                        zzA2 = zzacx.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzA(obj, i3)) {
                        long zzd2 = zzagd.zzd(obj, j);
                        zzA3 = zzacx.zzA(i4 << 3);
                        zzB = zzacx.zzB(zzd2);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzA(obj, i3)) {
                        long zzd3 = zzagd.zzd(obj, j);
                        zzA3 = zzacx.zzA(i4 << 3);
                        zzB = zzacx.zzB(zzd3);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzA(obj, i3)) {
                        int zzc = zzagd.zzc(obj, j);
                        zzA4 = zzacx.zzA(i4 << 3);
                        zzv = zzacx.zzv(zzc);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzA(obj, i3)) {
                        zzA = zzacx.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzA(obj, i3)) {
                        zzA2 = zzacx.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzA(obj, i3)) {
                        zzA5 = zzacx.zzA(i4 << 3);
                        zzo = zzA5 + 1;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzA(obj, i3)) {
                        break;
                    } else {
                        Object zzf = zzagd.zzf(obj, j);
                        if (zzf instanceof zzacp) {
                            zzA6 = zzacx.zzA(i4 << 3);
                            zzd = ((zzacp) zzf).zzd();
                            zzA7 = zzacx.zzA(zzd);
                            i = zzA6 + zzA7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzA4 = zzacx.zzA(i4 << 3);
                            zzv = zzacx.zzy((String) zzf);
                            i = zzA4 + zzv;
                            i2 += i;
                        }
                    }
                case 9:
                    if (zzA(obj, i3)) {
                        zzo = zzafe.zzo(i4, zzagd.zzf(obj, j), zzs(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzA(obj, i3)) {
                        zzA6 = zzacx.zzA(i4 << 3);
                        zzd = ((zzacp) zzagd.zzf(obj, j)).zzd();
                        zzA7 = zzacx.zzA(zzd);
                        i = zzA6 + zzA7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzA(obj, i3)) {
                        int zzc2 = zzagd.zzc(obj, j);
                        zzA4 = zzacx.zzA(i4 << 3);
                        zzv = zzacx.zzA(zzc2);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzA(obj, i3)) {
                        int zzc3 = zzagd.zzc(obj, j);
                        zzA4 = zzacx.zzA(i4 << 3);
                        zzv = zzacx.zzv(zzc3);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzA(obj, i3)) {
                        zzA2 = zzacx.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzA(obj, i3)) {
                        zzA = zzacx.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzA(obj, i3)) {
                        int zzc4 = zzagd.zzc(obj, j);
                        zzA4 = zzacx.zzA(i4 << 3);
                        zzv = zzacx.zzA((zzc4 >> 31) ^ (zzc4 + zzc4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzA(obj, i3)) {
                        long zzd4 = zzagd.zzd(obj, j);
                        zzA4 = zzacx.zzA(i4 << 3);
                        zzv = zzacx.zzB((zzd4 >> 63) ^ (zzd4 + zzd4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzA(obj, i3)) {
                        zzo = zzacx.zzu(i4, (zzaer) zzagd.zzf(obj, j), zzs(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzafe.zzh(i4, (List) zzagd.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 19:
                    zzo = zzafe.zzf(i4, (List) zzagd.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 20:
                    zzo = zzafe.zzm(i4, (List) zzagd.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 21:
                    zzo = zzafe.zzx(i4, (List) zzagd.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 22:
                    zzo = zzafe.zzk(i4, (List) zzagd.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 23:
                    zzo = zzafe.zzh(i4, (List) zzagd.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 24:
                    zzo = zzafe.zzf(i4, (List) zzagd.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 25:
                    zzo = zzafe.zza(i4, (List) zzagd.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 26:
                    zzo = zzafe.zzu(i4, (List) zzagd.zzf(obj, j));
                    i2 += zzo;
                    break;
                case 27:
                    zzo = zzafe.zzp(i4, (List) zzagd.zzf(obj, j), zzs(i3));
                    i2 += zzo;
                    break;
                case 28:
                    zzo = zzafe.zzc(i4, (List) zzagd.zzf(obj, j));
                    i2 += zzo;
                    break;
                case 29:
                    zzo = zzafe.zzv(i4, (List) zzagd.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 30:
                    zzo = zzafe.zzd(i4, (List) zzagd.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 31:
                    zzo = zzafe.zzf(i4, (List) zzagd.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 32:
                    zzo = zzafe.zzh(i4, (List) zzagd.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 33:
                    zzo = zzafe.zzq(i4, (List) zzagd.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 34:
                    zzo = zzafe.zzs(i4, (List) zzagd.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 35:
                    zzv = zzafe.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzacx.zzz(i4);
                        zzA8 = zzacx.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzv = zzafe.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzacx.zzz(i4);
                        zzA8 = zzacx.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzv = zzafe.zzn((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzacx.zzz(i4);
                        zzA8 = zzacx.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzv = zzafe.zzy((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzacx.zzz(i4);
                        zzA8 = zzacx.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzv = zzafe.zzl((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzacx.zzz(i4);
                        zzA8 = zzacx.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzv = zzafe.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzacx.zzz(i4);
                        zzA8 = zzacx.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzv = zzafe.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzacx.zzz(i4);
                        zzA8 = zzacx.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzv = zzafe.zzb((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzacx.zzz(i4);
                        zzA8 = zzacx.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzv = zzafe.zzw((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzacx.zzz(i4);
                        zzA8 = zzacx.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzv = zzafe.zze((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzacx.zzz(i4);
                        zzA8 = zzacx.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzv = zzafe.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzacx.zzz(i4);
                        zzA8 = zzacx.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzv = zzafe.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzacx.zzz(i4);
                        zzA8 = zzacx.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzv = zzafe.zzr((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzacx.zzz(i4);
                        zzA8 = zzacx.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzv = zzafe.zzt((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzacx.zzz(i4);
                        zzA8 = zzacx.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzafe.zzj(i4, (List) zzagd.zzf(obj, j), zzs(i3));
                    i2 += zzo;
                    break;
                case 50:
                    zzaem.zza(i4, zzagd.zzf(obj, j), zzt(i3));
                    break;
                case 51:
                    if (zzD(obj, i4, i3)) {
                        zzA = zzacx.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzD(obj, i4, i3)) {
                        zzA2 = zzacx.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzD(obj, i4, i3)) {
                        long zzr = zzr(obj, j);
                        zzA3 = zzacx.zzA(i4 << 3);
                        zzB = zzacx.zzB(zzr);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzD(obj, i4, i3)) {
                        long zzr2 = zzr(obj, j);
                        zzA3 = zzacx.zzA(i4 << 3);
                        zzB = zzacx.zzB(zzr2);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzD(obj, i4, i3)) {
                        int zzn = zzn(obj, j);
                        zzA4 = zzacx.zzA(i4 << 3);
                        zzv = zzacx.zzv(zzn);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzD(obj, i4, i3)) {
                        zzA = zzacx.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzD(obj, i4, i3)) {
                        zzA2 = zzacx.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzD(obj, i4, i3)) {
                        zzA5 = zzacx.zzA(i4 << 3);
                        zzo = zzA5 + 1;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzD(obj, i4, i3)) {
                        break;
                    } else {
                        Object zzf2 = zzagd.zzf(obj, j);
                        if (zzf2 instanceof zzacp) {
                            zzA6 = zzacx.zzA(i4 << 3);
                            zzd = ((zzacp) zzf2).zzd();
                            zzA7 = zzacx.zzA(zzd);
                            i = zzA6 + zzA7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzA4 = zzacx.zzA(i4 << 3);
                            zzv = zzacx.zzy((String) zzf2);
                            i = zzA4 + zzv;
                            i2 += i;
                        }
                    }
                case 60:
                    if (zzD(obj, i4, i3)) {
                        zzo = zzafe.zzo(i4, zzagd.zzf(obj, j), zzs(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzD(obj, i4, i3)) {
                        zzA6 = zzacx.zzA(i4 << 3);
                        zzd = ((zzacp) zzagd.zzf(obj, j)).zzd();
                        zzA7 = zzacx.zzA(zzd);
                        i = zzA6 + zzA7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzD(obj, i4, i3)) {
                        int zzn2 = zzn(obj, j);
                        zzA4 = zzacx.zzA(i4 << 3);
                        zzv = zzacx.zzA(zzn2);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzD(obj, i4, i3)) {
                        int zzn3 = zzn(obj, j);
                        zzA4 = zzacx.zzA(i4 << 3);
                        zzv = zzacx.zzv(zzn3);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzD(obj, i4, i3)) {
                        zzA2 = zzacx.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzD(obj, i4, i3)) {
                        zzA = zzacx.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzD(obj, i4, i3)) {
                        int zzn4 = zzn(obj, j);
                        zzA4 = zzacx.zzA(i4 << 3);
                        zzv = zzacx.zzA((zzn4 >> 31) ^ (zzn4 + zzn4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzD(obj, i4, i3)) {
                        long zzr3 = zzr(obj, j);
                        zzA4 = zzacx.zzA(i4 << 3);
                        zzv = zzacx.zzB((zzr3 >> 63) ^ (zzr3 + zzr3));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzD(obj, i4, i3)) {
                        zzo = zzacx.zzu(i4, (zzaer) zzagd.zzf(obj, j), zzs(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzaft zzaftVar = this.zzl;
        return i2 + zzaftVar.zza(zzaftVar.zzc(obj));
    }

    private static int zzn(Object obj, long j) {
        return ((Integer) zzagd.zzf(obj, j)).intValue();
    }

    private final int zzo(int i) {
        return this.zzc[i + 2];
    }

    private static int zzp(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    private final int zzq(int i) {
        return this.zzc[i + 1];
    }

    private static long zzr(Object obj, long j) {
        return ((Long) zzagd.zzf(obj, j)).longValue();
    }

    private final zzafc zzs(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzafc zzafcVar = (zzafc) this.zzd[i3];
        if (zzafcVar != null) {
            return zzafcVar;
        }
        zzafc zzb2 = zzaez.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzt(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzu(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final void zzv(Object obj, Object obj2, int i) {
        long zzq = zzq(i) & 1048575;
        if (!zzA(obj2, i)) {
            return;
        }
        Object zzf = zzagd.zzf(obj, zzq);
        Object zzf2 = zzagd.zzf(obj2, zzq);
        if (zzf != null && zzf2 != null) {
            zzagd.zzs(obj, zzq, zzads.zzg(zzf, zzf2));
            zzx(obj, i);
        } else if (zzf2 != null) {
            zzagd.zzs(obj, zzq, zzf2);
            zzx(obj, i);
        }
    }

    private final void zzw(Object obj, Object obj2, int i) {
        Object obj3;
        int zzq = zzq(i);
        int i2 = this.zzc[i];
        long j = zzq & 1048575;
        if (!zzD(obj2, i2, i)) {
            return;
        }
        if (zzD(obj, i2, i)) {
            obj3 = zzagd.zzf(obj, j);
        } else {
            obj3 = null;
        }
        Object zzf = zzagd.zzf(obj2, j);
        if (obj3 != null && zzf != null) {
            zzagd.zzs(obj, j, zzads.zzg(obj3, zzf));
            zzy(obj, i2, i);
        } else if (zzf != null) {
            zzagd.zzs(obj, j, zzf);
            zzy(obj, i2, i);
        }
    }

    private final void zzx(Object obj, int i) {
        int zzo = zzo(i);
        long j = 1048575 & zzo;
        if (j == 1048575) {
            return;
        }
        zzagd.zzq(obj, j, (1 << (zzo >>> 20)) | zzagd.zzc(obj, j));
    }

    private final void zzy(Object obj, int i, int i2) {
        zzagd.zzq(obj, zzo(i2) & 1048575, i);
    }

    private final boolean zzz(Object obj, Object obj2, int i) {
        return zzA(obj, i) == zzA(obj2, i);
    }

    @Override // com.google.android.libraries.places.internal.zzafc
    public final int zza(Object obj) {
        return this.zzg ? zzm(obj) : zzl(obj);
    }

    @Override // com.google.android.libraries.places.internal.zzafc
    public final int zzb(Object obj) {
        int i;
        int zzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzq = zzq(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzq;
            int i5 = 37;
            switch (zzp(zzq)) {
                case 0:
                    i = i2 * 53;
                    zzc = zzads.zzc(Double.doubleToLongBits(zzagd.zza(obj, j)));
                    i2 = i + zzc;
                    break;
                case 1:
                    i = i2 * 53;
                    zzc = Float.floatToIntBits(zzagd.zzb(obj, j));
                    i2 = i + zzc;
                    break;
                case 2:
                    i = i2 * 53;
                    zzc = zzads.zzc(zzagd.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 3:
                    i = i2 * 53;
                    zzc = zzads.zzc(zzagd.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 4:
                    i = i2 * 53;
                    zzc = zzagd.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 5:
                    i = i2 * 53;
                    zzc = zzads.zzc(zzagd.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 6:
                    i = i2 * 53;
                    zzc = zzagd.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 7:
                    i = i2 * 53;
                    zzc = zzads.zza(zzagd.zzw(obj, j));
                    i2 = i + zzc;
                    break;
                case 8:
                    i = i2 * 53;
                    zzc = ((String) zzagd.zzf(obj, j)).hashCode();
                    i2 = i + zzc;
                    break;
                case 9:
                    Object zzf = zzagd.zzf(obj, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzc = zzagd.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 11:
                    i = i2 * 53;
                    zzc = zzagd.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 12:
                    i = i2 * 53;
                    zzc = zzagd.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 13:
                    i = i2 * 53;
                    zzc = zzagd.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 14:
                    i = i2 * 53;
                    zzc = zzads.zzc(zzagd.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 15:
                    i = i2 * 53;
                    zzc = zzagd.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 16:
                    i = i2 * 53;
                    zzc = zzads.zzc(zzagd.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 17:
                    Object zzf2 = zzagd.zzf(obj, j);
                    if (zzf2 != null) {
                        i5 = zzf2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zzc = zzagd.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 50:
                    i = i2 * 53;
                    zzc = zzagd.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 51:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzads.zzc(Double.doubleToLongBits(zzj(obj, j)));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = Float.floatToIntBits(zzk(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzads.zzc(zzr(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzads.zzc(zzr(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzn(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzads.zzc(zzr(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzn(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzads.zza(zzE(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = ((String) zzagd.zzf(obj, j)).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzagd.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzagd.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzn(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzn(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzn(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzads.zzc(zzr(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzn(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzads.zzc(zzr(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzD(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzagd.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzl.zzc(obj).hashCode();
        if (!this.zzf) {
            return hashCode;
        }
        this.zzm.zza(obj);
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzafc
    public final void zzc(Object obj) {
        int i;
        int i2 = this.zzi;
        while (true) {
            i = this.zzj;
            if (i2 >= i) {
                break;
            }
            long zzq = zzq(this.zzh[i2]) & 1048575;
            Object zzf = zzagd.zzf(obj, zzq);
            if (zzf != null) {
                ((zzael) zzf).zzb();
                zzagd.zzs(obj, zzq, zzf);
            }
            i2++;
        }
        int length = this.zzh.length;
        while (i < length) {
            this.zzk.zza(obj, this.zzh[i]);
            i++;
        }
        this.zzl.zze(obj);
        if (this.zzf) {
            this.zzm.zzb(obj);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzafc
    public final void zzd(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzq = zzq(i);
            long j = 1048575 & zzq;
            int i2 = this.zzc[i];
            switch (zzp(zzq)) {
                case 0:
                    if (zzA(obj2, i)) {
                        zzagd.zzo(obj, j, zzagd.zza(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzA(obj2, i)) {
                        zzagd.zzp(obj, j, zzagd.zzb(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzA(obj2, i)) {
                        zzagd.zzr(obj, j, zzagd.zzd(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzA(obj2, i)) {
                        zzagd.zzr(obj, j, zzagd.zzd(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzA(obj2, i)) {
                        zzagd.zzq(obj, j, zzagd.zzc(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzA(obj2, i)) {
                        zzagd.zzr(obj, j, zzagd.zzd(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzA(obj2, i)) {
                        zzagd.zzq(obj, j, zzagd.zzc(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzA(obj2, i)) {
                        zzagd.zzm(obj, j, zzagd.zzw(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzA(obj2, i)) {
                        zzagd.zzs(obj, j, zzagd.zzf(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzv(obj, obj2, i);
                    break;
                case 10:
                    if (zzA(obj2, i)) {
                        zzagd.zzs(obj, j, zzagd.zzf(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzA(obj2, i)) {
                        zzagd.zzq(obj, j, zzagd.zzc(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzA(obj2, i)) {
                        zzagd.zzq(obj, j, zzagd.zzc(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzA(obj2, i)) {
                        zzagd.zzq(obj, j, zzagd.zzc(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzA(obj2, i)) {
                        zzagd.zzr(obj, j, zzagd.zzd(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzA(obj2, i)) {
                        zzagd.zzq(obj, j, zzagd.zzc(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzA(obj2, i)) {
                        zzagd.zzr(obj, j, zzagd.zzd(obj2, j));
                        zzx(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzv(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzk.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzafe.zzG(this.zzo, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzD(obj2, i2, i)) {
                        zzagd.zzs(obj, j, zzagd.zzf(obj2, j));
                        zzy(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzw(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzD(obj2, i2, i)) {
                        zzagd.zzs(obj, j, zzagd.zzf(obj2, j));
                        zzy(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzw(obj, obj2, i);
                    break;
            }
        }
        zzafe.zzD(this.zzl, obj, obj2);
        if (this.zzf) {
            zzafe.zzC(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzafc
    public final boolean zze(Object obj, Object obj2) {
        boolean zzF;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzq = zzq(i);
            long j = zzq & 1048575;
            switch (zzp(zzq)) {
                case 0:
                    if (zzz(obj, obj2, i) && Double.doubleToLongBits(zzagd.zza(obj, j)) == Double.doubleToLongBits(zzagd.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzz(obj, obj2, i) && Float.floatToIntBits(zzagd.zzb(obj, j)) == Float.floatToIntBits(zzagd.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzz(obj, obj2, i) && zzagd.zzd(obj, j) == zzagd.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzz(obj, obj2, i) && zzagd.zzd(obj, j) == zzagd.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzz(obj, obj2, i) && zzagd.zzc(obj, j) == zzagd.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzz(obj, obj2, i) && zzagd.zzd(obj, j) == zzagd.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzz(obj, obj2, i) && zzagd.zzc(obj, j) == zzagd.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzz(obj, obj2, i) && zzagd.zzw(obj, j) == zzagd.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzz(obj, obj2, i) && zzafe.zzF(zzagd.zzf(obj, j), zzagd.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzz(obj, obj2, i) && zzafe.zzF(zzagd.zzf(obj, j), zzagd.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzz(obj, obj2, i) && zzafe.zzF(zzagd.zzf(obj, j), zzagd.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzz(obj, obj2, i) && zzagd.zzc(obj, j) == zzagd.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzz(obj, obj2, i) && zzagd.zzc(obj, j) == zzagd.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzz(obj, obj2, i) && zzagd.zzc(obj, j) == zzagd.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzz(obj, obj2, i) && zzagd.zzd(obj, j) == zzagd.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzz(obj, obj2, i) && zzagd.zzc(obj, j) == zzagd.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzz(obj, obj2, i) && zzagd.zzd(obj, j) == zzagd.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzz(obj, obj2, i) && zzafe.zzF(zzagd.zzf(obj, j), zzagd.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzF = zzafe.zzF(zzagd.zzf(obj, j), zzagd.zzf(obj2, j));
                    break;
                case 50:
                    zzF = zzafe.zzF(zzagd.zzf(obj, j), zzagd.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzo = zzo(i) & 1048575;
                    if (zzagd.zzc(obj, zzo) == zzagd.zzc(obj2, zzo) && zzafe.zzF(zzagd.zzf(obj, j), zzagd.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!this.zzl.zzc(obj).equals(this.zzl.zzc(obj2))) {
            return false;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzm.zza(obj);
        this.zzm.zza(obj2);
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzafc
    public final boolean zzf(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzi) {
            int i6 = this.zzh[i5];
            int i7 = this.zzc[i6];
            int zzq = zzq(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzq) != 0 && !zzB(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzp = zzp(zzq);
            if (zzp != 9 && zzp != 17) {
                if (zzp != 27) {
                    if (zzp != 60 && zzp != 68) {
                        if (zzp != 49) {
                            if (zzp == 50 && !((zzael) zzagd.zzf(obj, zzq & 1048575)).isEmpty()) {
                                zzaek zzaekVar = (zzaek) zzt(i6);
                                throw null;
                            }
                        }
                    } else if (zzD(obj, i7, i6) && !zzC(obj, zzq, zzs(i6))) {
                        return false;
                    }
                }
                List list = (List) zzagd.zzf(obj, zzq & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzafc zzs = zzs(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzs.zzf(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzB(obj, i6, i, i2, i10) && !zzC(obj, zzq, zzs(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzm.zza(obj);
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzafc
    public final void zzi(Object obj, zzacy zzacyVar) throws IOException {
        if (this.zzg) {
            if (!this.zzf) {
                int length = this.zzc.length;
                for (int i = 0; i < length; i += 3) {
                    int zzq = zzq(i);
                    int i2 = this.zzc[i];
                    switch (zzp(zzq)) {
                        case 0:
                            if (zzA(obj, i)) {
                                zzacyVar.zzf(i2, zzagd.zza(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzA(obj, i)) {
                                zzacyVar.zzn(i2, zzagd.zzb(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzA(obj, i)) {
                                zzacyVar.zzs(i2, zzagd.zzd(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzA(obj, i)) {
                                zzacyVar.zzH(i2, zzagd.zzd(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzA(obj, i)) {
                                zzacyVar.zzq(i2, zzagd.zzc(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzA(obj, i)) {
                                zzacyVar.zzl(i2, zzagd.zzd(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzA(obj, i)) {
                                zzacyVar.zzj(i2, zzagd.zzc(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzA(obj, i)) {
                                zzacyVar.zzb(i2, zzagd.zzw(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzA(obj, i)) {
                                zzH(i2, zzagd.zzf(obj, zzq & 1048575), zzacyVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzA(obj, i)) {
                                zzacyVar.zzu(i2, zzagd.zzf(obj, zzq & 1048575), zzs(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzA(obj, i)) {
                                zzacyVar.zzd(i2, (zzacp) zzagd.zzf(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzA(obj, i)) {
                                zzacyVar.zzF(i2, zzagd.zzc(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzA(obj, i)) {
                                zzacyVar.zzh(i2, zzagd.zzc(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzA(obj, i)) {
                                zzacyVar.zzv(i2, zzagd.zzc(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzA(obj, i)) {
                                zzacyVar.zzx(i2, zzagd.zzd(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzA(obj, i)) {
                                zzacyVar.zzz(i2, zzagd.zzc(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzA(obj, i)) {
                                zzacyVar.zzB(i2, zzagd.zzd(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzA(obj, i)) {
                                zzacyVar.zzp(i2, zzagd.zzf(obj, zzq & 1048575), zzs(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzafe.zzJ(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                            break;
                        case 19:
                            zzafe.zzN(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                            break;
                        case 20:
                            zzafe.zzQ(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                            break;
                        case 21:
                            zzafe.zzY(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                            break;
                        case 22:
                            zzafe.zzP(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                            break;
                        case 23:
                            zzafe.zzM(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                            break;
                        case 24:
                            zzafe.zzL(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                            break;
                        case 25:
                            zzafe.zzH(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                            break;
                        case 26:
                            zzafe.zzW(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar);
                            break;
                        case 27:
                            zzafe.zzR(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, zzs(i));
                            break;
                        case 28:
                            zzafe.zzI(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar);
                            break;
                        case 29:
                            zzafe.zzX(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                            break;
                        case 30:
                            zzafe.zzK(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                            break;
                        case 31:
                            zzafe.zzS(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                            break;
                        case 32:
                            zzafe.zzT(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                            break;
                        case 33:
                            zzafe.zzU(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                            break;
                        case 34:
                            zzafe.zzV(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, false);
                            break;
                        case 35:
                            zzafe.zzJ(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                            break;
                        case 36:
                            zzafe.zzN(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                            break;
                        case 37:
                            zzafe.zzQ(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                            break;
                        case 38:
                            zzafe.zzY(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                            break;
                        case 39:
                            zzafe.zzP(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                            break;
                        case 40:
                            zzafe.zzM(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                            break;
                        case 41:
                            zzafe.zzL(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                            break;
                        case 42:
                            zzafe.zzH(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                            break;
                        case 43:
                            zzafe.zzX(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                            break;
                        case 44:
                            zzafe.zzK(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                            break;
                        case 45:
                            zzafe.zzS(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                            break;
                        case 46:
                            zzafe.zzT(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                            break;
                        case 47:
                            zzafe.zzU(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                            break;
                        case 48:
                            zzafe.zzV(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, true);
                            break;
                        case 49:
                            zzafe.zzO(i2, (List) zzagd.zzf(obj, zzq & 1048575), zzacyVar, zzs(i));
                            break;
                        case 50:
                            zzG(zzacyVar, i2, zzagd.zzf(obj, zzq & 1048575), i);
                            break;
                        case 51:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzf(i2, zzj(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzn(i2, zzk(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzs(i2, zzr(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzH(i2, zzr(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzq(i2, zzn(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzl(i2, zzr(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzj(i2, zzn(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzb(i2, zzE(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzD(obj, i2, i)) {
                                zzH(i2, zzagd.zzf(obj, zzq & 1048575), zzacyVar);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzu(i2, zzagd.zzf(obj, zzq & 1048575), zzs(i));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzd(i2, (zzacp) zzagd.zzf(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzF(i2, zzn(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzh(i2, zzn(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzv(i2, zzn(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzx(i2, zzr(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzz(i2, zzn(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzB(i2, zzr(obj, zzq & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzD(obj, i2, i)) {
                                zzacyVar.zzp(i2, zzagd.zzf(obj, zzq & 1048575), zzs(i));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                zzaft zzaftVar = this.zzl;
                zzaftVar.zzg(zzaftVar.zzc(obj), zzacyVar);
                return;
            }
            this.zzm.zza(obj);
            throw null;
        }
        zzF(obj, zzacyVar);
    }
}
