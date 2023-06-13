package com.google.android.gms.vision.face;

import android.content.res.AssetManager;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzov;
import java.nio.ByteBuffer;
/* loaded from: classes6.dex */
public class FaceDetectorV2Jni {

    /* renamed from: a */
    public final N89 f71870a;

    public FaceDetectorV2Jni() {
        N89 m94317b = N89.m94317b();
        this.f71870a = m94317b;
        m94317b.m94315d(C51902xv7.f118358a);
    }

    @Keep
    private native void closeDetectorJni(long j);

    @Keep
    private native byte[] detectFacesImageByteArrayJni(long j, byte[] bArr, byte[] bArr2);

    @Keep
    private native byte[] detectFacesImageByteArrayMultiPlanesJni(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr4);

    @Keep
    private native byte[] detectFacesImageByteBufferJni(long j, ByteBuffer byteBuffer, byte[] bArr);

    @Keep
    private native byte[] detectFacesImageByteBufferMultiPlanesJni(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr);

    @Keep
    private native long initDetectorJni(byte[] bArr, AssetManager assetManager);

    /* renamed from: a */
    public final long m50540a(C36633Vl7 c36633Vl7, AssetManager assetManager) {
        Log.v("FaceDetectorV2Jni", "initialize.start()");
        long initDetectorJni = initDetectorJni(c36633Vl7.m116159c(), assetManager);
        Log.v("FaceDetectorV2Jni", "initialize.end()");
        return initDetectorJni;
    }

    /* renamed from: b */
    public final C39324ck7 m50539b(long j, byte[] bArr, C40459ed9 c40459ed9) throws RemoteException {
        String str;
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteArray.start()");
        C39324ck7 c39324ck7 = null;
        try {
            byte[] detectFacesImageByteArrayJni = detectFacesImageByteArrayJni(j, bArr, c40459ed9.m116159c());
            if (detectFacesImageByteArrayJni != null && detectFacesImageByteArrayJni.length > 0) {
                c39324ck7 = C39324ck7.m60971v(detectFacesImageByteArrayJni, this.f71870a);
            }
        } catch (zzov e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "detectFacesImageByteArray failed to parse result: ".concat(valueOf);
            } else {
                str = new String("detectFacesImageByteArray failed to parse result: ");
            }
            Log.e("FaceDetectorV2Jni", str);
        }
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteArray.end()");
        return c39324ck7;
    }

    /* renamed from: c */
    public final C39324ck7 m50538c(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, C40459ed9 c40459ed9) {
        String str;
        byte[] detectFacesImageByteArrayMultiPlanesJni;
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteArrayMultiPlanes.start()");
        C39324ck7 c39324ck7 = null;
        try {
            detectFacesImageByteArrayMultiPlanesJni = detectFacesImageByteArrayMultiPlanesJni(j, bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, c40459ed9.m116159c());
        } catch (zzov e) {
            e = e;
        }
        if (detectFacesImageByteArrayMultiPlanesJni != null) {
            if (detectFacesImageByteArrayMultiPlanesJni.length > 0) {
                try {
                    c39324ck7 = C39324ck7.m60971v(detectFacesImageByteArrayMultiPlanesJni, this.f71870a);
                } catch (zzov e2) {
                    e = e2;
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        str = "detectFacesImageByteArrayMultiPlanes failed to parse result: ".concat(valueOf);
                    } else {
                        str = new String("detectFacesImageByteArrayMultiPlanes failed to parse result: ");
                    }
                    Log.e("FaceDetectorV2Jni", str);
                    Log.v("FaceDetectorV2Jni", "%s detectFacesImageByteArrayMultiPlanes.end()");
                    return c39324ck7;
                }
                Log.v("FaceDetectorV2Jni", "%s detectFacesImageByteArrayMultiPlanes.end()");
                return c39324ck7;
            }
        }
        Log.v("FaceDetectorV2Jni", "%s detectFacesImageByteArrayMultiPlanes.end()");
        return c39324ck7;
    }

    /* renamed from: d */
    public final C39324ck7 m50537d(long j, ByteBuffer byteBuffer, C40459ed9 c40459ed9) throws RemoteException {
        String str;
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteBuffer.start()");
        C39324ck7 c39324ck7 = null;
        try {
            byte[] detectFacesImageByteBufferJni = detectFacesImageByteBufferJni(j, byteBuffer, c40459ed9.m116159c());
            if (detectFacesImageByteBufferJni != null && detectFacesImageByteBufferJni.length > 0) {
                c39324ck7 = C39324ck7.m60971v(detectFacesImageByteBufferJni, this.f71870a);
            }
        } catch (zzov e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "detectFacesImageByteBuffer failed to parse result: ".concat(valueOf);
            } else {
                str = new String("detectFacesImageByteBuffer failed to parse result: ");
            }
            Log.e("FaceDetectorV2Jni", str);
        }
        Log.v("FaceDetectorV2Jni", "%s detectFacesImageByteBuffer.end()");
        return c39324ck7;
    }

    /* renamed from: e */
    public final C39324ck7 m50536e(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6, C40459ed9 c40459ed9) {
        String str;
        byte[] detectFacesImageByteBufferMultiPlanesJni;
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteBufferMultiPlanes.start()");
        C39324ck7 c39324ck7 = null;
        try {
            detectFacesImageByteBufferMultiPlanesJni = detectFacesImageByteBufferMultiPlanesJni(j, byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5, i6, c40459ed9.m116159c());
        } catch (zzov e) {
            e = e;
        }
        if (detectFacesImageByteBufferMultiPlanesJni != null) {
            if (detectFacesImageByteBufferMultiPlanesJni.length > 0) {
                try {
                    c39324ck7 = C39324ck7.m60971v(detectFacesImageByteBufferMultiPlanesJni, this.f71870a);
                } catch (zzov e2) {
                    e = e2;
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        str = "detectFacesImageByteBufferMultiPlanes failed to parse result: ".concat(valueOf);
                    } else {
                        str = new String("detectFacesImageByteBufferMultiPlanes failed to parse result: ");
                    }
                    Log.e("FaceDetectorV2Jni", str);
                    Log.v("FaceDetectorV2Jni", "detectFacesImageByteBuffer.end()");
                    return c39324ck7;
                }
                Log.v("FaceDetectorV2Jni", "detectFacesImageByteBuffer.end()");
                return c39324ck7;
            }
        }
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteBuffer.end()");
        return c39324ck7;
    }

    /* renamed from: f */
    public final void m50535f(long j) {
        Log.v("FaceDetectorV2Jni", "closeDetector.start()");
        closeDetectorJni(j);
        Log.v("FaceDetectorV2Jni", "closeDetector.end()");
    }
}
