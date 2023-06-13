.class public final LPQ$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPQ;-><init>(LoR;LTq4;LRh6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LZ84<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/BirdPlusView;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LZ84;",
        "",
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "invoke",
        "()LZ84;",
        "<anonymous>"
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
        "SMAP\nBirdPlusManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$availableBirdPlusViews$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n766#2:171\n857#2,2:172\n*S KotlinDebug\n*F\n+ 1 BirdPlusManagerImpl.kt\nco/bird/android/manager/ride/BirdPlusManagerImpl$availableBirdPlusViews$2\n*L\n53#1:171\n53#1:172,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LPQ;


# direct methods
.method public constructor <init>(LPQ;)V
    .locals 0

    iput-object p1, p0, LPQ$g;->g:LPQ;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LZ84;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LPQ$g;->g:LPQ;

    invoke-static {v0}, LPQ;->access$getBirdPlusesRelay$p(LPQ;)La94;

    move-result-object v0

    sget-object v1, LPQ$g$a;->g:LPQ$g$a;

    invoke-static {v0, v1}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, LZ84;->d:LZ84$a;

    iget-object v2, p0, LPQ$g;->g:LPQ;

    invoke-static {v2}, LPQ;->access$getBirdPlusesRelay$p(LPQ;)La94;

    move-result-object v2

    invoke-virtual {v2}, La94;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/BirdPlusView;->isAvailable()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v0, v3}, LZ84$a;->c(Lio/reactivex/Observable;Ljava/lang/Object;)LZ84;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LPQ$g;->invoke()LZ84;

    move-result-object v0

    return-object v0
.end method
