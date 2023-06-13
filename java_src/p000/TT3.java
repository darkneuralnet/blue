package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.Image;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.libraries.intelligence.acceleration.ProcessStateObserver;
import com.google.android.libraries.vision.visionkit.pipeline.PipelineException;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.internal.VisionImageMetadataParcel;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@KeepForSdk
/* renamed from: TT3 */
/* loaded from: classes6.dex */
public class TT3 {

    /* renamed from: a */
    public final Context f35517a;

    /* renamed from: b */
    public final InterfaceC49231tQ7 f35518b;

    /* renamed from: c */
    public final boolean f35519c;

    /* renamed from: g */
    public final C31746Ao7 f35523g;

    /* renamed from: h */
    public final C49451tn7 f35524h;

    /* renamed from: i */
    public CY7 f35525i;

    /* renamed from: j */
    public boolean f35526j;

    /* renamed from: d */
    public final List f35520d = new ArrayList();

    /* renamed from: e */
    public final List f35521e = new ArrayList();

    /* renamed from: f */
    public final C47327qC7 f35522f = new C47327qC7(10);

    /* renamed from: k */
    public boolean f35527k = true;

    /* renamed from: l */
    public long f35528l = -1;

    static {
        System.loadLibrary("mlkitcommonpipeline");
    }

    public TT3(Context context, InterfaceC49231tQ7 interfaceC49231tQ7, boolean z, C31746Ao7 c31746Ao7, C49451tn7 c49451tn7) {
        this.f35517a = context;
        this.f35518b = interfaceC49231tQ7;
        this.f35519c = z;
        this.f35523g = c31746Ao7;
        this.f35524h = c49451tn7;
    }

