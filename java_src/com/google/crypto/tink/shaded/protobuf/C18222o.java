package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18178U;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.crypto.tink.shaded.protobuf.o */
/* loaded from: classes6.dex */
public final class C18222o extends AbstractC18221n<AbstractC18230t.C18234d> {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.o$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18223a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74184a;

        static {
            int[] iArr = new int[C18178U.EnumC18180b.values().length];
            f74184a = iArr;
            try {
                iArr[C18178U.EnumC18180b.f74089d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74090e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74091f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74092g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74093h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74094i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74095j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74096k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74101p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74103r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74104s.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74105t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74106u.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74102q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74100o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74097l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74098m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f74184a[C18178U.EnumC18180b.f74099n.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18221n
    /* renamed from: a */
    public int mo47527a(Map.Entry<?, ?> entry) {
        return ((AbstractC18230t.C18234d) entry.getKey()).getNumber();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18221n
    /* renamed from: b */
    public Object mo47526b(C18219m c18219m, InterfaceC18149F interfaceC18149F, int i) {
        return c18219m.m47529a(interfaceC18149F, i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18221n
    /* renamed from: c */
    public C18225q<AbstractC18230t.C18234d> mo47525c(Object obj) {
        return ((AbstractC18230t.AbstractC18233c) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18221n
    /* renamed from: d */
    public C18225q<AbstractC18230t.C18234d> mo47524d(Object obj) {
        return ((AbstractC18230t.AbstractC18233c) obj).m47442F();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18221n
    /* renamed from: e */
    public boolean mo47523e(InterfaceC18149F interfaceC18149F) {
        return interfaceC18149F instanceof AbstractC18230t.AbstractC18233c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18221n
    /* renamed from: f */
    public void mo47522f(Object obj) {
        mo47525c(obj).m47499s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18221n
    /* renamed from: g */
    public <UT, UB> UB mo47521g(InterfaceC18156L interfaceC18156L, Object obj, C18219m c18219m, C18225q<AbstractC18230t.C18234d> c18225q, UB ub, AbstractC18169P<UT, UB> abstractC18169P) throws IOException {
        Object valueOf;
        Object m47509i;
        ArrayList arrayList;
        AbstractC18230t.C18235e c18235e = (AbstractC18230t.C18235e) obj;
        int m47436c = c18235e.m47436c();
        if (c18235e.f74205b.isRepeated() && c18235e.f74205b.isPacked()) {
            switch (C18223a.f74184a[c18235e.m47438a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC18156L.mo47593s(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC18156L.mo47596p(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC18156L.mo47587y(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC18156L.mo47588x(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC18156L.mo47600l(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC18156L.mo47633C(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC18156L.mo47599m(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC18156L.mo47605g(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC18156L.mo47632D(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC18156L.mo47590v(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC18156L.mo47601k(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC18156L.mo47603i(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC18156L.mo47611a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC18156L.mo47586z(arrayList);
                    ub = (UB) C18158N.m47928z(m47436c, arrayList, c18235e.f74205b.m47439b(), ub, abstractC18169P);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c18235e.f74205b.getLiteType());
            }
            c18225q.m47495w(c18235e.f74205b, arrayList);
        } else {
            if (c18235e.m47438a() == C18178U.EnumC18180b.f74102q) {
                int mo47634B = interfaceC18156L.mo47634B();
                if (c18235e.f74205b.m47439b().findValueByNumber(mo47634B) == null) {
                    return (UB) C18158N.m47973L(m47436c, mo47634B, ub, abstractC18169P);
                }
                valueOf = Integer.valueOf(mo47634B);
            } else {
                switch (C18223a.f74184a[c18235e.m47438a().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(interfaceC18156L.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(interfaceC18156L.readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(interfaceC18156L.mo47592t());
                        break;
                    case 4:
                        valueOf = Long.valueOf(interfaceC18156L.mo47602j());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(interfaceC18156L.mo47634B());
                        break;
                    case 6:
                        valueOf = Long.valueOf(interfaceC18156L.mo47591u());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(interfaceC18156L.mo47631E());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(interfaceC18156L.mo47589w());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(interfaceC18156L.mo47609c());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(interfaceC18156L.mo47628H());
                        break;
                    case 11:
                        valueOf = Long.valueOf(interfaceC18156L.mo47610b());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(interfaceC18156L.mo47606f());
                        break;
                    case 13:
                        valueOf = Long.valueOf(interfaceC18156L.mo47630F());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = interfaceC18156L.mo47604h();
                        break;
                    case 16:
                        valueOf = interfaceC18156L.mo47629G();
                        break;
                    case 17:
                        valueOf = interfaceC18156L.mo47625K(c18235e.m47437b().getClass(), c18219m);
                        break;
                    case 18:
                        valueOf = interfaceC18156L.mo47621O(c18235e.m47437b().getClass(), c18219m);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            if (c18235e.m47435d()) {
                c18225q.m47517a(c18235e.f74205b, valueOf);
            } else {
                int i = C18223a.f74184a[c18235e.m47438a().ordinal()];
                if ((i == 17 || i == 18) && (m47509i = c18225q.m47509i(c18235e.f74205b)) != null) {
                    valueOf = C18238v.m47416h(m47509i, valueOf);
                }
                c18225q.m47495w(c18235e.f74205b, valueOf);
            }
        }
        return ub;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18221n
    /* renamed from: h */
    public void mo47520h(InterfaceC18156L interfaceC18156L, Object obj, C18219m c18219m, C18225q<AbstractC18230t.C18234d> c18225q) throws IOException {
        AbstractC18230t.C18235e c18235e = (AbstractC18230t.C18235e) obj;
        c18225q.m47495w(c18235e.f74205b, interfaceC18156L.mo47621O(c18235e.m47437b().getClass(), c18219m));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18221n
    /* renamed from: i */
    public void mo47519i(AbstractC18199g abstractC18199g, Object obj, C18219m c18219m, C18225q<AbstractC18230t.C18234d> c18225q) throws IOException {
        AbstractC18230t.C18235e c18235e = (AbstractC18230t.C18235e) obj;
        InterfaceC18149F mo47456E = c18235e.m47437b().newBuilderForType().mo47456E();
        AbstractC18195e m47744Q = AbstractC18195e.m47744Q(ByteBuffer.wrap(abstractC18199g.m47709C()), true);
        M94.m95655a().m95654b(mo47456E, m47744Q, c18219m);
        c18225q.m47495w(c18235e.f74205b, mo47456E);
        if (m47744Q.mo47598n() == Integer.MAX_VALUE) {
            return;
        }
        throw InvalidProtocolBufferException.m48010b();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18221n
    /* renamed from: j */
    public void mo47518j(InterfaceC18186V interfaceC18186V, Map.Entry<?, ?> entry) throws IOException {
        AbstractC18230t.C18234d c18234d = (AbstractC18230t.C18234d) entry.getKey();
        if (c18234d.isRepeated()) {
            switch (C18223a.f74184a[c18234d.getLiteType().ordinal()]) {
                case 1:
                    C18158N.m47969P(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, c18234d.isPacked());
                    return;
                case 2:
                    C18158N.m47965T(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, c18234d.isPacked());
                    return;
                case 3:
                    C18158N.m47962W(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, c18234d.isPacked());
                    return;
                case 4:
                    C18158N.m47949e0(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, c18234d.isPacked());
                    return;
                case 5:
                    C18158N.m47963V(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, c18234d.isPacked());
                    return;
                case 6:
                    C18158N.m47966S(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, c18234d.isPacked());
                    return;
                case 7:
                    C18158N.m47967R(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, c18234d.isPacked());
                    return;
                case 8:
                    C18158N.m47971N(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, c18234d.isPacked());
                    return;
                case 9:
                    C18158N.m47951d0(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, c18234d.isPacked());
                    return;
                case 10:
                    C18158N.m47960Y(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, c18234d.isPacked());
                    return;
                case 11:
                    C18158N.m47959Z(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, c18234d.isPacked());
                    return;
                case 12:
                    C18158N.m47957a0(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, c18234d.isPacked());
                    return;
                case 13:
                    C18158N.m47955b0(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, c18234d.isPacked());
                    return;
                case 14:
                    C18158N.m47963V(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, c18234d.isPacked());
                    return;
                case 15:
                    C18158N.m47970O(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V);
                    return;
                case 16:
                    C18158N.m47953c0(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C18158N.m47964U(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, M94.m95655a().m95652d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C18158N.m47961X(c18234d.getNumber(), (List) entry.getValue(), interfaceC18186V, M94.m95655a().m95652d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (C18223a.f74184a[c18234d.getLiteType().ordinal()]) {
            case 1:
                interfaceC18186V.mo47542z(c18234d.getNumber(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                interfaceC18186V.mo47580F(c18234d.getNumber(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                interfaceC18186V.mo47583C(c18234d.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                interfaceC18186V.mo47563e(c18234d.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                interfaceC18186V.mo47561g(c18234d.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                interfaceC18186V.mo47555m(c18234d.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                interfaceC18186V.mo47565c(c18234d.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                interfaceC18186V.mo47554n(c18234d.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                interfaceC18186V.mo47557k(c18234d.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                interfaceC18186V.mo47553o(c18234d.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                interfaceC18186V.mo47545w(c18234d.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                interfaceC18186V.mo47577I(c18234d.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                interfaceC18186V.mo47558j(c18234d.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                interfaceC18186V.mo47561g(c18234d.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                interfaceC18186V.mo47571O(c18234d.getNumber(), (AbstractC18199g) entry.getValue());
                return;
            case 16:
                interfaceC18186V.mo47564d(c18234d.getNumber(), (String) entry.getValue());
                return;
            case 17:
                interfaceC18186V.mo47575K(c18234d.getNumber(), entry.getValue(), M94.m95655a().m95652d(entry.getValue().getClass()));
                return;
            case 18:
                interfaceC18186V.mo47573M(c18234d.getNumber(), entry.getValue(), M94.m95655a().m95652d(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}
