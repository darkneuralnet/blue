package p000;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
@KeepForSdk
/* renamed from: sY1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48704sY1 {

    /* renamed from: a */
    public static final GmsLogger f108955a = new GmsLogger("MLKitImageUtils", "");

    /* renamed from: b */
    public static final C48704sY1 f108956b = new C48704sY1();

    private C48704sY1() {
    }

    @KeepForSdk
    /* renamed from: b */
    public static C48704sY1 m14056b() {
        return f108956b;
    }

    @KeepForSdk
    /* renamed from: a */
    public WO1 m14057a(C41304g32 c41304g32) throws MlKitException {
        int m40242g = c41304g32.m40242g();
        if (m40242g != -1) {
            if (m40242g != 17) {
                if (m40242g != 35) {
                    if (m40242g != 842094169) {
                        int m40242g2 = c41304g32.m40242g();
                        throw new MlKitException("Unsupported image format: " + m40242g2, 3);
                    }
                } else {
                    return BinderC36557Vd3.m79636e5(c41304g32.m40240i());
                }
            }
            return BinderC36557Vd3.m79636e5((ByteBuffer) Preconditions.checkNotNull(c41304g32.m40244e()));
        }
        return BinderC36557Vd3.m79636e5((Bitmap) Preconditions.checkNotNull(c41304g32.m40245d()));
    }

    @KeepForSdk
    /* renamed from: c */
    public int m14055c(C41304g32 c41304g32) {
        return c41304g32.m40242g();
    }

    @KeepForSdk
    /* renamed from: d */
    public int m14054d(C41304g32 c41304g32) {
        if (c41304g32.m40242g() == -1) {
            return ((Bitmap) Preconditions.checkNotNull(c41304g32.m40245d())).getAllocationByteCount();
        }
        if (c41304g32.m40242g() != 17 && c41304g32.m40242g() != 842094169) {
            if (c41304g32.m40242g() != 35) {
                return 0;
            }
            return (((Image.Plane[]) Preconditions.checkNotNull(c41304g32.m40239j()))[0].getBuffer().limit() * 3) / 2;
        }
        return ((ByteBuffer) Preconditions.checkNotNull(c41304g32.m40244e())).limit();
    }

    @KeepForSdk
    /* renamed from: e */
    public Matrix m14053e(int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i) / 2.0f, (-i2) / 2.0f);
        matrix.postRotate(i3 * 90);
        int i5 = i3 % 2;
        if (i5 != 0) {
            i4 = i2;
        } else {
            i4 = i;
        }
        if (i5 == 0) {
            i = i2;
        }
        matrix.postTranslate(i4 / 2.0f, i / 2.0f);
        return matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[Catch: FileNotFoundException -> 0x00ca, TryCatch #5 {FileNotFoundException -> 0x00ca, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:33:0x006d, B:34:0x0082, B:45:0x00b3, B:47:0x00bd, B:36:0x0087, B:37:0x008b, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:43:0x00a8, B:32:0x0067, B:29:0x0055, B:49:0x00c2, B:50:0x00c9), top: B:59:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087 A[Catch: FileNotFoundException -> 0x00ca, TryCatch #5 {FileNotFoundException -> 0x00ca, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:33:0x006d, B:34:0x0082, B:45:0x00b3, B:47:0x00bd, B:36:0x0087, B:37:0x008b, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:43:0x00a8, B:32:0x0067, B:29:0x0055, B:49:0x00c2, B:50:0x00c9), top: B:59:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b A[Catch: FileNotFoundException -> 0x00ca, TryCatch #5 {FileNotFoundException -> 0x00ca, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:33:0x006d, B:34:0x0082, B:45:0x00b3, B:47:0x00bd, B:36:0x0087, B:37:0x008b, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:43:0x00a8, B:32:0x0067, B:29:0x0055, B:49:0x00c2, B:50:0x00c9), top: B:59:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[Catch: FileNotFoundException -> 0x00ca, TryCatch #5 {FileNotFoundException -> 0x00ca, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:33:0x006d, B:34:0x0082, B:45:0x00b3, B:47:0x00bd, B:36:0x0087, B:37:0x008b, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:43:0x00a8, B:32:0x0067, B:29:0x0055, B:49:0x00c2, B:50:0x00c9), top: B:59:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[Catch: FileNotFoundException -> 0x00ca, TryCatch #5 {FileNotFoundException -> 0x00ca, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:33:0x006d, B:34:0x0082, B:45:0x00b3, B:47:0x00bd, B:36:0x0087, B:37:0x008b, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:43:0x00a8, B:32:0x0067, B:29:0x0055, B:49:0x00c2, B:50:0x00c9), top: B:59:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[Catch: FileNotFoundException -> 0x00ca, TryCatch #5 {FileNotFoundException -> 0x00ca, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:33:0x006d, B:34:0x0082, B:45:0x00b3, B:47:0x00bd, B:36:0x0087, B:37:0x008b, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:43:0x00a8, B:32:0x0067, B:29:0x0055, B:49:0x00c2, B:50:0x00c9), top: B:59:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1 A[Catch: FileNotFoundException -> 0x00ca, TryCatch #5 {FileNotFoundException -> 0x00ca, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:33:0x006d, B:34:0x0082, B:45:0x00b3, B:47:0x00bd, B:36:0x0087, B:37:0x008b, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:43:0x00a8, B:32:0x0067, B:29:0x0055, B:49:0x00c2, B:50:0x00c9), top: B:59:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8 A[Catch: FileNotFoundException -> 0x00ca, TryCatch #5 {FileNotFoundException -> 0x00ca, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:33:0x006d, B:34:0x0082, B:45:0x00b3, B:47:0x00bd, B:36:0x0087, B:37:0x008b, B:38:0x0092, B:39:0x0096, B:40:0x009d, B:41:0x00a1, B:43:0x00a8, B:32:0x0067, B:29:0x0055, B:49:0x00c2, B:50:0x00c9), top: B:59:0x0004 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m14052f(ContentResolver contentResolver, Uri uri) throws IOException {
        C37059Xh1 c37059Xh1;
        Matrix matrix;
        Bitmap createBitmap;
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            if (bitmap != null) {
                int i = 0;
                if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                    try {
                        InputStream openInputStream = contentResolver.openInputStream(uri);
                        if (openInputStream != null) {
                            c37059Xh1 = new C37059Xh1(openInputStream);
                        } else {
                            c37059Xh1 = null;
                        }
                        if (openInputStream != null) {
                            try {
                                openInputStream.close();
                            } catch (IOException e) {
                                e = e;
                                f108955a.m51613e("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), e);
                                if (c37059Xh1 == null) {
                                }
                                Matrix matrix2 = new Matrix();
                                int width = bitmap.getWidth();
                                int height = bitmap.getHeight();
                                switch (i) {
                                }
                                return matrix == null ? bitmap : bitmap;
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        c37059Xh1 = null;
                    }
                    if (c37059Xh1 == null) {
                        i = c37059Xh1.m76651i("Orientation", 1);
                    }
                }
                Matrix matrix22 = new Matrix();
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                switch (i) {
                    case 2:
                        matrix22 = new Matrix();
                        matrix22.postScale(-1.0f, 1.0f);
                        matrix = matrix22;
                        break;
                    case 3:
                        matrix22.postRotate(180.0f);
                        matrix = matrix22;
                        break;
                    case 4:
                        matrix22.postScale(1.0f, -1.0f);
                        matrix = matrix22;
                        break;
                    case 5:
                        matrix22.postRotate(90.0f);
                        matrix22.postScale(-1.0f, 1.0f);
                        matrix = matrix22;
                        break;
                    case 6:
                        matrix22.postRotate(90.0f);
                        matrix = matrix22;
                        break;
                    case 7:
                        matrix22.postRotate(-90.0f);
                        matrix22.postScale(-1.0f, 1.0f);
                        matrix = matrix22;
                        break;
                    case 8:
                        matrix22.postRotate(-90.0f);
                        matrix = matrix22;
                        break;
                    default:
                        matrix = null;
                        break;
                }
                if (matrix == null && bitmap != (createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix, true))) {
                    bitmap.recycle();
                    return createBitmap;
                }
            }
            throw new IOException("The image Uri could not be resolved.");
        } catch (FileNotFoundException e3) {
            f108955a.m51613e("MLKitImageUtils", "Could not open file: ".concat(String.valueOf(uri)), e3);
            throw e3;
        }
    }
}
