.class public Lzendesk/belvedere/h;
.super Landroid/widget/PopupWindow;
.source "SourceFile"

# interfaces
.implements Lzendesk/belvedere/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/belvedere/h$g;
    }
.end annotation


# instance fields
.field public final a:Lzendesk/belvedere/g;

.field public final b:Lzendesk/belvedere/c;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lzendesk/belvedere/KeyboardHelper;

.field public e:Landroid/view/View;

.field public f:Landroid/view/View;

.field public g:Landroid/view/View;

.field public h:Landroid/view/View;

.field public i:Lzendesk/belvedere/FloatingActionMenu;

.field public j:Landroidx/recyclerview/widget/RecyclerView;

.field public k:Landroidx/appcompat/widget/Toolbar;

.field public l:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public m:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/view/View;Lzendesk/belvedere/b;Lzendesk/belvedere/BelvedereUi$UiConfig;)V
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-direct {p0, p2, v0, v0, v1}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {p0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    invoke-virtual {p0, p2}, Lzendesk/belvedere/h;->p(Landroid/view/View;)V

    iput-object p1, p0, Lzendesk/belvedere/h;->m:Landroid/app/Activity;

    new-instance p1, Lzendesk/belvedere/c;

    invoke-direct {p1}, Lzendesk/belvedere/c;-><init>()V

    iput-object p1, p0, Lzendesk/belvedere/h;->b:Lzendesk/belvedere/c;

    invoke-virtual {p3}, Lzendesk/belvedere/b;->A9()Lzendesk/belvedere/KeyboardHelper;

    move-result-object p1

    iput-object p1, p0, Lzendesk/belvedere/h;->d:Lzendesk/belvedere/KeyboardHelper;

    invoke-virtual {p4}, Lzendesk/belvedere/BelvedereUi$UiConfig;->e()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lzendesk/belvedere/h;->c:Ljava/util/List;

    new-instance p1, Lzendesk/belvedere/e;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2, p4}, Lzendesk/belvedere/e;-><init>(Landroid/content/Context;Lzendesk/belvedere/BelvedereUi$UiConfig;)V

    new-instance p2, Lzendesk/belvedere/g;

    invoke-direct {p2, p1, p0, p3}, Lzendesk/belvedere/g;-><init>(LXX1;Lzendesk/belvedere/f;Lzendesk/belvedere/b;)V

    iput-object p2, p0, Lzendesk/belvedere/h;->a:Lzendesk/belvedere/g;

    invoke-virtual {p2}, Lzendesk/belvedere/g;->f()V

    return-void
.end method

