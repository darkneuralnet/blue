.class final Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->J(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lkotlin/Unit;",
        "+",
        "Lco/bird/android/model/constant/VehicleInventoryAction;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/Warehouse;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0008\u001aJ\u0012\u001e\u0008\u0001\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \u0003*\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0006 \u0003*$\u0012\u001e\u0008\u0001\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \u0003*\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/constant/VehicleInventoryAction;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/Warehouse;",
        "c",
        "(Lkotlin/Pair;)Lio/reactivex/K;"
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

    iput-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/buava/Optional;

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method


# virtual methods
.method public final c(Lkotlin/Pair;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lkotlin/Unit;",
            "+",
            "Lco/bird/android/model/constant/VehicleInventoryAction;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/Warehouse;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/constant/VehicleInventoryAction;

    sget-object v0, Lco/bird/android/model/constant/VehicleInventoryAction;->CHECK_IN:Lco/bird/android/model/constant/VehicleInventoryAction;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    invoke-static {p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->access$getUserManager$p(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)Llh6;

    move-result-object p1

    invoke-interface {p1}, Llh6;->getUser()Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$1;

    iget-object v1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    invoke-direct {v0, v1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$1;-><init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V

    new-instance v1, Lco/bird/android/feature/coreinventory/scan/c;

    invoke-direct {v1, v0}, Lco/bird/android/feature/coreinventory/scan/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$2;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$2;

    new-instance v1, Lco/bird/android/feature/coreinventory/scan/d;

    invoke-direct {v1, v0}, Lco/bird/android/feature/coreinventory/scan/d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7;->c(Lkotlin/Pair;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
