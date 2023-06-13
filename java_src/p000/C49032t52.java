package p000;

import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.analytics.TraceKeyKt;
import com.facebook.C17216a;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\tH\u0007J\u001c\u0010\u0018\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0019\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J$\u0010\u001f\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007J\n\u0010 \u001a\u0004\u0018\u00010\rH\u0007¨\u0006#"}, m28432d2 = {"Lt52;", "", "", "e", "", "b", "Ljava/lang/Thread;", TraceKeyKt.IS_MAIN_THREAD, DateTokenConverter.CONVERTER_KEY, "", "f", "g", "", "Ljava/io/File;", "h", "()[Ljava/io/File;", "i", "j", "filename", "deleteOnException", "Lorg/json/JSONObject;", "k", "content", "", "m", C17296a.f69688o, "key", "Lorg/json/JSONArray;", "reports", "Lcom/facebook/GraphRequest$b;", "callback", "l", "c", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: t52  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49032t52 {

    /* renamed from: a */
    public static final C49032t52 f109812a = new C49032t52();

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "name", "", "accept"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: t52$a */
    /* loaded from: classes5.dex */
    public static final class C28516a implements FilenameFilter {

        /* renamed from: a */
        public static final C28516a f109813a = new C28516a();

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String name) {
            Intrinsics.checkNotNullExpressionValue(name, "name");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return new Regex(format).matches(name);
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "name", "", "accept"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: t52$b */
    /* loaded from: classes5.dex */
    public static final class C28517b implements FilenameFilter {

        /* renamed from: a */
        public static final C28517b f109814a = new C28517b();

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String name) {
            Intrinsics.checkNotNullExpressionValue(name, "name");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return new Regex(format).matches(name);
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "name", "", "accept"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: t52$c */
    /* loaded from: classes5.dex */
    public static final class C28518c implements FilenameFilter {

        /* renamed from: a */
        public static final C28518c f109815a = new C28518c();

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String name) {
            Intrinsics.checkNotNullExpressionValue(name, "name");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return new Regex(format).matches(name);
        }
    }

    private C49032t52() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m13152a(String str) {
        File m13150c = m13150c();
        if (m13150c != null && str != null) {
            return new File(m13150c, str).delete();
        }
        return false;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m13151b(Throwable th) {
        if (th == null) {
            return null;
        }
        if (th.getCause() == null) {
            return th.toString();
        }
        return String.valueOf(th.getCause());
    }

    @JvmStatic
    /* renamed from: c */
    public static final File m13150c() {
        Context m52741e = C17216a.m52741e();
        Intrinsics.checkNotNullExpressionValue(m52741e, "FacebookSdk.getApplicationContext()");
        File file = new File(m52741e.getCacheDir(), "instrument");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m13149d(Thread thread) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    @JvmStatic
    /* renamed from: e */
    public static final String m13148e(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    @JvmStatic
    /* renamed from: f */
    public static final boolean m13147f(Throwable th) {
        StackTraceElement[] stackTrace;
        boolean startsWith$default;
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            for (StackTraceElement element : th.getStackTrace()) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                String className = element.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "element.className");
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(className, "com.facebook", false, 2, null);
                if (startsWith$default) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    @JvmStatic
    /* renamed from: g */
    public static final boolean m13146g(Thread thread) {
        StackTraceElement[] stackTrace;
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean startsWith$default3;
        boolean startsWith$default4;
        boolean startsWith$default5;
        boolean startsWith$default6;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement element : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                String className = element.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "element.className");
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(className, "com.facebook", false, 2, null);
                if (startsWith$default) {
                    String className2 = element.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className2, "element.className");
                    startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(className2, "com.facebook.appevents.codeless", false, 2, null);
                    if (!startsWith$default2) {
                        String className3 = element.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className3, "element.className");
                        startsWith$default6 = StringsKt__StringsJVMKt.startsWith$default(className3, "com.facebook.appevents.suggestedevents", false, 2, null);
                        if (!startsWith$default6) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    Intrinsics.checkNotNullExpressionValue(methodName, "element.methodName");
                    startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(methodName, "onClick", false, 2, null);
                    if (startsWith$default3) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        Intrinsics.checkNotNullExpressionValue(methodName2, "element.methodName");
                        startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(methodName2, "onItemClick", false, 2, null);
                        if (startsWith$default4) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            Intrinsics.checkNotNullExpressionValue(methodName3, "element.methodName");
                            startsWith$default5 = StringsKt__StringsJVMKt.startsWith$default(methodName3, "onTouch", false, 2, null);
                            if (!startsWith$default5) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @JvmStatic
    /* renamed from: h */
    public static final File[] m13145h() {
        File m13150c = m13150c();
        if (m13150c != null) {
            File[] listFiles = m13150c.listFiles(C28516a.f109813a);
            if (listFiles == null) {
                return new File[0];
            }
            return listFiles;
        }
        return new File[0];
    }

    @JvmStatic
    /* renamed from: i */
    public static final File[] m13144i() {
        File m13150c = m13150c();
        if (m13150c != null) {
            File[] listFiles = m13150c.listFiles(C28517b.f109814a);
            if (listFiles == null) {
                return new File[0];
            }
            return listFiles;
        }
        return new File[0];
    }

    @JvmStatic
    /* renamed from: j */
    public static final File[] m13143j() {
        File m13150c = m13150c();
        if (m13150c != null) {
            File[] listFiles = m13150c.listFiles(C28518c.f109815a);
            if (listFiles == null) {
                return new File[0];
            }
            return listFiles;
        }
        return new File[0];
    }

    @JvmStatic
    /* renamed from: k */
    public static final JSONObject m13142k(String str, boolean z) {
        File m13150c = m13150c();
        if (m13150c != null && str != null) {
            try {
                return new JSONObject(C52364yi6.m2834i0(new FileInputStream(new File(m13150c, str))));
            } catch (Exception unused) {
                if (z) {
                    m13152a(str);
                }
            }
        }
        return null;
    }

    @JvmStatic
    /* renamed from: l */
    public static final void m13141l(String str, JSONArray reports, GraphRequest.InterfaceC17205b interfaceC17205b) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            GraphRequest.C17206c c17206c = GraphRequest.f69390s;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C17216a.m52740f()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            c17206c.m52780x(null, format, jSONObject, interfaceC17205b).m52836k();
        } catch (JSONException unused) {
        }
    }

    @JvmStatic
    /* renamed from: m */
    public static final void m13140m(String str, String str2) {
        File m13150c = m13150c();
        if (m13150c != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(m13150c, str));
                byte[] bytes = str2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
