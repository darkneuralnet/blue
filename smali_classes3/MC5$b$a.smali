.class public final LMC5$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMC5$b;->invoke(Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LOC5;",
        "LOC5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LOC5;",
        "state",
        "a",
        "(LOC5;)LOC5;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSkuOrderVehiclesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuOrderVehiclesPresenter.kt\nco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesPresenter$consume$2$1\n+ 2 SkuOrderVehiclesState.kt\nco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesStateKt\n*L\n1#1,47:1\n27#2,8:48\n*S KotlinDebug\n*F\n+ 1 SkuOrderVehiclesPresenter.kt\nco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesPresenter$consume$2$1\n*L\n29#1:48,8\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, LMC5$b$a;->g:Ljava/lang/Throwable;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOC5;)LOC5;
    .locals 6

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LSf1;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    instance-of v1, p1, LSf1;

    if-nez v1, :cond_2

    invoke-static {v0}, Lkotlin/reflect/full/KClasses;->getPrimaryConstructor(Lkotlin/reflect/KClass;)Lkotlin/reflect/KFunction;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1}, LOC5;->a()Lco/bird/android/model/wire/WireSkuOrder;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-interface {p1}, LOC5;->b()Ljava/util/List;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-interface {p1}, LOC5;->getError()Ljava/lang/Throwable;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-interface {v0, v1}, Lkotlin/reflect/KCallable;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LOC5;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    check-cast p1, LSf1;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type co.bird.android.feature.transferorder.sku.vehicles.Error"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    move-object v0, p1

    check-cast v0, LSf1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p0, LMC5$b$a;->g:Ljava/lang/Throwable;

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LSf1;->copy$default(LSf1;Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;Ljava/lang/Throwable;ILjava/lang/Object;)LSf1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LOC5;

    invoke-virtual {p0, p1}, LMC5$b$a;->a(LOC5;)LOC5;

    move-result-object p1

    return-object p1
.end method
