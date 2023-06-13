.class public final LnX3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r\u00a2\u0006\u0004\u0008!\u0010\"J0\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0006\u0010\u000c\u001a\u00020\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006#"
    }
    d2 = {
        "LnX3;",
        "",
        "LlX3;",
        "pointerEvent",
        "LDY3;",
        "positionCalculator",
        "",
        "isInBounds",
        "LP64;",
        "a",
        "(LlX3;LDY3;Z)I",
        "",
        "b",
        "LJm2;",
        "LJm2;",
        "getRoot",
        "()LJm2;",
        "root",
        "LQM1;",
        "LQM1;",
        "hitPathTracker",
        "LkX3;",
        "c",
        "LkX3;",
        "pointerInputChangeEventProducer",
        "LRM1;",
        "LrX3;",
        "d",
        "LRM1;",
        "hitResult",
        "e",
        "Z",
        "isProcessing",
        "<init>",
        "(LJm2;)V",
        "ui_release"
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
        "SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,237:1\n1747#2,3:238\n1855#2,2:241\n1747#2,3:243\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessor\n*L\n78#1:238,3\n81#1:241,2\n104#1:243,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LJm2;

.field public final b:LQM1;

.field public final c:LkX3;

.field public final d:LRM1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRM1<",
            "LrX3;",
            ">;"
        }
    .end annotation
.end field

.field public e:Z


# direct methods
.method public constructor <init>(LJm2;)V
    .locals 1

    const-string v0, "root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LnX3;->a:LJm2;

    new-instance v0, LQM1;

    invoke-virtual {p1}, LJm2;->h()Lnm2;

    move-result-object p1

    invoke-direct {v0, p1}, LQM1;-><init>(Lnm2;)V

    iput-object v0, p0, LnX3;->b:LQM1;

    new-instance p1, LkX3;

    invoke-direct {p1}, LkX3;-><init>()V

    iput-object p1, p0, LnX3;->c:LkX3;

    new-instance p1, LRM1;

    invoke-direct {p1}, LRM1;-><init>()V

    iput-object p1, p0, LnX3;->d:LRM1;

    return-void
.end method


# virtual methods
.method public final a(LlX3;LDY3;Z)I
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "pointerEvent"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "positionCalculator"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v3, v1, LnX3;->e:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-static {v4, v4}, LoX3;->a(ZZ)I

    move-result v0

    return v0

    :cond_0
    const/4 v3, 0x1

    :try_start_0
    iput-boolean v3, v1, LnX3;->e:Z

    iget-object v5, v1, LnX3;->c:LkX3;

    invoke-virtual {v5, v0, v2}, LkX3;->b(LlX3;LDY3;)Lt62;

    move-result-object v0

    invoke-virtual {v0}, Lt62;->a()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    instance-of v5, v2, Ljava/util/Collection;

    if-eqz v5, :cond_2

    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_1
    move v2, v4

    goto :goto_2

    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LjX3;

    invoke-virtual {v5}, LjX3;->g()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v5}, LjX3;->j()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_0

    :cond_4
    move v5, v4

    goto :goto_1

    :cond_5
    :goto_0
    move v5, v3

    :goto_1
    if-eqz v5, :cond_3

    move v2, v3

    :goto_2
    if-nez v2, :cond_6

    move v2, v3

    goto :goto_3

    :cond_6
    move v2, v4

    :goto_3
    invoke-virtual {v0}, Lt62;->a()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LjX3;

    if-nez v2, :cond_8

    invoke-static {v6}, LZW3;->b(LjX3;)Z

    move-result v7

    if-eqz v7, :cond_7

    :cond_8
    invoke-virtual {v6}, LjX3;->l()I

    move-result v7

    sget-object v8, LyX3;->a:LyX3$a;

    invoke-virtual {v8}, LyX3$a;->d()I

    move-result v8

    invoke-static {v7, v8}, LyX3;->g(II)Z

    move-result v13

    iget-object v9, v1, LnX3;->a:LJm2;

    invoke-virtual {v6}, LjX3;->f()J

    move-result-wide v10

    iget-object v12, v1, LnX3;->d:LRM1;

    const/4 v14, 0x0

    const/16 v15, 0x8

    const/16 v16, 0x0

    invoke-static/range {v9 .. v16}, LJm2;->y0(LJm2;JLRM1;ZZILjava/lang/Object;)V

    iget-object v7, v1, LnX3;->d:LRM1;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    xor-int/2addr v7, v3

    if-eqz v7, :cond_7

    iget-object v7, v1, LnX3;->b:LQM1;

    invoke-virtual {v6}, LjX3;->e()J

    move-result-wide v8

    iget-object v6, v1, LnX3;->d:LRM1;

    invoke-virtual {v7, v8, v9, v6}, LQM1;->a(JLjava/util/List;)V

    iget-object v6, v1, LnX3;->d:LRM1;

    invoke-virtual {v6}, LRM1;->clear()V

    goto :goto_4

    :cond_9
    iget-object v2, v1, LnX3;->b:LQM1;

    invoke-virtual {v2}, LQM1;->d()V

    iget-object v2, v1, LnX3;->b:LQM1;

    move/from16 v5, p3

    invoke-virtual {v2, v0, v5}, LQM1;->b(Lt62;Z)Z

    move-result v2

    invoke-virtual {v0}, Lt62;->c()Z

    move-result v5

    if-eqz v5, :cond_b

    :cond_a
    :goto_5
    move v3, v4

    goto :goto_7

    :cond_b
    invoke-virtual {v0}, Lt62;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v5, v0, Ljava/util/Collection;

    if-eqz v5, :cond_c

    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_c

    goto :goto_5

    :cond_c
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LjX3;

    invoke-static {v5}, LZW3;->j(LjX3;)Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v5}, LjX3;->n()Z

    move-result v5

    if-eqz v5, :cond_e

    move v5, v3

    goto :goto_6

    :cond_e
    move v5, v4

    :goto_6
    if-eqz v5, :cond_d

    :goto_7
    invoke-static {v2, v3}, LoX3;->a(ZZ)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v4, v1, LnX3;->e:Z

    return v0

    :catchall_0
    move-exception v0

    iput-boolean v4, v1, LnX3;->e:Z

    throw v0
.end method

.method public final b()V
    .locals 1

    iget-boolean v0, p0, LnX3;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LnX3;->c:LkX3;

    invoke-virtual {v0}, LkX3;->a()V

    iget-object v0, p0, LnX3;->b:LQM1;

    invoke-virtual {v0}, LQM1;->c()V

    :cond_0
    return-void
.end method
