.class public Le81;
.super LVc1;
.source "SourceFile"


# static fields
.field public static final s:Z


# instance fields
.field public final e:I

.field public final f:I

.field public final g:Landroid/animation/TimeInterpolator;

.field public h:Landroid/widget/AutoCompleteTextView;

.field public final i:Landroid/view/View$OnClickListener;

.field public final j:Landroid/view/View$OnFocusChangeListener;

.field public final k:LR1$b;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:J

.field public p:Landroid/view/accessibility/AccessibilityManager;

.field public q:Landroid/animation/ValueAnimator;

.field public r:Landroid/animation/ValueAnimator;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Le81;->s:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/textfield/a;)V
    .locals 3

    invoke-direct {p0, p1}, LVc1;-><init>(Lcom/google/android/material/textfield/a;)V

    new-instance v0, LX71;

    invoke-direct {v0, p0}, LX71;-><init>(Le81;)V

    iput-object v0, p0, Le81;->i:Landroid/view/View$OnClickListener;

    new-instance v0, LY71;

    invoke-direct {v0, p0}, LY71;-><init>(Le81;)V

    iput-object v0, p0, Le81;->j:Landroid/view/View$OnFocusChangeListener;

    new-instance v0, LZ71;

    invoke-direct {v0, p0}, LZ71;-><init>(Le81;)V

    iput-object v0, p0, Le81;->k:LR1$b;

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Le81;->o:J

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Luf4;->motionDurationShort3:I

    const/16 v2, 0x43

    invoke-static {v0, v1, v2}, LaW2;->f(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Le81;->f:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/16 v2, 0x32

    invoke-static {v0, v1, v2}, LaW2;->f(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Le81;->e:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Luf4;->motionEasingLinearInterpolator:I

    sget-object v1, Lpf;->a:Landroid/animation/TimeInterpolator;

    invoke-static {p1, v0, v1}, LaW2;->g(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    move-result-object p1

    iput-object p1, p0, Le81;->g:Landroid/animation/TimeInterpolator;

    return-void
.end method

.method public static synthetic A(Le81;)V
    .locals 0

    invoke-direct {p0}, Le81;->H()V

    return-void
.end method

.method public static synthetic B(Le81;Landroid/view/View;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Le81;->K(Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic C(Le81;)Landroid/animation/ValueAnimator;
    .locals 0

    iget-object p0, p0, Le81;->r:Landroid/animation/ValueAnimator;

    return-object p0
.end method

.method public static D(Landroid/widget/EditText;)Landroid/widget/AutoCompleteTextView;
    .locals 1

    instance-of v0, p0, Landroid/widget/AutoCompleteTextView;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/widget/AutoCompleteTextView;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private synthetic H()V
    .locals 1

    iget-object v0, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result v0

    invoke-virtual {p0, v0}, Le81;->O(Z)V

    iput-boolean v0, p0, Le81;->m:Z

    return-void
.end method

.method private synthetic I(Landroid/animation/ValueAnimator;)V
    .locals 1

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, LVc1;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method private synthetic J(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Le81;->Q()V

    return-void
.end method

.method private synthetic K(Landroid/view/View;Z)V
    .locals 0

    iput-boolean p2, p0, Le81;->l:Z

    invoke-virtual {p0}, LVc1;->r()V

    if-nez p2, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Le81;->O(Z)V

    iput-boolean p1, p0, Le81;->m:Z

    :cond_0
    return-void
.end method

.method private synthetic L(Z)V
    .locals 1

    iget-object v0, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    if-eqz v0, :cond_1

    invoke-static {v0}, LQ91;->a(Landroid/widget/EditText;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LVc1;->d:Lcom/google/android/material/internal/CheckableImageButton;

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    invoke-static {v0, p1}, Lbq6;->H0(Landroid/view/View;I)V

    :cond_1
    return-void
.end method

.method private synthetic M(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-ne p1, p2, :cond_1

    invoke-virtual {p0}, Le81;->G()Z

    move-result p1

    if-eqz p1, :cond_0

    iput-boolean v0, p0, Le81;->m:Z

    :cond_0
    invoke-virtual {p0}, Le81;->Q()V

    invoke-virtual {p0}, Le81;->R()V

    :cond_1
    return v0
.end method

.method private synthetic N()V
    .locals 1

    invoke-virtual {p0}, Le81;->R()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Le81;->O(Z)V

    return-void
.end method

.method public static synthetic v(Le81;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-direct {p0, p1}, Le81;->I(Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic w(Le81;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Le81;->M(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic x(Le81;Z)V
    .locals 0

    invoke-direct {p0, p1}, Le81;->L(Z)V

    return-void
.end method

.method public static synthetic y(Le81;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Le81;->J(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic z(Le81;)V
    .locals 0

    invoke-direct {p0}, Le81;->N()V

    return-void
.end method


# virtual methods
.method public final varargs E(I[F)Landroid/animation/ValueAnimator;
    .locals 2

    invoke-static {p2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p2

    iget-object v0, p0, Le81;->g:Landroid/animation/TimeInterpolator;

    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance p1, La81;

    invoke-direct {p1, p0}, La81;-><init>(Le81;)V

    invoke-virtual {p2, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-object p2
.end method

.method public final F()V
    .locals 3

    iget v0, p0, Le81;->f:I

    const/4 v1, 0x2

    new-array v2, v1, [F

    fill-array-data v2, :array_0

    invoke-virtual {p0, v0, v2}, Le81;->E(I[F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Le81;->r:Landroid/animation/ValueAnimator;

    iget v0, p0, Le81;->e:I

    new-array v1, v1, [F

    fill-array-data v1, :array_1

    invoke-virtual {p0, v0, v1}, Le81;->E(I[F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Le81;->q:Landroid/animation/ValueAnimator;

    new-instance v1, Le81$a;

    invoke-direct {v1, p0}, Le81$a;-><init>(Le81;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final G()Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Le81;->o:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final O(Z)V
    .locals 1

    iget-boolean v0, p0, Le81;->n:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Le81;->n:Z

    iget-object p1, p0, Le81;->r:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object p1, p0, Le81;->q:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    :cond_0
    return-void
.end method

.method public final P()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    iget-object v0, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    new-instance v1, Lc81;

    invoke-direct {v1, p0}, Lc81;-><init>(Le81;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget-boolean v0, Le81;->s:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    new-instance v1, Ld81;

    invoke-direct {v1, p0}, Ld81;-><init>(Le81;)V

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setOnDismissListener(Landroid/widget/AutoCompleteTextView$OnDismissListener;)V

    :cond_0
    iget-object v0, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setThreshold(I)V

    return-void
.end method

.method public final Q()V
    .locals 2

    iget-object v0, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Le81;->G()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Le81;->m:Z

    :cond_1
    iget-boolean v0, p0, Le81;->m:Z

    if-nez v0, :cond_4

    sget-boolean v0, Le81;->s:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Le81;->n:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Le81;->O(Z)V

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Le81;->n:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Le81;->n:Z

    invoke-virtual {p0}, LVc1;->r()V

    :goto_0
    iget-boolean v0, p0, Le81;->n:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    iget-object v0, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    goto :goto_1

    :cond_4
    iput-boolean v1, p0, Le81;->m:Z

    :goto_1
    return-void
.end method

.method public final R()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Le81;->m:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Le81;->o:J

    return-void
.end method

.method public a(Landroid/text/Editable;)V
    .locals 1

    iget-object p1, p0, Le81;->p:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    invoke-static {p1}, LQ91;->a(Landroid/widget/EditText;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LVc1;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    :cond_0
    iget-object p1, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    new-instance v0, Lb81;

    invoke-direct {v0, p0}, Lb81;-><init>(Le81;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public c()I
    .locals 1

    sget v0, Lel4;->exposed_dropdown_menu_content_description:I

    return v0
.end method

.method public d()I
    .locals 1

    sget-boolean v0, Le81;->s:Z

    if-eqz v0, :cond_0

    sget v0, Lzg4;->mtrl_dropdown_arrow:I

    goto :goto_0

    :cond_0
    sget v0, Lzg4;->mtrl_ic_arrow_drop_down:I

    :goto_0
    return v0
.end method

.method public e()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    iget-object v0, p0, Le81;->j:Landroid/view/View$OnFocusChangeListener;

    return-object v0
.end method

.method public f()Landroid/view/View$OnClickListener;
    .locals 1

    iget-object v0, p0, Le81;->i:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public h()LR1$b;
    .locals 1

    iget-object v0, p0, Le81;->k:LR1$b;

    return-object v0
.end method

.method public i(I)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public j()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Le81;->l:Z

    return v0
.end method

.method public l()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Le81;->n:Z

    return v0
.end method

.method public n(Landroid/widget/EditText;)V
    .locals 2

    invoke-static {p1}, Le81;->D(Landroid/widget/EditText;)Landroid/widget/AutoCompleteTextView;

    move-result-object v0

    iput-object v0, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p0}, Le81;->P()V

    iget-object v0, p0, LVc1;->a:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorIconDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-static {p1}, LQ91;->a(Landroid/widget/EditText;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Le81;->p:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LVc1;->d:Lcom/google/android/material/internal/CheckableImageButton;

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lbq6;->H0(Landroid/view/View;I)V

    :cond_0
    iget-object p1, p0, LVc1;->a:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconVisible(Z)V

    return-void
.end method

.method public o(Landroid/view/View;Lp2;)V
    .locals 0

    iget-object p1, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    invoke-static {p1}, LQ91;->a(Landroid/widget/EditText;)Z

    move-result p1

    if-nez p1, :cond_0

    const-class p1, Landroid/widget/Spinner;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lp2;->f0(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-virtual {p2}, Lp2;->P()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lp2;->s0(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public p(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Le81;->p:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    invoke-static {p1}, LQ91;->a(Landroid/widget/EditText;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Le81;->Q()V

    invoke-virtual {p0}, Le81;->R()V

    :cond_0
    return-void
.end method

.method public s()V
    .locals 2

    invoke-virtual {p0}, Le81;->F()V

    iget-object v0, p0, LVc1;->c:Landroid/content/Context;

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    iput-object v0, p0, Le81;->p:Landroid/view/accessibility/AccessibilityManager;

    return-void
.end method

.method public t()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public u()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    iget-object v0, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget-boolean v0, Le81;->s:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Le81;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setOnDismissListener(Landroid/widget/AutoCompleteTextView$OnDismissListener;)V

    :cond_0
    return-void
.end method
