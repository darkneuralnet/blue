.class public Ly0$h;
.super Ly0$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0;->h(Ly0$i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ly0$i;

.field public final synthetic b:LNs6;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Ly0;


# direct methods
.method public constructor <init>(Ly0;Ly0$i;LNs6;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Ly0$h;->d:Ly0;

    iput-object p2, p0, Ly0$h;->a:Ly0$i;

    iput-object p3, p0, Ly0$h;->b:LNs6;

    iput-object p4, p0, Ly0$h;->c:Landroid/view/View;

    invoke-direct {p0}, Ly0$l;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Ly0$h;->b:LNs6;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LNs6;->h(LPs6;)LNs6;

    iget-object p1, p0, Ly0$h;->c:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Lbq6;->z0(Landroid/view/View;F)V

    iget-object p1, p0, Ly0$h;->c:Landroid/view/View;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lbq6;->Z0(Landroid/view/View;F)V

    iget-object p1, p0, Ly0$h;->c:Landroid/view/View;

    invoke-static {p1, v0}, Lbq6;->a1(Landroid/view/View;F)V

    iget-object p1, p0, Ly0$h;->d:Ly0;

    iget-object v0, p0, Ly0$h;->a:Ly0$i;

    iget-object v0, v0, Ly0$i;->b:Landroidx/recyclerview/widget/RecyclerView$D;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/recyclerview/widget/u;->dispatchChangeFinished(Landroidx/recyclerview/widget/RecyclerView$D;Z)V

    iget-object p1, p0, Ly0$h;->d:Ly0;

    iget-object p1, p1, Ly0;->k:Ljava/util/ArrayList;

    iget-object v0, p0, Ly0$h;->a:Ly0$i;

    iget-object v0, v0, Ly0$i;->b:Landroidx/recyclerview/widget/RecyclerView$D;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Ly0$h;->d:Ly0;

    invoke-virtual {p1}, Ly0;->dispatchFinishedWhenDone()V

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Ly0$h;->d:Ly0;

    iget-object v0, p0, Ly0$h;->a:Ly0$i;

    iget-object v0, v0, Ly0$i;->b:Landroidx/recyclerview/widget/RecyclerView$D;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/recyclerview/widget/u;->dispatchChangeStarting(Landroidx/recyclerview/widget/RecyclerView$D;Z)V

    return-void
.end method
