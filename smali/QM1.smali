.class public final LQM1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ)\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cJ\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\u0007R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "LQM1;",
        "",
        "LiX3;",
        "pointerId",
        "",
        "LrX3;",
        "pointerInputNodes",
        "",
        "a",
        "(JLjava/util/List;)V",
        "Lt62;",
        "internalPointerEvent",
        "",
        "isInBounds",
        "b",
        "c",
        "d",
        "Lnm2;",
        "Lnm2;",
        "rootCoordinates",
        "LR83;",
        "LR83;",
        "getRoot$ui_release",
        "()LR83;",
        "root",
        "<init>",
        "(Lnm2;)V",
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
        "SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,538:1\n366#2,12:539\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n61#1:539,12\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lnm2;

.field public final b:LR83;


# direct methods
.method public constructor <init>(Lnm2;)V
    .locals 1

    const-string v0, "rootCoordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQM1;->a:Lnm2;

    new-instance p1, LR83;

    invoke-direct {p1}, LR83;-><init>()V

    iput-object p1, p0, LQM1;->b:LR83;

    return-void
.end method


# virtual methods
.method public final a(JLjava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "LrX3;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pointerInputNodes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQM1;->b:LR83;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_6

    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LrX3;

    if-eqz v2, :cond_5

    invoke-virtual {v0}, LR83;->g()LLX2;

    move-result-object v6

    invoke-virtual {v6}, LLX2;->u()I

    move-result v7

    if-lez v7, :cond_2

    invoke-virtual {v6}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v6

    move v8, v3

    :cond_0
    aget-object v9, v6, v8

    move-object v10, v9

    check-cast v10, LE83;

    invoke-virtual {v10}, LE83;->k()LrX3;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v8, v8, 0x1

    if-lt v8, v7, :cond_0

    :cond_2
    const/4 v9, 0x0

    :goto_1
    check-cast v9, LE83;

    if-eqz v9, :cond_4

    invoke-virtual {v9}, LE83;->m()V

    invoke-virtual {v9}, LE83;->j()LLX2;

    move-result-object v0

    invoke-static {p1, p2}, LiX3;->a(J)LiX3;

    move-result-object v5

    invoke-virtual {v0, v5}, LLX2;->j(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v9}, LE83;->j()LLX2;

    move-result-object v0

    invoke-static {p1, p2}, LiX3;->a(J)LiX3;

    move-result-object v5

    invoke-virtual {v0, v5}, LLX2;->b(Ljava/lang/Object;)Z

    :cond_3
    move-object v0, v9

    goto :goto_2

    :cond_4
    move v2, v3

    :cond_5
    new-instance v6, LE83;

    invoke-direct {v6, v5}, LE83;-><init>(LrX3;)V

    invoke-virtual {v6}, LE83;->j()LLX2;

    move-result-object v5

    invoke-static {p1, p2}, LiX3;->a(J)LiX3;

    move-result-object v7

    invoke-virtual {v5, v7}, LLX2;->b(Ljava/lang/Object;)Z

    invoke-virtual {v0}, LR83;->g()LLX2;

    move-result-object v0

    invoke-virtual {v0, v6}, LLX2;->b(Ljava/lang/Object;)Z

    move-object v0, v6

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method public final b(Lt62;Z)Z
    .locals 4

    const-string v0, "internalPointerEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQM1;->b:LR83;

    invoke-virtual {p1}, Lt62;->a()Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, LQM1;->a:Lnm2;

    invoke-virtual {v0, v1, v2, p1, p2}, LR83;->a(Ljava/util/Map;Lnm2;Lt62;Z)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LQM1;->b:LR83;

    invoke-virtual {p1}, Lt62;->a()Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, LQM1;->a:Lnm2;

    invoke-virtual {v0, v2, v3, p1, p2}, LR83;->f(Ljava/util/Map;Lnm2;Lt62;Z)Z

    move-result p2

    iget-object v0, p0, LQM1;->b:LR83;

    invoke-virtual {v0, p1}, LR83;->e(Lt62;)Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz p2, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, LQM1;->b:LR83;

    invoke-virtual {v0}, LR83;->d()V

    iget-object v0, p0, LQM1;->b:LR83;

    invoke-virtual {v0}, LR83;->c()V

    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, LQM1;->b:LR83;

    invoke-virtual {v0}, LR83;->h()V

    return-void
.end method
