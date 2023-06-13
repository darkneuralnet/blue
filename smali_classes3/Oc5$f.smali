.class public final LOc5$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOc5;->a(Lco/bird/android/model/wire/WireBird;Lut4;)V
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
        "Lco/bird/android/model/wire/WireRoute;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/constant/ServiceCenterRoute;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\u000c\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/WireRoute;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/constant/ServiceCenterRoute;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LOc5;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(LOc5;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, LOc5$f;->g:LOc5;

    iput-object p2, p0, LOc5$f;->h:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LOc5$f;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireRoute;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/constant/ServiceCenterRoute;",
            ">;>;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireRoute;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    iget-object v3, v0, LOc5$f;->g:LOc5;

    invoke-static {v3}, LOc5;->access$getAnalyticsManager$p(LOc5;)LEa;

    move-result-object v3

    new-instance v15, LRc5;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v4, v0, LOc5$f;->g:LOc5;

    invoke-static {v4}, LOc5;->access$getSessionId$p(LOc5;)Ljava/lang/String;

    move-result-object v8

    iget-object v4, v0, LOc5$f;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v9

    iget-object v4, v0, LOc5$f;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/constant/ServiceCenterRoute;

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    goto :goto_0

    :cond_0
    move-object v11, v4

    :goto_0
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRoute;->getRoute()Lco/bird/android/model/constant/ServiceCenterRoute;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    move-object v12, v1

    goto :goto_1

    :cond_1
    move-object v12, v4

    :goto_1
    iget-object v1, v0, LOc5$f;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getNestId()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x7

    const/4 v1, 0x0

    move-object v4, v15

    move-object v2, v15

    move-object v15, v1

    invoke-direct/range {v4 .. v15}, LRc5;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v2}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method
