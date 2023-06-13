.class public final LpF5$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LpF5;->e(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Integer;)Lio/reactivex/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LZ21<",
        "LYl5;",
        ">;",
        "Ljava/util/List<",
        "+",
        "LsE5;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LZ21;",
        "LYl5;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "LsE5;",
        "a",
        "(LZ21;)Ljava/util/List;"
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
        "SMAP\nSmartLockManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartLockManagerImpl.kt\nco/bird/android/smartlock/impl/SmartLockManagerImpl$scan$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,369:1\n1603#2,9:370\n1855#2:379\n1856#2:382\n1612#2:383\n1#3:380\n1#3:381\n*S KotlinDebug\n*F\n+ 1 SmartLockManagerImpl.kt\nco/bird/android/smartlock/impl/SmartLockManagerImpl$scan$1\n*L\n92#1:370,9\n92#1:379\n92#1:382\n92#1:383\n92#1:381\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LpF5;

.field public final synthetic h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LCF5;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(LpF5;Ljava/util/Set;Ljava/util/Set;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LpF5;",
            "Ljava/util/Set<",
            "+",
            "LCF5;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LpF5$j;->g:LpF5;

    iput-object p2, p0, LpF5$j;->h:Ljava/util/Set;

    iput-object p3, p0, LpF5$j;->i:Ljava/util/Set;

    iput-object p4, p0, LpF5$j;->j:Ljava/lang/Integer;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LZ21;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ21<",
            "LYl5;",
            ">;)",
            "Ljava/util/List<",
            "LsE5;",
            ">;"
        }
    .end annotation

    instance-of v0, p1, LAT5;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LAT5;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    const/4 v0, 0x1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, LAT5;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYl5;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, LYl5;->b()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_8

    check-cast p1, Ljava/lang/Iterable;

    iget-object v2, p0, LpF5$j;->h:Ljava/util/Set;

    iget-object v3, p0, LpF5$j;->i:Ljava/util/Set;

    iget-object v4, p0, LpF5$j;->j:Ljava/lang/Integer;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/bluetooth/model/ScannedDevice;

    const/4 v7, 0x0

    invoke-static {v6, v7, v0, v1}, LtF5;->toSmartLock$default(Lco/bird/android/bluetooth/model/ScannedDevice;ZILjava/lang/Object;)LsE5;

    move-result-object v6

    if-eqz v6, :cond_6

    if-eqz v2, :cond_3

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    xor-int/2addr v8, v0

    if-eqz v8, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object v8, v1

    :goto_2
    if-eqz v8, :cond_3

    invoke-virtual {v6}, LsE5;->m()LCF5;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    move v8, v0

    goto :goto_3

    :cond_3
    move v8, v7

    :goto_3
    if-nez v8, :cond_6

    if-eqz v3, :cond_5

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    xor-int/2addr v8, v0

    if-eqz v8, :cond_4

    move-object v8, v3

    goto :goto_4

    :cond_4
    move-object v8, v1

    :goto_4
    if-eqz v8, :cond_5

    invoke-virtual {v6}, LsE5;->f()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    move v7, v0

    :cond_5
    if-nez v7, :cond_6

    if-eqz v4, :cond_7

    invoke-virtual {v6}, LsE5;->j()Lco/bird/android/bluetooth/model/ScannedDevice;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/bluetooth/model/ScannedDevice;->d()I

    move-result v7

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ge v7, v8, :cond_7

    :cond_6
    move-object v6, v1

    :cond_7
    if-eqz v6, :cond_1

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    move-object v5, v1

    :cond_9
    if-eqz v5, :cond_b

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v0

    if-eqz p1, :cond_a

    goto :goto_5

    :cond_a
    move-object v5, v1

    :goto_5
    if-eqz v5, :cond_b

    iget-object p1, p0, LpF5$j;->g:LpF5;

    invoke-static {p1, v5}, LpF5;->access$updateSmartLockScanEvents(LpF5;Ljava/util/List;)V

    move-object v1, v5

    :cond_b
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ21;

    invoke-virtual {p0, p1}, LpF5$j;->a(LZ21;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
