.class final Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer$parkingUnavailableBitmapDescriptor$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;-><init>(Landroid/content/Context;LcD1;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LPT;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LPT;",
        "invoke",
        "()LPT;",
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
.field final synthetic this$0:Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer$parkingUnavailableBitmapDescriptor$2;->this$0:Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LPT;
    .locals 7

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer$parkingUnavailableBitmapDescriptor$2;->this$0:Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;->access$getContext$p(Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lrg4;->marker_parking_unavailable:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LfB0;->icon$default(Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LPT;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer$parkingUnavailableBitmapDescriptor$2;->invoke()LPT;

    move-result-object v0

    return-object v0
.end method