.method public static synthetic j(Lzendesk/belvedere/h;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/h;->l:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    return-object p0
.end method

.method public static synthetic k(Lzendesk/belvedere/h;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/h;->e:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic l(Lzendesk/belvedere/h;)Lzendesk/belvedere/KeyboardHelper;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/h;->d:Lzendesk/belvedere/KeyboardHelper;

    return-object p0
.end method

.method public static synthetic m(Lzendesk/belvedere/h;)Lzendesk/belvedere/g;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/h;->a:Lzendesk/belvedere/g;

    return-object p0
.end method

.method public static synthetic n(Lzendesk/belvedere/h;)Landroidx/appcompat/widget/Toolbar;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/h;->k:Landroidx/appcompat/widget/Toolbar;

    return-object p0
.end method

.method public static synthetic o(Lzendesk/belvedere/h;F)V
    .locals 0

    invoke-virtual {p0, p1}, Lzendesk/belvedere/h;->w(F)V

    return-void
.end method

.method public static v(Landroid/app/Activity;Landroid/view/ViewGroup;Lzendesk/belvedere/b;Lzendesk/belvedere/BelvedereUi$UiConfig;)Lzendesk/belvedere/h;
    .locals 3

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, LCk4;->belvedere_image_stream:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lzendesk/belvedere/h;

    invoke-direct {v1, p0, v0, p2, p3}, Lzendesk/belvedere/h;-><init>(Landroid/app/Activity;Landroid/view/View;Lzendesk/belvedere/b;Lzendesk/belvedere/BelvedereUi$UiConfig;)V

    const/16 p0, 0x30

    invoke-virtual {v1, p1, p0, v2, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    return-object v1
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/List;ZZLzendesk/belvedere/c$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;ZZ",
            "Lzendesk/belvedere/c$b;",
            ")V"
        }
    .end annotation

    if-nez p3, :cond_0

    iget-object p3, p0, Lzendesk/belvedere/h;->d:Lzendesk/belvedere/KeyboardHelper;

    invoke-virtual {p3}, Lzendesk/belvedere/KeyboardHelper;->k()Landroid/widget/EditText;

    move-result-object p3

    invoke-static {p3}, Lzendesk/belvedere/KeyboardHelper;->v(Landroid/widget/EditText;)V

    :cond_0
    iget-object p3, p0, Lzendesk/belvedere/h;->e:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    const/4 v0, -0x1

    iput v0, p3, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v0, p0, Lzendesk/belvedere/h;->e:Landroid/view/View;

    invoke-virtual {v0, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    if-eqz p4, :cond_1

    iget-object p3, p0, Lzendesk/belvedere/h;->b:Lzendesk/belvedere/c;

    invoke-static {p5}, Lzendesk/belvedere/d;->a(Lzendesk/belvedere/c$b;)Lzendesk/belvedere/d$c;

    move-result-object p4

    invoke-virtual {p3, p4}, Lzendesk/belvedere/c;->o(Lzendesk/belvedere/d$b;)V

    :cond_1
    iget-object p3, p0, Lzendesk/belvedere/h;->b:Lzendesk/belvedere/c;

    iget-object p4, p0, Lzendesk/belvedere/h;->e:Landroid/view/View;

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-static {p1, p5, p4}, Lzendesk/belvedere/d;->b(Ljava/util/List;Lzendesk/belvedere/c$b;Landroid/content/Context;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p3, p1}, Lzendesk/belvedere/c;->p(Ljava/util/List;)V

    iget-object p1, p0, Lzendesk/belvedere/h;->b:Lzendesk/belvedere/c;

    invoke-virtual {p1, p2}, Lzendesk/belvedere/c;->q(Ljava/util/List;)V

    iget-object p1, p0, Lzendesk/belvedere/h;->b:Lzendesk/belvedere/c;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    return-void
.end method

.method public b(Landroid/view/View$OnClickListener;)V
    .locals 4

    iget-object v0, p0, Lzendesk/belvedere/h;->i:Lzendesk/belvedere/FloatingActionMenu;

    if-eqz v0, :cond_0

    sget v1, LGg4;->belvedere_ic_file:I

    sget v2, LSg4;->belvedere_fam_item_documents:I

    sget v3, Lkl4;->belvedere_fam_desc_open_gallery:I

    invoke-virtual {v0, v1, v2, v3, p1}, Lzendesk/belvedere/FloatingActionMenu;->c(IIILandroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public c(Landroid/view/View$OnClickListener;)V
    .locals 4

    iget-object v0, p0, Lzendesk/belvedere/h;->i:Lzendesk/belvedere/FloatingActionMenu;

    if-eqz v0, :cond_0

    sget v1, LGg4;->belvedere_ic_collections:I

    sget v2, LSg4;->belvedere_fam_item_google_photos:I

    sget v3, Lkl4;->belvedere_fam_desc_open_google_photos:I

    invoke-virtual {v0, v1, v2, v3, p1}, Lzendesk/belvedere/FloatingActionMenu;->c(IIILandroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public d(Z)V
    .locals 1

    iget-object v0, p0, Lzendesk/belvedere/h;->b:Lzendesk/belvedere/c;

    invoke-virtual {p0, v0}, Lzendesk/belvedere/h;->t(Lzendesk/belvedere/c;)V

    invoke-virtual {p0, p1}, Lzendesk/belvedere/h;->u(Z)V

    invoke-virtual {p0, p1}, Lzendesk/belvedere/h;->q(Z)V

    iget-object p1, p0, Lzendesk/belvedere/h;->m:Landroid/app/Activity;

    iget-object v0, p0, Lzendesk/belvedere/h;->c:Ljava/util/List;

    invoke-virtual {p0, p1, v0}, Lzendesk/belvedere/h;->s(Landroid/app/Activity;Ljava/util/List;)V

    iget-object p1, p0, Lzendesk/belvedere/h;->i:Lzendesk/belvedere/FloatingActionMenu;

    invoke-virtual {p0, p1}, Lzendesk/belvedere/h;->r(Lzendesk/belvedere/FloatingActionMenu;)V

    return-void
.end method

.method public dismiss()V
    .locals 1

    invoke-super {p0}, Landroid/widget/PopupWindow;->dismiss()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lzendesk/belvedere/h;->w(F)V

    iget-object v0, p0, Lzendesk/belvedere/h;->a:Lzendesk/belvedere/g;

    invoke-virtual {v0}, Lzendesk/belvedere/g;->e()V

    return-void
.end method

.method public e(I)V
    .locals 5

    if-lez p1, :cond_0

    iget-object v0, p0, Lzendesk/belvedere/h;->m:Landroid/app/Activity;

    sget v1, Lkl4;->belvedere_image_stream_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lzendesk/belvedere/h;->k:Landroidx/appcompat/widget/Toolbar;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, v0

    const-string p1, "%s (%d)"

    invoke-static {v2, p1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/belvedere/h;->k:Landroidx/appcompat/widget/Toolbar;

    sget v0, Lkl4;->belvedere_image_stream_title:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    :goto_0
    return-void
.end method

.method public f(I)V
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, Lzendesk/belvedere/h;->i:Lzendesk/belvedere/FloatingActionMenu;

    invoke-virtual {p1}, Lzendesk/belvedere/FloatingActionMenu;->g()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/belvedere/h;->i:Lzendesk/belvedere/FloatingActionMenu;

    invoke-virtual {p1}, Lzendesk/belvedere/FloatingActionMenu;->l()V

    :goto_0
    return-void
.end method

.method public g(I)V
    .locals 2

    iget-object v0, p0, Lzendesk/belvedere/h;->m:Landroid/app/Activity;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public h()Z
    .locals 4

    iget-object v0, p0, Lzendesk/belvedere/h;->m:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isInMultiWindowMode()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_4

    iget-object v0, p0, Lzendesk/belvedere/h;->m:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isInPictureInPictureMode()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lzendesk/belvedere/h;->m:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->keyboard:I

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Lzendesk/belvedere/h;->m:Landroid/app/Activity;

    const-string v3, "accessibility"

    invoke-virtual {v0, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_3

    const/16 v3, 0x2f

    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    return v1

    :cond_3
    return v2

    :cond_4
    :goto_1
    return v1
.end method

.method public i(Lzendesk/belvedere/MediaIntent;Lzendesk/belvedere/b;)V
    .locals 0

    invoke-virtual {p1, p2}, Lzendesk/belvedere/MediaIntent;->g(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public final p(Landroid/view/View;)V
    .locals 1

    sget v0, LSg4;->bottom_sheet:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lzendesk/belvedere/h;->e:Landroid/view/View;

    sget v0, LSg4;->dismiss_area:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lzendesk/belvedere/h;->f:Landroid/view/View;

    sget v0, LSg4;->image_list:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lzendesk/belvedere/h;->j:Landroidx/recyclerview/widget/RecyclerView;

    sget v0, LSg4;->image_stream_toolbar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    iput-object v0, p0, Lzendesk/belvedere/h;->k:Landroidx/appcompat/widget/Toolbar;

    sget v0, LSg4;->image_stream_toolbar_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lzendesk/belvedere/h;->g:Landroid/view/View;

    sget v0, LSg4;->image_stream_compat_shadow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lzendesk/belvedere/h;->h:Landroid/view/View;

    sget v0, LSg4;->floating_action_menu:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lzendesk/belvedere/FloatingActionMenu;

    iput-object p1, p0, Lzendesk/belvedere/h;->i:Lzendesk/belvedere/FloatingActionMenu;

    return-void
.end method

.method public final q(Z)V
    .locals 4

    iget-object v0, p0, Lzendesk/belvedere/h;->j:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lzendesk/belvedere/h;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LSf4;->belvedere_bottom_sheet_elevation:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lbq6;->E0(Landroid/view/View;F)V

    iget-object v0, p0, Lzendesk/belvedere/h;->e:Landroid/view/View;

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    iput-object v0, p0, Lzendesk/belvedere/h;->l:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    new-instance v1, Lzendesk/belvedere/h$b;

    invoke-direct {v1, p0}, Lzendesk/belvedere/h$b;-><init>(Lzendesk/belvedere/h;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LEi6;->f(Landroid/view/View;Z)V

    const/4 v0, 0x1

    if-nez p1, :cond_0

    iget-object p1, p0, Lzendesk/belvedere/h;->l:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v2, p0, Lzendesk/belvedere/h;->e:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    iget-object v3, p0, Lzendesk/belvedere/h;->d:Lzendesk/belvedere/KeyboardHelper;

    invoke-virtual {v3}, Lzendesk/belvedere/KeyboardHelper;->l()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {p1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->k0(I)V

    iget-object p1, p0, Lzendesk/belvedere/h;->l:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    const/4 v2, 0x4

    invoke-virtual {p1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p0(I)V

    iget-object p1, p0, Lzendesk/belvedere/h;->d:Lzendesk/belvedere/KeyboardHelper;

    new-instance v2, Lzendesk/belvedere/h$c;

    invoke-direct {v2, p0}, Lzendesk/belvedere/h$c;-><init>(Lzendesk/belvedere/h;)V

    invoke-virtual {p1, v2}, Lzendesk/belvedere/KeyboardHelper;->u(Lzendesk/belvedere/KeyboardHelper$d;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/belvedere/h;->l:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o0(Z)V

    iget-object p1, p0, Lzendesk/belvedere/h;->l:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    const/4 v2, 0x3

    invoke-virtual {p1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p0(I)V

    iget-object p1, p0, Lzendesk/belvedere/h;->m:Landroid/app/Activity;

    invoke-static {p1}, Lzendesk/belvedere/KeyboardHelper;->q(Landroid/app/Activity;)V

    :goto_0
    iget-object p1, p0, Lzendesk/belvedere/h;->j:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    iget-object p1, p0, Lzendesk/belvedere/h;->e:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final r(Lzendesk/belvedere/FloatingActionMenu;)V
    .locals 1

    new-instance v0, Lzendesk/belvedere/h$d;

    invoke-direct {v0, p0}, Lzendesk/belvedere/h$d;-><init>(Lzendesk/belvedere/h;)V

    invoke-virtual {p1, v0}, Lzendesk/belvedere/FloatingActionMenu;->setOnSendClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final s(Landroid/app/Activity;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/belvedere/h;->f:Landroid/view/View;

    new-instance v1, Lzendesk/belvedere/h$e;

    invoke-direct {v1, p0, p2, p1}, Lzendesk/belvedere/h$e;-><init>(Lzendesk/belvedere/h;Ljava/util/List;Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public final t(Lzendesk/belvedere/c;)V
    .locals 3

    iget-object v0, p0, Lzendesk/belvedere/h;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LQi4;->belvedere_image_stream_column_count:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    new-instance v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;-><init>(II)V

    iget-object v0, p0, Lzendesk/belvedere/h;->j:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object v0, p0, Lzendesk/belvedere/h;->j:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    iget-object v0, p0, Lzendesk/belvedere/h;->j:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    iget-object v0, p0, Lzendesk/belvedere/h;->j:Landroidx/recyclerview/widget/RecyclerView;

    const/high16 v1, 0x100000

    invoke-virtual {v0, v1}, Landroid/view/View;->setDrawingCacheQuality(I)V

    new-instance v0, Landroidx/recyclerview/widget/g;

    invoke-direct {v0}, Landroidx/recyclerview/widget/g;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/u;->setSupportsChangeAnimations(Z)V

    iget-object v1, p0, Lzendesk/belvedere/h;->j:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    iget-object v0, p0, Lzendesk/belvedere/h;->j:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    return-void
.end method

.method public final u(Z)V
    .locals 3

    iget-object v0, p0, Lzendesk/belvedere/h;->k:Landroidx/appcompat/widget/Toolbar;

    sget v1, LGg4;->belvedere_ic_close:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    iget-object v0, p0, Lzendesk/belvedere/h;->k:Landroidx/appcompat/widget/Toolbar;

    sget v1, Lkl4;->belvedere_toolbar_desc_collapse:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(I)V

    iget-object v0, p0, Lzendesk/belvedere/h;->k:Landroidx/appcompat/widget/Toolbar;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lzendesk/belvedere/h;->k:Landroidx/appcompat/widget/Toolbar;

    new-instance v1, Lzendesk/belvedere/h$a;

    invoke-direct {v1, p0, p1}, Lzendesk/belvedere/h$a;-><init>(Lzendesk/belvedere/h;Z)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lzendesk/belvedere/h;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;

    if-eqz v0, :cond_0

    new-instance v1, Lzendesk/belvedere/h$g;

    xor-int/lit8 p1, p1, 0x1

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lzendesk/belvedere/h$g;-><init>(Lzendesk/belvedere/h;ZLzendesk/belvedere/h$a;)V

    invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->q(Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;)V

    :cond_0
    return-void
.end method

.method public final w(F)V
    .locals 7

    iget-object v0, p0, Lzendesk/belvedere/h;->k:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LBf4;->belvedere_image_stream_status_bar_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iget-object v1, p0, Lzendesk/belvedere/h;->k:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Llf4;->colorPrimaryDark:I

    invoke-static {v1, v2}, LEi6;->a(Landroid/content/Context;I)I

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float p1, p1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez p1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v3

    :goto_0
    iget-object v4, p0, Lzendesk/belvedere/h;->m:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    if-eqz p1, :cond_1

    invoke-virtual {v4}, Landroid/view/Window;->getStatusBarColor()I

    move-result v5

    if-ne v5, v1, :cond_2

    new-instance v5, Landroid/animation/ArgbEvaluator;

    invoke-direct {v5}, Landroid/animation/ArgbEvaluator;-><init>()V

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v2

    invoke-static {v5, v6}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, Lzendesk/belvedere/h$f;

    invoke-direct {v1, p0, v4, v0}, Lzendesk/belvedere/h$f;-><init>(Lzendesk/belvedere/h;Landroid/view/Window;Landroid/animation/ValueAnimator;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_1

    :cond_1
    invoke-virtual {v4, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_2
    :goto_1
    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz p1, :cond_3

    const/16 p1, 0x2000

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    :goto_2
    return-void
.end method
