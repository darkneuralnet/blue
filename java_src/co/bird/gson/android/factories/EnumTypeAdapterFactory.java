package co.bird.gson.android.factories;
/* loaded from: classes4.dex */
public class EnumTypeAdapterFactory implements InterfaceC32096Cb6 {
    @Override // p000.InterfaceC32096Cb6
    /* renamed from: d */
    public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
        if (c46153oE1 == null || c32798Fb6 == null) {
            return null;
        }
        Class<? super T> rawType = c32798Fb6.getRawType();
        if (!rawType.isEnum()) {
            return null;
        }
        return new C46994pf1(rawType, "unknown");
    }
}
