.class public final LoG1$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoG1;->g(Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;Ljava/lang/String;)Lio/reactivex/Observable;
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
        "Lco/bird/android/model/persistence/UnidentifiedScanEntity;",
        ">;",
        "Ljava/util/List<",
        "+",
        "Lco/bird/api/request/HardCountCreateRequest;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/persistence/UnidentifiedScanEntity;",
        "unidentifiedScans",
        "Lco/bird/api/request/HardCountCreateRequest;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Ljava/util/List;"
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
        "SMAP\nHardCountManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountManagerImpl.kt\nco/bird/android/manager/hardcount/HardCountManagerImpl$streamCachedHardCountRequestByCategory$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,440:1\n1549#2:441\n1620#2,3:442\n*S KotlinDebug\n*F\n+ 1 HardCountManagerImpl.kt\nco/bird/android/manager/hardcount/HardCountManagerImpl$streamCachedHardCountRequestByCategory$2\n*L\n407#1:441\n407#1:442,3\n*E\n"
    }
.end annotation


# static fields
.field public static final g:LoG1$k;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LoG1$k;

    invoke-direct {v0}, LoG1$k;-><init>()V

    sput-object v0, LoG1$k;->g:LoG1$k;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/UnidentifiedScanEntity;",
            ">;)",
            "Ljava/util/List<",
            "Lco/bird/api/request/HardCountCreateRequest;",
            ">;"
        }
    .end annotation

    const-string v0, "unidentifiedScans"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/UnidentifiedScanEntity;

    new-instance v8, Lco/bird/api/request/HardCountCreateRequest;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/UnidentifiedScanEntity;->getHardCountId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lco/bird/android/model/persistence/UnidentifiedScanEntity;->getScanIdentifier()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lco/bird/api/request/HardCountCreateRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LoG1$k;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method