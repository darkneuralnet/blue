package com.google.android.libraries.places.internal;

import java.util.Arrays;
import kotlin.UByte;
/* loaded from: classes6.dex */
final class zzil extends zzhv {
    static final zzhv zza = new zzil(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzil(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static zzil zzf(int i, Object[] objArr, zzhu zzhuVar) {
        int i2;
        boolean z;
        short[] sArr;
        byte[] bArr;
        Object[] objArr2;
        int i3 = i;
        Object[] objArr3 = objArr;
        if (i3 == 0) {
            return (zzil) zza;
        }
        Object obj = null;
        if (i3 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            zzhh.zza(obj2, obj3);
            return new zzil(null, objArr3, 1);
        }
        zzha.zzb(i3, objArr3.length >> 1, "index");
        char c = 2;
        int max = Math.max(i3, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (i2 * 0.7d < max);
        } else {
            i2 = 1073741824;
            if (max < 1073741824) {
                z = true;
            } else {
                z = false;
            }
            zzha.zze(z, "collection too large");
        }
        if (i3 == 1) {
            Object obj4 = objArr3[0];
            obj4.getClass();
            Object obj5 = objArr3[1];
            obj5.getClass();
            zzhh.zza(obj4, obj5);
        } else {
            int i4 = i2 - 1;
            char c2 = 65535;
            if (i2 <= 128) {
                byte[] bArr2 = new byte[i2];
                Arrays.fill(bArr2, (byte) -1);
                int i5 = 0;
                for (int i6 = 0; i6 < i3; i6++) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    Object obj6 = objArr3[i7];
                    obj6.getClass();
                    Object obj7 = objArr3[i7 ^ 1];
                    obj7.getClass();
                    zzhh.zza(obj6, obj7);
                    int zza2 = zzho.zza(obj6.hashCode());
                    while (true) {
                        int i9 = zza2 & i4;
                        int i10 = bArr2[i9] & UByte.MAX_VALUE;
                        if (i10 == 255) {
                            bArr2[i9] = (byte) i8;
                            if (i5 < i6) {
                                objArr3[i8] = obj6;
                                objArr3[i8 ^ 1] = obj7;
                            }
                            i5++;
                        } else if (obj6.equals(objArr3[i10])) {
                            int i11 = i10 ^ 1;
                            Object obj8 = objArr3[i11];
                            obj8.getClass();
                            zzht zzhtVar = new zzht(obj6, obj7, obj8);
                            objArr3[i11] = obj7;
                            obj = zzhtVar;
                            break;
                        } else {
                            zza2 = i9 + 1;
                        }
                    }
                }
                if (i5 == i3) {
                    bArr = bArr2;
                    c = 2;
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr2, Integer.valueOf(i5), obj};
                    c = 2;
                }
            } else if (i2 <= 32768) {
                sArr = new short[i2];
                Arrays.fill(sArr, (short) -1);
                int i12 = 0;
                for (int i13 = 0; i13 < i3; i13++) {
                    int i14 = i13 + i13;
                    int i15 = i12 + i12;
                    Object obj9 = objArr3[i14];
                    obj9.getClass();
                    Object obj10 = objArr3[i14 ^ 1];
                    obj10.getClass();
                    zzhh.zza(obj9, obj10);
                    int zza3 = zzho.zza(obj9.hashCode());
                    while (true) {
                        int i16 = zza3 & i4;
                        char c3 = (char) sArr[i16];
                        if (c3 == 65535) {
                            sArr[i16] = (short) i15;
                            if (i12 < i13) {
                                objArr3[i15] = obj9;
                                objArr3[i15 ^ 1] = obj10;
                            }
                            i12++;
                        } else if (obj9.equals(objArr3[c3])) {
                            int i17 = c3 ^ 1;
                            Object obj11 = objArr3[i17];
                            obj11.getClass();
                            zzht zzhtVar2 = new zzht(obj9, obj10, obj11);
                            objArr3[i17] = obj10;
                            obj = zzhtVar2;
                            break;
                        } else {
                            zza3 = i16 + 1;
                        }
                    }
                }
                if (i12 != i3) {
                    c = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i12), obj};
                    obj = objArr2;
                }
                bArr = sArr;
                c = 2;
                obj = bArr;
            } else {
                sArr = new int[i2];
                Arrays.fill((int[]) sArr, -1);
                int i18 = 0;
                int i19 = 0;
                while (i18 < i3) {
                    int i20 = i18 + i18;
                    int i21 = i19 + i19;
                    Object obj12 = objArr3[i20];
                    obj12.getClass();
                    Object obj13 = objArr3[i20 ^ 1];
                    obj13.getClass();
                    zzhh.zza(obj12, obj13);
                    int zza4 = zzho.zza(obj12.hashCode());
                    while (true) {
                        int i22 = zza4 & i4;
                        ?? r15 = sArr[i22];
                        if (r15 == c2) {
                            sArr[i22] = i21;
                            if (i19 < i18) {
                                objArr3[i21] = obj12;
                                objArr3[i21 ^ 1] = obj13;
                            }
                            i19++;
                        } else if (obj12.equals(objArr3[r15])) {
                            int i23 = r15 ^ 1;
                            Object obj14 = objArr3[i23];
                            obj14.getClass();
                            zzht zzhtVar3 = new zzht(obj12, obj13, obj14);
                            objArr3[i23] = obj13;
                            obj = zzhtVar3;
                            break;
                        } else {
                            zza4 = i22 + 1;
                            c2 = 65535;
                        }
                    }
                    i18++;
                    c2 = 65535;
                }
                if (i19 != i3) {
                    c = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i19), obj};
                    obj = objArr2;
                }
                bArr = sArr;
                c = 2;
                obj = bArr;
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr4 = (Object[]) obj;
            zzhuVar.zzc = (zzht) objArr4[c];
            Object obj15 = objArr4[0];
            int intValue = ((Integer) objArr4[1]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj = obj15;
            i3 = intValue;
        }
        return new zzil(obj, objArr3, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    @Override // com.google.android.libraries.places.internal.zzhv, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object obj3 = this.zzc;
        Object[] objArr = this.zzb;
        int i = this.zzd;
        if (obj != null) {
            if (i == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                if (obj4.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else if (obj3 != null) {
                if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    int length = bArr.length - 1;
                    int zza2 = zzho.zza(obj.hashCode());
                    while (true) {
                        int i2 = zza2 & length;
                        int i3 = bArr[i2] & UByte.MAX_VALUE;
                        if (i3 == 255) {
                            break;
                        } else if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                            break;
                        } else {
                            zza2 = i2 + 1;
                        }
                    }
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int zza3 = zzho.zza(obj.hashCode());
                    while (true) {
                        int i4 = zza3 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        } else if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                            break;
                        } else {
                            zza3 = i4 + 1;
                        }
                    }
                } else {
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int zza4 = zzho.zza(obj.hashCode());
                    while (true) {
                        int i5 = zza4 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        } else if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                            break;
                        } else {
                            zza4 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzhv
    public final zzhp zza() {
        return new zzik(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzhv
    public final zzhw zzc() {
        return new zzii(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzhv
    public final zzhw zzd() {
        return new zzij(this, new zzik(this.zzb, 0, this.zzd));
    }
}
