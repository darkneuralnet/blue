.class public final Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0014J\u0008\u0010\u0007\u001a\u00020\u0004H\u0014J\u0008\u0010\u0008\u001a\u00020\u0004H\u0016J\u0008\u0010\t\u001a\u00020\u0004H\u0002R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onResume",
        "onPause",
        "onBackPressed",
        "k0",
        "LU85;",
        "B",
        "LU85;",
        "n0",
        "()LU85;",
        "setBirdScanPresenterImplFactory",
        "(LU85;)V",
        "birdScanPresenterImplFactory",
        "Lh85;",
        "C",
        "Lh85;",
        "presenter",
        "LZS;",
        "D",
        "LZS;",
        "ui",
        "Landroid/os/Handler;",
        "E",
        "Landroid/os/Handler;",
        "handler",
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


# instance fields
.field public B:LU85;

.field public C:Lh85;

.field public D:LZS;

.field public final E:Landroid/os/Handler;


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

    iput-object v0, p0, Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;->E:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic j0(Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;->m0(Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;)V

    return-void
.end method

.method public static final m0(Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;)V
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
.method public final k0()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;->D:LZS;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lhm5;->n0()V

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;->E:Landroid/os/Handler;

    new-instance v1, Lf85;

    invoke-direct {v1, p0}, Lf85;-><init>(Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final n0()LU85;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;->B:LU85;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "birdScanPresenterImplFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;->k0()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 20

    move-object/from16 v15, p0

    invoke-super/range {p0 .. p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Le3;->c(Landroid/view/LayoutInflater;)Le3;

    move-result-object v14

    const-string v0, "inflate(layoutInflater)"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v14, Le3;->q:Landroid/widget/FrameLayout;

    invoke-virtual {v15, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->D()V

    sget-object v0, LH22;->a:LH22;

    invoke-virtual {v0, v15}, LH22;->E2(Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    new-instance v16, Lkm5;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v3

    iget-object v4, v14, Le3;->i:Landroid/widget/ImageView;

    const-string v1, "binding.flashButton"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v14, Le3;->x:Landroid/view/View;

    const-string v1, "binding.viewFinder"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v14, Le3;->f:Landroidx/appcompat/widget/AppCompatEditText;

    const-string v1, "binding.codeEditor"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v14, Le3;->e:Landroid/widget/ImageView;

    const-string v1, "binding.codeButton"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v14, Le3;->m:Landroid/widget/TextView;

    iget-object v9, v14, Le3;->t:Landroid/widget/ImageView;

    iget-object v10, v14, Le3;->b:Lco/bird/android/widget/BirdActionView;

    iget-object v11, v14, Le3;->n:Landroid/widget/TextView;

    sget v1, Lnl4;->scan_bird_v2_info_text:I

    invoke-virtual {v15, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v12

    const-string v1, "getString(L.string.scan_bird_v2_info_text)"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Lnl4;->scan_bird_v2_enter_code_instructions:I

    const/4 v13, 0x2

    new-array v13, v13, [Ljava/lang/Object;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getMinBirdCodeLength()I

    move-result v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    const/16 v18, 0x0

    aput-object v17, v13, v18

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getMaxBirdCodeLength()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v17, 0x1

    aput-object v0, v13, v17

    invoke-virtual {v15, v1, v13}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    const-string v0, "getString(L.string.scan_\u2026Config.maxBirdCodeLength)"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v14, Le3;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v0, "binding.container"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v14, Le3;->q:Landroid/widget/FrameLayout;

    move-object/from16 v17, v1

    const-string v1, "binding.root"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v18, v0

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    move-object/from16 v19, v14

    move-object/from16 v14, v17

    move-object/from16 v15, v18

    invoke-direct/range {v0 .. v15}, Lkm5;-><init>(Lco/bird/android/core/mvp/BaseActivity;LTq4;Landroidx/appcompat/app/ActionBar;Landroid/widget/ImageView;Landroid/view/View;Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Lco/bird/android/widget/BirdActionView;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V

    new-instance v8, LaT;

    move-object/from16 v0, v19

    iget-object v2, v0, Le3;->j:Lco/bird/android/widget/FrequentFlyerScannerView;

    const-string v1, "binding.frequentFlyerStatus"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Le3;->b:Lco/bird/android/widget/BirdActionView;

    const-string v1, "binding.birdStatus"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Le3;->n:Landroid/widget/TextView;

    const-string v1, "binding.pricing"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Le3;->v:Landroid/widget/TextView;

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

    move-object/from16 v6, v16

    invoke-direct/range {v0 .. v7}, LaT;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/FrequentFlyerScannerView;Lco/bird/android/widget/BirdActionView;Landroid/widget/TextView;Landroid/widget/TextView;Lhm5;Z)V

    move-object/from16 v0, p0

    iput-object v8, v0, Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;->D:LZS;

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "rider_bird_scan"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Lco/bird/android/model/extra/RiderBirdScanExtra;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;->n0()LU85;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v3

    iget-object v4, v0, Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;->D:LZS;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, v3, v1, v4}, LU85;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/model/extra/RiderBirdScanExtra;LZS;)LO85;

    move-result-object v1

    invoke-virtual {v1}, LO85;->a()V

    iput-object v1, v0, Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;->C:Lh85;

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/mvp/BaseActivity;->onPause()V

    iget-object v0, p0, Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;->C:Lh85;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lh85;->onPause()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    iget-object v0, p0, Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;->C:Lh85;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lh85;->onResume()V

    :cond_0
    return-void
.end method
