.class public final Lqo2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpo2;
.implements LRn2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008#\u0010$J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\n\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001R \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00038\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00030\u00198VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u001a\u00a8\u0006%"
    }
    d2 = {
        "Lqo2;",
        "Lpo2;",
        "LRn2;",
        "",
        "index",
        "",
        "f",
        "(ILEt0;I)V",
        "",
        "a",
        "c",
        "",
        "Ljava/util/List;",
        "h",
        "()Ljava/util/List;",
        "headerIndexes",
        "LMn2;",
        "b",
        "LMn2;",
        "e",
        "()LMn2;",
        "itemScope",
        "getItemCount",
        "()I",
        "itemCount",
        "",
        "()Ljava/util/Map;",
        "keyToIndexMap",
        "LR62;",
        "Llo2;",
        "intervals",
        "Lkotlin/ranges/IntRange;",
        "nearestItemsRange",
        "LCo2;",
        "state",
        "<init>",
        "(LR62;Lkotlin/ranges/IntRange;Ljava/util/List;LMn2;LCo2;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LMn2;

.field public final synthetic c:LRn2;


# direct methods
.method public constructor <init>(LR62;Lkotlin/ranges/IntRange;Ljava/util/List;LMn2;LCo2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR62<",
            "Llo2;",
            ">;",
            "Lkotlin/ranges/IntRange;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "LMn2;",
            "LCo2;",
            ")V"
        }
    .end annotation

    const-string v0, "intervals"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nearestItemsRange"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerIndexes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lqo2;->a:Ljava/util/List;

    iput-object p4, p0, Lqo2;->b:LMn2;

    new-instance p3, Lqo2$a;

    invoke-direct {p3, p5, p4}, Lqo2$a;-><init>(LCo2;LMn2;)V

    const p4, 0x7b689f43

    const/4 p5, 0x1

    invoke-static {p4, p5, p3}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object p3

    invoke-static {p1, p2, p3}, LSn2;->b(LR62;Lkotlin/ranges/IntRange;Lkotlin/jvm/functions/Function4;)LRn2;

    move-result-object p1

    iput-object p1, p0, Lqo2;->c:LRn2;

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqo2;->c:LRn2;

    invoke-interface {v0, p1}, LRn2;->a(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lqo2;->c:LRn2;

    invoke-interface {v0}, LRn2;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public c(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqo2;->c:LRn2;

    invoke-interface {v0, p1}, LRn2;->c(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e()LMn2;
    .locals 1

    iget-object v0, p0, Lqo2;->b:LMn2;

    return-object v0
.end method

.method public f(ILEt0;I)V
    .locals 4

    const v0, -0x620dc0ea

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    and-int/lit8 v1, p3, 0xe

    if-nez v1, :cond_1

    invoke-interface {p2, p1}, LEt0;->r(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x70

    if-nez v2, :cond_3

    invoke-interface {p2, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x5b

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LEt0;->k()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:-1)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    iget-object v0, p0, Lqo2;->c:LRn2;

    and-int/lit8 v1, v1, 0xe

    invoke-interface {v0, p1, p2, v1}, LRn2;->f(ILEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_4
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_8

    goto :goto_5

    :cond_8
    new-instance v0, Lqo2$b;

    invoke-direct {v0, p0, p1, p3}, Lqo2$b;-><init>(Lqo2;II)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lqo2;->c:LRn2;

    invoke-interface {v0}, LRn2;->getItemCount()I

    move-result v0

    return v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lqo2;->a:Ljava/util/List;

    return-object v0
.end method
