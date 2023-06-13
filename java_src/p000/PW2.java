package p000;

import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.IS0;
import p000.WU2;
/* renamed from: PW2 */
/* loaded from: classes5.dex */
public class PW2<Model, Data> implements WU2<Model, Data> {

    /* renamed from: a */
    public final List<WU2<Model, Data>> f28614a;

    /* renamed from: b */
    public final InterfaceC41591gY3<List<Throwable>> f28615b;

    /* renamed from: PW2$a */
    /* loaded from: classes5.dex */
    public static class C6400a<Data> implements IS0<Data>, IS0.InterfaceC3534a<Data> {

        /* renamed from: b */
        public final List<IS0<Data>> f28616b;

        /* renamed from: c */
        public final InterfaceC41591gY3<List<Throwable>> f28617c;

        /* renamed from: d */
        public int f28618d;

        /* renamed from: e */
        public P24 f28619e;

        /* renamed from: f */
        public IS0.InterfaceC3534a<? super Data> f28620f;

        /* renamed from: g */
        public List<Throwable> f28621g;

        /* renamed from: h */
        public boolean f28622h;

        public C6400a(List<IS0<Data>> list, InterfaceC41591gY3<List<Throwable>> interfaceC41591gY3) {
            this.f28617c = interfaceC41591gY3;
            C52865zZ3.m1112c(list);
            this.f28616b = list;
            this.f28618d = 0;
        }

        @Override // p000.IS0
        /* renamed from: a */
        public Class<Data> mo6834a() {
            return this.f28616b.get(0).mo6834a();
        }

        @Override // p000.IS0
        /* renamed from: b */
        public ZS0 mo19947b() {
            return this.f28616b.get(0).mo19947b();
        }

        @Override // p000.IS0.InterfaceC3534a
        /* renamed from: c */
        public void mo77098c(Data data) {
            if (data != null) {
                this.f28620f.mo77098c(data);
            } else {
                m90165f();
            }
        }

        @Override // p000.IS0
        public void cancel() {
            this.f28622h = true;
            for (IS0<Data> is0 : this.f28616b) {
                is0.cancel();
            }
        }

        @Override // p000.IS0
        public void cleanup() {
            List<Throwable> list = this.f28621g;
            if (list != null) {
                this.f28617c.mo9829b(list);
            }
            this.f28621g = null;
            for (IS0<Data> is0 : this.f28616b) {
                is0.cleanup();
            }
        }

        @Override // p000.IS0.InterfaceC3534a
        /* renamed from: d */
        public void mo77097d(Exception exc) {
            ((List) C52865zZ3.m1111d(this.f28621g)).add(exc);
            m90165f();
        }

        @Override // p000.IS0
        /* renamed from: e */
        public void mo19946e(P24 p24, IS0.InterfaceC3534a<? super Data> interfaceC3534a) {
            this.f28619e = p24;
            this.f28620f = interfaceC3534a;
            this.f28621g = this.f28617c.mo9830a();
            this.f28616b.get(this.f28618d).mo19946e(p24, this);
            if (this.f28622h) {
                cancel();
            }
        }

        /* renamed from: f */
        public final void m90165f() {
            if (this.f28622h) {
                return;
            }
            if (this.f28618d < this.f28616b.size() - 1) {
                this.f28618d++;
                mo19946e(this.f28619e, this.f28620f);
                return;
            }
            C52865zZ3.m1111d(this.f28621g);
            this.f28620f.mo77097d(new GlideException("Fetch failed", new ArrayList(this.f28621g)));
        }
    }

    public PW2(List<WU2<Model, Data>> list, InterfaceC41591gY3<List<Throwable>> interfaceC41591gY3) {
        this.f28614a = list;
        this.f28615b = interfaceC41591gY3;
    }

    @Override // p000.WU2
    /* renamed from: a */
    public boolean mo19952a(Model model) {
        for (WU2<Model, Data> wu2 : this.f28614a) {
            if (wu2.mo19952a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.WU2
    /* renamed from: b */
    public WU2.C9060a<Data> mo19951b(Model model, int i, int i2, C48964sy3 c48964sy3) {
        WU2.C9060a<Data> mo19951b;
        int size = this.f28614a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC38133ak2 interfaceC38133ak2 = null;
        for (int i3 = 0; i3 < size; i3++) {
            WU2<Model, Data> wu2 = this.f28614a.get(i3);
            if (wu2.mo19952a(model) && (mo19951b = wu2.mo19951b(model, i, i2, c48964sy3)) != null) {
                interfaceC38133ak2 = mo19951b.f41158a;
                arrayList.add(mo19951b.f41160c);
            }
        }
        if (arrayList.isEmpty() || interfaceC38133ak2 == null) {
            return null;
        }
        return new WU2.C9060a<>(interfaceC38133ak2, new C6400a(arrayList, this.f28615b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f28614a.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}
