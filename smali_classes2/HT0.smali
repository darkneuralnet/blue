.class public final LHT0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFT0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0008\u0010\t\u001a\u00020\u0007H\u0016J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "LHT0;",
        "LFT0;",
        "Lio/reactivex/Observable;",
        "",
        "c",
        "Lco/bird/android/model/Deal;",
        "deal",
        "",
        "d",
        "a",
        "b",
        "Lco/bird/android/widget/DealBannerView;",
        "Lco/bird/android/widget/DealBannerView;",
        "dealBannerView",
        "<init>",
        "(Lco/bird/android/widget/DealBannerView;)V",
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
.field public final a:Lco/bird/android/widget/DealBannerView;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/widget/DealBannerView;)V
    .locals 1

    const-string v0, "dealBannerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHT0;->a:Lco/bird/android/widget/DealBannerView;

    return-void
.end method

.method public static final synthetic access$getDealBannerView$p(LHT0;)Lco/bird/android/widget/DealBannerView;
    .locals 0

    iget-object p0, p0, LHT0;->a:Lco/bird/android/widget/DealBannerView;

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LHT0;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LHT0;->a:Lco/bird/android/widget/DealBannerView;

    invoke-virtual {v0}, Lco/bird/android/widget/DealBannerView;->b()V

    iget-object v0, p0, LHT0;->a:Lco/bird/android/widget/DealBannerView;

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    return-void
.end method

.method public b()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LHT0;->a:Lco/bird/android/widget/DealBannerView;

    invoke-virtual {v0}, Lco/bird/android/widget/DealBannerView;->c()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public c()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LHT0;->a:Lco/bird/android/widget/DealBannerView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LHT0$a;

    invoke-direct {v1, p0}, LHT0$a;-><init>(LHT0;)V

    new-instance v2, LGT0;

    invoke-direct {v2, v1}, LGT0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun dealClicked\u2026aining().firstOrError() }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(Lco/bird/android/model/Deal;)V
    .locals 1

    const-string v0, "deal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LHT0;->a:Lco/bird/android/widget/DealBannerView;

    invoke-virtual {v0}, Lco/bird/android/widget/DealBannerView;->b()V

    iget-object v0, p0, LHT0;->a:Lco/bird/android/widget/DealBannerView;

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LHT0;->a:Lco/bird/android/widget/DealBannerView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/DealBannerView;->a(Lco/bird/android/model/Deal;)V

    return-void
.end method
