.class public Lcom/facebook/login/widget/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/widget/a$d;,
        Lcom/facebook/login/widget/a$e;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Landroid/content/Context;

.field public d:Lcom/facebook/login/widget/a$d;

.field public e:Landroid/widget/PopupWindow;

.field public f:Lcom/facebook/login/widget/a$e;

.field public g:J

.field public final h:Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/facebook/login/widget/a$e;->b:Lcom/facebook/login/widget/a$e;

    iput-object v0, p0, Lcom/facebook/login/widget/a;->f:Lcom/facebook/login/widget/a$e;

    const-wide/16 v0, 0x1770

    iput-wide v0, p0, Lcom/facebook/login/widget/a;->g:J

    new-instance v0, Lcom/facebook/login/widget/a$a;

    invoke-direct {v0, p0}, Lcom/facebook/login/widget/a$a;-><init>(Lcom/facebook/login/widget/a;)V

    iput-object v0, p0, Lcom/facebook/login/widget/a;->h:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    iput-object p1, p0, Lcom/facebook/login/widget/a;->a:Ljava/lang/String;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/facebook/login/widget/a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/login/widget/a;->c:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(Lcom/facebook/login/widget/a;)Ljava/lang/ref/WeakReference;
    .locals 3

    const-class v0, Lcom/facebook/login/widget/a;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    iget-object p0, p0, Lcom/facebook/login/widget/a;->b:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static synthetic b(Lcom/facebook/login/widget/a;)Landroid/widget/PopupWindow;
    .locals 3

    const-class v0, Lcom/facebook/login/widget/a;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    iget-object p0, p0, Lcom/facebook/login/widget/a;->e:Landroid/widget/PopupWindow;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static synthetic c(Lcom/facebook/login/widget/a;)Lcom/facebook/login/widget/a$d;
    .locals 3

    const-class v0, Lcom/facebook/login/widget/a;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    iget-object p0, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method


# virtual methods
.method public d()V
    .locals 1

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/login/widget/a;->i()V

    iget-object v0, p0, Lcom/facebook/login/widget/a;->e:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public final e()V
    .locals 2

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/login/widget/a;->i()V

    iget-object v0, p0, Lcom/facebook/login/widget/a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/login/widget/a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/login/widget/a;->h:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public f(J)V
    .locals 1

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iput-wide p1, p0, Lcom/facebook/login/widget/a;->g:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public g(Lcom/facebook/login/widget/a$e;)V
    .locals 1

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iput-object p1, p0, Lcom/facebook/login/widget/a;->f:Lcom/facebook/login/widget/a$e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public h()V
    .locals 4

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/login/widget/a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v0, Lcom/facebook/login/widget/a$d;

    iget-object v1, p0, Lcom/facebook/login/widget/a;->c:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lcom/facebook/login/widget/a$d;-><init>(Lcom/facebook/login/widget/a;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    sget v1, LIi4;->com_facebook_tooltip_bubble_view_text_body:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/login/widget/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/facebook/login/widget/a;->f:Lcom/facebook/login/widget/a$e;

    sget-object v1, Lcom/facebook/login/widget/a$e;->b:Lcom/facebook/login/widget/a$e;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    invoke-static {v0}, Lcom/facebook/login/widget/a$d;->a(Lcom/facebook/login/widget/a$d;)Landroid/view/View;

    move-result-object v0

    sget v1, Lwg4;->com_facebook_tooltip_blue_background:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    invoke-static {v0}, Lcom/facebook/login/widget/a$d;->b(Lcom/facebook/login/widget/a$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lwg4;->com_facebook_tooltip_blue_bottomnub:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    invoke-static {v0}, Lcom/facebook/login/widget/a$d;->c(Lcom/facebook/login/widget/a$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lwg4;->com_facebook_tooltip_blue_topnub:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    invoke-static {v0}, Lcom/facebook/login/widget/a$d;->d(Lcom/facebook/login/widget/a$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lwg4;->com_facebook_tooltip_blue_xout:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    invoke-static {v0}, Lcom/facebook/login/widget/a$d;->a(Lcom/facebook/login/widget/a$d;)Landroid/view/View;

    move-result-object v0

    sget v1, Lwg4;->com_facebook_tooltip_black_background:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    invoke-static {v0}, Lcom/facebook/login/widget/a$d;->b(Lcom/facebook/login/widget/a$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lwg4;->com_facebook_tooltip_black_bottomnub:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    invoke-static {v0}, Lcom/facebook/login/widget/a$d;->c(Lcom/facebook/login/widget/a$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lwg4;->com_facebook_tooltip_black_topnub:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    invoke-static {v0}, Lcom/facebook/login/widget/a$d;->d(Lcom/facebook/login/widget/a$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lwg4;->com_facebook_tooltip_black_xout:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    iget-object v0, p0, Lcom/facebook/login/widget/a;->c:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/login/widget/a;->e()V

    iget-object v2, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    const/high16 v3, -0x80000000

    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {v2, v1, v0}, Landroid/view/View;->measure(II)V

    new-instance v0, Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    iget-object v3, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v0, p0, Lcom/facebook/login/widget/a;->e:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/facebook/login/widget/a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/facebook/login/widget/a;->j()V

    iget-wide v0, p0, Lcom/facebook/login/widget/a;->g:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    new-instance v1, Lcom/facebook/login/widget/a$b;

    invoke-direct {v1, p0}, Lcom/facebook/login/widget/a$b;-><init>(Lcom/facebook/login/widget/a;)V

    iget-wide v2, p0, Lcom/facebook/login/widget/a;->g:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    iget-object v0, p0, Lcom/facebook/login/widget/a;->e:Landroid/widget/PopupWindow;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    iget-object v0, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    new-instance v1, Lcom/facebook/login/widget/a$c;

    invoke-direct {v1, p0}, Lcom/facebook/login/widget/a$c;-><init>(Lcom/facebook/login/widget/a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public final i()V
    .locals 2

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/login/widget/a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/login/widget/a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/login/widget/a;->h:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public final j()V
    .locals 1

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/login/widget/a;->e:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/login/widget/a;->e:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isAboveAnchor()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    invoke-virtual {v0}, Lcom/facebook/login/widget/a$d;->f()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/login/widget/a;->d:Lcom/facebook/login/widget/a$d;

    invoke-virtual {v0}, Lcom/facebook/login/widget/a$d;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
