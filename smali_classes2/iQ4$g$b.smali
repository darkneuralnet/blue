.class public final LiQ4$g$b;
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
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/DialogResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/api/response/DisputeRideCreateResponse;",
        "response",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/DialogResponse;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/DisputeRideCreateResponse;)Lio/reactivex/K;"
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


# direct methods
.method public constructor <init>(LiQ4;)V
    .locals 0

    iput-object p1, p0, LiQ4$g$b;->g:LiQ4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/DisputeRideCreateResponse;)Lio/reactivex/K;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/DisputeRideCreateResponse;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/DisputeRideCreateResponse;->getEligible()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lco/bird/api/response/DisputeRideCreateResponse;->getTitleText()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lco/bird/api/response/DisputeRideCreateResponse;->getBodyText()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lco/bird/android/model/DialogResponse;->DISMISS:Lco/bird/android/model/DialogResponse;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "{\n              Single.j\u2026se.DISMISS)\n            }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    :goto_0
    iget-object v0, p0, LiQ4$g$b;->g:LiQ4;

    invoke-static {v0}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LsQ4;->Vh(Z)V

    iget-object v0, p0, LiQ4$g$b;->g:LiQ4;

    invoke-static {v0}, LiQ4;->access$getUi$p(LiQ4;)LsQ4;

    move-result-object v0

    new-instance v2, LpB1;

    invoke-virtual {p1}, Lco/bird/api/response/DisputeRideCreateResponse;->getTitleText()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    if-nez v3, :cond_2

    move-object v3, v4

    :cond_2
    invoke-virtual {p1}, Lco/bird/api/response/DisputeRideCreateResponse;->getBodyText()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    move-object v4, p1

    :goto_1
    sget p1, Lnl4;->general_got_it:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sget v5, Lnl4;->contact_support:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v2, v3, v4, p1, v5}, LpB1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    const/4 p1, 0x1

    invoke-interface {v0, v2, p1, v1}, LH31;->birdDialog(LNy;ZZ)Lio/reactivex/F;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/DisputeRideCreateResponse;

    invoke-virtual {p0, p1}, LiQ4$g$b;->a(Lco/bird/api/response/DisputeRideCreateResponse;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
