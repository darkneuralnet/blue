package p000;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import p000.C43385ja0;
/* renamed from: kX1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C43952kX1 {
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m28869a(int i, C43385ja0.C24930a c24930a) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        if (((C44545lX1) S21.m86079a(C44545lX1.class)) == null) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                c24930a.m30298e(key2, Boolean.FALSE);
                return;
            }
            return;
        }
        key = CaptureRequest.CONTROL_ENABLE_ZSL;
        c24930a.m30298e(key, Boolean.TRUE);
    }
}
