.class public final LJF3$O;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJF3;->e(LFU4;Lf13;Lco/bird/android/model/wire/WireRide;ZZZLcom/uber/autodispose/ScopeProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$tryToPark$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1466:1\n1#2:1467\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireRide;

.field public final synthetic h:LJF3;

.field public final synthetic i:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireRide;LJF3;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, LJF3$O;->g:Lco/bird/android/model/wire/WireRide;

    iput-object p2, p0, LJF3$O;->h:LJF3;

    iput-object p3, p0, LJF3$O;->i:Ljava/lang/Integer;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJF3$O;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    iget-object v0, p0, LJF3$O;->g:Lco/bird/android/model/wire/WireRide;

    if-eqz v0, :cond_1

    iget-object v1, p0, LJF3$O;->h:LJF3;

    iget-object v2, p0, LJF3$O;->i:Ljava/lang/Integer;

    invoke-static {v1}, LJF3;->access$getAnalyticsManager$p(LJF3;)LEa;

    move-result-object v3

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    sget-object v4, LgR4;->c:LgR4;

    invoke-interface {v4, v2}, LIc0;->a(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_0
    sget-object v4, LgR4;->c:LgR4;

    :goto_0
    const/4 v2, 0x1

    const/4 v5, 0x0

    invoke-static {v1, v0, v4, v2, v5}, LJF3;->access$toRideEndClientIssueAcknowledged(LJF3;Lco/bird/android/model/wire/WireRide;LgR4;ZZ)LyQ4;

    move-result-object v2

    invoke-interface {v3, v2}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    const-string v2, "client_issue_displayed"

    const-string v3, "no_parking"

    invoke-virtual {v1, v0, v2, v3}, LJF3;->b(Lco/bird/android/model/wire/WireRide;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
