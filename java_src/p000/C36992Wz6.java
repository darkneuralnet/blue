package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.p053io.ByteStreamsKt;
import kotlin.p053io.CloseableKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0007J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007J$\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fH\u0007J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¨\u0006\u0017"}, m28432d2 = {"LWz6;", "", "Ljava/io/File;", "localDirectory", "", "remoteZipUrl", "b", "unpackDirectory", "zipFile", "", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, C17296a.f69688o, "originalString", "", "remoteToLocalAssetMap", "c", "intendedParentDirectory", "childFilePath", "e", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Wz6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36992Wz6 {

    /* renamed from: a */
    public static final C36992Wz6 f42436a = new C36992Wz6();

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Wz6$a */
    /* loaded from: classes2.dex */
    public static final class C9250a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9250a f42437g = new C9250a();

        public C9250a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Remote zip url is empty. No local URL will be created.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Wz6$b */
    /* loaded from: classes2.dex */
    public static final class C9251b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f42438g;

        /* renamed from: h */
        public final /* synthetic */ String f42439h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9251b(String str, String str2) {
            super(0);
            this.f42438g = str;
            this.f42439h = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Starting download of url: " + this.f42438g + " to " + this.f42439h;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Wz6$c */
    /* loaded from: classes2.dex */
    public static final class C9252c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f42440g;

        /* renamed from: h */
        public final /* synthetic */ String f42441h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9252c(String str, String str2) {
            super(0);
            this.f42440g = str;
            this.f42441h = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Html content zip downloaded. " + this.f42440g + " to " + this.f42441h;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Wz6$d */
    /* loaded from: classes2.dex */
    public static final class C9253d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9253d f42442g = new C9253d();

        public C9253d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Error during the zip unpack.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Wz6$e */
    /* loaded from: classes2.dex */
    public static final class C9254e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f42443g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9254e(String str) {
            super(0);
            this.f42443g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Html content zip unpacked to to " + this.f42443g + CoreConstants.DOT;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Wz6$f */
    /* loaded from: classes2.dex */
    public static final class C9255f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f42444g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9255f(String str) {
            super(0);
            this.f42444g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Could not download zip file to local storage. ", this.f42444g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Wz6$g */
    /* loaded from: classes2.dex */
    public static final class C9256g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<String> f42445g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9256g(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.f42445g = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Cannot find local asset file at path: ", this.f42445g.element);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Wz6$h */
    /* loaded from: classes2.dex */
    public static final class C9257h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f42446g;

        /* renamed from: h */
        public final /* synthetic */ Ref.ObjectRef<String> f42447h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9257h(String str, Ref.ObjectRef<String> objectRef) {
            super(0);
            this.f42446g = str;
            this.f42447h = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Replacing remote url \"" + this.f42446g + "\" with local uri \"" + this.f42447h.element + '\"';
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Wz6$i */
    /* loaded from: classes2.dex */
    public static final class C9258i extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9258i f42448g = new C9258i();

        public C9258i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Unpack directory is blank. Zip file not unpacked.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Wz6$j */
    /* loaded from: classes2.dex */
    public static final class C9259j extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<String> f42449g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9259j(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.f42449g = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Error creating parent directory ", this.f42449g.element);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Wz6$k */
    /* loaded from: classes2.dex */
    public static final class C9260k extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<String> f42450g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9260k(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.f42450g = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Error unpacking zipEntry ", this.f42450g.element);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Wz6$l */
    /* loaded from: classes2.dex */
    public static final class C9261l extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ File f42451g;

        /* renamed from: h */
        public final /* synthetic */ String f42452h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9261l(File file, String str) {
            super(0);
            this.f42451g = file;
            this.f42452h = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Error during unpack of zip file " + ((Object) this.f42451g.getAbsolutePath()) + " to " + this.f42452h + CoreConstants.DOT;
        }
    }

    private C36992Wz6() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final File m77582a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new File(((Object) context.getCacheDir().getPath()) + JsonPointer.SEPARATOR + "appboy-html-inapp-messages");
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m77581b(File localDirectory, String remoteZipUrl) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(localDirectory, "localDirectory");
        Intrinsics.checkNotNullParameter(remoteZipUrl, "remoteZipUrl");
        isBlank = StringsKt__StringsJVMKt.isBlank(remoteZipUrl);
        if (isBlank) {
            C43664k20.m29442e(C43664k20.f93782a, f42436a, C43664k20.EnumC25082a.W, null, false, C9250a.f42437g, 6, null);
            return null;
        }
        String absolutePath = localDirectory.getAbsolutePath();
        String valueOf = String.valueOf(C38352b62.m64968e());
        String str = ((Object) absolutePath) + JsonPointer.SEPARATOR + valueOf;
        C43664k20 c43664k20 = C43664k20.f93782a;
        C36992Wz6 c36992Wz6 = f42436a;
        C43664k20.m29442e(c43664k20, c36992Wz6, null, null, false, new C9251b(remoteZipUrl, str), 7, null);
        try {
            File m62020b = C38903c20.m62020b(str, remoteZipUrl, valueOf, ".zip");
            C43664k20.m29442e(c43664k20, c36992Wz6, null, null, false, new C9252c(remoteZipUrl, str), 7, null);
            if (!m77579d(str, m62020b)) {
                C43664k20.m29442e(c43664k20, c36992Wz6, C43664k20.EnumC25082a.W, null, false, C9253d.f42442g, 6, null);
                C38903c20.m62021a(new File(str));
                return null;
            }
            C43664k20.m29442e(c43664k20, c36992Wz6, null, null, false, new C9254e(str), 7, null);
            return str;
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f42436a, C43664k20.EnumC25082a.E, e, false, new C9255f(remoteZipUrl), 4, null);
            C38903c20.m62021a(new File(str));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @JvmStatic
    /* renamed from: c */
    public static final String m77580c(String originalString, Map<String, String> remoteToLocalAssetMap) {
        boolean startsWith$default;
        T t;
        boolean contains$default;
        Intrinsics.checkNotNullParameter(originalString, "originalString");
        Intrinsics.checkNotNullParameter(remoteToLocalAssetMap, "remoteToLocalAssetMap");
        String str = originalString;
        for (Map.Entry<String, String> entry : remoteToLocalAssetMap.entrySet()) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = entry.getValue();
            if (!new File((String) objectRef.element).exists()) {
                C43664k20.m29442e(C43664k20.f93782a, f42436a, C43664k20.EnumC25082a.W, null, false, new C9256g(objectRef), 6, null);
            } else {
                C36992Wz6 c36992Wz6 = f42436a;
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default((String) objectRef.element, "file://", false, 2, null);
                if (startsWith$default) {
                    t = (String) objectRef.element;
                } else {
                    t = Intrinsics.stringPlus("file://", objectRef.element);
                }
                objectRef.element = t;
                String key = entry.getKey();
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) key, false, 2, (Object) null);
                if (contains$default) {
                    C43664k20.m29442e(C43664k20.f93782a, c36992Wz6, null, null, false, new C9257h(key, objectRef), 7, null);
                    str = StringsKt__StringsJVMKt.replace$default(str, key, (String) objectRef.element, false, 4, (Object) null);
                }
            }
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.Object, java.lang.String] */
    @JvmStatic
    /* renamed from: d */
    public static final boolean m77579d(String unpackDirectory, File zipFile) {
        boolean isBlank;
        boolean startsWith$default;
        Intrinsics.checkNotNullParameter(unpackDirectory, "unpackDirectory");
        Intrinsics.checkNotNullParameter(zipFile, "zipFile");
        isBlank = StringsKt__StringsJVMKt.isBlank(unpackDirectory);
        if (isBlank) {
            C43664k20.m29442e(C43664k20.f93782a, f42436a, C43664k20.EnumC25082a.I, null, false, C9258i.f42448g, 6, null);
            return false;
        }
        new File(unpackDirectory).mkdirs();
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                ?? name = nextEntry.getName();
                Intrinsics.checkNotNullExpressionValue(name, "zipEntry.name");
                objectRef.element = name;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = name.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(lowerCase, "__macosx", false, 2, null);
                if (!startsWith$default) {
                    try {
                        String m77578e = m77578e(unpackDirectory, unpackDirectory + JsonPointer.SEPARATOR + ((String) objectRef.element));
                        if (nextEntry.isDirectory()) {
                            new File(m77578e).mkdirs();
                        } else {
                            try {
                                File parentFile = new File(m77578e).getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                }
                            } catch (Exception e) {
                                C43664k20.m29442e(C43664k20.f93782a, f42436a, C43664k20.EnumC25082a.E, e, false, new C9259j(objectRef), 4, null);
                            }
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(m77578e));
                            try {
                                ByteStreamsKt.copyTo$default(zipInputStream, bufferedOutputStream, 0, 2, null);
                                CloseableKt.closeFinally(bufferedOutputStream, null);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                    break;
                                } catch (Throwable th2) {
                                    CloseableKt.closeFinally(bufferedOutputStream, th);
                                    throw th2;
                                    break;
                                }
                            }
                        }
                    } catch (Exception e2) {
                        C43664k20.m29442e(C43664k20.f93782a, f42436a, C43664k20.EnumC25082a.E, e2, false, new C9260k(objectRef), 4, null);
                    }
                }
                zipInputStream.closeEntry();
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(zipInputStream, null);
            return true;
        } catch (Throwable th3) {
            C43664k20.m29442e(C43664k20.f93782a, f42436a, C43664k20.EnumC25082a.E, th3, false, new C9261l(zipFile, unpackDirectory), 4, null);
            return false;
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final String m77578e(String intendedParentDirectory, String childFilePath) {
        boolean startsWith$default;
        Intrinsics.checkNotNullParameter(intendedParentDirectory, "intendedParentDirectory");
        Intrinsics.checkNotNullParameter(childFilePath, "childFilePath");
        String parentCanonicalPath = new File(intendedParentDirectory).getCanonicalPath();
        String childFileCanonicalPath = new File(childFilePath).getCanonicalPath();
        Intrinsics.checkNotNullExpressionValue(childFileCanonicalPath, "childFileCanonicalPath");
        Intrinsics.checkNotNullExpressionValue(parentCanonicalPath, "parentCanonicalPath");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(childFileCanonicalPath, parentCanonicalPath, false, 2, null);
        if (startsWith$default) {
            return childFileCanonicalPath;
        }
        throw new IllegalStateException("Invalid file with original path: " + childFilePath + " with canonical path: " + ((Object) childFileCanonicalPath) + " does not exist under intended parent with  path: " + intendedParentDirectory + " and canonical path: " + ((Object) parentCanonicalPath));
    }
}
