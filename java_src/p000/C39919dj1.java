package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zznp;
import com.google.android.gms.internal.mlkit_vision_face.zznt;
import com.google.android.gms.internal.mlkit_vision_face.zznz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: dj1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C39919dj1 {

    /* renamed from: a */
    public final Rect f77103a;

    /* renamed from: b */
    public int f77104b;

    /* renamed from: c */
    public final float f77105c;

    /* renamed from: d */
    public final float f77106d;

    /* renamed from: e */
    public final float f77107e;

    /* renamed from: f */
    public final float f77108f;

    /* renamed from: g */
    public final float f77109g;

    /* renamed from: h */
    public final float f77110h;

    /* renamed from: i */
    public final SparseArray f77111i = new SparseArray();

    /* renamed from: j */
    public final SparseArray f77112j = new SparseArray();

    public C39919dj1(zzf zzfVar, Matrix matrix) {
        zzn[] zznVarArr;
        zzd[] zzdVarArr;
        int length;
        float f = zzfVar.f70827d;
        float f2 = zzfVar.f70829f / 2.0f;
        float f3 = zzfVar.f70828e;
        float f4 = zzfVar.f70830g / 2.0f;
        Rect rect = new Rect((int) (f - f2), (int) (f3 - f4), (int) (f + f2), (int) (f3 + f4));
        this.f77103a = rect;
        if (matrix != null) {
            C48871sp0.m13602e(rect, matrix);
        }
        this.f77104b = zzfVar.f70826c;
        for (zzn zznVar : zzfVar.f70834k) {
            if (m43845h(zznVar.f70849e)) {
                PointF pointF = new PointF(zznVar.f70847c, zznVar.f70848d);
                if (matrix != null) {
                    C48871sp0.m13604c(pointF, matrix);
                }
                SparseArray sparseArray = this.f77111i;
                int i = zznVar.f70849e;
                sparseArray.put(i, new C42883ij1(i, pointF));
            }
        }
        for (zzd zzdVar : zzfVar.f70838o) {
            int i2 = zzdVar.f70824c;
            if (m43846g(i2)) {
                PointF[] pointFArr = zzdVar.f70823b;
                pointFArr.getClass();
                long length2 = pointFArr.length + 5 + (length / 10);
                ArrayList arrayList = new ArrayList(length2 > 2147483647L ? Integer.MAX_VALUE : (int) length2);
                Collections.addAll(arrayList, pointFArr);
                if (matrix != null) {
                    C48871sp0.m13603d(arrayList, matrix);
                }
                this.f77112j.put(i2, new C40511ej1(i2, arrayList));
            }
        }
        this.f77108f = zzfVar.f70833j;
        this.f77109g = zzfVar.f70831h;
        this.f77110h = zzfVar.f70832i;
        this.f77107e = zzfVar.f70837n;
        this.f77106d = zzfVar.f70835l;
        this.f77105c = zzfVar.f70836m;
    }

    /* renamed from: g */
    public static boolean m43846g(int i) {
        return i <= 15 && i > 0;
    }

    /* renamed from: h */
    public static boolean m43845h(int i) {
        return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
    }

    /* renamed from: a */
    public Rect m43852a() {
        return this.f77103a;
    }

    /* renamed from: b */
    public C40511ej1 m43851b(int i) {
        return (C40511ej1) this.f77112j.get(i);
    }

    /* renamed from: c */
    public C42883ij1 m43850c(int i) {
        return (C42883ij1) this.f77111i.get(i);
    }

    /* renamed from: d */
    public final SparseArray m43849d() {
        return this.f77112j;
    }

    /* renamed from: e */
    public final void m43848e(SparseArray sparseArray) {
        this.f77112j.clear();
        for (int i = 0; i < sparseArray.size(); i++) {
            this.f77112j.put(sparseArray.keyAt(i), (C40511ej1) sparseArray.valueAt(i));
        }
    }

    /* renamed from: f */
    public final void m43847f(int i) {
        this.f77104b = -1;
    }

    public String toString() {
        Ht9 m43498a = C40046dv9.m43498a("Face");
        m43498a.m103237c("boundingBox", this.f77103a);
        m43498a.m103238b("trackingId", this.f77104b);
        m43498a.m103239a("rightEyeOpenProbability", this.f77105c);
        m43498a.m103239a("leftEyeOpenProbability", this.f77106d);
        m43498a.m103239a("smileProbability", this.f77107e);
        m43498a.m103239a("eulerX", this.f77108f);
        m43498a.m103239a("eulerY", this.f77109g);
        m43498a.m103239a("eulerZ", this.f77110h);
        Ht9 m43498a2 = C40046dv9.m43498a("Landmarks");
        for (int i = 0; i <= 11; i++) {
            if (m43845h(i)) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("landmark_");
                sb.append(i);
                m43498a2.m103237c(sb.toString(), m43850c(i));
            }
        }
        m43498a.m103237c("landmarks", m43498a2.toString());
        Ht9 m43498a3 = C40046dv9.m43498a("Contours");
        for (int i2 = 1; i2 <= 15; i2++) {
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("Contour_");
            sb2.append(i2);
            m43498a3.m103237c(sb2.toString(), m43851b(i2));
        }
        m43498a.m103237c("contours", m43498a3.toString());
        return m43498a.toString();
    }

    public C39919dj1(zznt zzntVar, Matrix matrix) {
        Rect m51308R = zzntVar.m51308R();
        this.f77103a = m51308R;
        if (matrix != null) {
            C48871sp0.m13602e(m51308R, matrix);
        }
        this.f77104b = zzntVar.m51309L();
        for (zznz zznzVar : zzntVar.m51306j0()) {
            if (m43845h(zznzVar.zza())) {
                PointF m51302s = zznzVar.m51302s();
                if (matrix != null) {
                    C48871sp0.m13604c(m51302s, matrix);
                }
                this.f77111i.put(zznzVar.zza(), new C42883ij1(zznzVar.zza(), m51302s));
            }
        }
        for (zznp zznpVar : zzntVar.m51307T()) {
            int zza = zznpVar.zza();
            if (m43846g(zza)) {
                List m51313s = zznpVar.m51313s();
                m51313s.getClass();
                ArrayList arrayList = new ArrayList(m51313s);
                if (matrix != null) {
                    C48871sp0.m13603d(arrayList, matrix);
                }
                this.f77112j.put(zza, new C40511ej1(zza, arrayList));
            }
        }
        this.f77108f = zzntVar.m51310K();
        this.f77109g = zzntVar.m51304u();
        this.f77110h = -zzntVar.m51312E();
        this.f77107e = zzntVar.m51311F();
        this.f77106d = zzntVar.m51305s();
        this.f77105c = zzntVar.m51303v();
    }
}
