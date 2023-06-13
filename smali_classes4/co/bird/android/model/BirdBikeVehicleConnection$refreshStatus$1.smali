.class final Lco/bird/android/model/BirdBikeVehicleConnection$refreshStatus$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/model/BirdBikeVehicleConnection;->refreshStatus()Lio/reactivex/c;
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

    iput-object p1, p0, Lco/bird/android/model/BirdBikeVehicleConnection$refreshStatus$1;->this$0:Lco/bird/android/model/BirdBikeVehicleConnection;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lio/reactivex/c;
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/BirdBikeVehicleConnection$refreshStatus$1;->this$0:Lco/bird/android/model/BirdBikeVehicleConnection;

    sget-object v1, Lco/bird/android/model/Command;->BIRD_BIKE_QUERY_RIDE_DATA:Lco/bird/android/model/Command;

    new-instance v2, Lco/bird/android/model/BirdBikeVehicleConnection$refreshStatus$1$1;

    invoke-direct {v2, v0}, Lco/bird/android/model/BirdBikeVehicleConnection$refreshStatus$1$1;-><init>(Lco/bird/android/model/BirdBikeVehicleConnection;)V

    const-wide/16 v3, 0xc8

    invoke-static {v0, v1, v3, v4, v2}, Lco/bird/android/model/BirdBikeVehicleConnection;->access$writeCommandData(Lco/bird/android/model/BirdBikeVehicleConnection;Lco/bird/android/model/Command;JLkotlin/jvm/functions/Function0;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/model/BirdBikeVehicleConnection$refreshStatus$1;->invoke()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method
