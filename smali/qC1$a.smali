.class public LqC1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LqC1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LqC1;


# direct methods
.method public constructor <init>(LqC1;)V
    .locals 0

    iput-object p1, p0, LqC1$a;->b:LqC1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 2

    iget-object v0, p0, LqC1$a;->b:LqC1;

    invoke-static {v0}, Lbq6;->m0(Landroid/view/View;)V

    iget-object v0, p0, LqC1$a;->b:LqC1;

    iget-object v1, v0, LqC1;->b:Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    iget-object v0, v0, LqC1;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v0, p0, LqC1$a;->b:LqC1;

    iget-object v0, v0, LqC1;->b:Landroid/view/ViewGroup;

    invoke-static {v0}, Lbq6;->m0(Landroid/view/View;)V

    iget-object v0, p0, LqC1$a;->b:LqC1;

    const/4 v1, 0x0

    iput-object v1, v0, LqC1;->b:Landroid/view/ViewGroup;

    iput-object v1, v0, LqC1;->c:Landroid/view/View;

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
