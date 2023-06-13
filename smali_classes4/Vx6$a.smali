.class public final LVx6$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVx6;
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
.method public static a(LVx6;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVx6;",
            ")",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LWW$a;->a(LWW;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static b(LVx6;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVx6;",
            ")",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LSk3$a;->a(LSk3;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static c(LVx6;Lco/bird/android/model/User;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LSk3$a;->b(LSk3;Lco/bird/android/model/User;)V

    return-void
.end method

.method public static d(LVx6;Lco/bird/android/model/Warehouse;)V
    .locals 0

    invoke-static {p0, p1}, LSk3$a;->c(LSk3;Lco/bird/android/model/Warehouse;)V

    return-void
.end method

.method public static e(LVx6;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LSk3$a;->d(LSk3;Ljava/lang/String;)V

    return-void
.end method

.method public static f(LVx6;Ljava/lang/String;)V
    .locals 1

    const-string v0, "imageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LSk3$a;->e(LSk3;Ljava/lang/String;)V

    return-void
.end method

.method public static g(LVx6;Z)V
    .locals 0

    invoke-static {p0, p1}, LWW$a;->b(LWW;Z)V

    return-void
.end method

.method public static h(LVx6;Z)V
    .locals 0

    invoke-static {p0, p1}, LSk3$a;->f(LSk3;Z)V

    return-void
.end method

.method public static i(LVx6;Lco/bird/android/model/Warehouse;Lco/bird/android/model/Warehouse;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVx6;",
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

    sget-object v0, Ljz6;->e:Ljz6$a;

    invoke-virtual {v0, p1, p2}, Ljz6$a;->a(Lco/bird/android/model/Warehouse;Lco/bird/android/model/Warehouse;)Ljz6;

    move-result-object p1

    invoke-interface {p0}, LVx6;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    const-string p2, "WarehouseVerificationBottomSheet"

    invoke-virtual {p1, p0, p2}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljz6;->A9()Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method