    @KeepForSdk
    /* renamed from: a */
    public static TT3 m83583a(Context context, AbstractC33671Iu6 abstractC33671Iu6) {
        return new TT3(context, abstractC33671Iu6, abstractC33671Iu6.mo99076j(), C41763gp7.m37436b("vision-internal-vkp"), (C49451tn7) Preconditions.checkNotNull(C49451tn7.m11768a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d0  */
    @KeepForSdk
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC33905Ju6 m83582b(C41304g32 c41304g32, VisionImageMetadataParcel visionImageMetadataParcel) {
        AbstractC34139Ku6 m98183f;
        LP8 m50498d;
        Boolean bool;
        Boolean bool2;
        HK8 m85279I;
        int i;
        Integer num;
        if (!this.f35519c) {
            m98183f = AbstractC34139Ku6.m98183f();
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f35528l;
            if (j > 0 && elapsedRealtime - j > 300) {
                Log.w("PipelineManager", "Pipeline is reset.");
                m83580d();
                m98183f = m83581c();
            } else {
                this.f35528l = elapsedRealtime;
                m98183f = AbstractC34139Ku6.m98183f();
            }
        }
        if (!m98183f.mo4500c()) {
            return AbstractC33905Ju6.m99564f(m98183f);
        }
        try {
            if (c41304g32.m40242g() == -1) {
                Bitmap bitmap = (Bitmap) Preconditions.checkNotNull(c41304g32.m40245d());
                if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                    String valueOf = String.valueOf(bitmap.getConfig());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 70);
                    sb.append("Input bitmap is not ARGB_8888 config. Converting it to ARGB_8888 from ");
                    sb.append(valueOf);
                    Log.d("PipelineManager", sb.toString());
                    bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
                }
                m50498d = ((CY7) Preconditions.checkNotNull(this.f35525i)).m50494h(SystemClock.elapsedRealtime() * 1000, bitmap, J68.m101121a(visionImageMetadataParcel.f74673e));
            } else if (c41304g32.m40242g() == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(c41304g32.m40239j());
                m50498d = ((CY7) Preconditions.checkNotNull(this.f35525i)).m50493i(SystemClock.elapsedRealtime() * 1000, ((Image.Plane) Preconditions.checkNotNull(planeArr[0])).getBuffer(), ((Image.Plane) Preconditions.checkNotNull(planeArr[1])).getBuffer(), ((Image.Plane) Preconditions.checkNotNull(planeArr[2])).getBuffer(), c41304g32.m40237l(), c41304g32.m40241h(), ((Image.Plane) Preconditions.checkNotNull(planeArr[0])).getRowStride(), ((Image.Plane) Preconditions.checkNotNull(planeArr[1])).getRowStride(), ((Image.Plane) Preconditions.checkNotNull(planeArr[1])).getPixelStride(), J68.m101121a(visionImageMetadataParcel.f74673e));
            } else {
                ByteBuffer m19144e = C46917pX1.m19142g().m19144e(c41304g32, true);
                NH7 nh7 = new NH7();
                nh7.m94091a(m19144e.array());
                nh7.m94086f(J68.m101121a(visionImageMetadataParcel.f74673e));
                nh7.m94090b(new C44533lV7(visionImageMetadataParcel.f74670b, visionImageMetadataParcel.f74671c));
                nh7.m94089c(visionImageMetadataParcel.f74672d * 1000);
                nh7.m94087e(2);
                m50498d = ((CY7) Preconditions.checkNotNull(this.f35525i)).m50498d(nh7.m94088d());
            }
            if (m50498d.mo78525c()) {
                C40930fQ7 c40930fQ7 = (C40930fQ7) ((C45746nY7) ((CY7) Preconditions.checkNotNull(this.f35525i)).m50499c().mo78526b(C45746nY7.m23545F())).m42407h();
                c40930fQ7.m41386p(this.f35520d);
                C45746nY7 c45746nY7 = (C45746nY7) c40930fQ7.mo42381i();
                this.f35520d.clear();
                List m17899a = this.f35522f.m17899a(c45746nY7.m23543H());
                if (!m17899a.isEmpty()) {
                    C31746Ao7 c31746Ao7 = this.f35523g;
                    Im9 m91451E = Om9.m91451E();
                    m91451E.m101723q(m17899a);
                    c31746Ao7.m115144b(C31980Bo7.m113467d(m91451E), EnumC36858Wk7.ACCELERATION_ANALYTICS);
                }
                SZ7 sz7 = (SZ7) m50498d.mo78527a();
                Matrix m46759s = visionImageMetadataParcel.m46759s();
                boolean z = this.f35527k;
                if (c45746nY7.m23547D() != 0) {
                    Iterator it = c45746nY7.m23543H().iterator();
                    boolean z2 = false;
                    while (true) {
                        if (it.hasNext()) {
                            C40084dz7 m3E = ((C53128zz7) it.next()).m3E();
                            C37686Zy7 m43427E = m3E.m43427E();
                            if (m3E.m43424H() == 4) {
                                if (m3E.m43423I() == 2 && m3E.m43428D().m89202F().m94519F() == 2 && m43427E.m72158I() && !m43427E.m72163D().m75933F() && !m43427E.m72163D().m75932G() && !m43427E.m72159H() && !m43427E.m72160G()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                z2 = true;
                            }
                        } else if (z2) {
                            bool = Boolean.FALSE;
                        }
                    }
                    bool2 = bool;
                    C44516lT8 c44516lT8 = new C44516lT8();
                    m85279I = sz7.m85279I();
                    for (i = 0; i < m85279I.m103988D(); i++) {
                        YJ8 m103987E = m85279I.m103987E(i);
                        C39995dq8 m75252F = m103987E.m75252F();
                        RectF rectF = new RectF(m75252F.m43642E(), m75252F.m43641F(), m75252F.m43642E() + m75252F.m43640G(), m75252F.m43641F() + m75252F.m43643D());
                        if (m46759s != null) {
                            m46759s.mapRect(rectF);
                        }
                        Rect rect = new Rect();
                        rectF.round(rect);
                        if (m103987E.m75249I()) {
                            num = Integer.valueOf((int) m103987E.m75253E());
                        } else {
                            num = null;
                        }
                        C44516lT8 c44516lT82 = new C44516lT8();
                        for (int i2 = 0; i2 < m103987E.m75254D(); i2++) {
                            c44516lT82.m27250c(AbstractC33203Gu6.m104598e(m103987E.m75251G(i2)));
                        }
                        c44516lT8.m27250c(new C29330uu(rect, num, c44516lT82.m27249d()));
                    }
                    C44516lT8 c44516lT83 = new C44516lT8();
                    for (NE8 ne8 : sz7.m85280H().m43081F()) {
                        for (C33889Js8 c33889Js8 : ne8.m94164E()) {
                            c44516lT83.m27250c(AbstractC33203Gu6.m104598e(c33889Js8));
                        }
                    }
                    C29991wu c29991wu = new C29991wu(AbstractC34139Ku6.m98183f(), c44516lT8.m27249d(), c44516lT83.m27249d(), z, bool2);
                    this.f35527k = false;
                    return c29991wu;
                }
                bool2 = null;
                C44516lT8 c44516lT84 = new C44516lT8();
                m85279I = sz7.m85279I();
                while (i < m85279I.m103988D()) {
                }
                C44516lT8 c44516lT832 = new C44516lT8();
                while (r2.hasNext()) {
                }
                C29991wu c29991wu2 = new C29991wu(AbstractC34139Ku6.m98183f(), c44516lT84.m27249d(), c44516lT832.m27249d(), z, bool2);
                this.f35527k = false;
                return c29991wu2;
            }
            return AbstractC33905Ju6.m99564f(new C30337xu(false, null, AbstractC45127mV8.m25479u()));
        } catch (MlKitException e) {
            return AbstractC33905Ju6.m99564f(AbstractC34139Ku6.m98184e(e));
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public AbstractC34139Ku6 m83581c() {
        String str;
        int i;
        VF8 m29968e;
        int i2;
        C41250fx7 c41250fx7;
        C49842uS7 m29972a;
        if (this.f35526j) {
            return AbstractC34139Ku6.m98183f();
        }
        if (this.f35525i == null) {
            try {
                InterfaceC49231tQ7 interfaceC49231tQ7 = this.f35518b;
                if (interfaceC49231tQ7 instanceof AbstractC33437Hu6) {
                    AbstractC33437Hu6 abstractC33437Hu6 = (AbstractC33437Hu6) interfaceC49231tQ7;
                    float m103228a = abstractC33437Hu6.m103228a();
                    int m103227b = abstractC33437Hu6.m103227b();
                    abstractC33437Hu6.m103226c();
                    m29972a = C36625Vk8.m79471a(this.f35517a, m103228a, m103227b);
                } else {
                    AbstractC33671Iu6 abstractC33671Iu6 = (AbstractC33671Iu6) interfaceC49231tQ7;
                    abstractC33671Iu6.mo99084b();
                    abstractC33671Iu6.mo99083c();
                    abstractC33671Iu6.mo99082d();
                    if (!abstractC33671Iu6.mo99078h()) {
                        m29968e = C43503jl8.f93302a;
                    } else {
                        m29968e = C43503jl8.m29968e(m83578f(C43503jl8.m29966g()));
                    }
                    VF8 vf8 = m29968e;
                    if (true != abstractC33671Iu6.mo99079g()) {
                        i2 = 3;
                    } else {
                        i2 = 2;
                    }
                    C45995nx8 m83578f = m83578f(C43503jl8.m29965h());
                    if (abstractC33671Iu6.mo99079g()) {
                        C41250fx7 m11766c = this.f35524h.m11766c(abstractC33671Iu6.mo99081e(), abstractC33671Iu6.mo99080f(), "com.google.perception", 2);
                        Log.i("PipelineManager", "Fetching acceleration allowlist");
                        this.f35524h.m11767b(abstractC33671Iu6.mo99081e(), abstractC33671Iu6.mo99080f(), "com.google.perception", 2);
                        c41250fx7 = m11766c;
                    } else {
                        c41250fx7 = null;
                    }
                    if (abstractC33671Iu6.mo99076j()) {
                        C43089j38 m29969d = C43503jl8.m29969d(this.f35517a, abstractC33671Iu6.mo99077i(), m83578f, vf8, 300000L, c41250fx7);
                        m29969d.m31208H(i2);
                        m29972a = C43503jl8.m29971b(m29969d);
                    } else {
                        C43089j38 m29970c = C43503jl8.m29970c(this.f35517a, abstractC33671Iu6.mo99077i(), m83578f, vf8);
                        m29970c.m31208H(i2);
                        if (c41250fx7 != null) {
                            m29970c.m31205r(c41250fx7);
                        }
                        m29972a = C43503jl8.m29972a(m29970c);
                    }
                }
                C40948fS7 c40948fS7 = (C40948fS7) m29972a.m42407h();
                C32593Ee8 m15398D = C48257rm8.m15398D();
                m15398D.m108614p(true);
                File file = new File(this.f35517a.getFilesDir(), "com.google.mlkit.acceleration");
                if (!file.exists() && !file.mkdir()) {
                    List list = this.f35520d;
                    C43642jz7 m2F = C53128zz7.m2F();
                    m2F.m29508p(3);
                    list.add((C53128zz7) m2F.mo42381i());
                    Log.e("PipelineManager", "Failed to create acceleration storage dir");
                }
                m15398D.m108613q(file.getAbsolutePath());
                c40948fS7.m41308p(m15398D);
                this.f35525i = new CY7((C49842uS7) c40948fS7.mo42381i());
            } catch (IOException e) {
                m83579e();
                return AbstractC34139Ku6.m98184e(new MlKitException("Failed to initialize detector. ", 5, e));
            }
        }
        try {
            try {
                this.f35525i.m50496f();
                m83579e();
                ProcessStateObserver.m50504a().m50503b();
                this.f35526j = true;
                return AbstractC34139Ku6.m98183f();
            } catch (PipelineException e2) {
                String str2 = (String) e2.getRootCauseMessage().mo78526b("");
                if (str2.length() != 0) {
                    str = "Failed to initialize detector. ".concat(str2);
                } else {
                    str = new String("Failed to initialize detector. ");
                }
                MlKitException mlKitException = new MlKitException(str, 3);
                C38587bV8 c38587bV8 = new C38587bV8();
                c38587bV8.m64503c(new C30769yu(1, e2.getStatusCode().ordinal()));
                for (C42909il7 c42909il7 : e2.getComponentStatuses()) {
                    for (C50666vq7 c50666vq7 : c42909il7.m33508E()) {
                        if (true != "tflite::support::TfLiteSupportStatus".equals(c50666vq7.m7926F())) {
                            i = 0;
                        } else {
                            i = 3;
                        }
                        c38587bV8.m64503c(new C30769yu(i, c50666vq7.m7928D()));
                    }
                }
                C30337xu c30337xu = new C30337xu(false, mlKitException, c38587bV8.m64502d());
                m83579e();
                return c30337xu;
            }
        } catch (Throwable th) {
            m83579e();
            throw th;
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public void m83580d() {
        CY7 cy7 = this.f35525i;
        if (cy7 != null) {
            if (this.f35526j) {
                cy7.m50495g();
            }
            this.f35525i.m50497e();
            this.f35525i = null;
        }
        this.f35526j = false;
        this.f35527k = true;
        this.f35528l = -1L;
        m83579e();
    }

    /* renamed from: e */
    public final void m83579e() {
        for (AssetFileDescriptor assetFileDescriptor : this.f35521e) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e) {
                    Log.e("PipelineManager", "Failed to close asset model file.", e);
                }
            }
        }
        this.f35521e.clear();
    }

    /* renamed from: f */
    public final C45995nx8 m83578f(String str) throws IOException {
        AssetFileDescriptor openFd = this.f35517a.getAssets().openFd(str);
        this.f35521e.add(openFd);
        C39473cx8 m22100G = C45995nx8.m22100G();
        m22100G.m44799p(((AssetFileDescriptor) Preconditions.checkNotNull(openFd)).getParcelFileDescriptor().getFd());
        m22100G.m44797r(((AssetFileDescriptor) Preconditions.checkNotNull(openFd)).getStartOffset());
        m22100G.m44798q(((AssetFileDescriptor) Preconditions.checkNotNull(openFd)).getLength());
        return (C45995nx8) m22100G.mo42381i();
    }
}
