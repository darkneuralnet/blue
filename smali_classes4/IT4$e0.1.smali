.class public final LIT4$e0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;->o4(Lco/bird/android/model/wire/WireBird;ZLkotlin/jvm/functions/Function0;Lco/bird/android/model/wire/WireRide;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Vehicle;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/Vehicle;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LIT4;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;

.field public final synthetic i:Z

.field public final synthetic j:Lco/bird/android/model/RideUpdateState;


# direct methods
.method public constructor <init>(LIT4;Lco/bird/android/model/wire/WireBird;ZLco/bird/android/model/RideUpdateState;)V
    .locals 0

    iput-object p1, p0, LIT4$e0;->g:LIT4;

    iput-object p2, p0, LIT4$e0;->h:Lco/bird/android/model/wire/WireBird;

    iput-boolean p3, p0, LIT4$e0;->i:Z

    iput-object p4, p0, LIT4$e0;->j:Lco/bird/android/model/RideUpdateState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Vehicle;)V
    .locals 14

    iget-object p1, p0, LIT4$e0;->g:LIT4;

    iget-object v0, p0, LIT4$e0;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1, v0}, LIT4;->g0(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/RideState;

    move-result-object p1

    iget-object v0, p0, LIT4$e0;->g:LIT4;

    invoke-static {v0}, LIT4;->access$getAnalyticsManager$p(LIT4;)LEa;

    move-result-object v0

    new-instance v13, LCX;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v1, p0, LIT4$e0;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, LIT4$e0;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "unknown"

    :cond_0
    move-object v6, v1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_1
    move-object v7, v1

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->isPrimaryRide()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    move-object v8, p1

    goto :goto_1

    :cond_2
    move-object v8, v1

    :goto_1
    iget-boolean v9, p0, LIT4$e0;->i:Z

    iget-object p1, p0, LIT4$e0;->j:Lco/bird/android/model/RideUpdateState;

    invoke-virtual {p1}, Lco/bird/android/model/RideUpdateState;->toPhaseString()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x7

    const/4 v12, 0x0

    move-object v1, v13

    invoke-direct/range {v1 .. v12}, LCX;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v13}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Vehicle;

    invoke-virtual {p0, p1}, LIT4$e0;->a(Lco/bird/android/model/Vehicle;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
