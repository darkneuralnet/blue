.class public Lcom/facebook/share/widget/LikeView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/widget/LikeView$e;,
        Lcom/facebook/share/widget/LikeView$f;,
        Lcom/facebook/share/widget/LikeView$h;,
        Lcom/facebook/share/widget/LikeView$c;,
        Lcom/facebook/share/widget/LikeView$d;,
        Lcom/facebook/share/widget/LikeView$i;,
        Lcom/facebook/share/widget/LikeView$g;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public b:Ljava/lang/String;

.field public c:Lcom/facebook/share/widget/LikeView$g;

.field public d:Landroid/widget/LinearLayout;

.field public e:Lcom/facebook/share/internal/LikeButton;

.field public f:Lcom/facebook/share/internal/LikeBoxCountView;

.field public g:Landroid/widget/TextView;

.field public h:Lcom/facebook/share/internal/a;

.field public i:Landroid/content/BroadcastReceiver;

.field public j:Lcom/facebook/share/widget/LikeView$e;

.field public k:Lcom/facebook/share/widget/LikeView$i;

.field public l:Lcom/facebook/share/widget/LikeView$d;

.field public m:Lcom/facebook/share/widget/LikeView$c;

.field public n:I

.field public o:I

.field public p:I

.field public q:LIy1;

