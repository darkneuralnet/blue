package p000;

import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: aY0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38013aY0 extends AbstractC41105fj2<InterfaceC34009Kg2> {
    public C38013aY0(C40512ej2 c40512ej2) {
        super(c40512ej2);
    }

    @Override // p000.AbstractC41105fj2
    /* renamed from: a */
    public void mo40997a(Object obj, Object obj2) {
        ((C33307Hg2) obj).add(obj2);
    }

    @Override // p000.AbstractC41105fj2
    /* renamed from: c */
    public Object mo40996c() {
        return new C33307Hg2();
    }

    @Override // p000.AbstractC41105fj2
    /* renamed from: d */
    public Object mo40995d() {
        return new LinkedHashMap();
    }

    @Override // p000.AbstractC41105fj2
    /* renamed from: e */
    public void mo40994e(Object obj, String str, Object obj2) {
        ((Map) obj).put(str, obj2);
    }

    @Override // p000.AbstractC41105fj2
    /* renamed from: f */
    public AbstractC41105fj2<InterfaceC34009Kg2> mo40993f(String str) {
        return this.f80494a.f78738c;
    }

    @Override // p000.AbstractC41105fj2
    /* renamed from: g */
    public AbstractC41105fj2<InterfaceC34009Kg2> mo40992g(String str) {
        return this.f80494a.f78738c;
    }
}
