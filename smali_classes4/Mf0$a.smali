.class public LMf0$a;
.super Ly0$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMf0;->j(Landroidx/recyclerview/widget/RecyclerView$D;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/RecyclerView$D;

.field public final synthetic b:LNs6;

.field public final synthetic c:LMf0;


# direct methods
.method public constructor <init>(LMf0;Landroidx/recyclerview/widget/RecyclerView$D;LNs6;)V
    .locals 0

    iput-object p1, p0, LMf0$a;->c:LMf0;

    iput-object p2, p0, LMf0$a;->a:Landroidx/recyclerview/widget/RecyclerView$D;

    iput-object p3, p0, LMf0$a;->b:LNs6;

    invoke-direct {p0}, Ly0$l;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LMf0$a;->c:LMf0;

    invoke-virtual {v0, p1}, Ly0;->b(Landroid/view/View;)V

    iget-object p1, p0, LMf0$a;->b:LNs6;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LNs6;->h(LPs6;)LNs6;

    iget-object p1, p0, LMf0$a;->c:LMf0;

    iget-object v0, p0, LMf0$a;->a:Landroidx/recyclerview/widget/RecyclerView$D;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/u;->dispatchRemoveFinished(Landroidx/recyclerview/widget/RecyclerView$D;)V

    iget-object p1, p0, LMf0$a;->c:LMf0;

    iget-object p1, p1, Ly0;->j:Ljava/util/ArrayList;

    iget-object v0, p0, LMf0$a;->a:Landroidx/recyclerview/widget/RecyclerView$D;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, LMf0$a;->c:LMf0;

    invoke-virtual {p1}, Ly0;->dispatchFinishedWhenDone()V

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, LMf0$a;->c:LMf0;

    iget-object v0, p0, LMf0$a;->a:Landroidx/recyclerview/widget/RecyclerView$D;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/u;->dispatchRemoveStarting(Landroidx/recyclerview/widget/RecyclerView$D;)V

    return-void
.end method
