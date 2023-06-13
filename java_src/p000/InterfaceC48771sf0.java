package p000;

import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.C11192d;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Map;
/* renamed from: sf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC48771sf0 {
    /* renamed from: a */
    ListenableFuture<Void> mo13899a(C11213q c11213q, CameraDevice cameraDevice, PX5 px5);

    /* renamed from: b */
    ListenableFuture<Void> mo13898b(boolean z);

    /* renamed from: c */
    C11213q mo13897c();

    void close();

    /* renamed from: d */
    void mo13896d(C11213q c11213q);

    /* renamed from: e */
    void mo13895e(List<C11192d> list);

    /* renamed from: f */
    void mo13894f();

    /* renamed from: g */
    List<C11192d> mo13893g();

    /* renamed from: h */
    void mo13892h(Map<DeferrableSurface, Long> map);
}
