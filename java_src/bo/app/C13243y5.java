package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\nH\u0007R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f8AX\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"Lbo/app/y5;", "Lbo/app/r2;", "", "Lbo/app/y2;", "triggeredActions", "", C17296a.f69688o, "triggeredAction", "", "", "Lbo/app/k4;", "remotePath", "", "remoteToLocalAssetsMap", "Ljava/util/Map;", "()Ljava/util/Map;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.y5 */
/* loaded from: classes.dex */
public final class C13243y5 implements InterfaceC13080r2 {

    /* renamed from: e */
    public static final C13244a f59476e = new C13244a(null);

    /* renamed from: a */
    private final SharedPreferences f59477a;

    /* renamed from: b */
    private final Map<String, String> f59478b;

    /* renamed from: c */
    private final Map<String, String> f59479c;

    /* renamed from: d */
    private final File f59480d;

    @Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J8\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007JF\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0005H\u0007J.\u0010\t\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00190\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0007R\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006\""}, m28432d2 = {"Lbo/app/y5$a;", "", "Ljava/io/File;", "triggeredAssetDirectory", "", "", "remoteToLocalAssetsMap", "preservedLocalAssetMap", "", C17296a.f69688o, "Landroid/content/SharedPreferences;", "storagePrefs", "", "Landroid/content/SharedPreferences$Editor;", "editor", "localAssetPaths", "", "newRemotePathStrings", "preservedLocalAssetPathMap", "path", "", "", "Lbo/app/y2;", "triggeredActions", "Lkotlin/Pair;", "", "Lbo/app/k4;", "remoteAssetUrl", "b", "LOCAL_ASSETS_FILE_PREFIX", "Ljava/lang/String;", "TRIGGERS_ASSETS_FOLDER", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y5$a */
    /* loaded from: classes.dex */
    public static final class C13244a {

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.y5$a$a */
        /* loaded from: classes.dex */
        public static final class C13245a extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ File[] f59481b;

            @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ljava/io/File;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/io/File;)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 6, 0})
            /* renamed from: bo.app.y5$a$a$a */
            /* loaded from: classes.dex */
            public static final class C13246a extends Lambda implements Function1<File, CharSequence> {

                /* renamed from: b */
                public static final C13246a f59482b = new C13246a();

                public C13246a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final CharSequence invoke(File file) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "it.name");
                    return name;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13245a(File[] fileArr) {
                super(0);
                this.f59481b = fileArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                String joinToString$default;
                joinToString$default = ArraysKt___ArraysKt.joinToString$default(this.f59481b, " , ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C13246a.f59482b, 30, (Object) null);
                return Intrinsics.stringPlus("Local triggered asset directory contains files: ", joinToString$default);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.y5$a$b */
        /* loaded from: classes.dex */
        public static final class C13247b extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ File f59483b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13247b(File file) {
                super(0);
                this.f59483b = file;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Deleting obsolete asset '" + ((Object) this.f59483b.getPath()) + "' from filesystem.";
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.y5$a$c */
        /* loaded from: classes.dex */
        public static final class C13248c extends Lambda implements Function0<String> {

            /* renamed from: b */
            public static final C13248c f59484b = new C13248c();

            public C13248c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Exception while deleting obsolete assets from filesystem.";
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.y5$a$d */
        /* loaded from: classes.dex */
        public static final class C13249d extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ String f59485b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13249d(String str) {
                super(0);
                this.f59485b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Not removing local path for remote path " + ((Object) this.f59485b) + " from cache because it is being preserved until the end of the app run.";
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.y5$a$e */
        /* loaded from: classes.dex */
        public static final class C13250e extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ String f59486b;

            /* renamed from: c */
            final /* synthetic */ String f59487c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13250e(String str, String str2) {
                super(0);
                this.f59486b = str;
                this.f59487c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Removing obsolete local path " + ((Object) this.f59486b) + " for obsolete remote path " + ((Object) this.f59487c) + " from cache.";
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.y5$a$g */
        /* loaded from: classes.dex */
        public static final class C13251g extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef<String> f59488b;

            /* renamed from: c */
            final /* synthetic */ String f59489c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13251g(Ref.ObjectRef<String> objectRef, String str) {
                super(0);
                this.f59488b = objectRef;
                this.f59489c = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Using file extension " + this.f59488b.element + " for remote asset url: " + this.f59489c;
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.y5$a$h */
        /* loaded from: classes.dex */
        public static final class C13252h extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ String f59490b;

            /* renamed from: c */
            final /* synthetic */ String f59491c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13252h(String str, String str2) {
                super(0);
                this.f59490b = str;
                this.f59491c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Retrieving trigger local asset path '" + ((Object) this.f59490b) + "' from local storage for remote path '" + ((Object) this.f59491c) + CoreConstants.SINGLE_QUOTE_CHAR;
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.y5$a$i */
        /* loaded from: classes.dex */
        public static final class C13253i extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ String f59492b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13253i(String str) {
                super(0);
                this.f59492b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Encountered unexpected exception while parsing stored triggered action local assets on remote asset '" + ((Object) this.f59492b) + CoreConstants.SINGLE_QUOTE_CHAR;
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.y5$a$j */
        /* loaded from: classes.dex */
        public static final class C13254j extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ InterfaceC13232y2 f59493b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13254j(InterfaceC13232y2 interfaceC13232y2) {
                super(0);
                this.f59493b = interfaceC13232y2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Pre-fetch off for triggered action " + this.f59493b.getId() + ". Not pre-fetching assets.";
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.y5$a$k */
        /* loaded from: classes.dex */
        public static final class C13255k extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ InterfaceC13232y2 f59494b;

            /* renamed from: c */
            final /* synthetic */ String f59495c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13255k(InterfaceC13232y2 interfaceC13232y2, String str) {
                super(0);
                this.f59494b = interfaceC13232y2;
                this.f59495c = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Received new remote path for triggered action " + this.f59494b.getId() + " at " + this.f59495c + CoreConstants.DOT;
            }
        }

        public /* synthetic */ C13244a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m62687a(File triggeredAssetDirectory, Map<String, String> remoteToLocalAssetsMap, Map<String, String> preservedLocalAssetMap) {
            Intrinsics.checkNotNullParameter(triggeredAssetDirectory, "triggeredAssetDirectory");
            Intrinsics.checkNotNullParameter(remoteToLocalAssetsMap, "remoteToLocalAssetsMap");
            Intrinsics.checkNotNullParameter(preservedLocalAssetMap, "preservedLocalAssetMap");
            File[] listFiles = triggeredAssetDirectory.listFiles();
            if (listFiles == null) {
                return;
            }
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C13245a(listFiles), 6, null);
            try {
                ArrayList arrayList = new ArrayList();
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file = listFiles[i];
                    i++;
                    if (!remoteToLocalAssetsMap.containsValue(file.getPath())) {
                        arrayList.add(file);
                    }
                }
                ArrayList<File> arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!preservedLocalAssetMap.containsValue(((File) obj).getPath())) {
                        arrayList2.add(obj);
                    }
                }
                for (File obsoleteFile : arrayList2) {
                    C43664k20.m29442e(C43664k20.f93782a, C13243y5.f59476e, null, null, false, new C13247b(obsoleteFile), 7, null);
                    Intrinsics.checkNotNullExpressionValue(obsoleteFile, "obsoleteFile");
                    C38903c20.m62021a(obsoleteFile);
                }
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13248c.f59484b, 4, null);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
            r2 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r1, (char) ch.qos.logback.core.CoreConstants.DOT, 0, false, 6, (java.lang.Object) null);
         */
        /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object, java.lang.String] */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String m62684b(String remoteAssetUrl) {
            boolean z;
            int lastIndexOf$default;
            Intrinsics.checkNotNullParameter(remoteAssetUrl, "remoteAssetUrl");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            Uri parse = Uri.parse(remoteAssetUrl);
            if (parse != null) {
                String lastPathSegment = parse.getLastPathSegment();
                if (lastPathSegment != null && lastPathSegment.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z && lastIndexOf$default > -1) {
                    ?? substring = lastPathSegment.substring(lastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                    objectRef.element = substring;
                    C43664k20.m29442e(C43664k20.f93782a, C13243y5.f59476e, C43664k20.EnumC25082a.V, null, false, new C13251g(objectRef, remoteAssetUrl), 6, null);
                }
            }
            return C38352b62.m64968e() + ((String) objectRef.element);
        }

        private C13244a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0049 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0029 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Map<String, String> m62688a(SharedPreferences storagePrefs) {
            String string;
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(storagePrefs, "storagePrefs");
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            Map<String, ?> all = storagePrefs.getAll();
            if (all == null || all.isEmpty()) {
                return concurrentHashMap;
            }
            for (String remoteAssetKey : all.keySet()) {
                try {
                    string = storagePrefs.getString(remoteAssetKey, null);
                } catch (Exception e) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C13253i(remoteAssetKey), 4, null);
                }
                if (string != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(string);
                    if (!isBlank) {
                        z = false;
                        if (z) {
                            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13252h(string, remoteAssetKey), 7, null);
                            Intrinsics.checkNotNullExpressionValue(remoteAssetKey, "remoteAssetKey");
                            concurrentHashMap.put(remoteAssetKey, string);
                        }
                    }
                }
                z = true;
                if (z) {
                }
            }
            return concurrentHashMap;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0029 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m62689a(SharedPreferences.Editor editor, Map<String, String> localAssetPaths, Set<String> newRemotePathStrings, Map<String, String> preservedLocalAssetPathMap) {
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(editor, "editor");
            Intrinsics.checkNotNullParameter(localAssetPaths, "localAssetPaths");
            Intrinsics.checkNotNullParameter(newRemotePathStrings, "newRemotePathStrings");
            Intrinsics.checkNotNullParameter(preservedLocalAssetPathMap, "preservedLocalAssetPathMap");
            Iterator it = new HashSet(localAssetPaths.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (preservedLocalAssetPathMap.containsKey(str)) {
                    C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13249d(str), 7, null);
                } else if (!newRemotePathStrings.contains(str)) {
                    localAssetPaths.remove(str);
                    editor.remove(str);
                    String str2 = localAssetPaths.get(str);
                    if (str2 != null) {
                        isBlank = StringsKt__StringsJVMKt.isBlank(str2);
                        if (!isBlank) {
                            z = false;
                            if (z) {
                                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13250e(str2, str), 7, null);
                                C38903c20.m62021a(new File(str2));
                            }
                        }
                    }
                    z = true;
                    if (z) {
                    }
                }
            }
        }

        /* renamed from: a */
        public final boolean m62686a(String path) {
            Intrinsics.checkNotNullParameter(path, "path");
            return new File(path).exists();
        }

        /* renamed from: a */
        public final Pair<Set<C12820k4>, Set<String>> m62685a(List<? extends InterfaceC13232y2> triggeredActions) {
            boolean isBlank;
            Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (InterfaceC13232y2 interfaceC13232y2 : triggeredActions) {
                if (!interfaceC13232y2.mo62738m()) {
                    C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13254j(interfaceC13232y2), 7, null);
                } else {
                    for (C12820k4 c12820k4 : interfaceC13232y2.mo62742b()) {
                        String m63457b = c12820k4.m63457b();
                        isBlank = StringsKt__StringsJVMKt.isBlank(m63457b);
                        if (!isBlank) {
                            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13255k(interfaceC13232y2, m63457b), 7, null);
                            linkedHashSet.add(c12820k4);
                            linkedHashSet2.add(m63457b);
                        }
                    }
                }
            }
            return new Pair<>(linkedHashSet, linkedHashSet2);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: bo.app.y5$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class C13256b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59496a;

        static {
            int[] iArr = new int[EnumC12870l4.values().length];
            iArr[EnumC12870l4.ZIP.ordinal()] = 1;
            iArr[EnumC12870l4.IMAGE.ordinal()] = 2;
            iArr[EnumC12870l4.FILE.ordinal()] = 3;
            f59496a = iArr;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y5$c */
    /* loaded from: classes.dex */
    public static final class C13257c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59497b;

        /* renamed from: c */
        final /* synthetic */ String f59498c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13257c(String str, String str2) {
            super(0);
            this.f59497b = str;
            this.f59498c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Storing local triggered action html zip asset at local path " + ((Object) this.f59497b) + " for remote path " + this.f59498c;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y5$d */
    /* loaded from: classes.dex */
    public static final class C13258d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59499b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13258d(String str) {
            super(0);
            this.f59499b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to store html zip asset for remote path " + this.f59499b + ". Not storing local asset";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y5$e */
    /* loaded from: classes.dex */
    public static final class C13259e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Uri f59500b;

        /* renamed from: c */
        final /* synthetic */ String f59501c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13259e(Uri uri, String str) {
            super(0);
            this.f59500b = uri;
            this.f59501c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Storing local triggered action asset at local path " + ((Object) this.f59500b.getPath()) + " for remote path " + this.f59501c;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y5$f */
    /* loaded from: classes.dex */
    public static final class C13260f extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59502b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13260f(String str) {
            super(0);
            this.f59502b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to store asset for remote path " + this.f59502b + ". Not storing local asset";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y5$g */
    /* loaded from: classes.dex */
    public static final class C13261g extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59503b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13261g(String str) {
            super(0);
            this.f59503b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Could not download ", this.f59503b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y5$h */
    /* loaded from: classes.dex */
    public static final class C13262h extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13232y2 f59504b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13262h(InterfaceC13232y2 interfaceC13232y2) {
            super(0);
            this.f59504b = interfaceC13232y2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Prefetch is turned off for this triggered action. Not retrieving local asset paths. Action id: ", this.f59504b.getId());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y5$i */
    /* loaded from: classes.dex */
    public static final class C13263i extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59505b;

        /* renamed from: c */
        final /* synthetic */ String f59506c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13263i(String str, String str2) {
            super(0);
            this.f59505b = str;
            this.f59506c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Found local asset at path " + ((Object) this.f59505b) + " for remote asset at path: " + this.f59506c;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y5$j */
    /* loaded from: classes.dex */
    public static final class C13264j extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59507b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13264j(String str) {
            super(0);
            this.f59507b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Could not find local asset for remote path ", this.f59507b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y5$k */
    /* loaded from: classes.dex */
    public static final class C13265k extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC13232y2 f59508b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13265k(InterfaceC13232y2 interfaceC13232y2) {
            super(0);
            this.f59508b = interfaceC13232y2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("No local assets found for action id: ", this.f59508b.getId());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y5$l */
    /* loaded from: classes.dex */
    public static final class C13266l extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59509b;

        /* renamed from: c */
        final /* synthetic */ String f59510c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13266l(String str, String str2) {
            super(0);
            this.f59509b = str;
            this.f59510c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Adding new local path '" + ((Object) this.f59509b) + "' for remote path '" + this.f59510c + "' to cache.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y5$m */
    /* loaded from: classes.dex */
    public static final class C13267m extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59511b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13267m(String str) {
            super(0);
            this.f59511b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to add new local path for remote path ", this.f59511b);
        }
    }

    public C13243y5(Context context, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.triggers.local_assets.", apiKey), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ey, Context.MODE_PRIVATE)");
        this.f59477a = sharedPreferences;
        this.f59478b = f59476e.m62688a(sharedPreferences);
        this.f59479c = new LinkedHashMap();
        this.f59480d = new File(Intrinsics.stringPlus(context.getCacheDir().getPath(), "/ab_triggers"));
    }

    /* renamed from: a */
    public final Map<String, String> m62693a() {
        return this.f59478b;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e A[SYNTHETIC] */
    @Override // bo.app.InterfaceC13190w2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo62690a(List<? extends InterfaceC13232y2> triggeredActions) {
        String m62692a;
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        C13244a c13244a = f59476e;
        Pair<Set<C12820k4>, Set<String>> m62685a = c13244a.m62685a(triggeredActions);
        SharedPreferences.Editor localAssetEditor = this.f59477a.edit();
        Intrinsics.checkNotNullExpressionValue(localAssetEditor, "localAssetEditor");
        c13244a.m62689a(localAssetEditor, this.f59478b, m62685a.component2(), this.f59479c);
        c13244a.m62687a(this.f59480d, this.f59478b, this.f59479c);
        ArrayList<C12820k4> arrayList = new ArrayList();
        for (Object obj : m62685a.component1()) {
            if (!m62693a().containsKey(((C12820k4) obj).m63457b())) {
                arrayList.add(obj);
            }
        }
        for (C12820k4 c12820k4 : arrayList) {
            String m63457b = c12820k4.m63457b();
            try {
                m62692a = m62692a(c12820k4);
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C13267m(m63457b), 4, null);
            }
            if (m62692a != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(m62692a);
                if (!isBlank) {
                    z = false;
                    if (z) {
                        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13266l(m62692a, m63457b), 7, null);
                        m62693a().put(m63457b, m62692a);
                        localAssetEditor.putString(m63457b, m62692a);
                    }
                }
            }
            z = true;
            if (z) {
            }
        }
        localAssetEditor.apply();
    }

    @Override // bo.app.InterfaceC13080r2
    /* renamed from: a */
    public Map<String, String> mo62691a(InterfaceC13232y2 triggeredAction) {
        Map<String, String> emptyMap;
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        if (!triggeredAction.mo62738m()) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13262h(triggeredAction), 7, null);
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C12820k4 c12820k4 : triggeredAction.mo62742b()) {
            String m63457b = c12820k4.m63457b();
            String str = this.f59478b.get(m63457b);
            if (str != null && f59476e.m62686a(str)) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13263i(str, m63457b), 7, null);
                this.f59479c.put(m63457b, str);
                linkedHashMap.put(m63457b, str);
            } else {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C13264j(m63457b), 6, null);
            }
        }
        if (linkedHashMap.isEmpty()) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C13265k(triggeredAction), 6, null);
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final String m62692a(C12820k4 remotePath) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        String m63457b = remotePath.m63457b();
        int i = C13256b.f59496a[remotePath.m63458a().ordinal()];
        boolean z = true;
        if (i == 1) {
            String m77581b = C36992Wz6.m77581b(this.f59480d, m63457b);
            if (m77581b != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(m77581b);
                if (!isBlank) {
                    z = false;
                }
            }
            if (!z) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C13257c(m77581b, m63457b), 6, null);
                return m77581b;
            }
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13258d(m63457b), 7, null);
            return null;
        } else if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            String m62684b = f59476e.m62684b(m63457b);
            try {
                String file = this.f59480d.toString();
                Intrinsics.checkNotNullExpressionValue(file, "triggeredAssetDirectory.toString()");
                Uri fromFile = Uri.fromFile(C38903c20.m62019c(file, m63457b, m62684b, null, 8, null));
                if (fromFile != null) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C13259e(fromFile, m63457b), 6, null);
                    return fromFile.getPath();
                }
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13260f(m63457b), 7, null);
                return null;
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C13261g(m63457b), 4, null);
                return null;
            }
        }
    }
}
