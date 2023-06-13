package p000;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.internal.VisionImageMetadataParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p000.U11;
/* renamed from: H68 */
/* loaded from: classes6.dex */
public final class H68 extends LE2 {

    /* renamed from: l */
    public static final C48704sY1 f12852l = C48704sY1.m14056b();

    /* renamed from: d */
    public final C34451Md3 f12853d;

    /* renamed from: e */
    public final C52226yU2 f12854e;

    /* renamed from: f */
    public final Se9 f12855f;

    /* renamed from: g */
    public final C42851if9 f12856g;

    /* renamed from: h */
    public final Gi9 f12857h;

    /* renamed from: i */
    public final X29 f12858i;

    /* renamed from: j */
    public TT3 f12859j;

    /* renamed from: k */
    public boolean f12860k;

    public H68(C52226yU2 c52226yU2, C34451Md3 c34451Md3) {
        Se9 m2914b = C52347yg9.m2914b("object-detection");
        Preconditions.checkNotNull(c52226yU2, "Context can not be null");
        Preconditions.checkNotNull(c34451Md3, "ObjectDetectorOptions can not be null");
        this.f12855f = m2914b;
        this.f12856g = C42851if9.m33610a(c52226yU2.m3452b());
        this.f12853d = c34451Md3;
        this.f12854e = c52226yU2;
        this.f12858i = DA8.m110805b(c34451Md3);
        this.f12857h = Gi9.m104848f();
    }

    @Override // p000.AbstractC39174cV2
    /* renamed from: b */
    public final synchronized void mo1910b() throws MlKitException {
        String str;
        String str2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Gi9 gi9 = this.f12857h;
        String valueOf = String.valueOf(LibraryVersion.getInstance().getVersion("object-detection"));
        if (valueOf.length() != 0) {
            str = "object-detection:".concat(valueOf);
        } else {
            str = new String("object-detection:");
        }
        gi9.m104843k(str);
        try {
            Tasks.await(this.f12857h.m104852b());
        } catch (InterruptedException | ExecutionException e) {
            String valueOf2 = String.valueOf(e.getLocalizedMessage());
            if (valueOf2.length() != 0) {
                str2 = "remoteConfig.loadAndActivate failed: ".concat(valueOf2);
            } else {
                str2 = new String("remoteConfig.loadAndActivate failed: ");
            }
            Log.e("BundledODTTask", str2);
        }
        this.f12860k = Boolean.parseBoolean(this.f12857h.m104846h("vision_object_detection_enable_acceleration"));
        if (Log.isLoggable("BundledODTTask", 4)) {
            boolean z = this.f12860k;
            StringBuilder sb = new StringBuilder(41);
            sb.append("isRemoteConfigAccelerationEnabled = ");
            sb.append(z);
            Log.i("BundledODTTask", sb.toString());
        }
        this.f12857h.m104853a(Gi9.f12296o);
        if (this.f12859j == null) {
            Context m3452b = this.f12854e.m3452b();
            boolean z2 = true;
            if (this.f12853d.m93689a() != 1) {
                z2 = false;
            }
            this.f12859j = TT3.m83583a(m3452b, AbstractC33671Iu6.m101489a(z2, this.f12853d.m93686d(), this.f12853d.m93687c(), this.f12860k, 0.0f, 1, null));
        }
        AbstractC34139Ku6 m83581c = this.f12859j.m83581c();
        if (!m83581c.mo4500c()) {
            m104397m(EnumC39189cW8.NO_VALID_MODEL, m83581c, SystemClock.elapsedRealtime() - elapsedRealtime);
            m83581c.m98185d();
            return;
        }
        m104397m(EnumC39189cW8.NO_ERROR, m83581c, SystemClock.elapsedRealtime() - elapsedRealtime);
    }

