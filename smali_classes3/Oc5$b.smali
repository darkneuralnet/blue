.class public final LOc5$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOc5;-><init>(Ltc5;LaG6;LEa;LTq4;LSc5;Lcom/uber/autodispose/ScopeProvider;Le13;Loc5;)V
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
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/constant/ServiceCenterRoute;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireRoute;",
        ">;>;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\t\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0003*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00040\u0004 \u0003* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0003*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00040\u0004\u0018\u00010\u00070\u00072:\u0010\u0006\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0000H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/constant/ServiceCenterRoute;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/model/wire/WireRoute;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "LH6;",
        "a",
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
.field public final synthetic g:LOc5;


# direct methods
.method public constructor <init>(LOc5;)V
    .locals 0

    iput-object p1, p0, LOc5$b;->g:LOc5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/constant/ServiceCenterRoute;",
            ">;+",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireRoute;",
            ">;>;)",
            "Lio/reactivex/K<",
            "+",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v1, p0, LOc5$b;->g:LOc5;

    invoke-static {v1}, LOc5;->access$getConverter$p(LOc5;)Loc5;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/constant/ServiceCenterRoute;

    const-string v2, "routeOptions"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v1, v0, p1}, Loc5;->a(Lco/bird/android/model/constant/ServiceCenterRoute;Ljava/util/Collection;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LOc5$b;->a(Lkotlin/Pair;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
