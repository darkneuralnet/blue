package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p000.InterfaceC48496sB0;
/* renamed from: qE1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47339qE1 extends InterfaceC48496sB0.AbstractC28229a {

    /* renamed from: a */
    public final C46153oE1 f104948a;

    public C47339qE1(C46153oE1 c46153oE1) {
        this.f104948a = c46153oE1;
    }

    /* renamed from: f */
    public static C47339qE1 m17874f(C46153oE1 c46153oE1) {
        if (c46153oE1 != null) {
            return new C47339qE1(c46153oE1);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // p000.InterfaceC48496sB0.AbstractC28229a
    /* renamed from: c */
    public InterfaceC48496sB0<?, RequestBody> mo14588c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, MN4 mn4) {
        return new C48524sE1(this.f104948a, this.f104948a.m21553p(C32798Fb6.get(type)));
    }

    @Override // p000.InterfaceC48496sB0.AbstractC28229a
    /* renamed from: d */
    public InterfaceC48496sB0<ResponseBody, ?> mo14587d(Type type, Annotation[] annotationArr, MN4 mn4) {
        return new C49117tE1(this.f104948a, this.f104948a.m21553p(C32798Fb6.get(type)));
    }
}
