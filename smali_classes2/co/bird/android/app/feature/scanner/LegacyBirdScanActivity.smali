.class public final Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0014J\u0008\u0010\u0007\u001a\u00020\u0004H\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016J\u0006\u0010\u000f\u001a\u00020\u0004J\u0008\u0010\u0010\u001a\u00020\u0004H\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0016\u0010\'\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006*"
    }
    d2 = {
        "Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onResume",
        "onPause",
        "Landroid/view/Menu;",
        "menu",
        "",
        "onCreateOptionsMenu",
        "Landroid/view/MenuItem;",
        "item",
        "onOptionsItemSelected",
        "k0",
        "onBackPressed",
        "LVS;",
        "B",
        "LVS;",
        "n0",
        "()LVS;",
        "setBirdScanPresenterFactory",
        "(LVS;)V",
        "birdScanPresenterFactory",
        "LxS;",
        "C",
        "LxS;",
        "presenter",
        "Landroid/os/Handler;",
        "D",
        "Landroid/os/Handler;",
        "handler",
        "LZS;",
        "E",
        "LZS;",
        "ui",
        "F",
        "Z",
        "enablePeripheralKeyboardSupport",
        "<init>",
        "()V",
        "app_birdRelease"
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
        "SMAP\nLegacyBirdScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyBirdScanActivity.kt\nco/bird/android/app/feature/scanner/LegacyBirdScanActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"
    }
.end annotation


# instance fields
.field public B:LVS;

.field public C:LxS;

.field public final D:Landroid/os/Handler;

.field public E:LZS;

