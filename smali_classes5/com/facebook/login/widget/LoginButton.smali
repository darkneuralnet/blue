.class public Lcom/facebook/login/widget/LoginButton;
.super Lcom/facebook/FacebookButtonBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/login/widget/LoginButton$e;,
        Lcom/facebook/login/widget/LoginButton$d;,
        Lcom/facebook/login/widget/LoginButton$f;
    }
.end annotation


# instance fields
.field public j:Z

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Lcom/facebook/login/widget/LoginButton$d;

.field public n:Ljava/lang/String;

.field public o:Z

.field public p:Lcom/facebook/login/widget/a$e;

.field public q:Lcom/facebook/login/widget/LoginButton$f;

.field public r:J

.field public s:Lcom/facebook/login/widget/a;

.field public t:LJ1;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "fb_login_button_create"

    const-string v6, "fb_login_button_did_tap"

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/FacebookButtonBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/facebook/login/widget/LoginButton$d;

    invoke-direct {p1}, Lcom/facebook/login/widget/LoginButton$d;-><init>()V

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    const-string p1, "fb_login_view_usage"

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->n:Ljava/lang/String;

    sget-object p1, Lcom/facebook/login/widget/a$e;->b:Lcom/facebook/login/widget/a$e;

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->p:Lcom/facebook/login/widget/a$e;

    const-wide/16 v0, 0x1770

    iput-wide v0, p0, Lcom/facebook/login/widget/LoginButton;->r:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "fb_login_button_create"

    const-string v6, "fb_login_button_did_tap"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/facebook/FacebookButtonBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/facebook/login/widget/LoginButton$d;

    invoke-direct {p1}, Lcom/facebook/login/widget/LoginButton$d;-><init>()V

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    const-string p1, "fb_login_view_usage"

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->n:Ljava/lang/String;

    sget-object p1, Lcom/facebook/login/widget/a$e;->b:Lcom/facebook/login/widget/a$e;

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->p:Lcom/facebook/login/widget/a$e;

    const-wide/16 p1, 0x1770

    iput-wide p1, p0, Lcom/facebook/login/widget/LoginButton;->r:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    const/4 v4, 0x0

    const-string v5, "fb_login_button_create"

    const-string v6, "fb_login_button_did_tap"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/facebook/FacebookButtonBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/facebook/login/widget/LoginButton$d;

    invoke-direct {p1}, Lcom/facebook/login/widget/LoginButton$d;-><init>()V

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    const-string p1, "fb_login_view_usage"

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->n:Ljava/lang/String;

    sget-object p1, Lcom/facebook/login/widget/a$e;->b:Lcom/facebook/login/widget/a$e;

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->p:Lcom/facebook/login/widget/a$e;

    const-wide/16 p1, 0x1770

    iput-wide p1, p0, Lcom/facebook/login/widget/LoginButton;->r:J

    return-void
.end method

