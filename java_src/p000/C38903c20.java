package p000;

import android.content.res.AssetManager;
import android.net.TrafficStats;
import android.net.Uri;
import bo.app.C12986o6;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.Appboy;
import com.facebook.share.internal.C17296a;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p053io.ByteStreamsKt;
import kotlin.p053io.CloseableKt;
import kotlin.p053io.FilesKt__UtilsKt;
import kotlin.p053io.TextStreamsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0004\u001a*\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u001a\u0012\u0010\u0010\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b\"\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0016"}, m28432d2 = {"Ljava/io/File;", "fileOrDirectory", "", C17296a.f69688o, "Landroid/net/Uri;", "", "f", "e", "", "downloadDirectoryAbsolutePath", "remoteFileUrl", "outputFilename", "extension", "b", "Landroid/content/res/AssetManager;", "assetPath", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "TAG", "", "Ljava/util/List;", "REMOTE_SCHEMES", "android-sdk-base_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: c20  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38903c20 {

    /* renamed from: a */
    public static final String f59897a = C43664k20.f93782a.m29432o("BrazeFileUtils");

    /* renamed from: b */
    public static final List<String> f59898b;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: c20$a */
    /* loaded from: classes2.dex */
    public static final class C13364a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ File f59899g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13364a(File file) {
            super(0);
            this.f59899g = file;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Could not recursively delete ", this.f59899g.getName());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: c20$b */
    /* loaded from: classes2.dex */
    public static final class C13365b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f59900g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13365b(String str) {
            super(0);
            this.f59900g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("SDK is offline. File not downloaded for url: ", this.f59900g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: c20$c */
    /* loaded from: classes2.dex */
    public static final class C13366c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C13366c f59901g = new C13366c();

        public C13366c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Download directory null or blank. File not downloaded.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: c20$d */
    /* loaded from: classes2.dex */
    public static final class C13367d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C13367d f59902g = new C13367d();

        public C13367d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Zip file url null or blank. File not downloaded.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: c20$e */
    /* loaded from: classes2.dex */
    public static final class C13368e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C13368e f59903g = new C13368e();

        public C13368e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Output filename null or blank. File not downloaded.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: c20$f */
    /* loaded from: classes2.dex */
    public static final class C13369f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f59904g;

        /* renamed from: h */
        public final /* synthetic */ String f59905h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13369f(int i, String str) {
            super(0);
            this.f59904g = i;
            this.f59905h = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "HTTP response code was " + this.f59904g + ". File with url " + this.f59905h + " could not be downloaded.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: c20$g */
    /* loaded from: classes2.dex */
    public static final class C13370g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f59906g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13370g(String str) {
            super(0);
            this.f59906g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Exception during download of file from url : ", this.f59906g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: c20$h */
    /* loaded from: classes2.dex */
    public static final class C13371h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C13371h f59907g = new C13371h();

        public C13371h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Null or blank Uri scheme.";
        }
    }

    static {
        List<String> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"http", "https", "ftp", "ftps", "about", "javascript"});
        f59898b = listOf;
    }

    /* renamed from: a */
    public static final void m62021a(File fileOrDirectory) {
        boolean deleteRecursively;
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        deleteRecursively = FilesKt__UtilsKt.deleteRecursively(fileOrDirectory);
        if (!deleteRecursively) {
            C43664k20.m29441f(C43664k20.f93782a, f59897a, C43664k20.EnumC25082a.W, null, false, new C13364a(fileOrDirectory), 12, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[Catch: all -> 0x00c8, Exception -> 0x00ca, TryCatch #5 {Exception -> 0x00ca, blocks: (B:11:0x002d, B:13:0x0038, B:19:0x0044, B:20:0x0048), top: B:66:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[Catch: all -> 0x00c0, Exception -> 0x00c4, TRY_LEAVE, TryCatch #8 {Exception -> 0x00c4, all -> 0x00c0, blocks: (B:21:0x0058, B:23:0x0060, B:28:0x0075, B:41:0x008a, B:42:0x00bf, B:24:0x0069, B:27:0x0072, B:26:0x006f), top: B:65:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a A[Catch: all -> 0x00c0, Exception -> 0x00c4, TryCatch #8 {Exception -> 0x00c4, all -> 0x00c0, blocks: (B:21:0x0058, B:23:0x0060, B:28:0x0075, B:41:0x008a, B:42:0x00bf, B:24:0x0069, B:27:0x0072, B:26:0x006f), top: B:65:0x0058 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final File m62020b(String downloadDirectoryAbsolutePath, String remoteFileUrl, String outputFilename, String str) {
        boolean isBlank;
        boolean isBlank2;
        boolean isBlank3;
        Exception exc;
        boolean z;
        HttpURLConnection m63194a;
        int responseCode;
        boolean isBlank4;
        Intrinsics.checkNotNullParameter(downloadDirectoryAbsolutePath, "downloadDirectoryAbsolutePath");
        Intrinsics.checkNotNullParameter(remoteFileUrl, "remoteFileUrl");
        Intrinsics.checkNotNullParameter(outputFilename, "outputFilename");
        TrafficStats.setThreadStatsTag(1337);
        if (!Appboy.getOutboundNetworkRequestsOffline()) {
            isBlank = StringsKt__StringsJVMKt.isBlank(downloadDirectoryAbsolutePath);
            if (!isBlank) {
                isBlank2 = StringsKt__StringsJVMKt.isBlank(remoteFileUrl);
                if (!isBlank2) {
                    isBlank3 = StringsKt__StringsJVMKt.isBlank(outputFilename);
                    if (!isBlank3) {
                        HttpURLConnection httpURLConnection = null;
                        try {
                            try {
                                new File(downloadDirectoryAbsolutePath).mkdirs();
                                try {
                                    if (str != null) {
                                        isBlank4 = StringsKt__StringsJVMKt.isBlank(str);
                                        if (!isBlank4) {
                                            z = false;
                                            if (!z) {
                                                outputFilename = Intrinsics.stringPlus(outputFilename, str);
                                            }
                                            File file = new File(downloadDirectoryAbsolutePath, outputFilename);
                                            m63194a = C12986o6.f59033a.m63194a(new URL(remoteFileUrl));
                                            responseCode = m63194a.getResponseCode();
                                            if (responseCode != 200) {
                                                DataInputStream dataInputStream = new DataInputStream(m63194a.getInputStream());
                                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                ByteStreamsKt.copyTo$default(dataInputStream, fileOutputStream, 0, 2, null);
                                                CloseableKt.closeFinally(fileOutputStream, null);
                                                CloseableKt.closeFinally(dataInputStream, null);
                                                m63194a.disconnect();
                                                return file;
                                            }
                                            C43664k20.m29441f(C43664k20.f93782a, f59897a, null, null, false, new C13369f(responseCode, remoteFileUrl), 14, null);
                                            throw new Exception("HTTP response code was " + responseCode + ". File with url " + remoteFileUrl + " could not be downloaded.");
                                        }
                                    }
                                    responseCode = m63194a.getResponseCode();
                                    if (responseCode != 200) {
                                    }
                                } catch (Exception e) {
                                    httpURLConnection = m63194a;
                                    exc = e;
                                    C43664k20.m29441f(C43664k20.f93782a, f59897a, C43664k20.EnumC25082a.E, exc, false, new C13370g(remoteFileUrl), 8, null);
                                    throw new Exception(Intrinsics.stringPlus("Exception during download of file from url : ", remoteFileUrl));
                                } catch (Throwable th) {
                                    httpURLConnection = m63194a;
                                    th = th;
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    throw th;
                                }
                                z = true;
                                if (!z) {
                                }
                                File file2 = new File(downloadDirectoryAbsolutePath, outputFilename);
                                m63194a = C12986o6.f59033a.m63194a(new URL(remoteFileUrl));
                            } catch (Exception e2) {
                                exc = e2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        C43664k20.m29441f(C43664k20.f93782a, f59897a, C43664k20.EnumC25082a.I, null, false, C13368e.f59903g, 12, null);
                        throw new Exception("Output filename is blank. File not downloaded.");
                    }
                } else {
                    C43664k20.m29441f(C43664k20.f93782a, f59897a, C43664k20.EnumC25082a.I, null, false, C13367d.f59902g, 12, null);
                    throw new Exception("Zip file url is blank. File not downloaded.");
                }
            } else {
                C43664k20.m29441f(C43664k20.f93782a, f59897a, C43664k20.EnumC25082a.I, null, false, C13366c.f59901g, 12, null);
                throw new Exception("Download directory is blank. File not downloaded.");
            }
        } else {
            C43664k20.m29441f(C43664k20.f93782a, f59897a, C43664k20.EnumC25082a.I, null, false, new C13365b(remoteFileUrl), 12, null);
            throw new Exception(Intrinsics.stringPlus("SDK is offline. File not downloaded for url: ", remoteFileUrl));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ File m62019c(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        return m62020b(str, str2, str3, str4);
    }

    /* renamed from: d */
    public static final String m62018d(AssetManager assetManager, String assetPath) {
        BufferedReader bufferedReader;
        Intrinsics.checkNotNullParameter(assetManager, "<this>");
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        InputStream open = assetManager.open(assetPath);
        Intrinsics.checkNotNullExpressionValue(open, "this.open(assetPath)");
        InputStreamReader inputStreamReader = new InputStreamReader(open, Charsets.UTF_8);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            String readText = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            return readText;
        } finally {
        }
    }

    /* renamed from: e */
    public static final boolean m62017e(Uri uri) {
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String scheme = uri.getScheme();
        if (scheme != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(scheme);
            if (!isBlank) {
                z = false;
                if (z && !Intrinsics.areEqual(scheme, "file")) {
                    return false;
                }
                return true;
            }
        }
        z = true;
        if (z) {
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m62016f(Uri uri) {
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String scheme = uri.getScheme();
        if (scheme != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(scheme);
            if (!isBlank) {
                z = false;
                if (!z) {
                    C43664k20.m29441f(C43664k20.f93782a, f59897a, C43664k20.EnumC25082a.I, null, false, C13371h.f59907g, 12, null);
                    return false;
                }
                return f59898b.contains(scheme);
            }
        }
        z = true;
        if (!z) {
        }
    }
}