.field public F:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

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

    iput-object v0, p0, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->D:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic j0(Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->m0(Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;)V

    return-void
.end method

.method public static final m0(Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget v0, Ldf4;->slide_none:I

    sget v1, Ldf4;->slide_down:I

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public static final o0(Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;)Landroid/graphics/drawable/Drawable;
    .locals 1

    sget v0, Lyg4;->ic_code_scooter:I

    invoke-static {p0, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static final p0(Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;)Landroid/graphics/drawable/Drawable;
    .locals 1

    sget v0, Lyg4;->ic_qr_scooter:I

    invoke-static {p0, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final k0()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->E:LZS;

    if-nez v0, :cond_0

    const-string v0, "ui"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, Lhm5;->n0()V

    iget-object v0, p0, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->D:Landroid/os/Handler;

    new-instance v1, LWo2;

    invoke-direct {v1, p0}, LWo2;-><init>(Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final n0()LVS;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->B:LVS;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "birdScanPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->k0()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 21

    move-object/from16 v14, p0

    invoke-super/range {p0 .. p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Lb4;->c(Landroid/view/LayoutInflater;)Lb4;

    move-result-object v15

    const-string v0, "inflate(layoutInflater)"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v15, Lb4;->o:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v14, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->D()V

    sget-object v0, LH22;->a:LH22;

    invoke-virtual {v0, v14}, LH22;->t1(Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->keyboard:I

    const/16 v16, 0x0

    const/4 v13, 0x1

    if-eq v0, v13, :cond_0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

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

    move v0, v13

    goto :goto_0

    :cond_0
    move/from16 v0, v16

    :goto_0
    iput-boolean v0, v14, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->F:Z

    const-string v1, "binding.codeButton"

    const-string v2, "binding.codeEditor"

    const-string v3, "binding.viewFinder"

    const-string v4, "binding.flashButton"

    const-string v5, "binding.scannerView"

    if-eqz v0, :cond_1

    new-instance v17, LrQ3;

    iget-object v6, v15, Lb4;->p:Lco/bird/android/widget/QrCodeZXingScannerView;

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v15, Lb4;->i:Landroid/widget/ImageView;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v15, Lb4;->u:Landroid/widget/ImageView;

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v15, Lb4;->f:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v15, Lb4;->e:Landroid/widget/ImageView;

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v15, Lb4;->l:Landroid/widget/TextView;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {p0 .. p0}, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->o0(Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;)Landroid/graphics/drawable/Drawable;

    move-result-object v18

    const/16 v19, 0x380

    const/16 v20, 0x0

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    move-object v2, v6

    move-object v3, v5

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-object/from16 v11, v18

    move/from16 v12, v19

    move/from16 v18, v13

    move-object/from16 v13, v20

    invoke-direct/range {v0 .. v13}, LrQ3;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lme/dm7/barcodescanner/zxing/ZXingScannerView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Lco/bird/android/widget/BirdActionView;Landroid/graphics/drawable/Drawable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v17

    goto :goto_1

    :cond_1
    move/from16 v18, v13

    new-instance v12, Lip2;

    iget-object v6, v15, Lb4;->p:Lco/bird/android/widget/QrCodeZXingScannerView;

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v15, Lb4;->i:Landroid/widget/ImageView;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v15, Lb4;->u:Landroid/widget/ImageView;

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v15, Lb4;->f:Landroidx/appcompat/widget/AppCompatEditText;

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v15, Lb4;->e:Landroid/widget/ImageView;

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v15, Lb4;->k:Landroid/widget/TextView;

    iget-object v10, v15, Lb4;->q:Landroid/widget/ImageView;

    iget-object v11, v15, Lb4;->b:Lco/bird/android/widget/BirdActionView;

    invoke-static/range {p0 .. p0}, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->o0(Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;)Landroid/graphics/drawable/Drawable;

    move-result-object v13

    invoke-static/range {p0 .. p0}, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->p0(Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;)Landroid/graphics/drawable/Drawable;

    move-result-object v17

    move-object v0, v12

    move-object/from16 v1, p0

    move-object v2, v6

    move-object v3, v5

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v11

    move-object v10, v13

    move-object/from16 v11, v17

    invoke-direct/range {v0 .. v11}, Lip2;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lme/dm7/barcodescanner/zxing/ZXingScannerView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Lco/bird/android/widget/BirdActionView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    move-object v6, v12

    :goto_1
    new-instance v8, LaT;

    iget-object v2, v15, Lb4;->j:Lco/bird/android/widget/FrequentFlyerScannerView;

    const-string v0, "binding.frequentFlyerStatus"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v15, Lb4;->b:Lco/bird/android/widget/BirdActionView;

    const-string v0, "binding.birdStatus"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v15, Lb4;->m:Landroid/widget/TextView;

    const-string v0, "binding.pricing"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getPricingUiConfig()Lco/bird/android/model/wire/configs/PricingUiConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/PricingUiConfig;->getEnableScannerTapToSeePricing()Z

    move-result v7

    move-object v0, v8

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v7}, LaT;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/FrequentFlyerScannerView;Lco/bird/android/widget/BirdActionView;Landroid/widget/TextView;Landroid/widget/TextView;Lhm5;Z)V

    iput-object v8, v14, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->E:LZS;

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "scan_barcode"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v3, v0

    check-cast v3, Lco/bird/android/model/extra/ScanBarcodeExtra;

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getCallingActivity()Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_2

    move/from16 v6, v18

    goto :goto_2

    :cond_2
    move/from16 v6, v16

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->n0()LVS;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v2

    iget-object v0, v14, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->E:LZS;

    const/4 v8, 0x0

    if-nez v0, :cond_3

    const-string v0, "ui"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v8

    goto :goto_3

    :cond_3
    move-object v4, v0

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v5

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, LVS;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/model/extra/ScanBarcodeExtra;LZS;Le13;ZZ)LSS;

    move-result-object v0

    iput-object v0, v14, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->C:LxS;

    if-nez v0, :cond_4

    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_4

    :cond_4
    move-object v8, v0

    :goto_4
    invoke-interface {v8}, LxS;->a()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->F:Z

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

    iget-object v0, p0, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->C:LxS;

    if-nez v0, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    invoke-interface {v2}, LxS;->onBackPressed()V

    goto :goto_2

    :cond_1
    sget v1, Lai4;->qrCode:I

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->C:LxS;

    if-nez v0, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v2, v0

    :goto_1
    invoke-interface {v2}, LxS;->q()V

    :cond_3
    :goto_2
    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/mvp/BaseActivity;->onPause()V

    iget-object v0, p0, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->C:LxS;

    if-nez v0, :cond_0

    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, LxS;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    iget-object v0, p0, Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;->C:LxS;

    if-nez v0, :cond_0

    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, LxS;->onResume()V

    return-void
.end method
