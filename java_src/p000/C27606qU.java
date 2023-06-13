package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0001\u001a\u0012\u0010\u000e\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u0001\u001a\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012\u001a\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007¨\u0006\u0018"}, m28432d2 = {"Landroid/graphics/Bitmap;", "", "quality", "", "f", "Ljava/io/File;", "file", "", "rotate", "g", "degree", "e", "Landroid/graphics/BitmapFactory$Options;", "maxWidth", C17296a.f69688o, "orientation", "c", "(Landroid/graphics/Bitmap;Ljava/lang/Integer;)Landroid/graphics/Bitmap;", "", "degrees", DateTokenConverter.CONVERTER_KEY, "horizontal", "vertical", "b", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: qU */
/* loaded from: classes3.dex */
public final class C27606qU {
    /* renamed from: a */
    public static final BitmapFactory.Options m17493a(BitmapFactory.Options options, int i) {
        Intrinsics.checkNotNullParameter(options, "<this>");
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = 1;
        int i2 = options.outWidth;
        if (i2 > i) {
            options2.inSampleSize = (int) Math.ceil(i2 / i);
        }
        return options2;
    }

    /* renamed from: b */
    public static final Bitmap m17492b(Bitmap bitmap, boolean z, boolean z2) {
        float f;
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Matrix matrix = new Matrix();
        float f2 = -1.0f;
        if (z) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        if (!z2) {
            f2 = 1.0f;
        }
        matrix.preScale(f, f2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: c */
    public static final Bitmap m17491c(Bitmap bitmap, Integer num) throws IOException {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        if (num != null && num.intValue() == 6) {
            return m17490d(bitmap, 90.0f);
        }
        if (num != null && num.intValue() == 3) {
            return m17490d(bitmap, 180.0f);
        }
        if (num != null && num.intValue() == 8) {
            return m17490d(bitmap, 270.0f);
        }
        if (num != null && num.intValue() == 2) {
            return m17492b(bitmap, true, false);
        }
        if (num != null && num.intValue() == 4) {
            return m17492b(bitmap, false, true);
        }
        return bitmap;
    }

    /* renamed from: d */
    public static final Bitmap m17490d(Bitmap bitmap, float f) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: e */
    public static final Bitmap m17489e(Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        if (i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            bitmap.recycle();
            Intrinsics.checkNotNullExpressionValue(createBitmap, "{\n    val result = Bitma… recycle()\n    result\n  }");
            return createBitmap;
        } catch (OutOfMemoryError e) {
            C41318g46.m40159e(e);
            throw e;
        }
    }

    /* renamed from: f */
    public static final byte[] m17488f(Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
        return bytes;
    }

    /* renamed from: g */
    public static final File m17487g(Bitmap bitmap, File file, boolean z) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            if (z) {
                Bitmap m17489e = m17489e(bitmap, C51796xl1.m4747a(file));
                fileOutputStream = new FileOutputStream(file);
                try {
                    m17489e.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                    fileOutputStream.flush();
                    CloseableKt.closeFinally(fileOutputStream, null);
                } finally {
                }
            }
            return file;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static /* synthetic */ Bitmap modifyOrientation$default(Bitmap bitmap, Integer num, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            num = null;
        }
        return m17491c(bitmap, num);
    }

    public static /* synthetic */ byte[] toByteArray$default(Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 90;
        }
        return m17488f(bitmap, i);
    }

    public static /* synthetic */ File writeToFile$default(Bitmap bitmap, File file, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m17487g(bitmap, file, z);
    }
}
