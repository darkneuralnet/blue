.class public Lmi;
.super LQs0;
.source "SourceFile"

# interfaces
.implements Lai;


# instance fields
.field private mDelegate:Landroidx/appcompat/app/c;

.field private final mKeyDispatcher:Ljk2$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lmi;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    invoke-static {p1, p2}, Lmi;->getThemeResId(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, LQs0;-><init>(Landroid/content/Context;I)V

    new-instance v0, Lli;

    invoke-direct {v0, p0}, Lli;-><init>(Lmi;)V

    iput-object v0, p0, Lmi;->mKeyDispatcher:Ljk2$a;

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-static {p1, p2}, Lmi;->getThemeResId(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/c;->R(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/c;->B(Landroid/os/Bundle;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 0

    invoke-direct {p0, p1}, LQs0;-><init>(Landroid/content/Context;)V

    new-instance p1, Lli;

    invoke-direct {p1, p0}, Lli;-><init>(Lmi;)V

    iput-object p1, p0, Lmi;->mKeyDispatcher:Ljk2$a;

    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {p0, p3}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    return-void
.end method

.method private static getThemeResId(Landroid/content/Context;I)I
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    sget v0, Lvf4;->dialogTheme:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    :cond_0
    return p1
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/c;->e(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public dismiss()V
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/c;->C()V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lmi;->mKeyDispatcher:Ljk2$a;

    invoke-static {v1, v0, p0, p1}, Ljk2;->e(Ljk2$a;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/c;->m(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getDelegate()Landroidx/appcompat/app/c;
    .locals 1

    iget-object v0, p0, Lmi;->mDelegate:Landroidx/appcompat/app/c;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Landroidx/appcompat/app/c;->k(Landroid/app/Dialog;Lai;)Landroidx/appcompat/app/c;

    move-result-object v0

    iput-object v0, p0, Lmi;->mDelegate:Landroidx/appcompat/app/c;

    :cond_0
    iget-object v0, p0, Lmi;->mDelegate:Landroidx/appcompat/app/c;

    return-object v0
.end method

.method public getSupportActionBar()Landroidx/appcompat/app/ActionBar;
    .locals 1

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/c;->v()Landroidx/appcompat/app/ActionBar;

    move-result-object v0

    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/c;->x()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/c;->w()V

    invoke-super {p0, p1}, LQs0;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/c;->B(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, LQs0;->onStop()V

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/c;->H()V

    return-void
.end method

.method public onSupportActionModeFinished(LG2;)V
    .locals 0

    return-void
.end method

.method public onSupportActionModeStarted(LG2;)V
    .locals 0

    return-void
.end method

.method public onWindowStartingSupportActionMode(LG2$a;)LG2;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public setContentView(I)V
    .locals 1

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/c;->L(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/c;->M(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/c;->N(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/c;->S(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/c;->S(Ljava/lang/CharSequence;)V

    return-void
.end method

.method superDispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public supportRequestWindowFeature(I)Z
    .locals 1

    invoke-virtual {p0}, Lmi;->getDelegate()Landroidx/appcompat/app/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/c;->K(I)Z

    move-result p1

    return p1
.end method
