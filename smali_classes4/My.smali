.class public abstract LMy;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        ">",
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003B\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0008\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\nJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0016\u0010\u0013\u001a\u00020\u00122\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0010H\u0016R\"\u0010\u001b\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "LMy;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "T",
        "Landroidx/recyclerview/widget/RecyclerView$h;",
        "",
        "getItemCount",
        "position",
        "getItemViewType",
        "LG6;",
        "p",
        "LH6;",
        "q",
        "section",
        "t",
        "LF6;",
        "r",
        "",
        "sections",
        "",
        "u",
        "LE6;",
        "b",
        "LE6;",
        "o",
        "()LE6;",
        "setAdapterData",
        "(LE6;)V",
        "adapterData",
        "<init>",
        "()V",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public b:LE6;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    new-instance v0, LE6;

    invoke-direct {v0, p0}, LE6;-><init>(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iput-object v0, p0, LMy;->b:LE6;

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    iget-object v0, p0, LMy;->b:LE6;

    invoke-virtual {v0}, LE6;->g()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    iget-object v0, p0, LMy;->b:LE6;

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->b()I

    move-result p1

    return p1
.end method

.method public final o()LE6;
    .locals 1

    iget-object v0, p0, LMy;->b:LE6;

    return-object v0
.end method

.method public final p(I)LG6;
    .locals 1

    iget-object v0, p0, LMy;->b:LE6;

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    return-object p1
.end method

.method public final q(I)LH6;
    .locals 1

    iget-object v0, p0, LMy;->b:LE6;

    invoke-virtual {p0, p1}, LMy;->p(I)LG6;

    move-result-object p1

    invoke-virtual {v0, p1}, LE6;->i(LG6;)LH6;

    move-result-object p1

    return-object p1
.end method

.method public r()LF6;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final t(LH6;)I
    .locals 1

    const-string v0, "section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LMy;->b:LE6;

    invoke-virtual {v0}, LE6;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public u(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LMy;->b:LE6;

    invoke-virtual {v0}, LE6;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LMy;->b:LE6;

    invoke-virtual {v0, p1}, LE6;->b(Ljava/util/Collection;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LMy;->r()LF6;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, LMy;->b:LE6;

    invoke-virtual {v1}, LE6;->j()Ljava/util/List;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LF6;->a(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/h$e;

    move-result-object v0

    iget-object v1, p0, LMy;->b:LE6;

    invoke-virtual {v1}, LE6;->c()V

    iget-object v1, p0, LMy;->b:LE6;

    invoke-virtual {v1, p1}, LE6;->a(Ljava/util/Collection;)V

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/h$e;->d(Landroidx/recyclerview/widget/RecyclerView$h;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    iget-object v0, p0, LMy;->b:LE6;

    invoke-virtual {v0}, LE6;->c()V

    iget-object v0, p0, LMy;->b:LE6;

    invoke-virtual {v0, p1}, LE6;->a(Ljava/util/Collection;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    :cond_2
    :goto_1
    return-void
.end method
