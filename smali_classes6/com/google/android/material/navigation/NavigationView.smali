.class public Lcom/google/android/material/navigation/NavigationView;
.super Lcom/google/android/material/internal/ScrimInsetsFrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/navigation/NavigationView$SavedState;,
        Lcom/google/android/material/navigation/NavigationView$c;
    }
.end annotation


# static fields
.field public static final v:[I

.field public static final w:[I

.field public static final x:I


# instance fields
.field public final i:LV03;

.field public final j:LW03;

.field public k:Lcom/google/android/material/navigation/NavigationView$c;

.field public final l:I

.field public final m:[I

.field public n:Landroid/view/MenuInflater;

.field public o:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public p:Z

.field public q:Z

.field public r:I

.field public s:I

.field public t:Landroid/graphics/Path;

.field public final u:Landroid/graphics/RectF;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [I

    const v2, 0x10100a0

    const/4 v3, 0x0

    aput v2, v1, v3

    sput-object v1, Lcom/google/android/material/navigation/NavigationView;->v:[I

    new-array v0, v0, [I

    const v1, -0x101009e

    aput v1, v0, v3

    sput-object v0, Lcom/google/android/material/navigation/NavigationView;->w:[I

    sget v0, Lul4;->Widget_Design_NavigationView:I

    sput v0, Lcom/google/android/material/navigation/NavigationView;->x:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/navigation/NavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Luf4;->navigationViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/navigation/NavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    move/from16 v8, p3

    sget v9, Lcom/google/android/material/navigation/NavigationView;->x:I

    move-object/from16 v1, p1

    invoke-static {v1, v7, v8, v9}, LVM2;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v7, v8}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v10, LW03;

    invoke-direct {v10}, LW03;-><init>()V

    iput-object v10, v0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    const/4 v1, 0x2

    new-array v1, v1, [I

    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->m:[I

    const/4 v11, 0x1

    iput-boolean v11, v0, Lcom/google/android/material/navigation/NavigationView;->p:Z

    iput-boolean v11, v0, Lcom/google/android/material/navigation/NavigationView;->q:Z

    const/4 v12, 0x0

    iput v12, v0, Lcom/google/android/material/navigation/NavigationView;->r:I

    iput v12, v0, Lcom/google/android/material/navigation/NavigationView;->s:I

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->u:Landroid/graphics/RectF;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    new-instance v14, LV03;

    invoke-direct {v14, v13}, LV03;-><init>(Landroid/content/Context;)V

    iput-object v14, v0, Lcom/google/android/material/navigation/NavigationView;->i:LV03;

    sget-object v3, LXl4;->NavigationView:[I

    new-array v6, v12, [I

    move-object v1, v13

    move-object/from16 v2, p2

    move/from16 v4, p3

    move v5, v9

    invoke-static/range {v1 .. v6}, Lo36;->j(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)LZ46;

    move-result-object v1

    sget v2, LXl4;->NavigationView_android_background:I

    invoke-virtual {v1, v2}, LZ46;->s(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, LZ46;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-static {v0, v2}, Lbq6;->A0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    :cond_0
    sget v2, LXl4;->NavigationView_drawerLayoutCornerSize:I

    invoke-virtual {v1, v2, v12}, LZ46;->f(II)I

    move-result v2

    iput v2, v0, Lcom/google/android/material/navigation/NavigationView;->s:I

    sget v2, LXl4;->NavigationView_android_layout_gravity:I

    invoke-virtual {v1, v2, v12}, LZ46;->k(II)I

    move-result v2

    iput v2, v0, Lcom/google/android/material/navigation/NavigationView;->r:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    instance-of v2, v2, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v2, :cond_3

    :cond_1
    invoke-static {v13, v7, v8, v9}, Liy5;->e(Landroid/content/Context;Landroid/util/AttributeSet;II)Liy5$b;

    move-result-object v2

    invoke-virtual {v2}, Liy5$b;->m()Liy5;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    new-instance v4, LPM2;

    invoke-direct {v4, v2}, LPM2;-><init>(Liy5;)V

    instance-of v2, v3, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v2, :cond_2

    check-cast v3, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v2

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v4, v2}, LPM2;->a0(Landroid/content/res/ColorStateList;)V

    :cond_2
    invoke-virtual {v4, v13}, LPM2;->P(Landroid/content/Context;)V

    invoke-static {v0, v4}, Lbq6;->A0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    :cond_3
    sget v2, LXl4;->NavigationView_elevation:I

    invoke-virtual {v1, v2}, LZ46;->s(I)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v1, v2, v12}, LZ46;->f(II)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/NavigationView;->setElevation(F)V

    :cond_4
    sget v2, LXl4;->NavigationView_android_fitsSystemWindows:I

    invoke-virtual {v1, v2, v12}, LZ46;->a(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setFitsSystemWindows(Z)V

    sget v2, LXl4;->NavigationView_android_maxWidth:I

    invoke-virtual {v1, v2, v12}, LZ46;->f(II)I

    move-result v2

    iput v2, v0, Lcom/google/android/material/navigation/NavigationView;->l:I

    sget v2, LXl4;->NavigationView_subheaderColor:I

    invoke-virtual {v1, v2}, LZ46;->s(I)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    invoke-virtual {v1, v2}, LZ46;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    goto :goto_0

    :cond_5
    move-object v2, v4

    :goto_0
    sget v3, LXl4;->NavigationView_subheaderTextAppearance:I

    invoke-virtual {v1, v3}, LZ46;->s(I)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v1, v3, v12}, LZ46;->n(II)I

    move-result v3

    goto :goto_1

    :cond_6
    move v3, v12

    :goto_1
    const v5, 0x1010038

    if-nez v3, :cond_7

    if-nez v2, :cond_7

    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/NavigationView;->d(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    :cond_7
    sget v6, LXl4;->NavigationView_itemIconTint:I

    invoke-virtual {v1, v6}, LZ46;->s(I)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {v1, v6}, LZ46;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v5

    goto :goto_2

    :cond_8
    invoke-virtual {v0, v5}, Lcom/google/android/material/navigation/NavigationView;->d(I)Landroid/content/res/ColorStateList;

    move-result-object v5

    :goto_2
    sget v6, LXl4;->NavigationView_itemTextAppearance:I

    invoke-virtual {v1, v6}, LZ46;->s(I)Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-virtual {v1, v6, v12}, LZ46;->n(II)I

    move-result v6

    goto :goto_3

    :cond_9
    move v6, v12

    :goto_3
    sget v7, LXl4;->NavigationView_itemIconSize:I

    invoke-virtual {v1, v7}, LZ46;->s(I)Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-virtual {v1, v7, v12}, LZ46;->f(II)I

    move-result v7

    invoke-virtual {v0, v7}, Lcom/google/android/material/navigation/NavigationView;->setItemIconSize(I)V

    :cond_a
    sget v7, LXl4;->NavigationView_itemTextColor:I

    invoke-virtual {v1, v7}, LZ46;->s(I)Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-virtual {v1, v7}, LZ46;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    goto :goto_4

    :cond_b
    move-object v7, v4

    :goto_4
    if-nez v6, :cond_c

    if-nez v7, :cond_c

    const v7, 0x1010036

    invoke-virtual {v0, v7}, Lcom/google/android/material/navigation/NavigationView;->d(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    :cond_c
    sget v8, LXl4;->NavigationView_itemBackground:I

    invoke-virtual {v1, v8}, LZ46;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    if-nez v8, :cond_d

    invoke-virtual {v0, v1}, Lcom/google/android/material/navigation/NavigationView;->j(LZ46;)Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-virtual {v0, v1}, Lcom/google/android/material/navigation/NavigationView;->e(LZ46;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    sget v9, LXl4;->NavigationView_itemRippleColor:I

    invoke-static {v13, v1, v9}, LNM2;->a(Landroid/content/Context;LZ46;I)Landroid/content/res/ColorStateList;

    move-result-object v9

    if-eqz v9, :cond_d

    invoke-virtual {v0, v1, v4}, Lcom/google/android/material/navigation/NavigationView;->f(LZ46;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Drawable;

    move-result-object v15

    new-instance v11, Landroid/graphics/drawable/RippleDrawable;

    invoke-static {v9}, Lzb5;->d(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object v9

    invoke-direct {v11, v9, v4, v15}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v10, v11}, LW03;->w(Landroid/graphics/drawable/RippleDrawable;)V

    :cond_d
    sget v4, LXl4;->NavigationView_itemHorizontalPadding:I

    invoke-virtual {v1, v4}, LZ46;->s(I)Z

    move-result v9

    if-eqz v9, :cond_e

    invoke-virtual {v1, v4, v12}, LZ46;->f(II)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/google/android/material/navigation/NavigationView;->setItemHorizontalPadding(I)V

    :cond_e
    sget v4, LXl4;->NavigationView_itemVerticalPadding:I

    invoke-virtual {v1, v4}, LZ46;->s(I)Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-virtual {v1, v4, v12}, LZ46;->f(II)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/google/android/material/navigation/NavigationView;->setItemVerticalPadding(I)V

    :cond_f
    sget v4, LXl4;->NavigationView_dividerInsetStart:I

    invoke-virtual {v1, v4, v12}, LZ46;->f(II)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/google/android/material/navigation/NavigationView;->setDividerInsetStart(I)V

    sget v4, LXl4;->NavigationView_dividerInsetEnd:I

    invoke-virtual {v1, v4, v12}, LZ46;->f(II)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/google/android/material/navigation/NavigationView;->setDividerInsetEnd(I)V

    sget v4, LXl4;->NavigationView_subheaderInsetStart:I

    invoke-virtual {v1, v4, v12}, LZ46;->f(II)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/google/android/material/navigation/NavigationView;->setSubheaderInsetStart(I)V

    sget v4, LXl4;->NavigationView_subheaderInsetEnd:I

    invoke-virtual {v1, v4, v12}, LZ46;->f(II)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/google/android/material/navigation/NavigationView;->setSubheaderInsetEnd(I)V

    sget v4, LXl4;->NavigationView_topInsetScrimEnabled:I

    iget-boolean v9, v0, Lcom/google/android/material/navigation/NavigationView;->p:Z

    invoke-virtual {v1, v4, v9}, LZ46;->a(IZ)Z

    move-result v4

    invoke-virtual {v0, v4}, Lcom/google/android/material/navigation/NavigationView;->setTopInsetScrimEnabled(Z)V

    sget v4, LXl4;->NavigationView_bottomInsetScrimEnabled:I

    iget-boolean v9, v0, Lcom/google/android/material/navigation/NavigationView;->q:Z

    invoke-virtual {v1, v4, v9}, LZ46;->a(IZ)Z

    move-result v4

    invoke-virtual {v0, v4}, Lcom/google/android/material/navigation/NavigationView;->setBottomInsetScrimEnabled(Z)V

    sget v4, LXl4;->NavigationView_itemIconPadding:I

    invoke-virtual {v1, v4, v12}, LZ46;->f(II)I

    move-result v4

    sget v9, LXl4;->NavigationView_itemMaxLines:I

    const/4 v11, 0x1

    invoke-virtual {v1, v9, v11}, LZ46;->k(II)I

    move-result v9

    invoke-virtual {v0, v9}, Lcom/google/android/material/navigation/NavigationView;->setItemMaxLines(I)V

    new-instance v9, Lcom/google/android/material/navigation/NavigationView$a;

    invoke-direct {v9, v0}, Lcom/google/android/material/navigation/NavigationView$a;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    invoke-virtual {v14, v9}, Landroidx/appcompat/view/menu/e;->V(Landroidx/appcompat/view/menu/e$a;)V

    invoke-virtual {v10, v11}, LW03;->u(I)V

    invoke-virtual {v10, v13, v14}, LW03;->i(Landroid/content/Context;Landroidx/appcompat/view/menu/e;)V

    if-eqz v3, :cond_10

    invoke-virtual {v10, v3}, LW03;->J(I)V

    :cond_10
    invoke-virtual {v10, v2}, LW03;->G(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v10, v5}, LW03;->A(Landroid/content/res/ColorStateList;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getOverScrollMode()I

    move-result v2

    invoke-virtual {v10, v2}, LW03;->F(I)V

    if-eqz v6, :cond_11

    invoke-virtual {v10, v6}, LW03;->C(I)V

    :cond_11
    invoke-virtual {v10, v7}, LW03;->D(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v10, v8}, LW03;->v(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v10, v4}, LW03;->y(I)V

    invoke-virtual {v14, v10}, Landroidx/appcompat/view/menu/e;->b(Landroidx/appcompat/view/menu/i;)V

    invoke-virtual {v10, v0}, LW03;->o(Landroid/view/ViewGroup;)Landroidx/appcompat/view/menu/j;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v2, LXl4;->NavigationView_menu:I

    invoke-virtual {v1, v2}, LZ46;->s(I)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-virtual {v1, v2, v12}, LZ46;->n(II)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/NavigationView;->l(I)V

    :cond_12
    sget v2, LXl4;->NavigationView_headerLayout:I

    invoke-virtual {v1, v2}, LZ46;->s(I)Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-virtual {v1, v2, v12}, LZ46;->n(II)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/NavigationView;->k(I)Landroid/view/View;

    :cond_13
    invoke-virtual {v1}, LZ46;->w()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/navigation/NavigationView;->p()V

    return-void
.end method

.method public static synthetic b(Lcom/google/android/material/navigation/NavigationView;)[I
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->m:[I

    return-object p0
.end method

.method public static synthetic c(Lcom/google/android/material/navigation/NavigationView;)LW03;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    return-object p0
.end method


# virtual methods
.method public a(LDB6;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->k(LDB6;)V

    return-void
.end method

.method public final d(I)Landroid/content/res/ColorStateList;
    .locals 10

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget v3, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-static {p1, v3}, Lvi;->a(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    sget v4, Lvf4;->colorPrimary:I

    invoke-virtual {v3, v4, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v3

    if-nez v3, :cond_1

    return-object v1

    :cond_1
    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    new-instance v3, Landroid/content/res/ColorStateList;

    const/4 v4, 0x3

    new-array v5, v4, [[I

    sget-object v6, Lcom/google/android/material/navigation/NavigationView;->w:[I

    const/4 v7, 0x0

    aput-object v6, v5, v7

    sget-object v8, Lcom/google/android/material/navigation/NavigationView;->v:[I

    aput-object v8, v5, v2

    sget-object v8, Landroid/widget/FrameLayout;->EMPTY_STATE_SET:[I

    const/4 v9, 0x2

    aput-object v8, v5, v9

    new-array v4, v4, [I

    invoke-virtual {p1, v6, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    aput p1, v4, v7

    aput v0, v4, v2

    aput v1, v4, v9

    invoke-direct {v3, v5, v4}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v3
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->t:Landroid/graphics/Path;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->t:Landroid/graphics/Path;

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method public final e(LZ46;)Landroid/graphics/drawable/Drawable;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LXl4;->NavigationView_itemShapeFillColor:I

    invoke-static {v0, p1, v1}, LNM2;->a(Landroid/content/Context;LZ46;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/navigation/NavigationView;->f(LZ46;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final f(LZ46;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Drawable;
    .locals 9

    sget v0, LXl4;->NavigationView_itemShapeAppearance:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, LZ46;->n(II)I

    move-result v0

    sget v2, LXl4;->NavigationView_itemShapeAppearanceOverlay:I

    invoke-virtual {p1, v2, v1}, LZ46;->n(II)I

    move-result v2

    new-instance v4, LPM2;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0, v2}, Liy5;->b(Landroid/content/Context;II)Liy5$b;

    move-result-object v0

    invoke-virtual {v0}, Liy5$b;->m()Liy5;

    move-result-object v0

    invoke-direct {v4, v0}, LPM2;-><init>(Liy5;)V

    invoke-virtual {v4, p2}, LPM2;->a0(Landroid/content/res/ColorStateList;)V

    sget p2, LXl4;->NavigationView_itemShapeInsetStart:I

    invoke-virtual {p1, p2, v1}, LZ46;->f(II)I

    move-result v5

    sget p2, LXl4;->NavigationView_itemShapeInsetTop:I

    invoke-virtual {p1, p2, v1}, LZ46;->f(II)I

    move-result v6

    sget p2, LXl4;->NavigationView_itemShapeInsetEnd:I

    invoke-virtual {p1, p2, v1}, LZ46;->f(II)I

    move-result v7

    sget p2, LXl4;->NavigationView_itemShapeInsetBottom:I

    invoke-virtual {p1, p2, v1}, LZ46;->f(II)I

    move-result v8

    new-instance p1, Landroid/graphics/drawable/InsetDrawable;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    return-object p1
.end method

.method public g(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->n(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public h()Landroid/view/Menu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:LV03;

    return-object v0
.end method

.method public final i()Landroid/view/MenuInflater;
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Landroid/view/MenuInflater;

    if-nez v0, :cond_0

    new-instance v0, LcV5;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LcV5;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Landroid/view/MenuInflater;

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->n:Landroid/view/MenuInflater;

    return-object v0
.end method

.method public final j(LZ46;)Z
    .locals 1

    sget v0, LXl4;->NavigationView_itemShapeAppearance:I

    invoke-virtual {p1, v0}, LZ46;->s(I)Z

    move-result v0

    if-nez v0, :cond_1

    sget v0, LXl4;->NavigationView_itemShapeAppearanceOverlay:I

    invoke-virtual {p1, v0}, LZ46;->s(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public k(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->p(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public l(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LW03;->K(Z)V

    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationView;->i()Landroid/view/MenuInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->i:LV03;

    invoke-virtual {v0, p1, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LW03;->K(Z)V

    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {p1, v0}, LW03;->f(Z)V

    return-void
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->q:Z

    return v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationView;->p:Z

    return v0
.end method

.method public final o(II)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroidx/drawerlayout/widget/DrawerLayout;

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/google/android/material/navigation/NavigationView;->s:I

    if-lez v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, LPM2;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, LPM2;

    invoke-virtual {v0}, LPM2;->E()Liy5;

    move-result-object v1

    invoke-virtual {v1}, Liy5;->v()Liy5$b;

    move-result-object v1

    iget v2, p0, Lcom/google/android/material/navigation/NavigationView;->r:I

    invoke-static {p0}, Lbq6;->D(Landroid/view/View;)I

    move-result v3

    invoke-static {v2, v3}, LYD1;->b(II)I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    iget v2, p0, Lcom/google/android/material/navigation/NavigationView;->s:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Liy5$b;->K(F)Liy5$b;

    iget v2, p0, Lcom/google/android/material/navigation/NavigationView;->s:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Liy5$b;->B(F)Liy5$b;

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/google/android/material/navigation/NavigationView;->s:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Liy5$b;->G(F)Liy5$b;

    iget v2, p0, Lcom/google/android/material/navigation/NavigationView;->s:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Liy5$b;->w(F)Liy5$b;

    :goto_0
    invoke-virtual {v1}, Liy5$b;->m()Liy5;

    move-result-object v1

    invoke-virtual {v0, v1}, LPM2;->setShapeAppearanceModel(Liy5;)V

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->t:Landroid/graphics/Path;

    if-nez v1, :cond_1

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->t:Landroid/graphics/Path;

    :cond_1
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->t:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->u:Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-static {}, Ljy5;->k()Ljy5;

    move-result-object p1

    invoke-virtual {v0}, LPM2;->E()Liy5;

    move-result-object p2

    invoke-virtual {v0}, LPM2;->y()F

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->u:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->t:Landroid/graphics/Path;

    invoke-virtual {p1, p2, v0, v1, v2}, Ljy5;->e(Liy5;FLandroid/graphics/RectF;Landroid/graphics/Path;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->t:Landroid/graphics/Path;

    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->u:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->setEmpty()V

    :goto_1
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->onAttachedToWindow()V

    invoke-static {p0}, LQM2;->e(Landroid/view/View;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->onDetachedFromWindow()V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->o:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/google/android/material/navigation/NavigationView;->l:I

    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iget v0, p0, Lcom/google/android/material/navigation/NavigationView;->l:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    invoke-virtual {p1}, Landroidx/customview/view/AbsSavedState;->a()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:LV03;

    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;->d:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/e;->S(Landroid/os/Bundle;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    invoke-direct {v1, v0}, Lcom/google/android/material/navigation/NavigationView$SavedState;-><init>(Landroid/os/Parcelable;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, v1, Lcom/google/android/material/navigation/NavigationView$SavedState;->d:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->i:LV03;

    invoke-virtual {v2, v0}, Landroidx/appcompat/view/menu/e;->U(Landroid/os/Bundle;)V

    return-object v1
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/navigation/NavigationView;->o(II)V

    return-void
.end method

.method public final p()V
    .locals 2

    new-instance v0, Lcom/google/android/material/navigation/NavigationView$b;

    invoke-direct {v0, p0}, Lcom/google/android/material/navigation/NavigationView$b;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->o:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->o:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public setBottomInsetScrimEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->q:Z

    return-void
.end method

.method public setCheckedItem(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:LV03;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/e;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    check-cast p1, Landroidx/appcompat/view/menu/g;

    invoke-virtual {v0, p1}, LW03;->r(Landroidx/appcompat/view/menu/g;)V

    :cond_0
    return-void
.end method

.method public setCheckedItem(Landroid/view/MenuItem;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->i:LV03;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/e;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    check-cast p1, Landroidx/appcompat/view/menu/g;

    invoke-virtual {v0, p1}, LW03;->r(Landroidx/appcompat/view/menu/g;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Called setCheckedItem(MenuItem) with an item that is not in the current menu."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDividerInsetEnd(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->s(I)V

    return-void
.end method

.method public setDividerInsetStart(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->t(I)V

    return-void
.end method

.method public setElevation(F)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setElevation(F)V

    invoke-static {p0, p1}, LQM2;->d(Landroid/view/View;F)V

    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->v(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setItemBackgroundResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setItemHorizontalPadding(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->x(I)V

    return-void
.end method

.method public setItemHorizontalPaddingResource(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {v0, p1}, LW03;->x(I)V

    return-void
.end method

.method public setItemIconPadding(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->y(I)V

    return-void
.end method

.method public setItemIconPaddingResource(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {v0, p1}, LW03;->y(I)V

    return-void
.end method

.method public setItemIconSize(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->z(I)V

    return-void
.end method

.method public setItemIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->A(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setItemMaxLines(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->B(I)V

    return-void
.end method

.method public setItemTextAppearance(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->C(I)V

    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->D(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setItemVerticalPadding(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->E(I)V

    return-void
.end method

.method public setItemVerticalPaddingResource(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {v0, p1}, LW03;->E(I)V

    return-void
.end method

.method public setNavigationItemSelectedListener(Lcom/google/android/material/navigation/NavigationView$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->k:Lcom/google/android/material/navigation/NavigationView$c;

    return-void
.end method

.method public setOverScrollMode(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setOverScrollMode(I)V

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LW03;->F(I)V

    :cond_0
    return-void
.end method

.method public setSubheaderInsetEnd(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->H(I)V

    return-void
.end method

.method public setSubheaderInsetStart(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->j:LW03;

    invoke-virtual {v0, p1}, LW03;->I(I)V

    return-void
.end method

.method public setTopInsetScrimEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->p:Z

    return-void
.end method
