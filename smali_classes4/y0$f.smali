.class public Ly0$f;
.super Ly0$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0;->i(Landroidx/recyclerview/widget/RecyclerView$D;IIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/RecyclerView$D;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:LNs6;

.field public final synthetic e:Ly0;


# direct methods
.method public constructor <init>(Ly0;Landroidx/recyclerview/widget/RecyclerView$D;IILNs6;)V
    .locals 0

    iput-object p1, p0, Ly0$f;->e:Ly0;

    iput-object p2, p0, Ly0$f;->a:Landroidx/recyclerview/widget/RecyclerView$D;

    iput p3, p0, Ly0$f;->b:I

    iput p4, p0, Ly0$f;->c:I

    iput-object p5, p0, Ly0$f;->d:LNs6;

    invoke-direct {p0}, Ly0$l;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Ly0$f;->b:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1, v1}, Lbq6;->Z0(Landroid/view/View;F)V

    :cond_0
    iget v0, p0, Ly0$f;->c:I

    if-eqz v0, :cond_1

    invoke-static {p1, v1}, Lbq6;->a1(Landroid/view/View;F)V

    :cond_1
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Ly0$f;->d:LNs6;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LNs6;->h(LPs6;)LNs6;

    iget-object p1, p0, Ly0$f;->e:Ly0;

    iget-object v0, p0, Ly0$f;->a:Landroidx/recyclerview/widget/RecyclerView$D;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/u;->dispatchMoveFinished(Landroidx/recyclerview/widget/RecyclerView$D;)V

    iget-object p1, p0, Ly0$f;->e:Ly0;

    iget-object p1, p1, Ly0;->i:Ljava/util/ArrayList;

    iget-object v0, p0, Ly0$f;->a:Landroidx/recyclerview/widget/RecyclerView$D;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Ly0$f;->e:Ly0;

    invoke-virtual {p1}, Ly0;->dispatchFinishedWhenDone()V

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Ly0$f;->e:Ly0;

    iget-object v0, p0, Ly0$f;->a:Landroidx/recyclerview/widget/RecyclerView$D;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/u;->dispatchMoveStarting(Landroidx/recyclerview/widget/RecyclerView$D;)V

    return-void
.end method
