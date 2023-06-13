.class final Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7;->c(Lkotlin/Pair;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/User;",
        "Lio/reactivex/K<",
        "+",
        "LHM4<",
        "Lco/bird/android/model/Warehouse;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/model/User;",
        "user",
        "Lio/reactivex/K;",
        "LHM4;",
        "Lco/bird/android/model/Warehouse;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/User;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$1;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/User;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/User;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "LHM4<",
            "Lco/bird/android/model/Warehouse;",
            ">;>;"
        }
    .end annotation

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/User;->getWarehouseId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$1;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    invoke-static {v0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->access$getWarehouseManager$p(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)LSy6;

    move-result-object v1

    invoke-interface {v1, p1}, LSy6;->a(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->e0(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;Lio/reactivex/F;Ljava/lang/Boolean;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "User not associated with warehouse"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/User;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$1;->a(Lco/bird/android/model/User;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
