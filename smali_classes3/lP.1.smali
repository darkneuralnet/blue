.class public final LlP;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LkP;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "LlP;",
        "LkP;",
        "Lio/reactivex/Observable;",
        "",
        "a",
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "birdPlusView",
        "b",
        "Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;",
        "Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;",
        "birdPlusBannerView",
        "<init>",
        "(Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;)V",
        "bird-plus_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;)V
    .locals 1

    const-string v0, "birdPlusBannerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlP;->a:Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;

    return-void
.end method


# virtual methods
.method public a()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LlP;->a:Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public b(Lco/bird/android/model/persistence/BirdPlusView;)V
    .locals 1

    const-string v0, "birdPlusView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LlP;->a:Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LlP;->a:Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;

    invoke-virtual {v0, p1}, Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;->e(Lco/bird/android/model/persistence/BirdPlusView;)V

    return-void
.end method
