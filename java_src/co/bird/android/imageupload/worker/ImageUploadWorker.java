package co.bird.android.imageupload.worker;

import android.content.Context;
import androidx.work.AbstractC12126c;
import androidx.work.C12124b;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.imageupload.worker.ImageUploadWorker;
import co.bird.android.model.FileUploadReceipt;
import co.bird.android.model.Folder;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/imageupload/worker/ImageUploadWorker;", "Landroidx/work/RxWorker;", "Lio/reactivex/F;", "Landroidx/work/c$a;", "r", "", "uploadedImageUrl", "Landroidx/work/b;", "w", "Lef6;", "h", "Lef6;", "z", "()Lef6;", "setUploadManager", "(Lef6;)V", "uploadManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "i", C17296a.f69688o, "image-upload_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nImageUploadWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageUploadWorker.kt\nco/bird/android/imageupload/worker/ImageUploadWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* loaded from: classes3.dex */
public final class ImageUploadWorker extends RxWorker {

    /* renamed from: i */
    public static final C16000a f66040i = new C16000a(null);

    /* renamed from: h */
    public InterfaceC40476ef6 f66041h;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, m28432d2 = {"Lco/bird/android/imageupload/worker/ImageUploadWorker$a;", "", "", "imageToUploadPath", "uploadToFolder", "Landroidx/work/b;", C17296a.f69688o, "KEY_IMAGE_TO_UPLOAD_PATH", "Ljava/lang/String;", "KEY_UPLOADED_IMAGE_URL", "KEY_UPLOAD_TO_FOLDER", "<init>", "()V", "image-upload_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.imageupload.worker.ImageUploadWorker$a */
    /* loaded from: classes3.dex */
    public static final class C16000a {
        public /* synthetic */ C16000a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C12124b m56125a(String imageToUploadPath, String uploadToFolder) {
            Intrinsics.checkNotNullParameter(imageToUploadPath, "imageToUploadPath");
            Intrinsics.checkNotNullParameter(uploadToFolder, "uploadToFolder");
            C12124b m65581a = new C12124b.C12125a().m65577e("IMAGES_FOLDER", imageToUploadPath).m65577e("UPLOAD_TO_FOLDER", uploadToFolder).m65581a();
            Intrinsics.checkNotNullExpressionValue(m65581a, "Builder()\n        .putSt…oFolder)\n        .build()");
            return m65581a;
        }

        private C16000a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/FileUploadReceipt;", "<name for destructuring parameter 0>", "Landroidx/work/c$a;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/FileUploadReceipt;)Landroidx/work/c$a;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.imageupload.worker.ImageUploadWorker$b */
    /* loaded from: classes3.dex */
    public static final class C16001b extends Lambda implements Function1<FileUploadReceipt, AbstractC12126c.AbstractC12127a> {
        public C16001b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC12126c.AbstractC12127a invoke(FileUploadReceipt fileUploadReceipt) {
            Intrinsics.checkNotNullParameter(fileUploadReceipt, "<name for destructuring parameter 0>");
            return AbstractC12126c.AbstractC12127a.m65561d(ImageUploadWorker.this.m56129w(fileUploadReceipt.component2()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Landroidx/work/c$a;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Landroidx/work/c$a;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.imageupload.worker.ImageUploadWorker$c */
    /* loaded from: classes3.dex */
    public static final class C16002c extends Lambda implements Function1<Throwable, AbstractC12126c.AbstractC12127a> {
        public C16002c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC12126c.AbstractC12127a invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (ImageUploadWorker.this.m65571h() >= 12) {
                return AbstractC12126c.AbstractC12127a.m65562c();
            }
            return AbstractC12126c.AbstractC12127a.m65563b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageUploadWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = m65576b();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(applicationContext);
        Intrinsics.checkNotNull(m21419a, "null cannot be cast to non-null type co.bird.android.imageupload.worker.ImageUploadWorkerComponent");
        ((InterfaceC45147mY1) m21419a).mo25448J0(this);
    }

    /* renamed from: x */
    public static final AbstractC12126c.AbstractC12127a m56128x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (AbstractC12126c.AbstractC12127a) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final AbstractC12126c.AbstractC12127a m56127y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (AbstractC12126c.AbstractC12127a) tmp0.invoke(obj);
    }

    @Override // androidx.work.RxWorker
    /* renamed from: r */
    public AbstractC23442F<AbstractC12126c.AbstractC12127a> mo55853r() {
        Folder folder;
        String m65585i = m65572g().m65585i("IMAGES_FOLDER");
        String m65585i2 = m65572g().m65585i("UPLOAD_TO_FOLDER");
        if (m65585i2 != null) {
            folder = Folder.Companion.from(m65585i2);
        } else {
            folder = null;
        }
        if (m65585i != null && folder != null) {
            Observable<FileUploadReceipt> m33123k0 = m56126z().mo28674h(new File(m65585i), folder.getContentKind(), folder.getUploadKind(), folder).m33123k0();
            final C16001b c16001b = new C16001b();
            Observable<R> map = m33123k0.map(new InterfaceC23492o() { // from class: kY1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    AbstractC12126c.AbstractC12127a m56128x;
                    m56128x = ImageUploadWorker.m56128x(Function1.this, obj);
                    return m56128x;
                }
            });
            final C16002c c16002c = new C16002c();
            AbstractC23442F<AbstractC12126c.AbstractC12127a> singleOrError = map.onErrorReturn(new InterfaceC23492o() { // from class: lY1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    AbstractC12126c.AbstractC12127a m56127y;
                    m56127y = ImageUploadWorker.m56127y(Function1.this, obj);
                    return m56127y;
                }
            }).singleOrError();
            Intrinsics.checkNotNullExpressionValue(singleOrError, "override fun createWork(…     .singleOrError()\n  }");
            return singleOrError;
        }
        AbstractC23442F<AbstractC12126c.AbstractC12127a> m33158H = AbstractC23442F.m33158H(AbstractC12126c.AbstractC12127a.m65564a());
        Intrinsics.checkNotNullExpressionValue(m33158H, "just(Result.failure())");
        return m33158H;
    }

    /* renamed from: w */
    public final C12124b m56129w(String str) {
        C12124b m65581a = new C12124b.C12125a().m65577e("UPLOADED_IMAGE_URL", str).m65581a();
        Intrinsics.checkNotNullExpressionValue(m65581a, "Builder()\n      .putStri…dImageUrl)\n      .build()");
        return m65581a;
    }

    /* renamed from: z */
    public final InterfaceC40476ef6 m56126z() {
        InterfaceC40476ef6 interfaceC40476ef6 = this.f66041h;
        if (interfaceC40476ef6 != null) {
            return interfaceC40476ef6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uploadManager");
        return null;
    }
}
