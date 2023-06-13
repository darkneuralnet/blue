.class public final LIT4$B;
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
        "Lco/bird/android/model/wire/WireRideDetail;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRideDetail;",
        "rideDetail",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireRideDetail;)Lco/bird/android/model/wire/WireRideDetail;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireRide;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireRide;)V
    .locals 0

    iput-object p1, p0, LIT4$B;->g:Lco/bird/android/model/wire/WireRide;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireRideDetail;)Lco/bird/android/model/wire/WireRideDetail;
    .locals 23

    move-object/from16 v0, p1

    const-string v1, "rideDetail"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p0

    iget-object v1, v15, LIT4$B;->g:Lco/bird/android/model/wire/WireRide;

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireRideDetail;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v2

    invoke-static {v1, v2}, LfU4;->c(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/wire/WireRide;)Lco/bird/android/model/wire/WireRide;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

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

    const/16 v16, 0x0

    move-object/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v21, 0xffffe

    const/16 v22, 0x0

    invoke-static/range {v0 .. v22}, Lco/bird/android/model/wire/WireRideDetail;->copy$default(Lco/bird/android/model/wire/WireRideDetail;Lco/bird/android/model/wire/WireRide;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lco/bird/android/model/wire/WireReceipt;Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireFrequentFlyerView;Lco/bird/android/model/wire/WireDisputeView;Lco/bird/android/model/constant/RideReportStatus;Lco/bird/android/model/wire/WireRideReport;ILjava/lang/Object;)Lco/bird/android/model/wire/WireRideDetail;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireRideDetail;

    invoke-virtual {p0, p1}, LIT4$B;->a(Lco/bird/android/model/wire/WireRideDetail;)Lco/bird/android/model/wire/WireRideDetail;

    move-result-object p1

    return-object p1
.end method
