package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: rp0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48279rp0 {

    /* renamed from: b */
    public static int f107676b;

    /* renamed from: c */
    public static int f107677c;

    /* renamed from: d */
    public static int f107678d;

    /* renamed from: e */
    public static int f107679e;

    /* renamed from: f */
    public static int f107680f;

    /* renamed from: a */
    public C32495Du0 f107681a;

    /* renamed from: rp0$a */
    /* loaded from: classes5.dex */
    public class C28007a implements InterfaceC33197Gu0 {

        /* renamed from: a */
        public final /* synthetic */ List f107682a;

        /* renamed from: b */
        public final /* synthetic */ int f107683b;

        public C28007a(List list, int i) {
            this.f107682a = list;
            this.f107683b = i;
        }

        @Override // p000.InterfaceC33197Gu0
        /* renamed from: a */
        public AbstractC32963Fu0 mo15319a(Random random) {
            return new C5580NT((Bitmap) this.f107682a.get(random.nextInt(this.f107683b)));
        }
    }

    public C48279rp0(ViewGroup viewGroup) {
        m15324b(viewGroup);
    }

    /* renamed from: b */
    public static void m15324b(ViewGroup viewGroup) {
        if (f107676b == 0) {
            Resources resources = viewGroup.getResources();
            f107676b = resources.getDimensionPixelSize(C34938Of4.default_confetti_size);
            f107677c = resources.getDimensionPixelOffset(C34938Of4.default_velocity_slow);
            f107678d = resources.getDimensionPixelOffset(C34938Of4.default_velocity_normal);
            f107679e = resources.getDimensionPixelOffset(C34938Of4.default_velocity_fast);
            f107680f = resources.getDimensionPixelOffset(C34938Of4.default_explosion_radius);
        }
    }

    /* renamed from: e */
    public static C48279rp0 m15321e(ViewGroup viewGroup, int[] iArr) {
        C48279rp0 c48279rp0 = new C48279rp0(viewGroup);
        c48279rp0.m15325a(viewGroup, new C32729Eu0(0, -f107676b, viewGroup.getWidth(), -f107676b), iArr);
        return c48279rp0;
    }

    /* renamed from: a */
    public final void m15325a(ViewGroup viewGroup, C32729Eu0 c32729Eu0, int[] iArr) {
        this.f107681a = new C32495Du0(viewGroup.getContext(), m15323c(iArr), c32729Eu0, viewGroup).m109777v(0.0f, f107677c).m109776w(f107678d, f107677c).m109782q(180, 180).m109780s(360.0f, 180.0f).m109779t(360.0f);
    }

    /* renamed from: c */
    public final InterfaceC33197Gu0 m15323c(int[] iArr) {
        List<Bitmap> m93548d = C34733Ni6.m93548d(iArr, f107676b);
        return new C28007a(m93548d, m93548d.size());
    }

    /* renamed from: d */
    public C32495Du0 m15322d() {
        return this.f107681a.m109781r(0).m109784o(LongCompanionObject.MAX_VALUE).m109783p(50.0f).m109791h();
    }

    /* renamed from: f */
    public C32495Du0 m15320f(long j) {
        return this.f107681a.m109781r(0).m109784o(j).m109783p(50.0f).m109791h();
    }
}
