.class public final Lz43;
.super LCX2;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u0006\u001a\u00020\u0002H\u0002R\u0017\u0010\u000b\u001a\u00020\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lz43;",
        "LCX2;",
        "",
        "d",
        "LtM5;",
        "A",
        "Q",
        "n",
        "LCX2;",
        "getParent",
        "()LCX2;",
        "parent",
        "",
        "o",
        "Z",
        "deactivated",
        "",
        "id",
        "LvM5;",
        "invalid",
        "Lkotlin/Function1;",
        "",
        "readObserver",
        "writeObserver",
        "<init>",
        "(ILvM5;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LCX2;)V",
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
        "SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n*L\n1390#1:2192\n1390#1:2193\n*E\n"
    }
.end annotation


# instance fields
.field public final n:LCX2;

.field public o:Z


# direct methods
.method public constructor <init>(ILvM5;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LCX2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LvM5;",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;",
            "LCX2;",
            ")V"
        }
    .end annotation

    const-string v0, "invalid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, LCX2;-><init>(ILvM5;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    iput-object p5, p0, Lz43;->n:LCX2;

    invoke-virtual {p5, p0}, LCX2;->l(LsM5;)V

    return-void
.end method


# virtual methods
.method public A()LtM5;
    .locals 6

    iget-object v0, p0, Lz43;->n:LCX2;

    invoke-virtual {v0}, LCX2;->B()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lz43;->n:LCX2;

    invoke-virtual {v0}, LsM5;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, LCX2;->C()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, LsM5;->f()I

    move-result v1

    if-eqz v0, :cond_1

    iget-object v2, p0, Lz43;->n:LCX2;

    invoke-virtual {v2}, LsM5;->g()LvM5;

    move-result-object v3

    invoke-static {v2, p0, v3}, LxM5;->m(LCX2;LCX2;LvM5;)Ljava/util/Map;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {}, LxM5;->E()Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    :try_start_0
    invoke-static {p0}, LxM5;->v(LsM5;)V

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    iget-object v4, p0, Lz43;->n:LCX2;

    invoke-virtual {v4}, LsM5;->f()I

    move-result v4

    iget-object v5, p0, Lz43;->n:LCX2;

    invoke-virtual {v5}, LsM5;->g()LvM5;

    move-result-object v5

    invoke-virtual {p0, v4, v2, v5}, LCX2;->F(ILjava/util/Map;LvM5;)LtM5;

    move-result-object v2

    sget-object v4, LtM5$b;->a:LtM5$b;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_3

    monitor-exit v3

    return-object v2

    :cond_3
    :try_start_1
    iget-object v2, p0, Lz43;->n:LCX2;

    invoke-virtual {v2}, LCX2;->C()Ljava/util/Set;

    move-result-object v2

    if-nez v2, :cond_4

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iget-object v4, p0, Lz43;->n:LCX2;

    invoke-virtual {v4, v2}, LCX2;->M(Ljava/util/Set;)V

    :cond_4
    invoke-interface {v2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_5
    :goto_1
    invoke-virtual {p0}, LsM5;->b()V

    :goto_2
    iget-object v0, p0, Lz43;->n:LCX2;

    invoke-virtual {v0}, LsM5;->f()I

    move-result v0

    if-ge v0, v1, :cond_6

    iget-object v0, p0, Lz43;->n:LCX2;

    invoke-virtual {v0}, LCX2;->z()V

    :cond_6
    iget-object v0, p0, Lz43;->n:LCX2;

    invoke-virtual {v0}, LsM5;->g()LvM5;

    move-result-object v2

    invoke-virtual {v2, v1}, LvM5;->j(I)LvM5;

    move-result-object v2

    invoke-virtual {p0}, LCX2;->D()LvM5;

    move-result-object v4

    invoke-virtual {v2, v4}, LvM5;->h(LvM5;)LvM5;

    move-result-object v2

    invoke-virtual {v0, v2}, LsM5;->u(LvM5;)V

    iget-object v0, p0, Lz43;->n:LCX2;

    invoke-virtual {v0, v1}, LCX2;->G(I)V

    iget-object v0, p0, Lz43;->n:LCX2;

    invoke-virtual {p0}, LsM5;->w()I

    move-result v1

    invoke-virtual {v0, v1}, LCX2;->I(I)V

    iget-object v0, p0, Lz43;->n:LCX2;

    invoke-virtual {p0}, LCX2;->D()LvM5;

    move-result-object v1

    invoke-virtual {v0, v1}, LCX2;->H(LvM5;)V

    iget-object v0, p0, Lz43;->n:LCX2;

    invoke-virtual {p0}, LCX2;->E()[I

    move-result-object v1

    invoke-virtual {v0, v1}, LCX2;->J([I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LCX2;->L(Z)V

    invoke-virtual {p0}, Lz43;->Q()V

    sget-object v0, LtM5$b;->a:LtM5$b;

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v3

    throw v0

    :cond_7
    :goto_3
    new-instance v0, LtM5$a;

    invoke-direct {v0, p0}, LtM5$a;-><init>(LsM5;)V

    return-object v0
.end method

.method public final Q()V
    .locals 1

    iget-boolean v0, p0, Lz43;->o:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz43;->o:Z

    iget-object v0, p0, Lz43;->n:LCX2;

    invoke-virtual {v0, p0}, LCX2;->m(LsM5;)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    invoke-virtual {p0}, LsM5;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0}, LCX2;->d()V

    invoke-virtual {p0}, Lz43;->Q()V

    :cond_0
    return-void
.end method
