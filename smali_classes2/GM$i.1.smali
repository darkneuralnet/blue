.class public final LGM$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGM;-><init>(LV74;LOh;LVK;Llj5;LdD1;LEa;Ljd0;Lq54;Ljava/lang/String;Ljava/lang/String;Ldr4;LAe5;LRR;LVL1;LxB1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;+",
        "Landroid/location/Location;",
        ">;",
        "Ljava/lang/Iterable<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        "+",
        "Landroid/location/Location;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0000\n\u0002\u0010\u001c\n\u0002\u0008\u0002\u0010\u0008\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0006*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000 \u0006**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0006*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000\u0018\u00010\u00070\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "Landroid/location/Location;",
        "<name for destructuring parameter 0>",
        "",
        "kotlin.jvm.PlatformType",
        "",
        "a",
        "(Lkotlin/Pair;)Ljava/lang/Iterable;"
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
        "SMAP\nBirdManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl$9\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,704:1\n1549#2:705\n1620#2,3:706\n*S KotlinDebug\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl$9\n*L\n172#1:705\n172#1:706,3\n*E\n"
    }
.end annotation


# static fields
.field public static final g:LGM$i;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LGM$i;

    invoke-direct {v0}, LGM$i;-><init>()V

    sput-object v0, LGM$i;->g:LGM$i;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;)Ljava/lang/Iterable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;+",
            "Landroid/location/Location;",
            ">;)",
            "Ljava/lang/Iterable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireBird;",
            "Landroid/location/Location;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/Location;

    const-string v1, "privateBirds"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

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

    check-cast v2, Lco/bird/android/model/wire/WireBird;

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LGM$i;->a(Lkotlin/Pair;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
