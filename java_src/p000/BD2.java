package p000;

import android.graphics.Rect;
import co.bird.android.model.AssetTaskKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC39920dj2;
import p000.C41135fm2;
/* renamed from: BD2 */
/* loaded from: classes2.dex */
public class BD2 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f2041a = AbstractC39920dj2.C19847a.m43839a("w", "h", "ip", "op", "fr", "v", "layers", AssetTaskKt.ASSET_PATH, "fonts", "chars", "markers");

    /* renamed from: b */
    public static AbstractC39920dj2.C19847a f2042b = AbstractC39920dj2.C19847a.m43839a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c */
    public static final AbstractC39920dj2.C19847a f2043c = AbstractC39920dj2.C19847a.m43839a("list");

    /* renamed from: d */
    public static final AbstractC39920dj2.C19847a f2044d = AbstractC39920dj2.C19847a.m43839a("cm", "tm", "dr");

    /* renamed from: a */
    public static C47924rD2 m114211a(AbstractC39920dj2 abstractC39920dj2) throws IOException {
        HashMap hashMap;
        ArrayList arrayList;
        AbstractC39920dj2 abstractC39920dj22 = abstractC39920dj2;
        float m104867e = C33095Gi6.m104867e();
        C46602oz2<C41135fm2> c46602oz2 = new C46602oz2<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        LN5<C43013iw1> ln5 = new LN5<>();
        C47924rD2 c47924rD2 = new C47924rD2();
        abstractC39920dj2.mo2770c();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (abstractC39920dj2.mo2767g()) {
            switch (abstractC39920dj22.mo2760s(f2041a)) {
                case 0:
                    i = abstractC39920dj2.mo2764l();
                    continue;
                    abstractC39920dj22 = abstractC39920dj2;
                case 1:
                    i2 = abstractC39920dj2.mo2764l();
                    continue;
                    abstractC39920dj22 = abstractC39920dj2;
                case 2:
                    f = (float) abstractC39920dj2.mo2765k();
                    continue;
                    abstractC39920dj22 = abstractC39920dj2;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) abstractC39920dj2.mo2765k()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) abstractC39920dj2.mo2765k();
                    break;
                case 5:
                    String[] split = abstractC39920dj2.mo2762n().split("\\.");
                    if (!C33095Gi6.m104862j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        c47924rD2.m16223a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    m114207e(abstractC39920dj22, c47924rD2, arrayList2, c46602oz2);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 7:
                    m114210b(abstractC39920dj22, c47924rD2, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 8:
                    m114208d(abstractC39920dj22, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 9:
                    m114209c(abstractC39920dj22, c47924rD2, ln5);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 10:
                    m114206f(abstractC39920dj22, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    abstractC39920dj2.mo2759t();
                    abstractC39920dj2.mo2758u();
                    break;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            abstractC39920dj22 = abstractC39920dj2;
        }
        c47924rD2.m16205s(new Rect(0, 0, (int) (i * m104867e), (int) (i2 * m104867e)), f, f2, f3, arrayList2, c46602oz2, hashMap2, hashMap3, ln5, hashMap4, arrayList3);
        return c47924rD2;
    }

    /* renamed from: b */
    public static void m114210b(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2, Map<String, List<C41135fm2>> map, Map<String, UD2> map2) throws IOException {
        abstractC39920dj2.mo2771b();
        while (abstractC39920dj2.mo2767g()) {
            ArrayList arrayList = new ArrayList();
            C46602oz2 c46602oz2 = new C46602oz2();
            abstractC39920dj2.mo2770c();
            int i = 0;
            int i2 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (abstractC39920dj2.mo2767g()) {
                int mo2760s = abstractC39920dj2.mo2760s(f2042b);
                if (mo2760s != 0) {
                    if (mo2760s != 1) {
                        if (mo2760s != 2) {
                            if (mo2760s != 3) {
                                if (mo2760s != 4) {
                                    if (mo2760s != 5) {
                                        abstractC39920dj2.mo2759t();
                                        abstractC39920dj2.mo2758u();
                                    } else {
                                        str3 = abstractC39920dj2.mo2762n();
                                    }
                                } else {
                                    str2 = abstractC39920dj2.mo2762n();
                                }
                            } else {
                                i2 = abstractC39920dj2.mo2764l();
                            }
                        } else {
                            i = abstractC39920dj2.mo2764l();
                        }
                    } else {
                        abstractC39920dj2.mo2771b();
                        while (abstractC39920dj2.mo2767g()) {
                            C41135fm2 m33501a = C42914im2.m33501a(abstractC39920dj2, c47924rD2);
                            c46602oz2.m20191n(m33501a.m40874d(), m33501a);
                            arrayList.add(m33501a);
                        }
                        abstractC39920dj2.mo2769d();
                    }
                } else {
                    str = abstractC39920dj2.mo2762n();
                }
            }
            abstractC39920dj2.mo2768f();
            if (str2 != null) {
                UD2 ud2 = new UD2(i, i2, str, str2, str3);
                map2.put(ud2.m81816d(), ud2);
            } else {
                map.put(str, arrayList);
            }
        }
        abstractC39920dj2.mo2769d();
    }

    /* renamed from: c */
    public static void m114209c(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2, LN5<C43013iw1> ln5) throws IOException {
        abstractC39920dj2.mo2771b();
        while (abstractC39920dj2.mo2767g()) {
            C43013iw1 m29722a = C43606jw1.m29722a(abstractC39920dj2, c47924rD2);
            ln5.m96978p(m29722a.hashCode(), m29722a);
        }
        abstractC39920dj2.mo2769d();
    }

    /* renamed from: d */
    public static void m114208d(AbstractC39920dj2 abstractC39920dj2, Map<String, C41234fw1> map) throws IOException {
        abstractC39920dj2.mo2770c();
        while (abstractC39920dj2.mo2767g()) {
            if (abstractC39920dj2.mo2760s(f2043c) != 0) {
                abstractC39920dj2.mo2759t();
                abstractC39920dj2.mo2758u();
            } else {
                abstractC39920dj2.mo2771b();
                while (abstractC39920dj2.mo2767g()) {
                    C41234fw1 m6089a = C51313ww1.m6089a(abstractC39920dj2);
                    map.put(m6089a.m40435b(), m6089a);
                }
                abstractC39920dj2.mo2769d();
            }
        }
        abstractC39920dj2.mo2768f();
    }

    /* renamed from: e */
    public static void m114207e(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2, List<C41135fm2> list, C46602oz2<C41135fm2> c46602oz2) throws IOException {
        abstractC39920dj2.mo2771b();
        int i = 0;
        while (abstractC39920dj2.mo2767g()) {
            C41135fm2 m33501a = C42914im2.m33501a(abstractC39920dj2, c47924rD2);
            if (m33501a.m40872f() == C41135fm2.EnumC20517a.IMAGE) {
                i++;
            }
            list.add(m33501a);
            c46602oz2.m20191n(m33501a.m40874d(), m33501a);
            if (i > 4) {
                C32524Dx2.m109586c("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        abstractC39920dj2.mo2769d();
    }

    /* renamed from: f */
    public static void m114206f(AbstractC39920dj2 abstractC39920dj2, List<C42075hM2> list) throws IOException {
        abstractC39920dj2.mo2771b();
        while (abstractC39920dj2.mo2767g()) {
            abstractC39920dj2.mo2770c();
            float f = 0.0f;
            String str = null;
            float f2 = 0.0f;
            while (abstractC39920dj2.mo2767g()) {
                int mo2760s = abstractC39920dj2.mo2760s(f2044d);
                if (mo2760s != 0) {
                    if (mo2760s != 1) {
                        if (mo2760s != 2) {
                            abstractC39920dj2.mo2759t();
                            abstractC39920dj2.mo2758u();
                        } else {
                            f2 = (float) abstractC39920dj2.mo2765k();
                        }
                    } else {
                        f = (float) abstractC39920dj2.mo2765k();
                    }
                } else {
                    str = abstractC39920dj2.mo2762n();
                }
            }
            abstractC39920dj2.mo2768f();
            list.add(new C42075hM2(str, f, f2));
        }
        abstractC39920dj2.mo2769d();
    }
}
