.class public final LIT4$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;-><init>(Landroid/content/Context;LNP4;LXW2;Lef6;LKn6;LpJ;LpM3;LTq4;LUz1;LpU4;LEa;LTo0;LV74;LEg1;LRh6;)V
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
        "Lco/bird/android/model/wire/WireBird;",
        ">;",
        "Lio/reactivex/B<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        "+",
        "Lco/bird/android/model/wire/configs/Config;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001aZ\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*,\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "birds",
        "Lio/reactivex/B;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/configs/Config;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/util/List;)Lio/reactivex/B;"
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
        "SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$9\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1626:1\n1549#2:1627\n1620#2,3:1628\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$9\n*L\n293#1:1627\n293#1:1628,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LIT4;


# direct methods
.method public constructor <init>(LIT4;)V
    .locals 0

    iput-object p1, p0, LIT4$r;->g:LIT4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LIT4$r;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/List;)Lio/reactivex/B;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)",
            "Lio/reactivex/B<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireBird;",
            "Lco/bird/android/model/wire/configs/Config;",
            ">;>;"
        }
    .end annotation

    const-string v0, "birds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, LIT4$r;->g:LIT4;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireBird;

    invoke-static {v0}, LIT4;->access$getReactiveConfig$p(LIT4;)LTq4;

    move-result-object v3

    invoke-static {v3, v2}, LUq4;->d(LTq4;Lco/bird/android/model/wire/WireBird;)Lio/reactivex/Observable;

    move-result-object v3

    new-instance v4, LIT4$r$a;

    invoke-direct {v4, v2}, LIT4$r$a;-><init>(Lco/bird/android/model/wire/WireBird;)V

    new-instance v2, LKT4;

    invoke-direct {v2, v4}, LKT4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lio/reactivex/rxkotlin/d;->a(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LIT4$r;->b(Ljava/util/List;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
