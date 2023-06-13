.class public abstract Landroidx/recyclerview/widget/e;
.super Landroidx/recyclerview/widget/RecyclerView$D;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0008\u0010\u0003\u001a\u00020\u0002H\u0014J\u0008\u0010\u0004\u001a\u00020\u0002H\u0014J\u001f\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0010\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0010\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0002H\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0010\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/recyclerview/widget/e;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "",
        "i",
        "j",
        "",
        "flags",
        "mask",
        "l",
        "(II)V",
        "a",
        "(I)V",
        "b",
        "()V",
        "k",
        "",
        "previousBound",
        "currentBound",
        "e",
        "Landroid/view/View;",
        "itemView",
        "<init>",
        "(Landroid/view/View;)V",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const-string v0, "itemView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$D;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->isBound()Z

    move-result v0

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$D;->addFlags(I)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->isBound()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/e;->e(ZZ)V

    return-void
.end method

.method public bridge synthetic addFlags(I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/e;->a(I)V

    return-void
.end method

.method public b()V
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->isBound()Z

    move-result v0

    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->clearPayload()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->isBound()Z

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/e;->e(ZZ)V

    return-void
.end method

.method public bridge synthetic clearPayload()V
    .locals 0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/e;->b()V

    return-void
.end method

.method public final e(ZZ)V
    .locals 0

    if-eqz p1, :cond_0

    if-nez p2, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/e;->j()V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/e;->i()V

    :cond_1
    :goto_0
    return-void
.end method

.method public abstract i()V
.end method

.method public abstract j()V
.end method

.method public k()V
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->isBound()Z

    move-result v0

    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->resetInternal()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->isBound()Z

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/e;->e(ZZ)V

    return-void
.end method

.method public l(II)V
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->isBound()Z

    move-result v0

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$D;->setFlags(II)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$D;->isBound()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/e;->e(ZZ)V

    return-void
.end method

.method public bridge synthetic resetInternal()V
    .locals 0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/e;->k()V

    return-void
.end method

.method public bridge synthetic setFlags(II)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/e;->l(II)V

    return-void
.end method
