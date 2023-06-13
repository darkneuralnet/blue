package p000;

import androidx.camera.core.impl.DeferrableSurface;
import java.util.List;
/* renamed from: Pw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C35322Pw1 {

    /* renamed from: a */
    public final boolean f29404a;

    /* renamed from: b */
    public final boolean f29405b;

    /* renamed from: c */
    public final boolean f29406c;

    public C35322Pw1(C36099Te4 c36099Te4, C36099Te4 c36099Te42) {
        this.f29404a = c36099Te42.m83239a(C45459n36.class);
        this.f29405b = c36099Te4.m83239a(Z14.class);
        this.f29406c = c36099Te4.m83239a(C33224Gx0.class);
    }

    /* renamed from: a */
    public void m89366a(List<DeferrableSurface> list) {
        if (m89365b() && list != null) {
            for (DeferrableSurface deferrableSurface : list) {
                deferrableSurface.m69470c();
            }
            C33928Jx2.m99533a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }

    /* renamed from: b */
    public boolean m89365b() {
        return this.f29404a || this.f29405b || this.f29406c;
    }
}
