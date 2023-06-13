.class public LAM2;
.super Landroidx/appcompat/app/b$a;
.source "SourceFile"


# static fields
.field public static final e:I

.field public static final f:I

.field public static final g:I


# instance fields
.field public c:Landroid/graphics/drawable/Drawable;

.field public final d:Landroid/graphics/Rect;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget v0, Luf4;->alertDialogStyle:I

    sput v0, LAM2;->e:I

    sget v0, Lul4;->MaterialAlertDialog_MaterialComponents:I

    sput v0, LAM2;->f:I

    sget v0, Luf4;->materialAlertDialogTheme:I

    sput v0, LAM2;->g:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LAM2;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 5

    invoke-static {p1}, LAM2;->t(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, p2}, LAM2;->v(Landroid/content/Context;I)I

    move-result p1

    invoke-direct {p0, v0, p1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0}, Landroidx/appcompat/app/b$a;->b()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p2

    sget v0, LAM2;->e:I

    sget v1, LAM2;->f:I

    invoke-static {p1, v0, v1}, LIM2;->a(Landroid/content/Context;II)Landroid/graphics/Rect;

    move-result-object v2

    iput-object v2, p0, LAM2;->d:Landroid/graphics/Rect;

    sget v2, Luf4;->colorSurface:I

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v2, v3}, LHM2;->c(Landroid/content/Context;ILjava/lang/String;)I

    move-result v2

    new-instance v3, LPM2;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4, v0, v1}, LPM2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    invoke-virtual {v3, p1}, LPM2;->P(Landroid/content/Context;)V

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v3, p1}, LPM2;->a0(Landroid/content/res/ColorStateList;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p1, v0, :cond_0

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    const v0, 0x1010571

    const/4 v1, 0x1

    invoke-virtual {p2, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    invoke-virtual {p0}, Landroidx/appcompat/app/b$a;->b()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result p2

    iget p1, p1, Landroid/util/TypedValue;->type:I

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    cmpl-float p1, p2, p1

    if-ltz p1, :cond_0

    invoke-virtual {v3, p2}, LPM2;->X(F)V

    :cond_0
    iput-object v3, p0, LAM2;->c:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public static t(Landroid/content/Context;)Landroid/content/Context;
    .locals 4

    invoke-static {p0}, LAM2;->u(Landroid/content/Context;)I

    move-result v0

    sget v1, LAM2;->e:I

    sget v2, LAM2;->f:I

    const/4 v3, 0x0

    invoke-static {p0, v3, v1, v2}, LVM2;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v1, LaB0;

    invoke-direct {v1, p0, v0}, LaB0;-><init>(Landroid/content/Context;I)V

    return-object v1
.end method

.method public static u(Landroid/content/Context;)I
    .locals 1

    sget v0, LAM2;->g:I

    invoke-static {p0, v0}, LBM2;->a(Landroid/content/Context;I)Landroid/util/TypedValue;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget p0, p0, Landroid/util/TypedValue;->data:I

    return p0
.end method

.method public static v(Landroid/content/Context;I)I
    .locals 0

    if-nez p1, :cond_0

    invoke-static {p0}, LAM2;->u(Landroid/content/Context;)I

    move-result p1

    :cond_0
    return p1
.end method


# virtual methods
.method public A(I)LAM2;
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/b$a;->g(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public B(Ljava/lang/CharSequence;)LAM2;
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/b$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public C(ILandroid/content/DialogInterface$OnClickListener;)LAM2;
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/b$a;->i(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public D(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)LAM2;
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/b$a;->j(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public E(Landroid/content/DialogInterface$OnCancelListener;)LAM2;
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/b$a;->k(Landroid/content/DialogInterface$OnCancelListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public F(Landroid/content/DialogInterface$OnKeyListener;)LAM2;
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/b$a;->l(Landroid/content/DialogInterface$OnKeyListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public G(ILandroid/content/DialogInterface$OnClickListener;)LAM2;
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/b$a;->m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public H(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)LAM2;
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/b$a;->n(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public I(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)LAM2;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/appcompat/app/b$a;->o(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public J(I)LAM2;
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/b$a;->p(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public K(Ljava/lang/CharSequence;)LAM2;
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/b$a;->q(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public L(Landroid/view/View;)LAM2;
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/b$a;->r(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public a()Landroidx/appcompat/app/b;
    .locals 5

    invoke-super {p0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, LAM2;->c:Landroid/graphics/drawable/Drawable;

    instance-of v4, v3, LPM2;

    if-eqz v4, :cond_0

    check-cast v3, LPM2;

    invoke-static {v2}, Lbq6;->y(Landroid/view/View;)F

    move-result v4

    invoke-virtual {v3, v4}, LPM2;->Z(F)V

    :cond_0
    iget-object v3, p0, LAM2;->c:Landroid/graphics/drawable/Drawable;

    iget-object v4, p0, LAM2;->d:Landroid/graphics/Rect;

    invoke-static {v3, v4}, LIM2;->b(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)Landroid/graphics/drawable/InsetDrawable;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    new-instance v1, LB32;

    iget-object v3, p0, LAM2;->d:Landroid/graphics/Rect;

    invoke-direct {v1, v0, v3}, LB32;-><init>(Landroid/app/Dialog;Landroid/graphics/Rect;)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-object v0
.end method

.method public bridge synthetic c(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LAM2;->w(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)LAM2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Z)Landroidx/appcompat/app/b$a;
    .locals 0

    invoke-virtual {p0, p1}, LAM2;->x(Z)LAM2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Landroid/view/View;)Landroidx/appcompat/app/b$a;
    .locals 0

    invoke-virtual {p0, p1}, LAM2;->y(Landroid/view/View;)LAM2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Landroid/graphics/drawable/Drawable;)Landroidx/appcompat/app/b$a;
    .locals 0

    invoke-virtual {p0, p1}, LAM2;->z(Landroid/graphics/drawable/Drawable;)LAM2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(I)Landroidx/appcompat/app/b$a;
    .locals 0

    invoke-virtual {p0, p1}, LAM2;->A(I)LAM2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;
    .locals 0

    invoke-virtual {p0, p1}, LAM2;->B(Ljava/lang/CharSequence;)LAM2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LAM2;->C(ILandroid/content/DialogInterface$OnClickListener;)LAM2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(Landroid/content/DialogInterface$OnCancelListener;)Landroidx/appcompat/app/b$a;
    .locals 0

    invoke-virtual {p0, p1}, LAM2;->E(Landroid/content/DialogInterface$OnCancelListener;)LAM2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Landroid/content/DialogInterface$OnKeyListener;)Landroidx/appcompat/app/b$a;
    .locals 0

    invoke-virtual {p0, p1}, LAM2;->F(Landroid/content/DialogInterface$OnKeyListener;)LAM2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, LAM2;->G(ILandroid/content/DialogInterface$OnClickListener;)LAM2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic o(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LAM2;->I(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)LAM2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(I)Landroidx/appcompat/app/b$a;
    .locals 0

    invoke-virtual {p0, p1}, LAM2;->J(I)LAM2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;
    .locals 0

    invoke-virtual {p0, p1}, LAM2;->K(Ljava/lang/CharSequence;)LAM2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic r(Landroid/view/View;)Landroidx/appcompat/app/b$a;
    .locals 0

    invoke-virtual {p0, p1}, LAM2;->L(Landroid/view/View;)LAM2;

    move-result-object p1

    return-object p1
.end method

.method public w(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)LAM2;
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/b$a;->c(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public x(Z)LAM2;
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public y(Landroid/view/View;)LAM2;
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/b$a;->e(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method

.method public z(Landroid/graphics/drawable/Drawable;)LAM2;
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/app/b$a;->f(Landroid/graphics/drawable/Drawable;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    check-cast p1, LAM2;

    return-object p1
.end method
