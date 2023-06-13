.class public final LGW2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u0008\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u001d\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "LGW2;",
        "",
        "",
        "b",
        "Le13;",
        "a",
        "Le13;",
        "navigator",
        "Lcom/uber/autodispose/ScopeProvider;",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "LKW2;",
        "c",
        "LKW2;",
        "ui",
        "",
        "LGk6;",
        "d",
        "Ljava/util/List;",
        "getVehicles",
        "()Ljava/util/List;",
        "vehicles",
        "<init>",
        "(Le13;Lcom/uber/autodispose/ScopeProvider;LKW2;)V",
        "app_birdRelease"
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
        "SMAP\nMultiModalRiderTutorialSelectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiModalRiderTutorialSelectionPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/MultiModalRiderTutorialSelectionPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,49:1\n180#2:50\n*S KotlinDebug\n*F\n+ 1 MultiModalRiderTutorialSelectionPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/MultiModalRiderTutorialSelectionPresenterImpl\n*L\n42#1:50\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Le13;

.field public final b:Lcom/uber/autodispose/ScopeProvider;

.field public final c:LKW2;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LGk6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Le13;Lcom/uber/autodispose/ScopeProvider;LKW2;)V
    .locals 2

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGW2;->a:Le13;

    iput-object p2, p0, LGW2;->b:Lcom/uber/autodispose/ScopeProvider;

    iput-object p3, p0, LGW2;->c:LKW2;

    const/4 p1, 0x2

    new-array p1, p1, [LGk6;

    new-instance p2, LGk6;

    const-string p3, "Moped"

    sget-object v0, Lco/bird/android/model/VehicleClass;->MOPED:Lco/bird/android/model/VehicleClass;

    const-string v1, "url"

    invoke-direct {p2, v1, p3, v0}, LGk6;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/VehicleClass;)V

    const/4 p3, 0x0

    aput-object p2, p1, p3

    new-instance p2, LGk6;

    const-string p3, "Scooter"

    sget-object v0, Lco/bird/android/model/VehicleClass;->SCOOTER:Lco/bird/android/model/VehicleClass;

    invoke-direct {p2, v1, p3, v0}, LGk6;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/VehicleClass;)V

    const/4 p3, 0x1

    aput-object p2, p1, p3

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LGW2;->d:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LGW2;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getNavigator$p(LGW2;)Le13;
    .locals 0

    iget-object p0, p0, LGW2;->a:Le13;

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    iget-object v0, p0, LGW2;->c:LKW2;

    iget-object v1, p0, LGW2;->d:Ljava/util/List;

    invoke-interface {v0, v1}, LKW2;->m1(Ljava/util/List;)V

    iget-object v0, p0, LGW2;->c:LKW2;

    invoke-interface {v0}, LKW2;->N4()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, LGW2;->b:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, LGW2$a;

    invoke-direct {v1, p0}, LGW2$a;-><init>(LGW2;)V

    new-instance v2, LFW2;

    invoke-direct {v2, v1}, LFW2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
