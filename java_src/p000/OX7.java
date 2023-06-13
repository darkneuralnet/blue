package p000;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;
/* renamed from: OX7 */
/* loaded from: classes5.dex */
public final class OX7 {
    /* renamed from: a */
    public static ByteBuffer m92026a(Bitmap bitmap, boolean z) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int ceil = (int) Math.ceil(height / 2.0d);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < height; i4++) {
            int i5 = 0;
            while (i5 < width) {
                int i6 = iArr[i2];
                int i7 = (i6 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i8 = (i6 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i9 = i6 & KotlinVersion.MAX_COMPONENT_VALUE;
                int i10 = (((((i7 * (-38)) - (i8 * 74)) + (i9 * 112)) + 128) >> 8) + 128;
                int i11 = (((((i7 * 112) - (i8 * 94)) - (i9 * 18)) + 128) >> 8) + 128;
                int i12 = i3 + 1;
                allocateDirect.put(i3, (byte) Math.min((int) KotlinVersion.MAX_COMPONENT_VALUE, (((((i7 * 66) + (i8 * 129)) + (i9 * 25)) + 128) >> 8) + 16));
                if (i4 % 2 == 0 && i2 % 2 == 0) {
                    int i13 = i + 1;
                    allocateDirect.put(i, (byte) Math.min((int) KotlinVersion.MAX_COMPONENT_VALUE, i11));
                    i = i13 + 1;
                    allocateDirect.put(i13, (byte) Math.min((int) KotlinVersion.MAX_COMPONENT_VALUE, i10));
                }
                i2++;
                i5++;
                i3 = i12;
            }
        }
        return allocateDirect;
    }
}
