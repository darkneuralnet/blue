.class public final LlA1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0010\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireTierView;",
        "",
        "LDz1$a;",
        "a",
        "frequent-flyer_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFrequentFlyerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrequentFlyerPresenter.kt\nco/bird/android/feature/frequentFlyer/FrequentFlyerPresenterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1549#2:93\n1620#2,3:94\n*S KotlinDebug\n*F\n+ 1 FrequentFlyerPresenter.kt\nco/bird/android/feature/frequentFlyer/FrequentFlyerPresenterKt\n*L\n90#1:93\n90#1:94,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireTierView;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireTierView;",
            ")",
            "Ljava/util/List<",
            "LDz1$a;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTierView;->getBenefits()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireBenefit;

    new-instance v3, LDz1$a;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireTierView;->getTier()I

    move-result v4

    invoke-direct {v3, v4, v2}, LDz1$a;-><init>(ILco/bird/android/model/wire/WireBenefit;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method
