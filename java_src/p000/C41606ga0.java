package p000;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Size;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.InterfaceC11225s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: ga0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41606ga0 implements InterfaceC51695xb0 {

    /* renamed from: a */
    public final Map<String, BV5> f82430a;

    /* renamed from: b */
    public final T80 f82431b;

    /* renamed from: ga0$a */
    /* loaded from: classes.dex */
    public class C20926a implements T80 {
        @Override // p000.T80
        /* renamed from: a */
        public CamcorderProfile mo39155a(int i, int i2) {
            return CamcorderProfile.get(i, i2);
        }

        @Override // p000.T80
        /* renamed from: b */
        public boolean mo39154b(int i, int i2) {
            return CamcorderProfile.hasProfile(i, i2);
        }
    }

    public C41606ga0(Context context, Object obj, Set<String> set) throws CameraUnavailableException {
        this(context, new C20926a(), obj, set);
    }

    @Override // p000.InterfaceC51695xb0
    /* renamed from: a */
    public DV5 mo4974a(boolean z, String str, int i, Size size) {
        BV5 bv5 = this.f82430a.get(str);
        if (bv5 != null) {
            return bv5.m113942u(z, i, size);
        }
        return null;
    }

    @Override // p000.InterfaceC51695xb0
    /* renamed from: b */
    public Map<InterfaceC11225s<?>, BR5> mo4973b(boolean z, String str, List<AbstractC28413sp> list, Map<InterfaceC11225s<?>, List<Size>> map) {
        HZ3.m103736b(!map.isEmpty(), "No new use cases to be bound.");
        BV5 bv5 = this.f82430a.get(str);
        if (bv5 != null) {
            return bv5.m113947p(z, list, map);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    /* renamed from: c */
    public final void m39156c(Context context, C35600Rb0 c35600Rb0, Set<String> set) throws CameraUnavailableException {
        HZ3.m103731g(context);
        for (String str : set) {
            this.f82430a.put(str, new BV5(context, str, c35600Rb0, this.f82431b));
        }
    }

    public C41606ga0(Context context, T80 t80, Object obj, Set<String> set) throws CameraUnavailableException {
        C35600Rb0 m86592a;
        this.f82430a = new HashMap();
        HZ3.m103731g(t80);
        this.f82431b = t80;
        if (obj instanceof C35600Rb0) {
            m86592a = (C35600Rb0) obj;
        } else {
            m86592a = C35600Rb0.m86592a(context);
        }
        m39156c(context, m86592a, set);
    }
}
