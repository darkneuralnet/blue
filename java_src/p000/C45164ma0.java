package p000;

import android.content.Context;
import androidx.camera.core.impl.C11192d;
import androidx.camera.core.impl.C11209m;
import androidx.camera.core.impl.C11210n;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11206k;
import androidx.camera.core.impl.InterfaceC11225s;
import p000.InterfaceC36578Vf6;
/* renamed from: ma0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45164ma0 implements InterfaceC36578Vf6 {

    /* renamed from: b */
    public final C42509i51 f98349b;

    /* renamed from: ma0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C26117a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f98350a;

        static {
            int[] iArr = new int[InterfaceC36578Vf6.EnumC8718b.values().length];
            f98350a = iArr;
            try {
                iArr[InterfaceC36578Vf6.EnumC8718b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98350a[InterfaceC36578Vf6.EnumC8718b.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98350a[InterfaceC36578Vf6.EnumC8718b.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98350a[InterfaceC36578Vf6.EnumC8718b.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C45164ma0(Context context) {
        this.f98349b = C42509i51.m34487b(context);
    }

    @Override // p000.InterfaceC36578Vf6
    /* renamed from: a */
    public InterfaceC11197f mo25424a(InterfaceC36578Vf6.EnumC8718b enumC8718b, int i) {
        int i2;
        C11192d.InterfaceC11194b interfaceC11194b;
        C11209m m69372V = C11209m.m69372V();
        C11213q.C11215b c11215b = new C11213q.C11215b();
        int[] iArr = C26117a.f98350a;
        int i3 = iArr[enumC8718b.ordinal()];
        int i4 = 5;
        if (i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                if (i3 == 4) {
                    c11215b.m69323u(3);
                }
            } else {
                c11215b.m69323u(1);
            }
        } else {
            if (i == 2) {
                i2 = 5;
            } else {
                i2 = 1;
            }
            c11215b.m69323u(i2);
        }
        m69372V.mo69373C(InterfaceC11225s.f52672v, c11215b.m69331m());
        m69372V.mo69373C(InterfaceC11225s.f52674x, C44571la0.f96336a);
        C11192d.C11193a c11193a = new C11192d.C11193a();
        int i5 = iArr[enumC8718b.ordinal()];
        if (i5 != 1) {
            if (i5 != 2 && i5 != 3) {
                if (i5 == 4) {
                    c11193a.m69425s(3);
                }
            } else {
                c11193a.m69425s(1);
            }
        } else {
            if (i != 2) {
                i4 = 2;
            }
            c11193a.m69425s(i4);
        }
        m69372V.mo69373C(InterfaceC11225s.f52673w, c11193a.m69436h());
        InterfaceC11197f.AbstractC11198a<C11192d.InterfaceC11194b> abstractC11198a = InterfaceC11225s.f52675y;
        if (enumC8718b == InterfaceC36578Vf6.EnumC8718b.IMAGE_CAPTURE) {
            interfaceC11194b = C42766iX1.f87445c;
        } else {
            interfaceC11194b = L90.f20811a;
        }
        m69372V.mo69373C(abstractC11198a, interfaceC11194b);
        if (enumC8718b == InterfaceC36578Vf6.EnumC8718b.PREVIEW) {
            m69372V.mo69373C(InterfaceC11206k.f52632r, this.f98349b.m34485d());
        }
        m69372V.mo69373C(InterfaceC11206k.f52627m, Integer.valueOf(this.f98349b.m34486c().getRotation()));
        if (enumC8718b == InterfaceC36578Vf6.EnumC8718b.VIDEO_CAPTURE) {
            m69372V.mo69373C(InterfaceC11225s.f52670C, Boolean.TRUE);
        }
        return C11210n.m69366T(m69372V);
    }
}
