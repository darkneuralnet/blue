.class public LW03$h;
.super Landroidx/recyclerview/widget/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW03;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation


# instance fields
.field public final synthetic c:LW03;


# direct methods
.method public constructor <init>(LW03;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    iput-object p1, p0, LW03$h;->c:LW03;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/s;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method


# virtual methods
.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Lp2;)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/s;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Lp2;)V

    iget-object p1, p0, LW03$h;->c:LW03;

    iget-object p1, p1, LW03;->g:LW03$c;

    invoke-virtual {p1}, LW03$c;->t()I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lp2$b;->a(IIZ)Lp2$b;

    move-result-object p1

    invoke-virtual {p2, p1}, Lp2;->h0(Ljava/lang/Object;)V

    return-void
.end method
