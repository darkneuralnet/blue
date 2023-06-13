package p000;

import android.content.DialogInterface;
import co.bird.android.core.base.BaseCoreActivity;
/* renamed from: Sx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36032Sx0 implements InterfaceC48812sj1<C35798Rx0> {

    /* renamed from: a */
    public final Y94<BaseCoreActivity> f34520a;

    /* renamed from: b */
    public final Y94<C5029LZ> f34521b;

    /* renamed from: c */
    public final Y94<DialogInterface> f34522c;

    public C36032Sx0(Y94<BaseCoreActivity> y94, Y94<C5029LZ> y942, Y94<DialogInterface> y943) {
        this.f34520a = y94;
        this.f34521b = y942;
        this.f34522c = y943;
    }

    /* renamed from: a */
    public static C36032Sx0 m84583a(Y94<BaseCoreActivity> y94, Y94<C5029LZ> y942, Y94<DialogInterface> y943) {
        return new C36032Sx0(y94, y942, y943);
    }

    /* renamed from: c */
    public static C35798Rx0 m84581c(BaseCoreActivity baseCoreActivity, C5029LZ c5029lz, DialogInterface dialogInterface) {
        return new C35798Rx0(baseCoreActivity, c5029lz, dialogInterface);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C35798Rx0 get() {
        return m84581c(this.f34520a.get(), this.f34521b.get(), this.f34522c.get());
    }
}
