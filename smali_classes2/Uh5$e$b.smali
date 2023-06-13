.class public final LUh5$e$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUh5$e;->c(Lco/bird/android/model/MechanicRepairStep;)V
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
        "Lco/bird/android/model/BirdInspection;",
        "+",
        "Lco/bird/android/model/BirdRepair;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/BirdInspection;",
        "Lco/bird/android/model/BirdRepair;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LUh5;


# direct methods
.method public constructor <init>(LUh5;)V
    .locals 0

    iput-object p1, p0, LUh5$e$b;->g:LUh5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LUh5$e$b;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/BirdInspection;",
            "Lco/bird/android/model/BirdRepair;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LUh5$e$b;->g:LUh5;

    invoke-static {v0}, LUh5;->access$getUi$p(LUh5;)LYh5;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v3, v1, v2}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    iget-object v0, p0, LUh5$e$b;->g:LUh5;

    invoke-static {v0}, LUh5;->access$getNavigator$p(LUh5;)Le13;

    move-result-object v0

    iget-object v1, p0, LUh5$e$b;->g:LUh5;

    invoke-virtual {v1}, LUh5;->W()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    iget-object v2, p0, LUh5$e$b;->g:LUh5;

    invoke-virtual {v2}, LUh5;->Y()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/BirdRepair;

    invoke-virtual {v3}, Lco/bird/android/model/BirdRepair;->getId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, LUh5$e$b;->g:LUh5;

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/BirdInspection;

    invoke-virtual {v5}, Lco/bird/android/model/BirdInspection;->getInspectionJobs()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/BirdInspection;

    invoke-virtual {p1}, Lco/bird/android/model/BirdInspection;->getInspectionPoints()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v4, v5, p1}, LUh5;->Z(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-interface {v0, v1, v2, v3, p1}, Le13;->l4(Lco/bird/android/model/wire/WireBird;Landroid/location/Location;Ljava/lang/String;Ljava/util/ArrayList;)V

    iget-object p1, p0, LUh5$e$b;->g:LUh5;

    invoke-static {p1}, LUh5;->access$getNavigator$p(LUh5;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    return-void
.end method
