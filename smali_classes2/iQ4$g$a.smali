.class public final LiQ4$g$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LiQ4$g;->invoke(Lkotlin/Unit;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/DisputeRideCreateResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/DisputeRideCreateResponse;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(Lco/bird/api/response/DisputeRideCreateResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LiQ4;

.field public final synthetic h:Lco/bird/android/model/wire/WireRide;


# direct methods
.method public constructor <init>(LiQ4;Lco/bird/android/model/wire/WireRide;)V
    .locals 0

    iput-object p1, p0, LiQ4$g$a;->g:LiQ4;

    iput-object p2, p0, LiQ4$g$a;->h:Lco/bird/android/model/wire/WireRide;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/DisputeRideCreateResponse;)V
    .locals 8

    invoke-virtual {p1}, Lco/bird/api/response/DisputeRideCreateResponse;->getEligible()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lco/bird/api/response/DisputeRideCreateResponse;->getTitleText()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lco/bird/api/response/DisputeRideCreateResponse;->getBodyText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, LiQ4$g$a;->g:LiQ4;

    invoke-static {v0}, LiQ4;->access$getNavigator$p(LiQ4;)Le13;

    move-result-object v1

    iget-object v2, p0, LiQ4$g$a;->h:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {p1}, Lco/bird/api/response/DisputeRideCreateResponse;->getTitleText()Ljava/lang/String;

    move-result-object v0

    const-string v3, ""

    if-nez v0, :cond_1

    move-object v0, v3

    :cond_1
    invoke-virtual {p1}, Lco/bird/api/response/DisputeRideCreateResponse;->getBodyText()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    move-object v4, v3

    goto :goto_0

    :cond_2
    move-object v4, p1

    :goto_0
    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v3, v0

    invoke-static/range {v1 .. v7}, Le13$a;->goToDisputeCharge$default(Le13;Lco/bird/android/model/wire/WireRide;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/DisputeRideCreateResponse;

    invoke-virtual {p0, p1}, LiQ4$g$a;->a(Lco/bird/api/response/DisputeRideCreateResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
