.class public final Lmu5$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmu5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Lmu5;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu5;",
            ")",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LVx6$a;->a(LVx6;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lmu5;Lco/bird/android/model/User;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LVx6$a;->c(LVx6;Lco/bird/android/model/User;)V

    return-void
.end method

.method public static c(Lmu5;Lco/bird/android/model/Warehouse;)V
    .locals 0

    invoke-static {p0, p1}, LVx6$a;->d(LVx6;Lco/bird/android/model/Warehouse;)V

    return-void
.end method

.method public static d(Lmu5;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LVx6$a;->e(LVx6;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Lmu5;Ljava/lang/String;)V
    .locals 1

    const-string v0, "imageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LVx6$a;->f(LVx6;Ljava/lang/String;)V

    return-void
.end method

.method public static f(Lmu5;Z)V
    .locals 0

    invoke-static {p0, p1}, LVx6$a;->g(LVx6;Z)V

    return-void
.end method

.method public static g(Lmu5;Z)V
    .locals 0

    invoke-static {p0, p1}, LVx6$a;->h(LVx6;Z)V

    return-void
.end method

.method public static h(Lmu5;Lco/bird/android/model/Warehouse;Lco/bird/android/model/Warehouse;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu5;",
            "Lco/bird/android/model/Warehouse;",
            "Lco/bird/android/model/Warehouse;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "currentWarehouse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, LVx6$a;->i(LVx6;Lco/bird/android/model/Warehouse;Lco/bird/android/model/Warehouse;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method
