.class public final Lks$v;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lks;->c0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lkotlin/Unit;",
        "+",
        "Lco/bird/android/model/PlanItemModel;",
        "+",
        "Lco/bird/android/model/User;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00012b\u0010\u0005\u001a^\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004 \u0002*.\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Triple;",
        "",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/PlanItemModel;",
        "Lco/bird/android/model/User;",
        "<name for destructuring parameter 0>",
        "a",
        "(Lkotlin/Triple;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lks;


# direct methods
.method public constructor <init>(Lks;)V
    .locals 0

    iput-object p1, p0, Lks$v;->g:Lks;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lkotlin/Unit;",
            "Lco/bird/android/model/PlanItemModel;",
            "Lco/bird/android/model/User;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/PlanItemModel;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lco/bird/android/model/User;

    iget-object p1, p0, Lks$v;->g:Lks;

    invoke-static {p1}, Lks;->access$getAnalyticsManager$p(Lks;)LEa;

    move-result-object p1

    new-instance v1, Lco/bird/android/model/analytics/GooglePayButtonClicked;

    sget-object v3, Lco/bird/android/model/analytics/ScreenType;->PRELOAD:Lco/bird/android/model/analytics/ScreenType;

    invoke-direct {v1, v3}, Lco/bird/android/model/analytics/GooglePayButtonClicked;-><init>(Lco/bird/android/model/analytics/ScreenType;)V

    invoke-interface {p1, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    invoke-virtual {v0}, Lco/bird/android/model/PlanItemModel;->getCurrency()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p1

    invoke-virtual {v0}, Lco/bird/android/model/PlanItemModel;->getRefillAmount()I

    move-result v0

    int-to-long v7, v0

    iget-object v0, p0, Lks$v;->g:Lks;

    invoke-static {v0}, Lks;->access$getGooglePayManager$p(Lks;)LiD1;

    move-result-object v1

    const-string v0, "user"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lks$v;->g:Lks;

    invoke-static {v0}, Lks;->access$getActivity$p(Lks;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v3

    sget-object v0, LCI4;->c:LCI4;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    move-object v5, p1

    invoke-interface/range {v1 .. v6}, LiD1;->h(Lco/bird/android/model/User;Landroid/app/Activity;ILjava/util/Currency;Ljava/lang/Long;)V

    iget-object v0, p0, Lks$v;->g:Lks;

    invoke-static {v0}, Lks;->access$getAnalyticsManager$p(Lks;)LEa;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/analytics/GooglePayAuthSheetPresented;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lco/bird/android/model/analytics/GooglePayAuthSheetPresented;-><init>(Ljava/util/Currency;Ljava/lang/Long;)V

    invoke-interface {v0, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, Lks$v;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
