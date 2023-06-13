package p000;

import android.graphics.Color;
import android.graphics.Rect;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p000.AbstractC39920dj2;
import p000.C41135fm2;
/* renamed from: im2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42914im2 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f87850a = AbstractC39920dj2.C19847a.m43839a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    public static final AbstractC39920dj2.C19847a f87851b = AbstractC39920dj2.C19847a.m43839a(DateTokenConverter.CONVERTER_KEY, C17296a.f69688o);

    /* renamed from: c */
    public static final AbstractC39920dj2.C19847a f87852c = AbstractC39920dj2.C19847a.m43839a("ty", "nm");

    /* renamed from: im2$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C23353a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f87853a;

        static {
            int[] iArr = new int[C41135fm2.EnumC20518b.values().length];
            f87853a = iArr;
            try {
                iArr[C41135fm2.EnumC20518b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87853a[C41135fm2.EnumC20518b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private C42914im2() {
    }

    /* renamed from: a */
    public static C41135fm2 m33501a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f;
        C41135fm2.EnumC20518b enumC20518b = C41135fm2.EnumC20518b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        abstractC39920dj2.mo2770c();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        C41135fm2.EnumC20518b enumC20518b2 = enumC20518b;
        C41135fm2.EnumC20517a enumC20517a = null;
        String str = null;
        C1920Ee c1920Ee = null;
        C0675Be c0675Be = null;
        C1109Ce c1109Ce = null;
        C27640qe c27640qe = null;
        C5309MY c5309my = null;
        U71 u71 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        long j2 = -1;
        float f6 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        float f7 = 0.0f;
        while (abstractC39920dj2.mo2767g()) {
            switch (abstractC39920dj2.mo2760s(f87850a)) {
                case 0:
                    str2 = abstractC39920dj2.mo2762n();
                    break;
                case 1:
                    j = abstractC39920dj2.mo2764l();
                    break;
                case 2:
                    str = abstractC39920dj2.mo2762n();
                    break;
                case 3:
                    int mo2764l = abstractC39920dj2.mo2764l();
                    enumC20517a = C41135fm2.EnumC20517a.UNKNOWN;
                    if (mo2764l >= enumC20517a.ordinal()) {
                        break;
                    } else {
                        enumC20517a = C41135fm2.EnumC20517a.values()[mo2764l];
                        break;
                    }
                case 4:
                    j2 = abstractC39920dj2.mo2764l();
                    break;
                case 5:
                    i = (int) (abstractC39920dj2.mo2764l() * C33095Gi6.m104867e());
                    break;
                case 6:
                    i2 = (int) (abstractC39920dj2.mo2764l() * C33095Gi6.m104867e());
                    break;
                case 7:
                    i3 = Color.parseColor(abstractC39920dj2.mo2762n());
                    break;
                case 8:
                    c1920Ee = C2373Fe.m106827g(abstractC39920dj2, c47924rD2);
                    break;
                case 9:
                    int mo2764l2 = abstractC39920dj2.mo2764l();
                    if (mo2764l2 >= C41135fm2.EnumC20518b.values().length) {
                        c47924rD2.m16223a("Unsupported matte type: " + mo2764l2);
                        break;
                    } else {
                        enumC20518b2 = C41135fm2.EnumC20518b.values()[mo2764l2];
                        int i4 = C23353a.f87853a[enumC20518b2.ordinal()];
                        if (i4 != 1) {
                            if (i4 == 2) {
                                c47924rD2.m16223a("Unsupported matte type: Luma Inverted");
                            }
                        } else {
                            c47924rD2.m16223a("Unsupported matte type: Luma");
                        }
                        c47924rD2.m16206r(1);
                        break;
                    }
                case 10:
                    abstractC39920dj2.mo2771b();
                    while (abstractC39920dj2.mo2767g()) {
                        arrayList3.add(C48005rM2.m16043a(abstractC39920dj2, c47924rD2));
                    }
                    c47924rD2.m16206r(arrayList3.size());
                    abstractC39920dj2.mo2769d();
                    break;
                case 11:
                    abstractC39920dj2.mo2771b();
                    while (abstractC39920dj2.mo2767g()) {
                        InterfaceC52637zA0 m116044a = AA0.m116044a(abstractC39920dj2, c47924rD2);
                        if (m116044a != null) {
                            arrayList4.add(m116044a);
                        }
                    }
                    abstractC39920dj2.mo2769d();
                    break;
                case 12:
                    abstractC39920dj2.mo2770c();
                    while (abstractC39920dj2.mo2767g()) {
                        int mo2760s = abstractC39920dj2.mo2760s(f87851b);
                        if (mo2760s != 0) {
                            if (mo2760s != 1) {
                                abstractC39920dj2.mo2759t();
                                abstractC39920dj2.mo2758u();
                            } else {
                                abstractC39920dj2.mo2771b();
                                if (abstractC39920dj2.mo2767g()) {
                                    c1109Ce = C1576De.m110073a(abstractC39920dj2, c47924rD2);
                                }
                                while (abstractC39920dj2.mo2767g()) {
                                    abstractC39920dj2.mo2758u();
                                }
                                abstractC39920dj2.mo2769d();
                            }
                        } else {
                            c0675Be = C3184He.m103628d(abstractC39920dj2, c47924rD2);
                        }
                    }
                    abstractC39920dj2.mo2768f();
                    break;
                case 13:
                    abstractC39920dj2.mo2771b();
                    ArrayList arrayList5 = new ArrayList();
                    while (abstractC39920dj2.mo2767g()) {
                        abstractC39920dj2.mo2770c();
                        while (abstractC39920dj2.mo2767g()) {
                            int mo2760s2 = abstractC39920dj2.mo2760s(f87852c);
                            if (mo2760s2 != 0) {
                                if (mo2760s2 != 1) {
                                    abstractC39920dj2.mo2759t();
                                    abstractC39920dj2.mo2758u();
                                } else {
                                    arrayList5.add(abstractC39920dj2.mo2762n());
                                }
                            } else {
                                int mo2764l3 = abstractC39920dj2.mo2764l();
                                if (mo2764l3 == 29) {
                                    c5309my = C5603NY.m93790b(abstractC39920dj2, c47924rD2);
                                } else if (mo2764l3 == 25) {
                                    u71 = new V71().m80358b(abstractC39920dj2, c47924rD2);
                                }
                            }
                        }
                        abstractC39920dj2.mo2768f();
                    }
                    abstractC39920dj2.mo2769d();
                    c47924rD2.m16223a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f6 = (float) abstractC39920dj2.mo2765k();
                    break;
                case 15:
                    f2 = (float) abstractC39920dj2.mo2765k();
                    break;
                case 16:
                    f3 = (float) (abstractC39920dj2.mo2765k() * C33095Gi6.m104867e());
                    break;
                case 17:
                    f4 = (float) (abstractC39920dj2.mo2765k() * C33095Gi6.m104867e());
                    break;
                case 18:
                    f7 = (float) abstractC39920dj2.mo2765k();
                    break;
                case 19:
                    f5 = (float) abstractC39920dj2.mo2765k();
                    break;
                case 20:
                    c27640qe = C3184He.m103626f(abstractC39920dj2, c47924rD2, false);
                    break;
                case 21:
                    str3 = abstractC39920dj2.mo2762n();
                    break;
                case 22:
                    z = abstractC39920dj2.mo2766i();
                    break;
                default:
                    abstractC39920dj2.mo2759t();
                    abstractC39920dj2.mo2758u();
                    break;
            }
        }
        abstractC39920dj2.mo2768f();
        ArrayList arrayList6 = new ArrayList();
        if (f7 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new C41125fl2(c47924rD2, valueOf, valueOf, null, 0.0f, Float.valueOf(f7)));
            f = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f = 0.0f;
        }
        if (f5 <= f) {
            f5 = c47924rD2.m16218f();
        }
        arrayList2.add(new C41125fl2(c47924rD2, valueOf2, valueOf2, null, f7, Float.valueOf(f5)));
        arrayList2.add(new C41125fl2(c47924rD2, valueOf, valueOf, null, f5, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            c47924rD2.m16223a("Convert your Illustrator layers to shape layers.");
        }
        return new C41135fm2(arrayList4, c47924rD2, str2, j, enumC20517a, j2, str, arrayList, c1920Ee, i, i2, i3, f6, f2, f3, f4, c0675Be, c1109Ce, arrayList2, enumC20518b2, c27640qe, z, c5309my, u71);
    }

    /* renamed from: b */
    public static C41135fm2 m33500b(C47924rD2 c47924rD2) {
        Rect m16222b = c47924rD2.m16222b();
        return new C41135fm2(Collections.emptyList(), c47924rD2, "__container", -1L, C41135fm2.EnumC20517a.PRE_COMP, -1L, null, Collections.emptyList(), new C1920Ee(), 0, 0, 0, 0.0f, 0.0f, m16222b.width(), m16222b.height(), null, null, Collections.emptyList(), C41135fm2.EnumC20518b.NONE, null, false, null, null);
    }
}
