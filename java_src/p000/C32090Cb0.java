package p000;

import androidx.camera.core.impl.C11192d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: Cb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32090Cb0 extends YW2<AbstractC31856Bb0> {

    /* renamed from: Cb0$a */
    /* loaded from: classes.dex */
    public static final class C1073a {

        /* renamed from: a */
        public final List<AbstractC31856Bb0> f4287a = new ArrayList();

        public C1073a(List<AbstractC31856Bb0> list) {
            for (AbstractC31856Bb0 abstractC31856Bb0 : list) {
                this.f4287a.add(abstractC31856Bb0);
            }
        }

        /* renamed from: a */
        public void m112089a() {
            for (AbstractC31856Bb0 abstractC31856Bb0 : this.f4287a) {
                abstractC31856Bb0.m113837a();
            }
        }

        /* renamed from: b */
        public List<C11192d> m112088b() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC31856Bb0 abstractC31856Bb0 : this.f4287a) {
                C11192d m113836b = abstractC31856Bb0.m113836b();
                if (m113836b != null) {
                    arrayList.add(m113836b);
                }
            }
            return arrayList;
        }

        /* renamed from: c */
        public List<C11192d> m112087c() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC31856Bb0 abstractC31856Bb0 : this.f4287a) {
                C11192d m113835c = abstractC31856Bb0.m113835c();
                if (m113835c != null) {
                    arrayList.add(m113835c);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public List<C11192d> m112086d() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC31856Bb0 abstractC31856Bb0 : this.f4287a) {
                C11192d m113834d = abstractC31856Bb0.m113834d();
                if (m113834d != null) {
                    arrayList.add(m113834d);
                }
            }
            return arrayList;
        }

        /* renamed from: e */
        public List<C11192d> m112085e() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC31856Bb0 abstractC31856Bb0 : this.f4287a) {
                C11192d m113833e = abstractC31856Bb0.m113833e();
                if (m113833e != null) {
                    arrayList.add(m113833e);
                }
            }
            return arrayList;
        }
    }

    public C32090Cb0(AbstractC31856Bb0... abstractC31856Bb0Arr) {
        m74950a(Arrays.asList(abstractC31856Bb0Arr));
    }

    /* renamed from: e */
    public static C32090Cb0 m112090e() {
        return new C32090Cb0(new AbstractC31856Bb0[0]);
    }

    @Override // p000.YW2
    /* renamed from: b */
    public YW2<AbstractC31856Bb0> clone() {
        C32090Cb0 m112090e = m112090e();
        m112090e.m74950a(m74948c());
        return m112090e;
    }

    /* renamed from: d */
    public C1073a m112091d() {
        return new C1073a(m74948c());
    }
}
