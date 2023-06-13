.class public final Lco/bird/android/app/feature/prepay/EnterCardActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"

# interfaces
.implements LMN3;
.implements LCx0;
.implements LE10;
.implements LF10;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/prepay/EnterCardActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00015B\u0007\u00a2\u0006\u0004\u00082\u00103J\u0012\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\"\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0008\u0010\u0014\u001a\u00020\u0008H\u0014J\u0010\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0012\u0010\u001d\u001a\u00020\u00082\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010!\u001a\u00020\u00082\u0006\u0010 \u001a\u00020\u001fH\u0016R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100\u00a8\u00066"
    }
    d2 = {
        "Lco/bird/android/app/feature/prepay/EnterCardActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "LMN3;",
        "LCx0;",
        "LE10;",
        "LF10;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "Landroid/view/Menu;",
        "menu",
        "",
        "onCreateOptionsMenu",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "onResume",
        "Landroid/view/MenuItem;",
        "item",
        "onOptionsItemSelected",
        "Lcom/braintreepayments/api/models/PaymentMethodNonce;",
        "paymentMethodNonce",
        "i",
        "Lex0;",
        "configuration",
        "k",
        "l",
        "Ljava/lang/Exception;",
        "error",
        "onError",
        "Lme1;",
        "B",
        "Lme1;",
        "j0",
        "()Lme1;",
        "setPresenterFactory",
        "(Lme1;)V",
        "presenterFactory",
        "LQd1;",
        "C",
        "LQd1;",
        "getPresenter",
        "()LQd1;",
        "setPresenter",
        "(LQd1;)V",
        "presenter",
        "<init>",
        "()V",
        "D",
        "a",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final D:Lco/bird/android/app/feature/prepay/EnterCardActivity$a;

.field public static final E:I


# instance fields
.field public B:Lme1;

.field public C:LQd1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/prepay/EnterCardActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/prepay/EnterCardActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/prepay/EnterCardActivity;->D:Lco/bird/android/app/feature/prepay/EnterCardActivity$a;

    const/16 v0, 0x8

    sput v0, Lco/bird/android/app/feature/prepay/EnterCardActivity;->E:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/core/mvp/BaseActivity;-><init>(ZLjava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public i(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V
    .locals 1

    const-string v0, "paymentMethodNonce"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/prepay/EnterCardActivity;->C:LQd1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LQd1;->a(Lcom/braintreepayments/api/models/PaymentMethodNonce;)V

    :cond_0
    return-void
.end method

.method public final j0()Lme1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/prepay/EnterCardActivity;->B:Lme1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public k(Lex0;)V
    .locals 0

    return-void
.end method

.method public l(I)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/prepay/EnterCardActivity;->C:LQd1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LQd1;->c(I)V

    :cond_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    iget-object v0, p0, Lco/bird/android/app/feature/prepay/EnterCardActivity;->C:LQd1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, LQd1;->onActivityResult(IILandroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    sget-object v0, LH22;->a:LH22;

    invoke-virtual {v0, p0}, LH22;->p0(Lco/bird/android/app/feature/prepay/EnterCardActivity;)V

    const/4 v0, 0x1

    invoke-static {v0}, Landroidx/appcompat/app/c;->O(I)V

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LO2;->c(Landroid/view/LayoutInflater;)LO2;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LO2;->b()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    new-instance v4, Lqe1;

    invoke-direct {v4, p0, p1}, Lqe1;-><init>(Lco/bird/android/core/mvp/BaseActivity;LO2;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/prepay/EnterCardActivity;->j0()Lme1;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->x()LDQ3;

    move-result-object v6

    move-object v2, p0

    invoke-interface/range {v1 .. v6}, Lme1;->a(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lpe1;Le13;LDQ3;)Lie1;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "intent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lie1;->M(Landroid/content/Intent;)V

    iput-object p1, p0, Lco/bird/android/app/feature/prepay/EnterCardActivity;->C:LQd1;

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, LUk4;->menu_add_card:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onError(Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/prepay/EnterCardActivity;->C:LQd1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LQd1;->d(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, LVg4;->done:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/prepay/EnterCardActivity;->C:LQd1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LQd1;->e()V

    :cond_0
    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    iget-object v0, p0, Lco/bird/android/app/feature/prepay/EnterCardActivity;->C:LQd1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LQd1;->onResume()V

    :cond_0
    return-void
.end method
