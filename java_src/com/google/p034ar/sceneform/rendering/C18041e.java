package com.google.p034ar.sceneform.rendering;

import com.google.android.filament.IndexBuffer;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.VertexBuffer;
import com.google.p034ar.sceneform.rendering.C18046f;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
/* renamed from: com.google.ar.sceneform.rendering.e */
/* loaded from: classes6.dex */
public class C18041e {

    /* renamed from: c */
    public static final C43270jN2 f73946c = new C43270jN2();

    /* renamed from: a */
    public List<C18049h> f73947a;

    /* renamed from: b */
    public List<C18044c> f73948b;

    /* renamed from: com.google.ar.sceneform.rendering.e$b */
    /* loaded from: classes6.dex */
    public static final class C18043b {

        /* renamed from: a */
        public List<C18049h> f73949a;

        /* renamed from: b */
        public List<C18044c> f73950b = new ArrayList();

        /* renamed from: c */
        public C18041e m48300c() {
            return new C18041e(this);
        }

        /* renamed from: d */
        public C18043b m48299d(List<C18049h> list) {
            this.f73949a = list;
            return this;
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.e$c */
    /* loaded from: classes6.dex */
    public static class C18044c {

        /* renamed from: a */
        public List<Integer> f73951a;

        /* renamed from: b */
        public MaterialInstance f73952b;

        /* renamed from: c */
        public String f73953c;

        /* renamed from: com.google.ar.sceneform.rendering.e$c$a */
        /* loaded from: classes6.dex */
        public static final class C18045a {

            /* renamed from: a */
            public List<Integer> f73954a;

            /* renamed from: b */
            public MaterialInstance f73955b;

            /* renamed from: c */
            public String f73956c;

            /* renamed from: d */
            public C18044c m48290d() {
                return new C18044c(this);
            }

            /* renamed from: e */
            public C18045a m48289e(MaterialInstance materialInstance) {
                this.f73955b = materialInstance;
                return this;
            }

            /* renamed from: f */
            public C18045a m48288f(List<Integer> list) {
                this.f73954a = list;
                return this;
            }
        }

        /* renamed from: a */
        public static C18045a m48298a() {
            return new C18045a();
        }

        /* renamed from: b */
        public MaterialInstance m48297b() {
            return this.f73952b;
        }

        /* renamed from: c */
        public String m48296c() {
            return this.f73953c;
        }

        /* renamed from: d */
        public List<Integer> m48295d() {
            return this.f73951a;
        }

        /* renamed from: e */
        public void m48294e(MaterialInstance materialInstance) {
            this.f73952b = materialInstance;
        }

        public C18044c(C18045a c18045a) {
            this.f73951a = (List) DZ3.m110174c(c18045a.f73954a);
            this.f73952b = (MaterialInstance) DZ3.m110174c(c18045a.f73955b);
            this.f73953c = c18045a.f73956c;
        }
    }

    /* renamed from: a */
    public static void m48312a(C47656qm0 c47656qm0, FloatBuffer floatBuffer) {
        floatBuffer.put(c47656qm0.f105765a);
        floatBuffer.put(c47656qm0.f105766b);
        floatBuffer.put(c47656qm0.f105767c);
        floatBuffer.put(c47656qm0.f105768d);
    }

    /* renamed from: b */
    public static void m48311b(C36549Vc4 c36549Vc4, FloatBuffer floatBuffer) {
        floatBuffer.put(c36549Vc4.f39340a);
        floatBuffer.put(c36549Vc4.f39341b);
        floatBuffer.put(c36549Vc4.f39342c);
        floatBuffer.put(c36549Vc4.f39343d);
    }

    /* renamed from: c */
    public static void m48310c(C35444Qj6 c35444Qj6, FloatBuffer floatBuffer) {
        floatBuffer.put(c35444Qj6.f30802a);
        floatBuffer.put(c35444Qj6.f30803b);
        floatBuffer.put(c35444Qj6.f30804c);
    }

    /* renamed from: g */
    public static C18043b m48306g() {
        return new C18043b();
    }

    /* renamed from: h */
    public static VertexBuffer m48305h(int i, EnumSet<VertexBuffer.VertexAttribute> enumSet) {
        int i2;
        VertexBuffer.Builder builder = new VertexBuffer.Builder();
        builder.vertexCount(i).bufferCount(enumSet.size());
        builder.attribute(VertexBuffer.VertexAttribute.POSITION, 0, VertexBuffer.AttributeType.FLOAT3, 0, 12);
        VertexBuffer.VertexAttribute vertexAttribute = VertexBuffer.VertexAttribute.TANGENTS;
        if (enumSet.contains(vertexAttribute)) {
            i2 = 1;
            builder.attribute(vertexAttribute, 1, VertexBuffer.AttributeType.FLOAT4, 0, 16);
        } else {
            i2 = 0;
        }
        VertexBuffer.VertexAttribute vertexAttribute2 = VertexBuffer.VertexAttribute.UV0;
        if (enumSet.contains(vertexAttribute2)) {
            i2++;
            builder.attribute(vertexAttribute2, i2, VertexBuffer.AttributeType.FLOAT2, 0, 8);
        }
        VertexBuffer.VertexAttribute vertexAttribute3 = VertexBuffer.VertexAttribute.COLOR;
        if (enumSet.contains(vertexAttribute3)) {
            builder.attribute(vertexAttribute3, i2 + 1, VertexBuffer.AttributeType.FLOAT4, 0, 16);
        }
        return C33383Ho6.m103422a(builder);
    }

    /* renamed from: j */
    public static C36549Vc4 m48303j(C35444Qj6 c35444Qj6) {
        C35444Qj6 m88132j;
        C35444Qj6 m88139c = C35444Qj6.m88139c(C35444Qj6.m88119w(), c35444Qj6);
        if (XM2.m77083a(C35444Qj6.m88138d(m88139c, m88139c), 0.0f)) {
            C35444Qj6 m88132j2 = C35444Qj6.m88139c(c35444Qj6, C35444Qj6.m88130l()).m88132j();
            m88132j = m88132j2;
            m88139c = C35444Qj6.m88139c(m88132j2, c35444Qj6).m88132j();
        } else {
            m88139c.m88127o(m88139c.m88132j());
            m88132j = C35444Qj6.m88139c(c35444Qj6, m88139c).m88132j();
        }
        C43270jN2 c43270jN2 = f73946c;
        float[] fArr = c43270jN2.f92611a;
        fArr[0] = m88139c.f30802a;
        fArr[1] = m88139c.f30803b;
        fArr[2] = m88139c.f30804c;
        fArr[4] = m88132j.f30802a;
        fArr[5] = m88132j.f30803b;
        fArr[6] = m88132j.f30804c;
        fArr[8] = c35444Qj6.f30802a;
        fArr[9] = c35444Qj6.f30803b;
        fArr[10] = c35444Qj6.f30804c;
        C36549Vc4 c36549Vc4 = new C36549Vc4();
        c43270jN2.m30752a(c36549Vc4);
        return c36549Vc4;
    }

    /* renamed from: d */
    public void m48309d(InterfaceC18034a interfaceC18034a, ArrayList<MaterialInstance> arrayList, ArrayList<String> arrayList2) {
        C18046f.C18047a c18047a;
        C31060zd.m1006c();
        m48308e(interfaceC18034a);
        m48307f(interfaceC18034a);
        arrayList.clear();
        arrayList2.clear();
        int i = 0;
        for (int i2 = 0; i2 < this.f73948b.size(); i2++) {
            C18044c c18044c = this.f73948b.get(i2);
            if (i2 < interfaceC18034a.mo48277j().size()) {
                c18047a = interfaceC18034a.mo48277j().get(i2);
            } else {
                c18047a = new C18046f.C18047a();
                interfaceC18034a.mo48277j().add(c18047a);
            }
            c18047a.f73969a = i;
            i += c18044c.m48295d().size();
            c18047a.f73970b = i;
            arrayList.add(c18044c.m48297b());
            String m48296c = c18044c.m48296c();
            if (m48296c == null) {
                m48296c = "";
            }
            arrayList2.add(m48296c);
        }
        while (interfaceC18034a.mo48277j().size() > this.f73948b.size()) {
            interfaceC18034a.mo48277j().remove(interfaceC18034a.mo48277j().size() - 1);
        }
    }

    /* renamed from: e */
    public final void m48308e(InterfaceC18034a interfaceC18034a) {
        int i = 0;
        for (int i2 = 0; i2 < this.f73948b.size(); i2++) {
            i += this.f73948b.get(i2).m48295d().size();
        }
        IntBuffer mo48265v = interfaceC18034a.mo48265v();
        if (mo48265v != null && mo48265v.capacity() >= i) {
            mo48265v.rewind();
        } else {
            mo48265v = IntBuffer.allocate(i);
            interfaceC18034a.mo48268s(mo48265v);
        }
        for (int i3 = 0; i3 < this.f73948b.size(); i3++) {
            List<Integer> m48295d = this.f73948b.get(i3).m48295d();
            for (int i4 = 0; i4 < m48295d.size(); i4++) {
                mo48265v.put(m48295d.get(i4).intValue());
            }
        }
        mo48265v.rewind();
        IndexBuffer mo48283d = interfaceC18034a.mo48283d();
        if (mo48283d == null || mo48283d.getIndexCount() < i) {
            if (mo48283d != null) {
                C49585u12.m11060b(mo48283d);
            }
            mo48283d = C49585u12.m11061a(new IndexBuffer.Builder().indexCount(i).bufferType(IndexBuffer.Builder.IndexType.UINT));
            interfaceC18034a.mo48284c(mo48283d);
        }
        C49585u12.m11058d(mo48283d, mo48265v, 0, i);
    }

    /* renamed from: f */
    public final void m48307f(InterfaceC18034a interfaceC18034a) {
        boolean z;
        int i;
        if (!this.f73947a.isEmpty()) {
            int size = this.f73947a.size();
            C18049h c18049h = this.f73947a.get(0);
            VertexBuffer.VertexAttribute vertexAttribute = VertexBuffer.VertexAttribute.POSITION;
            EnumSet of = EnumSet.of(vertexAttribute);
            if (c18049h.m48261c() != null) {
                of.add(VertexBuffer.VertexAttribute.TANGENTS);
            }
            c18049h.m48259e();
            if (c18049h.m48262b() != null) {
                of.add(VertexBuffer.VertexAttribute.COLOR);
            }
            VertexBuffer mo48282e = interfaceC18034a.mo48282e();
            if (mo48282e != null) {
                EnumSet of2 = EnumSet.of(vertexAttribute);
                if (interfaceC18034a.mo48270q() != null) {
                    of2.add(VertexBuffer.VertexAttribute.TANGENTS);
                }
                if (interfaceC18034a.mo48269r() != null) {
                    of2.add(VertexBuffer.VertexAttribute.UV0);
                }
                if (interfaceC18034a.mo48266u() != null) {
                    of2.add(VertexBuffer.VertexAttribute.COLOR);
                }
                if (of2.equals(of) && mo48282e.getVertexCount() >= size) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C33383Ho6.m103421b(mo48282e);
                }
            } else {
                z = true;
            }
            if (z) {
                mo48282e = m48305h(size, of);
                interfaceC18034a.mo48273n(mo48282e);
            }
            FloatBuffer mo48281f = interfaceC18034a.mo48281f();
            if (mo48281f != null && mo48281f.capacity() >= size * 3) {
                mo48281f.rewind();
            } else {
                mo48281f = FloatBuffer.allocate(size * 3);
                interfaceC18034a.mo48267t(mo48281f);
            }
            FloatBuffer mo48270q = interfaceC18034a.mo48270q();
            if (of.contains(VertexBuffer.VertexAttribute.TANGENTS) && (mo48270q == null || mo48270q.capacity() < size * 4)) {
                mo48270q = FloatBuffer.allocate(size * 4);
                interfaceC18034a.mo48280g(mo48270q);
            } else if (mo48270q != null) {
                mo48270q.rewind();
            }
            FloatBuffer mo48269r = interfaceC18034a.mo48269r();
            if (of.contains(VertexBuffer.VertexAttribute.UV0) && (mo48269r == null || mo48269r.capacity() < size * 2)) {
                mo48269r = FloatBuffer.allocate(size * 2);
                interfaceC18034a.mo48272o(mo48269r);
            } else if (mo48269r != null) {
                mo48269r.rewind();
            }
            FloatBuffer mo48266u = interfaceC18034a.mo48266u();
            if (of.contains(VertexBuffer.VertexAttribute.COLOR) && (mo48266u == null || mo48266u.capacity() < size * 4)) {
                mo48266u = FloatBuffer.allocate(size * 4);
                interfaceC18034a.mo48285b(mo48266u);
            } else if (mo48266u != null) {
                mo48266u.rewind();
            }
            C35444Qj6 c35444Qj6 = new C35444Qj6();
            C35444Qj6 c35444Qj62 = new C35444Qj6();
            C35444Qj6 m48260d = c18049h.m48260d();
            c35444Qj6.m88127o(m48260d);
            c35444Qj62.m88127o(m48260d);
            for (int i2 = 0; i2 < this.f73947a.size(); i2++) {
                C18049h c18049h2 = this.f73947a.get(i2);
                C35444Qj6 m48260d2 = c18049h2.m48260d();
                c35444Qj6.m88127o(C35444Qj6.m88133i(c35444Qj6, m48260d2));
                c35444Qj62.m88127o(C35444Qj6.m88134h(c35444Qj62, m48260d2));
                m48310c(m48260d2, mo48281f);
                if (mo48270q != null) {
                    C35444Qj6 m48261c = c18049h2.m48261c();
                    if (m48261c != null) {
                        m48311b(m48303j(m48261c), mo48270q);
                    } else {
                        throw new IllegalArgumentException("Missing normal: If any Vertex in a RenderableDescription has a normal, all vertices must have one.");
                    }
                }
                if (mo48269r == null) {
                    if (mo48266u != null) {
                        C47656qm0 m48262b = c18049h2.m48262b();
                        if (m48262b != null) {
                            m48312a(m48262b, mo48266u);
                        } else {
                            throw new IllegalArgumentException("Missing Color: If any Vertex in a RenderableDescription has a Color, all vertices must have one.");
                        }
                    }
                } else {
                    c18049h2.m48259e();
                    throw new IllegalArgumentException("Missing UV Coordinate: If any Vertex in a RenderableDescription has a UV Coordinate, all vertices must have one.");
                }
            }
            C35444Qj6 m88129m = C35444Qj6.m88120v(c35444Qj62, c35444Qj6).m88129m(0.5f);
            C35444Qj6 m88141a = C35444Qj6.m88141a(c35444Qj6, m88129m);
            interfaceC18034a.mo48279h(m88129m);
            interfaceC18034a.mo48286a(m88141a);
            if (mo48282e != null) {
                mo48281f.rewind();
                C33383Ho6.m103419d(mo48282e, 0, mo48281f, 0, size * 3);
                if (mo48270q != null) {
                    mo48270q.rewind();
                    C33383Ho6.m103419d(mo48282e, 1, mo48270q, 0, size * 4);
                    i = 1;
                } else {
                    i = 0;
                }
                if (mo48269r != null) {
                    mo48269r.rewind();
                    i++;
                    C33383Ho6.m103419d(mo48282e, i, mo48269r, 0, size * 2);
                }
                if (mo48266u != null) {
                    mo48266u.rewind();
                    C33383Ho6.m103419d(mo48282e, i + 1, mo48266u, 0, size * 4);
                    return;
                }
                return;
            }
            throw new AssertionError("VertexBuffer is null.");
        }
        throw new IllegalArgumentException("RenderableDescription must have at least one vertex.");
    }

    /* renamed from: i */
    public List<C18044c> m48304i() {
        return this.f73948b;
    }

    public C18041e(C18043b c18043b) {
        this.f73947a = (List) DZ3.m110174c(c18043b.f73949a);
        this.f73948b = (List) DZ3.m110174c(c18043b.f73950b);
    }
}