    @Override // p000.AbstractC39174cV2
    /* renamed from: d */
    public final synchronized void mo1909d() {
        TT3 tt3 = this.f12859j;
        if (tt3 != null) {
            tt3.m83580d();
            this.f12859j = null;
        }
        Se9 se9 = this.f12855f;
        C52250yW8 c52250yW8 = new C52250yW8();
        c52250yW8.m3390e(TV8.TYPE_THICK);
        se9.m85156d(C47595qf9.m17260d(c52250yW8), EnumC45136mW8.ON_DEVICE_OBJECT_CLOSE);
    }

    @Override // p000.LE2
    /* renamed from: j */
    public final synchronized List mo1908i(C41304g32 c41304g32) throws MlKitException {
        C41304g32 c41304g322;
        ArrayList arrayList;
        char c;
        String str;
        char c2;
        int i;
        Preconditions.checkNotNull(c41304g32, "Mobile vision input can not be null");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f12859j == null) {
            Log.e("BundledODTTask", "Object detector is not initialized.");
            return new ArrayList();
        }
        char c3 = 1;
        if (c41304g32.m40242g() == 35) {
            c41304g322 = C41304g32.m40248a(C46917pX1.m19142g().m19144e(c41304g32, true), c41304g32.m40237l(), c41304g32.m40241h(), c41304g32.m40238k(), 17);
        } else {
            c41304g322 = c41304g32;
        }
        AbstractC33905Ju6 m83582b = ((TT3) Preconditions.checkNotNull(this.f12859j)).m83582b(c41304g322, new VisionImageMetadataParcel(c41304g32.m40237l(), c41304g32.m40241h(), 0, SystemClock.elapsedRealtime(), C48871sp0.m13606a(c41304g32.m40238k())));
        AbstractC34139Ku6 mo6141c = m83582b.mo6141c();
        if (!mo6141c.mo4500c()) {
            m104398l(EnumC39189cW8.UNKNOWN_ERROR, mo6141c, c41304g32, AbstractC38851bw7.m62111s(), m83582b.mo6139e(), m83582b.mo6140d(), elapsedRealtime);
            mo6141c.m98185d();
            return new ArrayList();
        }
        List<AbstractC32969Fu6> mo6143a = m83582b.mo6143a();
        Matrix m40243f = c41304g32.m40243f();
        if (mo6143a.isEmpty()) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC32969Fu6 abstractC32969Fu6 : mo6143a) {
                ArrayList arrayList3 = new ArrayList();
                if (!abstractC32969Fu6.mo9541b().isEmpty()) {
                    String mo7806a = abstractC32969Fu6.mo9541b().get(0).mo7806a();
                    int i2 = 2;
                    switch (mo7806a.hashCode()) {
                        case -584479206:
                            if (mo7806a.equals("/g/11g0srqwrg")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -584453279:
                            if (mo7806a.equals("/g/11g0srrsqr")) {
                                c = c3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -347133297:
                            if (mo7806a.equals("/m/02wbm")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -347049250:
                            if (mo7806a.equals("/m/05s2s")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 286374479:
                            if (mo7806a.equals("/g/11fhycwtxg")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c != c3) {
                            if (c != 2) {
                                if (c != 3) {
                                    if (c != 4) {
                                        str = null;
                                    } else {
                                        str = "Plant";
                                    }
                                } else {
                                    str = "Place";
                                }
                            } else {
                                str = "Food";
                            }
                        } else {
                            str = "Fashion good";
                        }
                    } else {
                        str = "Home good";
                    }
                    if (str != null) {
                        float mo7804c = abstractC32969Fu6.mo9541b().get(0).mo7804c();
                        switch (str.hashCode()) {
                            case -958563771:
                                if (str.equals("Fashion good")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -231354562:
                                if (str.equals("Home good")) {
                                    c2 = c3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2195582:
                                if (str.equals("Food")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 77195495:
                                if (str.equals("Place")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 77195851:
                                if (str.equals("Plant")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        if (c2 != 0) {
                            if (c2 != c3) {
                                if (c2 != 2) {
                                    if (c2 != 3) {
                                        i2 = 4;
                                        if (c2 != 4) {
                                            i = -1;
                                        }
                                    } else {
                                        i = 3;
                                    }
                                }
                                i = i2;
                            } else {
                                i = 1;
                            }
                        } else {
                            i = 0;
                        }
                        arrayList3.add(new U11.C8175a(str, mo7804c, i));
                    }
                }
                Rect mo9542a = abstractC32969Fu6.mo9542a();
                if (m40243f != null) {
                    C48871sp0.m13602e(mo9542a, m40243f);
                }
                arrayList2.add(new U11(mo9542a, abstractC32969Fu6.mo9540c(), arrayList3));
                c3 = 1;
            }
            arrayList = arrayList2;
        }
        m104398l(EnumC39189cW8.NO_ERROR, mo6141c, c41304g32, arrayList, m83582b.mo6139e(), m83582b.mo6140d(), elapsedRealtime);
        return arrayList;
    }

    /* renamed from: k */
    public final /* synthetic */ C47595qf9 m104399k(List list, long j, EnumC39189cW8 enumC39189cW8, AbstractC34139Ku6 abstractC34139Ku6, boolean z, Boolean bool, C41304g32 c41304g32) {
        QS8 qs8;
        EnumC50489vY8 enumC50489vY8;
        String str;
        C36003St7 c36003St7 = new C36003St7();
        Iterator it = list.iterator();
        while (true) {
            char c = 65535;
            if (it.hasNext()) {
                U11 u11 = (U11) it.next();
                C45154mY8 c45154mY8 = new C45154mY8();
                if (!u11.m82116b().isEmpty()) {
                    U11.C8175a c8175a = u11.m82116b().get(0);
                    String m82112c = c8175a.m82112c();
                    switch (m82112c.hashCode()) {
                        case -958563771:
                            if (m82112c.equals("Fashion good")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -231354562:
                            if (m82112c.equals("Home good")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 2195582:
                            if (m82112c.equals("Food")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 77195495:
                            if (m82112c.equals("Place")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 77195851:
                            if (m82112c.equals("Plant")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2) {
                                if (c != 3) {
                                    if (c != 4) {
                                        if (m82112c.length() != 0) {
                                            str = "Unexpected category: ".concat(m82112c);
                                        } else {
                                            str = new String("Unexpected category: ");
                                        }
                                        Log.e("ObjectsLoggingUtils", str);
                                        enumC50489vY8 = EnumC50489vY8.CATEGORY_UNKNOWN;
                                    } else {
                                        enumC50489vY8 = EnumC50489vY8.CATEGORY_PLANT;
                                    }
                                } else {
                                    enumC50489vY8 = EnumC50489vY8.CATEGORY_PLACE;
                                }
                            } else {
                                enumC50489vY8 = EnumC50489vY8.CATEGORY_FOOD;
                            }
                        } else {
                            enumC50489vY8 = EnumC50489vY8.CATEGORY_FASHION_GOOD;
                        }
                    } else {
                        enumC50489vY8 = EnumC50489vY8.CATEGORY_HOME_GOOD;
                    }
                    c45154mY8.m25442a(enumC50489vY8);
                    c45154mY8.m25441b(Float.valueOf(c8175a.m82114a()));
                }
                Integer m82115c = u11.m82115c();
                if (m82115c != null) {
                    c45154mY8.m25440c(m82115c);
                }
                c36003St7.m84668d(c45154mY8.m25438e());
            } else {
                C44525lU8 c44525lU8 = new C44525lU8();
                c44525lU8.m27230d(Long.valueOf(j));
                c44525lU8.m27229e(enumC39189cW8);
                c44525lU8.m27226h(DA8.m110806a(abstractC34139Ku6));
                c44525lU8.m27227g(Boolean.valueOf(z));
                Boolean bool2 = Boolean.TRUE;
                c44525lU8.m27232b(bool2);
                c44525lU8.m27231c(bool2);
                c44525lU8.m27225i(Boolean.valueOf(this.f12860k));
                if (bool != null) {
                    c44525lU8.m27228f(bool);
                }
                C52250yW8 c52250yW8 = new C52250yW8();
                c52250yW8.m3390e(TV8.TYPE_THICK);
                C49019t39 c49019t39 = new C49019t39();
                c49019t39.m13163g(c44525lU8.m27224j());
                C48704sY1 c48704sY1 = f12852l;
                int m14055c = c48704sY1.m14055c(c41304g32);
                int m14054d = c48704sY1.m14054d(c41304g32);
                FS8 fs8 = new FS8();
                if (m14055c != -1) {
                    if (m14055c != 35) {
                        if (m14055c != 842094169) {
                            if (m14055c != 16) {
                                if (m14055c != 17) {
                                    qs8 = QS8.UNKNOWN_FORMAT;
                                } else {
                                    qs8 = QS8.NV21;
                                }
                            } else {
                                qs8 = QS8.NV16;
                            }
                        } else {
                            qs8 = QS8.YV12;
                        }
                    } else {
                        qs8 = QS8.YUV_420_888;
                    }
                } else {
                    qs8 = QS8.BITMAP;
                }
                fs8.m107131a(qs8);
                fs8.m107130b(Integer.valueOf(m14054d));
                c49019t39.m13164f(fs8.m107128d());
                c49019t39.m13165e(this.f12858i);
                c49019t39.m13162h(c36003St7.m84667e());
                c52250yW8.m3387h(c49019t39.m13161i());
                return C47595qf9.m17260d(c52250yW8);
            }
        }
    }

    /* renamed from: l */
    public final void m104398l(EnumC39189cW8 enumC39189cW8, AbstractC34139Ku6 abstractC34139Ku6, C41304g32 c41304g32, List list, boolean z, Boolean bool, long j) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f12855f.m85154f(new C52267yY7(this, list, elapsedRealtime, enumC39189cW8, abstractC34139Ku6, z, bool, c41304g32), EnumC45136mW8.ON_DEVICE_OBJECT_INFERENCE);
        C40488eg8 c40488eg8 = new C40488eg8();
        c40488eg8.m42632a(this.f12858i);
        c40488eg8.m42631b(enumC39189cW8);
        c40488eg8.m42629d(Boolean.valueOf(z));
        c40488eg8.m42630c(Boolean.valueOf(!list.isEmpty()));
        final C33781Jg8 m42628e = c40488eg8.m42628e();
        final C47453qQ7 c47453qQ7 = C47453qQ7.f105300a;
        final Se9 se9 = this.f12855f;
        final EnumC45136mW8 enumC45136mW8 = EnumC45136mW8.AGGREGATED_ON_DEVICE_OBJECT_INFERENCE;
        ME2.m95477d().execute(new Runnable(enumC45136mW8, m42628e, elapsedRealtime, c47453qQ7, null) { // from class: ie9

            /* renamed from: c */
            public final /* synthetic */ EnumC45136mW8 f87694c;

            /* renamed from: d */
            public final /* synthetic */ Object f87695d;

            /* renamed from: e */
            public final /* synthetic */ long f87696e;

            /* renamed from: f */
            public final /* synthetic */ C47453qQ7 f87697f;

            @Override // java.lang.Runnable
            public final void run() {
                Se9.this.m85157c(this.f87694c, this.f87695d, this.f87696e, this.f87697f);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        this.f12856g.m33608c(24310, enumC39189cW8.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }

    /* renamed from: m */
    public final void m104397m(EnumC39189cW8 enumC39189cW8, AbstractC34139Ku6 abstractC34139Ku6, long j) {
        Se9 se9 = this.f12855f;
        C52250yW8 c52250yW8 = new C52250yW8();
        c52250yW8.m3390e(TV8.TYPE_THICK);
        U39 u39 = new U39();
        u39.m82028d(this.f12858i);
        u39.m82025g(Long.valueOf(j));
        u39.m82027e(enumC39189cW8);
        u39.m82026f(DA8.m110806a(abstractC34139Ku6));
        c52250yW8.m3386i(u39.m82024h());
        se9.m85156d(C47595qf9.m17260d(c52250yW8), EnumC45136mW8.ON_DEVICE_OBJECT_LOAD);
    }
}
