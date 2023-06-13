.class public final Lks$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lks;->L(LpN3;)Lio/reactivex/c;
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
        "Lco/bird/android/model/PlanItemModel;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005 \u0004* \u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/PlanItemModel;",
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
.field public final synthetic g:Lks;

.field public final synthetic h:LpN3;


# direct methods
.method public constructor <init>(Lks;LpN3;)V
    .locals 0

    iput-object p1, p0, Lks$c;->g:Lks;

    iput-object p2, p0, Lks$c;->h:LpN3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lks$c;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lkotlin/Unit;",
            "Lco/bird/android/model/PlanItemModel;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/PlanItemModel;

    iget-object v2, v0, Lks$c;->g:Lks;

    invoke-static {v2}, Lks;->access$getAnalyticsManager$p(Lks;)LEa;

    move-result-object v2

    iget-object v3, v0, Lks$c;->h:LpN3;

    invoke-virtual {v3}, LpN3;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lco/bird/android/model/PlanItemModel;->getIncentiveAmount()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v3, v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    move-object v13, v3

    invoke-virtual {v1}, Lco/bird/android/model/PlanItemModel;->getCurrency()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lco/bird/android/model/PlanItemModel;->getPlanId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lco/bird/android/model/PlanItemModel;->getRefillAmount()I

    move-result v3

    int-to-long v3, v3

    new-instance v15, Lf04;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    const/4 v14, 0x7

    const/4 v3, 0x0

    move-object v4, v15

    move-object/from16 p1, v1

    move-object v1, v15

    move-object v15, v3

    invoke-direct/range {v4 .. v15}, Lf04;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object v1, v0, Lks$c;->g:Lks;

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/PlanItemModel;->getPlanId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lks;->access$finish(Lks;Ljava/lang/String;)V

    return-void
.end method
