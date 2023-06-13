.class public Lcom/facebook/login/widget/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/facebook/login/widget/a;


# direct methods
.method public constructor <init>(Lcom/facebook/login/widget/a;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/widget/a$a;->b:Lcom/facebook/login/widget/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollChanged()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/a$a;->b:Lcom/facebook/login/widget/a;

    invoke-static {v0}, Lcom/facebook/login/widget/a;->a(Lcom/facebook/login/widget/a;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/login/widget/a$a;->b:Lcom/facebook/login/widget/a;

    invoke-static {v0}, Lcom/facebook/login/widget/a;->b(Lcom/facebook/login/widget/a;)Landroid/widget/PopupWindow;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/login/widget/a$a;->b:Lcom/facebook/login/widget/a;

    invoke-static {v0}, Lcom/facebook/login/widget/a;->b(Lcom/facebook/login/widget/a;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/login/widget/a$a;->b:Lcom/facebook/login/widget/a;

    invoke-static {v0}, Lcom/facebook/login/widget/a;->b(Lcom/facebook/login/widget/a;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isAboveAnchor()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/login/widget/a$a;->b:Lcom/facebook/login/widget/a;

    invoke-static {v0}, Lcom/facebook/login/widget/a;->c(Lcom/facebook/login/widget/a;)Lcom/facebook/login/widget/a$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/login/widget/a$d;->f()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/login/widget/a$a;->b:Lcom/facebook/login/widget/a;

    invoke-static {v0}, Lcom/facebook/login/widget/a;->c(Lcom/facebook/login/widget/a;)Lcom/facebook/login/widget/a$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/login/widget/a$d;->g()V

    :cond_1
    :goto_0
    return-void
.end method
