package com.google.android.gms.vision.face.mlkit;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzmh;
import com.google.android.gms.vision.face.FaceDetectorV2Jni;
@RetainForClient
@KeepForSdk
@DynamiteApi
/* loaded from: classes6.dex */
public class FaceDetectorCreator extends AbstractBinderC48416s29 {
    @Override // p000.C29
    public Y19 newFaceDetector(WO1 wo1, zzmh zzmhVar) throws RemoteException {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Context context = (Context) BinderC36557Vd3.m79637d5(wo1);
        C44955mC7 c44955mC7 = new C44955mC7(context);
        try {
            System.loadLibrary("face_detector_v2_jni");
            c44955mC7.m26019b(zzmhVar, null, SystemClock.elapsedRealtime() - elapsedRealtime);
            return new BinderC35166Pe7(context, zzmhVar, new FaceDetectorV2Jni(), c44955mC7);
        } catch (UnsatisfiedLinkError e) {
            Log.e("FaceDetectorCreator", "Failed to load library face_detector_v2_jni");
            c44955mC7.m26019b(zzmhVar, "Failed to load library face_detector_v2_jni", SystemClock.elapsedRealtime() - elapsedRealtime);
            throw ((RemoteException) C49641u68.m10853a("Failed to load library face_detector_v2_jni").initCause(e));
        }
    }
}
