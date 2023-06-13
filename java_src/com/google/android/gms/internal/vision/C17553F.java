package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.vision.F */
/* loaded from: classes6.dex */
public final class C17553F extends AbstractC50309vE8<AbstractC17554G.C17559e> {
    @Override // p000.AbstractC50309vE8
    /* renamed from: a */
    public final int mo8970a(Map.Entry<?, ?> entry) {
        return ((AbstractC17554G.C17559e) entry.getKey()).f71228b;
    }

    @Override // p000.AbstractC50309vE8
    /* renamed from: b */
    public final Object mo8969b(C17551E c17551e, InterfaceC44489lQ8 interfaceC44489lQ8, int i) {
        return c17551e.m50998a(interfaceC44489lQ8, i);
    }

    @Override // p000.AbstractC50309vE8
    /* renamed from: c */
    public final <UT, UB> UB mo8968c(IU8 iu8, Object obj, C17551E c17551e, C47355qF8<AbstractC17554G.C17559e> c47355qF8, UB ub, AbstractC41003fY8<UT, UB> abstractC41003fY8) throws IOException {
        Object m17728d;
        AbstractC17554G.C17558d c17558d = (AbstractC17554G.C17558d) obj;
        AbstractC17554G.C17559e c17559e = c17558d.f71227b;
        int i = c17559e.f71228b;
        boolean z = c17559e.f71230d;
        T19 t19 = c17559e.f71229c;
        Object obj2 = null;
        if (t19 != T19.f34666q) {
            int[] iArr = SE8.f33388a;
            switch (iArr[t19.ordinal()]) {
                case 1:
                    obj2 = Double.valueOf(iu8.zzd());
                    break;
                case 2:
                    obj2 = Float.valueOf(iu8.zze());
                    break;
                case 3:
                    obj2 = Long.valueOf(iu8.zzg());
                    break;
                case 4:
                    obj2 = Long.valueOf(iu8.mo13311x());
                    break;
                case 5:
                    obj2 = Integer.valueOf(iu8.zzh());
                    break;
                case 6:
                    obj2 = Long.valueOf(iu8.zzi());
                    break;
                case 7:
                    obj2 = Integer.valueOf(iu8.mo13332c());
                    break;
                case 8:
                    obj2 = Boolean.valueOf(iu8.mo13335a());
                    break;
                case 9:
                    obj2 = Integer.valueOf(iu8.mo13329f());
                    break;
                case 10:
                    obj2 = Integer.valueOf(iu8.mo13327h());
                    break;
                case 11:
                    obj2 = Long.valueOf(iu8.mo13324k());
                    break;
                case 12:
                    obj2 = Integer.valueOf(iu8.zzs());
                    break;
                case 13:
                    obj2 = Long.valueOf(iu8.mo13328g());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    obj2 = iu8.mo13330e();
                    break;
                case 16:
                    obj2 = iu8.mo13325j();
                    break;
                case 17:
                    obj2 = iu8.mo13360B(c17558d.f71226a.getClass(), c17551e);
                    break;
                case 18:
                    obj2 = iu8.mo13358D(c17558d.f71226a.getClass(), c17551e);
                    break;
            }
            AbstractC17554G.C17559e c17559e2 = c17558d.f71227b;
            if (c17559e2.f71230d) {
                c47355qF8.m17721k(c17559e2, obj2);
            } else {
                int i2 = iArr[c17559e2.f71229c.ordinal()];
                if ((i2 == 17 || i2 == 18) && (m17728d = c47355qF8.m17728d(c17558d.f71227b)) != null) {
                    obj2 = C52124yI8.m3690e(m17728d, obj2);
                }
                c47355qF8.m17725g(c17558d.f71227b, obj2);
            }
            return ub;
        }
        iu8.zzh();
        throw null;
    }

    @Override // p000.AbstractC50309vE8
    /* renamed from: d */
    public final C47355qF8<AbstractC17554G.C17559e> mo8967d(Object obj) {
        return ((AbstractC17554G.AbstractC17557c) obj).zzc;
    }

