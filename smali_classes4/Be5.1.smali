.class public final synthetic LBe5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:LFe5;

.field public final synthetic d:Lco/bird/android/model/VehicleDescriptor;


# direct methods
.method public synthetic constructor <init>(ZLFe5;Lco/bird/android/model/VehicleDescriptor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LBe5;->b:Z

    iput-object p2, p0, LBe5;->c:LFe5;

    iput-object p3, p0, LBe5;->d:Lco/bird/android/model/VehicleDescriptor;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, LBe5;->b:Z

    iget-object v1, p0, LBe5;->c:LFe5;

    iget-object v2, p0, LBe5;->d:Lco/bird/android/model/VehicleDescriptor;

    invoke-static {v0, v1, v2}, LFe5;->c(ZLFe5;Lco/bird/android/model/VehicleDescriptor;)Lco/bird/android/model/BleScannedVehicle;

    move-result-object v0

    return-object v0
.end method
