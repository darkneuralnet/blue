.class public final LxU0$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LxU0;->J(Lco/bird/android/model/Deal;)V
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
        "Lco/bird/android/model/User;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lcom/stripe/android/model/Card;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u00020\u00072>\u0010\u0006\u001a:\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004 \u0005*\u001c\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/model/User;",
        "Lco/bird/android/buava/Optional;",
        "Lcom/stripe/android/model/Card;",
        "",
        "kotlin.jvm.PlatformType",
        "it",
        "",
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
.field public final synthetic g:LxU0;


# direct methods
.method public constructor <init>(LxU0;)V
    .locals 0

    iput-object p1, p0, LxU0$o;->g:LxU0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/User;",
            "Lco/bird/android/buava/Optional<",
            "Lcom/stripe/android/model/Card;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, LxU0$o;->g:LxU0;

    invoke-static {p1}, LxU0;->access$getAnalyticsManager$p(LxU0;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/BonusDealScreenClaimedWithGooglePay;

    iget-object v1, p0, LxU0$o;->g:LxU0;

    invoke-static {v1}, LxU0;->access$getDealRelay$p(LxU0;)La94;

    move-result-object v1

    invoke-virtual {v1}, La94;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/Deal;

    iget-object v2, p0, LxU0$o;->g:LxU0;

    invoke-static {v2}, LxU0;->access$getPreferences$p(LxU0;)Lgl;

    move-result-object v2

    invoke-virtual {v2}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-direct {v0, v1, v2}, Lco/bird/android/model/analytics/BonusDealScreenClaimedWithGooglePay;-><init>(Lco/bird/android/model/Deal;Ljava/lang/String;)V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LxU0$o;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
