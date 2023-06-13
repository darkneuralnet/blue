package com.google.mlkit.vision.face.bundled.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzmh;
import com.google.android.gms.vision.face.FaceDetectorV2Jni;
@KeepForSdk
@DynamiteApi
/* loaded from: classes6.dex */
public class ThickFaceDetectorCreator extends AbstractBinderC48416s29 {
    static {
        System.loadLibrary("face_detector_v2_jni");
    }

    @Override // p000.C29
    public Y19 newFaceDetector(WO1 wo1, zzmh zzmhVar) throws RemoteException {
        return new BinderC42849if7((Context) BinderC36557Vd3.m79637d5(wo1), zzmhVar, new FaceDetectorV2Jni());
    }
}
