package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.List;
/* renamed from: qy5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47781qy5 implements InterfaceC52637zA0 {

    /* renamed from: a */
    public final String f106142a;

    /* renamed from: b */
    public final List<InterfaceC52637zA0> f106143b;

    /* renamed from: c */
    public final boolean f106144c;

    public C47781qy5(String str, List<InterfaceC52637zA0> list, boolean z) {
        this.f106142a = str;
        this.f106143b = list;
        this.f106144c = z;
    }

    @Override // p000.InterfaceC52637zA0
    /* renamed from: a */
    public InterfaceC36752Vz0 mo483a(RD2 rd2, C47924rD2 c47924rD2, AbstractC27525qB abstractC27525qB) {
        return new C43151jA0(rd2, abstractC27525qB, this, c47924rD2);
    }

    /* renamed from: b */
    public List<InterfaceC52637zA0> m16714b() {
        return this.f106143b;
    }

    /* renamed from: c */
    public String m16713c() {
        return this.f106142a;
    }

    /* renamed from: d */
    public boolean m16712d() {
        return this.f106144c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f106142a + "' Shapes: " + Arrays.toString(this.f106143b.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}
