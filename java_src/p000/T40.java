package p000;

import android.content.Context;
/* renamed from: T40 */
/* loaded from: classes3.dex */
public final class T40 implements InterfaceC48812sj1<S40> {

    /* renamed from: a */
    public final Y94<Context> f34723a;

    public T40(Y94<Context> y94) {
        this.f34723a = y94;
    }

    /* renamed from: a */
    public static T40 m84381a(Y94<Context> y94) {
        return new T40(y94);
    }

    /* renamed from: c */
    public static S40 m84379c(Context context) {
        return new S40(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public S40 get() {
        return m84379c(this.f34723a.get());
    }
}
