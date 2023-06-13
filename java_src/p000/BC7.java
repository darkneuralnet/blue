package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzav;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaz;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbu;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: BC7 */
/* loaded from: classes6.dex */
public final class BC7 extends LK7 {

    /* renamed from: d */
    public static final int[] f2030d = {5, 7, 7, 7, 5, 5};

    /* renamed from: e */
    public static final double[][] f2031e = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* renamed from: a */
    public final Context f2032a;

    /* renamed from: b */
    public final RecognitionOptions f2033b;

    /* renamed from: c */
    public BarhopperV3 f2034c;

    public BC7(Context context, zzbc zzbcVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        this.f2033b = recognitionOptions;
        this.f2032a = context;
        recognitionOptions.m50508a(zzbcVar.zza());
        recognitionOptions.m50507b(zzbcVar.zzb());
    }

    /* renamed from: d5 */
    public static zzap m114214d5(Y49 y49, String str, String str2) {
        String str3 = null;
        if (y49 == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int m75771M = y49.m75771M();
        int m75773K = y49.m75773K();
        int m75776H = y49.m75776H();
        int m75775I = y49.m75775I();
        int m75774J = y49.m75774J();
        int m75772L = y49.m75772L();
        boolean m75768P = y49.m75768P();
        if (matcher.find()) {
            str3 = matcher.group(1);
        }
        return new zzap(m75771M, m75773K, m75776H, m75775I, m75774J, m75772L, m75768P, str3);
    }

    @Override // p000.InterfaceC38496bL7
    /* renamed from: E4 */
    public final List mo64637E4(WO1 wo1, zzbu zzbuVar) {
        C0363Ay m50510d;
        zzat zzatVar;
        zzaw zzawVar;
        zzax zzaxVar;
        zzaz zzazVar;
        zzay zzayVar;
        zzau zzauVar;
        zzaq zzaqVar;
        int i;
        zzar zzarVar;
        zzas zzasVar;
        int i2;
        String str;
        Point[] pointArr;
        int i3;
        int i4;
        zzav zzavVar;
        zzaw[] zzawVarArr;
        zzat[] zzatVarArr;
        zzao[] zzaoVarArr;
        String str2;
        String str3;
        int m51322s = zzbuVar.m51322s();
        int i5 = -1;
        int i6 = 0;
        if (m51322s != -1) {
            if (m51322s != 17) {
                if (m51322s != 35) {
                    if (m51322s != 842094169) {
                        throw new IllegalArgumentException("Unsupported image format: " + zzbuVar.m51322s());
                    }
                } else {
                    m50510d = m114213e5(((Image) Preconditions.checkNotNull((Image) BinderC36557Vd3.m79637d5(wo1))).getPlanes()[0].getBuffer(), zzbuVar);
                }
            }
            m50510d = m114213e5((ByteBuffer) BinderC36557Vd3.m79637d5(wo1), zzbuVar);
        } else {
            m50510d = ((BarhopperV3) Preconditions.checkNotNull(this.f2034c)).m50510d((Bitmap) BinderC36557Vd3.m79637d5(wo1), this.f2033b);
        }
        ArrayList arrayList = new ArrayList();
        Matrix m14053e = C48704sY1.m14056b().m14053e(zzbuVar.zzd(), zzbuVar.zza(), zzbuVar.zzc());
        for (C49824uQ7 c49824uQ7 : m50510d.m114822J()) {
            if (c49824uQ7.m10327I() > 0 && m14053e != null) {
                float[] fArr = new float[8];
                List m10314V = c49824uQ7.m10314V();
                int m10327I = c49824uQ7.m10327I();
                for (int i7 = i6; i7 < m10327I; i7++) {
                    int i8 = i7 + i7;
                    fArr[i8] = ((C48226rj7) m10314V.get(i7)).m15540H();
                    fArr[i8 + 1] = ((C48226rj7) m10314V.get(i7)).m15539I();
                }
                m14053e.mapPoints(fArr);
                int zzc = zzbuVar.zzc();
                for (int i9 = i6; i9 < m10327I; i9++) {
                    LC7 lc7 = (LC7) c49824uQ7.m80350g();
                    int i10 = i9 + i9;
                    C52958zi7 m15538J = C48226rj7.m15538J();
                    m15538J.m488o((int) fArr[i10]);
                    m15538J.m487p((int) fArr[i10 + 1]);
                    lc7.m97591o((i9 + zzc) % m10327I, (C48226rj7) m15538J.mo29321c());
                    c49824uQ7 = (C49824uQ7) lc7.mo29321c();
                }
            }
            if (c49824uQ7.m10309a0()) {
                Dx9 m10321O = c49824uQ7.m10321O();
                zzatVar = new zzat(m10321O.m109578M() + i5, m10321O.m109581J(), m10321O.m109579L(), m10321O.m109580K());
            } else {
                zzatVar = null;
            }
            if (c49824uQ7.m10307c0()) {
                C39772dT7 m10326J = c49824uQ7.m10326J();
                zzawVar = new zzaw(m10326J.m44224K() + i5, m10326J.m44225J());
            } else {
                zzawVar = null;
            }
            if (c49824uQ7.m10306d0()) {
                C44095kl7 m10319Q = c49824uQ7.m10319Q();
                zzaxVar = new zzax(m10319Q.m28485J(), m10319Q.m28484K());
            } else {
                zzaxVar = null;
            }
            if (c49824uQ7.m10304f0()) {
                C40607es7 m10317S = c49824uQ7.m10317S();
                zzazVar = new zzaz(m10317S.m42466K(), m10317S.m42467J(), m10317S.m42465L() + i5);
            } else {
                zzazVar = null;
            }
            if (c49824uQ7.m10305e0()) {
                C35715Rn7 m10318R = c49824uQ7.m10318R();
                zzayVar = new zzay(m10318R.m86291J(), m10318R.m86290K());
            } else {
                zzayVar = null;
            }
            if (c49824uQ7.m10308b0()) {
                C32619Eh7 m10320P = c49824uQ7.m10320P();
                zzauVar = new zzau(m10320P.m108574H(), m10320P.m108573I());
            } else {
                zzauVar = null;
            }
            if (c49824uQ7.m10312X()) {
                C51131wd9 m10324L = c49824uQ7.m10324L();
                String m6567P = m10324L.m6567P();
                String m6571L = m10324L.m6571L();
                String m6570M = m10324L.m6570M();
                String m6569N = m10324L.m6569N();
                String m6568O = m10324L.m6568O();
                Y49 m6574I = m10324L.m6574I();
                if (c49824uQ7.m10316T().mo15335x()) {
                    str2 = c49824uQ7.m10316T().m39163F();
                } else {
                    str2 = null;
                }
                zzap m114214d5 = m114214d5(m6574I, str2, "DTSTART:([0-9TZ]*)");
                Y49 m6575H = m10324L.m6575H();
                if (c49824uQ7.m10316T().mo15335x()) {
                    str3 = c49824uQ7.m10316T().m39163F();
                } else {
                    str3 = null;
                }
                zzaqVar = new zzaq(m6567P, m6571L, m6570M, m6569N, m6568O, m114214d5, m114214d5(m6575H, str3, "DTEND:([0-9TZ]*)"));
            } else {
                zzaqVar = null;
            }
            if (c49824uQ7.m10311Y()) {
                Hl9 m10323M = c49824uQ7.m10323M();
                ER7 m103451H = m10323M.m103451H();
                if (m103451H != null) {
                    zzavVar = new zzav(m103451H.m109010K(), m103451H.m109006O(), m103451H.m109007N(), m103451H.m109011J(), m103451H.m109008M(), m103451H.m109009L(), m103451H.m109005P());
                } else {
                    zzavVar = null;
                }
                String m103448K = m10323M.m103448K();
                String m103447L = m10323M.m103447L();
                List m103444O = m10323M.m103444O();
                if (m103444O.isEmpty()) {
                    zzawVarArr = null;
                } else {
                    zzaw[] zzawVarArr2 = new zzaw[m103444O.size()];
                    for (int i11 = 0; i11 < m103444O.size(); i11++) {
                        zzawVarArr2[i11] = new zzaw(((C39772dT7) m103444O.get(i11)).m44224K() + i5, ((C39772dT7) m103444O.get(i11)).m44225J());
                    }
                    zzawVarArr = zzawVarArr2;
                }
                List m103445N = m10323M.m103445N();
                if (m103445N.isEmpty()) {
                    zzatVarArr = null;
                } else {
                    zzat[] zzatVarArr2 = new zzat[m103445N.size()];
                    int i12 = 0;
                    while (i12 < m103445N.size()) {
                        zzatVarArr2[i12] = new zzat(((Dx9) m103445N.get(i12)).m109578M() + i5, ((Dx9) m103445N.get(i12)).m109581J(), ((Dx9) m103445N.get(i12)).m109579L(), ((Dx9) m103445N.get(i12)).m109580K());
                        i12++;
                        i5 = -1;
                    }
                    zzatVarArr = zzatVarArr2;
                }
                String[] strArr = (String[]) m10323M.m103443P().toArray(new String[0]);
                List m103446M = m10323M.m103446M();
                if (m103446M.isEmpty()) {
                    i = 0;
                    zzaoVarArr = null;
                } else {
                    zzao[] zzaoVarArr2 = new zzao[m103446M.size()];
                    for (int i13 = 0; i13 < m103446M.size(); i13++) {
                        zzaoVarArr2[i13] = new zzao(((C37957aR7) m103446M.get(i13)).m71358J() - 1, (String[]) ((C37957aR7) m103446M.get(i13)).m71359I().toArray(new String[0]));
                    }
                    i = 0;
                    zzaoVarArr = zzaoVarArr2;
                }
                zzarVar = new zzar(zzavVar, m103448K, m103447L, zzawVarArr, zzatVarArr, strArr, zzaoVarArr);
            } else {
                i = 0;
                zzarVar = null;
            }
            if (c49824uQ7.m10310Z()) {
                Qq9 m10322N = c49824uQ7.m10322N();
                zzasVar = new zzas(m10322N.m87879O(), m10322N.m87877Q(), m10322N.m87871W(), m10322N.m87873U(), m10322N.m87876R(), m10322N.m87882L(), m10322N.m87884J(), m10322N.m87883K(), m10322N.m87881M(), m10322N.m87872V(), m10322N.m87875S(), m10322N.m87878P(), m10322N.m87880N(), m10322N.m87874T());
            } else {
                zzasVar = null;
            }
            switch (c49824uQ7.m10303g0() - 1) {
                case 0:
                    i2 = i;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 8;
                    break;
                case 5:
                    i2 = 16;
                    break;
                case 6:
                    i2 = 32;
                    break;
                case 7:
                    i2 = 64;
                    break;
                case 8:
                    i2 = 128;
                    break;
                case 9:
                    i2 = 256;
                    break;
                case 10:
                    i2 = 512;
                    break;
                case 11:
                    i2 = 1024;
                    break;
                case 12:
                    i2 = 2048;
                    break;
                case 13:
                    i2 = 4096;
                    break;
                default:
                    i2 = -1;
                    break;
            }
            String m10315U = c49824uQ7.m10315U();
            if (c49824uQ7.m10316T().mo15335x()) {
                str = c49824uQ7.m10316T().m39163F();
            } else {
                str = null;
            }
            byte[] m39160J = c49824uQ7.m10316T().m39160J();
            List m10314V2 = c49824uQ7.m10314V();
            if (m10314V2.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[m10314V2.size()];
                for (int i14 = i; i14 < m10314V2.size(); i14++) {
                    pointArr2[i14] = new Point(((C48226rj7) m10314V2.get(i14)).m15540H(), ((C48226rj7) m10314V2.get(i14)).m15539I());
                }
                pointArr = pointArr2;
            }
            switch (c49824uQ7.m10328H() - 1) {
                case 1:
                    i3 = 1;
                    continue;
                    arrayList.add(new zzba(i2, m10315U, str, m39160J, pointArr, i3, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i5 = -1;
                    i6 = i;
                case 2:
                    i3 = 2;
                    continue;
                    arrayList.add(new zzba(i2, m10315U, str, m39160J, pointArr, i3, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i5 = -1;
                    i6 = i;
                case 3:
                    i4 = 3;
                    break;
                case 4:
                    i3 = 4;
                    continue;
                    arrayList.add(new zzba(i2, m10315U, str, m39160J, pointArr, i3, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i5 = -1;
                    i6 = i;
                case 5:
                    i4 = 5;
                    break;
                case 6:
                    i4 = 6;
                    break;
                case 7:
                    i4 = 7;
                    break;
                case 8:
                    i3 = 8;
                    continue;
                    arrayList.add(new zzba(i2, m10315U, str, m39160J, pointArr, i3, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i5 = -1;
                    i6 = i;
                case 9:
                    i4 = 9;
                    break;
                case 10:
                    i4 = 10;
                    break;
                case 11:
                    i4 = 11;
                    break;
                case 12:
                    i4 = 12;
                    break;
                default:
                    i3 = i;
                    continue;
                    arrayList.add(new zzba(i2, m10315U, str, m39160J, pointArr, i3, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
                    i5 = -1;
                    i6 = i;
            }
            i3 = i4;
            arrayList.add(new zzba(i2, m10315U, str, m39160J, pointArr, i3, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
            i5 = -1;
            i6 = i;
        }
        return arrayList;
    }

    /* renamed from: e5 */
    public final C0363Ay m114213e5(ByteBuffer byteBuffer, zzbu zzbuVar) {
        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.f2034c);
        if (((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).isDirect()) {
            return barhopperV3.m50512b(zzbuVar.zzd(), zzbuVar.zza(), byteBuffer, this.f2033b);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.m50511c(zzbuVar.zzd(), zzbuVar.zza(), byteBuffer.array(), this.f2033b);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.m50511c(zzbuVar.zzd(), zzbuVar.zza(), bArr, this.f2033b);
    }

    @Override // p000.InterfaceC38496bL7
    public final void zzc() {
        if (this.f2034c != null) {
            return;
        }
        this.f2034c = new BarhopperV3();
        C50697vt8 m3893H = C52052yA8.m3893H();
        B68 m103577H = C33295He8.m103577H();
        int i = 16;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            C50883wC7 m33939H = C42709iQ7.m33939H();
            m33939H.m7257r(i);
            m33939H.m7256t(i);
            for (int i4 = 0; i4 < f2030d[i3]; i4++) {
                double[] dArr = f2031e[i2];
                float sqrt = (float) Math.sqrt(dArr[1]);
                float f = (float) (dArr[0] * 320.0d);
                m33939H.m7259o(f / sqrt);
                m33939H.m7258p(f * sqrt);
                i2++;
            }
            i += i;
            m103577H.m114355o(m33939H);
        }
        m3893H.m7809o(m103577H);
        try {
            InputStream open = this.f2032a.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            InputStream open2 = this.f2032a.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
            try {
                InputStream open3 = this.f2032a.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                FN8 m113255H = C0777By.m113255H();
                m3893H.m7808p(AbstractC41604gZ7.m39165D(open));
                m113255H.m107262o(m3893H);
                C50498vZ8 m82005H = U49.m82005H();
                m82005H.m8442o(AbstractC41604gZ7.m39165D(open2));
                m82005H.m8441p(AbstractC41604gZ7.m39165D(open3));
                m113255H.m107261p(m82005H);
                ((BarhopperV3) Preconditions.checkNotNull(this.f2034c)).m50513a(m113255H.mo29321c());
                if (open3 != null) {
                    open3.close();
                }
                if (open2 != null) {
                    open2.close();
                }
                if (open != null) {
                    open.close();
                }
            } catch (Throwable th) {
                if (open2 != null) {
                    try {
                        open2.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed to open Barcode models", e);
        }
    }

    @Override // p000.InterfaceC38496bL7
    public final void zzd() {
        BarhopperV3 barhopperV3 = this.f2034c;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f2034c = null;
        }
    }
}
