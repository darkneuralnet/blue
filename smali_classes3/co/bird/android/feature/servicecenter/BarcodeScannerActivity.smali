.class public final Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$a;,
        Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0007\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J\u0008\u0010\u000e\u001a\u00020\u0004H\u0014J\u0008\u0010\u000f\u001a\u00020\u0004H\u0014R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0016\u0010&\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006,"
    }
    d2 = {
        "Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onBackPressed",
        "Landroid/view/Menu;",
        "menu",
        "",
        "onCreateOptionsMenu",
        "Landroid/view/MenuItem;",
        "item",
        "onOptionsItemSelected",
        "onResume",
        "onPause",
        "Lry;",
        "B",
        "Lry;",
        "k0",
        "()Lry;",
        "setPresenterFactory",
        "(Lry;)V",
        "presenterFactory",
        "Lme/dm7/barcodescanner/zxing/ZXingScannerView;",
        "C",
        "Lme/dm7/barcodescanner/zxing/ZXingScannerView;",
        "scannerView",
        "LYx;",
        "D",
        "LYx;",
        "presenter",
        "Landroid/os/Handler;",
        "E",
        "Landroid/os/Handler;",
        "handler",
        "F",
        "Z",
        "enablePeripheralKeyboardSupport",
        "<init>",
        "()V",
        "G",
        "a",
        "b",
        "servicecenter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBarcodeScannerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarcodeScannerActivity.kt\nco/bird/android/feature/servicecenter/BarcodeScannerActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"
    }
.end annotation


# static fields
.field public static final G:Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$b;


# instance fields
.field public B:Lry;

.field public C:Lme/dm7/barcodescanner/zxing/ZXingScannerView;

.field public D:LYx;

.field public final E:Landroid/os/Handler;

.field public F:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->G:Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$b;

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

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->E:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic j0(Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->m0(Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;)V

    return-void
.end method

.method public static final m0(Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget v0, Ldf4;->slide_none:I

    sget v1, Ldf4;->slide_down:I

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method


# virtual methods
.method public final k0()Lry;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->B:Lry;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->E:Landroid/os/Handler;

    new-instance v1, LVx;

    invoke-direct {v1, p0}, LVx;-><init>(Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onBackPressed()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, LW2;->c(Landroid/view/LayoutInflater;)LW2;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, LW2;->k:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->D()V

    invoke-static {}, Lco/bird/android/feature/servicecenter/a;->a()Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$a$a;

    move-result-object v0

    sget-object v1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v2

    const-string v3, "application"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    invoke-interface {v0, v1}, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$a$a;->a(LlG2;)Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$a$a;

    move-result-object v0

    invoke-interface {v0}, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$a$a;->build()Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$a;

    move-result-object v0

    invoke-interface {v0, p0}, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$a;->a(Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;)V

    new-instance v0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$onCreate$1;

    invoke-direct {v0, p0}, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity$onCreate$1;-><init>(Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;)V

    iput-object v0, p0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->C:Lme/dm7/barcodescanner/zxing/ZXingScannerView;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->keyboard:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorConfig;->getEnablePeripheralKeyboardSupport()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->F:Z

    invoke-virtual {p0}, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->k0()Lry;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v3

    new-instance v4, Lvy;

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->C:Lme/dm7/barcodescanner/zxing/ZXingScannerView;

    if-nez v0, :cond_1

    const-string v0, "scannerView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    invoke-direct {v4, p0, p1, v0}, Lvy;-><init>(Lco/bird/android/core/mvp/BaseActivity;LW2;Lme/dm7/barcodescanner/zxing/ZXingScannerView;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->x()LDQ3;

    move-result-object v6

    iget-boolean v7, p0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->F:Z

    invoke-interface/range {v2 .. v7}, Lry;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Luy;Le13;LDQ3;Z)Lny;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "intent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lny;->w(Landroid/content/Intent;)V

    iput-object p1, p0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->D:LYx;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "activity_title"

    sget v2, Lnl4;->service_center_scan_location:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/ActionBar;->E(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->F:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, LGk4;->menu_qr_code:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    sget v0, Lzi4;->qrCode:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LP61;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v1, -0x1

    invoke-static {v0, v1}, LP61;->n(Landroid/graphics/drawable/Drawable;I)V

    :cond_1
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    :goto_1
    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 4

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    const/4 v2, 0x0

    const-string v3, "presenter"

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->D:LYx;

    if-nez v0, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    invoke-interface {v2}, LYx;->onBackPressed()V

    goto :goto_2

    :cond_1
    sget v1, Lai4;->qrCode:I

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->D:LYx;

    if-nez v0, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v2, v0

    :goto_1
    invoke-interface {v2}, LYx;->q()V

    :cond_3
    :goto_2
    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/mvp/BaseActivity;->onPause()V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->D:LYx;

    if-nez v0, :cond_0

    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, LYx;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/BarcodeScannerActivity;->D:LYx;

    if-nez v0, :cond_0

    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, LYx;->onResume()V

    return-void
.end method
