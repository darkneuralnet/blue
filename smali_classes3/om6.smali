.class public final synthetic Lom6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lnm6;

.field public final synthetic c:Lco/bird/android/model/persistence/FleetListVehicle;


# direct methods
.method public synthetic constructor <init>(Lnm6;Lco/bird/android/model/persistence/FleetListVehicle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lom6;->b:Lnm6;

    iput-object p2, p0, Lom6;->c:Lco/bird/android/model/persistence/FleetListVehicle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lom6;->b:Lnm6;

    iget-object v1, p0, Lom6;->c:Lco/bird/android/model/persistence/FleetListVehicle;

    invoke-static {v0, v1}, Lnm6$f;->a(Lnm6;Lco/bird/android/model/persistence/FleetListVehicle;)V

    return-void
.end method
