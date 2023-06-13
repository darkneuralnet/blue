.class public final Ljl2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh81;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljl2$a;,
        Ljl2$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lh81<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0010\u0017B\u0015\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000f\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016J,\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00010\r\"\u0008\u0008\u0001\u0010\n*\u00020\t2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0016R\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0018"
    }
    d2 = {
        "Ljl2;",
        "T",
        "Lh81;",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "Lvf;",
        "V",
        "Lwb6;",
        "converter",
        "Ltk6;",
        "f",
        "Ljl2$b;",
        "a",
        "Ljl2$b;",
        "getConfig",
        "()Ljl2$b;",
        "config",
        "<init>",
        "(Ljl2$b;)V",
        "b",
        "animation-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,651:1\n442#2:652\n392#2:653\n1238#3,4:654\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n496#1:652\n496#1:653\n496#1:654,4\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Ljl2$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljl2$b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljl2$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljl2$b<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljl2;->a:Ljl2$b;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lwb6;)Llk6;
    .locals 0

    invoke-virtual {p0, p1}, Ljl2;->f(Lwb6;)Ltk6;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Lwb6;)Lok6;
    .locals 0

    invoke-virtual {p0, p1}, Ljl2;->f(Lwb6;)Ltk6;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ljl2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljl2;->a:Ljl2$b;

    check-cast p1, Ljl2;

    iget-object p1, p1, Ljl2;->a:Ljl2$b;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f(Lwb6;)Ltk6;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Lvf;",
            ">(",
            "Lwb6<",
            "TT;TV;>;)",
            "Ltk6<",
            "TV;>;"
        }
    .end annotation

    const-string v0, "converter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljl2;->a:Ljl2$b;

    invoke-virtual {v0}, Ljl2$b;->d()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljl2$a;

    invoke-interface {p1}, Lwb6;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljl2$a;->b(Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ljl2;->a:Ljl2$b;

    invoke-virtual {p1}, Ljl2$b;->c()I

    move-result p1

    iget-object v0, p0, Ljl2;->a:Ljl2$b;

    invoke-virtual {v0}, Ljl2$b;->b()I

    move-result v0

    new-instance v2, Ltk6;

    invoke-direct {v2, v1, p1, v0}, Ltk6;-><init>(Ljava/util/Map;II)V

    return-object v2
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ljl2;->a:Ljl2$b;

    invoke-virtual {v0}, Ljl2$b;->hashCode()I

    move-result v0

    return v0
.end method
