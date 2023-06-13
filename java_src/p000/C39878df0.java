package p000;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.List;
/* renamed from: df0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39878df0 {
    private C39878df0() {
    }

    /* renamed from: a */
    public static CameraCaptureSession.CaptureCallback m43935a(AbstractC46943pa0 abstractC46943pa0) {
        if (abstractC46943pa0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        m43934b(abstractC46943pa0, arrayList);
        if (arrayList.size() == 1) {
            return (CameraCaptureSession.CaptureCallback) arrayList.get(0);
        }
        return K90.m99129a(arrayList);
    }

    /* renamed from: b */
    public static void m43934b(AbstractC46943pa0 abstractC46943pa0, List<CameraCaptureSession.CaptureCallback> list) {
        if (abstractC46943pa0 instanceof C47536qa0) {
            for (AbstractC46943pa0 abstractC46943pa02 : ((C47536qa0) abstractC46943pa0).m17435d()) {
                m43934b(abstractC46943pa02, list);
            }
        } else if (abstractC46943pa0 instanceof C39267cf0) {
            list.add(((C39267cf0) abstractC46943pa0).m61090e());
        } else {
            list.add(new C38674bf0(abstractC46943pa0));
        }
    }
}
