.class public Lzendesk/belvedere/FloatingActionMenu;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/belvedere/FloatingActionMenu$c;
    }
.end annotation


# instance fields
.field public b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

.field public c:Landroid/view/LayoutInflater;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LsE3<",
            "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;",
            "Landroid/view/View$OnClickListener;",
            ">;>;"
        }
    .end annotation
.end field

.field public e:Landroid/view/View$OnClickListener;

.field public f:Z

.field public g:Z

.field public h:I

.field public final i:Lzendesk/belvedere/FloatingActionMenu$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzendesk/belvedere/FloatingActionMenu;->g:Z

    new-instance v0, Lzendesk/belvedere/FloatingActionMenu$b;

    invoke-direct {v0, p0}, Lzendesk/belvedere/FloatingActionMenu$b;-><init>(Lzendesk/belvedere/FloatingActionMenu;)V

    iput-object v0, p0, Lzendesk/belvedere/FloatingActionMenu;->i:Lzendesk/belvedere/FloatingActionMenu$c;

    invoke-virtual {p0, p1}, Lzendesk/belvedere/FloatingActionMenu;->h(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    const/4 p2, 0x1

    iput-boolean p2, p0, Lzendesk/belvedere/FloatingActionMenu;->g:Z

    new-instance p2, Lzendesk/belvedere/FloatingActionMenu$b;

    invoke-direct {p2, p0}, Lzendesk/belvedere/FloatingActionMenu$b;-><init>(Lzendesk/belvedere/FloatingActionMenu;)V

    iput-object p2, p0, Lzendesk/belvedere/FloatingActionMenu;->i:Lzendesk/belvedere/FloatingActionMenu$c;

    invoke-virtual {p0, p1}, Lzendesk/belvedere/FloatingActionMenu;->h(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    const/4 p2, 0x1

    iput-boolean p2, p0, Lzendesk/belvedere/FloatingActionMenu;->g:Z

    new-instance p2, Lzendesk/belvedere/FloatingActionMenu$b;

    invoke-direct {p2, p0}, Lzendesk/belvedere/FloatingActionMenu$b;-><init>(Lzendesk/belvedere/FloatingActionMenu;)V

    iput-object p2, p0, Lzendesk/belvedere/FloatingActionMenu;->i:Lzendesk/belvedere/FloatingActionMenu$c;

    invoke-virtual {p0, p1}, Lzendesk/belvedere/FloatingActionMenu;->h(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a(Lzendesk/belvedere/FloatingActionMenu;Landroid/view/View;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lzendesk/belvedere/FloatingActionMenu;->d(Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic b(Lzendesk/belvedere/FloatingActionMenu;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public c(IIILandroid/view/View$OnClickListener;)V
    .locals 3

    iget-object v0, p0, Lzendesk/belvedere/FloatingActionMenu;->c:Landroid/view/LayoutInflater;

    sget v1, LCk4;->belvedere_floating_action_menu_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0, p4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v1, LBf4;->belvedere_floating_action_menu_item_icon_color:I

    invoke-virtual {p0, p1, v1}, Lzendesk/belvedere/FloatingActionMenu;->e(II)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, p2}, Landroid/view/View;->setId(I)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object p2, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    invoke-static {v0, p4}, LsE3;->a(Ljava/lang/Object;Ljava/lang/Object;)LsE3;

    move-result-object p4

    invoke-interface {p2, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 p4, 0x1

    if-ne p2, p4, :cond_0

    iget-object p2, p0, Lzendesk/belvedere/FloatingActionMenu;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    sget p4, LBf4;->belvedere_floating_action_menu_icon_color:I

    invoke-virtual {p0, p1, p4}, Lzendesk/belvedere/FloatingActionMenu;->e(II)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LsE3;

    iget-object p1, p1, LsE3;->a:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    invoke-virtual {p0, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    sget p2, LGg4;->belvedere_fam_icon_add_file:I

    sget p3, LBf4;->belvedere_floating_action_menu_icon_color:I

    invoke-virtual {p0, p2, p3}, Lzendesk/belvedere/FloatingActionMenu;->e(II)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p3, Lkl4;->belvedere_fam_desc_expand_fam:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    :goto_0
    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lzendesk/belvedere/FloatingActionMenu;->g()V

    :cond_2
    return-void
.end method

.method public final d(Landroid/view/View;I)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final e(II)Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, LP61;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {v0, p2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p2

    invoke-static {p1, p2}, LP61;->n(Landroid/graphics/drawable/Drawable;I)V

    return-object p1
.end method

.method public final f()V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lzendesk/belvedere/FloatingActionMenu;->i(Z)V

    invoke-virtual {p0, v0}, Lzendesk/belvedere/FloatingActionMenu;->k(Z)V

    iget-object v0, p0, Lzendesk/belvedere/FloatingActionMenu;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lkl4;->belvedere_fam_desc_collapse_fam:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lzendesk/belvedere/FloatingActionMenu;->g:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzendesk/belvedere/FloatingActionMenu;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    sget v1, LGg4;->belvedere_fam_icon_add_file:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageResource(I)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lzendesk/belvedere/FloatingActionMenu;->g:Z

    return-void
.end method

.method public final h(Landroid/content/Context;)V
    .locals 1

    sget v0, LCk4;->belvedere_floating_action_menu:I

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {p0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v0, LSg4;->floating_action_menu_fab:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iput-object v0, p0, Lzendesk/belvedere/FloatingActionMenu;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->c:Landroid/view/LayoutInflater;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, LQi4;->belvedere_fam_animation_delay_subsequent_item:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    iput p1, p0, Lzendesk/belvedere/FloatingActionMenu;->h:I

    invoke-virtual {p0}, Lzendesk/belvedere/FloatingActionMenu;->l()V

    :cond_0
    return-void
.end method

.method public final i(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    sget v0, LGg4;->belvedere_fam_icon_close:I

    invoke-virtual {p1, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageResource(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    sget v0, LGg4;->belvedere_fam_icon_add_file:I

    invoke-virtual {p1, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageResource(I)V

    :goto_0
    return-void
.end method

.method public final j()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lzendesk/belvedere/FloatingActionMenu;->i(Z)V

    invoke-virtual {p0, v0}, Lzendesk/belvedere/FloatingActionMenu;->k(Z)V

    iget-object v0, p0, Lzendesk/belvedere/FloatingActionMenu;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lkl4;->belvedere_fam_desc_expand_fam:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final k(Z)V
    .locals 7

    iget-object v0, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzendesk/belvedere/FloatingActionMenu;->l()V

    return-void

    :cond_0
    const/4 v0, 0x2

    const-wide/16 v1, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LsE3;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcf4;->belvedere_show_menu_item:I

    invoke-static {v4, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/view/animation/Animation;->setRepeatMode(I)V

    invoke-virtual {v4, v1, v2}, Landroid/view/animation/Animation;->setStartOffset(J)V

    iget-object v5, v3, LsE3;->a:Ljava/lang/Object;

    if-eqz v5, :cond_1

    check-cast v5, Landroid/view/View;

    const/4 v6, 0x0

    invoke-virtual {p0, v5, v6}, Lzendesk/belvedere/FloatingActionMenu;->d(Landroid/view/View;I)V

    iget-object v3, v3, LsE3;->a:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v3, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_1
    iget v3, p0, Lzendesk/belvedere/FloatingActionMenu;->h:I

    int-to-long v3, v3

    add-long/2addr v1, v3

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    const/4 v3, 0x0

    :goto_1
    if-ltz p1, :cond_4

    iget-object v3, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LsE3;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcf4;->belvedere_hide_menu_item:I

    invoke-static {v4, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/view/animation/Animation;->setRepeatMode(I)V

    invoke-virtual {v4, v1, v2}, Landroid/view/animation/Animation;->setStartOffset(J)V

    new-instance v5, Lzendesk/belvedere/FloatingActionMenu$a;

    invoke-direct {v5, p0, v3}, Lzendesk/belvedere/FloatingActionMenu$a;-><init>(Lzendesk/belvedere/FloatingActionMenu;LsE3;)V

    invoke-virtual {v4, v5}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    iget-object v3, v3, LsE3;->a:Ljava/lang/Object;

    if-eqz v3, :cond_3

    check-cast v3, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v3, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_3
    iget v3, p0, Lzendesk/belvedere/FloatingActionMenu;->h:I

    int-to-long v5, v3

    add-long/2addr v1, v5

    add-int/lit8 p1, p1, -0x1

    move-object v3, v4

    goto :goto_1

    :cond_4
    if-eqz v3, :cond_5

    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->i:Lzendesk/belvedere/FloatingActionMenu$c;

    invoke-virtual {v3, p1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_5
    return-void
.end method

.method public l()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzendesk/belvedere/FloatingActionMenu;->g:Z

    iget-boolean v0, p0, Lzendesk/belvedere/FloatingActionMenu;->f:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzendesk/belvedere/FloatingActionMenu;->f()V

    :cond_0
    iget-object v0, p0, Lzendesk/belvedere/FloatingActionMenu;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    sget v1, LGg4;->belvedere_fam_icon_send:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageResource(I)V

    return-void
.end method

.method public final m()V
    .locals 1

    iget-boolean v0, p0, Lzendesk/belvedere/FloatingActionMenu;->f:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lzendesk/belvedere/FloatingActionMenu;->f:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzendesk/belvedere/FloatingActionMenu;->j()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lzendesk/belvedere/FloatingActionMenu;->f()V

    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Lzendesk/belvedere/FloatingActionMenu;->g:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->e:Landroid/view/View$OnClickListener;

    if-eqz p1, :cond_0

    invoke-interface {p1, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    return-void

    :cond_0
    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->d:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LsE3;

    iget-object v0, p1, LsE3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/View$OnClickListener;

    iget-object p1, p1, LsE3;->a:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lzendesk/belvedere/FloatingActionMenu;->m()V

    :goto_0
    return-void
.end method

.method public setOnSendClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/FloatingActionMenu;->e:Landroid/view/View$OnClickListener;

    return-void
.end method
