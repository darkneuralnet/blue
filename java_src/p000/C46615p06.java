package p000;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzse;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsg;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.C46615p06;
/* renamed from: p06  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C46615p06 {

    /* renamed from: a */
    public final List f102931a;

    /* renamed from: b */
    public final String f102932b;

    /* renamed from: p06$c */
    /* loaded from: classes6.dex */
    public static class C27121c extends C27122d {

        /* renamed from: e */
        public final float f102939e;

        /* renamed from: f */
        public final float f102940f;

        public C27121c(zzsk zzskVar, Matrix matrix) {
            super(zzskVar.zzd(), zzskVar.m51237v(), zzskVar.m51240E(), "", matrix);
            this.f102939e = zzskVar.m51238u();
            this.f102940f = zzskVar.m51239s();
        }
    }

    /* renamed from: p06$d */
    /* loaded from: classes6.dex */
    public static class C27122d {

        /* renamed from: a */
        public final String f102941a;

        /* renamed from: b */
        public final Rect f102942b;

        /* renamed from: c */
        public final Point[] f102943c;

        /* renamed from: d */
        public final String f102944d;

        public C27122d(String str, Rect rect, List list, String str2, Matrix matrix) {
            this.f102941a = str;
            Rect rect2 = new Rect(rect);
            if (matrix != null) {
                C48871sp0.m13602e(rect2, matrix);
            }
            this.f102942b = rect2;
            Point[] pointArr = new Point[list.size()];
            for (int i = 0; i < list.size(); i++) {
                pointArr[i] = new Point((Point) list.get(i));
            }
            if (matrix != null) {
                C48871sp0.m13605b(pointArr, matrix);
            }
            this.f102943c = pointArr;
            this.f102944d = str2;
        }

        /* renamed from: a */
        public Rect m20164a() {
            return this.f102942b;
        }

        /* renamed from: b */
        public String m20163b() {
            return this.f102944d;
        }

        /* renamed from: c */
        public final String m20162c() {
            String str = this.f102941a;
            return str == null ? "" : str;
        }
    }

    public C46615p06(zzsg zzsgVar, final Matrix matrix) {
        ArrayList arrayList = new ArrayList();
        this.f102931a = arrayList;
        this.f102932b = zzsgVar.zza();
        arrayList.addAll(C52770zO7.m1413a(zzsgVar.m51241s(), new InterfaceC42388hs9() { // from class: nf7
            @Override // p000.InterfaceC42388hs9
            public final Object zza(Object obj) {
                return new C46615p06.C27123e((zzsa) obj, matrix);
            }
        }));
    }

    /* renamed from: a */
    public String m20167a() {
        return this.f102932b;
    }

    /* renamed from: b */
    public List<C27123e> m20166b() {
        return Collections.unmodifiableList(this.f102931a);
    }

    public C46615p06(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.f102931a = arrayList;
        arrayList.addAll(list);
        this.f102932b = str;
    }

    /* renamed from: p06$b */
    /* loaded from: classes6.dex */
    public static class C27120b extends C27122d {

        /* renamed from: e */
        public final List f102936e;

        /* renamed from: f */
        public final float f102937f;

        /* renamed from: g */
        public final float f102938g;

        public C27120b(zzse zzseVar, final Matrix matrix, float f, float f2) {
            super(zzseVar.m51246E(), zzseVar.m51242v(), zzseVar.m51245F(), zzseVar.zzd(), matrix);
            this.f102936e = C52770zO7.m1413a(zzseVar.zzg(), new InterfaceC42388hs9() { // from class: rQ7
                @Override // p000.InterfaceC42388hs9
                public final Object zza(Object obj) {
                    return new C46615p06.C27119a((zzsc) obj, matrix);
                }
            });
            this.f102937f = f;
            this.f102938g = f2;
        }

        /* renamed from: d */
        public String m20165d() {
            return m20162c();
        }

        public C27120b(String str, Rect rect, List list, String str2, Matrix matrix, List list2, float f, float f2) {
            super(str, rect, list, str2, matrix);
            this.f102936e = list2;
            this.f102937f = f;
            this.f102938g = f2;
        }
    }

    /* renamed from: p06$e */
    /* loaded from: classes6.dex */
    public static class C27123e extends C27122d {

        /* renamed from: e */
        public final List f102945e;

        public C27123e(zzsa zzsaVar, final Matrix matrix) {
            super(zzsaVar.m51253u(), zzsaVar.m51254s(), zzsaVar.zzd(), zzsaVar.zzb(), matrix);
            this.f102945e = C52770zO7.m1413a(zzsaVar.m51252v(), new InterfaceC42388hs9() { // from class: zY7
                @Override // p000.InterfaceC42388hs9
                public final Object zza(Object obj) {
                    zzse zzseVar = (zzse) obj;
                    return new C46615p06.C27120b(zzseVar, matrix, zzseVar.m51243u(), zzseVar.m51244s());
                }
            });
        }

        /* renamed from: d */
        public synchronized List<C27120b> m20161d() {
            return this.f102945e;
        }

        /* renamed from: e */
        public String m20160e() {
            return m20162c();
        }

        public C27123e(String str, Rect rect, List list, String str2, Matrix matrix, List list2) {
            super(str, rect, list, str2, matrix);
            this.f102945e = list2;
        }
    }

    /* renamed from: p06$a */
    /* loaded from: classes6.dex */
    public static class C27119a extends C27122d {

        /* renamed from: e */
        public final List f102933e;

        /* renamed from: f */
        public final float f102934f;

        /* renamed from: g */
        public final float f102935g;

        public C27119a(zzsc zzscVar, final Matrix matrix) {
            super(zzscVar.m51251E(), zzscVar.m51247v(), zzscVar.m51250F(), zzscVar.zzd(), matrix);
            this.f102934f = zzscVar.m51248u();
            this.f102935g = zzscVar.m51249s();
            List zzg = zzscVar.zzg();
            this.f102933e = C52770zO7.m1413a(zzg == null ? new ArrayList() : zzg, new InterfaceC42388hs9() { // from class: IC7
                @Override // p000.InterfaceC42388hs9
                public final Object zza(Object obj) {
                    return new C46615p06.C27121c((zzsk) obj, matrix);
                }
            });
        }

        public C27119a(String str, Rect rect, List list, String str2, Matrix matrix, float f, float f2, List list2) {
            super(str, rect, list, str2, matrix);
            this.f102934f = f;
            this.f102935g = f2;
            this.f102933e = list2;
        }
    }
}
