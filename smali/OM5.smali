.class public final LOM5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;
.implements LFP5;
.implements Lkotlin/jvm/internal/markers/KMutableMap;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOM5$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Map<",
        "TK;TV;>;",
        "LFP5;",
        "Lkotlin/jvm/internal/markers/KMutableMap;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010$\n\u0002\u0008\n\n\u0002\u0010#\n\u0002\u0010\'\n\u0002\u0008\u0006\n\u0002\u0010\u001f\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00020\u0004:\u0001\"B\u0007\u00a2\u0006\u0004\u00088\u00106J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0008\u0010\u0010\u001a\u00020\nH\u0016J\u0008\u0010\u0011\u001a\u00020\u0007H\u0016J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\u00020\u00072\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0008\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u0001H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u000cR$\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00058\u0016@RX\u0096\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR,\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 0\u001f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010!\u001a\u0004\u0008\"\u0010#R \u0010&\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008%\u0010!\u001a\u0004\u0008\u001a\u0010#R \u0010,\u001a\u0008\u0012\u0004\u0012\u00028\u00010\'8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/R\u0014\u00101\u001a\u00020-8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010/R&\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001028@X\u0080\u0004\u00a2\u0006\u000c\u0012\u0004\u00085\u00106\u001a\u0004\u00083\u00104\u00a8\u00069"
    }
    d2 = {
        "LOM5;",
        "K",
        "V",
        "",
        "LFP5;",
        "LHP5;",
        "value",
        "",
        "c",
        "key",
        "",
        "containsKey",
        "(Ljava/lang/Object;)Z",
        "containsValue",
        "get",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "isEmpty",
        "clear",
        "put",
        "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "",
        "from",
        "putAll",
        "remove",
        "j",
        "<set-?>",
        "b",
        "LHP5;",
        "h",
        "()LHP5;",
        "firstStateRecord",
        "",
        "",
        "Ljava/util/Set;",
        "a",
        "()Ljava/util/Set;",
        "entries",
        "d",
        "keys",
        "",
        "e",
        "Ljava/util/Collection;",
        "i",
        "()Ljava/util/Collection;",
        "values",
        "",
        "g",
        "()I",
        "size",
        "modification",
        "LOM5$a;",
        "f",
        "()LOM5$a;",
        "getReadable$runtime_release$annotations",
        "()V",
        "readable",
        "<init>",
        "runtime_release"
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
        "SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n154#1:361\n121#1:362\n155#1,2:364\n125#1:366\n157#1,3:373\n162#1:379\n129#1,4:380\n133#1:385\n121#1:386\n134#1,7:388\n125#1:395\n141#1,6:401\n149#1,3:410\n129#1,4:413\n133#1:418\n121#1:419\n134#1,7:421\n125#1:428\n141#1,6:434\n149#1,3:443\n129#1,4:446\n133#1:451\n121#1:452\n134#1,7:454\n125#1:461\n141#1,6:467\n149#1,3:476\n129#1,4:482\n133#1:487\n121#1:488\n134#1,7:490\n125#1:497\n141#1,6:503\n149#1,3:512\n121#1:515\n121#1:528\n125#1:530\n121#1:541\n125#1:543\n2180#2:363\n2073#2,2:367\n1686#2:369\n2075#2,2:371\n2077#2,3:376\n2180#2:387\n2073#2,2:396\n1686#2:398\n2075#2,2:399\n2077#2,3:407\n2180#2:420\n2073#2,2:429\n1686#2:431\n2075#2,2:432\n2077#2,3:440\n2180#2:453\n2073#2,2:462\n1686#2:464\n2075#2,2:465\n2077#2,3:473\n2180#2:489\n2073#2,2:498\n1686#2:500\n2075#2,2:501\n2077#2,3:509\n2180#2:516\n2180#2:517\n2073#2,2:518\n1686#2:520\n2075#2,5:522\n2180#2:529\n2073#2,2:531\n1686#2:533\n2075#2,2:535\n2077#2,3:538\n2180#2:542\n2073#2,2:544\n1686#2:546\n2075#2,2:548\n2077#2,3:551\n70#3:370\n70#3:384\n70#3:417\n70#3:450\n70#3:486\n70#3:521\n70#3:527\n70#3:534\n70#3:537\n70#3:547\n70#3:550\n288#4,2:479\n1#5:481\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n69#1:361\n69#1:362\n69#1:364,2\n69#1:366\n69#1:373,3\n69#1:379\n70#1:380,4\n70#1:385\n70#1:386\n70#1:388,7\n70#1:395\n70#1:401,6\n70#1:410,3\n71#1:413,4\n71#1:418\n71#1:419\n71#1:421,7\n71#1:428\n71#1:434,6\n71#1:443,3\n72#1:446,4\n72#1:451\n72#1:452\n72#1:454,7\n72#1:461\n72#1:467,6\n72#1:476,3\n85#1:482,4\n85#1:487\n85#1:488\n85#1:490,7\n85#1:497\n85#1:503,6\n85#1:512,3\n117#1:515\n133#1:528\n140#1:530\n154#1:541\n156#1:543\n69#1:363\n69#1:367,2\n69#1:369\n69#1:371,2\n69#1:376,3\n70#1:387\n70#1:396,2\n70#1:398\n70#1:399,2\n70#1:407,3\n71#1:420\n71#1:429,2\n71#1:431\n71#1:432,2\n71#1:440,3\n72#1:453\n72#1:462,2\n72#1:464\n72#1:465,2\n72#1:473,3\n85#1:489\n85#1:498,2\n85#1:500\n85#1:501,2\n85#1:509,3\n117#1:516\n121#1:517\n125#1:518,2\n125#1:520\n125#1:522,5\n133#1:529\n140#1:531,2\n140#1:533\n140#1:535,2\n140#1:538,3\n154#1:542\n156#1:544,2\n156#1:546\n156#1:548,2\n156#1:551,3\n69#1:370\n70#1:384\n71#1:417\n72#1:450\n85#1:486\n125#1:521\n132#1:527\n140#1:534\n141#1:537\n156#1:547\n157#1:550\n77#1:479,2\n*E\n"
    }
