.class public abstract Lcom/stripe/android/view/StripeActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\u0008\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010#\u001a\u00020$H$J\u0012\u0010%\u001a\u00020$2\u0008\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u0010\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\nH\u0014J\u0010\u00101\u001a\u00020$2\u0006\u00102\u001a\u000203H\u0004R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@DX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0008\u001a\u0004\u0008\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0008\u001a\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0008\u001a\u0004\u0008\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0008\u001a\u0004\u0008 \u0010!\u00a8\u00064"
    }
    d2 = {
        "Lcom/stripe/android/view/StripeActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "()V",
        "alertDisplayer",
        "Lcom/stripe/android/view/AlertDisplayer;",
        "getAlertDisplayer",
        "()Lcom/stripe/android/view/AlertDisplayer;",
        "alertDisplayer$delegate",
        "Lkotlin/Lazy;",
        "value",
        "",
        "isProgressBarVisible",
        "()Z",
        "setProgressBarVisible",
        "(Z)V",
        "progressBar",
        "Landroid/widget/ProgressBar;",
        "getProgressBar$payments_core_release",
        "()Landroid/widget/ProgressBar;",
        "progressBar$delegate",
        "stripeColorUtils",
        "Lcom/stripe/android/view/StripeColorUtils;",
        "getStripeColorUtils",
        "()Lcom/stripe/android/view/StripeColorUtils;",
        "stripeColorUtils$delegate",
        "viewBinding",
        "Lcom/stripe/android/databinding/StripeActivityBinding;",
        "getViewBinding",
        "()Lcom/stripe/android/databinding/StripeActivityBinding;",
        "viewBinding$delegate",
        "viewStub",
        "Landroid/view/ViewStub;",
        "getViewStub$payments_core_release",
        "()Landroid/view/ViewStub;",
        "viewStub$delegate",
        "onActionSave",
        "",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onCreateOptionsMenu",
        "menu",
        "Landroid/view/Menu;",
        "onOptionsItemSelected",
        "item",
        "Landroid/view/MenuItem;",
        "onPrepareOptionsMenu",
        "onProgressBarVisibilityChanged",
        "visible",
        "showError",
        "error",
        "",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStripeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeActivity.kt\ncom/stripe/android/view/StripeActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,95:1\n262#2,2:96\n*S KotlinDebug\n*F\n+ 1 StripeActivity.kt\ncom/stripe/android/view/StripeActivity\n*L\n31#1:96,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final alertDisplayer$delegate:Lkotlin/Lazy;

.field private isProgressBarVisible:Z

.field private final progressBar$delegate:Lkotlin/Lazy;

.field private final stripeColorUtils$delegate:Lkotlin/Lazy;

.field private final viewBinding$delegate:Lkotlin/Lazy;

.field private final viewStub$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Lcom/stripe/android/view/StripeActivity$viewBinding$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/StripeActivity$viewBinding$2;-><init>(Lcom/stripe/android/view/StripeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/StripeActivity;->viewBinding$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/view/StripeActivity$progressBar$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/StripeActivity$progressBar$2;-><init>(Lcom/stripe/android/view/StripeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/StripeActivity;->progressBar$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/view/StripeActivity$viewStub$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/StripeActivity$viewStub$2;-><init>(Lcom/stripe/android/view/StripeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/StripeActivity;->viewStub$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/view/StripeActivity$alertDisplayer$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/StripeActivity$alertDisplayer$2;-><init>(Lcom/stripe/android/view/StripeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/StripeActivity;->alertDisplayer$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/view/StripeActivity$stripeColorUtils$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/StripeActivity$stripeColorUtils$2;-><init>(Lcom/stripe/android/view/StripeActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/StripeActivity;->stripeColorUtils$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getViewBinding(Lcom/stripe/android/view/StripeActivity;)Lcom/stripe/android/databinding/StripeActivityBinding;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/StripeActivity;->getViewBinding()Lcom/stripe/android/databinding/StripeActivityBinding;

    move-result-object p0

    return-object p0
.end method

.method private final getAlertDisplayer()Lcom/stripe/android/view/AlertDisplayer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeActivity;->alertDisplayer$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/AlertDisplayer;

    return-object v0
.end method

.method private final getStripeColorUtils()Lcom/stripe/android/view/StripeColorUtils;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeActivity;->stripeColorUtils$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeColorUtils;

    return-object v0
.end method

.method private final getViewBinding()Lcom/stripe/android/databinding/StripeActivityBinding;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeActivity;->viewBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/databinding/StripeActivityBinding;

    return-object v0
.end method


# virtual methods
.method public final getProgressBar$payments_core_release()Landroid/widget/ProgressBar;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/StripeActivity;->progressBar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-progressBar>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ProgressBar;

    return-object v0
.end method

.method public final getViewStub$payments_core_release()Landroid/view/ViewStub;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeActivity;->viewStub$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    return-object v0
.end method

.method public final isProgressBarVisible()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/StripeActivity;->isProgressBarVisible:Z

    return v0
.end method

.method public abstract onActionSave()V
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/stripe/android/view/StripeActivity;->getViewBinding()Lcom/stripe/android/databinding/StripeActivityBinding;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/databinding/StripeActivityBinding;->getRoot()Landroid/widget/RelativeLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/stripe/android/view/StripeActivity;->getViewBinding()Lcom/stripe/android/databinding/StripeActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/databinding/StripeActivityBinding;->toolbar:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/ActionBar;->v(Z)V

    :cond_0
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$menu;->add_payment_method:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    sget v0, Lcom/stripe/android/R$id;->action_save:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iget-boolean v0, p0, Lcom/stripe/android/view/StripeActivity;->isProgressBarVisible:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return v1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/stripe/android/R$id;->action_save:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeActivity;->onActionSave()V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->f()V

    :cond_1
    :goto_0
    return p1
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 5

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/stripe/android/R$id;->action_save:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-direct {p0}, Lcom/stripe/android/view/StripeActivity;->getStripeColorUtils()Lcom/stripe/android/view/StripeColorUtils;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    const-string v3, "theme"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Lcom/stripe/android/R$attr;->titleTextColor:I

    sget v4, Lcom/stripe/android/R$drawable;->stripe_ic_checkmark:I

    invoke-virtual {v1, v2, v3, v4}, Lcom/stripe/android/view/StripeColorUtils;->getTintedIconWithAttribute(Landroid/content/res/Resources$Theme;II)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    invoke-super {p0, p1}, Landroid/app/Activity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onProgressBarVisibilityChanged(Z)V
    .locals 0

    return-void
.end method

.method public final setProgressBarVisible(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/view/StripeActivity;->getProgressBar$payments_core_release()Landroid/widget/ProgressBar;

    move-result-object v0

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->invalidateOptionsMenu()V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/StripeActivity;->onProgressBarVisibilityChanged(Z)V

    iput-boolean p1, p0, Lcom/stripe/android/view/StripeActivity;->isProgressBarVisible:Z

    return-void
.end method

.method public final showError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/view/StripeActivity;->getAlertDisplayer()Lcom/stripe/android/view/AlertDisplayer;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/stripe/android/view/AlertDisplayer;->show(Ljava/lang/String;)V

    return-void
.end method
