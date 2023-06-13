package p000;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import p000.C44581lb0;
/* renamed from: vb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C50509vb0 implements C44581lb0.InterfaceC25731a {

    /* renamed from: a */
    public final CameraDevice f114353a;

    /* renamed from: b */
    public final Object f114354b;

    /* renamed from: vb0$a */
    /* loaded from: classes.dex */
    public static class C29595a {

        /* renamed from: a */
        public final Handler f114355a;

        public C29595a(Handler handler) {
            this.f114355a = handler;
        }
    }

    public C50509vb0(CameraDevice cameraDevice, Object obj) {
        this.f114353a = (CameraDevice) HZ3.m103731g(cameraDevice);
        this.f114354b = obj;
    }

    /* renamed from: b */
    public static void m8421b(CameraDevice cameraDevice, List<C36053Sz3> list) {
        String id = cameraDevice.getId();
        for (C36053Sz3 c36053Sz3 : list) {
            String m84507c = c36053Sz3.m84507c();
            if (m84507c != null && !m84507c.isEmpty()) {
                C33928Jx2.m99522l("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + m84507c + ". Ignoring.");
            }
        }
    }

    /* renamed from: c */
    public static void m8420c(CameraDevice cameraDevice, C49529tv5 c49529tv5) {
        HZ3.m103731g(cameraDevice);
        HZ3.m103731g(c49529tv5);
        HZ3.m103731g(c49529tv5.m11215e());
        List<C36053Sz3> m11217c = c49529tv5.m11217c();
        if (m11217c != null) {
            if (c49529tv5.m11219a() != null) {
                m8421b(cameraDevice, m11217c);
                return;
            }
            throw new IllegalArgumentException("Invalid executor");
        }
        throw new IllegalArgumentException("Invalid output configurations");
    }

    /* renamed from: d */
    public static List<Surface> m8419d(List<C36053Sz3> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C36053Sz3 c36053Sz3 : list) {
            arrayList.add(c36053Sz3.m84506d());
        }
        return arrayList;
    }
}
