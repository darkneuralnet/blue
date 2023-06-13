package p000;

import android.graphics.Path;
import ch.qos.logback.core.CoreConstants;
/* renamed from: oy5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C46595oy5 implements InterfaceC52637zA0 {

    /* renamed from: a */
    public final boolean f102844a;

    /* renamed from: b */
    public final Path.FillType f102845b;

    /* renamed from: c */
    public final String f102846c;

    /* renamed from: d */
    public final C27323pe f102847d;

    /* renamed from: e */
    public final C28363se f102848e;

    /* renamed from: f */
    public final boolean f102849f;

    public C46595oy5(String str, boolean z, Path.FillType fillType, C27323pe c27323pe, C28363se c28363se, boolean z2) {
        this.f102846c = str;
        this.f102844a = z;
        this.f102845b = fillType;
        this.f102847d = c27323pe;
        this.f102848e = c28363se;
        this.f102849f = z2;
    }

    @Override // p000.InterfaceC52637zA0
    /* renamed from: a */
    public InterfaceC36752Vz0 mo483a(RD2 rd2, C47924rD2 c47924rD2, AbstractC27525qB abstractC27525qB) {
        return new C31713Al1(rd2, abstractC27525qB, this);
    }

    /* renamed from: b */
    public C27323pe m20207b() {
        return this.f102847d;
    }

    /* renamed from: c */
    public Path.FillType m20206c() {
        return this.f102845b;
    }

    /* renamed from: d */
    public String m20205d() {
        return this.f102846c;
    }

    /* renamed from: e */
    public C28363se m20204e() {
        return this.f102848e;
    }

    /* renamed from: f */
    public boolean m20203f() {
        return this.f102849f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f102844a + CoreConstants.CURLY_RIGHT;
    }
}
