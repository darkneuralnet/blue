package p000;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BugReportAttachment;
import co.bird.android.model.wire.WireLocationKt;
import co.bird.api.request.BugReportNewRequestBody;
import co.bird.api.request.BugReportUpdateFileBody;
import co.bird.api.response.BugReportNewResponse;
import co.bird.api.response.BugReportUpdateFileResponse;
import com.amazonaws.services.p026s3.util.Mimetypes;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.ByteStreamsKt;
import kotlin.p053io.FilesKt__UtilsKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p000.C50788w30;
import p000.InterfaceC40476ef6;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J<\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"Lw30;", "Lr30;", "", "reason", "summary", "", "fileNames", "ticketProject", "Lio/reactivex/F;", "Lco/bird/api/response/BugReportNewResponse;", C17296a.f69688o, "fileId", "Lco/bird/api/response/BugReportUpdateFileResponse;", "f", "Lco/bird/android/model/BugReportAttachment;", "bugReportAttachment", "Ljava/io/File;", "file", "b", "Lq30;", "Lq30;", "bugReportClient", "Ldr4;", "Ldr4;", "reactiveLocationManager", "Lef6;", "c", "Lef6;", "uploadManager", "Landroid/content/Context;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lq30;Ldr4;Lef6;Landroid/content/Context;)V", "bugreport_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBugReportManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReportManagerImpl.kt\nco/bird/android/manager/bugreport/BugReportManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
/* renamed from: w30  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50788w30 implements InterfaceC47825r30 {

    /* renamed from: a */
    public final InterfaceC47232q30 f115202a;

    /* renamed from: b */
    public final InterfaceC40001dr4 f115203b;

    /* renamed from: c */
    public final InterfaceC40476ef6 f115204c;

    /* renamed from: d */
    public final Context f115205d;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Ljava/io/File;", "cachedFile", "Lio/reactivex/K;", "Lco/bird/api/response/BugReportUpdateFileResponse;", "kotlin.jvm.PlatformType", "b", "(Ljava/io/File;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBugReportManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReportManagerImpl.kt\nco/bird/android/manager/bugreport/BugReportManagerImpl$uploadFile$2\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,103:1\n36#2:104\n*S KotlinDebug\n*F\n+ 1 BugReportManagerImpl.kt\nco/bird/android/manager/bugreport/BugReportManagerImpl$uploadFile$2\n*L\n87#1:104\n*E\n"})
    /* renamed from: w30$a */
    /* loaded from: classes4.dex */
    public static final class C29745a extends Lambda implements Function1<File, InterfaceC23447K<? extends BugReportUpdateFileResponse>> {

        /* renamed from: h */
        public final /* synthetic */ String f115207h;

        /* renamed from: i */
        public final /* synthetic */ BugReportAttachment f115208i;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/BugReportUpdateFileResponse;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/BugReportUpdateFileResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: w30$a$a */
        /* loaded from: classes4.dex */
        public static final class C29746a extends Lambda implements Function1<BugReportUpdateFileResponse, InterfaceC23447K<? extends BugReportUpdateFileResponse>> {

            /* renamed from: g */
            public final /* synthetic */ C50788w30 f115209g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29746a(C50788w30 c50788w30) {
                super(1);
                this.f115209g = c50788w30;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends BugReportUpdateFileResponse> invoke(BugReportUpdateFileResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return this.f115209g.m7532f(response.getFileId());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29745a(String str, BugReportAttachment bugReportAttachment) {
            super(1);
            this.f115207h = str;
            this.f115208i = bugReportAttachment;
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends BugReportUpdateFileResponse> invoke(File cachedFile) {
            Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
            InterfaceC40476ef6 interfaceC40476ef6 = C50788w30.this.f115204c;
            String str = this.f115207h;
            Uri fromFile = Uri.fromFile(cachedFile);
            Intrinsics.checkNotNullExpressionValue(fromFile, "fromFile(this)");
            AbstractC23442F m33046j0 = InterfaceC40476ef6.C20086a.putAssetUpload$default(interfaceC40476ef6, null, str, fromFile, 1, null).m33046j0(new BugReportUpdateFileResponse(this.f115208i.getFileId()));
            final C29746a c29746a = new C29746a(C50788w30.this);
            return m33046j0.m33165A(new InterfaceC23492o() { // from class: v30
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = C50788w30.C29745a.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: w30$b */
    /* loaded from: classes4.dex */
    public static final class C29747b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C29747b f115210g = new C29747b();

        public C29747b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while uploading asset via PUT", new Object[0]);
        }
    }

    public C50788w30(InterfaceC47232q30 bugReportClient, InterfaceC40001dr4 reactiveLocationManager, InterfaceC40476ef6 uploadManager, Context context) {
        Intrinsics.checkNotNullParameter(bugReportClient, "bugReportClient");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(uploadManager, "uploadManager");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f115202a = bugReportClient;
        this.f115203b = reactiveLocationManager;
        this.f115204c = uploadManager;
        this.f115205d = context;
    }

    /* renamed from: g */
    public static final File m7531g(C50788w30 this$0, File file) {
        File copyTo$default;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(file, "$file");
        copyTo$default = FilesKt__UtilsKt.copyTo$default(file, new File(this$0.f115205d.getCacheDir().getAbsolutePath(), file.getName()), true, 0, 4, null);
        return copyTo$default;
    }

    /* renamed from: h */
    public static final InterfaceC23447K m7530h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m7529i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC47825r30
    /* renamed from: a */
    public AbstractC23442F<BugReportNewResponse> mo7537a(String str, String str2, List<String> fileNames, String str3) {
        Intrinsics.checkNotNullParameter(fileNames, "fileNames");
        AbstractC23442F<HM4<BugReportNewResponse>> m33142Y = this.f115202a.m18255a(new BugReportNewRequestBody(str3, str, str2, null, fileNames, null, WireLocationKt.toLocation$default(this.f115203b.mo43616p().m73665a(), null, 1, null), 40, null)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "bugReportClient.submitNe…scribeOn(Schedulers.io())");
        return C38096ag5.m70883l(m33142Y);
    }

    @Override // p000.InterfaceC47825r30
    /* renamed from: b */
    public AbstractC23442F<BugReportUpdateFileResponse> mo7536b(BugReportAttachment bugReportAttachment, final File file) {
        Intrinsics.checkNotNullParameter(bugReportAttachment, "bugReportAttachment");
        Intrinsics.checkNotNullParameter(file, "file");
        String uploadUrl = bugReportAttachment.getUploadUrl();
        if (uploadUrl == null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] readBytes = ByteStreamsKt.readBytes(fileInputStream);
                fileInputStream.close();
                return this.f115202a.m18253c(bugReportAttachment.getFileId(), readBytes.length, RequestBody.Companion.create(readBytes, MediaType.Companion.parse(Mimetypes.MIMETYPE_OCTET_STREAM), 0, readBytes.length));
            } catch (Exception e) {
                AbstractC23442F<BugReportUpdateFileResponse> m33100x = AbstractC23442F.m33100x(e);
                Intrinsics.checkNotNullExpressionValue(m33100x, "error(e)");
                return m33100x;
            }
        }
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: s30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                File m7531g;
                m7531g = C50788w30.m7531g(C50788w30.this, file);
                return m7531g;
            }
        });
        final C29745a c29745a = new C29745a(uploadUrl, bugReportAttachment);
        AbstractC23442F m33165A = m33161E.m33165A(new InterfaceC23492o() { // from class: t30
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m7530h;
                m7530h = C50788w30.m7530h(Function1.this, obj);
                return m7530h;
            }
        });
        final C29747b c29747b = C29747b.f115210g;
        AbstractC23442F<BugReportUpdateFileResponse> m33106t = m33165A.m33106t(new InterfaceC23484g() { // from class: u30
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50788w30.m7529i(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "override fun uploadFile(…PUT\")\n        }\n    }\n  }");
        return m33106t;
    }

    /* renamed from: f */
    public AbstractC23442F<BugReportUpdateFileResponse> m7532f(String str) {
        AbstractC23442F<HM4<BugReportUpdateFileResponse>> m33142Y = this.f115202a.m18254b(new BugReportUpdateFileBody(str)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "bugReportClient.updateFi…scribeOn(Schedulers.io())");
        return C38096ag5.m70883l(m33142Y);
    }
}
