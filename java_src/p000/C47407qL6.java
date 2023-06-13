package p000;

import android.content.Context;
import com.google.android.play.core.assetpacks.AssetPackExtractionService;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.concurrent.Executor;
/* renamed from: qL6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47407qL6 implements NJ6 {

    /* renamed from: A */
    public InterfaceC50972wM6<BinderC39088cL6> f105141A;

    /* renamed from: a */
    public final C50990wO6 f105142a;

    /* renamed from: b */
    public InterfaceC50972wM6<Context> f105143b;

    /* renamed from: c */
    public InterfaceC50972wM6<MM6> f105144c;

    /* renamed from: d */
    public InterfaceC50972wM6<HK6> f105145d;

    /* renamed from: e */
    public InterfaceC50972wM6<C51556xL6> f105146e;

    /* renamed from: f */
    public InterfaceC50972wM6<C49769uK6> f105147f;

    /* renamed from: g */
    public InterfaceC50972wM6<String> f105148g;

    /* renamed from: h */
    public InterfaceC50972wM6<InterfaceC40920fP6> f105149h;

    /* renamed from: i */
    public InterfaceC50972wM6<Executor> f105150i;

    /* renamed from: j */
    public InterfaceC50972wM6<C46823pM6> f105151j;

    /* renamed from: k */
    public InterfaceC50972wM6<BK6> f105152k;

    /* renamed from: l */
    public InterfaceC50972wM6<C48592sL6> f105153l;

    /* renamed from: m */
    public InterfaceC50972wM6<C39717dN6> f105154m;

    /* renamed from: n */
    public InterfaceC50972wM6<FM6> f105155n;

    /* renamed from: o */
    public InterfaceC50972wM6<PJ6> f105156o;

    /* renamed from: p */
    public InterfaceC50972wM6<KM6> f105157p;

    /* renamed from: q */
    public InterfaceC50972wM6<OM6> f105158q;

    /* renamed from: r */
    public InterfaceC50972wM6<C42070hL6> f105159r;

    /* renamed from: s */
    public InterfaceC50972wM6<C50379vM6> f105160s;

    /* renamed from: t */
    public InterfaceC50972wM6<C49778uL6> f105161t;

    /* renamed from: u */
    public InterfaceC50972wM6<C44442lL6> f105162u;

    /* renamed from: v */
    public InterfaceC50972wM6<Executor> f105163v;

    /* renamed from: w */
    public InterfaceC50972wM6<AM6> f105164w;

    /* renamed from: x */
    public InterfaceC50972wM6<SO6> f105165x;

    /* renamed from: y */
    public InterfaceC50972wM6<C39115cO6> f105166y;

    /* renamed from: z */
    public InterfaceC50972wM6<Object> f105167z;

    public /* synthetic */ C47407qL6(C50990wO6 c50990wO6) {
        C39735dP6 c39735dP6;
        C39735dP6 c39735dP62;
        C39735dP6 c39735dP63;
        C39735dP6 c39735dP64;
        this.f105142a = c50990wO6;
        TO6 to6 = new TO6(c50990wO6);
        this.f105143b = to6;
        InterfaceC50972wM6<MM6> m14272b = C48601sM6.m14272b(new GM6(to6, (char[]) null));
        this.f105144c = m14272b;
        this.f105145d = C48601sM6.m14272b(new FO6(this.f105143b, m14272b, (short[]) null));
        c39735dP6 = C52742zL6.f121120a;
        InterfaceC50972wM6<C51556xL6> m14272b2 = C48601sM6.m14272b(c39735dP6);
        this.f105146e = m14272b2;
        this.f105147f = C48601sM6.m14272b(new FO6(this.f105143b, m14272b2, (char[]) null));
        this.f105148g = C48601sM6.m14272b(new UO6(this.f105143b));
        this.f105149h = new C47416qM6();
        c39735dP62 = BO6.f2257a;
        InterfaceC50972wM6<Executor> m14272b3 = C48601sM6.m14272b(c39735dP62);
        this.f105150i = m14272b3;
        this.f105151j = C48601sM6.m14272b(new C48009rM6(this.f105145d, this.f105149h, this.f105146e, m14272b3));
        C47416qM6 c47416qM6 = new C47416qM6();
        this.f105152k = c47416qM6;
        this.f105153l = C48601sM6.m14272b(new C48009rM6(this.f105145d, this.f105149h, c47416qM6, this.f105146e, (byte[]) null));
        this.f105154m = C48601sM6.m14272b(new GM6(this.f105145d, (short[]) null));
        this.f105155n = C48601sM6.m14272b(new GM6(this.f105145d));
        InterfaceC50972wM6<PJ6> m14272b4 = C48601sM6.m14272b(C45637nM6.m23937b());
        this.f105156o = m14272b4;
        this.f105157p = C48601sM6.m14272b(new LM6(this.f105145d, this.f105149h, this.f105151j, this.f105150i, this.f105146e, m14272b4));
        this.f105158q = C48601sM6.m14272b(new FO6(this.f105145d, this.f105149h, (int[]) null));
        InterfaceC50972wM6<C42070hL6> m14272b5 = C48601sM6.m14272b(new GM6(this.f105149h, (byte[]) null));
        this.f105159r = m14272b5;
        InterfaceC50972wM6<C50379vM6> m14272b6 = C48601sM6.m14272b(new C48009rM6(this.f105151j, this.f105145d, m14272b5, this.f105156o, (char[]) null));
        this.f105160s = m14272b6;
        this.f105161t = C48601sM6.m14272b(new C50370vL6(this.f105151j, this.f105149h, this.f105153l, this.f105154m, this.f105155n, this.f105157p, this.f105158q, m14272b6));
        c39735dP63 = C45035mL6.f97833a;
        this.f105162u = C48601sM6.m14272b(c39735dP63);
        c39735dP64 = C37938aP6.f50438a;
        InterfaceC50972wM6<Executor> m14272b7 = C48601sM6.m14272b(c39735dP64);
        this.f105163v = m14272b7;
        C47416qM6.m17586b(this.f105152k, C48601sM6.m14272b(new C50370vL6(this.f105143b, this.f105151j, this.f105161t, this.f105149h, this.f105146e, this.f105162u, this.f105150i, m14272b7, null)));
        InterfaceC50972wM6<AM6> m14272b8 = C48601sM6.m14272b(new LM6(this.f105148g, this.f105152k, this.f105146e, this.f105143b, this.f105144c, this.f105150i, null));
        this.f105164w = m14272b8;
        C47416qM6.m17586b(this.f105149h, C48601sM6.m14272b(new QO6(this.f105143b, this.f105147f, m14272b8)));
        InterfaceC50972wM6<SO6> m14272b9 = C48601sM6.m14272b(LN6.m96974b(this.f105143b));
        this.f105165x = m14272b9;
        InterfaceC50972wM6<C39115cO6> m14272b10 = C48601sM6.m14272b(new C43876kO6(this.f105145d, this.f105149h, this.f105152k, m14272b9, this.f105151j, this.f105146e, this.f105162u, this.f105150i, this.f105156o));
        this.f105166y = m14272b10;
        this.f105167z = C48601sM6.m14272b(new FO6(m14272b10, this.f105143b));
        this.f105141A = C48601sM6.m14272b(new FO6(this.f105143b, this.f105145d, (byte[]) null));
    }

    @Override // p000.NJ6
    /* renamed from: a */
    public final void mo17604a(ExtractionForegroundService extractionForegroundService) {
        extractionForegroundService.f73703c = TO6.m83697c(this.f105142a);
        extractionForegroundService.f73704d = this.f105166y.mo6967a();
    }

    @Override // p000.NJ6
    /* renamed from: b */
    public final void mo17603b(AssetPackExtractionService assetPackExtractionService) {
        assetPackExtractionService.f73701b = this.f105141A.mo6967a();
    }
}
