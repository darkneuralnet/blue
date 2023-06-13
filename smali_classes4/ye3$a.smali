.class public final Lye3$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lye3;->b(Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/offer/WireCouponDeal;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/offer/WireCouponDeal;",
        "kotlin.jvm.PlatformType",
        "deal",
        "",
        "a",
        "(Lco/bird/android/model/offer/WireCouponDeal;)V"
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
        "SMAP\nOfferManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferManagerImpl.kt\nco/bird/android/manager/offer/OfferManagerImpl$acceptOffer$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n766#2:170\n857#2,2:171\n*S KotlinDebug\n*F\n+ 1 OfferManagerImpl.kt\nco/bird/android/manager/offer/OfferManagerImpl$acceptOffer$1\n*L\n142#1:170\n142#1:171,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lye3;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lye3;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lye3$a;->g:Lye3;

    iput-object p2, p0, Lye3$a;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/offer/WireCouponDeal;)V
    .locals 5

    iget-object v0, p0, Lye3$a;->g:Lye3;

    invoke-static {v0}, Lye3;->access$get_deals$p(Lye3;)LAG;

    move-result-object v0

    iget-object v1, p0, Lye3$a;->g:Lye3;

    invoke-static {v1}, Lye3;->access$get_deals$p(Lye3;)LAG;

    move-result-object v1

    invoke-virtual {v1}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Ljava/util/Collection;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Lye3$a;->g:Lye3;

    invoke-static {p1}, Lye3;->access$get_offers$p(Lye3;)LAG;

    move-result-object p1

    iget-object v0, p0, Lye3$a;->g:Lye3;

    invoke-static {v0}, Lye3;->access$get_offers$p(Lye3;)LAG;

    move-result-object v0

    invoke-virtual {v0}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lye3$a;->h:Ljava/lang/String;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lco/bird/android/model/offer/WireCouponOffer;

    invoke-virtual {v4}, Lco/bird/android/model/offer/WireCouponOffer;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v2}, LAG;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/offer/WireCouponDeal;

    invoke-virtual {p0, p1}, Lye3$a;->a(Lco/bird/android/model/offer/WireCouponDeal;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
