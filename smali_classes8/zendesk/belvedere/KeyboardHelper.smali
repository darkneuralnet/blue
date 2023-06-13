.class public Lzendesk/belvedere/KeyboardHelper;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/belvedere/KeyboardHelper$d;,
        Lzendesk/belvedere/KeyboardHelper$c;,
        Lzendesk/belvedere/KeyboardHelper$b;
    }
.end annotation


# instance fields
.field public final b:I

.field public c:I

.field public d:I

.field public e:Z

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "Lzendesk/belvedere/KeyboardHelper$c;",
            ">;>;"
        }
    .end annotation
.end field

.field public g:Lzendesk/belvedere/KeyboardHelper$d;

.field public h:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, -0x1

    iput v0, p0, Lzendesk/belvedere/KeyboardHelper;->c:I

    iput v0, p0, Lzendesk/belvedere/KeyboardHelper;->d:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzendesk/belvedere/KeyboardHelper;->e:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lzendesk/belvedere/KeyboardHelper;->f:Ljava/util/List;

    invoke-virtual {p0}, Lzendesk/belvedere/KeyboardHelper;->n()I

    move-result v1

    iput v1, p0, Lzendesk/belvedere/KeyboardHelper;->b:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LSf4;->belvedere_dummy_edit_text_size:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/widget/EditText;

    invoke-direct {v1, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lzendesk/belvedere/KeyboardHelper;->h:Landroid/widget/EditText;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusable(Z)V

    iget-object v1, p0, Lzendesk/belvedere/KeyboardHelper;->h:Landroid/widget/EditText;

    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    iget-object v1, p0, Lzendesk/belvedere/KeyboardHelper;->h:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lzendesk/belvedere/KeyboardHelper;->h:Landroid/widget/EditText;

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setImeOptions(I)V

    iget-object v0, p0, Lzendesk/belvedere/KeyboardHelper;->h:Landroid/widget/EditText;

    const/16 v1, 0x4000

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setInputType(I)V

    iget-object v0, p0, Lzendesk/belvedere/KeyboardHelper;->h:Landroid/widget/EditText;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lzendesk/belvedere/KeyboardHelper$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lzendesk/belvedere/KeyboardHelper$b;-><init>(Lzendesk/belvedere/KeyboardHelper;Landroid/app/Activity;Lzendesk/belvedere/KeyboardHelper$a;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public static synthetic a(Lzendesk/belvedere/KeyboardHelper;Landroid/app/Activity;)I
    .locals 0

    invoke-virtual {p0, p1}, Lzendesk/belvedere/KeyboardHelper;->m(Landroid/app/Activity;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lzendesk/belvedere/KeyboardHelper;Z)Z
    .locals 0

    iput-boolean p1, p0, Lzendesk/belvedere/KeyboardHelper;->e:Z

    return p1
.end method

.method public static synthetic c(Lzendesk/belvedere/KeyboardHelper;)I
    .locals 0

    iget p0, p0, Lzendesk/belvedere/KeyboardHelper;->d:I

    return p0
.end method

.method public static synthetic d(Lzendesk/belvedere/KeyboardHelper;I)I
    .locals 0

    iput p1, p0, Lzendesk/belvedere/KeyboardHelper;->d:I

    return p1
.end method

.method public static synthetic e(Lzendesk/belvedere/KeyboardHelper;)Lzendesk/belvedere/KeyboardHelper$d;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/KeyboardHelper;->g:Lzendesk/belvedere/KeyboardHelper$d;

    return-object p0
.end method

.method public static synthetic f(Lzendesk/belvedere/KeyboardHelper;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lzendesk/belvedere/KeyboardHelper;->f:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic g(Lzendesk/belvedere/KeyboardHelper;)V
    .locals 0

    invoke-virtual {p0}, Lzendesk/belvedere/KeyboardHelper;->t()V

    return-void
.end method

.method public static synthetic h(Lzendesk/belvedere/KeyboardHelper;)V
    .locals 0

    invoke-virtual {p0}, Lzendesk/belvedere/KeyboardHelper;->s()V

    return-void
.end method

.method public static q(Landroid/app/Activity;)V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_0
    return-void
.end method

.method public static r(Landroid/app/Activity;)Lzendesk/belvedere/KeyboardHelper;
    .locals 4

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v3, v3, Lzendesk/belvedere/KeyboardHelper;

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lzendesk/belvedere/KeyboardHelper;

    return-object p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Lzendesk/belvedere/KeyboardHelper;

    invoke-direct {v1, p0}, Lzendesk/belvedere/KeyboardHelper;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v1
.end method

.method public static v(Landroid/widget/EditText;)V
    .locals 1

    new-instance v0, Lzendesk/belvedere/KeyboardHelper$a;

    invoke-direct {v0, p0}, Lzendesk/belvedere/KeyboardHelper$a;-><init>(Landroid/widget/EditText;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public i(Lzendesk/belvedere/KeyboardHelper$c;)V
    .locals 2

    iget-object v0, p0, Lzendesk/belvedere/KeyboardHelper;->f:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final j()I
    .locals 2

    iget v0, p0, Lzendesk/belvedere/KeyboardHelper;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lzendesk/belvedere/KeyboardHelper;->o()I

    move-result v0

    iput v0, p0, Lzendesk/belvedere/KeyboardHelper;->c:I

    :cond_0
    iget v0, p0, Lzendesk/belvedere/KeyboardHelper;->c:I

    return v0
.end method

.method public k()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lzendesk/belvedere/KeyboardHelper;->h:Landroid/widget/EditText;

    return-object v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lzendesk/belvedere/KeyboardHelper;->d:I

    return v0
.end method

.method public final m(Landroid/app/Activity;)I
    .locals 2

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Lzendesk/belvedere/KeyboardHelper;->p()I

    move-result p1

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    iget v0, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v0

    sub-int/2addr p1, v1

    return p1
.end method

.method public final n()I
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "dimen"

    const-string v2, "android"

    const-string v3, "status_bar_height"

    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final o()I
    .locals 4

    :try_start_0
    const-class v0, Landroid/view/View;

    const-string v1, "mAttachInfo"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "mStableInsets"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final p()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v1, p0, Lzendesk/belvedere/KeyboardHelper;->b:I

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lzendesk/belvedere/KeyboardHelper;->j()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final s()V
    .locals 3

    iget-object v0, p0, Lzendesk/belvedere/KeyboardHelper;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/belvedere/KeyboardHelper$c;

    invoke-interface {v1}, Lzendesk/belvedere/KeyboardHelper$c;->onKeyboardDismissed()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final t()V
    .locals 3

    iget-object v0, p0, Lzendesk/belvedere/KeyboardHelper;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/belvedere/KeyboardHelper$c;

    invoke-interface {v1}, Lzendesk/belvedere/KeyboardHelper$c;->onKeyboardVisible()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public u(Lzendesk/belvedere/KeyboardHelper$d;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/KeyboardHelper;->g:Lzendesk/belvedere/KeyboardHelper$d;

    return-void
.end method
