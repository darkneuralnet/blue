.class public final Li25$f1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->Q5(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LfM2;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LfM2;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "invoke",
        "(LfM2;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$f1;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LfM2;

    invoke-virtual {p0, p1}, Li25$f1;->invoke(LfM2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LfM2;)V
    .locals 1

    iget-object p1, p0, Li25$f1;->g:Li25;

    invoke-static {p1}, Li25;->access$deselectCurrentBird(Li25;)V

    iget-object p1, p0, Li25$f1;->g:Li25;

    invoke-static {p1}, Li25;->access$getFlightBannerCoordinatorPresenter$p(Li25;)LZr1;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/FlightBannerNode$FlightBanner;->RESERVATION_BEFORE:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {p1, v0}, LZr1;->N1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    return-void
.end method
