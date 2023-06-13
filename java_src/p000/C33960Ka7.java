package p000;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
/* renamed from: Ka7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33960Ka7 implements InterfaceC36084Tc7 {

    /* renamed from: a */
    public final AbstractC33726Ja7 f19886a;

    public C33960Ka7(AbstractC33726Ja7 abstractC33726Ja7) {
        Charset charset = C46960pb7.f103839a;
        this.f19886a = abstractC33726Ja7;
        abstractC33726Ja7.f17885a = this;
    }

    /* renamed from: M */
    public static C33960Ka7 m98723M(AbstractC33726Ja7 abstractC33726Ja7) {
        C33960Ka7 c33960Ka7 = abstractC33726Ja7.f17885a;
        return c33960Ka7 != null ? c33960Ka7 : new C33960Ka7(abstractC33726Ja7);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: A */
    public final void mo83307A(int i, int i2) throws IOException {
        this.f19886a.mo100151p(i, i2);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: B */
    public final void mo83306B(int i, long j) throws IOException {
        this.f19886a.mo100142y(i, j);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: C */
    public final void mo83305C(int i, float f) throws IOException {
        this.f19886a.mo100155l(i, Float.floatToRawIntBits(f));
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: D */
    public final void mo83304D(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f19886a.mo100145v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC33726Ja7.m100170B(((Integer) list.get(i4)).intValue());
            }
            this.f19886a.mo100143x(i3);
            while (i2 < list.size()) {
                this.f19886a.mo100150q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f19886a.mo100151p(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: E */
    public final void mo83303E(int i, String str) throws IOException {
        this.f19886a.mo100147t(i, str);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: F */
    public final void mo83302F(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f19886a.mo100145v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC33726Ja7.m100170B(((Integer) list.get(i4)).intValue());
            }
            this.f19886a.mo100143x(i3);
            while (i2 < list.size()) {
                this.f19886a.mo100150q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f19886a.mo100151p(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: G */
    public final void mo83301G(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f19886a.mo100145v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC33726Ja7.m100165b(((Long) list.get(i4)).longValue());
            }
            this.f19886a.mo100143x(i3);
            while (i2 < list.size()) {
                this.f19886a.mo100141z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f19886a.mo100142y(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: H */
    public final void mo83300H(int i, long j) throws IOException {
        this.f19886a.mo100142y(i, j);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: I */
    public final void mo83299I(int i, int i2) throws IOException {
        this.f19886a.mo100155l(i, i2);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: J */
    public final void mo83298J(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f19886a.mo100145v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f19886a.mo100143x(i3);
            while (i2 < list.size()) {
                this.f19886a.mo100154m(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f19886a.mo100155l(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: K */
    public final void mo83297K(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f19886a.mo100145v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC33726Ja7.m100165b(((Long) list.get(i4)).longValue());
            }
            this.f19886a.mo100143x(i3);
            while (i2 < list.size()) {
                this.f19886a.mo100141z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f19886a.mo100142y(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: L */
    public final void mo83296L(int i, C34203Lb7 c34203Lb7, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            this.f19886a.mo100145v(i, 2);
            this.f19886a.mo100143x(C34437Mb7.m95141b(c34203Lb7, entry.getKey(), entry.getValue()));
            C34437Mb7.m95138e(this.f19886a, c34203Lb7, entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: a */
    public final void mo83295a(int i, Object obj, InterfaceC42819ic7 interfaceC42819ic7) throws IOException {
        AbstractC33726Ja7 abstractC33726Ja7 = this.f19886a;
        abstractC33726Ja7.mo100145v(i, 3);
        interfaceC42819ic7.mo33741g((InterfaceC36075Tb7) obj, abstractC33726Ja7.f17885a);
        abstractC33726Ja7.mo100145v(i, 4);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: b */
    public final void mo83294b(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof InterfaceC31629Ab7) {
            InterfaceC31629Ab7 interfaceC31629Ab7 = (InterfaceC31629Ab7) list;
            while (i2 < list.size()) {
                Object mo1044c1 = interfaceC31629Ab7.mo1044c1(i2);
                if (mo1044c1 instanceof String) {
                    this.f19886a.mo100147t(i, (String) mo1044c1);
                } else {
                    this.f19886a.mo100157j(i, (AbstractC32088Ca7) mo1044c1);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f19886a.mo100147t(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: c */
    public final void mo83293c(int i, Object obj) throws IOException {
        if (obj instanceof AbstractC32088Ca7) {
            C33258Ha7 c33258Ha7 = (C33258Ha7) this.f19886a;
            c33258Ha7.mo100143x(11);
            c33258Ha7.mo100144w(2, i);
            c33258Ha7.mo100157j(3, (AbstractC32088Ca7) obj);
            c33258Ha7.mo100143x(12);
            return;
        }
        C33258Ha7 c33258Ha72 = (C33258Ha7) this.f19886a;
        c33258Ha72.mo100143x(11);
        c33258Ha72.mo100144w(2, i);
        c33258Ha72.mo100143x(26);
        c33258Ha72.mo100148s((InterfaceC36075Tb7) obj);
        c33258Ha72.mo100143x(12);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: d */
    public final void mo83292d(int i, Object obj, InterfaceC42819ic7 interfaceC42819ic7) throws IOException {
        InterfaceC36075Tb7 interfaceC36075Tb7 = (InterfaceC36075Tb7) obj;
        C33258Ha7 c33258Ha7 = (C33258Ha7) this.f19886a;
        c33258Ha7.mo100143x((i << 3) | 2);
        c33258Ha7.mo100143x(((AbstractC40427ea7) interfaceC36075Tb7).mo41145a(interfaceC42819ic7));
        interfaceC42819ic7.mo33741g(interfaceC36075Tb7, c33258Ha7.f17885a);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: e */
    public final void mo83291e(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f19886a.mo100145v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f19886a.mo100143x(i3);
            while (i2 < list.size()) {
                this.f19886a.mo100154m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f19886a.mo100155l(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: f */
    public final void mo83290f(int i, AbstractC32088Ca7 abstractC32088Ca7) throws IOException {
        this.f19886a.mo100157j(i, abstractC32088Ca7);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: g */
    public final void mo83289g(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f19886a.mo100145v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f19886a.mo100143x(i3);
            while (i2 < list.size()) {
                this.f19886a.mo100159h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f19886a.mo100158i(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36084Tc7
    @Deprecated
    /* renamed from: h */
    public final void mo83288h(int i) throws IOException {
        this.f19886a.mo100145v(i, 4);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: i */
    public final void mo83287i(int i, int i2) throws IOException {
        this.f19886a.mo100144w(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: j */
    public final void mo83286j(int i, boolean z) throws IOException {
        this.f19886a.mo100158i(i, z);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: k */
    public final void mo83285k(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f19886a.mo100145v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f19886a.mo100143x(i3);
            while (i2 < list.size()) {
                this.f19886a.mo100152o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f19886a.mo100153n(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: l */
    public final void mo83284l(int i, long j) throws IOException {
        this.f19886a.mo100153n(i, j);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: m */
    public final void mo83283m(int i, int i2) throws IOException {
        this.f19886a.mo100151p(i, i2);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: n */
    public final void mo83282n(int i, double d) throws IOException {
        this.f19886a.mo100153n(i, Double.doubleToRawLongBits(d));
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: o */
    public final void mo83281o(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f19886a.mo100157j(i, (AbstractC32088Ca7) list.get(i2));
        }
    }

    @Override // p000.InterfaceC36084Tc7
    @Deprecated
    /* renamed from: p */
    public final void mo83280p(int i) throws IOException {
        this.f19886a.mo100145v(i, 3);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: q */
    public final void mo83279q(int i, long j) throws IOException {
        this.f19886a.mo100142y(i, (j >> 63) ^ (j + j));
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: r */
    public final void mo83278r(int i, int i2) throws IOException {
        this.f19886a.mo100144w(i, i2);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: s */
    public final void mo83277s(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f19886a.mo100145v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f19886a.mo100143x(i3);
            while (i2 < list.size()) {
                this.f19886a.mo100154m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f19886a.mo100155l(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: t */
    public final void mo83276t(int i, long j) throws IOException {
        this.f19886a.mo100153n(i, j);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: u */
    public final void mo83275u(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f19886a.mo100145v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f19886a.mo100143x(i3);
            while (i2 < list.size()) {
                this.f19886a.mo100152o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f19886a.mo100153n(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: v */
    public final void mo83274v(int i, int i2) throws IOException {
        this.f19886a.mo100155l(i, i2);
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: w */
    public final void mo83273w(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f19886a.mo100145v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC33726Ja7.m100166a(((Integer) list.get(i4)).intValue());
            }
            this.f19886a.mo100143x(i3);
            while (i2 < list.size()) {
                this.f19886a.mo100143x(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f19886a.mo100144w(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: x */
    public final void mo83272x(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f19886a.mo100145v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += AbstractC33726Ja7.m100165b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f19886a.mo100143x(i3);
            while (i2 < list.size()) {
                AbstractC33726Ja7 abstractC33726Ja7 = this.f19886a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                abstractC33726Ja7.mo100141z((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            AbstractC33726Ja7 abstractC33726Ja72 = this.f19886a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            abstractC33726Ja72.mo100142y(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: y */
    public final void mo83271y(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f19886a.mo100145v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += AbstractC33726Ja7.m100166a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f19886a.mo100143x(i3);
            while (i2 < list.size()) {
                AbstractC33726Ja7 abstractC33726Ja7 = this.f19886a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                abstractC33726Ja7.mo100143x((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            AbstractC33726Ja7 abstractC33726Ja72 = this.f19886a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            abstractC33726Ja72.mo100144w(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // p000.InterfaceC36084Tc7
    /* renamed from: z */
    public final void mo83270z(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f19886a.mo100145v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f19886a.mo100143x(i3);
            while (i2 < list.size()) {
                this.f19886a.mo100152o(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f19886a.mo100153n(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }
}
