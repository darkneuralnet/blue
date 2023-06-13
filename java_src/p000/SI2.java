package p000;

import android.content.Context;
/* renamed from: SI2 */
/* loaded from: classes4.dex */
public final class SI2 implements InterfaceC48812sj1<FO2> {

    /* renamed from: a */
    public final VH2 f33435a;

    /* renamed from: b */
    public final Y94<Context> f33436b;

    /* renamed from: c */
    public final Y94<InterfaceC8601VK> f33437c;

    /* renamed from: d */
    public final Y94<InterfaceC43381jZ5> f33438d;

    /* renamed from: e */
    public final Y94<I32> f33439e;

    /* renamed from: f */
    public final Y94<InterfaceC33939Jy4> f33440f;

    /* renamed from: g */
    public final Y94<InterfaceC40476ef6> f33441g;

    public SI2(VH2 vh2, Y94<Context> y94, Y94<InterfaceC8601VK> y942, Y94<InterfaceC43381jZ5> y943, Y94<I32> y944, Y94<InterfaceC33939Jy4> y945, Y94<InterfaceC40476ef6> y946) {
        this.f33435a = vh2;
        this.f33436b = y94;
        this.f33437c = y942;
        this.f33438d = y943;
        this.f33439e = y944;
        this.f33440f = y945;
        this.f33441g = y946;
    }

    /* renamed from: a */
    public static SI2 m85771a(VH2 vh2, Y94<Context> y94, Y94<InterfaceC8601VK> y942, Y94<InterfaceC43381jZ5> y943, Y94<I32> y944, Y94<InterfaceC33939Jy4> y945, Y94<InterfaceC40476ef6> y946) {
        return new SI2(vh2, y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static FO2 m85769c(VH2 vh2, Context context, InterfaceC8601VK interfaceC8601VK, InterfaceC43381jZ5 interfaceC43381jZ5, I32 i32, InterfaceC33939Jy4 interfaceC33939Jy4, InterfaceC40476ef6 interfaceC40476ef6) {
        return (FO2) C51679xZ3.m5002e(vh2.m80076X(context, interfaceC8601VK, interfaceC43381jZ5, i32, interfaceC33939Jy4, interfaceC40476ef6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public FO2 get() {
        return m85769c(this.f33435a, this.f33436b.get(), this.f33437c.get(), this.f33438d.get(), this.f33439e.get(), this.f33440f.get(), this.f33441g.get());
    }
}
