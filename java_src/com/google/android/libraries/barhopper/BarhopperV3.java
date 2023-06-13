package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes6.dex */
public class BarhopperV3 implements Closeable {

    /* renamed from: c */
    public static final String f72082c = "BarhopperV3";

    /* renamed from: b */
    public long f72083b;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    /* renamed from: f */
    public static C0363Ay m50509f(byte[] bArr) {
        bArr.getClass();
        try {
            return C0363Ay.m114823I(bArr, J28.m101256a());
        } catch (zzeo e) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e);
        }
    }

    private native byte[] recognizeBitmapNative(long j, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j, int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j, int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j, int i, int i2, int i3, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j, int i, int i2, int i3, byte[] bArr, RecognitionOptions recognitionOptions);

    /* renamed from: a */
    public void m50513a(C0777By c0777By) {
        if (this.f72083b == 0) {
            try {
                int mo43831l = c0777By.mo43831l();
                byte[] bArr = new byte[mo43831l];
                AbstractC47813r18 m16654a = AbstractC47813r18.m16654a(bArr, 0, mo43831l);
                c0777By.mo43829z(m16654a);
                m16654a.m16653b();
                long createNativeWithClientOptions = createNativeWithClientOptions(bArr);
                this.f72083b = createNativeWithClientOptions;
                if (createNativeWithClientOptions != 0) {
                    return;
                }
                throw new IllegalArgumentException("Failed to create native context with client options.");
            } catch (IOException e) {
                String name = c0777By.getClass().getName();
                throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
            }
        }
        Log.w(f72082c, "Native context already exists.");
    }

    /* renamed from: b */
    public C0363Ay m50512b(int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j = this.f72083b;
        if (j != 0) {
            return m50509f(recognizeBufferNative(j, i, i2, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    /* renamed from: c */
    public C0363Ay m50511c(int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j = this.f72083b;
        if (j != 0) {
            return m50509f(recognizeNative(j, i, i2, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.f72083b;
        if (j != 0) {
            closeNative(j);
            this.f72083b = 0L;
        }
    }

    /* renamed from: d */
    public C0363Ay m50510d(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.f72083b != 0) {
            if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                Log.d(f72082c, "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
            }
            return m50509f(recognizeBitmapNative(this.f72083b, bitmap, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }
}