    @Override // p000.AbstractC50309vE8
    /* renamed from: e */
    public final void mo8966e(AbstractC53119zy8 abstractC53119zy8, Object obj, C17551E c17551e, C47355qF8<AbstractC17554G.C17559e> c47355qF8) throws IOException {
        byte[] bArr;
        AbstractC17554G.C17558d c17558d = (AbstractC17554G.C17558d) obj;
        InterfaceC44489lQ8 zze = c17558d.f71226a.mo27295h().zze();
        int mo44b = abstractC53119zy8.mo44b();
        if (mo44b == 0) {
            bArr = C52124yI8.f119327c;
        } else {
            byte[] bArr2 = new byte[mo44b];
            abstractC53119zy8.mo35v(bArr2, 0, 0, mo44b);
            bArr = bArr2;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.hasArray()) {
            C48959sx8 c48959sx8 = new C48959sx8(wrap, true);
            C40365eT8.m42854a().m42852c(zze).mo1311d(zze, c48959sx8, c17551e);
            c47355qF8.m17725g(c17558d.f71227b, zze);
            if (c48959sx8.zza() == Integer.MAX_VALUE) {
                return;
            }
            throw zzjk.m50760e();
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    @Override // p000.AbstractC50309vE8
    /* renamed from: f */
    public final void mo8965f(IU8 iu8, Object obj, C17551E c17551e, C47355qF8<AbstractC17554G.C17559e> c47355qF8) throws IOException {
        AbstractC17554G.C17558d c17558d = (AbstractC17554G.C17558d) obj;
        c47355qF8.m17725g(c17558d.f71227b, iu8.mo13358D(c17558d.f71226a.getClass(), c17551e));
    }

    @Override // p000.AbstractC50309vE8
    /* renamed from: g */
    public final void mo8964g(InterfaceC37736a39 interfaceC37736a39, Map.Entry<?, ?> entry) throws IOException {
        AbstractC17554G.C17559e c17559e = (AbstractC17554G.C17559e) entry.getKey();
        if (c17559e.f71230d) {
            switch (SE8.f33388a[c17559e.f71229c.ordinal()]) {
                case 1:
                    UU8.m81419l(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, false);
                    return;
                case 2:
                    UU8.m81406y(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, false);
                    return;
                case 3:
                    UU8.m81458C(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, false);
                    return;
                case 4:
                    UU8.m81454G(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, false);
                    return;
                case 5:
                    UU8.m81441T(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, false);
                    return;
                case 6:
                    UU8.m81447N(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, false);
                    return;
                case 7:
                    UU8.m81433a0(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, false);
                    return;
                case 8:
                    UU8.m81427d0(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, false);
                    return;
                case 9:
                    UU8.m81438W(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, false);
                    return;
                case 10:
                    UU8.m81431b0(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, false);
                    return;
                case 11:
                    UU8.m81444Q(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, false);
                    return;
                case 12:
                    UU8.m81435Z(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, false);
                    return;
                case 13:
                    UU8.m81450K(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, false);
                    return;
                case 14:
                    UU8.m81441T(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, false);
                    return;
                case 15:
                    UU8.m81408w(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39);
                    return;
                case 16:
                    UU8.m81421j(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        UU8.m81407x(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, C40365eT8.m42854a().m42853b(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        UU8.m81420k(c17559e.f71228b, (List) entry.getValue(), interfaceC37736a39, C40365eT8.m42854a().m42853b(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (SE8.f33388a[c17559e.f71229c.ordinal()]) {
            case 1:
                interfaceC37736a39.mo21575z(c17559e.f71228b, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                interfaceC37736a39.mo21614A(c17559e.f71228b, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                interfaceC37736a39.mo21576y(c17559e.f71228b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                interfaceC37736a39.mo21592i(c17559e.f71228b, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                interfaceC37736a39.mo21578w(c17559e.f71228b, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                interfaceC37736a39.mo21613B(c17559e.f71228b, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                interfaceC37736a39.mo21589l(c17559e.f71228b, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                interfaceC37736a39.mo21610E(c17559e.f71228b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                interfaceC37736a39.mo21588m(c17559e.f71228b, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                interfaceC37736a39.mo21595f(c17559e.f71228b, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                interfaceC37736a39.mo21593h(c17559e.f71228b, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                interfaceC37736a39.mo21590k(c17559e.f71228b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                interfaceC37736a39.mo21604K(c17559e.f71228b, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                interfaceC37736a39.mo21578w(c17559e.f71228b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                interfaceC37736a39.mo21602M(c17559e.f71228b, (AbstractC53119zy8) entry.getValue());
                return;
            case 16:
                interfaceC37736a39.mo21611D(c17559e.f71228b, (String) entry.getValue());
                return;
            case 17:
                interfaceC37736a39.mo21605J(c17559e.f71228b, entry.getValue(), C40365eT8.m42854a().m42853b(entry.getValue().getClass()));
                return;
            case 18:
                interfaceC37736a39.mo21606I(c17559e.f71228b, entry.getValue(), C40365eT8.m42854a().m42853b(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    @Override // p000.AbstractC50309vE8
    /* renamed from: h */
    public final boolean mo8963h(InterfaceC44489lQ8 interfaceC44489lQ8) {
        return interfaceC44489lQ8 instanceof AbstractC17554G.AbstractC17557c;
    }

    @Override // p000.AbstractC50309vE8
    /* renamed from: i */
    public final C47355qF8<AbstractC17554G.C17559e> mo8962i(Object obj) {
        return ((AbstractC17554G.AbstractC17557c) obj).m50970u();
    }

    @Override // p000.AbstractC50309vE8
    /* renamed from: j */
    public final void mo8961j(Object obj) {
        mo8967d(obj).m17723i();
    }
}
