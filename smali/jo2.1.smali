.class public final Ljo2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDG;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u000c\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u000b\u00a8\u0006\u0017"
    }
    d2 = {
        "Ljo2;",
        "LDG;",
        "",
        "a",
        "LCo2;",
        "LCo2;",
        "getState",
        "()LCo2;",
        "state",
        "",
        "getItemCount",
        "()I",
        "itemCount",
        "",
        "b",
        "()Z",
        "hasVisibleItems",
        "c",
        "firstVisibleIndex",
        "d",
        "lastVisibleIndex",
        "<init>",
        "(LCo2;)V",
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
.field public final a:LCo2;


# direct methods
.method public constructor <init>(LCo2;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljo2;->a:LCo2;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ljo2;->a:LCo2;

    invoke-virtual {v0}, LCo2;->w()LMv4;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LMv4;->g()V

    :cond_0
    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Ljo2;->a:LCo2;

    invoke-virtual {v0}, LCo2;->r()Lto2;

    move-result-object v0

    invoke-interface {v0}, Lto2;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Ljo2;->a:LCo2;

    invoke-virtual {v0}, LCo2;->o()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Ljo2;->a:LCo2;

    invoke-virtual {v0}, LCo2;->r()Lto2;

    move-result-object v0

    invoke-interface {v0}, Lto2;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmo2;

    invoke-interface {v0}, Lmo2;->getIndex()I

    move-result v0

    return v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Ljo2;->a:LCo2;

    invoke-virtual {v0}, LCo2;->r()Lto2;

    move-result-object v0

    invoke-interface {v0}, Lto2;->a()I

    move-result v0

    return v0
.end method
