package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaCodec;
import android.os.Build;
import androidx.camera.core.C11154e;
import androidx.camera.core.C11164h;
import androidx.camera.core.C11236l;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.InterfaceC11197f;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* renamed from: DR5 */
/* loaded from: classes.dex */
public final class DR5 {

    /* renamed from: a */
    public static Map<Class<?>, Long> f5705a;

    private DR5() {
    }

    /* renamed from: a */
    public static Map<Class<?>, Long> m110451a() {
        if (f5705a == null) {
            HashMap hashMap = new HashMap();
            f5705a = hashMap;
            hashMap.put(C11154e.class, 1L);
            f5705a.put(C11236l.class, 1L);
            f5705a.put(C11164h.class, 2L);
            f5705a.put(MediaCodec.class, 3L);
            f5705a.put(C52202yR5.class, 3L);
        }
        return f5705a;
    }

    /* renamed from: b */
    public static void m110450b(Collection<C11213q> collection, Map<DeferrableSurface, Long> map, C36761Wa0 c36761Wa0, boolean z) {
        CameraCharacteristics.Key key;
        CameraCharacteristics.Key key2;
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        if (c36761Wa0.m78176a(key) == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        key2 = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        for (long j : (long[]) c36761Wa0.m78176a(key2)) {
            hashSet.add(Long.valueOf(j));
        }
        for (C11213q c11213q : collection) {
            if (c11213q.m69344l() == 5) {
                map.clear();
                return;
            }
            for (DeferrableSurface deferrableSurface : c11213q.m69345k()) {
                InterfaceC11197f m69352d = c11213q.m69352d();
                InterfaceC11197f.AbstractC11198a<Long> abstractC11198a = C43385ja0.f92938G;
                if (!m69352d.mo69359e(abstractC11198a) || !m110449c(map, deferrableSurface, (Long) c11213q.m69352d().mo69363a(abstractC11198a), hashSet)) {
                    if (z) {
                        m110449c(map, deferrableSurface, m110451a().get(deferrableSurface.m69468e()), hashSet);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static boolean m110449c(Map<DeferrableSurface, Long> map, DeferrableSurface deferrableSurface, Long l, Set<Long> set) {
        if (l == null || !set.contains(l)) {
            return false;
        }
        map.put(deferrableSurface, l);
        return true;
    }
}
