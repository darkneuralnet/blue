.class public final Li25$n2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->V7()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "shouldPollBirdsNearby",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)Lio/reactivex/h;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$n2;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 0

    invoke-static {p0, p1}, Li25$n2;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Li25$n2;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Li25$n2;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/maps/model/LatLngBounds;

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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


# virtual methods
.method public final invoke(Ljava/lang/Boolean;)Lio/reactivex/h;
    .locals 4

    const-string v0, "shouldPollBirdsNearby"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string p1, "setting up stream to poll for birds nearby on center location change"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    iget-object v0, p0, Li25$n2;->g:Li25;

    invoke-static {v0}, Li25;->access$getMapUi$p(Li25;)LG95;

    move-result-object v0

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapUi;->centerLocationChanged()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Li25$n2;->g:Li25;

    invoke-static {v1}, Li25;->access$getMapUi$p(Li25;)LG95;

    move-result-object v1

    invoke-interface {v1}, Lco/bird/android/app/feature/map/ui/MapUi;->getCenterLocation()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Li25$n2$a;->g:Li25$n2$a;

    new-instance v2, Ly25;

    invoke-direct {v2, v1}, Ly25;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "mapUi.centerLocationChan\u2026 { it.isProbablyValid() }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Li25$n2;->g:Li25;

    invoke-static {v1}, Li25;->access$getScanlessRideManager$p(Li25;)LBl5;

    move-result-object v1

    invoke-interface {v1}, LBl5;->e()LZ84;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lio/reactivex/rxkotlin/e;->a(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, Li25$n2$b;

    iget-object v1, p0, Li25$n2;->g:Li25;

    invoke-direct {v0, v1}, Li25$n2$b;-><init>(Li25;)V

    new-instance v1, Lz25;

    invoke-direct {v1, v0}, Lz25;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, Li25$n2$c;

    iget-object v1, p0, Li25$n2;->g:Li25;

    invoke-direct {v0, v1}, Li25$n2$c;-><init>(Li25;)V

    new-instance v1, LA25;

    invoke-direct {v1, v0}, LA25;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->switchMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Li25$n2;->g:Li25;

    invoke-static {p1}, Li25;->access$getRideMapStateManager$p(Li25;)LpU4;

    move-result-object p1

    invoke-interface {p1}, LpU4;->l()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Li25$n2;->g:Li25;

    invoke-static {v1}, Li25;->access$getReservationManager$p(Li25;)LMK4;

    move-result-object v1

    invoke-interface {v1}, LMK4;->e()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "did not set up stream to poll for birds nearby as conditions not met (rideMapState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", reservation present? = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Li25$n2;->invoke(Ljava/lang/Boolean;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
