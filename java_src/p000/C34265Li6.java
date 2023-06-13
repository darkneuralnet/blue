package p000;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: Li6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C34265Li6 {
    /* renamed from: a */
    public static int m96420a(int i, int i2, int i3, int i4) {
        int highestOneBit;
        int min = Math.min(i2 / i4, i / i3);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("Utils", 2) && max > 1) {
            Log.v("Utils", "Downsampling WEBP, sampleSize: " + max + ", target dimens: [" + i3 + "x" + i4 + "], actual dimens: [" + i + "x" + i2 + "]");
        }
        return max;
    }

    /* renamed from: b */
    public static byte[] m96419b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("Utils", 5)) {
                Log.w("Utils", "Error reading data from stream", e);
                return null;
            }
            return null;
        }
    }
}
