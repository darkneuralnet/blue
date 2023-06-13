.class public final Lsu3$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsu3;->W()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/BirdLocations;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/BirdLocations;",
        "kotlin.jvm.PlatformType",
        "locations",
        "",
        "a",
        "(Lco/bird/android/model/BirdLocations;)V"
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
        "SMAP\nOperatorSupplementMapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSupplementMapPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorSupplementMapPresenterImpl$loadOtherPossibleLocations$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1#2:422\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lsu3;


# direct methods
.method public constructor <init>(Lsu3;)V
    .locals 0

    iput-object p1, p0, Lsu3$k;->g:Lsu3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/BirdLocations;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/BirdLocations;->getLocations()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p0, Lsu3$k;->g:Lsu3;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lsu3;->access$showNoOtherLocationWarning(Lsu3;Z)V

    invoke-static {v1}, Lsu3;->access$getPossibleLocations$p(Lsu3;)La94;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/BirdLocations;->getLocations()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v2, p1}, La94;->accept(Ljava/lang/Object;)V

    invoke-static {v1}, Lsu3;->access$updateInfoBannerToShowBirdCode(Lsu3;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    if-nez v1, :cond_2

    iget-object p1, p0, Lsu3$k;->g:Lsu3;

    invoke-static {p1, v0}, Lsu3;->access$showNoOtherLocationWarning(Lsu3;Z)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/BirdLocations;

    invoke-virtual {p0, p1}, Lsu3$k;->a(Lco/bird/android/model/BirdLocations;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
