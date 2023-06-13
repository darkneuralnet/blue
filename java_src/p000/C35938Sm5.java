package p000;

import android.content.Context;
/* renamed from: Sm5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35938Sm5 implements InterfaceC48220rj1<C35704Rm5> {

    /* renamed from: a */
    public final Y94<Context> f34252a;

    /* renamed from: b */
    public final Y94<String> f34253b;

    /* renamed from: c */
    public final Y94<Integer> f34254c;

    public C35938Sm5(Y94<Context> y94, Y94<String> y942, Y94<Integer> y943) {
        this.f34252a = y94;
        this.f34253b = y942;
        this.f34254c = y943;
    }

    /* renamed from: a */
    public static C35938Sm5 m84851a(Y94<Context> y94, Y94<String> y942, Y94<Integer> y943) {
        return new C35938Sm5(y94, y942, y943);
    }

    /* renamed from: c */
    public static C35704Rm5 m84849c(Context context, String str, int i) {
        return new C35704Rm5(context, str, i);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C35704Rm5 get() {
        return m84849c(this.f34252a.get(), this.f34253b.get(), this.f34254c.get().intValue());
    }
}
