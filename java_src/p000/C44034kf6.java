package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.FileUploadReceipt;
import co.bird.android.model.Folder;
import co.bird.android.model.constant.ContentKind;
import co.bird.android.model.constant.UploadKind;
import co.bird.android.model.wire.WireSignedUrlUploadConfigResponse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferListener;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferState;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferUtility;
import com.amazonaws.services.p026s3.model.CannedAccessControlList;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URLConnection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p053io.CloseableKt;
import kotlin.p053io.FilesKt__UtilsKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p000.InterfaceC38798br4;
import p000.InterfaceC40476ef6;
@Metadata(m28433d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001KB9\b\u0007\u0012\u0006\u0010.\u001a\u00020)\u0012\u0006\u00103\u001a\u00020/\u0012\u0006\u00108\u001a\u000204\u0012\u0006\u0010;\u001a\u000209\u0012\u0006\u0010>\u001a\u00020<\u0012\u0006\u0010A\u001a\u00020?¢\u0006\u0004\bH\u0010IJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002JH\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J.\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J8\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\r2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016J,\u0010&\u001a\u00020%2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\"2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016JH\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J(\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016R\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00103\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b'\u00100\u001a\u0004\b1\u00102R\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\b6\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010CR\u0014\u0010G\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006L"}, m28432d2 = {"Lkf6;", "Lef6;", "Lbr4;", "Ljava/io/File;", "file", "", "s3FolderName", "id", "Lio/reactivex/Observable;", "z", "", "jpeg", "fileName", "Lio/reactivex/F;", "I", "Landroid/net/Uri;", "uri", "Lokhttp3/RequestBody;", "x", "Lco/bird/android/model/constant/ContentKind;", "contentKind", "Lco/bird/android/model/constant/UploadKind;", "uploadKind", "Lco/bird/android/model/Folder;", "s3Folder", "filename", "", "useSignedUrlUpload", "needAssetId", "e", "Lco/bird/android/model/FileUploadReceipt;", "h", "bytes", "g", "", "headers", "signedUrl", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "c", "f", "Landroid/content/Context;", "b", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lgl;", "Lgl;", "getPreference", "()Lgl;", "preference", "Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;", "Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;", "y", "()Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;", "utility", "LZo;", "LZo;", "assetUploadClient", "LTq4;", "LTq4;", "reactiveConfig", "Ldf6;", "Ldf6;", "uploadClient", "Luf1;", "Luf1;", "environment", "i", "Ljava/lang/String;", "bucket", "<init>", "(Landroid/content/Context;Lgl;Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;LZo;LTq4;Ldf6;)V", "j", C17296a.f69688o, "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kf6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44034kf6 implements InterfaceC40476ef6, InterfaceC38798br4 {

    /* renamed from: j */
    public static final C25202a f94724j = new C25202a(null);

    /* renamed from: b */
    public final Context f94725b;

    /* renamed from: c */
    public final C22454gl f94726c;

    /* renamed from: d */
    public final TransferUtility f94727d;

    /* renamed from: e */
    public final InterfaceC10389Zo f94728e;

    /* renamed from: f */
    public final C36207Tq4 f94729f;

    /* renamed from: g */
    public final InterfaceC39884df6 f94730g;

    /* renamed from: h */
    public final EnumC49958uf1 f94731h;

    /* renamed from: i */
    public final String f94732i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"Lkf6$a;", "", "", "PATCH", "Ljava/lang/String;", "POST", "PUT", "<init>", "()V", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: kf6$a */
    /* loaded from: classes4.dex */
    public static final class C25202a {
        public /* synthetic */ C25202a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C25202a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/y;", "", "emitter", "", C17296a.f69688o, "(Lio/reactivex/y;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kf6$b */
    /* loaded from: classes4.dex */
    public static final class C25203b extends Lambda implements Function1<InterfaceC24578y<String>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f94733g;

        /* renamed from: h */
        public final /* synthetic */ String f94734h;

        /* renamed from: i */
        public final /* synthetic */ File f94735i;

        /* renamed from: j */
        public final /* synthetic */ C44034kf6 f94736j;

        @Metadata(m28433d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¨\u0006\u0010"}, m28432d2 = {"kf6$b$a", "Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferListener;", "", "id", "", "bytesCurrent", "bytesTotal", "", "onProgressChanged", "Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferState;", TransferTable.COLUMN_STATE, "onStateChanged", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "onError", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: kf6$b$a */
        /* loaded from: classes4.dex */
        public static final class C25204a implements TransferListener {

            /* renamed from: a */
            public final /* synthetic */ C44034kf6 f94737a;

            /* renamed from: b */
            public final /* synthetic */ String f94738b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC24578y<String> f94739c;

            public C25204a(C44034kf6 c44034kf6, String str, InterfaceC24578y<String> interfaceC24578y) {
                this.f94737a = c44034kf6;
                this.f94738b = str;
                this.f94739c = interfaceC24578y;
            }

            @Override // com.amazonaws.mobileconnectors.p025s3.transferutility.TransferListener
            public void onError(int i, Exception e) {
                Intrinsics.checkNotNullParameter(e, "e");
                this.f94739c.onError(e);
            }

            @Override // com.amazonaws.mobileconnectors.p025s3.transferutility.TransferListener
            public void onProgressChanged(int i, long j, long j2) {
                C41318g46.m40163a("Upload file: " + j + ", " + j2, new Object[0]);
            }

            @Override // com.amazonaws.mobileconnectors.p025s3.transferutility.TransferListener
            public void onStateChanged(int i, TransferState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                if (state == TransferState.COMPLETED) {
                    String str = "https://s3.amazonaws.com/" + this.f94737a.f94732i + "/" + this.f94738b;
                    C41318g46.m40151m("Upload url: " + str, new Object[0]);
                    this.f94739c.onNext(str);
                    this.f94739c.onComplete();
                } else if (state == TransferState.FAILED) {
                    this.f94739c.onError(new Exception("Failed to upload file."));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25203b(String str, String str2, File file, C44034kf6 c44034kf6) {
            super(1);
            this.f94733g = str;
            this.f94734h = str2;
            this.f94735i = file;
            this.f94736j = c44034kf6;
        }

        /* renamed from: a */
        public final void m28665a(InterfaceC24578y<String> emitter) {
            String extension;
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            String str = this.f94733g;
            if (str == null) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            String str2 = this.f94734h;
            extension = FilesKt__UtilsKt.getExtension(this.f94735i);
            String str3 = str2 + "/" + str + InstructionFileId.DOT + extension;
            this.f94736j.m28667y().upload(this.f94736j.f94732i, str3, this.f94735i, CannedAccessControlList.PublicRead).setTransferListener(new C25204a(this.f94736j, str3, emitter));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24578y<String> interfaceC24578y) {
            m28665a(interfaceC24578y);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Ljava/io/File;", "it", "Lio/reactivex/K;", "Lco/bird/android/model/FileUploadReceipt;", "kotlin.jvm.PlatformType", "b", "(Ljava/io/File;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kf6$c */
    /* loaded from: classes4.dex */
    public static final class C25205c extends Lambda implements Function1<File, InterfaceC23447K<? extends FileUploadReceipt>> {

        /* renamed from: h */
        public final /* synthetic */ ContentKind f94741h;

        /* renamed from: i */
        public final /* synthetic */ UploadKind f94742i;

        /* renamed from: j */
        public final /* synthetic */ Folder f94743j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25205c(ContentKind contentKind, UploadKind uploadKind, Folder folder) {
            super(1);
            this.f94741h = contentKind;
            this.f94742i = uploadKind;
            this.f94743j = folder;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends FileUploadReceipt> invoke(File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C44034kf6.this.mo28674h(it, this.f94741h, this.f94742i, this.f94743j);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/FileUploadReceipt;", "receipt", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/FileUploadReceipt;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kf6$d */
    /* loaded from: classes4.dex */
    public static final class C25206d extends Lambda implements Function1<FileUploadReceipt, String> {

        /* renamed from: g */
        public static final C25206d f94744g = new C25206d();

        public C25206d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(FileUploadReceipt receipt) {
            Intrinsics.checkNotNullParameter(receipt, "receipt");
            return receipt.getFileUrl();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;", "uploadConfigResponse", "Lio/reactivex/K;", "Lco/bird/android/model/FileUploadReceipt;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSignedUrlUploadConfigResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kf6$e */
    /* loaded from: classes4.dex */
    public static final class C25207e extends Lambda implements Function1<WireSignedUrlUploadConfigResponse, InterfaceC23447K<? extends FileUploadReceipt>> {

        /* renamed from: g */
        public final /* synthetic */ ContentKind f94745g;

        /* renamed from: h */
        public final /* synthetic */ File f94746h;

        /* renamed from: i */
        public final /* synthetic */ C44034kf6 f94747i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25207e(ContentKind contentKind, File file, C44034kf6 c44034kf6) {
            super(1);
            this.f94745g = contentKind;
            this.f94746h = file;
            this.f94747i = c44034kf6;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends FileUploadReceipt> invoke(WireSignedUrlUploadConfigResponse uploadConfigResponse) {
            AbstractC23461c m72483b;
            Intrinsics.checkNotNullParameter(uploadConfigResponse, "uploadConfigResponse");
            String fileUrlSigned = uploadConfigResponse.getFileUrlSigned();
            String fileUrl = uploadConfigResponse.getFileUrl();
            String mimeType = URLConnection.getFileNameMap().getContentTypeFor(this.f94745g.name());
            MediaType.Companion companion = MediaType.Companion;
            Intrinsics.checkNotNullExpressionValue(mimeType, "mimeType");
            MediaType parse = companion.parse(mimeType);
            if (parse == null) {
                parse = companion.get(mimeType);
            }
            RequestBody create = RequestBody.Companion.create(this.f94746h, parse);
            Map<String, String> headers = uploadConfigResponse.getHeaders();
            String method = uploadConfigResponse.getMethod();
            int hashCode = method.hashCode();
            if (hashCode != 79599) {
                if (hashCode != 2461856) {
                    if (hashCode == 75900968 && method.equals("PATCH")) {
                        m72483b = this.f94747i.f94728e.m72484a(headers, fileUrlSigned, create);
                    }
                    String method2 = uploadConfigResponse.getMethod();
                    m72483b = AbstractC23461c.m33080F(new TypeCastException("Unable to process method for asset upload: " + method2));
                } else {
                    if (method.equals("POST")) {
                        m72483b = this.f94747i.f94728e.m72482c(headers, fileUrlSigned, create);
                    }
                    String method22 = uploadConfigResponse.getMethod();
                    m72483b = AbstractC23461c.m33080F(new TypeCastException("Unable to process method for asset upload: " + method22));
                }
            } else {
                if (method.equals("PUT")) {
                    m72483b = this.f94747i.f94728e.m72483b(headers, fileUrlSigned, create);
                }
                String method222 = uploadConfigResponse.getMethod();
                m72483b = AbstractC23461c.m33080F(new TypeCastException("Unable to process method for asset upload: " + method222));
            }
            return m72483b.m33042m(AbstractC23442F.m33158H(new FileUploadReceipt(uploadConfigResponse.getAssetId(), fileUrl)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Ljava/io/File;", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "b", "(Ljava/io/File;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kf6$f */
    /* loaded from: classes4.dex */
    public static final class C25208f extends Lambda implements Function1<File, InterfaceC23447K<? extends String>> {

        /* renamed from: h */
        public final /* synthetic */ ContentKind f94749h;

        /* renamed from: i */
        public final /* synthetic */ UploadKind f94750i;

        /* renamed from: j */
        public final /* synthetic */ Folder f94751j;

        /* renamed from: k */
        public final /* synthetic */ String f94752k;

        /* renamed from: l */
        public final /* synthetic */ boolean f94753l;

        /* renamed from: m */
        public final /* synthetic */ boolean f94754m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25208f(ContentKind contentKind, UploadKind uploadKind, Folder folder, String str, boolean z, boolean z2) {
            super(1);
            this.f94749h = contentKind;
            this.f94750i = uploadKind;
            this.f94751j = folder;
            this.f94752k = str;
            this.f94753l = z;
            this.f94754m = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends String> invoke(File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C44034kf6.this.mo28677e(it, this.f94749h, this.f94750i, this.f94751j, this.f94752k, this.f94753l, this.f94754m);
        }
    }

    public C44034kf6(Context context, C22454gl preference, TransferUtility utility, InterfaceC10389Zo assetUploadClient, C36207Tq4 reactiveConfig, InterfaceC39884df6 uploadClient) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(utility, "utility");
        Intrinsics.checkNotNullParameter(assetUploadClient, "assetUploadClient");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(uploadClient, "uploadClient");
        this.f94725b = context;
        this.f94726c = preference;
        this.f94727d = utility;
        this.f94728e = assetUploadClient;
        this.f94729f = reactiveConfig;
        this.f94730g = uploadClient;
        EnumC49958uf1 m37699O = preference.m37699O();
        this.f94731h = m37699O;
        String string = context.getString(m37699O.m9904d());
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(environment.awsBucket)");
        this.f94732i = string;
    }

    /* renamed from: C */
    public static final InterfaceC23447K m28685C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final String m28684D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final InterfaceC23447K m28683F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final InterfaceC23447K m28682G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final File m28680J(byte[] jpeg, C44034kf6 this$0, String fileName) {
        Intrinsics.checkNotNullParameter(jpeg, "$jpeg");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fileName, "$fileName");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(jpeg, 0, jpeg.length, options);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(jpeg, 0, jpeg.length, C27606qU.m17493a(options, 800));
        File file = new File(this$0.f94725b.getCacheDir().getAbsolutePath(), fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 65, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            return file;
        } finally {
        }
    }

    /* renamed from: I */
    public final AbstractC23442F<File> m28681I(final byte[] bArr, final String str) {
        AbstractC23442F<File> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: jf6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                File m28680J;
                m28680J = C44034kf6.m28680J(bArr, this, str);
                return m28680J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n        v…   }\n        file\n      }");
        return m33161E;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC38798br4.C13315a.m62290e(this);
    }

    @Override // p000.InterfaceC40476ef6
    /* renamed from: d */
    public AbstractC23461c mo28678d(Map<String, String> headers, String signedUrl, Uri uri) {
        Map<String, String> emptyMap;
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(signedUrl, "signedUrl");
        Intrinsics.checkNotNullParameter(uri, "uri");
        RequestBody m28668x = m28668x(uri);
        if (m28668x == null) {
            AbstractC23461c m33080F = AbstractC23461c.m33080F(new Throwable("Asset to upload had a null path"));
            Intrinsics.checkNotNullExpressionValue(m33080F, "error(Throwable(\"Asset t…upload had a null path\"))");
            return m33080F;
        }
        InterfaceC10389Zo interfaceC10389Zo = this.f94728e;
        emptyMap = MapsKt__MapsKt.emptyMap();
        return interfaceC10389Zo.m72483b(emptyMap, signedUrl, m28668x);
    }

    @Override // p000.InterfaceC40476ef6
    /* renamed from: e */
    public AbstractC23442F<String> mo28677e(File file, ContentKind contentKind, UploadKind uploadKind, Folder s3Folder, String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(contentKind, "contentKind");
        Intrinsics.checkNotNullParameter(uploadKind, "uploadKind");
        Intrinsics.checkNotNullParameter(s3Folder, "s3Folder");
        if (!z && !this.f94729f.m82623f8().m73665a().getAssetConfig().getEnableSignedUrlUpload()) {
            AbstractC23442F<String> firstOrError = m28666z(file, s3Folder.path(), str).firstOrError();
            Intrinsics.checkNotNullExpressionValue(firstOrError, "{\n      upload(file, s3F…ame).firstOrError()\n    }");
            return firstOrError;
        }
        AbstractC23442F<FileUploadReceipt> mo28674h = mo28674h(file, contentKind, uploadKind, s3Folder);
        final C25206d c25206d = C25206d.f94744g;
        AbstractC23442F m33157I = mo28674h.m33157I(new InterfaceC23492o() { // from class: if6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m28684D;
                m28684D = C44034kf6.m28684D(Function1.this, obj);
                return m28684D;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "{\n      uploadContent(fi…> receipt.fileUrl }\n    }");
        return m33157I;
    }

    @Override // p000.InterfaceC40476ef6
    /* renamed from: f */
    public AbstractC23442F<String> mo28676f(byte[] bytes, Folder s3Folder, String str) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(s3Folder, "s3Folder");
        return InterfaceC40476ef6.C20086a.uploadContent$default((InterfaceC40476ef6) this, bytes, s3Folder.getContentKind(), s3Folder.getUploadKind(), s3Folder, str, false, false, 96, (Object) null);
    }

    @Override // p000.InterfaceC40476ef6
    /* renamed from: g */
    public AbstractC23442F<FileUploadReceipt> mo28675g(byte[] bytes, ContentKind contentKind, UploadKind uploadKind, Folder s3Folder, String str) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(contentKind, "contentKind");
        Intrinsics.checkNotNullParameter(uploadKind, "uploadKind");
        Intrinsics.checkNotNullParameter(s3Folder, "s3Folder");
        if (str == null) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        AbstractC23442F<File> m28681I = m28681I(bytes, str);
        final C25205c c25205c = new C25205c(contentKind, uploadKind, s3Folder);
        AbstractC23442F m33165A = m28681I.m33165A(new InterfaceC23492o() { // from class: gf6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m28685C;
                m28685C = C44034kf6.m28685C(Function1.this, obj);
                return m28685C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun uploadBytes…nd, s3Folder)\n      }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC40476ef6
    /* renamed from: h */
    public AbstractC23442F<FileUploadReceipt> mo28674h(File file, ContentKind contentKind, UploadKind uploadKind, Folder s3Folder) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(contentKind, "contentKind");
        Intrinsics.checkNotNullParameter(uploadKind, "uploadKind");
        Intrinsics.checkNotNullParameter(s3Folder, "s3Folder");
        AbstractC23442F<WireSignedUrlUploadConfigResponse> m43926a = this.f94730g.m43926a(uploadKind, contentKind);
        final C25207e c25207e = new C25207e(contentKind, file, this);
        AbstractC23442F m33165A = m43926a.m33165A(new InterfaceC23492o() { // from class: ff6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m28683F;
                m28683F = C44034kf6.m28683F(Function1.this, obj);
                return m28683F;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun uploadConte…dedFileUrl)))\n      }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC38798br4.C13315a.m62286i(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC38798br4.C13315a.m62284k(this);
    }

    /* renamed from: x */
    public final RequestBody m28668x(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(path);
        if (contentTypeFor == null) {
            contentTypeFor = "text/plain";
        }
        MediaType.Companion companion = MediaType.Companion;
        MediaType parse = companion.parse(contentTypeFor);
        if (parse == null) {
            parse = companion.get(contentTypeFor);
        }
        return RequestBody.Companion.create(parse, new File(path));
    }

    /* renamed from: y */
    public final TransferUtility m28667y() {
        return this.f94727d;
    }

    /* renamed from: z */
    public final Observable<String> m28666z(File file, String str, String str2) {
        return C45832nh5.m23307i(new C25203b(str2, str, file, this));
    }

    @Override // p000.InterfaceC40476ef6
    /* renamed from: c */
    public AbstractC23442F<String> mo28679c(byte[] bytes, ContentKind contentKind, UploadKind uploadKind, Folder s3Folder, String str, boolean z, boolean z2) {
        String str2;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(contentKind, "contentKind");
        Intrinsics.checkNotNullParameter(uploadKind, "uploadKind");
        Intrinsics.checkNotNullParameter(s3Folder, "s3Folder");
        if (str == null) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str2 = uuid;
        } else {
            str2 = str;
        }
        AbstractC23442F<File> m28681I = m28681I(bytes, "photo.jpg");
        final C25208f c25208f = new C25208f(contentKind, uploadKind, s3Folder, str2, z, z2);
        AbstractC23442F m33165A = m28681I.m33165A(new InterfaceC23492o() { // from class: hf6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m28682G;
                m28682G = C44034kf6.m28682G(Function1.this, obj);
                return m28682G;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun uploadConte…ssetId,\n      )\n    }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC38798br4.C13315a.m62288g(this);
    }
}