.field public r:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget-object v0, Lcom/facebook/share/widget/LikeView$i;->g:Lcom/facebook/share/widget/LikeView$i;

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->k:Lcom/facebook/share/widget/LikeView$i;

    sget-object v0, Lcom/facebook/share/widget/LikeView$d;->g:Lcom/facebook/share/widget/LikeView$d;

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->l:Lcom/facebook/share/widget/LikeView$d;

    sget-object v0, Lcom/facebook/share/widget/LikeView$c;->g:Lcom/facebook/share/widget/LikeView$c;

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->m:Lcom/facebook/share/widget/LikeView$c;

    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/share/widget/LikeView;->n:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/share/widget/LikeView;->r:Z

    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/LikeView;->l(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, Lcom/facebook/share/widget/LikeView$i;->g:Lcom/facebook/share/widget/LikeView$i;

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->k:Lcom/facebook/share/widget/LikeView$i;

    sget-object v0, Lcom/facebook/share/widget/LikeView$d;->g:Lcom/facebook/share/widget/LikeView$d;

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->l:Lcom/facebook/share/widget/LikeView$d;

    sget-object v0, Lcom/facebook/share/widget/LikeView$c;->g:Lcom/facebook/share/widget/LikeView$c;

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->m:Lcom/facebook/share/widget/LikeView$c;

    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/share/widget/LikeView;->n:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/share/widget/LikeView;->r:Z

    invoke-virtual {p0, p2}, Lcom/facebook/share/widget/LikeView;->p(Landroid/util/AttributeSet;)V

    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/LikeView;->l(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a(Lcom/facebook/share/widget/LikeView;Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/facebook/share/widget/LikeView;->q(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V

    return-void
.end method

.method public static synthetic b(Lcom/facebook/share/widget/LikeView;Lcom/facebook/share/internal/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/LikeView;->i(Lcom/facebook/share/internal/a;)V

    return-void
.end method

.method public static synthetic c(Lcom/facebook/share/widget/LikeView;Lcom/facebook/share/widget/LikeView$e;)Lcom/facebook/share/widget/LikeView$e;
    .locals 0

    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->j:Lcom/facebook/share/widget/LikeView$e;

    return-object p1
.end method

.method public static synthetic d(Lcom/facebook/share/widget/LikeView;)V
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->s()V

    return-void
.end method

.method public static synthetic e(Lcom/facebook/share/widget/LikeView;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/widget/LikeView;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic f(Lcom/facebook/share/widget/LikeView;)V
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->v()V

    return-void
.end method

.method public static synthetic g(Lcom/facebook/share/widget/LikeView;)Lcom/facebook/share/widget/LikeView$h;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic h(Lcom/facebook/share/widget/LikeView;)Lcom/facebook/share/widget/LikeView$g;
    .locals 0

    iget-object p0, p0, Lcom/facebook/share/widget/LikeView;->c:Lcom/facebook/share/widget/LikeView$g;

    return-object p0
.end method


# virtual methods
.method public final i(Lcom/facebook/share/internal/a;)V
    .locals 2

    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->h:Lcom/facebook/share/internal/a;

    new-instance p1, Lcom/facebook/share/widget/LikeView$f;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/facebook/share/widget/LikeView$f;-><init>(Lcom/facebook/share/widget/LikeView;Lcom/facebook/share/widget/LikeView$a;)V

    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->i:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, LMu2;->b(Landroid/content/Context;)LMu2;

    move-result-object p1

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "com.facebook.sdk.LikeActionController.UPDATED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "com.facebook.sdk.LikeActionController.DID_ERROR"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "com.facebook.sdk.LikeActionController.DID_RESET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->i:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1, v1, v0}, LMu2;->c(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public final j()Landroid/app/Activity;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/app/Activity;

    if-nez v1, :cond_0

    instance-of v2, v0, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_0

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    check-cast v0, Landroid/app/Activity;

    return-object v0

    :cond_1
    new-instance v0, Lcom/facebook/FacebookException;

    const-string v1, "Unable to get Activity."

    invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->k:Lcom/facebook/share/widget/LikeView$i;

    invoke-virtual {v1}, Lcom/facebook/share/widget/LikeView$i;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "style"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->m:Lcom/facebook/share/widget/LikeView$c;

    invoke-virtual {v1}, Lcom/facebook/share/widget/LikeView$c;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "auxiliary_position"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->l:Lcom/facebook/share/widget/LikeView$d;

    invoke-virtual {v1}, Lcom/facebook/share/widget/LikeView$d;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "horizontal_alignment"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->b:Ljava/lang/String;

    const-string v2, ""

    invoke-static {v1, v2}, Lyi6;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "object_id"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->c:Lcom/facebook/share/widget/LikeView$g;

    invoke-virtual {v1}, Lcom/facebook/share/widget/LikeView$g;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "object_type"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final l(Landroid/content/Context;)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LMf4;->com_facebook_likeview_edge_padding:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/share/widget/LikeView;->o:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LMf4;->com_facebook_likeview_internal_padding:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/share/widget/LikeView;->p:I

    iget v0, p0, Lcom/facebook/share/widget/LikeView;->n:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LHf4;->com_facebook_likeview_text_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/share/widget/LikeView;->n:I

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->d:Landroid/widget/LinearLayout;

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/LikeView;->m(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/LikeView;->o(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/LikeView;->n(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/facebook/share/widget/LikeView;->d:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->e:Lcom/facebook/share/internal/LikeButton;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/facebook/share/widget/LikeView;->d:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->g:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/facebook/share/widget/LikeView;->d:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->f:Lcom/facebook/share/internal/LikeBoxCountView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/facebook/share/widget/LikeView;->d:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/facebook/share/widget/LikeView;->b:Ljava/lang/String;

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->c:Lcom/facebook/share/widget/LikeView$g;

    invoke-virtual {p0, p1, v0}, Lcom/facebook/share/widget/LikeView;->q(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->v()V

    return-void
.end method

.method public final m(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Lcom/facebook/share/internal/LikeButton;

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->h:Lcom/facebook/share/internal/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/facebook/share/internal/a;->S()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v0, p1, v1}, Lcom/facebook/share/internal/LikeButton;-><init>(Landroid/content/Context;Z)V

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->e:Lcom/facebook/share/internal/LikeButton;

    new-instance p1, Lcom/facebook/share/widget/LikeView$a;

    invoke-direct {p1, p0}, Lcom/facebook/share/widget/LikeView$a;-><init>(Lcom/facebook/share/widget/LikeView;)V

    invoke-virtual {v0, p1}, Lcom/facebook/FacebookButtonBase;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    invoke-direct {p1, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->e:Lcom/facebook/share/internal/LikeButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final n(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lcom/facebook/share/internal/LikeBoxCountView;

    invoke-direct {v0, p1}, Lcom/facebook/share/internal/LikeBoxCountView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->f:Lcom/facebook/share/internal/LikeBoxCountView;

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p1, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->f:Lcom/facebook/share/internal/LikeBoxCountView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final o(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v1, LMf4;->com_facebook_likeview_text_size:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object p1, p0, Lcom/facebook/share/widget/LikeView;->g:Landroid/widget/TextView;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    iget-object p1, p0, Lcom/facebook/share/widget/LikeView;->g:Landroid/widget/TextView;

    iget v0, p0, Lcom/facebook/share/widget/LikeView;->n:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p0, Lcom/facebook/share/widget/LikeView;->g:Landroid/widget/TextView;

    const/16 v0, 0x11

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x1

    invoke-direct {p1, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    const/4 v0, 0x0

    sget-object v1, Lcom/facebook/share/widget/LikeView$g;->d:Lcom/facebook/share/widget/LikeView$g;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/share/widget/LikeView;->setObjectIdAndType(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method public final p(Landroid/util/AttributeSet;)V
    .locals 2

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, LQl4;->com_facebook_like_view:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    sget v0, LQl4;->com_facebook_like_view_com_facebook_object_id:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lyi6;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->b:Ljava/lang/String;

    sget v0, LQl4;->com_facebook_like_view_com_facebook_object_type:I

    sget-object v1, Lcom/facebook/share/widget/LikeView$g;->g:Lcom/facebook/share/widget/LikeView$g;

    invoke-virtual {v1}, Lcom/facebook/share/widget/LikeView$g;->b()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    invoke-static {v0}, Lcom/facebook/share/widget/LikeView$g;->a(I)Lcom/facebook/share/widget/LikeView$g;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->c:Lcom/facebook/share/widget/LikeView$g;

    sget v0, LQl4;->com_facebook_like_view_com_facebook_style:I

    sget-object v1, Lcom/facebook/share/widget/LikeView$i;->g:Lcom/facebook/share/widget/LikeView$i;

    invoke-static {v1}, Lcom/facebook/share/widget/LikeView$i;->a(Lcom/facebook/share/widget/LikeView$i;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    invoke-static {v0}, Lcom/facebook/share/widget/LikeView$i;->b(I)Lcom/facebook/share/widget/LikeView$i;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->k:Lcom/facebook/share/widget/LikeView$i;

    if-eqz v0, :cond_4

    sget v0, LQl4;->com_facebook_like_view_com_facebook_auxiliary_view_position:I

    sget-object v1, Lcom/facebook/share/widget/LikeView$c;->g:Lcom/facebook/share/widget/LikeView$c;

    invoke-static {v1}, Lcom/facebook/share/widget/LikeView$c;->a(Lcom/facebook/share/widget/LikeView$c;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    invoke-static {v0}, Lcom/facebook/share/widget/LikeView$c;->b(I)Lcom/facebook/share/widget/LikeView$c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->m:Lcom/facebook/share/widget/LikeView$c;

    if-eqz v0, :cond_3

    sget v0, LQl4;->com_facebook_like_view_com_facebook_horizontal_alignment:I

    sget-object v1, Lcom/facebook/share/widget/LikeView$d;->g:Lcom/facebook/share/widget/LikeView$d;

    invoke-static {v1}, Lcom/facebook/share/widget/LikeView$d;->a(Lcom/facebook/share/widget/LikeView$d;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    invoke-static {v0}, Lcom/facebook/share/widget/LikeView$d;->b(I)Lcom/facebook/share/widget/LikeView$d;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->l:Lcom/facebook/share/widget/LikeView$d;

    if-eqz v0, :cond_2

    sget v0, LQl4;->com_facebook_like_view_com_facebook_foreground_color:I

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/facebook/share/widget/LikeView;->n:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported value for LikeView \'horizontal_alignment\'"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported value for LikeView \'auxiliary_view_position\'"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported value for LikeView \'style\'"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_0
    return-void
.end method

.method public final q(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->r()V

    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/facebook/share/widget/LikeView;->c:Lcom/facebook/share/widget/LikeView$g;

    invoke-static {p1}, Lyi6;->R(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/share/widget/LikeView$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/widget/LikeView$e;-><init>(Lcom/facebook/share/widget/LikeView;Lcom/facebook/share/widget/LikeView$a;)V

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->j:Lcom/facebook/share/widget/LikeView$e;

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->j:Lcom/facebook/share/widget/LikeView$e;

    invoke-static {p1, p2, v0}, Lcom/facebook/share/internal/a;->M(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;Lcom/facebook/share/internal/a$m;)V

    :cond_1
    return-void
.end method

.method public final r()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->i:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LMu2;->b(Landroid/content/Context;)LMu2;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->i:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2}, LMu2;->e(Landroid/content/BroadcastReceiver;)V

    iput-object v1, p0, Lcom/facebook/share/widget/LikeView;->i:Landroid/content/BroadcastReceiver;

    :cond_0
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->j:Lcom/facebook/share/widget/LikeView$e;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/facebook/share/widget/LikeView$e;->b()V

    iput-object v1, p0, Lcom/facebook/share/widget/LikeView;->j:Lcom/facebook/share/widget/LikeView$e;

    :cond_1
    iput-object v1, p0, Lcom/facebook/share/widget/LikeView;->h:Lcom/facebook/share/internal/a;

    return-void
.end method

.method public final s()V
    .locals 4

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->h:Lcom/facebook/share/internal/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->q:LIy1;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->j()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->h:Lcom/facebook/share/internal/a;

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->q:LIy1;

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->k()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/share/internal/a;->m0(Landroid/app/Activity;LIy1;Landroid/os/Bundle;)V

    :cond_1
    return-void
.end method

.method public setAuxiliaryViewPosition(Lcom/facebook/share/widget/LikeView$c;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/facebook/share/widget/LikeView$c;->g:Lcom/facebook/share/widget/LikeView$c;

    :goto_0
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->m:Lcom/facebook/share/widget/LikeView$c;

    if-eq v0, p1, :cond_1

    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->m:Lcom/facebook/share/widget/LikeView$c;

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->u()V

    :cond_1
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/share/widget/LikeView;->r:Z

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->v()V

    return-void
.end method

.method public setForegroundColor(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, Lcom/facebook/share/widget/LikeView;->n:I

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method public setFragment(Landroid/app/Fragment;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, LIy1;

    invoke-direct {v0, p1}, LIy1;-><init>(Landroid/app/Fragment;)V

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->q:LIy1;

    return-void
.end method

.method public setFragment(Landroidx/fragment/app/Fragment;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, LIy1;

    invoke-direct {v0, p1}, LIy1;-><init>(Landroidx/fragment/app/Fragment;)V

    iput-object v0, p0, Lcom/facebook/share/widget/LikeView;->q:LIy1;

    return-void
.end method

.method public setHorizontalAlignment(Lcom/facebook/share/widget/LikeView$d;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/facebook/share/widget/LikeView$d;->g:Lcom/facebook/share/widget/LikeView$d;

    :goto_0
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->l:Lcom/facebook/share/widget/LikeView$d;

    if-eq v0, p1, :cond_1

    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->l:Lcom/facebook/share/widget/LikeView$d;

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->u()V

    :cond_1
    return-void
.end method

.method public setLikeViewStyle(Lcom/facebook/share/widget/LikeView$i;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/facebook/share/widget/LikeView$i;->g:Lcom/facebook/share/widget/LikeView$i;

    :goto_0
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->k:Lcom/facebook/share/widget/LikeView$i;

    if-eq v0, p1, :cond_1

    iput-object p1, p0, Lcom/facebook/share/widget/LikeView;->k:Lcom/facebook/share/widget/LikeView$i;

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->u()V

    :cond_1
    return-void
.end method

.method public setObjectIdAndType(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lyi6;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/facebook/share/widget/LikeView$g;->g:Lcom/facebook/share/widget/LikeView$g;

    :goto_0
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->b:Ljava/lang/String;

    invoke-static {p1, v0}, Lyi6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->c:Lcom/facebook/share/widget/LikeView$g;

    if-eq p2, v0, :cond_2

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/share/widget/LikeView;->q(Ljava/lang/String;Lcom/facebook/share/widget/LikeView$g;)V

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->v()V

    :cond_2
    return-void
.end method

.method public setOnErrorListener(Lcom/facebook/share/widget/LikeView$h;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public final t()V
    .locals 3

    sget-object v0, Lcom/facebook/share/widget/LikeView$b;->a:[I

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->m:Lcom/facebook/share/widget/LikeView$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->f:Lcom/facebook/share/internal/LikeBoxCountView;

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->l:Lcom/facebook/share/widget/LikeView$d;

    sget-object v2, Lcom/facebook/share/widget/LikeView$d;->f:Lcom/facebook/share/widget/LikeView$d;

    if-ne v1, v2, :cond_1

    sget-object v1, Lcom/facebook/share/internal/LikeBoxCountView$b;->d:Lcom/facebook/share/internal/LikeBoxCountView$b;

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/facebook/share/internal/LikeBoxCountView$b;->b:Lcom/facebook/share/internal/LikeBoxCountView$b;

    :goto_0
    invoke-virtual {v0, v1}, Lcom/facebook/share/internal/LikeBoxCountView;->setCaretPosition(Lcom/facebook/share/internal/LikeBoxCountView$b;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->f:Lcom/facebook/share/internal/LikeBoxCountView;

    sget-object v1, Lcom/facebook/share/internal/LikeBoxCountView$b;->c:Lcom/facebook/share/internal/LikeBoxCountView$b;

    invoke-virtual {v0, v1}, Lcom/facebook/share/internal/LikeBoxCountView;->setCaretPosition(Lcom/facebook/share/internal/LikeBoxCountView$b;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->f:Lcom/facebook/share/internal/LikeBoxCountView;

    sget-object v1, Lcom/facebook/share/internal/LikeBoxCountView$b;->e:Lcom/facebook/share/internal/LikeBoxCountView$b;

    invoke-virtual {v0, v1}, Lcom/facebook/share/internal/LikeBoxCountView;->setCaretPosition(Lcom/facebook/share/internal/LikeBoxCountView$b;)V

    :goto_1
    return-void
.end method

.method public final u()V
    .locals 7

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->e:Lcom/facebook/share/internal/LikeButton;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->l:Lcom/facebook/share/widget/LikeView$d;

    sget-object v3, Lcom/facebook/share/widget/LikeView$d;->e:Lcom/facebook/share/widget/LikeView$d;

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-ne v2, v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    sget-object v3, Lcom/facebook/share/widget/LikeView$d;->d:Lcom/facebook/share/widget/LikeView$d;

    if-ne v2, v3, :cond_1

    move v2, v5

    goto :goto_0

    :cond_1
    const/4 v2, 0x5

    :goto_0
    or-int/lit8 v3, v2, 0x30

    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->f:Lcom/facebook/share/internal/LikeBoxCountView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->k:Lcom/facebook/share/widget/LikeView$i;

    sget-object v1, Lcom/facebook/share/widget/LikeView$i;->d:Lcom/facebook/share/widget/LikeView$i;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->h:Lcom/facebook/share/internal/a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/facebook/share/internal/a;->Q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyi6;->R(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->g:Landroid/widget/TextView;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->k:Lcom/facebook/share/widget/LikeView$i;

    sget-object v1, Lcom/facebook/share/widget/LikeView$i;->f:Lcom/facebook/share/widget/LikeView$i;

    if-ne v0, v1, :cond_a

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->h:Lcom/facebook/share/internal/a;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/facebook/share/internal/a;->O()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyi6;->R(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->t()V

    iget-object v0, p0, Lcom/facebook/share/widget/LikeView;->f:Lcom/facebook/share/internal/LikeBoxCountView;

    :goto_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout$LayoutParams;

    iput v2, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->d:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/facebook/share/widget/LikeView;->m:Lcom/facebook/share/widget/LikeView$c;

    sget-object v6, Lcom/facebook/share/widget/LikeView$c;->e:Lcom/facebook/share/widget/LikeView$c;

    if-ne v3, v6, :cond_3

    goto :goto_2

    :cond_3
    move v1, v5

    :goto_2
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->m:Lcom/facebook/share/widget/LikeView$c;

    sget-object v2, Lcom/facebook/share/widget/LikeView$c;->f:Lcom/facebook/share/widget/LikeView$c;

    if-eq v1, v2, :cond_5

    if-ne v1, v6, :cond_4

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->l:Lcom/facebook/share/widget/LikeView$d;

    sget-object v2, Lcom/facebook/share/widget/LikeView$d;->f:Lcom/facebook/share/widget/LikeView$d;

    if-ne v1, v2, :cond_4

    goto :goto_3

    :cond_4
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_4

    :cond_5
    :goto_3
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->d:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->e:Lcom/facebook/share/internal/LikeButton;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->d:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->e:Lcom/facebook/share/internal/LikeButton;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :goto_4
    sget-object v1, Lcom/facebook/share/widget/LikeView$b;->a:[I

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->m:Lcom/facebook/share/widget/LikeView$c;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    if-eq v1, v5, :cond_9

    const/4 v2, 0x2

    if-eq v1, v2, :cond_8

    if-eq v1, v4, :cond_6

    goto :goto_5

    :cond_6
    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->l:Lcom/facebook/share/widget/LikeView$d;

    sget-object v2, Lcom/facebook/share/widget/LikeView$d;->f:Lcom/facebook/share/widget/LikeView$d;

    if-ne v1, v2, :cond_7

    iget v1, p0, Lcom/facebook/share/widget/LikeView;->o:I

    iget v2, p0, Lcom/facebook/share/widget/LikeView;->p:I

    invoke-virtual {v0, v1, v1, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_5

    :cond_7
    iget v1, p0, Lcom/facebook/share/widget/LikeView;->p:I

    iget v2, p0, Lcom/facebook/share/widget/LikeView;->o:I

    invoke-virtual {v0, v1, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_5

    :cond_8
    iget v1, p0, Lcom/facebook/share/widget/LikeView;->o:I

    iget v2, p0, Lcom/facebook/share/widget/LikeView;->p:I

    invoke-virtual {v0, v1, v2, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_5

    :cond_9
    iget v1, p0, Lcom/facebook/share/widget/LikeView;->o:I

    iget v2, p0, Lcom/facebook/share/widget/LikeView;->p:I

    invoke-virtual {v0, v1, v1, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    :cond_a
    :goto_5
    return-void
.end method

.method public final v()V
    .locals 3

    iget-boolean v0, p0, Lcom/facebook/share/widget/LikeView;->r:Z

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->h:Lcom/facebook/share/internal/a;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->e:Lcom/facebook/share/internal/LikeButton;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/facebook/share/internal/LikeButton;->setSelected(Z)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->g:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->f:Lcom/facebook/share/internal/LikeBoxCountView;

    invoke-virtual {v1, v2}, Lcom/facebook/share/internal/LikeBoxCountView;->setText(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->e:Lcom/facebook/share/internal/LikeButton;

    invoke-virtual {v1}, Lcom/facebook/share/internal/a;->S()Z

    move-result v1

    invoke-virtual {v2, v1}, Lcom/facebook/share/internal/LikeButton;->setSelected(Z)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->g:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->h:Lcom/facebook/share/internal/a;

    invoke-virtual {v2}, Lcom/facebook/share/internal/a;->Q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->f:Lcom/facebook/share/internal/LikeBoxCountView;

    iget-object v2, p0, Lcom/facebook/share/widget/LikeView;->h:Lcom/facebook/share/internal/a;

    invoke-virtual {v2}, Lcom/facebook/share/internal/a;->O()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/share/internal/LikeBoxCountView;->setText(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->h:Lcom/facebook/share/internal/a;

    invoke-virtual {v1}, Lcom/facebook/share/internal/a;->k0()Z

    move-result v1

    and-int/2addr v0, v1

    :goto_0
    invoke-super {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    iget-object v1, p0, Lcom/facebook/share/widget/LikeView;->e:Lcom/facebook/share/internal/LikeButton;

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p0}, Lcom/facebook/share/widget/LikeView;->u()V

    return-void
.end method
