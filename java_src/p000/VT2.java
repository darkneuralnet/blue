package p000;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.impl.C11209m;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11225s;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* renamed from: VT2 */
/* loaded from: classes.dex */
public class VT2 {

    /* renamed from: a */
    public DeferrableSurface f39122a;

    /* renamed from: b */
    public final C11213q f39123b;

    /* renamed from: c */
    public final C8657b f39124c;

    /* renamed from: d */
    public final AV5 f39125d = new AV5();

    /* renamed from: VT2$a */
    /* loaded from: classes.dex */
    public class C8656a implements CA1<Void> {

        /* renamed from: a */
        public final /* synthetic */ Surface f39126a;

        /* renamed from: b */
        public final /* synthetic */ SurfaceTexture f39127b;

        public C8656a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f39126a = surface;
            this.f39127b = surfaceTexture;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r1) {
            this.f39126a.release();
            this.f39127b.release();
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }
    }

    /* renamed from: VT2$b */
    /* loaded from: classes.dex */
    public static class C8657b implements InterfaceC11225s<AbstractC11253p> {

        /* renamed from: E */
        public final InterfaceC11197f f39129E;

        public C8657b() {
            C11209m m69372V = C11209m.m69372V();
            m69372V.mo69373C(InterfaceC11225s.f52674x, new C44571la0());
            this.f39129E = m69372V;
        }

        @Override // androidx.camera.core.impl.InterfaceC11212p
        /* renamed from: B */
        public InterfaceC11197f mo1036B() {
            return this.f39129E;
        }
    }

    public VT2(C36761Wa0 c36761Wa0, C42509i51 c42509i51) {
        C8657b c8657b = new C8657b();
        this.f39124c = c8657b;
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size m79864d = m79864d(c36761Wa0, c42509i51);
        C33928Jx2.m99533a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + m79864d);
        surfaceTexture.setDefaultBufferSize(m79864d.getWidth(), m79864d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        C11213q.C11215b m69329o = C11213q.C11215b.m69329o(c8657b, m79864d);
        m69329o.m69323u(1);
        NY1 ny1 = new NY1(surface);
        this.f39122a = ny1;
        IA1.m102842b(ny1.m69464i(), new C8656a(surface, surfaceTexture), C31631Ac0.m115449a());
        m69329o.m69333k(this.f39122a);
        this.f39123b = m69329o.m69331m();
    }

    /* renamed from: g */
    public static /* synthetic */ int m79861g(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    /* renamed from: b */
    public void m79866b() {
        C33928Jx2.m99533a("MeteringRepeating", "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.f39122a;
        if (deferrableSurface != null) {
            deferrableSurface.m69470c();
        }
        this.f39122a = null;
    }

    /* renamed from: c */
    public String m79865c() {
        return "MeteringRepeating";
    }

    /* renamed from: d */
    public final Size m79864d(C36761Wa0 c36761Wa0, C42509i51 c42509i51) {
        Size[] m19305b = c36761Wa0.m78175b().m19305b(34);
        if (m19305b == null) {
            C33928Jx2.m99531c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] m115702a = this.f39125d.m115702a(m19305b);
        List asList = Arrays.asList(m115702a);
        Collections.sort(asList, new Comparator() { // from class: UT2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m79861g;
                m79861g = VT2.m79861g((Size) obj, (Size) obj2);
                return m79861g;
            }
        });
        Size m34485d = c42509i51.m34485d();
        long min = Math.min(m34485d.getWidth() * m34485d.getHeight(), 307200L);
        int length = m115702a.length;
        Size size = null;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Size size2 = m115702a[i];
            int i2 = ((size2.getWidth() * size2.getHeight()) > min ? 1 : ((size2.getWidth() * size2.getHeight()) == min ? 0 : -1));
            if (i2 == 0) {
                return size2;
            }
            if (i2 > 0) {
                if (size != null) {
                    return size;
                }
            } else {
                i++;
                size = size2;
            }
        }
        return (Size) asList.get(0);
    }

    /* renamed from: e */
    public C11213q m79863e() {
        return this.f39123b;
    }

    /* renamed from: f */
    public InterfaceC11225s<?> m79862f() {
        return this.f39124c;
    }
}
