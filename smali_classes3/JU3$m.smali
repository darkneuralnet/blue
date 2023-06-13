.class public final LJU3$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJU3;-><init>(LEa;LiO;Lue3;LTq4;Le13;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireMerchantAction;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "site",
        "",
        "Lco/bird/android/model/wire/WireMerchantAction;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/util/List;"
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
        "SMAP\nPlaceInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl$listActionButtons$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,398:1\n766#2:399\n857#2,2:400\n1045#2:402\n*S KotlinDebug\n*F\n+ 1 PlaceInfoViewModel.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoViewModelImpl$listActionButtons$1\n*L\n354#1:399\n354#1:400,2\n355#1:402\n*E\n"
    }
.end annotation


# static fields
.field public static final g:LJU3$m;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LJU3$m;

    invoke-direct {v0}, LJU3$m;-><init>()V

    sput-object v0, LJU3$m;->g:LJU3$m;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            ")",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireMerchantAction;",
            ">;"
        }
    .end annotation

    const-string v0, "site"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getActions()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/wire/WireMerchantAction;

    invoke-static {v2}, Lco/bird/android/model/wire/WireMerchantSiteKt;->isList(Lco/bird/android/model/wire/WireMerchantAction;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p1, LJU3$m$a;

    invoke-direct {p1}, LJU3$m$a;-><init>()V

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireMerchantSite;

    invoke-virtual {p0, p1}, LJU3$m;->a(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
