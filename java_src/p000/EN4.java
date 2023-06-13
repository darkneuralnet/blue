package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.FileUploadReceipt;
import co.bird.android.model.Folder;
import co.bird.android.model.PhotoBannerContext;
import co.bird.android.model.PhotoBannerViewModel;
import co.bird.android.model.PhotoSavedModel;
import co.bird.android.model.constant.ContentKind;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40476ef6;
import p000.S74;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BU\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\b\b\u0001\u00105\u001a\u000202\u0012\b\b\u0001\u00107\u001a\u000202¢\u0006\u0004\bH\u0010IJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J$\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u000f\u0010\u0015\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R.\u0010G\u001a\u0010\u0012\f\u0012\n A*\u0004\u0018\u00010\b0\b0@8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010\u0016\u001a\u0004\bD\u0010E¨\u0006J"}, m28432d2 = {"LEN4;", "LoN4;", "", "photo", "Landroid/content/Intent;", "intent", "", "E", "Landroid/graphics/Bitmap;", "bitmap", "A", "", "savePath", "Lco/bird/android/model/PhotoBannerViewModel;", "photoBannerViewModel", "Lco/bird/android/model/Folder;", "destS3Folder", C17296a.f69688o, "onResume", "onPause", "x", "s", "()V", "LVq4;", "LVq4;", "eventStream", "LTq4;", "b", "LTq4;", "reactiveConfig", "Lef6;", "c", "Lef6;", "uploadManager", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LFN4;", "e", "LFN4;", "ui", "Le13;", "f", "Le13;", "navigator", "LEa;", "g", "LEa;", "analyticsManager", "", "h", "Z", "overrideUploadViaSignedUrl", "i", "useAssetId", "j", "Ljava/lang/String;", "k", "Lco/bird/android/model/Folder;", "Lco/bird/android/model/PhotoBannerContext;", "l", "Lco/bird/android/model/PhotoBannerContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "m", "Lio/reactivex/subjects/a;", "t", "()Lio/reactivex/subjects/a;", "getImageSubject$retakeable_photo_release$annotations", "imageSubject", "<init>", "(LVq4;LTq4;Lef6;Lcom/uber/autodispose/ScopeProvider;LFN4;Le13;LEa;ZZ)V", "retakeable-photo_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRetakeablePhotoPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetakeablePhotoPresenter.kt\nco/bird/android/retakeablephoto/RetakeablePhotoPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,213:1\n180#2:214\n180#2:215\n180#2:216\n199#2:217\n180#2:218\n199#2:219\n180#2:220\n*S KotlinDebug\n*F\n+ 1 RetakeablePhotoPresenter.kt\nco/bird/android/retakeablephoto/RetakeablePhotoPresenterImpl\n*L\n81#1:214\n84#1:215\n87#1:216\n130#1:217\n166#1:218\n175#1:219\n197#1:220\n*E\n"})
/* renamed from: EN4 */
/* loaded from: classes4.dex */
public final class EN4 implements InterfaceC46237oN4 {

    /* renamed from: a */
    public final InterfaceC36675Vq4 f7360a;

    /* renamed from: b */
    public final C36207Tq4 f7361b;

    /* renamed from: c */
    public final InterfaceC40476ef6 f7362c;

    /* renamed from: d */
    public final ScopeProvider f7363d;

    /* renamed from: e */
    public final FN4 f7364e;

    /* renamed from: f */
    public final InterfaceC40099e13 f7365f;

    /* renamed from: g */
    public final InterfaceC1880Ea f7366g;

    /* renamed from: h */
    public final boolean f7367h;

    /* renamed from: i */
    public final boolean f7368i;

    /* renamed from: j */
    public String f7369j;

    /* renamed from: k */
    public Folder f7370k;

    /* renamed from: l */
    public PhotoBannerContext f7371l;

