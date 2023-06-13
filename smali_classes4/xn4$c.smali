.class public final Lxn4$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxn4;-><init>(LUI4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/util/Set<",
        "+TK;>;",
        "Ljava/util/Set<",
        "+TK;>;",
        "Ljava/util/Set<",
        "+TK;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0004\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "K",
        "",
        "oldLoadedIds",
        "newLoadedIds",
        "a",
        "(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;"
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
        "SMAP\nReactiveBitmapCacheImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveBitmapCacheImpl.kt\nco/bird/android/manager/media/ReactiveBitmapCacheImpl$mutableLoadedIds$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1855#2,2:68\n*S KotlinDebug\n*F\n+ 1 ReactiveBitmapCacheImpl.kt\nco/bird/android/manager/media/ReactiveBitmapCacheImpl$mutableLoadedIds$1\n*L\n25#1:68,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lxn4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxn4<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxn4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxn4<",
            "TK;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lxn4$c;->g:Lxn4;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+TK;>;",
            "Ljava/util/Set<",
            "+TK;>;)",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    const-string v0, "oldLoadedIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newLoadedIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxn4$c;->g:Lxn4;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v0}, Lxn4;->access$getMutableNewlyLoadedIds$p(Lxn4;)Lio/reactivex/subjects/d;

    move-result-object v3

    invoke-virtual {v3, v2}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    check-cast p2, Ljava/util/Set;

    invoke-virtual {p0, p1, p2}, Lxn4$c;->a(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
