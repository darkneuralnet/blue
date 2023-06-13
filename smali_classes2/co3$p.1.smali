.class public final Lco3$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco3;->k0()V
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
        "Lco/bird/android/model/NestFlightSheetButton;",
        "+",
        "Lco/bird/android/model/persistence/NestMarker;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006 \u0005*\u0018\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/NestFlightSheetButton;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/persistence/NestMarker;",
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
.field public final synthetic g:Lco3;


# direct methods
.method public constructor <init>(Lco3;)V
    .locals 0

    iput-object p1, p0, Lco3$p;->g:Lco3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco3$p;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Lco/bird/android/model/NestFlightSheetButton;",
            "Lco/bird/android/model/persistence/NestMarker;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/NestFlightSheetButton;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/persistence/NestMarker;

    instance-of v3, v1, Lco/bird/android/model/NestAddressButton;

    if-eqz v3, :cond_0

    iget-object v1, v0, Lco3$p;->g:Lco3;

    invoke-static {v1}, Lco3;->access$getNavigator$p(Lco3;)Le13;

    move-result-object v1

    new-instance v15, Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/NestMarker;->getLocation()Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/Coordinate;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v2}, Lco/bird/android/model/persistence/NestMarker;->getLocation()Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/Coordinate;->getLongitude()D

    move-result-wide v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v2, 0x1fc

    const/16 v16, 0x0

    move-object v3, v15

    move-object/from16 v17, v15

    move v15, v2

    invoke-direct/range {v3 .. v16}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;-><init>(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v17

    invoke-interface {v1, v2}, Le13;->H(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)V

    goto :goto_0

    :cond_0
    instance-of v2, v1, Lco/bird/android/model/FlagNestButton;

    if-eqz v2, :cond_1

    iget-object v2, v0, Lco3$p;->g:Lco3;

    invoke-static {v2}, Lco3;->access$getNavigator$p(Lco3;)Le13;

    move-result-object v2

    check-cast v1, Lco/bird/android/model/FlagNestButton;

    invoke-virtual {v1}, Lco/bird/android/model/FlagNestButton;->getNestId()Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x2754

    invoke-interface {v2, v1, v3}, Le13;->c(Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    instance-of v2, v1, Lco/bird/android/model/RefreshNestButton;

    if-eqz v2, :cond_2

    iget-object v2, v0, Lco3$p;->g:Lco3;

    invoke-static {v2}, Lco3;->access$getNestFlightSheetRelay$p(Lco3;)Lma4;

    move-result-object v2

    check-cast v1, Lco/bird/android/model/RefreshNestButton;

    invoke-virtual {v1}, Lco/bird/android/model/RefreshNestButton;->getNestId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method
