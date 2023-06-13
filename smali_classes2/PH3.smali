.class public final LPH3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOH3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0010\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0008H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "LPH3;",
        "LOH3;",
        "",
        "incentive",
        "Ljava/util/Currency;",
        "currency",
        "",
        "c",
        "",
        "subtitle",
        "b",
        "image",
        "a",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "Lco/bird/android/widget/CallToActionBanner;",
        "Lco/bird/android/widget/CallToActionBanner;",
        "parkingSuccessBannerView",
        "<init>",
        "(Landroid/content/Context;Lco/bird/android/widget/CallToActionBanner;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lco/bird/android/widget/CallToActionBanner;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lco/bird/android/widget/CallToActionBanner;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parkingSuccessBannerView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPH3;->a:Landroid/content/Context;

    iput-object p2, p0, LPH3;->b:Lco/bird/android/widget/CallToActionBanner;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, LPH3;->b:Lco/bird/android/widget/CallToActionBanner;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/CallToActionBanner;->setImage(I)V

    return-void
.end method

.method public b(I)V
    .locals 2

    iget-object v0, p0, LPH3;->b:Lco/bird/android/widget/CallToActionBanner;

    iget-object v1, p0, LPH3;->a:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "context.getString(subtitle)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lco/bird/android/widget/CallToActionBanner;->setSubtitle(Ljava/lang/String;)V

    return-void
.end method

.method public c(JLjava/util/Currency;)V
    .locals 2

    const-string v0, "currency"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lxx1;->a:Lxx1;

    sget-object v1, LUx1;->d:LUx1;

    invoke-virtual {v0, p1, p2, p3, v1}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, LPH3;->a:Landroid/content/Context;

    sget p3, Lnl4;->parking_nest_success_subtitle:I

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-virtual {p2, p3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "context.getString(L.stri\u2026s_subtitle, incentiveStr)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LPH3;->b:Lco/bird/android/widget/CallToActionBanner;

    invoke-virtual {p2, p1}, Lco/bird/android/widget/CallToActionBanner;->setSubtitle(Ljava/lang/String;)V

    return-void
.end method
