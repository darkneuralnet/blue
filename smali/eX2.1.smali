.class public final LeX2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFr5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\t\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0008\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u000cR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u00020\u0002*\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "LeX2;",
        "LFr5;",
        "",
        "a",
        "",
        "J",
        "getSelectableId",
        "()J",
        "selectableId",
        "Lkotlin/Function0;",
        "Lnm2;",
        "b",
        "Lkotlin/jvm/functions/Function0;",
        "coordinatesCallback",
        "Li26;",
        "c",
        "layoutResultCallback",
        "d",
        "Li26;",
        "_previousTextLayoutResult",
        "e",
        "I",
        "_previousLastVisibleOffset",
        "(Li26;)I",
        "lastVisibleOffset",
        "<init>",
        "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "foundation_release"
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
        "SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lnm2;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Li26;",
            ">;"
        }
    .end annotation
.end field

.field public d:Li26;

.field public e:I


# direct methods
.method public constructor <init>(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lnm2;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Li26;",
            ">;)V"
        }
    .end annotation

    const-string v0, "coordinatesCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutResultCallback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LeX2;->a:J

    iput-object p3, p0, LeX2;->b:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, LeX2;->c:Lkotlin/jvm/functions/Function0;

    const/4 p1, -0x1

    iput p1, p0, LeX2;->e:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, LeX2;->c:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li26;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0, v0}, LeX2;->b(Li26;)I

    move-result v0

    return v0
.end method

.method public final declared-synchronized b(Li26;)I
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LeX2;->d:Li26;

    if-eq v0, p1, :cond_3

    invoke-virtual {p1}, Li26;->e()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li26;->v()LRW2;

    move-result-object v0

    invoke-virtual {v0}, LRW2;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Li26;->A()J

    move-result-wide v2

    invoke-static {v2, v3}, LG52;->f(J)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Li26;->q(F)I

    move-result v0

    invoke-virtual {p1}, Li26;->m()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Li26;->u(I)F

    move-result v2

    invoke-virtual {p1}, Li26;->A()J

    move-result-wide v3

    invoke-static {v3, v4}, LG52;->f(J)I

    move-result v3

    int-to-float v3, v3

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_2

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p1}, Li26;->m()I

    move-result v0

    sub-int/2addr v0, v1

    :cond_2
    invoke-virtual {p1, v0, v1}, Li26;->n(IZ)I

    move-result v0

    iput v0, p0, LeX2;->e:I

    iput-object p1, p0, LeX2;->d:Li26;

    :cond_3
    iget p1, p0, LeX2;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
