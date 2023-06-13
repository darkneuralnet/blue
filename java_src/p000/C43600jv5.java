package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.List;
import java.util.concurrent.Executor;
/* renamed from: jv5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C43600jv5 {
    /* renamed from: a */
    public static /* synthetic */ SessionConfiguration m29763a(int i, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        return new SessionConfiguration(i, list, executor, stateCallback);
    }
}
