.class public final Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001BE\u0008\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0008\u0001\u0010\u001c\u001a\u00020\u001b\u0012\u0008\u0008\u0001\u0010\u001f\u001a\u00020\u001e\u0012\u0008\u0008\u0001\u0010\"\u001a\u00020!\u0012\n\u0008\u0001\u0010$\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0008\u0001\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u00081\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0008\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0008\u0010\t\u001a\u00020\u0004H\u0016J\u0008\u0010\n\u001a\u00020\u0004H\u0017J\u0010\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0008\u0010\r\u001a\u00020\u0004H\u0016J\u0008\u0010\u000e\u001a\u00020\u0004H\u0016J\u0008\u0010\u000f\u001a\u00020\u0004H\u0016J\u0008\u0010\u0010\u001a\u00020\u0004H\u0016J\u000e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u000e\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u0012\u0010\u0017\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0015H\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\"\u0010+\u001a\u0010\u0012\u000c\u0012\n **\u0004\u0018\u00010\u00020\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\"\u0010/\u001a\u0010\u0012\u000c\u0012\n **\u0004\u0018\u00010.0.0-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100\u00a8\u00063"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;",
        "Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;",
        "",
        "address",
        "",
        "setAddress",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "onStart",
        "onResume",
        "outState",
        "onSaveInstanceState",
        "onPause",
        "onStop",
        "onDestroy",
        "onLowMemory",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/LocationSelectionModel;",
        "observeDone",
        "observeCompleteRevGeoCodeAddress",
        "",
        "hint",
        "setAddressHint",
        "Ldr4;",
        "reactiveLocationManager",
        "Ldr4;",
        "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;",
        "ui",
        "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "Lcom/uber/autodispose/ScopeProvider;",
        "",
        "createRadius",
        "D",
        "model",
        "Lco/bird/android/model/LocationSelectionModel;",
        "Lio/reactivex/c;",
        "doNotEnableDoneButtonUntil",
        "Lio/reactivex/c;",
        "LAG;",
        "kotlin.jvm.PlatformType",
        "completeAddress",
        "LAG;",
        "Lio/reactivex/subjects/a;",
        "",
        "addressFieldHasText",
        "Lio/reactivex/subjects/a;",
        "<init>",
        "(Ldr4;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;Lcom/uber/autodispose/ScopeProvider;DLco/bird/android/model/LocationSelectionModel;Lio/reactivex/c;)V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLocationSelectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationSelectionPresenter.kt\nco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n*L\n1#1,224:1\n180#2:225\n180#2:227\n180#2:228\n180#2:229\n180#2:230\n180#2:231\n233#3:226\n*S KotlinDebug\n*F\n+ 1 LocationSelectionPresenter.kt\nco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl\n*L\n94#1:225\n114#1:227\n128#1:228\n148#1:229\n158#1:230\n167#1:231\n113#1:226\n*E\n"
    }
.end annotation


# instance fields
.field private final addressFieldHasText:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final completeAddress:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final createRadius:D

.field private final doNotEnableDoneButtonUntil:Lio/reactivex/c;

.field private final model:Lco/bird/android/model/LocationSelectionModel;

.field private final reactiveLocationManager:Ldr4;

.field private final scopeProvider:Lcom/uber/autodispose/ScopeProvider;

.field private final ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;


# direct methods
.method public constructor <init>(Ldr4;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;Lcom/uber/autodispose/ScopeProvider;DLco/bird/android/model/LocationSelectionModel;Lio/reactivex/c;)V
    .locals 1

    const-string v0, "reactiveLocationManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "doNotEnableDoneButtonUntil"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->reactiveLocationManager:Ldr4;

    iput-object p2, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    iput-object p3, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->scopeProvider:Lcom/uber/autodispose/ScopeProvider;

    iput-wide p4, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->createRadius:D

    iput-object p6, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->model:Lco/bird/android/model/LocationSelectionModel;

    iput-object p7, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->doNotEnableDoneButtonUntil:Lio/reactivex/c;

    invoke-static {}, LAG;->g()LAG;

    move-result-object p1

    const-string p2, "create<String>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->completeAddress:LAG;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object p1

    const-string p2, "create<Boolean>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->addressFieldHasText:Lio/reactivex/subjects/a;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume$lambda$11(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getCompleteAddress$p(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)LAG;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->completeAddress:LAG;

    return-object p0
