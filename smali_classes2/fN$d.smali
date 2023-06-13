.class public final LfN$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfN;->onBannerShown()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/offer/WireCouponOffer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/offer/WireCouponOffer;",
        "kotlin.jvm.PlatformType",
        "offer",
        "",
        "a",
        "(Lco/bird/android/model/offer/WireCouponOffer;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LfN;


# direct methods
.method public constructor <init>(LfN;)V
    .locals 0

    iput-object p1, p0, LfN$d;->g:LfN;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/offer/WireCouponOffer;)V
    .locals 13

    iget-object v0, p0, LfN$d;->g:LfN;

    invoke-static {v0}, LfN;->access$getTitle$p(LfN;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/offer/WireCouponOffer;->getUi()Lco/bird/android/model/offer/WireCouponOffer$Ui;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/offer/WireCouponOffer$Ui;->getBannerTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LfN$d;->g:LfN;

    invoke-static {v0}, LfN;->access$getSubtitle$p(LfN;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/offer/WireCouponOffer;->getUi()Lco/bird/android/model/offer/WireCouponOffer$Ui;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/offer/WireCouponOffer$Ui;->getBannerBody()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LfN$d;->g:LfN;

    invoke-static {v0}, LfN;->access$getAnalyticsManager$p(LfN;)LEa;

    move-result-object v0

    new-instance v12, Lqe3;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/offer/WireCouponOffer;->getCampaignId()Ljava/lang/String;

    move-result-object v5

    const-string v6, "offer"

    invoke-virtual {p1}, Lco/bird/android/model/offer/WireCouponOffer;->getAction()Lco/bird/android/model/offer/WireCouponOffer$Action;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/offer/WireCouponOffer$Action;->getKind()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xc7

    const/4 v11, 0x0

    move-object v1, v12

    invoke-direct/range {v1 .. v11}, Lqe3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v12}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/offer/WireCouponOffer;

    invoke-virtual {p0, p1}, LfN$d;->a(Lco/bird/android/model/offer/WireCouponOffer;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
