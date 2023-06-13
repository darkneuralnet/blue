package p000;

import android.content.Context;
import androidx.work.AbstractC12126c;
import androidx.work.C12124b;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Folder;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m28432d2 = {"LrY1;", "LoY1;", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "Landroidx/work/b;", "inputData", "Lio/reactivex/c;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/Folder;", "b", "Lco/bird/android/model/Folder;", "destS3Folder", "LZC6;", "c", "LZC6;", "workManager", "Ljava/io/File;", DateTokenConverter.CONVERTER_KEY, "Ljava/io/File;", "imagesFolder", "", "imagesFolderPath", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lco/bird/android/model/Folder;LZC6;)V", "image-upload_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nImageUploader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageUploader.kt\nco/bird/android/imageupload/uploader/ImageUploaderImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,51:1\n26#2:52\n*S KotlinDebug\n*F\n+ 1 ImageUploader.kt\nco/bird/android/imageupload/uploader/ImageUploaderImpl\n*L\n35#1:52\n*E\n"})
/* renamed from: rY1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48112rY1 implements InterfaceC46333oY1 {

    /* renamed from: a */
    public final Context f107256a;

    /* renamed from: b */
    public final Folder f107257b;

    /* renamed from: c */
    public final ZC6 f107258c;

    /* renamed from: d */
    public final File f107259d;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042,\u0010\u0003\u001a(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Ljava/io/File;", "kotlin.jvm.PlatformType", "files", "", C17296a.f69688o, "([Ljava/io/File;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rY1$a */
    /* loaded from: classes3.dex */
    public static final class C27945a extends Lambda implements Function1<File[], Unit> {

        /* renamed from: h */
        public final /* synthetic */ Class<? extends AbstractC12126c> f107261h;

        /* renamed from: i */
        public final /* synthetic */ C12124b f107262i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27945a(Class<? extends AbstractC12126c> cls, C12124b c12124b) {
            super(1);
            this.f107261h = cls;
            this.f107262i = c12124b;
        }

        /* renamed from: a */
        public final void m15789a(File[] files) {
            Intrinsics.checkNotNullExpressionValue(files, "files");
            C52389yl1.m2660a(files, C48112rY1.this.f107258c, this.f107261h, this.f107262i, C48112rY1.this.f107257b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(File[] fileArr) {
            m15789a(fileArr);
            return Unit.INSTANCE;
        }
    }

    public C48112rY1(Context context, String imagesFolderPath, Folder destS3Folder, ZC6 workManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagesFolderPath, "imagesFolderPath");
        Intrinsics.checkNotNullParameter(destS3Folder, "destS3Folder");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        this.f107256a = context;
        this.f107257b = destS3Folder;
        this.f107258c = workManager;
        String absolutePath = context.getCacheDir().getAbsolutePath();
        this.f107259d = new File(absolutePath + "/" + imagesFolderPath);
    }

    /* renamed from: d */
    public static final File[] m15791d(C48112rY1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        File[] listFiles = this$0.f107259d.listFiles();
        if (listFiles == null) {
            return new File[0];
        }
        return listFiles;
    }

    /* renamed from: e */
    public static final void m15790e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC46333oY1
    /* renamed from: a */
    public AbstractC23461c mo15794a(Class<? extends AbstractC12126c> workerClass, C12124b inputData) {
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AbstractC23442F m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: pY1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                File[] m15791d;
                m15791d = C48112rY1.m15791d(C48112rY1.this);
                return m15791d;
            }
        }).m33142Y(C24542a.m31932c());
        final C27945a c27945a = new C27945a(workerClass, inputData);
        AbstractC23461c m33159G = m33142Y.m33101w(new InterfaceC23484g() { // from class: qY1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48112rY1.m15790e(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun startImageU…     .ignoreElement()\n  }");
        return m33159G;
    }
}
