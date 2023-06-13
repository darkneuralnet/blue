package com.google.p034ar.sceneform.rendering;

import com.google.android.filament.Box;
import com.google.android.filament.Entity;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.VertexBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
/* renamed from: com.google.ar.sceneform.rendering.f */
/* loaded from: classes6.dex */
public class C18046f implements InterfaceC18034a {

    /* renamed from: e */
    public IntBuffer f73961e;

    /* renamed from: f */
    public FloatBuffer f73962f;

    /* renamed from: g */
    public FloatBuffer f73963g;

    /* renamed from: h */
    public FloatBuffer f73964h;

    /* renamed from: i */
    public FloatBuffer f73965i;

    /* renamed from: j */
    public IndexBuffer f73966j;

    /* renamed from: k */
    public VertexBuffer f73967k;

    /* renamed from: a */
    public final C35444Qj6 f73957a = C35444Qj6.m88118x();

    /* renamed from: b */
    public final C35444Qj6 f73958b = C35444Qj6.m88118x();

    /* renamed from: c */
    public float f73959c = 1.0f;

    /* renamed from: d */
    public final C35444Qj6 f73960d = C35444Qj6.m88118x();

    /* renamed from: l */
    public final ArrayList<C18047a> f73968l = new ArrayList<>();

    /* renamed from: com.google.ar.sceneform.rendering.f$a */
    /* loaded from: classes6.dex */
    public static class C18047a {

        /* renamed from: a */
        public int f73969a;

        /* renamed from: b */
        public int f73970b;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: a */
    public void mo48286a(C35444Qj6 c35444Qj6) {
        this.f73957a.m88127o(c35444Qj6);
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: b */
    public void mo48285b(FloatBuffer floatBuffer) {
        this.f73965i = floatBuffer;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: c */
    public void mo48284c(IndexBuffer indexBuffer) {
        this.f73966j = indexBuffer;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: d */
    public IndexBuffer mo48283d() {
        return this.f73966j;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: e */
    public VertexBuffer mo48282e() {
        return this.f73967k;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: f */
    public FloatBuffer mo48281f() {
        return this.f73962f;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: g */
    public void mo48280g(FloatBuffer floatBuffer) {
        this.f73963g = floatBuffer;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: h */
    public void mo48279h(C35444Qj6 c35444Qj6) {
        this.f73958b.m88127o(c35444Qj6);
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: i */
    public C35444Qj6 mo48278i() {
        return this.f73958b.m88129m(2.0f);
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: j */
    public ArrayList<C18047a> mo48277j() {
        return this.f73968l;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: k */
    public float mo48276k() {
        return this.f73959c;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: l */
    public C35444Qj6 mo48275l() {
        return new C35444Qj6(this.f73960d);
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: m */
    public C35444Qj6 mo48274m() {
        return new C35444Qj6(this.f73957a);
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: n */
    public void mo48273n(VertexBuffer vertexBuffer) {
        this.f73967k = vertexBuffer;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: o */
    public void mo48272o(FloatBuffer floatBuffer) {
        this.f73964h = floatBuffer;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: p */
    public void mo48271p(C46584ox4 c46584ox4, @Entity int i) {
        AbstractC18039d m20224n = c46584ox4.m20224n();
        InterfaceC18034a m48338l = m20224n.m48338l();
        ArrayList<MaterialInstance> m48341i = m20224n.m48341i();
        RenderableManager m43779h = C39939dl1.m43779h();
        int renderableManager = m43779h.getInstance(i);
        int size = m48338l.mo48277j().size();
        if (renderableManager != 0 && m43779h.getPrimitiveCount(renderableManager) == size) {
            m43779h.setPriority(renderableManager, m20224n.m48339k());
            m43779h.setCastShadows(renderableManager, m20224n.m48336n());
            m43779h.setReceiveShadows(renderableManager, m20224n.m48335o());
        } else {
            if (renderableManager != 0) {
                try {
                    m43779h.destroy(i);
                } catch (Exception unused) {
                }
            }
            RenderableManager.Builder receiveShadows = new RenderableManager.Builder(size).priority(m20224n.m48339k()).castShadows(m20224n.m48336n()).receiveShadows(m20224n.m48335o());
            m48287x(receiveShadows);
            C40531el1.m42579a(receiveShadows, i);
            renderableManager = m43779h.getInstance(i);
            if (renderableManager == 0) {
                throw new AssertionError("Unable to create RenderableInstance.");
            }
        }
        int i2 = renderableManager;
        C35444Qj6 mo48264w = m48338l.mo48264w();
        C35444Qj6 mo48274m = m48338l.mo48274m();
        m43779h.setAxisAlignedBoundingBox(i2, new Box(mo48274m.f30802a, mo48274m.f30803b, mo48274m.f30804c, mo48264w.f30802a, mo48264w.f30803b, mo48264w.f30804c));
        if (m48341i.size() == size) {
            RenderableManager.PrimitiveType primitiveType = RenderableManager.PrimitiveType.TRIANGLES;
            for (int i3 = 0; i3 < size; i3++) {
                C18047a c18047a = m48338l.mo48277j().get(i3);
                VertexBuffer mo48282e = m48338l.mo48282e();
                IndexBuffer mo48283d = m48338l.mo48283d();
                if (mo48282e != null && mo48283d != null) {
                    int i4 = c18047a.f73969a;
                    m43779h.setGeometryAt(i2, i3, primitiveType, mo48282e, mo48283d, i4, c18047a.f73970b - i4);
                    m43779h.setMaterialInstanceAt(i2, i3, m48341i.get(i3));
                } else {
                    throw new AssertionError("Internal Error: Failed to get vertex or index buffer");
                }
            }
            return;
        }
        throw new AssertionError("Material Bindings are out of sync with meshes.");
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: q */
    public FloatBuffer mo48270q() {
        return this.f73963g;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: r */
    public FloatBuffer mo48269r() {
        return this.f73964h;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: s */
    public void mo48268s(IntBuffer intBuffer) {
        this.f73961e = intBuffer;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: t */
    public void mo48267t(FloatBuffer floatBuffer) {
        this.f73962f = floatBuffer;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: u */
    public FloatBuffer mo48266u() {
        return this.f73965i;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: v */
    public IntBuffer mo48265v() {
        return this.f73961e;
    }

    @Override // com.google.p034ar.sceneform.rendering.InterfaceC18034a
    /* renamed from: w */
    public C35444Qj6 mo48264w() {
        return new C35444Qj6(this.f73958b);
    }

    /* renamed from: x */
    public final void m48287x(RenderableManager.Builder builder) {
    }
}
