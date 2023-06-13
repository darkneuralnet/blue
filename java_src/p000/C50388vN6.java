package p000;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;
/* renamed from: vN6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50388vN6 implements QN6 {

    /* renamed from: a */
    public final /* synthetic */ Set f113975a;

    /* renamed from: b */
    public final /* synthetic */ VO6 f113976b;

    /* renamed from: c */
    public final /* synthetic */ C45062mO6 f113977c;

    public C50388vN6(C45062mO6 c45062mO6, Set set, VO6 vo6) {
        this.f113977c = c45062mO6;
        this.f113975a = set;
        this.f113976b = vo6;
    }

    @Override // p000.QN6
    /* renamed from: a */
    public final void mo8764a(ZipFile zipFile, Set<C43283jO6> set) throws IOException {
        this.f113975a.addAll(C45062mO6.m25670d(this.f113977c, set, this.f113976b, zipFile));
    }
}
