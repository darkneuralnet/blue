.class public final Lco/bird/android/feature/ridepass/v1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/ridepass/v1/b;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lco/bird/android/feature/ridepass/v1/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;)",
            "Lco/bird/android/feature/ridepass/v1/b;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/feature/ridepass/v1/b;

    invoke-direct {v0, p0}, Lco/bird/android/feature/ridepass/v1/b;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/ridepass/v1/RidePassActivity$b;->b(Lco/bird/android/core/mvp/BaseActivity;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ridepass/v1/b;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    invoke-static {v0}, Lco/bird/android/feature/ridepass/v1/b;->c(Lco/bird/android/core/mvp/BaseActivity;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/ridepass/v1/b;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
