.class public final Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/modelmanager/MapModelManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lco/bird/android/app/feature/map/modelmanager/MapModelManager<",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u0018\u0000 \u001b2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB+\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u00160\u0015\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0016\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0003H\u0016J\u0016\u0010\u0007\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0002H\u0016J\u0008\u0010\n\u001a\u00020\u0005H\u0016R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R.\u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0012*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00030\u00030\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001c"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;",
        "Lco/bird/android/app/feature/map/modelmanager/MapModelManager;",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "",
        "items",
        "",
        "addItems",
        "setItems",
        "item",
        "removeItem",
        "clearItems",
        "Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;",
        "merchantSiteRenderer",
        "Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;",
        "LTq4;",
        "reactiveConfig",
        "LTq4;",
        "LAG;",
        "kotlin.jvm.PlatformType",
        "merchantSites",
        "LAG;",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/buava/Optional;",
        "",
        "zoomLevelObservable",
        "<init>",
        "(Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;LTq4;Lio/reactivex/Observable;)V",
        "Companion",
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
        "SMAP\nMerchantSiteModelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantSiteModelManager.kt\nco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,73:1\n180#2:74\n*S KotlinDebug\n*F\n+ 1 MerchantSiteModelManager.kt\nco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager\n*L\n38#1:74\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$Companion;

.field private static final THROTTLE_MS:J = 0xfaL


# instance fields
.field private final merchantSiteRenderer:Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;

.field private final merchantSites:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            ">;>;"
        }
    .end annotation
.end field

.field private final reactiveConfig:LTq4;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->Companion:Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$Companion;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;LTq4;Lio/reactivex/Observable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;",
            "LTq4;",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Float;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "merchantSiteRenderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoomLevelObservable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->merchantSiteRenderer:Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;

    iput-object p2, p0, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->reactiveConfig:LTq4;

    invoke-static {}, LAG;->g()LAG;

    move-result-object p1

    const-string p2, "create<List<WireMerchantSite>>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->merchantSites:LAG;

    sget-object p2, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    invoke-virtual {p2, p1, p3}, Lio/reactivex/rxkotlin/e;->a(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 p3, 0x1

    const-wide/16 v0, 0xfa

    invoke-virtual {p1, v0, v1, p2, p3}, Lio/reactivex/Observable;->throttleLatest(JLjava/util/concurrent/TimeUnit;Z)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "Observables.combineLates\u2026dSchedulers.mainThread())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string p3, "UNBOUND"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p2, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$1;

    invoke-direct {p2, p0}, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager$1;-><init>(Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;)V

    new-instance p3, LfT2;

    invoke-direct {p3, p2}, LfT2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method private static final _init_$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->_init_$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getMerchantSiteRenderer$p(Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;)Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->merchantSiteRenderer:Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;)LTq4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->reactiveConfig:LTq4;

    return-object p0
.end method


# virtual methods
.method public addItems(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            ">;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->merchantSites:LAG;

    invoke-virtual {v0}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :cond_0
    check-cast v1, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public clearItems()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->merchantSites:LAG;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LAG;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public removeItem(Lco/bird/android/model/wire/WireMerchantSite;)V
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->merchantSites:LAG;

    invoke-virtual {v0}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :cond_0
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->minus(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic removeItem(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireMerchantSite;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->removeItem(Lco/bird/android/model/wire/WireMerchantSite;)V

    return-void
.end method

.method public setItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            ">;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->merchantSites:LAG;

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    return-void
.end method
