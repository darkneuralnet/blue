package p000;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.C46615p06;
/* renamed from: iH8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42629iH8 {
    @VisibleForTesting

    /* renamed from: a */
    public static final Kt9 f87073a = Kt9.m98197a("\n");

    /* renamed from: b */
    public static final Comparator f87074b = EA8.f7071b;

    /* renamed from: a */
    public static C46615p06 m34242a(zzl[] zzlVarArr, final Matrix matrix) {
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (zzl zzlVar : zzlVarArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.f70990k);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(zzlVar.f70990k, sparseArray2);
            }
            sparseArray2.append(zzlVar.f70991l, zzlVar);
        }
        DK7 dk7 = new DK7();
        int i2 = 0;
        while (i2 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i2);
            DK7 dk72 = new DK7();
            for (int i3 = i; i3 < sparseArray3.size(); i3++) {
                dk72.m110573a((zzl) sparseArray3.valueAt(i3));
            }
            AbstractC51557xL7 m110572b = dk72.m110572b();
            List m1413a = C52770zO7.m1413a(m110572b, new InterfaceC42388hs9() { // from class: I68
                @Override // p000.InterfaceC42388hs9
                public final Object zza(Object obj) {
                    String str;
                    String str2;
                    final Matrix matrix2 = matrix;
                    zzl zzlVar2 = (zzl) obj;
                    List m20680b = C46407of7.m20680b(zzlVar2.f70982c);
                    if (C52938zg7.m565b(zzlVar2.f70985f)) {
                        str = "";
                    } else {
                        str = zzlVar2.f70985f;
                    }
                    String str3 = str;
                    Rect m20681a = C46407of7.m20681a(m20680b);
                    if (C52938zg7.m565b(zzlVar2.f70987h)) {
                        str2 = RequestHeadersFactory.UNDETERMINED_LANGUAGE;
                    } else {
                        str2 = zzlVar2.f70987h;
                    }
                    return new C46615p06.C27120b(str3, m20681a, m20680b, str2, matrix2, C52770zO7.m1413a(Arrays.asList(zzlVar2.f70981b), new InterfaceC42388hs9() { // from class: Ct8
                        @Override // p000.InterfaceC42388hs9
                        public final Object zza(Object obj2) {
                            String str4;
                            String str5;
                            Matrix matrix3 = matrix2;
                            zzr zzrVar = (zzr) obj2;
                            List m20680b2 = C46407of7.m20680b(zzrVar.f70994c);
                            if (C52938zg7.m565b(zzrVar.f70996e)) {
                                str4 = "";
                            } else {
                                str4 = zzrVar.f70996e;
                            }
                            String str6 = str4;
                            Rect m20681a2 = C46407of7.m20681a(m20680b2);
                            if (C52938zg7.m565b(zzrVar.f70998g)) {
                                str5 = RequestHeadersFactory.UNDETERMINED_LANGUAGE;
                            } else {
                                str5 = zzrVar.f70998g;
                            }
                            return new C46615p06.C27119a(str6, m20681a2, m20680b2, str5, matrix3, zzrVar.f70997f, zzrVar.f70994c.f70980f, AbstractC51557xL7.m5425o());
                        }
                    }), zzlVar2.f70986g, zzlVar2.f70982c.f70980f);
                }
            });
            zzf zzfVar = ((zzl) m110572b.get(i)).f70982c;
            OV7 listIterator = m110572b.listIterator(i);
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            while (listIterator.hasNext()) {
                zzf zzfVar2 = ((zzl) listIterator.next()).f70982c;
                OV7 ov7 = listIterator;
                double sin = Math.sin(Math.toRadians(zzfVar.f70980f));
                SparseArray sparseArray4 = sparseArray;
                int i8 = i2;
                double cos = Math.cos(Math.toRadians(zzfVar.f70980f));
                DK7 dk73 = dk7;
                List list = m1413a;
                Point point = new Point(zzfVar2.f70976b, zzfVar2.f70977c);
                point.offset(-zzfVar.f70976b, -zzfVar.f70977c);
                Point point2 = r13[0];
                int i9 = point2.x;
                int i10 = point2.y;
                int i11 = (int) ((i9 * cos) + (i10 * sin));
                point2.x = i11;
                int i12 = (int) (((-i9) * sin) + (i10 * cos));
                point2.y = i12;
                Point[] pointArr = {point, new Point(zzfVar2.f70978d + i11, i12), new Point(zzfVar2.f70978d + i11, zzfVar2.f70979e + i12), new Point(i11, i12 + zzfVar2.f70979e)};
                i4 = i4;
                i7 = i7;
                i5 = i5;
                i6 = i6;
                for (int i13 = 0; i13 < 4; i13++) {
                    Point point3 = pointArr[i13];
                    i5 = Math.min(i5, point3.x);
                    i4 = Math.max(i4, point3.x);
                    i6 = Math.min(i6, point3.y);
                    i7 = Math.max(i7, point3.y);
                }
                listIterator = ov7;
                sparseArray = sparseArray4;
                i2 = i8;
                dk7 = dk73;
                m1413a = list;
            }
            DK7 dk74 = dk7;
            SparseArray sparseArray5 = sparseArray;
            int i14 = i2;
            int i15 = i4;
            int i16 = i7;
            List list2 = m1413a;
            int i17 = zzfVar.f70976b;
            int i18 = zzfVar.f70977c;
            double sin2 = Math.sin(Math.toRadians(zzfVar.f70980f));
            double cos2 = Math.cos(Math.toRadians(zzfVar.f70980f));
            Point[] pointArr2 = {new Point(i5, i6), new Point(i15, i6), new Point(i15, i16), new Point(i5, i16)};
            int i19 = 0;
            for (int i20 = 4; i19 < i20; i20 = 4) {
                Point point4 = pointArr2[i19];
                int i21 = point4.x;
                int i22 = point4.y;
                point4.x = (int) ((i21 * cos2) - (i22 * sin2));
                point4.y = (int) ((i21 * sin2) + (i22 * cos2));
                point4.offset(i17, i18);
                i19++;
                pointArr2 = pointArr2;
            }
            List asList = Arrays.asList(pointArr2);
            dk74.m110573a(new C46615p06.C27123e(f87073a.m98196b(C52770zO7.m1413a(list2, C35401Qe8.f30695a)), C46407of7.m20681a(asList), asList, m34241b(list2), matrix, list2));
            i2 = i14 + 1;
            dk7 = dk74;
            sparseArray = sparseArray5;
            i = 0;
        }
        AbstractC51557xL7 m110572b2 = dk7.m110572b();
        return new C46615p06(f87073a.m98196b(C52770zO7.m1413a(m110572b2, C32431Dm8.f6315a)), m110572b2);
    }

    /* renamed from: b */
    public static String m34241b(List list) {
        int i;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String m20163b = ((C46615p06.C27120b) it.next()).m20163b();
            if (hashMap.containsKey(m20163b)) {
                i = ((Integer) hashMap.get(m20163b)).intValue();
            } else {
                i = 0;
            }
            hashMap.put(m20163b, Integer.valueOf(i + 1));
        }
        Set entrySet = hashMap.entrySet();
        if (entrySet.isEmpty()) {
            return RequestHeadersFactory.UNDETERMINED_LANGUAGE;
        }
        String str = (String) ((Map.Entry) Collections.max(entrySet, f87074b)).getKey();
        if (C52938zg7.m565b(str)) {
            return RequestHeadersFactory.UNDETERMINED_LANGUAGE;
        }
        return str;
    }
}
