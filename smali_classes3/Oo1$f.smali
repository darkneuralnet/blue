.class public final LOo1$f;
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

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOo1$f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/constant/RepairStep;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006 \u0005*\u001e\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/constant/RepairStep;",
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
.field public final synthetic g:LOo1;


# direct methods
.method public constructor <init>(LOo1;)V
    .locals 0

    iput-object p1, p0, LOo1$f;->g:LOo1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LOo1$f;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/constant/RepairStep;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/nestedstructures/FleetListAction;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/FleetListAction;->getKind()Lco/bird/android/model/constant/FleetListActionKind;

    move-result-object v1

    sget-object v2, LOo1$f$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lco/bird/android/model/constant/RepairStep;->REPAIR:Lco/bird/android/model/constant/RepairStep;

    if-ne p1, v1, :cond_1

    iget-object p1, p0, LOo1$f;->g:LOo1;

    invoke-static {p1}, LOo1;->access$getNavigator$p(LOo1;)Le13;

    move-result-object p1

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/FleetListAction;->getVehicleId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v2, v1}, Le13$a;->goToRepairV3Overview$default(Le13;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LOo1$f;->g:LOo1;

    invoke-static {p1}, LOo1;->access$getNavigator$p(LOo1;)Le13;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/FleetListAction;->getVehicleId()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/constant/InspectionContext;->FLIGHT_SHEET:Lco/bird/android/model/constant/InspectionContext;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Le13$a;->goToInspectionV3$default(Le13;Ljava/lang/String;Lco/bird/android/model/constant/InspectionContext;Ljava/lang/Integer;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
