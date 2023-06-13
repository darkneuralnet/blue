package com.google.p034ar.sceneform.rendering;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.google.ar.sceneform.rendering.RenderViewToExternalTexture */
/* loaded from: classes6.dex */
public class RenderViewToExternalTexture extends FrameLayout {

    /* renamed from: b */
    public final View f73898b;

    /* renamed from: c */
    public final C35430Qi1 f73899c;

    /* renamed from: d */
    public final Picture f73900d;

    /* renamed from: e */
    public boolean f73901e;

    /* renamed from: f */
    public C32924Fp6 f73902f;

    /* renamed from: g */
    public final ArrayList<InterfaceC18033a> f73903g;

    /* renamed from: com.google.ar.sceneform.rendering.RenderViewToExternalTexture$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18033a {
        /* renamed from: a */
        void mo43534a(int i, int i2);
    }

    /* renamed from: a */
    public void m48371a(InterfaceC18033a interfaceC18033a) {
        if (!this.f73903g.contains(interfaceC18033a)) {
            this.f73903g.add(interfaceC18033a);
        }
    }

    /* renamed from: b */
    public void m48370b(C32924Fp6 c32924Fp6) {
        C32924Fp6 c32924Fp62 = this.f73902f;
        if (c32924Fp62 != null) {
            if (c32924Fp62 == c32924Fp6) {
                return;
            }
            throw new IllegalStateException("Cannot use the same ViewRenderable with multiple SceneViews.");
        }
        this.f73902f = c32924Fp6;
        c32924Fp6.m106436b(this);
    }

    /* renamed from: c */
    public void m48369c() {
        C32924Fp6 c32924Fp6 = this.f73902f;
        if (c32924Fp6 != null) {
            c32924Fp6.m106430h(this);
            this.f73902f = null;
        }
    }

    /* renamed from: d */
    public C35430Qi1 m48368d() {
        return this.f73899c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Surface m88165c = this.f73899c.m88165c();
        if (!m88165c.isValid()) {
            return;
        }
        if (this.f73898b.isDirty()) {
            Canvas beginRecording = this.f73900d.beginRecording(this.f73898b.getWidth(), this.f73898b.getHeight());
            beginRecording.drawColor(0, PorterDuff.Mode.CLEAR);
            super.dispatchDraw(beginRecording);
            this.f73900d.endRecording();
            Canvas lockCanvas = m88165c.lockCanvas(null);
            this.f73900d.draw(lockCanvas);
            m88165c.unlockCanvasAndPost(lockCanvas);
            this.f73901e = true;
        }
        invalidate();
    }

    /* renamed from: e */
    public boolean m48367e() {
        return this.f73901e;
    }

    /* renamed from: f */
    public boolean m48366f() {
        return this.f73899c.m88167a().getTimestamp() > 0;
    }

    /* renamed from: g */
    public void m48365g(InterfaceC18033a interfaceC18033a) {
        this.f73903g.remove(interfaceC18033a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f73899c.m88164d().setDefaultBufferSize(this.f73898b.getWidth(), this.f73898b.getHeight());
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Iterator<InterfaceC18033a> it = this.f73903g.iterator();
        while (it.hasNext()) {
            it.next().mo43534a(i, i2);
        }
    }
}
