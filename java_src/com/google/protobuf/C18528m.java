package com.google.protobuf;

import com.google.protobuf.AbstractC18536r;
import com.google.protobuf.C18489P;
import com.google.protobuf.InterfaceC18462D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.protobuf.m */
/* loaded from: classes6.dex */
public final class C18528m extends AbstractC18527l<AbstractC18536r.C18540d> {

    /* renamed from: com.google.protobuf.m$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18529a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74840a;

        static {
            int[] iArr = new int[C18489P.EnumC18491b.values().length];
            f74840a = iArr;
            try {
                iArr[C18489P.EnumC18491b.f74756d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74757e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74758f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74759g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74760h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74761i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74762j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74763k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74768p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74770r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74771s.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74772t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74773u.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74769q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74767o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74764l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74765m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f74840a[C18489P.EnumC18491b.f74766n.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.AbstractC18527l
    /* renamed from: a */
    public int mo46120a(Map.Entry<?, ?> entry) {
        return ((AbstractC18536r.C18540d) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.AbstractC18527l
    /* renamed from: b */
    public Object mo46119b(C18525k c18525k, InterfaceC18462D interfaceC18462D, int i) {
        return c18525k.m46122a(interfaceC18462D, i);
    }

    @Override // com.google.protobuf.AbstractC18527l
    /* renamed from: c */
    public C18531o<AbstractC18536r.C18540d> mo46118c(Object obj) {
        return ((AbstractC18536r.AbstractC18539c) obj).extensions;
    }

    @Override // com.google.protobuf.AbstractC18527l
    /* renamed from: d */
    public C18531o<AbstractC18536r.C18540d> mo46117d(Object obj) {
        return ((AbstractC18536r.AbstractC18539c) obj).m46019T();
    }

    @Override // com.google.protobuf.AbstractC18527l
    /* renamed from: e */
    public boolean mo46116e(InterfaceC18462D interfaceC18462D) {
        return interfaceC18462D instanceof AbstractC18536r.AbstractC18539c;
    }

    @Override // com.google.protobuf.AbstractC18527l
    /* renamed from: f */
    public void mo46115f(Object obj) {
        mo46118c(obj).m46088u();
    }

    @Override // com.google.protobuf.AbstractC18527l
    /* renamed from: g */
    public <UT, UB> UB mo46114g(Object obj, InterfaceC18468I interfaceC18468I, Object obj2, C18525k c18525k, C18531o<AbstractC18536r.C18540d> c18531o, UB ub, AbstractC18480L<UT, UB> abstractC18480L) throws IOException {
        Object valueOf;
        Object m46100i;
        ArrayList arrayList;
        AbstractC18536r.C18541e c18541e = (AbstractC18536r.C18541e) obj2;
        int m46013c = c18541e.m46013c();
        if (c18541e.f74860b.isRepeated() && c18541e.f74860b.isPacked()) {
            switch (C18529a.f74840a[c18541e.m46015a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC18468I.mo46190s(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC18468I.mo46193p(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC18468I.mo46184y(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC18468I.mo46185x(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC18468I.mo46197l(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC18468I.mo46233C(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC18468I.mo46196m(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC18468I.mo46202g(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC18468I.mo46232D(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC18468I.mo46187v(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC18468I.mo46198k(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC18468I.mo46200i(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC18468I.mo46209a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC18468I.mo46183z(arrayList);
                    ub = (UB) C18469J.m46471z(obj, m46013c, arrayList, c18541e.f74860b.m46016b(), ub, abstractC18480L);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c18541e.f74860b.getLiteType());
            }
            c18531o.m46084y(c18541e.f74860b, arrayList);
        } else {
            if (c18541e.m46015a() == C18489P.EnumC18491b.f74769q) {
                int mo46234B = interfaceC18468I.mo46234B();
                if (c18541e.f74860b.m46016b().findValueByNumber(mo46234B) == null) {
                    return (UB) C18469J.m46516L(obj, m46013c, mo46234B, ub, abstractC18480L);
                }
                valueOf = Integer.valueOf(mo46234B);
            } else {
                switch (C18529a.f74840a[c18541e.m46015a().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(interfaceC18468I.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(interfaceC18468I.readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(interfaceC18468I.mo46189t());
                        break;
                    case 4:
                        valueOf = Long.valueOf(interfaceC18468I.mo46199j());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(interfaceC18468I.mo46234B());
                        break;
                    case 6:
                        valueOf = Long.valueOf(interfaceC18468I.mo46188u());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(interfaceC18468I.mo46231E());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(interfaceC18468I.mo46186w());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(interfaceC18468I.mo46206c());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(interfaceC18468I.mo46228H());
                        break;
                    case 11:
                        valueOf = Long.valueOf(interfaceC18468I.mo46207b());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(interfaceC18468I.mo46203f());
                        break;
                    case 13:
                        valueOf = Long.valueOf(interfaceC18468I.mo46230F());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = interfaceC18468I.mo46201h();
                        break;
                    case 16:
                        valueOf = interfaceC18468I.mo46229G();
                        break;
                    case 17:
                        if (!c18541e.m46012d()) {
                            Object m46100i2 = c18531o.m46100i(c18541e.f74860b);
                            if (m46100i2 instanceof AbstractC18536r) {
                                InterfaceC33832Jm5 m97646d = L94.m97649a().m97646d(m46100i2);
                                if (!((AbstractC18536r) m46100i2).m46063H()) {
                                    Object mo46554d = m97646d.mo46554d();
                                    m97646d.mo46555c(mo46554d, m46100i2);
                                    c18531o.m46084y(c18541e.f74860b, mo46554d);
                                    m46100i2 = mo46554d;
                                }
                                interfaceC18468I.mo46223M(m46100i2, m97646d, c18525k);
                                return ub;
                            }
                        }
                        valueOf = interfaceC18468I.mo46221O(c18541e.m46014b().getClass(), c18525k);
                        break;
                    case 18:
                        if (!c18541e.m46012d()) {
                            Object m46100i3 = c18531o.m46100i(c18541e.f74860b);
                            if (m46100i3 instanceof AbstractC18536r) {
                                InterfaceC33832Jm5 m97646d2 = L94.m97649a().m97646d(m46100i3);
                                if (!((AbstractC18536r) m46100i3).m46063H()) {
                                    Object mo46554d2 = m97646d2.mo46554d();
                                    m97646d2.mo46555c(mo46554d2, m46100i3);
                                    c18531o.m46084y(c18541e.f74860b, mo46554d2);
                                    m46100i3 = mo46554d2;
                                }
                                interfaceC18468I.mo46222N(m46100i3, m97646d2, c18525k);
                                return ub;
                            }
                        }
                        valueOf = interfaceC18468I.mo46220P(c18541e.m46014b().getClass(), c18525k);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            if (c18541e.m46012d()) {
                c18531o.m46108a(c18541e.f74860b, valueOf);
            } else {
                int i = C18529a.f74840a[c18541e.m46015a().ordinal()];
                if ((i == 17 || i == 18) && (m46100i = c18531o.m46100i(c18541e.f74860b)) != null) {
                    valueOf = C18544t.m45993h(m46100i, valueOf);
                }
                c18531o.m46084y(c18541e.f74860b, valueOf);
            }
        }
        return ub;
    }

    @Override // com.google.protobuf.AbstractC18527l
    /* renamed from: h */
    public void mo46113h(InterfaceC18468I interfaceC18468I, Object obj, C18525k c18525k, C18531o<AbstractC18536r.C18540d> c18531o) throws IOException {
        AbstractC18536r.C18541e c18541e = (AbstractC18536r.C18541e) obj;
        c18531o.m46084y(c18541e.f74860b, interfaceC18468I.mo46220P(c18541e.m46014b().getClass(), c18525k));
    }

    @Override // com.google.protobuf.AbstractC18527l
    /* renamed from: i */
    public void mo46112i(AbstractC18504e abstractC18504e, Object obj, C18525k c18525k, C18531o<AbstractC18536r.C18540d> c18531o) throws IOException {
        AbstractC18536r.C18541e c18541e = (AbstractC18536r.C18541e) obj;
        InterfaceC18462D.InterfaceC18463a newBuilderForType = c18541e.m46014b().newBuilderForType();
        AbstractC18516f mo46281w = abstractC18504e.mo46281w();
        newBuilderForType.mo46028l2(mo46281w, c18525k);
        c18531o.m46084y(c18541e.f74860b, newBuilderForType.mo46033E());
        mo46281w.mo46256a(0);
    }

    @Override // com.google.protobuf.AbstractC18527l
    /* renamed from: j */
    public void mo46111j(InterfaceC18497Q interfaceC18497Q, Map.Entry<?, ?> entry) throws IOException {
        AbstractC18536r.C18540d c18540d = (AbstractC18536r.C18540d) entry.getKey();
        if (c18540d.isRepeated()) {
            switch (C18529a.f74840a[c18540d.getLiteType().ordinal()]) {
                case 1:
                    C18469J.m46512P(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, c18540d.isPacked());
                    return;
                case 2:
                    C18469J.m46508T(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, c18540d.isPacked());
                    return;
                case 3:
                    C18469J.m46505W(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, c18540d.isPacked());
                    return;
                case 4:
                    C18469J.m46492e0(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, c18540d.isPacked());
                    return;
                case 5:
                    C18469J.m46506V(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, c18540d.isPacked());
                    return;
                case 6:
                    C18469J.m46509S(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, c18540d.isPacked());
                    return;
                case 7:
                    C18469J.m46510R(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, c18540d.isPacked());
                    return;
                case 8:
                    C18469J.m46514N(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, c18540d.isPacked());
                    return;
                case 9:
                    C18469J.m46494d0(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, c18540d.isPacked());
                    return;
                case 10:
                    C18469J.m46503Y(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, c18540d.isPacked());
                    return;
                case 11:
                    C18469J.m46502Z(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, c18540d.isPacked());
                    return;
                case 12:
                    C18469J.m46500a0(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, c18540d.isPacked());
                    return;
                case 13:
                    C18469J.m46498b0(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, c18540d.isPacked());
                    return;
                case 14:
                    C18469J.m46506V(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, c18540d.isPacked());
                    return;
                case 15:
                    C18469J.m46513O(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q);
                    return;
                case 16:
                    C18469J.m46496c0(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C18469J.m46507U(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, L94.m97649a().m97647c(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C18469J.m46504X(c18540d.getNumber(), (List) entry.getValue(), interfaceC18497Q, L94.m97649a().m97647c(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (C18529a.f74840a[c18540d.getLiteType().ordinal()]) {
            case 1:
                interfaceC18497Q.mo46135z(c18540d.getNumber(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                interfaceC18497Q.mo46177F(c18540d.getNumber(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                interfaceC18497Q.mo46180C(c18540d.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                interfaceC18497Q.mo46156e(c18540d.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                interfaceC18497Q.mo46154g(c18540d.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                interfaceC18497Q.mo46148m(c18540d.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                interfaceC18497Q.mo46158c(c18540d.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                interfaceC18497Q.mo46147n(c18540d.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                interfaceC18497Q.mo46150k(c18540d.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                interfaceC18497Q.mo46146o(c18540d.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                interfaceC18497Q.mo46138w(c18540d.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                interfaceC18497Q.mo46174I(c18540d.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                interfaceC18497Q.mo46151j(c18540d.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                interfaceC18497Q.mo46154g(c18540d.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                interfaceC18497Q.mo46172K(c18540d.getNumber(), (AbstractC18504e) entry.getValue());
                return;
            case 16:
                interfaceC18497Q.mo46157d(c18540d.getNumber(), (String) entry.getValue());
                return;
            case 17:
                interfaceC18497Q.mo46173J(c18540d.getNumber(), entry.getValue(), L94.m97649a().m97647c(entry.getValue().getClass()));
                return;
            case 18:
                interfaceC18497Q.mo46170M(c18540d.getNumber(), entry.getValue(), L94.m97649a().m97647c(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}
