.class public final LgS$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LgS;->s(Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)Lio/reactivex/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lna4<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "count",
        "Lna4;",
        "",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/lang/Integer;)Lna4;"
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
        "SMAP\nBirdRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$streamOperatorMapNearby$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,296:1\n1549#2:297\n1620#2,3:298\n37#3,2:301\n*S KotlinDebug\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$streamOperatorMapNearby$1\n*L\n252#1:297\n252#1:298,3\n254#1:301,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LgS;

.field public final synthetic h:Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;


# direct methods
.method public constructor <init>(LgS;Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)V
    .locals 0

    iput-object p1, p0, LgS$m;->g:LgS;

    iput-object p2, p0, LgS$m;->h:Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LgS$m;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/Integer;)Lna4;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "Lna4<",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;>;"
        }
    .end annotation

    const-string v0, "count"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/k;->o0(Ljava/lang/Object;)Lio/reactivex/k;

    move-result-object p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    iget-object v1, p0, LgS$m;->g:LgS;

    iget-object v2, p0, LgS$m;->h:Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v4, v0

    check-cast v4, Lkotlin/collections/IntIterator;

    invoke-virtual {v4}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v4

    invoke-static {v1}, LgS;->access$getBirdMapMarkerDao$p(LgS;)LJM;

    move-result-object v5

    invoke-static {v1, v2}, LgS;->access$sha1(LgS;Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)Ljava/lang/String;

    move-result-object v6

    mul-int/lit8 v4, v4, 0x64

    invoke-virtual {v5, v6, v4}, LJM;->a(Ljava/lang/String;I)Lio/reactivex/k;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-array p1, p1, [Lio/reactivex/k;

    invoke-interface {v3, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lna4;

    sget-object v0, LgS$m$a;->g:LgS$m$a;

    new-instance v1, LoS;

    invoke-direct {v1, v0}, LoS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p1, v1}, Lio/reactivex/k;->m([Lna4;Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, LgS$m;->b(Ljava/lang/Integer;)Lna4;

    move-result-object p1

    return-object p1
.end method
