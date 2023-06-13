.class public final synthetic Ltm6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/model/Vehicle;

.field public final synthetic c:Lco/bird/android/manager/bluetooth/internal/d;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltm6;->b:Lco/bird/android/model/Vehicle;

    iput-object p2, p0, Ltm6;->c:Lco/bird/android/manager/bluetooth/internal/d;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltm6;->b:Lco/bird/android/model/Vehicle;

    iget-object v1, p0, Ltm6;->c:Lco/bird/android/manager/bluetooth/internal/d;

    invoke-static {v0, v1}, Lco/bird/android/manager/bluetooth/internal/d;->x(Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/d;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
