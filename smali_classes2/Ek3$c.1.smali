.class public final LEk3$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEk3;->V(Lcom/google/android/gms/maps/model/LatLng;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/String;",
        ">;>;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "invoke",
        "(Lkotlin/Pair;)Lio/reactivex/h;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOperatorBountyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorBountyPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorBountyPresenter$fetchLocationBountiesAndSetMap$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LEk3;

.field public final synthetic h:Lcom/google/android/gms/maps/model/LatLng;


# direct methods
.method public constructor <init>(LEk3;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    iput-object p1, p0, LEk3$c;->g:LEk3;

    iput-object p2, p0, LEk3$c;->h:Lcom/google/android/gms/maps/model/LatLng;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LEk3$c;->b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Pair;)Lio/reactivex/h;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    iget-object v0, p0, LEk3$c;->g:LEk3;

    invoke-static {v0}, LEk3;->access$getOperatorManager$p(LEk3;)Lom3;

    move-result-object v1

    sget-object v0, LYw2;->a:LYw2;

    iget-object v2, p0, LEk3$c;->h:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v2}, LYw2;->i(Lcom/google/android/gms/maps/model/LatLng;)Landroid/location/Location;

    move-result-object v2

    iget-object v0, p0, LEk3$c;->g:LEk3;

    invoke-static {v0}, LEk3;->access$getMapUi$p(LEk3;)LNm3;

    move-result-object v0

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapUi;->nearbyRadius()D

    move-result-wide v3

    const-string v0, "filtersRequest"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    move-object v6, p1

    goto :goto_0

    :cond_0
    move-object v6, v0

    :goto_0
    iget-object p1, p0, LEk3$c;->g:LEk3;

    invoke-static {p1}, LEk3;->access$getMapUi$p(LEk3;)LNm3;

    move-result-object p1

    invoke-interface {p1}, Lco/bird/android/app/feature/map/ui/MapUi;->viewport()Ljava/util/List;

    move-result-object v7

    invoke-interface/range {v1 .. v7}, Lom3;->a1(Landroid/location/Location;DLco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;)Lio/reactivex/c;

    move-result-object p1

    new-instance v1, LEk3$c$a;

    iget-object v2, p0, LEk3$c;->g:LEk3;

    invoke-static {v2}, LEk3;->access$getUi$p(LEk3;)LPk3;

    move-result-object v2

    invoke-direct {v1, v2}, LEk3$c$a;-><init>(Ljava/lang/Object;)V

    new-instance v2, LFk3;

    invoke-direct {v2, v1}, LFk3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    const-string v1, "operatorManager\n        \u2026r(ui::logAndDisplayError)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LEk3$c;->g:LEk3;

    invoke-static {v1}, LEk3;->access$getUi$p(LEk3;)LPk3;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v1, v2, v3, v0}, LsD;->progress$default(Lio/reactivex/c;LS74;IILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LEk3$c;->invoke(Lkotlin/Pair;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
