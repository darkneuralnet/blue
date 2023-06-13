package p000;

import android.net.Uri;
import android.util.Log;
import com.google.android.filament.Box;
import com.google.android.filament.Entity;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.TransformManager;
import com.google.android.filament.gltfio.Animator;
import com.google.android.filament.gltfio.FilamentAsset;
import com.google.p034ar.sceneform.rendering.AbstractC18039d;
import com.google.p034ar.sceneform.rendering.C18048g;
import com.google.p034ar.sceneform.rendering.InterfaceC18034a;
import io.github.sceneview.SceneView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.function.Function;
/* renamed from: ox4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C46584ox4 implements InterfaceC29273ue {

    /* renamed from: o */
    public static final String f102812o = "ox4";

    /* renamed from: a */
    public final InterfaceC46112o96 f102813a;

    /* renamed from: b */
    public final AbstractC18039d f102814b;
    @Entity

    /* renamed from: c */
    public int f102815c;
    @Entity

    /* renamed from: d */
    public int f102816d;

    /* renamed from: f */
    public FilamentAsset f102818f;

    /* renamed from: g */
    public Animator f102819g;

    /* renamed from: l */
    public ArrayList<MaterialInstance> f102824l;

    /* renamed from: m */
    public ArrayList<String> f102825m;

    /* renamed from: n */
    public C43270jN2 f102826n;

    /* renamed from: e */
    public int f102817e = 0;

    /* renamed from: h */
    public ArrayList<RU2> f102820h = new ArrayList<>();

    /* renamed from: i */
    public int f102821i = 4;

    /* renamed from: j */
    public boolean f102822j = true;

    /* renamed from: k */
    public boolean f102823k = true;

    public C46584ox4(InterfaceC46112o96 interfaceC46112o96, AbstractC18039d abstractC18039d) {
        this.f102815c = 0;
        this.f102816d = 0;
        DZ3.m110173d(interfaceC46112o96, "Parameter \"transformProvider\" was null.");
        DZ3.m110173d(abstractC18039d, "Parameter \"renderable\" was null.");
        this.f102813a = interfaceC46112o96;
        this.f102814b = abstractC18039d;
        this.f102824l = new ArrayList<>(abstractC18039d.m48341i());
        this.f102825m = new ArrayList<>(abstractC18039d.m48340j());
        this.f102815c = m20233e();
        C43270jN2 m20225m = m20225m();
        if (m20225m != null) {
            this.f102816d = m20234d(this.f102815c, m20225m);
        }
        m20232f();
        m20235c();
    }

    @Entity
    /* renamed from: d */
    public static int m20234d(@Entity int i, C43270jN2 c43270jN2) {
        int create = C39939dl1.m43783d().create();
        C39939dl1.m43777j().create(create, C39939dl1.m43777j().getInstance(i), c43270jN2.f92611a);
        return create;
    }

    @Entity
    /* renamed from: e */
    public static int m20233e() {
        int create = C39939dl1.m43783d().create();
        C39939dl1.m43777j().create(create);
        return create;
    }

    @Override // p000.InterfaceC29273ue
    /* renamed from: b */
    public boolean mo9930b(RU2 ru2) {
        return false;
    }

    /* renamed from: c */
    public void m20235c() {
        String[] resourceUris;
        if (this.f102814b.m48338l() instanceof C18048g) {
            C18048g c18048g = (C18048g) this.f102814b.m48338l();
            FilamentAsset createAsset = C39939dl1.m43785b().createAsset(c18048g.f73972b);
            if (createAsset != null) {
                if (this.f102814b.f73933i == null) {
                    Box boundingBox = createAsset.getBoundingBox();
                    float[] halfExtent = boundingBox.getHalfExtent();
                    float[] center = boundingBox.getCenter();
                    this.f102814b.f73933i = new C38300b10(new C35444Qj6(halfExtent[0], halfExtent[1], halfExtent[2]).m88129m(2.0f), new C35444Qj6(center[0], center[1], center[2]));
                }
                Function<String, Uri> function = c18048g.f73974d;
                for (String str : createAsset.getResourceUris()) {
                    if (function == null) {
                        Log.e(f102812o, "Failed to download uri " + str + " no url resolver.");
                    } else {
                        Uri apply = function.apply(str);
                        try {
                            C39939dl1.m43778i().addResourceData(str, ByteBuffer.wrap(C49439tm5.m11793b(C42391ht2.m35649k(c18048g.f73971a, apply))));
                        } catch (Exception e) {
                            Log.e(f102812o, "Failed to download data uri " + apply, e);
                        }
                    }
                }
                if (this.f102814b.f73926b) {
                    C39939dl1.m43778i().asyncBeginLoad(createAsset);
                } else {
                    C39939dl1.m43778i().loadResources(createAsset);
                }
                RenderableManager m43779h = C39939dl1.m43779h();
                this.f102824l.clear();
                this.f102825m.clear();
                for (int i : createAsset.getEntities()) {
                    int renderableManager = m43779h.getInstance(i);
                    if (renderableManager != 0) {
                        m43779h.setScreenSpaceContactShadows(renderableManager, true);
                        MaterialInstance materialInstanceAt = m43779h.getMaterialInstanceAt(renderableManager, 0);
                        this.f102825m.add(materialInstanceAt.getName());
                        this.f102824l.add(materialInstanceAt);
                    }
                }
                TransformManager m43777j = C39939dl1.m43777j();
                int transformManager = m43777j.getInstance(createAsset.getRoot());
                int i2 = this.f102816d;
                if (i2 == 0) {
                    i2 = this.f102815c;
                }
                m43777j.setParent(transformManager, m43777j.getInstance(i2));
                this.f102818f = createAsset;
                m20218t(this.f102814b.m48339k());
                m20217u(this.f102814b.m48336n());
                m20216v(this.f102814b.m48335o());
                this.f102819g = createAsset.getInstance().getAnimator();
                this.f102820h = new ArrayList<>();
                for (int i3 = 0; i3 < this.f102819g.getAnimationCount(); i3++) {
                    this.f102820h.add(new RU2(this, this.f102819g.getAnimationName(i3), i3, this.f102819g.getAnimationDuration(i3), m20224n().m48346c()));
                }
                return;
            }
            throw new IllegalStateException("Failed to load gltf");
        }
    }

    /* renamed from: f */
    public void m20232f() {
    }

    /* renamed from: g */
    public void m20231g() {
        FilamentAsset filamentAsset = this.f102818f;
        if (filamentAsset != null) {
            try {
                VU2.m79846a(filamentAsset);
            } catch (Exception unused) {
            }
            this.f102818f = null;
        }
        RenderableManager m43779h = C39939dl1.m43779h();
        int i = this.f102816d;
        if (i != 0) {
            try {
                m43779h.destroy(i);
            } catch (Exception unused2) {
            }
            this.f102816d = 0;
        }
        int i2 = this.f102815c;
        if (i2 != 0) {
            try {
                m43779h.destroy(i2);
            } catch (Exception unused3) {
            }
            this.f102815c = 0;
        }
    }

    /* renamed from: h */
    public RU2 m20230h(int i) {
        DZ3.m110175b(i, m20229i(), "No animation found at the given index");
        return this.f102820h.get(i);
    }

    /* renamed from: i */
    public int m20229i() {
        return this.f102820h.size();
    }

    @Entity
    /* renamed from: j */
    public int m20228j() {
        return this.f102815c;
    }

    /* renamed from: k */
    public Animator m20227k() {
        return this.f102819g;
    }

    /* renamed from: l */
    public FilamentAsset m20226l() {
        return this.f102818f;
    }

    /* renamed from: m */
    public C43270jN2 m20225m() {
        C43270jN2 c43270jN2 = this.f102826n;
        if (c43270jN2 != null) {
            return c43270jN2;
        }
        InterfaceC18034a m48338l = this.f102814b.m48338l();
        float mo48276k = m48338l.mo48276k();
        C35444Qj6 mo48275l = m48338l.mo48275l();
        if (mo48276k == 1.0f && C35444Qj6.m88137e(mo48275l, C35444Qj6.m88118x())) {
            return null;
        }
        C43270jN2 c43270jN22 = new C43270jN2();
        this.f102826n = c43270jN22;
        c43270jN22.m30750c(mo48276k);
        this.f102826n.m30748e(mo48275l);
        return this.f102826n;
    }

    /* renamed from: n */
    public AbstractC18039d m20224n() {
        return this.f102814b;
    }

    @Entity
    /* renamed from: o */
    public int m20223o() {
        int i = this.f102816d;
        return i == 0 ? this.f102815c : i;
    }

    /* renamed from: p */
    public C43270jN2 m20222p() {
        return this.f102814b.mo48246e(this.f102813a.mo21708y());
    }

    /* renamed from: q */
    public void m20221q(SceneView sceneView) {
        this.f102814b.mo48244r(sceneView);
        C32378Dh0 m48344f = this.f102814b.m48344f();
        if (m48344f.m110008a(this.f102817e)) {
            InterfaceC18034a m48338l = this.f102814b.m48338l();
            m20215w(m48338l);
            m48338l.mo48271p(this, m20223o());
            this.f102817e = m48344f.m110007b();
            m20213y();
        } else if (m20214x(false)) {
            m20213y();
        }
    }

    /* renamed from: r */
    public void m20220r(int i, int i2) {
        RenderableManager m43779h = C39939dl1.m43779h();
        m43779h.setBlendOrderAt(m43779h.getInstance(m20223o()), i, i2);
    }

    /* renamed from: s */
    public void m20219s(TransformManager transformManager, float[] fArr) {
        transformManager.setTransform(transformManager.getInstance(this.f102815c), fArr);
    }

    /* renamed from: t */
    public void m20218t(int i) {
        this.f102821i = Math.min(7, Math.max(0, i));
        RenderableManager m43779h = C39939dl1.m43779h();
        for (int i2 : m20226l().getEntities()) {
            int renderableManager = m43779h.getInstance(i2);
            if (renderableManager != 0) {
                m43779h.setPriority(renderableManager, this.f102821i);
            }
        }
    }

    /* renamed from: u */
    public void m20217u(boolean z) {
        this.f102822j = z;
        RenderableManager m43779h = C39939dl1.m43779h();
        int renderableManager = m43779h.getInstance(m20228j());
        if (renderableManager != 0) {
            m43779h.setCastShadows(renderableManager, z);
        }
        FilamentAsset m20226l = m20226l();
        if (m20226l == null) {
            return;
        }
        for (int i : m20226l.getEntities()) {
            int renderableManager2 = m43779h.getInstance(i);
            if (renderableManager2 != 0) {
                m43779h.setCastShadows(renderableManager2, z);
            }
        }
    }

    /* renamed from: v */
    public void m20216v(boolean z) {
        this.f102823k = z;
        RenderableManager m43779h = C39939dl1.m43779h();
        int renderableManager = m43779h.getInstance(m20228j());
        if (renderableManager != 0) {
            m43779h.setReceiveShadows(renderableManager, z);
        }
        FilamentAsset m20226l = m20226l();
        if (m20226l == null) {
            return;
        }
        for (int i : m20226l.getEntities()) {
            int renderableManager2 = m43779h.getInstance(i);
            if (renderableManager2 != 0) {
                m43779h.setReceiveShadows(renderableManager2, z);
            }
        }
    }

    /* renamed from: w */
    public final void m20215w(InterfaceC18034a interfaceC18034a) {
    }

    /* renamed from: x */
    public boolean m20214x(boolean z) {
        boolean z2 = false;
        for (int i = 0; i < m20229i(); i++) {
            RU2 m20230h = m20230h(i);
            if (z || m20230h.m86714l()) {
                if (m20227k() != null) {
                    m20227k().applyAnimation(i, m20230h.m86715k());
                }
                m20230h.m86713m(false);
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: y */
    public final void m20213y() {
        if (m20227k() != null) {
            m20227k().updateBoneMatrices();
        }
    }
}
