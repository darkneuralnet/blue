package com.google.p034ar.sceneform.rendering;

import android.util.Log;
import android.view.View;
import com.google.p034ar.sceneform.rendering.C18053i;
import com.google.p034ar.sceneform.rendering.RenderViewToExternalTexture;
import io.github.sceneview.SceneView;
/* renamed from: com.google.ar.sceneform.rendering.i */
/* loaded from: classes6.dex */
public class C18053i extends AbstractC18039d {

    /* renamed from: s */
    public static final String f73981s = "i";

    /* renamed from: l */
    public C41209ft6 f73982l;

    /* renamed from: m */
    public final View f73983m;

    /* renamed from: n */
    public final C43270jN2 f73984n;

    /* renamed from: o */
    public EnumC18055b f73985o;

    /* renamed from: p */
    public EnumC18054a f73986p;

    /* renamed from: q */
    public boolean f73987q;

    /* renamed from: r */
    public final RenderViewToExternalTexture.InterfaceC18033a f73988r;

    /* renamed from: com.google.ar.sceneform.rendering.i$a */
    /* loaded from: classes6.dex */
    public enum EnumC18054a {
        LEFT,
        CENTER,
        RIGHT
    }

    /* renamed from: com.google.ar.sceneform.rendering.i$b */
    /* loaded from: classes6.dex */
    public enum EnumC18055b {
        BOTTOM,
        CENTER,
        TOP
    }

    public C18053i(C18053i c18053i) {
        super(c18053i);
        this.f73984n = new C43270jN2();
        this.f73985o = EnumC18055b.BOTTOM;
        this.f73986p = EnumC18054a.CENTER;
        RenderViewToExternalTexture.InterfaceC18033a interfaceC18033a = new RenderViewToExternalTexture.InterfaceC18033a() { // from class: dt6
            @Override // com.google.p034ar.sceneform.rendering.RenderViewToExternalTexture.InterfaceC18033a
            /* renamed from: a */
            public final void mo43534a(int i, int i2) {
                C18053i.this.m48250B(i, i2);
            }
        };
        this.f73988r = interfaceC18033a;
        this.f73983m = c18053i.f73983m;
        this.f73986p = c18053i.f73986p;
        this.f73985o = c18053i.f73985o;
        C41209ft6 c41209ft6 = (C41209ft6) DZ3.m110174c(c18053i.f73982l);
        this.f73982l = c41209ft6;
        c41209ft6.m40590a().m48371a(interfaceC18033a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m48250B(int i, int i2) {
        if (this.f73987q) {
            m48247E();
        }
    }

    @Override // com.google.p034ar.sceneform.rendering.AbstractC18039d
    /* renamed from: C */
    public C18053i mo48245p() {
        return new C18053i(this);
    }

    /* renamed from: D */
    public final void m48248D() {
        if (m48344f().m110006c() || ((C38300b10) this.f73933i) == null) {
            return;
        }
        m48338l();
        throw null;
    }

    /* renamed from: E */
    public final void m48247E() {
        this.f73983m.post(new Runnable() { // from class: et6
            @Override // java.lang.Runnable
            public final void run() {
                C18053i.this.m48248D();
            }
        });
    }

    @Override // com.google.p034ar.sceneform.rendering.AbstractC18039d
    /* renamed from: e */
    public C43270jN2 mo48246e(C43270jN2 c43270jN2) {
        DZ3.m110173d(c43270jN2, "Parameter \"originalMatrix\" was null.");
        throw null;
    }

    public void finalize() throws Throwable {
        try {
            try {
                B36.m114761a().execute(new Runnable() { // from class: ct6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18053i.this.m48251A();
                    }
                });
            } catch (Exception e) {
                Log.e(f73981s, "Error while Finalizing View Renderable.", e);
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.p034ar.sceneform.rendering.AbstractC18039d
    /* renamed from: r */
    public void mo48244r(SceneView sceneView) {
        if (m48344f().m110006c()) {
            return;
        }
        RenderViewToExternalTexture m40590a = ((C41209ft6) DZ3.m110174c(this.f73982l)).m40590a();
        m48343g().setParameter("viewTextureReady", m40590a.m48366f());
        if (!m40590a.isAttachedToWindow() || !m40590a.isLaidOut() || !m40590a.m48367e()) {
            return;
        }
        if (!this.f73987q) {
            JM2.m100655c(m48343g(), "viewTexture", m40590a.m48368d().m88166b());
            m48248D();
            this.f73987q = true;
        }
        if (sceneView != null && sceneView.m33454g0()) {
            JM2.m100654d(m48343g(), "offsetUv", new C41807gu1(1.0f, 0.0f));
        }
        super.mo48244r(sceneView);
    }

    /* renamed from: x */
    public void m48240x(C32924Fp6 c32924Fp6) {
        ((C41209ft6) DZ3.m110174c(this.f73982l)).m40590a().m48370b(c32924Fp6);
    }

    /* renamed from: y */
    public void m48239y() {
        ((C41209ft6) DZ3.m110174c(this.f73982l)).m40590a().m48369c();
    }

    /* renamed from: z */
    public void m48251A() {
        C31060zd.m1006c();
        C41209ft6 c41209ft6 = this.f73982l;
        if (c41209ft6 != null) {
            c41209ft6.m40590a().m48365g(this.f73988r);
            this.f73982l = null;
        }
    }
}