.end annotation


# instance fields
.field public b:LHP5;

.field public final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LOM5$a;

    invoke-static {}, LMi1;->a()LFR3;

    move-result-object v1

    invoke-direct {v0, v1}, LOM5$a;-><init>(LFR3;)V

    iput-object v0, p0, LOM5;->b:LHP5;

    new-instance v0, LyM5;

    invoke-direct {v0, p0}, LyM5;-><init>(LOM5;)V

    iput-object v0, p0, LOM5;->c:Ljava/util/Set;

    new-instance v0, LzM5;

    invoke-direct {v0, p0}, LzM5;-><init>(LOM5;)V

    iput-object v0, p0, LOM5;->d:Ljava/util/Set;

    new-instance v0, LBM5;

    invoke-direct {v0, p0}, LBM5;-><init>(LOM5;)V

    iput-object v0, p0, LOM5;->e:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, LOM5;->c:Ljava/util/Set;

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, LOM5;->d:Ljava/util/Set;

    return-object v0
.end method

.method public c(LHP5;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LOM5$a;

    iput-object p1, p0, LOM5;->b:LHP5;

    return-void
.end method

.method public clear()V
    .locals 5

    invoke-virtual {p0}, LOM5;->h()LHP5;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LOM5$a;

    invoke-static {v0}, LxM5;->B(LHP5;)LHP5;

    move-result-object v0

    check-cast v0, LOM5$a;

    invoke-virtual {v0}, LOM5$a;->g()LFR3;

    invoke-static {}, LMi1;->a()LFR3;

    move-result-object v1

    invoke-virtual {v0}, LOM5$a;->g()LFR3;

    move-result-object v0

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, LOM5;->h()LHP5;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LOM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    sget-object v3, LsM5;->e:LsM5$a;

    invoke-virtual {v3}, LsM5$a;->b()LsM5;

    move-result-object v3

    invoke-static {v0, p0, v3}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v0

    check-cast v0, LOM5$a;

    invoke-static {}, LPM5;->a()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v0, v1}, LOM5$a;->i(LFR3;)V

    invoke-virtual {v0}, LOM5$a;->h()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, LOM5$a;->j(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v2

    invoke-static {v3, p0}, LxM5;->M(LsM5;LFP5;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v4

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, LOM5;->f()LOM5$a;

    move-result-object v0

    invoke-virtual {v0}, LOM5$a;->g()LFR3;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, LOM5;->f()LOM5$a;

    move-result-object v0

    invoke-virtual {v0}, LOM5$a;->g()LFR3;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final d()I
    .locals 1

    invoke-virtual {p0}, LOM5;->f()LOM5$a;

    move-result-object v0

    invoke-virtual {v0}, LOM5$a;->h()I

    move-result v0

    return v0
.end method

.method public final bridge entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, LOM5;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final f()LOM5$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LOM5$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, LOM5;->h()LHP5;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LOM5$a;

    invoke-static {v0, p0}, LxM5;->S(LHP5;LFP5;)LHP5;

    move-result-object v0

    check-cast v0, LOM5$a;

    return-object v0
.end method

.method public g()I
    .locals 1

    invoke-virtual {p0}, LOM5;->f()LOM5$a;

    move-result-object v0

    invoke-virtual {v0}, LOM5$a;->g()LFR3;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    invoke-virtual {p0}, LOM5;->f()LOM5$a;

    move-result-object v0

    invoke-virtual {v0}, LOM5$a;->g()LFR3;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h()LHP5;
    .locals 1

    iget-object v0, p0, LOM5;->b:LHP5;

    return-object v0
.end method

.method public i()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, LOM5;->e:Ljava/util/Collection;

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, LOM5;->f()LOM5$a;

    move-result-object v0

    invoke-virtual {v0}, LOM5$a;->g()LFR3;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final j(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    invoke-virtual {p0}, LOM5;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LOM5;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final bridge keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    invoke-virtual {p0}, LOM5;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    :cond_0
    invoke-static {}, LPM5;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LOM5;->h()LHP5;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LOM5$a;

    invoke-static {v1}, LxM5;->B(LHP5;)LHP5;

    move-result-object v1

    check-cast v1, LOM5$a;

    invoke-virtual {v1}, LOM5$a;->g()LFR3;

    move-result-object v2

    invoke-virtual {v1}, LOM5$a;->h()I

    move-result v1

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2}, LFR3;->builder()LFR3$a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, LFR3$a;->build()LFR3;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, LOM5;->h()LHP5;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LOM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, LsM5;->e:LsM5$a;

    invoke-virtual {v5}, LsM5$a;->b()LsM5;

    move-result-object v5

    invoke-static {v2, p0, v5}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v2

    check-cast v2, LOM5$a;

    invoke-static {}, LPM5;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, LOM5$a;->h()I

    move-result v7

    if-ne v7, v1, :cond_1

    invoke-virtual {v2, v0}, LOM5$a;->i(LFR3;)V

    invoke-virtual {v2}, LOM5$a;->h()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-virtual {v2, v0}, LOM5$a;->j(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, LxM5;->M(LsM5;LFP5;)V

    if-eqz v1, :cond_0

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v4

    throw p1

    :cond_2
    :goto_1
    return-object v3

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    const-string v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-static {}, LPM5;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LOM5;->h()LHP5;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LOM5$a;

    invoke-static {v1}, LxM5;->B(LHP5;)LHP5;

    move-result-object v1

    check-cast v1, LOM5$a;

    invoke-virtual {v1}, LOM5$a;->g()LFR3;

    move-result-object v2

    invoke-virtual {v1}, LOM5$a;->h()I

    move-result v1

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2}, LFR3;->builder()LFR3$a;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-interface {v0}, LFR3$a;->build()LFR3;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, LOM5;->h()LHP5;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LOM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    :try_start_1
    sget-object v4, LsM5;->e:LsM5$a;

    invoke-virtual {v4}, LsM5$a;->b()LsM5;

    move-result-object v4

    invoke-static {v2, p0, v4}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v2

    check-cast v2, LOM5$a;

    invoke-static {}, LPM5;->a()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, LOM5$a;->h()I

    move-result v6

    if-ne v6, v1, :cond_1

    invoke-virtual {v2, v0}, LOM5$a;->i(LFR3;)V

    invoke-virtual {v2}, LOM5$a;->h()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-virtual {v2, v0}, LOM5$a;->j(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v3

    invoke-static {v4, p0}, LxM5;->M(LsM5;LFP5;)V

    if-eqz v1, :cond_0

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v5

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v3

    throw p1

    :cond_2
    :goto_1
    return-void

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    :cond_0
    invoke-static {}, LPM5;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LOM5;->h()LHP5;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LOM5$a;

    invoke-static {v1}, LxM5;->B(LHP5;)LHP5;

    move-result-object v1

    check-cast v1, LOM5$a;

    invoke-virtual {v1}, LOM5$a;->g()LFR3;

    move-result-object v2

    invoke-virtual {v1}, LOM5$a;->h()I

    move-result v1

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2}, LFR3;->builder()LFR3$a;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, LFR3$a;->build()LFR3;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, LOM5;->h()LHP5;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LOM5$a;

    invoke-static {}, LxM5;->F()LsM5;

    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    :try_start_1
    sget-object v5, LsM5;->e:LsM5$a;

    invoke-virtual {v5}, LsM5$a;->b()LsM5;

    move-result-object v5

    invoke-static {v2, p0, v5}, LxM5;->c0(LHP5;LFP5;LsM5;)LHP5;

    move-result-object v2

    check-cast v2, LOM5$a;

    invoke-static {}, LPM5;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, LOM5$a;->h()I

    move-result v7

    if-ne v7, v1, :cond_1

    invoke-virtual {v2, v0}, LOM5$a;->i(LFR3;)V

    invoke-virtual {v2}, LOM5$a;->h()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-virtual {v2, v0}, LOM5$a;->j(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v4

    invoke-static {v5, p0}, LxM5;->M(LsM5;LFP5;)V

    if-eqz v1, :cond_0

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v6

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v4

    throw p1

    :cond_2
    :goto_1
    return-object v3

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, LOM5;->g()I

    move-result v0

    return v0
.end method

.method public final bridge values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, LOM5;->i()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
