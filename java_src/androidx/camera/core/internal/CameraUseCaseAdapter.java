package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.C11164h;
import androidx.camera.core.C11236l;
import androidx.camera.core.C11243o;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.InterfaceC11191c;
import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11225s;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class CameraUseCaseAdapter implements InterfaceC45757na0 {

    /* renamed from: b */
    public final InterfaceC34196Lb0 f52677b;

    /* renamed from: c */
    public final LinkedHashSet<InterfaceC34196Lb0> f52678c;

    /* renamed from: d */
    public final InterfaceC51695xb0 f52679d;

    /* renamed from: e */
    public final InterfaceC36578Vf6 f52680e;

    /* renamed from: f */
    public final C11227a f52681f;

    /* renamed from: i */
    public final InterfaceC43988kb0 f52684i;

    /* renamed from: j */
    public C32717Es6 f52685j;

    /* renamed from: p */
    public AbstractC11253p f52691p;

    /* renamed from: q */
    public C52202yR5 f52692q;

    /* renamed from: g */
    public final List<AbstractC11253p> f52682g = new ArrayList();

    /* renamed from: h */
    public final List<AbstractC11253p> f52683h = new ArrayList();

    /* renamed from: k */
    public List<AbstractC52288yb0> f52686k = Collections.emptyList();

    /* renamed from: l */
    public InterfaceC11191c f52687l = C38634bb0.m64299a();

    /* renamed from: m */
    public final Object f52688m = new Object();

    /* renamed from: n */
    public boolean f52689n = true;

    /* renamed from: o */
    public InterfaceC11197f f52690o = null;

    /* loaded from: classes.dex */
    public static final class CameraException extends Exception {
        public CameraException() {
        }

        public CameraException(String str) {
            super(str);
        }
    }

    /* renamed from: androidx.camera.core.internal.CameraUseCaseAdapter$a */
    /* loaded from: classes.dex */
    public static final class C11227a {

        /* renamed from: a */
        public final List<String> f52693a = new ArrayList();

        public C11227a(LinkedHashSet<InterfaceC34196Lb0> linkedHashSet) {
            Iterator<InterfaceC34196Lb0> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f52693a.add(it.next().mo4467d().mo98721a());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C11227a) {
                return this.f52693a.equals(((C11227a) obj).f52693a);
            }
            return false;
        }

        public int hashCode() {
            return this.f52693a.hashCode() * 53;
        }
    }

    /* renamed from: androidx.camera.core.internal.CameraUseCaseAdapter$b */
    /* loaded from: classes.dex */
    public static class C11228b {

        /* renamed from: a */
        public InterfaceC11225s<?> f52694a;

        /* renamed from: b */
        public InterfaceC11225s<?> f52695b;

        public C11228b(InterfaceC11225s<?> interfaceC11225s, InterfaceC11225s<?> interfaceC11225s2) {
            this.f52694a = interfaceC11225s;
            this.f52695b = interfaceC11225s2;
        }
    }

    public CameraUseCaseAdapter(LinkedHashSet<InterfaceC34196Lb0> linkedHashSet, InterfaceC43988kb0 interfaceC43988kb0, InterfaceC51695xb0 interfaceC51695xb0, InterfaceC36578Vf6 interfaceC36578Vf6) {
        this.f52677b = linkedHashSet.iterator().next();
        LinkedHashSet<InterfaceC34196Lb0> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.f52678c = linkedHashSet2;
        this.f52681f = new C11227a(linkedHashSet2);
        this.f52684i = interfaceC43988kb0;
        this.f52679d = interfaceC51695xb0;
        this.f52680e = interfaceC36578Vf6;
    }

    /* renamed from: J */
    public static boolean m69259J(AbstractC11253p abstractC11253p) {
        return abstractC11253p instanceof C11164h;
    }

    /* renamed from: K */
    public static boolean m69258K(AbstractC11253p abstractC11253p) {
        return abstractC11253p instanceof C11236l;
    }

    /* renamed from: L */
    public static boolean m69257L(AbstractC11253p abstractC11253p) {
        return abstractC11253p instanceof C52202yR5;
    }

    /* renamed from: M */
    public static /* synthetic */ void m69256M(Surface surface, SurfaceTexture surfaceTexture, C11243o.AbstractC11250g abstractC11250g) {
        surface.release();
        surfaceTexture.release();
    }

    /* renamed from: N */
    public static /* synthetic */ void m69255N(C11243o c11243o) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(c11243o.m69105n().getWidth(), c11243o.m69105n().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        c11243o.m69122A(surface, C31631Ac0.m115449a(), new InterfaceC48378rz0() { // from class: tc0
            @Override // p000.InterfaceC48378rz0
            public final void accept(Object obj) {
                CameraUseCaseAdapter.m69256M(surface, surfaceTexture, (C11243o.AbstractC11250g) obj);
            }
        });
    }

    /* renamed from: R */
    public static List<AbstractC52288yb0> m69251R(List<AbstractC52288yb0> list, Collection<AbstractC11253p> collection) {
        boolean z;
        ArrayList arrayList = new ArrayList(list);
        for (AbstractC11253p abstractC11253p : collection) {
            abstractC11253p.m69073N(null);
            for (AbstractC52288yb0 abstractC52288yb0 : list) {
                if (abstractC11253p.m69046x(abstractC52288yb0.m3208e())) {
                    if (abstractC11253p.m69057k() == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    HZ3.m103728j(z, abstractC11253p + " already has effect" + abstractC11253p.m69057k());
                    abstractC11253p.m69073N(abstractC52288yb0);
                    arrayList.remove(abstractC52288yb0);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: T */
    public static void m69249T(List<AbstractC52288yb0> list, Collection<AbstractC11253p> collection, Collection<AbstractC11253p> collection2) {
        List<AbstractC52288yb0> m69251R = m69251R(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List<AbstractC52288yb0> m69251R2 = m69251R(m69251R, arrayList);
        if (m69251R2.size() > 0) {
            C33928Jx2.m99522l("CameraUseCaseAdapter", "Unused effects: " + m69251R2);
        }
    }

    /* renamed from: r */
    public static Collection<AbstractC11253p> m69238r(Collection<AbstractC11253p> collection, AbstractC11253p abstractC11253p, C52202yR5 c52202yR5) {
        ArrayList arrayList = new ArrayList(collection);
        if (abstractC11253p != null) {
            arrayList.add(abstractC11253p);
        }
        if (c52202yR5 != null) {
            arrayList.add(c52202yR5);
            arrayList.removeAll(c52202yR5.m3487Y());
        }
        return arrayList;
    }

    /* renamed from: t */
    public static Matrix m69236t(Rect rect, Size size) {
        boolean z;
        if (rect.width() > 0 && rect.height() > 0) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    /* renamed from: z */
    public static C11227a m69230z(LinkedHashSet<InterfaceC34196Lb0> linkedHashSet) {
        return new C11227a(linkedHashSet);
    }

    /* renamed from: A */
    public C11227a m69268A() {
        return this.f52681f;
    }

    /* renamed from: B */
    public final Map<AbstractC11253p, C11228b> m69267B(Collection<AbstractC11253p> collection, InterfaceC36578Vf6 interfaceC36578Vf6, InterfaceC36578Vf6 interfaceC36578Vf62) {
        HashMap hashMap = new HashMap();
        for (AbstractC11253p abstractC11253p : collection) {
            hashMap.put(abstractC11253p, new C11228b(abstractC11253p.mo3483j(false, interfaceC36578Vf6), abstractC11253p.mo3483j(true, interfaceC36578Vf62)));
        }
        return hashMap;
    }

    /* renamed from: C */
    public final int m69266C(boolean z) {
        int i;
        synchronized (this.f52688m) {
            Iterator<AbstractC52288yb0> it = this.f52686k.iterator();
            AbstractC52288yb0 abstractC52288yb0 = null;
            while (true) {
                i = 0;
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC52288yb0 next = it.next();
                if (VY5.m79748d(next.m3208e()) > 1) {
                    if (abstractC52288yb0 == null) {
                        z2 = true;
                    }
                    HZ3.m103728j(z2, "Can only have one sharing effect.");
                    abstractC52288yb0 = next;
                }
            }
            if (abstractC52288yb0 != null) {
                i = abstractC52288yb0.m3208e();
            }
            if (z) {
                i |= 3;
            }
        }
        return i;
    }

    /* renamed from: D */
    public final Set<AbstractC11253p> m69265D(Collection<AbstractC11253p> collection, boolean z) {
        HashSet hashSet = new HashSet();
        int m69266C = m69266C(z);
        for (AbstractC11253p abstractC11253p : collection) {
            HZ3.m103736b(!m69257L(abstractC11253p), "Only support one level of sharing for now.");
            if (abstractC11253p.m69046x(m69266C)) {
                hashSet.add(abstractC11253p);
            }
        }
        return hashSet;
    }

    /* renamed from: E */
    public List<AbstractC11253p> m69264E() {
        ArrayList arrayList;
        synchronized (this.f52688m) {
            arrayList = new ArrayList(this.f52682g);
        }
        return arrayList;
    }

    /* renamed from: F */
    public final boolean m69263F() {
        boolean z;
        synchronized (this.f52688m) {
            if (this.f52687l == C38634bb0.m64299a()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: G */
    public final boolean m69262G() {
        boolean z;
        synchronized (this.f52688m) {
            z = true;
            if (this.f52687l.m69455E() != 1) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: H */
    public final boolean m69261H(Collection<AbstractC11253p> collection) {
        boolean z = false;
        boolean z2 = false;
        for (AbstractC11253p abstractC11253p : collection) {
            if (m69258K(abstractC11253p)) {
                z = true;
            } else if (m69259J(abstractC11253p)) {
                z2 = true;
            }
        }
        if (!z || z2) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public final boolean m69260I(Collection<AbstractC11253p> collection) {
        boolean z = false;
        boolean z2 = false;
        for (AbstractC11253p abstractC11253p : collection) {
            if (m69258K(abstractC11253p)) {
                z2 = true;
            } else if (m69259J(abstractC11253p)) {
                z = true;
            }
        }
        if (!z || z2) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public void m69254O(Collection<AbstractC11253p> collection) {
        synchronized (this.f52688m) {
            ArrayList arrayList = new ArrayList(this.f52682g);
            arrayList.removeAll(collection);
            m69248U(arrayList);
        }
    }

    /* renamed from: P */
    public final void m69253P() {
        synchronized (this.f52688m) {
            if (this.f52690o != null) {
                this.f52677b.mo4462k().mo16398f(this.f52690o);
            }
        }
    }

    /* renamed from: Q */
    public void m69252Q(List<AbstractC52288yb0> list) {
        synchronized (this.f52688m) {
            this.f52686k = list;
        }
    }

    /* renamed from: S */
    public void m69250S(C32717Es6 c32717Es6) {
        synchronized (this.f52688m) {
            this.f52685j = c32717Es6;
        }
    }

    /* renamed from: U */
    public void m69248U(Collection<AbstractC11253p> collection) {
        m69247V(collection, false);
    }

    /* renamed from: V */
    public void m69247V(Collection<AbstractC11253p> collection, boolean z) {
        int i;
        boolean z2;
        synchronized (this.f52688m) {
            AbstractC11253p m69237s = m69237s(collection);
            C52202yR5 m69232x = m69232x(collection, z);
            Collection<AbstractC11253p> m69238r = m69238r(collection, m69237s, m69232x);
            ArrayList<AbstractC11253p> arrayList = new ArrayList(m69238r);
            arrayList.removeAll(this.f52683h);
            ArrayList arrayList2 = new ArrayList(m69238r);
            arrayList2.retainAll(this.f52683h);
            ArrayList<AbstractC11253p> arrayList3 = new ArrayList(this.f52683h);
            arrayList3.removeAll(m69238r);
            Map<AbstractC11253p, C11228b> m69267B = m69267B(arrayList, this.f52687l.m69453j(), this.f52680e);
            try {
                if (this.f52684i.mo13004c() == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = 2;
                try {
                    Map<AbstractC11253p, BR5> m69235u = m69235u(z2, this.f52677b.mo4467d(), arrayList, arrayList2, m69267B);
                    m69246W(m69235u, m69238r);
                    m69249T(this.f52686k, m69238r, collection);
                    for (AbstractC11253p abstractC11253p : arrayList3) {
                        abstractC11253p.m69069R(this.f52677b);
                    }
                    this.f52677b.mo4459p(arrayList3);
                    for (AbstractC11253p abstractC11253p2 : arrayList) {
                        C11228b c11228b = m69267B.get(abstractC11253p2);
                        Objects.requireNonNull(c11228b);
                        abstractC11253p2.m69065b(this.f52677b, c11228b.f52694a, c11228b.f52695b);
                        abstractC11253p2.m69067T((BR5) HZ3.m103731g(m69235u.get(abstractC11253p2)));
                    }
                    if (this.f52689n) {
                        this.f52677b.mo4460o(arrayList);
                    }
                    for (AbstractC11253p abstractC11253p3 : arrayList) {
                        abstractC11253p3.m69077D();
                    }
                    this.f52682g.clear();
                    this.f52682g.addAll(collection);
                    this.f52683h.clear();
                    this.f52683h.addAll(m69238r);
                    this.f52691p = m69237s;
                    this.f52692q = m69232x;
                } catch (IllegalArgumentException e) {
                    e = e;
                    if (!z && m69263F() && this.f52684i.mo13004c() != i) {
                        m69247V(collection, true);
                        return;
                    }
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                i = 2;
            }
        }
    }

    /* renamed from: W */
    public final void m69246W(Map<AbstractC11253p, BR5> map, Collection<AbstractC11253p> collection) {
        synchronized (this.f52688m) {
            if (this.f52685j != null) {
                Integer valueOf = Integer.valueOf(this.f52677b.mo4467d().mo100139b());
                boolean z = true;
                if (valueOf == null) {
                    C33928Jx2.m99522l("CameraUseCaseAdapter", "The lens facing is null, probably an external.");
                } else if (valueOf.intValue() != 0) {
                    z = false;
                }
                Map<AbstractC11253p, Rect> m104648a = C33185Gs6.m104648a(this.f52677b.mo4462k().mo16394h(), z, this.f52685j.m108275a(), this.f52677b.mo4467d().mo100138e(this.f52685j.m108273c()), this.f52685j.m108272d(), this.f52685j.m108274b(), map);
                for (AbstractC11253p abstractC11253p : collection) {
                    abstractC11253p.mo69070Q((Rect) HZ3.m103731g(m104648a.get(abstractC11253p)));
                    abstractC11253p.mo69072O(m69236t(this.f52677b.mo4462k().mo16394h(), ((BR5) HZ3.m103731g(map.get(abstractC11253p))).mo31669c()));
                }
            }
        }
    }

    @Override // p000.InterfaceC45757na0
    /* renamed from: a */
    public CameraControl mo23506a() {
        return this.f52677b.mo4462k();
    }

    @Override // p000.InterfaceC45757na0
    /* renamed from: b */
    public InterfaceC33728Jb0 mo23505b() {
        return this.f52677b.mo4467d();
    }

    /* renamed from: f */
    public void m69244f(InterfaceC11191c interfaceC11191c) {
        synchronized (this.f52688m) {
            if (interfaceC11191c == null) {
                interfaceC11191c = C38634bb0.m64299a();
            }
            if (!this.f52682g.isEmpty() && !this.f52687l.mo64298v().equals(interfaceC11191c.mo64298v())) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            this.f52687l = interfaceC11191c;
            this.f52677b.mo96609f(interfaceC11191c);
        }
    }

    /* renamed from: h */
    public void m69242h(Collection<AbstractC11253p> collection) throws CameraException {
        synchronized (this.f52688m) {
            ArrayList arrayList = new ArrayList(this.f52682g);
            arrayList.removeAll(collection);
            arrayList.addAll(collection);
            try {
                m69248U(arrayList);
            } catch (IllegalArgumentException e) {
                throw new CameraException(e.getMessage());
            }
        }
    }

    /* renamed from: i */
    public void m69241i() {
        synchronized (this.f52688m) {
            if (!this.f52689n) {
                this.f52677b.mo4460o(this.f52683h);
                m69253P();
                for (AbstractC11253p abstractC11253p : this.f52683h) {
                    abstractC11253p.m69077D();
                }
                this.f52689n = true;
            }
        }
    }

    /* renamed from: m */
    public final void m69240m() {
        synchronized (this.f52688m) {
            CameraControlInternal mo4462k = this.f52677b.mo4462k();
            this.f52690o = mo4462k.mo16390j();
            mo4462k.mo16388k();
        }
    }

    /* renamed from: n */
    public void m69239n(boolean z) {
        this.f52677b.mo96607n(z);
    }

    /* renamed from: s */
    public AbstractC11253p m69237s(Collection<AbstractC11253p> collection) {
        AbstractC11253p abstractC11253p;
        synchronized (this.f52688m) {
            if (m69262G()) {
                if (m69260I(collection)) {
                    if (m69258K(this.f52691p)) {
                        abstractC11253p = this.f52691p;
                    } else {
                        abstractC11253p = m69233w();
                    }
                } else if (m69261H(collection)) {
                    if (m69259J(this.f52691p)) {
                        abstractC11253p = this.f52691p;
                    } else {
                        abstractC11253p = m69234v();
                    }
                }
            }
            abstractC11253p = null;
        }
        return abstractC11253p;
    }

    /* renamed from: u */
    public final Map<AbstractC11253p, BR5> m69235u(boolean z, InterfaceC33962Kb0 interfaceC33962Kb0, Collection<AbstractC11253p> collection, Collection<AbstractC11253p> collection2, Map<AbstractC11253p, C11228b> map) {
        ArrayList arrayList = new ArrayList();
        String mo98721a = interfaceC33962Kb0.mo98721a();
        HashMap hashMap = new HashMap();
        for (AbstractC11253p abstractC11253p : collection2) {
            arrayList.add(AbstractC28413sp.m13611a(this.f52679d.mo4974a(z, mo98721a, abstractC11253p.m69056l(), abstractC11253p.m69062e()), abstractC11253p.m69056l(), abstractC11253p.m69062e(), abstractC11253p.m69058i().m69274M(null)));
            hashMap.put(abstractC11253p, abstractC11253p.m69063d());
        }
        if (!collection.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            C48681sV5 c48681sV5 = new C48681sV5((InterfaceC33962Kb0) mo23505b());
            for (AbstractC11253p abstractC11253p2 : collection) {
                C11228b c11228b = map.get(abstractC11253p2);
                InterfaceC11225s<?> m69044z = abstractC11253p2.m69044z(interfaceC33962Kb0, c11228b.f52694a, c11228b.f52695b);
                hashMap2.put(m69044z, abstractC11253p2);
                hashMap3.put(m69044z, c48681sV5.m14131f(m69044z));
            }
            Map<InterfaceC11225s<?>, BR5> mo4973b = this.f52679d.mo4973b(z, mo98721a, arrayList, hashMap3);
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put((AbstractC11253p) entry.getValue(), mo4973b.get(entry.getKey()));
            }
        }
        return hashMap;
    }

    /* renamed from: v */
    public final C11164h m69234v() {
        return new C11164h.C11171g().m69510n("ImageCapture-Extra").m69519e();
    }

    /* renamed from: w */
    public final C11236l m69233w() {
        C11236l m69156e = new C11236l.C11237a().m69150k("Preview-Extra").m69156e();
        m69156e.m69162i0(new C11236l.InterfaceC11239c() { // from class: sc0
            @Override // androidx.camera.core.C11236l.InterfaceC11239c
            /* renamed from: a */
            public final void mo13949a(C11243o c11243o) {
                CameraUseCaseAdapter.m69255N(c11243o);
            }
        });
        return m69156e;
    }

    /* renamed from: x */
    public final C52202yR5 m69232x(Collection<AbstractC11253p> collection, boolean z) {
        synchronized (this.f52688m) {
            Set<AbstractC11253p> m69265D = m69265D(collection, z);
            if (m69265D.size() < 2) {
                return null;
            }
            C52202yR5 c52202yR5 = this.f52692q;
            if (c52202yR5 != null && c52202yR5.m3487Y().equals(m69265D)) {
                C52202yR5 c52202yR52 = this.f52692q;
                Objects.requireNonNull(c52202yR52);
                return c52202yR52;
            }
            return new C52202yR5(this.f52677b, m69265D, this.f52680e);
        }
    }

    /* renamed from: y */
    public void m69231y() {
        synchronized (this.f52688m) {
            if (this.f52689n) {
                this.f52677b.mo4459p(new ArrayList(this.f52683h));
                m69240m();
                this.f52689n = false;
            }
        }
    }
}
