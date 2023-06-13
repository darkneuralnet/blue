package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.media.Image;
import android.net.Uri;
import androidx.camera.core.InterfaceC11183i;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a0\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007\u001a0\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0006¨\u0006\u0014"}, m28432d2 = {"Landroidx/camera/core/i;", Entry.TYPE_IMAGE, "Landroid/graphics/Bitmap;", "b", "Landroid/graphics/Rect;", "cropRect", "", "jpegQuality", "padding", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "bitmap", "Landroid/net/Uri;", "uri", "Landroid/graphics/Bitmap$CompressFormat;", "compressFormat", "compressQuality", "", "c", "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: lU */
/* loaded from: classes4.dex */
public final class C25708lU {
    /* renamed from: a */
    public static final Bitmap m27248a(InterfaceC11183i image, Rect rect, int i, int i2) {
        Bitmap m23623b;
        int coerceAtLeast;
        int coerceAtLeast2;
        int coerceAtMost;
        int coerceAtMost2;
        Intrinsics.checkNotNullParameter(image, "image");
        int format = image.getFormat();
        if (format != 35) {
            if (format == 256) {
                m23623b = m27247b(image);
                if (m23623b == null) {
                    throw new Exception("Could not parse jpeg image");
                }
            } else {
                int format2 = image.getFormat();
                throw new Exception("Could not parse bitmap from image with format " + format2);
            }
        } else {
            m23623b = C26526nU.m23623b(image, i);
            if (m23623b == null) {
                throw new Exception("Could not parse yuv420888 image");
            }
        }
        if (rect != null) {
            try {
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(rect.left - i2, 0);
                coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(rect.top - i2, 0);
                coerceAtMost = RangesKt___RangesKt.coerceAtMost(rect.width() + i2, m23623b.getWidth() - coerceAtLeast);
                coerceAtMost2 = RangesKt___RangesKt.coerceAtMost(rect.height() + i2, m23623b.getHeight() - coerceAtLeast2);
                Bitmap createBitmap = Bitmap.createBitmap(m23623b, coerceAtLeast, coerceAtLeast2, coerceAtMost, coerceAtMost2);
                Intrinsics.checkNotNullExpressionValue(createBitmap, "{\n    val x = (crop.left… x, y, width, height)\n  }");
                return createBitmap;
            } catch (Exception e) {
                C41318g46.m40161c(e, "Exception while cropping bitmap, ignoring and returning original bitmap: ", new Object[0]);
                return m23623b;
            }
        }
        return m23623b;
    }

    /* renamed from: b */
    public static final Bitmap m27247b(InterfaceC11183i image) {
        ByteBuffer byteBuffer;
        Image.Plane[] planes;
        Image.Plane plane;
        Intrinsics.checkNotNullParameter(image, "image");
        if (image.getFormat() != 256) {
            return null;
        }
        int mo3253c = image.mo40428i1().mo3253c();
        Image mo69479k3 = image.mo69479k3();
        if (mo69479k3 != null && (planes = mo69479k3.getPlanes()) != null && (plane = planes[0]) != null) {
            byteBuffer = plane.getBuffer();
        } else {
            byteBuffer = null;
        }
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.rewind();
        int capacity = byteBuffer.capacity();
        byte[] bArr = new byte[capacity];
        byteBuffer.get(bArr);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, capacity);
        Intrinsics.checkNotNullExpressionValue(decodeByteArray, "decodeByteArray(data, 0, data.size)");
        return C27606qU.m17489e(decodeByteArray, mo3253c);
    }

    /* renamed from: c */
    public static final boolean m27246c(Context context, Bitmap bitmap, Uri uri, Bitmap.CompressFormat compressFormat, int i) throws FileNotFoundException {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(uri, "uri");
        OutputStream outputStream = null;
        try {
            try {
                outputStream = context.getContentResolver().openOutputStream(uri);
                z = bitmap.compress(compressFormat, i, outputStream);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            C41318g46.m40161c(e, "Exception while writingBitmap to Uri " + uri + ": ", new Object[0]);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused3) {
                }
            }
            z = false;
        }
        return z;
    }

    public static /* synthetic */ Bitmap getBitmapFromImageProxy$default(InterfaceC11183i interfaceC11183i, Rect rect, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            rect = null;
        }
        if ((i3 & 4) != 0) {
            i = 75;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m27248a(interfaceC11183i, rect, i, i2);
    }
}
