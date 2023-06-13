.class public final LMt5$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMt5$a;->c(Lco/bird/android/model/User;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lkotlin/Unit;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0004\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LHM4;",
        "",
        "kotlin.jvm.PlatformType",
        "it",
        "a",
        "(LHM4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public final synthetic h:LMt5;

.field public final synthetic i:LbE5;


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/ServiceCenterStatus;LMt5;LbE5;)V
    .locals 0

    iput-object p1, p0, LMt5$a$a;->g:Lco/bird/android/model/constant/ServiceCenterStatus;

    iput-object p2, p0, LMt5$a$a;->h:LMt5;

    iput-object p3, p0, LMt5$a$a;->i:LbE5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, LMt5$a$a;->g:Lco/bird/android/model/constant/ServiceCenterStatus;

    invoke-virtual {p1}, Lco/bird/android/model/constant/ServiceCenterStatus;->isHibernate()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LMt5$a$a;->g:Lco/bird/android/model/constant/ServiceCenterStatus;

    invoke-virtual {p1}, Lco/bird/android/model/constant/ServiceCenterStatus;->isHibernateCreateBatch()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    iget-object p1, p0, LMt5$a$a;->h:LMt5;

    invoke-static {p1}, LMt5;->access$getAnalyticsManager$p(LMt5;)LEa;

    move-result-object p1

    iget-object v0, p0, LMt5$a$a;->i:LbE5;

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, LcE5;->toSleepEndedEvent$default(LbE5;ZLjava/lang/String;ILjava/lang/Object;)LaE5;

    move-result-object v0

    invoke-interface {p1, v0}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LMt5$a$a;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
