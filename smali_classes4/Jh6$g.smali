.class public final LJh6$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJh6;->i0(Ljava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/CollectionResponse<",
        "Lco/bird/android/model/Balance;",
        ">;",
        "Ljava/util/Map<",
        "Ljava/util/Currency;",
        "+",
        "Lco/bird/android/model/Balance;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/api/response/CollectionResponse;",
        "Lco/bird/android/model/Balance;",
        "balanceResponse",
        "",
        "Ljava/util/Currency;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/CollectionResponse;)Ljava/util/Map;"
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
        "SMAP\nUserManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserManagerImpl.kt\nco/bird/android/manager/user/UserManagerImpl$fetchBalance$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,449:1\n1194#2,2:450\n1222#2,4:452\n*S KotlinDebug\n*F\n+ 1 UserManagerImpl.kt\nco/bird/android/manager/user/UserManagerImpl$fetchBalance$1\n*L\n236#1:450,2\n236#1:452,4\n*E\n"
    }
.end annotation


# static fields
.field public static final g:LJh6$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LJh6$g;

    invoke-direct {v0}, LJh6$g;-><init>()V

    sput-object v0, LJh6$g;->g:LJh6$g;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/CollectionResponse;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/CollectionResponse<",
            "Lco/bird/android/model/Balance;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/util/Currency;",
            "Lco/bird/android/model/Balance;",
            ">;"
        }
    .end annotation

    const-string v0, "balanceResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/CollectionResponse;->getItems()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lco/bird/android/model/Balance;

    invoke-virtual {v2}, Lco/bird/android/model/Balance;->getCurrency()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/CollectionResponse;

    invoke-virtual {p0, p1}, LJh6$g;->a(Lco/bird/api/response/CollectionResponse;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
