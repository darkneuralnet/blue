.class public final Lfs1$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfs1;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/FlightBannerNode;",
        ">;",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/FlightBannerNode$FlightBanner;",
        "+",
        "Landroid/view/View;",
        "+",
        "Lco/bird/android/model/FlightBanner;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a:\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006 \u0007*\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/FlightBannerNode;",
        "it",
        "Lkotlin/Triple;",
        "Lco/bird/android/model/FlightBannerNode$FlightBanner;",
        "Landroid/view/View;",
        "Lco/bird/android/model/FlightBanner;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/buava/Optional;)Lkotlin/Triple;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFlightBannerCoordinatorPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightBannerCoordinatorPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/FlightBannerCoordinatorPresenterImpl$onCreate$2\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n*L\n1#1,498:1\n41#2:499\n*S KotlinDebug\n*F\n+ 1 FlightBannerCoordinatorPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/FlightBannerCoordinatorPresenterImpl$onCreate$2\n*L\n426#1:499\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lfs1;


# direct methods
.method public constructor <init>(Lfs1;)V
    .locals 0

    iput-object p1, p0, Lfs1$p;->g:Lfs1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)Lkotlin/Triple;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/FlightBannerNode;",
            ">;)",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/FlightBannerNode$FlightBanner;",
            "Landroid/view/View;",
            "Lco/bird/android/model/FlightBanner;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/FlightBannerNode;

    invoke-virtual {p1}, Lco/bird/android/model/FlightBannerNode;->getView()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    iget-object v1, p0, Lfs1$p;->g:Lfs1;

    invoke-static {v1}, Lfs1;->access$getContext$p(Lfs1;)Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1}, Lco/bird/android/model/FlightBannerNode;->getPresenterFactory()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v0}, Lcom/uber/autodispose/android/ViewScopeProvider;->a(Landroid/view/View;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v2

    const-string v3, "ViewScopeProvider.from(this)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/FlightBanner;

    new-instance v2, Lkotlin/Triple;

    invoke-virtual {p1}, Lco/bird/android/model/FlightBannerNode;->getBanner()Lco/bird/android/model/FlightBannerNode$FlightBanner;

    move-result-object p1

    invoke-direct {v2, p1, v0, v1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v2, Lkotlin/Triple;

    const/4 p1, 0x0

    invoke-direct {v2, p1, p1, p1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, Lfs1$p;->a(Lco/bird/android/buava/Optional;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method