    /* renamed from: m */
    public final C24552a<Bitmap> f7372m;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00012R\u0010\u0005\u001aN\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*&\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: EN4$a */
    /* loaded from: classes4.dex */
    public static final class C1802a extends Lambda implements Function1<Triple<? extends Unit, ? extends Bitmap, ? extends Boolean>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Intent f7374h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1802a(Intent intent) {
            super(1);
            this.f7374h = intent;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
            if (r6.booleanValue() == false) goto L11;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m109061a(Triple<Unit, Bitmap, Boolean> triple) {
            Bitmap image = triple.component2();
            Boolean enableBackgroundImageUpload = triple.component3();
            String str = EN4.this.f7369j;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savePath");
                str = null;
            }
            Uri parse = Uri.parse(str);
            if (parse.getLastPathSegment() != null) {
                Intrinsics.checkNotNullExpressionValue(enableBackgroundImageUpload, "enableBackgroundImageUpload");
            }
            if (parse.getLastPathSegment() == null || EN4.this.f7370k != null) {
                if (EN4.this.f7370k != null) {
                    EN4 en4 = EN4.this;
                    Intrinsics.checkNotNullExpressionValue(image, "image");
                    en4.m109092E(C27606qU.toByteArray$default(image, 0, 1, null), this.f7374h);
                    return;
                }
                return;
            }
            EN4 en42 = EN4.this;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            en42.m109096A(image, this.f7374h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Unit, ? extends Bitmap, ? extends Boolean> triple) {
            m109061a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: EN4$b */
    /* loaded from: classes4.dex */
    public static final class C1803b extends Lambda implements Function1<Throwable, Unit> {
        public C1803b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (EN4.this.f7371l == PhotoBannerContext.ID_SCAN) {
                EN4.this.f7366g.mo55905y(new LP1(null, null, null, 7, null));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: EN4$c */
    /* loaded from: classes4.dex */
    public static final class C1804c extends Lambda implements Function1<Unit, Unit> {
        public C1804c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            EN4.this.m109064x();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: EN4$d */
    /* loaded from: classes4.dex */
    public static final class C1805d extends Lambda implements Function1<Unit, Unit> {
        public C1805d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            EN4.this.f7365f.close();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: EN4$e */
    /* loaded from: classes4.dex */
    public static final class C1806e extends Lambda implements Function1<Unit, Unit> {
        public C1806e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            EN4.this.f7364e.mo105176nh();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: EN4$f */
    /* loaded from: classes4.dex */
    public static final class C1807f extends Lambda implements Function1<Bitmap, Unit> {
        public C1807f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            invoke2(bitmap);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Bitmap bitmap) {
            if (EN4.this.f7371l == PhotoBannerContext.ID_SCAN) {
                EN4.this.f7366g.mo55905y(new KP1(null, null, null, 7, null));
            }
            EN4.this.m109068t().onNext(bitmap);
            FN4 fn4 = EN4.this.f7364e;
            Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
            fn4.mo105178j7(bitmap);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: EN4$g */
    /* loaded from: classes4.dex */
    public static final class C1808g extends Lambda implements Function1<Throwable, Unit> {
        public C1808g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            InterfaceC1880Ea interfaceC1880Ea = EN4.this.f7366g;
            String localizedMessage = th.getLocalizedMessage();
            interfaceC1880Ea.mo55905y(new C44502lS3(null, null, null, "retakeable_take_photo", localizedMessage == null ? th.toString() : localizedMessage, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ljava/io/File;", "kotlin.jvm.PlatformType", "it", "", "b", "(Ljava/io/File;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: EN4$h */
    /* loaded from: classes4.dex */
    public static final class C1809h extends Lambda implements Function1<File, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Intent f7381g;

        /* renamed from: h */
        public final /* synthetic */ EN4 f7382h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1809h(Intent intent, EN4 en4) {
            super(1);
            this.f7381g = intent;
            this.f7382h = en4;
        }

        /* renamed from: b */
        public final void m109060b(File file) {
            Intent intent = this.f7381g;
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "it.absolutePath");
            String str = this.f7382h.f7369j;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savePath");
                str = null;
            }
            intent.putExtra("photo_saved_model", new PhotoSavedModel(absolutePath, str));
            this.f7382h.f7365f.mo37029e4(-1, this.f7381g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(File file) {
            m109060b(file);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/FileUploadReceipt;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/FileUploadReceipt;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: EN4$i */
    /* loaded from: classes4.dex */
    public static final class C1810i extends Lambda implements Function1<FileUploadReceipt, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Intent f7383g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1810i(Intent intent) {
            super(1);
            this.f7383g = intent;
        }

        /* renamed from: a */
        public final void m109059a(FileUploadReceipt fileUploadReceipt) {
            this.f7383g.putExtra("asset_id", fileUploadReceipt.getAssetId());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FileUploadReceipt fileUploadReceipt) {
            m109059a(fileUploadReceipt);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/FileUploadReceipt;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/FileUploadReceipt;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: EN4$j */
    /* loaded from: classes4.dex */
    public static final class C1811j extends Lambda implements Function1<FileUploadReceipt, String> {

        /* renamed from: g */
        public static final C1811j f7384g = new C1811j();

        public C1811j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(FileUploadReceipt it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getFileUrl();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: EN4$k */
    /* loaded from: classes4.dex */
    public static final class C1812k extends Lambda implements Function1<String, Unit> {
        public C1812k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            S74.C7343a.showProgress$default(EN4.this.f7364e, false, 0, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: EN4$l */
    /* loaded from: classes4.dex */
    public static final class C1813l extends Lambda implements Function1<String, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Intent f7387h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1813l(Intent intent) {
            super(1);
            this.f7387h = intent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            if (EN4.this.f7371l == PhotoBannerContext.ID_SCAN) {
                EN4.this.f7366g.mo55905y(new MP1(null, null, null, 7, null));
            }
            InterfaceC36675Vq4 interfaceC36675Vq4 = EN4.this.f7360a;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC36675Vq4.mo77813d(it);
            this.f7387h.putExtra("photo_url", it);
            EN4.this.f7365f.mo37029e4(-1, this.f7387h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: EN4$m */
    /* loaded from: classes4.dex */
    public static final class C1814m extends Lambda implements Function1<Throwable, Unit> {
        public C1814m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            if (EN4.this.f7371l == PhotoBannerContext.ID_SCAN) {
                EN4.this.f7366g.mo55905y(new LP1(null, null, null, 7, null));
            }
            S74.C7343a.showProgress$default(EN4.this.f7364e, false, 0, 2, null);
            EN4.this.f7364e.mo105176nh();
            FN4 fn4 = EN4.this.f7364e;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            fn4.error(e);
            C41318g46.m40159e(e);
        }
    }

    public EN4(InterfaceC36675Vq4 eventStream, C36207Tq4 reactiveConfig, InterfaceC40476ef6 uploadManager, ScopeProvider scopeProvider, FN4 ui, InterfaceC40099e13 navigator, InterfaceC1880Ea analyticsManager, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(eventStream, "eventStream");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(uploadManager, "uploadManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f7360a = eventStream;
        this.f7361b = reactiveConfig;
        this.f7362c = uploadManager;
        this.f7363d = scopeProvider;
        this.f7364e = ui;
        this.f7365f = navigator;
        this.f7366g = analyticsManager;
        this.f7367h = z;
        this.f7368i = z2;
        C24552a<Bitmap> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Bitmap>()");
        this.f7372m = m31922e;
    }

    /* renamed from: B */
    public static final void m109095B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final File m109094C(EN4 this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        String str = this$0.f7369j;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savePath");
            str = null;
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        String str2 = this$0.f7369j;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savePath");
            str2 = null;
        }
        return C27606qU.writeToFile$default(bitmap, new File(str2, UUID.randomUUID() + ".png"), false, 2, null);
    }

    /* renamed from: D */
    public static final void m109093D(EN4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        S74.C7343a.showProgress$default(this$0.f7364e, false, 0, 2, null);
    }

    /* renamed from: F */
    public static final void m109091F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final String m109090G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m109089H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m109088I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m109087J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void getImageSubject$retakeable_photo_release$annotations() {
    }

    /* renamed from: q */
    public static final void m109071q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m109070r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m109067u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m109066v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m109065w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m109063y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m109062z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final void m109096A(final Bitmap bitmap, Intent intent) {
        S74.C7343a.showProgress$default(this.f7364e, true, 0, 2, null);
        Observable doFinally = Observable.fromCallable(new Callable() { // from class: pN4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                File m109094C;
                m109094C = EN4.m109094C(EN4.this, bitmap);
                return m109094C;
            }
        }).subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a()).doFinally(new InterfaceC23478a() { // from class: vN4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                EN4.m109093D(EN4.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doFinally, "fromCallable {\n        v… ui.showProgress(false) }");
        Object m33094as = doFinally.m33094as(AutoDispose.m45239a(this.f7363d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1809h c1809h = new C1809h(intent, this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: wN4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                EN4.m109095B(Function1.this, obj);
            }
        });
    }

    /* renamed from: E */
    public final void m109092E(byte[] bArr, Intent intent) {
        AbstractC23442F uploadContent$default;
        Folder folder = this.f7370k;
        if (folder == null) {
            return;
        }
        S74.C7343a.showProgress$default(this.f7364e, true, 0, 2, null);
        if (this.f7368i) {
            AbstractC23442F uploadBytesForReceipt$default = InterfaceC40476ef6.C20086a.uploadBytesForReceipt$default(this.f7362c, bArr, ContentKind.PNG, folder.getUploadKind(), folder, null, 16, null);
            final C1810i c1810i = new C1810i(intent);
            AbstractC23442F m33101w = uploadBytesForReceipt$default.m33101w(new InterfaceC23484g() { // from class: AN4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    EN4.m109091F(Function1.this, obj);
                }
            });
            final C1811j c1811j = C1811j.f7384g;
            uploadContent$default = m33101w.m33157I(new InterfaceC23492o() { // from class: BN4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m109090G;
                    m109090G = EN4.m109090G(Function1.this, obj);
                    return m109090G;
                }
            });
        } else {
            uploadContent$default = InterfaceC40476ef6.C20086a.uploadContent$default(this.f7362c, bArr, ContentKind.PNG, folder.getUploadKind(), folder, (String) null, this.f7367h, this.f7368i, 16, (Object) null);
        }
        AbstractC23442F m33152N = uploadContent$default.m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        final C1812k c1812k = new C1812k();
        AbstractC23442F m33101w2 = m33152N.m33101w(new InterfaceC23484g() { // from class: CN4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                EN4.m109089H(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w2, "private fun uploadPhoto(… Timber.e(e)\n      })\n  }");
        Object m33135e = m33101w2.m33135e(AutoDispose.m45239a(this.f7363d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1813l c1813l = new C1813l(intent);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: DN4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                EN4.m109088I(Function1.this, obj);
            }
        };
        final C1814m c1814m = new C1814m();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: qN4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                EN4.m109087J(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC46237oN4
    /* renamed from: a */
    public void mo21247a(String savePath, PhotoBannerViewModel photoBannerViewModel, Folder folder) {
        PhotoBannerContext photoBannerContext;
        Intrinsics.checkNotNullParameter(savePath, "savePath");
        this.f7369j = savePath;
        this.f7370k = folder;
        if (photoBannerViewModel != null) {
            photoBannerContext = photoBannerViewModel.getContext();
        } else {
            photoBannerContext = null;
        }
        this.f7371l = photoBannerContext;
        if (photoBannerContext == PhotoBannerContext.ID_SCAN) {
            this.f7366g.mo55905y(new JP1(null, null, null, "takeAPhotoGeneric", 7, null));
        }
        this.f7364e.mo105179ga(photoBannerViewModel);
        Object m33094as = this.f7364e.mo105185C1().m33094as(AutoDispose.m45239a(this.f7363d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1804c c1804c = new C1804c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: xN4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                EN4.m109067u(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f7364e.mo105177l1().m33094as(AutoDispose.m45239a(this.f7363d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1805d c1805d = new C1805d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: yN4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                EN4.m109066v(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f7364e.mo105175q8().m33094as(AutoDispose.m45239a(this.f7363d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1806e c1806e = new C1806e();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: zN4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                EN4.m109065w(Function1.this, obj);
            }
        });
        m109069s();
    }

    @Override // p000.InterfaceC46237oN4
    public void onPause() {
        this.f7364e.onPause();
    }

    @Override // p000.InterfaceC46237oN4
    public void onResume() {
        this.f7364e.onResume();
    }

    /* renamed from: s */
    public final void m109069s() {
        Intent intent = new Intent();
        Object m33094as = C24527f.m31949b(this.f7364e.mo105181U5(), this.f7372m, this.f7361b.m82540n3()).m33094as(AutoDispose.m45239a(this.f7363d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1802a c1802a = new C1802a(intent);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: rN4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                EN4.m109071q(Function1.this, obj);
            }
        };
        final C1803b c1803b = new C1803b();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: sN4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                EN4.m109070r(Function1.this, obj);
            }
        });
    }

    /* renamed from: t */
    public final C24552a<Bitmap> m109068t() {
        return this.f7372m;
    }

    /* renamed from: x */
    public void m109064x() {
        Object m33135e = this.f7364e.mo105180Z().m33135e(AutoDispose.m45239a(this.f7363d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1807f c1807f = new C1807f();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: tN4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                EN4.m109063y(Function1.this, obj);
            }
        };
        final C1808g c1808g = new C1808g();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: uN4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                EN4.m109062z(Function1.this, obj);
            }
        });
    }
}