.method public static synthetic A(Lcom/facebook/login/widget/LoginButton;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/login/widget/LoginButton;->j:Z

    return p0
.end method

.method public static synthetic t(Lcom/facebook/login/widget/LoginButton;LMk1;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/login/widget/LoginButton;->N(LMk1;)V

    return-void
.end method

.method public static synthetic u(Lcom/facebook/login/widget/LoginButton;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->f()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lcom/facebook/login/widget/LoginButton;)V
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/login/widget/LoginButton;->M()V

    return-void
.end method

.method public static synthetic w(Lcom/facebook/login/widget/LoginButton;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/FacebookButtonBase;->d(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic x(Lcom/facebook/login/widget/LoginButton;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/login/widget/LoginButton;->n:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic y(Lcom/facebook/login/widget/LoginButton;)Lcom/facebook/login/widget/LoginButton$d;
    .locals 0

    iget-object p0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    return-object p0
.end method

.method public static synthetic z(Lcom/facebook/login/widget/LoginButton;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->f()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final B()V
    .locals 3

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Lcom/facebook/login/widget/LoginButton$c;->a:[I

    iget-object v1, p0, Lcom/facebook/login/widget/LoginButton;->q:Lcom/facebook/login/widget/LoginButton$f;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcl4;->com_facebook_tooltip_default:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/login/widget/LoginButton;->D(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lyi6;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/facebook/a;->o()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/facebook/login/widget/LoginButton$a;

    invoke-direct {v2, p0, v0}, Lcom/facebook/login/widget/LoginButton$a;-><init>(Lcom/facebook/login/widget/LoginButton;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public C()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->s:Lcom/facebook/login/widget/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/login/widget/a;->d()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/login/widget/LoginButton;->s:Lcom/facebook/login/widget/a;

    :cond_0
    return-void
.end method

.method public final D(Ljava/lang/String;)V
    .locals 2

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    new-instance v0, Lcom/facebook/login/widget/a;

    invoke-direct {v0, p1, p0}, Lcom/facebook/login/widget/a;-><init>(Ljava/lang/String;Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/login/widget/LoginButton;->s:Lcom/facebook/login/widget/a;

    iget-object p1, p0, Lcom/facebook/login/widget/LoginButton;->p:Lcom/facebook/login/widget/a$e;

    invoke-virtual {v0, p1}, Lcom/facebook/login/widget/a;->g(Lcom/facebook/login/widget/a$e;)V

    iget-object p1, p0, Lcom/facebook/login/widget/LoginButton;->s:Lcom/facebook/login/widget/a;

    iget-wide v0, p0, Lcom/facebook/login/widget/LoginButton;->r:J

    invoke-virtual {p1, v0, v1}, Lcom/facebook/login/widget/a;->f(J)V

    iget-object p1, p0, Lcom/facebook/login/widget/LoginButton;->s:Lcom/facebook/login/widget/a;

    invoke-virtual {p1}, Lcom/facebook/login/widget/a;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public E()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-virtual {v0}, Lcom/facebook/login/widget/LoginButton$d;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public F()LrW0;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-virtual {v0}, Lcom/facebook/login/widget/LoginButton$d;->c()LrW0;

    move-result-object v0

    return-object v0
.end method

.method public G()Lay2;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-virtual {v0}, Lcom/facebook/login/widget/LoginButton$d;->d()Lay2;

    move-result-object v0

    return-object v0
.end method

.method public H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-virtual {v0}, Lcom/facebook/login/widget/LoginButton$d;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public I()Lcom/facebook/login/widget/LoginButton$e;
    .locals 1

    new-instance v0, Lcom/facebook/login/widget/LoginButton$e;

    invoke-direct {v0, p0}, Lcom/facebook/login/widget/LoginButton$e;-><init>(Lcom/facebook/login/widget/LoginButton;)V

    return-object v0
.end method

.method public J()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-virtual {v0}, Lcom/facebook/login/widget/LoginButton$d;->f()Z

    move-result v0

    return v0
.end method

.method public final K(Ljava/lang/String;)I
    .locals 3

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/facebook/FacebookButtonBase;->m(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->getCompoundPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundDrawablePadding()I

    move-result v2

    add-int/2addr v0, v2

    add-int/2addr v0, p1

    invoke-virtual {p0}, Lcom/facebook/FacebookButtonBase;->getCompoundPaddingRight()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v0, p1

    return v0

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return v1
.end method

.method public final L(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Lcom/facebook/login/widget/LoginButton$f;->g:Lcom/facebook/login/widget/LoginButton$f;

    iput-object v0, p0, Lcom/facebook/login/widget/LoginButton;->q:Lcom/facebook/login/widget/LoginButton$f;

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v0, LRl4;->com_facebook_login_view:[I

    invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget p2, LRl4;->com_facebook_login_view_com_facebook_confirm_logout:I

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/facebook/login/widget/LoginButton;->j:Z

    sget p2, LRl4;->com_facebook_login_view_com_facebook_login_text:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/facebook/login/widget/LoginButton;->k:Ljava/lang/String;

    sget p2, LRl4;->com_facebook_login_view_com_facebook_logout_text:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/facebook/login/widget/LoginButton;->l:Ljava/lang/String;

    sget p2, LRl4;->com_facebook_login_view_com_facebook_tooltip_mode:I

    sget-object p3, Lcom/facebook/login/widget/LoginButton$f;->g:Lcom/facebook/login/widget/LoginButton$f;

    invoke-virtual {p3}, Lcom/facebook/login/widget/LoginButton$f;->b()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-static {p2}, Lcom/facebook/login/widget/LoginButton$f;->a(I)Lcom/facebook/login/widget/LoginButton$f;

    move-result-object p2

    iput-object p2, p0, Lcom/facebook/login/widget/LoginButton;->q:Lcom/facebook/login/widget/LoginButton$f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public final M()V
    .locals 4

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {}, Lcom/facebook/AccessToken;->o()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/login/widget/LoginButton;->l:Ljava/lang/String;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    sget v1, Lcl4;->com_facebook_loginview_log_out_button:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/facebook/login/widget/LoginButton;->k:Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_3
    sget v1, Lcl4;->com_facebook_loginview_log_in_button_continue:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1}, Lcom/facebook/login/widget/LoginButton;->K(Ljava/lang/String;)I

    move-result v3

    if-le v3, v2, :cond_4

    sget v1, Lcl4;->com_facebook_loginview_log_in_button:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    :cond_4
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public final N(LMk1;)V
    .locals 1

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p1}, LMk1;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, LMk1;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/facebook/login/widget/LoginButton;->D(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public e(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/FacebookButtonBase;->e(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    invoke-virtual {p0}, Lcom/facebook/login/widget/LoginButton;->I()Lcom/facebook/login/widget/LoginButton$e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/FacebookButtonBase;->r(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/facebook/login/widget/LoginButton;->L(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, LHf4;->com_facebook_blue:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    const-string p1, "Continue with Facebook"

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->k:Ljava/lang/String;

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/facebook/login/widget/LoginButton$b;

    invoke-direct {p1, p0}, Lcom/facebook/login/widget/LoginButton$b;-><init>(Lcom/facebook/login/widget/LoginButton;)V

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->t:LJ1;

    :goto_0
    invoke-virtual {p0}, Lcom/facebook/login/widget/LoginButton;->M()V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lvg4;->com_facebook_button_icon:I

    invoke-static {p1, p2}, Lvi;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p2, p2}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public h()I
    .locals 1

    sget v0, LGl4;->com_facebook_loginview_default_style:I

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-super {p0}, Lcom/facebook/FacebookButtonBase;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->t:LJ1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LJ1;->c()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->t:LJ1;

    invoke-virtual {v0}, LJ1;->e()V

    invoke-virtual {p0}, Lcom/facebook/login/widget/LoginButton;->M()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->t:LJ1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LJ1;->f()V

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/login/widget/LoginButton;->C()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-super {p0, p1}, Lcom/facebook/FacebookButtonBase;->onDraw(Landroid/graphics/Canvas;)V

    iget-boolean p1, p0, Lcom/facebook/login/widget/LoginButton;->o:Z

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/login/widget/LoginButton;->o:Z

    invoke-virtual {p0}, Lcom/facebook/login/widget/LoginButton;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 1

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    invoke-virtual {p0}, Lcom/facebook/login/widget/LoginButton;->M()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 4

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object p2

    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    move-result v0

    iget v1, p2, Landroid/graphics/Paint$FontMetrics;->top:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget p2, p2, Landroid/graphics/Paint$FontMetrics;->bottom:F

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    add-float/2addr v1, p2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int p2, v1

    add-int/2addr v0, p2

    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    move-result p2

    add-int/2addr v0, p2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    iget-object v1, p0, Lcom/facebook/login/widget/LoginButton;->k:Ljava/lang/String;

    if-nez v1, :cond_1

    sget v1, Lcl4;->com_facebook_loginview_log_in_button_continue:I

    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/login/widget/LoginButton;->K(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2, p1}, Landroid/view/View;->resolveSize(II)I

    move-result v3

    if-ge v3, v2, :cond_1

    sget v1, Lcl4;->com_facebook_loginview_log_in_button:I

    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {p0, v1}, Lcom/facebook/login/widget/LoginButton;->K(Ljava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/login/widget/LoginButton;->l:Ljava/lang/String;

    if-nez v2, :cond_2

    sget v2, Lcl4;->com_facebook_loginview_log_out_button:I

    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-virtual {p0, v2}, Lcom/facebook/login/widget/LoginButton;->K(Ljava/lang/String;)I

    move-result p2

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p2, p1}, Landroid/view/View;->resolveSize(II)I

    move-result p1

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public onVisibilityChanged(Landroid/view/View;I)V
    .locals 1

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/facebook/login/widget/LoginButton;->C()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public setAuthType(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-virtual {v0, p1}, Lcom/facebook/login/widget/LoginButton$d;->g(Ljava/lang/String;)V

    return-void
.end method

.method public setDefaultAudience(LrW0;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-virtual {v0, p1}, Lcom/facebook/login/widget/LoginButton$d;->h(LrW0;)V

    return-void
.end method

.method public setLoginBehavior(Lay2;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-virtual {v0, p1}, Lcom/facebook/login/widget/LoginButton$d;->i(Lay2;)V

    return-void
.end method

.method public setLoginText(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->k:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/facebook/login/widget/LoginButton;->M()V

    return-void
.end method

.method public setLogoutText(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->l:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/facebook/login/widget/LoginButton;->M()V

    return-void
.end method

.method public setMessengerPageId(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-virtual {v0, p1}, Lcom/facebook/login/widget/LoginButton$d;->j(Ljava/lang/String;)V

    return-void
.end method

.method public setPermissions(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-virtual {v0, p1}, Lcom/facebook/login/widget/LoginButton$d;->k(Ljava/util/List;)V

    return-void
.end method

.method public varargs setPermissions([Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/login/widget/LoginButton$d;->k(Ljava/util/List;)V

    return-void
.end method

.method public setPublishPermissions(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-virtual {v0, p1}, Lcom/facebook/login/widget/LoginButton$d;->k(Ljava/util/List;)V

    return-void
.end method

.method public varargs setPublishPermissions([Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/login/widget/LoginButton$d;->k(Ljava/util/List;)V

    return-void
.end method

.method public setReadPermissions(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-virtual {v0, p1}, Lcom/facebook/login/widget/LoginButton$d;->k(Ljava/util/List;)V

    return-void
.end method

.method public varargs setReadPermissions([Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/login/widget/LoginButton$d;->k(Ljava/util/List;)V

    return-void
.end method

.method public setResetMessengerState(Z)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton;->m:Lcom/facebook/login/widget/LoginButton$d;

    invoke-virtual {v0, p1}, Lcom/facebook/login/widget/LoginButton$d;->l(Z)V

    return-void
.end method

.method public setToolTipDisplayTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/facebook/login/widget/LoginButton;->r:J

    return-void
.end method

.method public setToolTipMode(Lcom/facebook/login/widget/LoginButton$f;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->q:Lcom/facebook/login/widget/LoginButton$f;

    return-void
.end method

.method public setToolTipStyle(Lcom/facebook/login/widget/a$e;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton;->p:Lcom/facebook/login/widget/a$e;

    return-void
.end method
