package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.amazonaws.services.p026s3.util.Mimetypes;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: d */
    public static final String[] f54281d = {"_display_name", "_size"};

    /* renamed from: e */
    public static final File f54282e = new File("/");

    /* renamed from: f */
    public static final HashMap<String, InterfaceC11549b> f54283f = new HashMap<>();

    /* renamed from: b */
    public InterfaceC11549b f54284b;

    /* renamed from: c */
    public int f54285c = 0;

    /* renamed from: androidx.core.content.FileProvider$a */
    /* loaded from: classes.dex */
    public static class C11548a {
        private C11548a() {
        }

        /* renamed from: a */
        public static File[] m67711a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: androidx.core.content.FileProvider$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11549b {
        /* renamed from: a */
        Uri mo67710a(File file);

        /* renamed from: b */
        File mo67709b(Uri uri);
    }

    /* renamed from: androidx.core.content.FileProvider$c */
    /* loaded from: classes.dex */
    public static class C11550c implements InterfaceC11549b {

        /* renamed from: a */
        public final String f54286a;

        /* renamed from: b */
        public final HashMap<String, File> f54287b = new HashMap<>();

        public C11550c(String str) {
            this.f54286a = str;
        }

        @Override // androidx.core.content.FileProvider.InterfaceC11549b
        /* renamed from: a */
        public Uri mo67710a(File file) {
            String substring;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f54287b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    if (path2.endsWith("/")) {
                        substring = canonicalPath.substring(path2.length());
                    } else {
                        substring = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme("content").authority(this.f54286a).encodedPath(Uri.encode(entry.getKey()) + JsonPointer.SEPARATOR + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.InterfaceC11549b
        /* renamed from: b */
        public File mo67709b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f54287b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            }
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }

        /* renamed from: c */
        public void m67708c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f54287b.put(str, file.getCanonicalFile());
                    return;
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                }
            }
            throw new IllegalArgumentException("Name must not be empty");
        }
    }

    /* renamed from: a */
    public static File m67719a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: b */
    public static Object[] m67718b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* renamed from: c */
    public static String[] m67717c(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* renamed from: d */
    public static XmlResourceParser m67716d(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    /* renamed from: e */
    public static InterfaceC11549b m67715e(Context context, String str, int i) {
        InterfaceC11549b interfaceC11549b;
        HashMap<String, InterfaceC11549b> hashMap = f54283f;
        synchronized (hashMap) {
            interfaceC11549b = hashMap.get(str);
            if (interfaceC11549b == null) {
                try {
                    try {
                        interfaceC11549b = m67712h(context, str, i);
                        hashMap.put(str, interfaceC11549b);
                    } catch (XmlPullParserException e) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    }
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return interfaceC11549b;
    }

    /* renamed from: f */
    public static Uri m67714f(Context context, String str, File file) {
        return m67715e(context, str, 0).mo67710a(file);
    }

    /* renamed from: g */
    public static int m67713g(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                return 704643072;
            }
            if ("rw".equals(str)) {
                return 939524096;
            }
            if ("rwt".equals(str)) {
                return 1006632960;
            }
            throw new IllegalArgumentException("Invalid mode: " + str);
        }
        return 738197504;
    }

    /* renamed from: h */
    public static InterfaceC11549b m67712h(Context context, String str, int i) throws IOException, XmlPullParserException {
        C11550c c11550c = new C11550c(str);
        XmlResourceParser m67716d = m67716d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = m67716d.next();
            if (next != 1) {
                if (next == 2) {
                    String name = m67716d.getName();
                    File file = null;
                    String attributeValue = m67716d.getAttributeValue(null, "name");
                    String attributeValue2 = m67716d.getAttributeValue(null, "path");
                    if ("root-path".equals(name)) {
                        file = f54282e;
                    } else if ("files-path".equals(name)) {
                        file = context.getFilesDir();
                    } else if ("cache-path".equals(name)) {
                        file = context.getCacheDir();
                    } else if ("external-path".equals(name)) {
                        file = Environment.getExternalStorageDirectory();
                    } else if ("external-files-path".equals(name)) {
                        File[] m94297g = NA0.m94297g(context, null);
                        if (m94297g.length > 0) {
                            file = m94297g[0];
                        }
                    } else if ("external-cache-path".equals(name)) {
                        File[] m94298f = NA0.m94298f(context);
                        if (m94298f.length > 0) {
                            file = m94298f[0];
                        }
                    } else if ("external-media-path".equals(name)) {
                        File[] m67711a = C11548a.m67711a(context);
                        if (m67711a.length > 0) {
                            file = m67711a[0];
                        }
                    }
                    if (file != null) {
                        c11550c.m67708c(attributeValue, m67719a(file, attributeValue2));
                    }
                }
            } else {
                return c11550c;
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority.split(";")[0];
                HashMap<String, InterfaceC11549b> hashMap = f54283f;
                synchronized (hashMap) {
                    hashMap.remove(str);
                }
                this.f54284b = m67715e(context, str, this.f54285c);
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f54284b.mo67709b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File mo67709b = this.f54284b.mo67709b(uri);
        int lastIndexOf = mo67709b.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo67709b.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return Mimetypes.MIMETYPE_OCTET_STREAM;
        }
        return Mimetypes.MIMETYPE_OCTET_STREAM;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f54284b.mo67709b(uri), m67713g(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        String str3;
        File mo67709b = this.f54284b.mo67709b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f54281d;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    str3 = mo67709b.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i2] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(mo67709b.length());
            }
            i2 = i;
        }
        String[] m67717c = m67717c(strArr3, i2);
        Object[] m67718b = m67718b(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(m67717c, 1);
        matrixCursor.addRow(m67718b);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
