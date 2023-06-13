.class public final LOo1$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOo1;->s(Ljava/lang/String;Ljava/lang/String;)V
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
        "Lkotlin/Unit;",
        "+",
        "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/constant/RepairStep;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u0092\u0001\u0012B\u0008\u0001\u0012>\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006 \u0003*\u001e\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00000\u0000 \u0003*H\u0012B\u0008\u0001\u0012>\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006 \u0003*\u001e\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/constant/RepairStep;",
        "b",
        "(Lkotlin/Pair;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LOo1;


# direct methods
.method public constructor <init>(LOo1;)V
    .locals 0

    iput-object p1, p0, LOo1$d;->g:LOo1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LOo1$d;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final b(Lkotlin/Pair;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lkotlin/Unit;",
            "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/constant/RepairStep;",
            ">;>;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetListAction;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetListAction;->getKind()Lco/bird/android/model/constant/FleetListActionKind;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/FleetListActionKind;->REPAIR_FLOW:Lco/bird/android/model/constant/FleetListActionKind;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LOo1$d;->g:LOo1;

    invoke-static {v0}, LOo1;->access$getVehicleServicingManager$p(LOo1;)Lrn6;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetListAction;->getVehicleId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lrn6;->a(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LOo1$d$a;

    invoke-direct {v1, p1}, LOo1$d$a;-><init>(Lco/bird/android/model/persistence/nestedstructures/FleetListAction;)V

    new-instance p1, LPo1;

    invoke-direct {p1, v1}, LPo1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LOo1$d;->b(Lkotlin/Pair;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
