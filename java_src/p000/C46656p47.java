package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbog;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboq;
import com.google.android.libraries.vision.visionkit.pipeline.AndroidAssetUtil;
import com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* renamed from: p47  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46656p47 {

    /* renamed from: a */
    public final Context f103103a;

    /* renamed from: b */
    public final AbstractC34373Lu6 f103104b;

    /* renamed from: c */
    public L37 f103105c;

    /* renamed from: d */
    public boolean f103106d;

    /* renamed from: e */
    public boolean f103107e = true;

    public C46656p47(Context context, AbstractC34373Lu6 abstractC34373Lu6) {
        this.f103103a = context;
        this.f103104b = abstractC34373Lu6;
    }

    /* renamed from: a */
    public static C46656p47 m19990a(Context context, AbstractC34373Lu6 abstractC34373Lu6) {
        return new C46656p47(context, abstractC34373Lu6);
    }

    /* renamed from: b */
    public final AbstractC42535i77 m19989b(WO1 wo1, zbnz zbnzVar, boolean z) {
        I57 m50492c;
        X57 m77409o;
        U57 u57;
        X57 m77409o2;
        U57 u572;
        U57 u573;
        L77 m19988c = m19988c();
        if (!m19988c.m97680e()) {
            return AbstractC42535i77.m34407e(m19988c);
        }
        try {
            int i = 3;
            int i2 = 1;
            if (zbnzVar.m51274s() == -1) {
                Bitmap bitmap = (Bitmap) Preconditions.checkNotNull((Bitmap) BinderC36557Vd3.m79637d5(wo1));
                if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                    String valueOf = String.valueOf(bitmap.getConfig());
                    Log.d("PipelineManager", "Input bitmap is not ARGB_8888 config. Converting it to ARGB_8888 from " + valueOf);
                    bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
                }
                m50492c = ((L37) Preconditions.checkNotNull(this.f103105c)).m50488g(SystemClock.elapsedRealtime() * 1000, bitmap, S47.m86030b(zbnzVar.m51273u()));
            } else if (zbnzVar.m51274s() == 35) {
                Image.Plane[] planes = ((Image) Preconditions.checkNotNull(BinderC36557Vd3.m79637d5(wo1))).getPlanes();
                m50492c = ((L37) Preconditions.checkNotNull(this.f103105c)).m50487h(SystemClock.elapsedRealtime() * 1000, ((Image.Plane) Preconditions.checkNotNull(planes[0])).getBuffer(), ((Image.Plane) Preconditions.checkNotNull(planes[1])).getBuffer(), ((Image.Plane) Preconditions.checkNotNull(planes[2])).getBuffer(), zbnzVar.m51272v(), zbnzVar.m51271y(), ((Image.Plane) Preconditions.checkNotNull(planes[0])).getRowStride(), ((Image.Plane) Preconditions.checkNotNull(planes[1])).getRowStride(), ((Image.Plane) Preconditions.checkNotNull(planes[1])).getPixelStride(), S47.m86030b(zbnzVar.m51273u()));
            } else if (zbnzVar.m51274s() == 17) {
                m50492c = ((L37) Preconditions.checkNotNull(this.f103105c)).m50492c(S47.m86031a(C46917pX1.m19148a((ByteBuffer) Preconditions.checkNotNull((ByteBuffer) BinderC36557Vd3.m79637d5(wo1))), zbnzVar));
            } else if (zbnzVar.m51274s() == 842094169) {
                m50492c = ((L37) Preconditions.checkNotNull(this.f103105c)).m50492c(S47.m86031a(C46917pX1.m19138k((ByteBuffer) Preconditions.checkNotNull(BinderC36557Vd3.m79637d5(wo1)), true), zbnzVar));
            } else {
                int m51274s = zbnzVar.m51274s();
                throw new MlKitException("Unsupported image format: " + m51274s, 3);
            }
            if (!m50492c.mo4151c()) {
                return AbstractC42535i77.m34407e(L77.m97682c(3, new RemoteException("VisionKit pipeline returns empty result.")));
            }
            Object mo4153a = m50492c.mo4153a();
            Matrix m14053e = C48704sY1.m14056b().m14053e(zbnzVar.m51272v(), zbnzVar.m51271y(), zbnzVar.m51273u());
            boolean z2 = this.f103107e;
            L77 m97681d = L77.m97681d();
            List<HR6> m100458H = ((C46023o07) mo4153a).m21996I().m100458H();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            for (HR6 hr6 : m100458H) {
                if (hr6.m103856G() == 6) {
                    C44917m87 m111018b = D27.m111018b(hr6.m103853J());
                    List m111017c = D27.m111017c(m111018b);
                    zboq zboqVar = new zboq(hr6.m103857F(), D27.m111019a(m111017c, m14053e), m111017c, hr6.m103855H(), m111018b.m26290E());
                    Integer valueOf2 = Integer.valueOf(hr6.m103854I());
                    if (hashMap2.containsKey(valueOf2)) {
                        u573 = (U57) hashMap2.get(valueOf2);
                    } else {
                        U57 u574 = new U57();
                        hashMap2.put(valueOf2, u574);
                        u573 = u574;
                    }
                    ((U57) Preconditions.checkNotNull(u573)).m81979a(zboqVar);
                }
            }
            int i3 = 0;
            while (i3 < m100458H.size()) {
                HR6 hr62 = (HR6) m100458H.get(i3);
                if (hr62.m103856G() == i2) {
                    C44917m87 m111018b2 = D27.m111018b(hr62.m103853J());
                    List m111017c2 = D27.m111017c(m111018b2);
                    Integer valueOf3 = Integer.valueOf(i3);
                    if (hashMap2.containsKey(valueOf3)) {
                        m77409o2 = ((U57) Preconditions.checkNotNull((U57) hashMap2.get(valueOf3))).m81978b();
                    } else {
                        m77409o2 = X57.m77409o();
                    }
                    zboi zboiVar = new zboi(hr62.m103857F(), D27.m111019a(m111017c2, m14053e), m111017c2, C42495i37.m34509a(hr62.m103852K().m14188G()), hr62.m103855H(), m111018b2.m26290E(), (List) Preconditions.checkNotNull(m77409o2));
                    Integer valueOf4 = Integer.valueOf(hr62.m103854I());
                    if (hashMap.containsKey(valueOf4)) {
                        u572 = (U57) hashMap.get(valueOf4);
                    } else {
                        U57 u575 = new U57();
                        hashMap.put(valueOf4, u575);
                        u572 = u575;
                    }
                    ((U57) Preconditions.checkNotNull(u572)).m81979a(zboiVar);
                }
                i3++;
                i2 = 1;
            }
            int i4 = 0;
            while (i4 < m100458H.size()) {
                HR6 hr63 = (HR6) m100458H.get(i4);
                if (hr63.m103856G() == i) {
                    C44917m87 m111018b3 = D27.m111018b(hr63.m103853J());
                    List m111017c3 = D27.m111017c(m111018b3);
                    Integer valueOf5 = Integer.valueOf(i4);
                    if (hashMap.containsKey(valueOf5)) {
                        m77409o = ((U57) Preconditions.checkNotNull((U57) hashMap.get(valueOf5))).m81978b();
                    } else {
                        m77409o = X57.m77409o();
                    }
                    zbok zbokVar = new zbok(hr63.m103857F(), D27.m111019a(m111017c3, m14053e), m111017c3, C42495i37.m34509a(hr63.m103852K().m14188G()), (List) Preconditions.checkNotNull(m77409o), hr63.m103855H(), m111018b3.m26290E());
                    Integer valueOf6 = Integer.valueOf(hr63.m103854I());
                    if (hashMap3.containsKey(valueOf6)) {
                        u57 = (U57) hashMap3.get(valueOf6);
                    } else {
                        U57 u576 = new U57();
                        hashMap3.put(Integer.valueOf(hr63.m103854I()), u576);
                        u57 = u576;
                    }
                    ((U57) Preconditions.checkNotNull(u57)).m81979a(zbokVar);
                }
                i4++;
                i = 3;
            }
            U57 u577 = new U57();
            for (int i5 = 0; i5 < m100458H.size(); i5++) {
                HR6 hr64 = (HR6) m100458H.get(i5);
                if (hr64.m103856G() == 4) {
                    List m111017c4 = D27.m111017c(D27.m111018b(hr64.m103853J()));
                    X57 m77409o3 = X57.m77409o();
                    Integer valueOf7 = Integer.valueOf(i5);
                    if (hashMap3.containsKey(valueOf7)) {
                        m77409o3 = ((U57) Preconditions.checkNotNull((U57) hashMap3.get(valueOf7))).m81978b();
                        hashMap3.remove(valueOf7);
                    }
                    u577.m81979a(new zbog(E67.f6970a.m105820b(C41339g67.m40007a(m77409o3, C50815w57.f115259a)), D27.m111019a(m111017c4, m14053e), m111017c4, C42495i37.m34509a(hr64.m103852K().m14188G()), (List) Preconditions.checkNotNull(m77409o3)));
                }
            }
            Iterator it = hashMap3.values().iterator();
            while (it.hasNext()) {
                X57 m81978b = ((U57) it.next()).m81978b();
                int size = m81978b.size();
                int i6 = 0;
                while (i6 < size) {
                    zbok zbokVar2 = (zbok) m81978b.get(i6);
                    u577.m81979a(new zbog(zbokVar2.m51266v(), zbokVar2.m51268s(), zbokVar2.m51269E(), zbokVar2.m51267u(), X57.m77408s(zbokVar2)));
                    i6++;
                    it = it;
                }
            }
            X57 m81978b2 = u577.m81978b();
            C51008wQ6 c51008wQ6 = new C51008wQ6(m97681d, new zbom(E67.f6970a.m105820b(C41339g67.m40007a(m81978b2, C37764a67.f49836a)), m81978b2), X57.m77409o(), z2);
            this.f103107e = false;
            return c51008wQ6;
        } catch (MlKitException e) {
            return AbstractC42535i77.m34407e(L77.m97682c(2, new RemoteException("Failed to process input image.".concat(String.valueOf(e.getMessage())))));
        }
    }

    /* renamed from: c */
    public final L77 m19988c() {
        if (this.f103106d) {
            return L77.m97681d();
        }
        if (this.f103105c == null) {
            if (!AndroidAssetUtil.m50502a(this.f103103a)) {
                Log.d("PipelineManager", "Failed to initiate native asset manager.");
            }
            AbstractC34373Lu6 abstractC34373Lu6 = this.f103104b;
            String mo96205b = abstractC34373Lu6.mo96205b();
            String mo96203d = abstractC34373Lu6.mo96203d();
            String mo96204c = abstractC34373Lu6.mo96204c();
            C46347oZ6 m10061F = C49904uZ6.m10061F();
            Q07 m78941F = W07.m78941F();
            C49302tY6 m1124E = C52859zY6.m1124E();
            m1124E.m12048z(mo96203d);
            m1124E.m12051t(mo96205b);
            m1124E.m12052A(true);
            m1124E.m12050w(true);
            if (!mo96204c.isEmpty()) {
                C47289q87 m16439E = C47882r87.m16439E();
                C49067t87 m9135E = C50252v87.m9135E();
                m9135E.m13008t(mo96204c);
                m16439E.m18075t(m9135E);
                m1124E.m12049y(m16439E);
            }
            m78941F.m89135y(m1124E);
            M47 m90881E = P47.m90881E();
            m90881E.m95840t("PassThroughCoarseClassifier");
            m78941F.m89136w(m90881E);
            m10061F.m20895t(m78941F);
            A27 m108066E = F27.m108066E();
            m108066E.m116171t(2);
            m10061F.m20894w(m108066E);
            this.f103105c = new L37((C49904uZ6) m10061F.mo71104s(), this.f103104b.mo96205b(), "mlkit_google_ocr_pipeline");
        }
        try {
            ((L37) Preconditions.checkNotNull(this.f103105c)).m50490e();
            this.f103106d = true;
            return L77.m97681d();
        } catch (PipelineException e) {
            return L77.m97682c(1, new RemoteException("Failed to initialize detector. ".concat((String) e.getRootCauseMessage().mo4152b(""))));
        }
    }

    /* renamed from: d */
    public final void m19987d() {
        L37 l37 = this.f103105c;
        if (l37 != null) {
            if (this.f103106d) {
                l37.m50489f();
            }
            this.f103105c.m50491d();
            this.f103105c = null;
        }
        this.f103106d = false;
        this.f103107e = true;
    }
}
