.class public final synthetic LYm6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/manager/bluetooth/internal/d;

.field public final synthetic c:Lco/bird/android/model/Vehicle;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYm6;->b:Lco/bird/android/manager/bluetooth/internal/d;

    iput-object p2, p0, LYm6;->c:Lco/bird/android/model/Vehicle;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LYm6;->b:Lco/bird/android/manager/bluetooth/internal/d;

    iget-object v1, p0, LYm6;->c:Lco/bird/android/model/Vehicle;

    invoke-static {v0, v1}, Lco/bird/android/manager/bluetooth/internal/d$h;->a(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
