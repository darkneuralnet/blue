.class public final Lks$z;
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
        "Lkotlin/Pair<",
        "+",
        "LHM4<",
        "Lco/bird/api/request/BraintreeTokenResponse;",
        ">;+",
        "Lco/bird/android/model/PlanItemModel;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\t\u001a\u00020\u00062^\u0010\u0005\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "LHM4;",
        "Lco/bird/api/request/BraintreeTokenResponse;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/PlanItemModel;",
        "<name for destructuring parameter 0>",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
        "<anonymous>"
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

    iput-object p1, p0, Lks$z;->g:Lks;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lks$z;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "LHM4<",
            "Lco/bird/api/request/BraintreeTokenResponse;",
            ">;",
            "Lco/bird/android/model/PlanItemModel;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LHM4;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/PlanItemModel;

    invoke-virtual {v0}, LHM4;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/request/BraintreeTokenResponse;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lks$z;->g:Lks;

    invoke-static {v0}, Lks;->access$getUi$p(Lks;)Lqs;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/api/request/BraintreeTokenResponse;->getToken()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lqs;->R(Ljava/lang/String;)LG10;

    move-result-object p1

    new-instance v1, Lcom/braintreepayments/api/models/PayPalRequest;

    invoke-direct {v1}, Lcom/braintreepayments/api/models/PayPalRequest;-><init>()V

    invoke-static {v0}, Lks;->access$getAnalyticsManager$p(Lks;)LEa;

    move-result-object v0

    new-instance v8, LWP3;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LWP3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v8}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-static {p1, v1}, LfL3;->t(LG10;Lcom/braintreepayments/api/models/PayPalRequest;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lks$z;->g:Lks;

    invoke-static {p1}, Lks;->access$getUi$p(Lks;)Lqs;

    move-result-object p1

    sget v0, Lnl4;->error_generic_body:I

    invoke-interface {p1, v0}, LaM5;->error(I)V

    :cond_1
    :goto_0
    return-void
.end method
