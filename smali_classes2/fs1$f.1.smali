.class public final Lfs1$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfs1;-><init>(LCT0;LFD0;LnK4;LLH3;Luh3;LXF3;Lc85;LMQ2;LY55;LJU4;LhP;Lo13;LLe4;Lse4;LIr5;LVf;Landroid/content/Context;LTq4;Lgl;Lue3;LEa;Lco/bird/android/core/mvp/BaseActivity;Le13;LsJ4;Lcom/uber/autodispose/ScopeProvider;Lks1;Lco/bird/android/app/feature/map/ui/MapUi;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroid/view/View;",
        "Lcom/uber/autodispose/ScopeProvider;",
        "Lco/bird/android/model/FlightBanner;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Landroid/view/View;",
        "view",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "Lco/bird/android/model/FlightBanner;",
        "a",
        "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lfs1;


# direct methods
.method public constructor <init>(Lfs1;)V
    .locals 0

    iput-object p1, p0, Lfs1$f;->g:Lfs1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfs1$f;->g:Lfs1;

    invoke-static {v0}, Lfs1;->access$getBirdPlusBannerPresenterImplFactory$p(Lfs1;)LhP;

    move-result-object v0

    new-instance v1, LlP;

    check-cast p1, Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;

    invoke-direct {v1, p1}, LlP;-><init>(Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;)V

    iget-object p1, p0, Lfs1$f;->g:Lfs1;

    invoke-static {p1}, Lfs1;->access$getNavigator$p(Lfs1;)Le13;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, LhP;->a(LkP;Le13;Lcom/uber/autodispose/ScopeProvider;)LfP;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    check-cast p2, Lcom/uber/autodispose/ScopeProvider;

    invoke-virtual {p0, p1, p2}, Lfs1$f;->a(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;

    move-result-object p1

    return-object p1
.end method
