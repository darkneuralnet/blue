.class public final LFe5$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFe5;->b(Lco/bird/android/model/VehicleDescriptor;Z)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LTk5;",
        "Lco/bird/android/model/BleScannedVehicle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LTk5;",
        "scanResult",
        "Lco/bird/android/model/BleScannedVehicle;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LTk5;)Lco/bird/android/model/BleScannedVehicle;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LFe5;

.field public final synthetic h:Lco/bird/android/model/VehicleDescriptor;


# direct methods
.method public constructor <init>(LFe5;Lco/bird/android/model/VehicleDescriptor;)V
    .locals 0

    iput-object p1, p0, LFe5$d;->g:LFe5;

    iput-object p2, p0, LFe5$d;->h:Lco/bird/android/model/VehicleDescriptor;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LTk5;)Lco/bird/android/model/BleScannedVehicle;
    .locals 2

    const-string v0, "scanResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LFe5$d;->g:LFe5;

    iget-object v1, p0, LFe5$d;->h:Lco/bird/android/model/VehicleDescriptor;

    invoke-static {v0, v1, p1}, LFe5;->access$initBleScannedVehicle(LFe5;Lco/bird/android/model/VehicleDescriptor;LTk5;)Lco/bird/android/model/BleScannedVehicle;

    move-result-object p1

    iget-object v0, p0, LFe5$d;->g:LFe5;

    invoke-static {v0}, LFe5;->access$getVehicles$p(LFe5;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    iget-object v1, p0, LFe5$d;->h:Lco/bird/android/model/VehicleDescriptor;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTk5;

    invoke-virtual {p0, p1}, LFe5$d;->a(LTk5;)Lco/bird/android/model/BleScannedVehicle;

    move-result-object p1

    return-object p1
.end method
