.class public final LIT4$D;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;->a0(Lco/bird/android/model/wire/WireRide;LbF0;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireRideDetail;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRideDetail;",
        "kotlin.jvm.PlatformType",
        "rideDetail",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireRideDetail;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LIT4;

.field public final synthetic h:Lco/bird/android/model/wire/WireRide;


# direct methods
.method public constructor <init>(LIT4;Lco/bird/android/model/wire/WireRide;)V
    .locals 0

    iput-object p1, p0, LIT4$D;->g:LIT4;

    iput-object p2, p0, LIT4$D;->h:Lco/bird/android/model/wire/WireRide;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireRideDetail;)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v28, p1

    iget-object v1, v0, LIT4$D;->g:LIT4;

    invoke-static {v1}, LIT4;->access$getFrequentFlyerManager$p(LIT4;)LUz1;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRideDetail;->getFrequentFlyerView()Lco/bird/android/model/wire/WireFrequentFlyerView;

    move-result-object v2

    invoke-virtual {v1, v2}, LUz1;->g(Lco/bird/android/model/wire/WireFrequentFlyerView;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRideDetail;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const v29, 0x1ffffff

    const/16 v30, 0x0

    invoke-static/range {v1 .. v30}, Lco/bird/android/model/wire/WireRide;->copy$default(Lco/bird/android/model/wire/WireRide;Ljava/lang/String;DLjava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;ILjava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/Boolean;Lco/bird/android/model/constant/RideType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Lco/bird/android/model/wire/WireRideDetail;ILjava/lang/Object;)Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    iget-object v2, v0, LIT4$D;->g:LIT4;

    iget-object v3, v0, LIT4$D;->h:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LIT4;->i1(Ljava/lang/String;)Lco/bird/android/model/RideState;

    move-result-object v2

    if-eqz v2, :cond_0

    sget-object v3, Lco/bird/android/model/RideState$Status;->ENDED:Lco/bird/android/model/RideState$Status;

    iget-object v4, v0, LIT4$D;->g:LIT4;

    invoke-virtual {v4}, LIT4;->r()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/configs/Config;

    sget-object v5, Lco/bird/android/model/RideUpdateState;->NONE:Lco/bird/android/model/RideUpdateState;

    invoke-virtual {v2, v1, v3, v4, v5}, Lco/bird/android/model/RideState;->copy(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/RideState$Status;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RideUpdateState;)Lco/bird/android/model/RideState;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    iget-object v1, v0, LIT4$D;->h:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No existing ride state found for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to update in completeRide flow"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v2, v0, LIT4$D;->g:LIT4;

    invoke-static {v2, v1}, LIT4;->access$updateExistingRideState(LIT4;Lco/bird/android/model/RideState;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireRideDetail;

    invoke-virtual {p0, p1}, LIT4$D;->a(Lco/bird/android/model/wire/WireRideDetail;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
