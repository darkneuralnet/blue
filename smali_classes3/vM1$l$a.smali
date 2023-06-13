.class public final LvM1$l$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LvM1$l;->invoke(Lkotlin/Pair;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/BleScannedVehicle;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/BleScannedVehicle;",
        "vehicle",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/BleScannedVehicle;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lco/bird/android/model/persistence/Bird;

.field public final synthetic i:LvM1;


# direct methods
.method public constructor <init>(ILco/bird/android/model/persistence/Bird;LvM1;)V
    .locals 0

    iput p1, p0, LvM1$l$a;->g:I

    iput-object p2, p0, LvM1$l$a;->h:Lco/bird/android/model/persistence/Bird;

    iput-object p3, p0, LvM1$l$a;->i:LvM1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LvM1$l$a;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/BleScannedVehicle;)Lio/reactivex/h;
    .locals 28

    move-object/from16 v0, p0

    const-string v1, "vehicle"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, Lco/bird/android/model/BleScannedVehicle;->getBattery()I

    move-result v1

    iget v2, v0, LvM1$l$a;->g:I

    const/4 v3, 0x2

    if-le v1, v2, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "randomUUID().toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, LvM1$l$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v6

    iget-object v2, v0, LvM1$l$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object v7

    sget-object v2, LbH;->b:LbH;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    sget-object v4, LXD5;->c:LXD5;

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    new-instance v15, LbE5;

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x719

    const/16 v18, 0x0

    move-object v4, v15

    move-object v10, v1

    move-object/from16 v27, v15

    move-object/from16 v15, v16

    move/from16 v16, v17

    move-object/from16 v17, v18

    invoke-direct/range {v4 .. v17}, LbE5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v4, v0, LvM1$l$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v6

    iget-object v4, v0, LvM1$l$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    new-instance v2, LKY;

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x759

    const/16 v17, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v17}, LKY;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v1, v3, [Lio/reactivex/c;

    iget-object v3, v0, LvM1$l$a;->i:LvM1;

    invoke-static {v3}, LvM1;->access$getBirdManager$p(LvM1;)LaM;

    move-result-object v3

    iget-object v4, v0, LvM1$l$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, v27

    invoke-interface {v3, v4, v5}, LaM;->z0(Ljava/lang/String;LbE5;)Lio/reactivex/c;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    iget-object v3, v0, LvM1$l$a;->i:LvM1;

    invoke-static {v3}, LvM1;->access$getRxBleBirdBluetoothManager$p(LvM1;)Lrd5;

    move-result-object v3

    iget-object v4, v0, LvM1$l$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-static {v4}, LBT;->g(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/VehicleDescriptor;

    move-result-object v4

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    sget-object v6, LXD5;->b:LXD5;

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v21

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x77f

    const/16 v26, 0x0

    move-object v13, v5

    invoke-static/range {v13 .. v26}, LbE5;->copy$default(LbE5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LbE5;

    move-result-object v5

    const/4 v6, 0x1

    invoke-interface {v3, v4, v6, v2, v5}, Lrd5;->h(Lco/bird/android/model/VehicleDescriptor;ZLKY;LbE5;)Lio/reactivex/c;

    move-result-object v2

    aput-object v2, v1, v6

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, v0, LvM1$l$a;->i:LvM1;

    invoke-virtual {v1}, LvM1;->U()LFM1;

    move-result-object v1

    sget-object v2, LPL1;->d:LPL1;

    const/4 v4, 0x0

    invoke-static {v1, v2, v4, v3, v4}, LH31$a;->showBottomSheetAlert$default(LH31;LNy;Ljava/lang/Integer;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v1

    sget-object v2, LvM1$l$a$a;->g:LvM1$l$a$a;

    new-instance v3, LDM1;

    invoke-direct {v3, v2}, LDM1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/BleScannedVehicle;

    invoke-virtual {p0, p1}, LvM1$l$a;->b(Lco/bird/android/model/BleScannedVehicle;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
