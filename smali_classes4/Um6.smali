.class public final synthetic LUm6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/model/Vehicle;

.field public final synthetic c:Lco/bird/android/manager/bluetooth/internal/d;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/d;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUm6;->b:Lco/bird/android/model/Vehicle;

    iput-object p2, p0, LUm6;->c:Lco/bird/android/manager/bluetooth/internal/d;

    iput-boolean p3, p0, LUm6;->d:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LUm6;->b:Lco/bird/android/model/Vehicle;

    iget-object v1, p0, LUm6;->c:Lco/bird/android/manager/bluetooth/internal/d;

    iget-boolean v2, p0, LUm6;->d:Z

    invoke-static {v0, v1, v2}, Lco/bird/android/manager/bluetooth/internal/d;->P(Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/d;Z)Lco/bird/android/model/Command;

    move-result-object v0

    return-object v0
.end method
