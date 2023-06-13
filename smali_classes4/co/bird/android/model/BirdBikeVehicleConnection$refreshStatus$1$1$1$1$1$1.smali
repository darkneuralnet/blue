.class final Lco/bird/android/model/BirdBikeVehicleConnection$refreshStatus$1$1$1$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/model/BirdBikeVehicleConnection$refreshStatus$1$1$1$1$1;->invoke()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/reactivex/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lio/reactivex/c;",
        "invoke",
        "()Lio/reactivex/c;",
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
.field final synthetic this$0:Lco/bird/android/model/BirdBikeVehicleConnection;


# direct methods
.method public constructor <init>(Lco/bird/android/model/BirdBikeVehicleConnection;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/BirdBikeVehicleConnection$refreshStatus$1$1$1$1$1$1;->this$0:Lco/bird/android/model/BirdBikeVehicleConnection;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lio/reactivex/c;
    .locals 7

    iget-object v0, p0, Lco/bird/android/model/BirdBikeVehicleConnection$refreshStatus$1$1$1$1$1$1;->this$0:Lco/bird/android/model/BirdBikeVehicleConnection;

    sget-object v1, Lco/bird/android/model/Command;->BIRD_BIKE_QUERY_MOTOR_LOCK:Lco/bird/android/model/Command;

    const-wide/16 v2, 0xc8

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lco/bird/android/model/BirdBikeVehicleConnection;->writeCommandData$default(Lco/bird/android/model/BirdBikeVehicleConnection;Lco/bird/android/model/Command;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/model/BirdBikeVehicleConnection$refreshStatus$1$1$1$1$1$1;->invoke()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method
