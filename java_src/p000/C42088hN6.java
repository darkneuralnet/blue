package p000;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;
/* renamed from: hN6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42088hN6 implements QN6 {

    /* renamed from: a */
    public final /* synthetic */ VO6 f85131a;

    /* renamed from: b */
    public final /* synthetic */ Set f85132b;

    /* renamed from: c */
    public final /* synthetic */ AtomicBoolean f85133c;

    /* renamed from: d */
    public final /* synthetic */ C45062mO6 f85134d;

    public C42088hN6(C45062mO6 c45062mO6, VO6 vo6, Set set, AtomicBoolean atomicBoolean) {
        this.f85134d = c45062mO6;
        this.f85131a = vo6;
        this.f85132b = set;
        this.f85133c = atomicBoolean;
    }

    @Override // p000.QN6
    /* renamed from: a */
    public final void mo8764a(ZipFile zipFile, Set<C43283jO6> set) throws IOException {
        this.f85134d.m25668f(this.f85131a, set, new TM6(this));
    }
}
