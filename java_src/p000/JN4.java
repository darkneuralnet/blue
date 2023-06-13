package p000;

import co.bird.android.widget.RetakeablePhotoView;
/* renamed from: JN4 */
/* loaded from: classes3.dex */
public final class JN4 implements InterfaceC48812sj1<IN4> {

    /* renamed from: a */
    public final Y94<RetakeablePhotoView> f17457a;

    public JN4(Y94<RetakeablePhotoView> y94) {
        this.f17457a = y94;
    }

    /* renamed from: a */
    public static JN4 m100592a(Y94<RetakeablePhotoView> y94) {
        return new JN4(y94);
    }

    /* renamed from: c */
    public static IN4 m100590c(RetakeablePhotoView retakeablePhotoView) {
        return new IN4(retakeablePhotoView);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public IN4 get() {
        return m100590c(this.f17457a.get());
    }
}
