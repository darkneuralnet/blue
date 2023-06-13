package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import zendesk.belvedere.C31129i;
import zendesk.belvedere.MediaResult;
/* renamed from: ZQ5 */
/* loaded from: classes8.dex */
public class ZQ5 {
    /* renamed from: c */
    public static String m73120c(Context context, Uri uri, boolean z) {
        String str;
        String lastPathSegment;
        int lastIndexOf;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String scheme = uri.getScheme();
        if ("content".equals(scheme)) {
            str = singleton.getExtensionFromMimeType(context.getContentResolver().getType(uri));
        } else if ("file".equals(scheme) && (lastIndexOf = (lastPathSegment = uri.getLastPathSegment()).lastIndexOf(InstructionFileId.DOT)) != -1) {
            str = lastPathSegment.substring(lastIndexOf + 1, lastPathSegment.length());
        } else {
            str = "tmp";
        }
        if (z) {
            return String.format(Locale.US, ".%s", str);
        }
        return str;
    }

    /* renamed from: g */
    public static String m73116g(Context context, Uri uri) {
        String scheme = uri.getScheme();
        String str = "";
        if ("content".equals(scheme)) {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            if (query == null) {
                return "";
            }
            try {
                if (query.moveToFirst()) {
                    str = query.getString(0);
                }
                return str;
            } finally {
                query.close();
            }
        } else if (!"file".equals(scheme)) {
            return "";
        } else {
            return uri.getLastPathSegment();
        }
    }

    /* renamed from: j */
    public static MediaResult m73113j(Context context, Uri uri) {
        long j;
        String str;
        String str2;
        long j2 = -1;
        String str3 = "";
        if ("content".equals(uri.getScheme())) {
            ContentResolver contentResolver = context.getContentResolver();
            Cursor query = contentResolver.query(uri, new String[]{"_size", "_display_name"}, null, null, null);
            String type = contentResolver.getType(uri);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        long j3 = query.getLong(query.getColumnIndex("_size"));
                        str3 = query.getString(query.getColumnIndex("_display_name"));
                        j2 = j3;
                    }
                } finally {
                    query.close();
                }
            }
            j = j2;
            str = str3;
            str2 = type;
        } else {
            j = -1;
            str = "";
            str2 = str;
        }
        return new MediaResult(null, uri, uri, str, str2, j, -1L, -1L);
    }

    /* renamed from: a */
    public final File m73122a(File file, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        return new File(file, sb.toString());
    }

    /* renamed from: b */
    public final File m73121b(Context context, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = str + File.separator;
        } else {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m73112k(context));
        String str3 = File.separator;
        sb.append(str3);
        sb.append("belvedere-data-v2");
        sb.append(str3);
        sb.append(str2);
        File file = new File(sb.toString());
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        if (!file.isDirectory()) {
            return null;
        }
        return file;
    }

    /* renamed from: d */
    public File m73119d(Context context, String str, String str2) {
        String str3 = "user";
        if (!TextUtils.isEmpty(str)) {
            str3 = "user" + File.separator + str;
        }
        File m73121b = m73121b(context, str3);
        if (m73121b == null) {
            C31129i.m667e("Belvedere", "Error creating cache directory");
            return null;
        }
        return m73122a(m73121b, str2, null);
    }

    /* renamed from: e */
    public File m73118e(Context context) {
        File m73121b = m73121b(context, "media");
        if (m73121b == null) {
            C31129i.m667e("Belvedere", "Error creating cache directory");
            return null;
        }
        Locale locale = Locale.US;
        return m73122a(m73121b, String.format(locale, "camera_image_%s", new SimpleDateFormat("yyyyMMddHHmmssSSS", locale).format(new Date(System.currentTimeMillis()))), ".jpg");
    }

    /* renamed from: f */
    public File m73117f(Context context, Uri uri, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = "user" + File.separator + str;
        } else {
            str2 = "media";
        }
        File m73121b = m73121b(context, str2);
        String str3 = null;
        if (m73121b == null) {
            C31129i.m667e("Belvedere", "Error creating cache directory");
            return null;
        }
        String m73116g = m73116g(context, uri);
        if (TextUtils.isEmpty(m73116g)) {
            Locale locale = Locale.US;
            m73116g = String.format(locale, "attachment_%s", new SimpleDateFormat("yyyyMMddHHmmssSSS", locale).format(new Date(System.currentTimeMillis())));
            str3 = m73120c(context, uri, true);
        }
        return m73122a(m73121b, m73116g, str3);
    }

    /* renamed from: h */
    public String m73115h(Context context) {
        return String.format(Locale.US, "%s%s", context.getPackageName(), context.getString(C42906il4.belvedere_sdk_fpa_suffix_v2));
    }

    /* renamed from: i */
    public Uri m73114i(Context context, File file) {
        String m73115h = m73115h(context);
        try {
            return FileProvider.m67714f(context, m73115h, file);
        } catch (IllegalArgumentException unused) {
            C31129i.m670b("Belvedere", String.format(Locale.US, "The selected file can't be shared %s", file.toString()));
            return null;
        } catch (NullPointerException e) {
            String format = String.format(Locale.US, "=====================\nFileProvider failed to retrieve file uri. There might be an issue with the FileProvider \nPlease make sure that manifest-merger is working, and that you have defined the applicationId (package name) in the build.gradle\nManifest merger: http://tools.android.com/tech-docs/new-build-system/user-guide/manifest-merger\nIf your are not able to use gradle or the manifest merger, please add the following to your AndroidManifest.xml:\n        <provider\n            android:name=\"com.zendesk.belvedere.BelvedereFileProvider\"\n            android:authorities=\"${applicationId}%s\"\n            android:exported=\"false\"\n            android:grantUriPermissions=\"true\">\n            <meta-data\n                android:name=\"android.support.FILE_PROVIDER_PATHS\"\n                android:resource=\"@xml/belvedere_attachment_storage_v2\" />\n        </provider>\n=====================", m73115h);
            Log.e("Belvedere", format, e);
            C31129i.m669c("Belvedere", format, e);
            throw new RuntimeException("Please specify your application id");
        }
    }

    /* renamed from: k */
    public final String m73112k(Context context) {
        return context.getCacheDir().getAbsolutePath();
    }

    /* renamed from: l */
    public void m73111l(Context context, Intent intent, Uri uri, int i) {
        intent.addFlags(i);
    }

    /* renamed from: m */
    public void m73110m(Context context, Uri uri, int i) {
        context.revokeUriPermission(uri, i);
    }
}
