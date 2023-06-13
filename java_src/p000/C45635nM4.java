package p000;

import com.google.p034ar.sceneform.rendering.C18035b;
import com.google.p034ar.sceneform.rendering.C18053i;
import com.google.p034ar.sceneform.rendering.Texture;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: nM4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45635nM4 {

    /* renamed from: f */
    public static C45635nM4 f99819f;

    /* renamed from: a */
    public final ArrayList<InterfaceC43263jM4> f99820a = new ArrayList<>();

    /* renamed from: b */
    public final C48007rM4<Texture> f99821b;

    /* renamed from: c */
    public final C48007rM4<Object> f99822c;

    /* renamed from: d */
    public final C48007rM4<C18035b> f99823d;

    /* renamed from: e */
    public final C48007rM4<C18053i> f99824e;

    private C45635nM4() {
        C48007rM4<Texture> c48007rM4 = new C48007rM4<>();
        this.f99821b = c48007rM4;
        C48007rM4<Object> c48007rM42 = new C48007rM4<>();
        this.f99822c = c48007rM42;
        C48007rM4<C18035b> c48007rM43 = new C48007rM4<>();
        this.f99823d = c48007rM43;
        this.f99824e = new C48007rM4<>();
        m23942a(c48007rM4);
        m23942a(c48007rM42);
        m23942a(c48007rM43);
        m23941b();
    }

    /* renamed from: d */
    public static C45635nM4 m23939d() {
        if (f99819f == null) {
            f99819f = new C45635nM4();
        }
        return f99819f;
    }

    /* renamed from: a */
    public void m23942a(InterfaceC43263jM4 interfaceC43263jM4) {
        this.f99820a.add(interfaceC43263jM4);
    }

    /* renamed from: b */
    public final void m23941b() {
        m23942a(this.f99824e);
    }

    /* renamed from: c */
    public void m23940c() {
        Iterator<InterfaceC43263jM4> it = this.f99820a.iterator();
        while (it.hasNext()) {
            it.next().mo16042a();
        }
    }

    /* renamed from: e */
    public C48007rM4<C18035b> m23938e() {
        return this.f99823d;
    }
}
