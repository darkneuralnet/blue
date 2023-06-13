package p000;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000.TW0;
/* renamed from: pE1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46746pE1 {

    /* renamed from: a */
    public Excluder f103284a;

    /* renamed from: b */
    public EnumC45416mz2 f103285b;

    /* renamed from: c */
    public InterfaceC36852Wk1 f103286c;

    /* renamed from: d */
    public final Map<Type, InterfaceC38342b52<?>> f103287d;

    /* renamed from: e */
    public final List<InterfaceC32096Cb6> f103288e;

    /* renamed from: f */
    public final List<InterfaceC32096Cb6> f103289f;

    /* renamed from: g */
    public boolean f103290g;

    /* renamed from: h */
    public String f103291h;

    /* renamed from: i */
    public int f103292i;

    /* renamed from: j */
    public int f103293j;

    /* renamed from: k */
    public boolean f103294k;

    /* renamed from: l */
    public boolean f103295l;

    /* renamed from: m */
    public boolean f103296m;

    /* renamed from: n */
    public boolean f103297n;

    /* renamed from: o */
    public boolean f103298o;

    /* renamed from: p */
    public boolean f103299p;

    /* renamed from: q */
    public boolean f103300q;

    /* renamed from: r */
    public InterfaceC39550d56 f103301r;

    /* renamed from: s */
    public InterfaceC39550d56 f103302s;

    /* renamed from: t */
    public final LinkedList<InterfaceC46544ot4> f103303t;

    public C46746pE1() {
        this.f103284a = Excluder.f74502h;
        this.f103285b = EnumC45416mz2.f99191b;
        this.f103286c = EnumC36618Vk1.f39675b;
        this.f103287d = new HashMap();
        this.f103288e = new ArrayList();
        this.f103289f = new ArrayList();
        this.f103290g = false;
        this.f103291h = C46153oE1.f101626z;
        this.f103292i = 2;
        this.f103293j = 2;
        this.f103294k = false;
        this.f103295l = false;
        this.f103296m = true;
        this.f103297n = false;
        this.f103298o = false;
        this.f103299p = false;
        this.f103300q = true;
        this.f103301r = C46153oE1.f101624B;
        this.f103302s = C46153oE1.f101625C;
        this.f103303t = new LinkedList<>();
    }

    /* renamed from: a */
    public final void m19809a(String str, int i, int i2, List<InterfaceC32096Cb6> list) {
        InterfaceC32096Cb6 interfaceC32096Cb6;
        InterfaceC32096Cb6 interfaceC32096Cb62;
        boolean z = C44468lO5.f95983a;
        InterfaceC32096Cb6 interfaceC32096Cb63 = null;
        if (str != null && !str.trim().isEmpty()) {
            interfaceC32096Cb6 = TW0.AbstractC7864b.f35589b.m83492b(str);
            if (z) {
                interfaceC32096Cb63 = C44468lO5.f95985c.m83492b(str);
                interfaceC32096Cb62 = C44468lO5.f95984b.m83492b(str);
            }
            interfaceC32096Cb62 = null;
        } else if (i != 2 && i2 != 2) {
            InterfaceC32096Cb6 m83493a = TW0.AbstractC7864b.f35589b.m83493a(i, i2);
            if (z) {
                interfaceC32096Cb63 = C44468lO5.f95985c.m83493a(i, i2);
                InterfaceC32096Cb6 m83493a2 = C44468lO5.f95984b.m83493a(i, i2);
                interfaceC32096Cb6 = m83493a;
                interfaceC32096Cb62 = m83493a2;
            } else {
                interfaceC32096Cb6 = m83493a;
                interfaceC32096Cb62 = null;
            }
        } else {
            return;
        }
        list.add(interfaceC32096Cb6);
        if (z) {
            list.add(interfaceC32096Cb63);
            list.add(interfaceC32096Cb62);
        }
    }

    /* renamed from: b */
    public C46153oE1 m19808b() {
        List<InterfaceC32096Cb6> arrayList = new ArrayList<>(this.f103288e.size() + this.f103289f.size() + 3);
        arrayList.addAll(this.f103288e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f103289f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        m19809a(this.f103291h, this.f103292i, this.f103293j, arrayList);
        return new C46153oE1(this.f103284a, this.f103286c, new HashMap(this.f103287d), this.f103290g, this.f103294k, this.f103298o, this.f103296m, this.f103297n, this.f103299p, this.f103295l, this.f103300q, this.f103285b, this.f103291h, this.f103292i, this.f103293j, new ArrayList(this.f103288e), new ArrayList(this.f103289f), arrayList, this.f103301r, this.f103302s, new ArrayList(this.f103303t));
    }

    /* renamed from: c */
    public C46746pE1 m19807c() {
        this.f103296m = false;
        return this;
    }

    /* renamed from: d */
    public C46746pE1 m19806d() {
        this.f103294k = true;
        return this;
    }

    /* renamed from: e */
    public C46746pE1 m19805e(int... iArr) {
        Objects.requireNonNull(iArr);
        this.f103284a = this.f103284a.m46878q(iArr);
        return this;
    }

    /* renamed from: f */
    public C46746pE1 m19804f(Type type, Object obj) {
        boolean z;
        Objects.requireNonNull(type);
        boolean z2 = obj instanceof InterfaceC44663lj2;
        if (!z2 && !(obj instanceof InterfaceC50581vi2) && !(obj instanceof InterfaceC38342b52) && !(obj instanceof AbstractC31862Bb6)) {
            z = false;
        } else {
            z = true;
        }
        C10483a.m72139a(z);
        if (obj instanceof InterfaceC38342b52) {
            this.f103287d.put(type, (InterfaceC38342b52) obj);
        }
        if (z2 || (obj instanceof InterfaceC50581vi2)) {
            this.f103288e.add(TreeTypeAdapter.m46841g(C32798Fb6.get(type), obj));
        }
        if (obj instanceof AbstractC31862Bb6) {
            this.f103288e.add(TypeAdapters.m46840a(C32798Fb6.get(type), (AbstractC31862Bb6) obj));
        }
        return this;
    }

    /* renamed from: g */
    public C46746pE1 m19803g(InterfaceC32096Cb6 interfaceC32096Cb6) {
        Objects.requireNonNull(interfaceC32096Cb6);
        this.f103288e.add(interfaceC32096Cb6);
        return this;
    }

    /* renamed from: h */
    public C46746pE1 m19802h() {
        this.f103290g = true;
        return this;
    }

    /* renamed from: i */
    public C46746pE1 m19801i(EnumC36618Vk1 enumC36618Vk1) {
        return m19800j(enumC36618Vk1);
    }

    /* renamed from: j */
    public C46746pE1 m19800j(InterfaceC36852Wk1 interfaceC36852Wk1) {
        Objects.requireNonNull(interfaceC36852Wk1);
        this.f103286c = interfaceC36852Wk1;
        return this;
    }

    /* renamed from: k */
    public C46746pE1 m19799k() {
        this.f103299p = true;
        return this;
    }

    /* renamed from: l */
    public C46746pE1 m19798l() {
        this.f103297n = true;
        return this;
    }

    public C46746pE1(C46153oE1 c46153oE1) {
        this.f103284a = Excluder.f74502h;
        this.f103285b = EnumC45416mz2.f99191b;
        this.f103286c = EnumC36618Vk1.f39675b;
        HashMap hashMap = new HashMap();
        this.f103287d = hashMap;
        ArrayList arrayList = new ArrayList();
        this.f103288e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f103289f = arrayList2;
        this.f103290g = false;
        this.f103291h = C46153oE1.f101626z;
        this.f103292i = 2;
        this.f103293j = 2;
        this.f103294k = false;
        this.f103295l = false;
        this.f103296m = true;
        this.f103297n = false;
        this.f103298o = false;
        this.f103299p = false;
        this.f103300q = true;
        this.f103301r = C46153oE1.f101624B;
        this.f103302s = C46153oE1.f101625C;
        LinkedList<InterfaceC46544ot4> linkedList = new LinkedList<>();
        this.f103303t = linkedList;
        this.f103284a = c46153oE1.f101632f;
        this.f103286c = c46153oE1.f101633g;
        hashMap.putAll(c46153oE1.f101634h);
        this.f103290g = c46153oE1.f101635i;
        this.f103294k = c46153oE1.f101636j;
        this.f103298o = c46153oE1.f101637k;
        this.f103296m = c46153oE1.f101638l;
        this.f103297n = c46153oE1.f101639m;
        this.f103299p = c46153oE1.f101640n;
        this.f103295l = c46153oE1.f101641o;
        this.f103285b = c46153oE1.f101646t;
        this.f103291h = c46153oE1.f101643q;
        this.f103292i = c46153oE1.f101644r;
        this.f103293j = c46153oE1.f101645s;
        arrayList.addAll(c46153oE1.f101647u);
        arrayList2.addAll(c46153oE1.f101648v);
        this.f103300q = c46153oE1.f101642p;
        this.f103301r = c46153oE1.f101649w;
        this.f103302s = c46153oE1.f101650x;
        linkedList.addAll(c46153oE1.f101651y);
    }
}
