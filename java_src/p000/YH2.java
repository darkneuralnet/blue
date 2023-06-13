package p000;

import android.content.Context;
import co.bird.android.model.DynamicLinkConfiguration;
/* renamed from: YH2 */
/* loaded from: classes4.dex */
public final class YH2 implements InterfaceC48812sj1<V74> {

    /* renamed from: a */
    public final VH2 f44934a;

    /* renamed from: b */
    public final Y94<InterfaceC35660Rh6> f44935b;

    /* renamed from: c */
    public final Y94<Context> f44936c;

    /* renamed from: d */
    public final Y94<DynamicLinkConfiguration> f44937d;

    /* renamed from: e */
    public final Y94<InterfaceC36119Tg6> f44938e;

    /* renamed from: f */
    public final Y94<AD0> f44939f;

    /* renamed from: g */
    public final Y94<BQ2> f44940g;

    /* renamed from: h */
    public final Y94<C36207Tq4> f44941h;

    /* renamed from: i */
    public final Y94<AbstractC34062Km1> f44942i;

    public YH2(VH2 vh2, Y94<InterfaceC35660Rh6> y94, Y94<Context> y942, Y94<DynamicLinkConfiguration> y943, Y94<InterfaceC36119Tg6> y944, Y94<AD0> y945, Y94<BQ2> y946, Y94<C36207Tq4> y947, Y94<AbstractC34062Km1> y948) {
        this.f44934a = vh2;
        this.f44935b = y94;
        this.f44936c = y942;
        this.f44937d = y943;
        this.f44938e = y944;
        this.f44939f = y945;
        this.f44940g = y946;
        this.f44941h = y947;
        this.f44942i = y948;
    }

    /* renamed from: a */
    public static YH2 m75281a(VH2 vh2, Y94<InterfaceC35660Rh6> y94, Y94<Context> y942, Y94<DynamicLinkConfiguration> y943, Y94<InterfaceC36119Tg6> y944, Y94<AD0> y945, Y94<BQ2> y946, Y94<C36207Tq4> y947, Y94<AbstractC34062Km1> y948) {
        return new YH2(vh2, y94, y942, y943, y944, y945, y946, y947, y948);
    }

    /* renamed from: c */
    public static V74 m75279c(VH2 vh2, InterfaceC35660Rh6 interfaceC35660Rh6, Context context, DynamicLinkConfiguration dynamicLinkConfiguration, InterfaceC36119Tg6 interfaceC36119Tg6, AD0 ad0, BQ2 bq2, C36207Tq4 c36207Tq4, AbstractC34062Km1 abstractC34062Km1) {
        return (V74) C51679xZ3.m5002e(vh2.m80069c(interfaceC35660Rh6, context, dynamicLinkConfiguration, interfaceC36119Tg6, ad0, bq2, c36207Tq4, abstractC34062Km1));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public V74 get() {
        return m75279c(this.f44934a, this.f44935b.get(), this.f44936c.get(), this.f44937d.get(), this.f44938e.get(), this.f44939f.get(), this.f44940g.get(), this.f44941h.get(), this.f44942i.get());
    }
}
