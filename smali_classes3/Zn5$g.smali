.class public final LZn5$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZn5;->c(Lco/bird/android/model/wire/WireBird;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/VehicleScrapRequest;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "scrapRequests",
        "",
        "Lco/bird/android/model/VehicleScrapRequest;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nScrapLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapLandingPresenter.kt\nco/bird/android/feature/scrap/landing/ScrapLandingPresenterImpl$onBirdIdentified$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n2333#2,14:112\n*S KotlinDebug\n*F\n+ 1 ScrapLandingPresenter.kt\nco/bird/android/feature/scrap/landing/ScrapLandingPresenterImpl$onBirdIdentified$3\n*L\n90#1:112,14\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LZn5;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(LZn5;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, LZn5$g;->g:LZn5;

    iput-object p2, p0, LZn5$g;->h:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LZn5$g;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/VehicleScrapRequest;",
            ">;)V"
        }
    .end annotation

    const-string v0, "scrapRequests"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    move-object p1, v0

    goto :goto_1

    :cond_1
    move-object v1, v0

    check-cast v1, Lco/bird/android/model/VehicleScrapRequest;

    invoke-virtual {v1}, Lco/bird/android/model/VehicleScrapRequest;->getUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/model/VehicleScrapRequest;

    invoke-virtual {v3}, Lco/bird/android/model/VehicleScrapRequest;->getUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v4

    if-lez v4, :cond_3

    move-object v0, v2

    move-object v1, v3

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :goto_1
    check-cast p1, Lco/bird/android/model/VehicleScrapRequest;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lco/bird/android/model/VehicleScrapRequest;->getReviewStatus()Lco/bird/android/model/constant/ScrapRequestReviewStatus;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/ScrapRequestReviewStatus;->REJECTED:Lco/bird/android/model/constant/ScrapRequestReviewStatus;

    if-ne v0, v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lco/bird/android/model/VehicleScrapRequest;->getReviewStatus()Lco/bird/android/model/constant/ScrapRequestReviewStatus;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/ScrapRequestReviewStatus;->PENDING:Lco/bird/android/model/constant/ScrapRequestReviewStatus;

    if-ne v0, v1, :cond_5

    iget-object p1, p0, LZn5$g;->g:LZn5;

    invoke-static {p1}, LZn5;->access$getUi$p(LZn5;)Lco5;

    move-result-object p1

    iget-object v0, p0, LZn5$g;->h:Lco/bird/android/model/wire/WireBird;

    invoke-interface {p1, v0}, Lco5;->Nb(Lco/bird/android/model/wire/WireBird;)V

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Lco/bird/android/model/VehicleScrapRequest;->getReviewStatus()Lco/bird/android/model/constant/ScrapRequestReviewStatus;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/constant/ScrapRequestReviewStatus;->APPROVED:Lco/bird/android/model/constant/ScrapRequestReviewStatus;

    if-ne p1, v0, :cond_7

    iget-object p1, p0, LZn5$g;->g:LZn5;

    invoke-static {p1}, LZn5;->access$getUi$p(LZn5;)Lco5;

    move-result-object p1

    iget-object v0, p0, LZn5$g;->h:Lco/bird/android/model/wire/WireBird;

    invoke-interface {p1, v0}, Lco5;->wk(Lco/bird/android/model/wire/WireBird;)V

    goto :goto_3

    :cond_6
    :goto_2
    iget-object v0, p0, LZn5$g;->g:LZn5;

    invoke-static {v0}, LZn5;->access$getNavigator$p(LZn5;)Le13;

    move-result-object v0

    iget-object v1, p0, LZn5$g;->h:Lco/bird/android/model/wire/WireBird;

    invoke-interface {v0, v1, p1}, Le13;->G3(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/VehicleScrapRequest;)V

    :cond_7
    :goto_3
    return-void
.end method
