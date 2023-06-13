package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
import co.bird.android.navigator.MyBirdsResult;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.InterfaceC41921h56;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"LdD3;", "LYC3;", "", C17296a.f69688o, "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LWX2;", "LWX2;", "manager", "Le13;", "b", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LfD3;", DateTokenConverter.CONVERTER_KEY, "LfD3;", "ui", "", "e", "Z", "finishedUnpairingBird", "<init>", "(LWX2;Le13;Lcom/uber/autodispose/ScopeProvider;LfD3;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOwnedBirdsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdsPresenter.kt\nco/bird/android/feature/ownedbirds/OwnedBirdsPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,93:1\n180#2:94\n180#2:95\n180#2:96\n*S KotlinDebug\n*F\n+ 1 OwnedBirdsPresenter.kt\nco/bird/android/feature/ownedbirds/OwnedBirdsPresenterImpl\n*L\n42#1:94\n50#1:95\n59#1:96\n*E\n"})
/* renamed from: dD3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39624dD3 implements YC3 {

    /* renamed from: a */
    public final WX2 f76274a;

    /* renamed from: b */
    public final InterfaceC40099e13 f76275b;

    /* renamed from: c */
    public final ScopeProvider f76276c;

    /* renamed from: d */
    public final InterfaceC40809fD3 f76277d;

    /* renamed from: e */
    public boolean f76278e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dD3$a */
    /* loaded from: classes3.dex */
    public static final class C19696a extends Lambda implements Function1<Throwable, Unit> {
        public C19696a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C39624dD3.this.f76277d.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dD3$b */
    /* loaded from: classes3.dex */
    public static final class C19697b extends Lambda implements Function1<List<? extends WireBird>, Unit> {
        public C19697b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireBird> list) {
            invoke2((List<WireBird>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> it) {
            InterfaceC40809fD3 interfaceC40809fD3 = C39624dD3.this.f76277d;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC40809fD3.setBirds(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dD3$c */
    /* loaded from: classes3.dex */
    public static final class C19698c extends Lambda implements Function1<WireBird, Unit> {
        public C19698c() {
            super(1);
        }

        /* renamed from: a */
        public final void m44525a(WireBird wireBird) {
            InterfaceC40099e13.C19924a.goToOwnedBirdDetails$default(C39624dD3.this.f76275b, wireBird.getId(), EnumC52713zI4.OWNED_BIRD_DETAILS.ordinal(), false, null, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m44525a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dD3$d */
    /* loaded from: classes3.dex */
    public static final class C19699d extends Lambda implements Function1<List<? extends WireBird>, Unit> {
        public C19699d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireBird> list) {
            invoke2((List<WireBird>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> list) {
            MyBirdsResult.EnumC16265a enumC16265a;
            if (list.isEmpty()) {
                if (C39624dD3.this.f76278e) {
                    enumC16265a = MyBirdsResult.EnumC16265a.UNPAIRED;
                } else {
                    enumC16265a = MyBirdsResult.EnumC16265a.NONE;
                }
                C39624dD3.this.f76275b.mo37029e4(-1, X52.m77424a(new MyBirdsResult(enumC16265a)));
            }
            C39624dD3.this.f76278e = false;
        }
    }

    public C39624dD3(WX2 manager, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, InterfaceC40809fD3 ui) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f76274a = manager;
        this.f76275b = navigator;
        this.f76276c = scopeProvider;
        this.f76277d = ui;
    }

    /* renamed from: f */
    public static final void m44529f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m44528g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m44527h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m44526i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.YC3
    /* renamed from: a */
    public void mo44534a() {
        AbstractC23461c m33070P = this.f76274a.refresh().m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "manager.refresh()\n      …dSchedulers.mainThread())");
        AbstractC23461c progress$default = C28237sD.progress$default(m33070P, this.f76277d, 0, 2, (Object) null);
        final C19696a c19696a = new C19696a();
        progress$default.m33084B(new InterfaceC23484g() { // from class: ZC3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39624dD3.m44529f(Function1.this, obj);
            }
        }).subscribe();
        Observable<List<WireBird>> observeOn = this.f76274a.mo72986a().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "manager.privateBirds\n   …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f76276c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C19697b c19697b = new C19697b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: aD3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39624dD3.m44528g(Function1.this, obj);
            }
        });
        Observable<WireBird> observeOn2 = this.f76277d.birdItemClicks().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.birdItemClicks()\n    …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f76276c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C19698c c19698c = new C19698c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: bD3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39624dD3.m44527h(Function1.this, obj);
            }
        });
    }

    @Override // p000.YC3
    public void onActivityResult(int i, int i2, Intent intent) {
        MyBirdsResult.EnumC16265a enumC16265a;
        if (i == EnumC52713zI4.OWNED_BIRD_DETAILS.ordinal() && i2 == -1) {
            MyBirdsResult myBirdsResult = (MyBirdsResult) X52.m77423b(intent);
            if (myBirdsResult != null) {
                enumC16265a = myBirdsResult.m55390b();
            } else {
                enumC16265a = null;
            }
            if (enumC16265a == MyBirdsResult.EnumC16265a.UNPAIRED) {
                this.f76278e = true;
                if (!this.f76274a.isEmpty()) {
                    InterfaceC41921h56.C22549a.topToast$default(this.f76277d, C45871nl4.owned_bird_details_unpair_complete_toast, (EnumC40735f56) null, 2, (Object) null);
                }
            }
        }
    }

    @Override // p000.YC3
    public void onResume() {
        Observable<List<WireBird>> observeOn = this.f76274a.mo72986a().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "manager.privateBirds\n   …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f76276c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C19699d c19699d = new C19699d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: cD3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39624dD3.m44526i(Function1.this, obj);
            }
        });
    }
}
