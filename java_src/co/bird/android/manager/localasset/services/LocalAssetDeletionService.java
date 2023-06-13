package co.bird.android.manager.localasset.services;

import android.content.Intent;
import androidx.core.app.JobIntentService;
import co.bird.android.manager.localasset.services.LocalAssetDeletionService;
import io.reactivex.Observable;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.rxkotlin.C24517a;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24558d;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/manager/localasset/services/LocalAssetDeletionService;", "Landroidx/core/app/JobIntentService;", "Landroid/content/Intent;", "intent", "", "g", "onDestroy", "", "k", "Z", "destroyed", "Lio/reactivex/disposables/b;", "l", "Lio/reactivex/disposables/b;", "disposables", "Lio/reactivex/subjects/d;", "", "kotlin.jvm.PlatformType", "m", "Lio/reactivex/subjects/d;", "deletionSubject", "<init>", "()V", "n", "e", "local-asset_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocalAssetDeletionService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetDeletionService.kt\nco/bird/android/manager/localasset/services/LocalAssetDeletionService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1855#2,2:55\n*S KotlinDebug\n*F\n+ 1 LocalAssetDeletionService.kt\nco/bird/android/manager/localasset/services/LocalAssetDeletionService\n*L\n45#1:55,2\n*E\n"})
/* loaded from: classes4.dex */
public final class LocalAssetDeletionService extends JobIntentService {

    /* renamed from: n */
    public static final C16185e f66441n = new C16185e(null);

    /* renamed from: k */
    public boolean f66442k;

    /* renamed from: l */
    public final C23464b f66443l;

    /* renamed from: m */
    public final C24558d<String> f66444m;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "assetPath", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.localasset.services.LocalAssetDeletionService$a */
    /* loaded from: classes4.dex */
    public static final class C16181a extends Lambda implements Function1<String, Unit> {

        /* renamed from: g */
        public static final C16181a f66445g = new C16181a();

        public C16181a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            new File(str).delete();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.localasset.services.LocalAssetDeletionService$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16182b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C16182b f66446b = new C16182b();

        public C16182b() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.localasset.services.LocalAssetDeletionService$c */
    /* loaded from: classes4.dex */
    public static final class C16183c extends Lambda implements Function1<String, Unit> {

        /* renamed from: g */
        public static final C16183c f66447g = new C16183c();

        public C16183c() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.localasset.services.LocalAssetDeletionService$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16184d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C16184d f66448b = new C16184d();

        public C16184d() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lco/bird/android/manager/localasset/services/LocalAssetDeletionService$e;", "", "", "ASSET_PATHS", "Ljava/lang/String;", "", "LOCAL_ASSET_DELETION_JOB_ID", "I", "<init>", "()V", "local-asset_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLocalAssetDeletionService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetDeletionService.kt\nco/bird/android/manager/localasset/services/LocalAssetDeletionService$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
    /* renamed from: co.bird.android.manager.localasset.services.LocalAssetDeletionService$e */
    /* loaded from: classes4.dex */
    public static final class C16185e {
        public /* synthetic */ C16185e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16185e() {
        }
    }

    public LocalAssetDeletionService() {
        C23464b c23464b = new C23464b();
        this.f66443l = c23464b;
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f66444m = m31902e;
        Observable<String> subscribeOn = m31902e.subscribeOn(C24542a.m31932c());
        final C16181a c16181a = C16181a.f66445g;
        Observable<String> doOnNext = subscribeOn.doOnNext(new InterfaceC23484g() { // from class: Pt2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LocalAssetDeletionService.m55603n(Function1.this, obj);
            }
        });
        final C16182b c16182b = C16182b.f66446b;
        Observable<String> onErrorReturnItem = doOnNext.doOnError(new InterfaceC23484g() { // from class: Qt2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LocalAssetDeletionService.m55602o(Function1.this, obj);
            }
        }).onErrorReturnItem("");
        final C16183c c16183c = C16183c.f66447g;
        InterfaceC23484g<? super String> interfaceC23484g = new InterfaceC23484g() { // from class: Rt2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LocalAssetDeletionService.m55601p(Function1.this, obj);
            }
        };
        final C16184d c16184d = C16184d.f66448b;
        InterfaceC23465c subscribe = onErrorReturnItem.subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: St2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                LocalAssetDeletionService.m55600q(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "deletionSubject\n      .s….subscribe({}, Timber::e)");
        C24517a.m31963a(subscribe, c23464b);
    }

    /* renamed from: n */
    public static final void m55603n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m55602o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m55601p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m55600q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.core.app.JobIntentService
    /* renamed from: g */
    public void mo52985g(Intent intent) {
        ArrayList<String> stringArrayListExtra;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!this.f66442k && (stringArrayListExtra = intent.getStringArrayListExtra("asset_paths")) != null) {
            C24558d<String> c24558d = this.f66444m;
            for (String str : stringArrayListExtra) {
                c24558d.onNext(str);
            }
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f66442k = true;
        this.f66443l.dispose();
    }
}