.end method

.method public static final synthetic access$getCreateRadius$p(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->createRadius:D

    return-wide v0
.end method

.method public static final synthetic access$getReactiveLocationManager$p(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)Ldr4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->reactiveLocationManager:Ldr4;

    return-object p0
.end method

.method public static final synthetic access$getUi$p(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)Lco/bird/android/app/feature/map/ui/LocationSelectionUi;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    return-object p0
.end method

.method public static final synthetic access$setAddress(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->setAddress(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onCreate$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroid/location/Address;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume$lambda$16(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroid/location/Address;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onCreate$lambda$6$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume$lambda$10(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->observeDone$lambda$23(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume$lambda$14(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/LocationSelectionModel;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->observeDone$lambda$26(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/LocationSelectionModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume$lambda$21(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume$lambda$15(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->observeDone$lambda$25(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume$lambda$13(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume$lambda$17(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onCreate$lambda$6$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final observeDone$lambda$23(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method private static final observeDone$lambda$24(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final observeDone$lambda$25(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final observeDone$lambda$26(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/LocationSelectionModel;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/LocationSelectionModel;

    return-object p0
.end method

.method private static final onCreate$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onCreate$lambda$6$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onCreate$lambda$6$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method private static final onCreate$lambda$6$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onCreate$lambda$6$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$10(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method private static final onResume$lambda$11(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$12(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$13(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final onResume$lambda$14(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method private static final onResume$lambda$15(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final onResume$lambda$16(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroid/location/Address;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/location/Address;

    return-object p0
.end method

.method private static final onResume$lambda$17(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$18(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$19(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method private static final onResume$lambda$20()Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method private static final onResume$lambda$21(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    return-object p0
.end method

.method private static final onResume$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume$lambda$19(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onCreate$lambda$6$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onCreate$lambda$6$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume$lambda$18(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final setAddress(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->setAddress(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->completeAddress:LAG;

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->addressFieldHasText:Lio/reactivex/subjects/a;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic t()Ljava/lang/Boolean;
    .locals 1

    invoke-static {}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume$lambda$20()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->observeDone$lambda$24(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume$lambda$12(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public observeCompleteRevGeoCodeAddress()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->completeAddress:LAG;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "completeAddress.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public observeDone()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/LocationSelectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->doneClicks()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$observeDone$1;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$observeDone$1;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V

    new-instance v2, Lbw2;

    invoke-direct {v2, v1}, Lbw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$observeDone$2;->INSTANCE:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$observeDone$2;

    new-instance v2, Lmw2;

    invoke-direct {v2, v1}, Lmw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$observeDone$3;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$observeDone$3;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V

    new-instance v2, Lqw2;

    invoke-direct {v2, v1}, Lqw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$observeDone$4;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$observeDone$4;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V

    new-instance v2, Lrw2;

    invoke-direct {v2, v1}, Lrw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun observeDone\u2026ss = address)\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    if-eqz p1, :cond_0

    const-string v0, "map"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->model:Lco/bird/android/model/LocationSelectionModel;

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/LocationSelectionModel;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/LocationSelectionModel;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->setAddress(Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2, v2}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->setLocation(Lco/bird/android/model/wire/WireLocation;ZZ)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->reactiveLocationManager:Ldr4;

    invoke-interface {p1, v0}, Ldr4;->e(Z)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    new-instance v1, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onCreate$1$1;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onCreate$1$1;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V

    new-instance v2, Lkw2;

    invoke-direct {v2, v1}, Lkw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/F;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    iget-object p1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->reactiveLocationManager:Ldr4;

    invoke-interface {p1, v0}, Ldr4;->e(Z)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onCreate$2$1;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onCreate$2$1;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V

    new-instance v1, Llw2;

    invoke-direct {v1, v0}, Llw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onCreate$2$2;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onCreate$2$2;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V

    new-instance v1, Lnw2;

    invoke-direct {v1, v0}, Lnw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->D(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "{\n      reactiveLocation\u2026ber.e(e)\n        })\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->scopeProvider:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onCreate$2$3;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onCreate$2$3;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V

    new-instance v1, Low2;

    invoke-direct {v1, v0}, Low2;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onCreate$2$4;->INSTANCE:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onCreate$2$4;

    new-instance v2, Lpw2;

    invoke-direct {v2, v0}, Lpw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :cond_2
    return-void
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->onDestroy()V

    invoke-static {p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter$DefaultImpls;->onDestroy(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->onLowMemory()V

    return-void
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->onResume()V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->mapClicks()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$1;->INSTANCE:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$1;

    new-instance v2, Lsw2;

    invoke-direct {v2, v1}, Lsw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->keyboardDoneClicks()Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {v0, v1}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "merge(\n      ui.mapClick\u2026eyboardDoneClicks()\n    )"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->completeAddress:LAG;

    new-instance v2, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$$inlined$withLatestFrom$1;

    invoke-direct {v2}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$$inlined$withLatestFrom$1;-><init>()V

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "withLatestFrom(other, Bi\u2026 combiner.invoke(t, u) })"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->scopeProvider:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$3;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$3;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V

    new-instance v3, Lxw2;

    invoke-direct {v3, v2}, Lxw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v3}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi$DefaultImpls;->observeLocation$default(Lco/bird/android/app/feature/map/ui/LocationSelectionUi;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v2, 0x64

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v4}, Lio/reactivex/Observable;->debounce(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v2, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$4;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$4;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V

    new-instance v3, Lcw2;

    invoke-direct {v3, v2}, Lcw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "@SuppressLint(\"CheckResu\u2026e && enabled)\n      }\n  }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->scopeProvider:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$5;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$5;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V

    new-instance v4, Ldw2;

    invoke-direct {v4, v3}, Ldw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v3, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$6;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$6;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V

    new-instance v5, Lew2;

    invoke-direct {v5, v3}, Lew2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4, v5}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->observeAddressField()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinct()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v3, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$7;->INSTANCE:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$7;

    new-instance v4, Lfw2;

    invoke-direct {v4, v3}, Lfw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$8;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$8;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V

    new-instance v4, Lgw2;

    invoke-direct {v4, v3}, Lgw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->switchMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v3, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$9;->INSTANCE:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$9;

    new-instance v4, Lhw2;

    invoke-direct {v4, v3}, Lhw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v3, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$10;->INSTANCE:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$10;

    new-instance v4, Liw2;

    invoke-direct {v4, v3}, Liw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->scopeProvider:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$11;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$11;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V

    new-instance v3, Ljw2;

    invoke-direct {v3, v2}, Ljw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v2, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$12;->INSTANCE:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$12;

    new-instance v4, Ltw2;

    invoke-direct {v4, v2}, Ltw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->observeAddressField()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v2, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$13;->INSTANCE:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$13;

    new-instance v3, Luw2;

    invoke-direct {v3, v2}, Luw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "ui.observeAddressField()\u2026 .map { it.isNotBlank() }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->scopeProvider:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    iget-object v2, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->addressFieldHasText:Lio/reactivex/subjects/a;

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/D;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->doNotEnableDoneButtonUntil:Lio/reactivex/c;

    new-instance v2, Lvw2;

    invoke-direct {v2}, Lvw2;-><init>()V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->i0(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    const-string v2, "doNotEnableDoneButtonUnt\u2026\n      .toSingle { true }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    invoke-virtual {v0}, Lio/reactivex/F;->k0()Lio/reactivex/Observable;

    move-result-object v0

    const-string v3, "doneButtonEnablable.toObservable()"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->addressFieldHasText:Lio/reactivex/subjects/a;

    invoke-virtual {v2, v0, v3}, Lio/reactivex/rxkotlin/e;->a(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "Observables.combineLates\u2026dSchedulers.mainThread())"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->scopeProvider:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$14;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$14;-><init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V

    new-instance v2, Lww2;

    invoke-direct {v2, v1}, Lww2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->onSaveInstanceState(Landroid/os/Bundle;)V

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter$DefaultImpls;->onSaveInstanceState(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenter;Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->onStart()V

    return-void
.end method

.method public onStop()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->onStop()V

    return-void
.end method

.method public setAddressHint(I)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->setAddressHint(I)V

    return-void
.end method
