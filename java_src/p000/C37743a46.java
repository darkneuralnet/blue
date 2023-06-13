package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.C17116a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* renamed from: a46  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C37743a46 {

    /* renamed from: f */
    public static final C49425tl1 f49784f = new C49425tl1();

    /* renamed from: a */
    public final C49425tl1 f49785a;

    /* renamed from: b */
    public final Y36 f49786b;

    /* renamed from: c */
    public final InterfaceC28820to f49787c;

    /* renamed from: d */
    public final ContentResolver f49788d;

    /* renamed from: e */
    public final List<ImageHeaderParser> f49789e;

    public C37743a46(List<ImageHeaderParser> list, Y36 y36, InterfaceC28820to interfaceC28820to, ContentResolver contentResolver) {
        this(list, f49784f, y36, interfaceC28820to, contentResolver);
    }

    /* renamed from: a */
    public int m71929a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f49788d.openInputStream(uri);
                int m53106b = C17116a.m53106b(this.f49789e, inputStream, this.f49787c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return m53106b;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
            return -1;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0048: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:27:0x0048 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m71928b(Uri uri) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3 = null;
        try {
            try {
                cursor = this.f49786b.mo75793a(uri);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            String string = cursor.getString(0);
                            cursor.close();
                            return string;
                        }
                    } catch (SecurityException e) {
                        e = e;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SecurityException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final boolean m71927c(File file) {
        return this.f49785a.m11808a(file) && 0 < this.f49785a.m11806c(file);
    }

    /* renamed from: d */
    public InputStream m71926d(Uri uri) throws FileNotFoundException {
        String m71928b = m71928b(uri);
        if (TextUtils.isEmpty(m71928b)) {
            return null;
        }
        File m11807b = this.f49785a.m11807b(m71928b);
        if (!m71927c(m11807b)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(m11807b);
        try {
            return this.f49788d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }

    public C37743a46(List<ImageHeaderParser> list, C49425tl1 c49425tl1, Y36 y36, InterfaceC28820to interfaceC28820to, ContentResolver contentResolver) {
        this.f49785a = c49425tl1;
        this.f49786b = y36;
        this.f49787c = interfaceC28820to;
        this.f49788d = contentResolver;
        this.f49789e = list;
    }
}
