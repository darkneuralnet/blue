.class public final Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0014J\u0008\u0010\u0007\u001a\u00020\u0004H\u0014J\u0008\u0010\u0008\u001a\u00020\u0004H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onResume",
        "onPause",
        "onBackPressed",
        "Lit3;",
        "B",
        "Lit3;",
        "j0",
        "()Lit3;",
        "setOperatorScannerPresenterDelegateImplFactory",
        "(Lit3;)V",
        "operatorScannerPresenterDelegateImplFactory",
        "LIx6;",
        "C",
        "LIx6;",
        "k0",
        "()LIx6;",
        "setWakeVehiclesPresenterImplFactory",
        "(LIx6;)V",
        "wakeVehiclesPresenterImplFactory",
        "Lwx6;",
        "D",
        "Lwx6;",
        "presenter",
        "LLx6;",
        "E",
        "LLx6;",
        "ui",
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
.field public B:Lit3;

.field public C:LIx6;

.field public D:Lwx6;

.field public E:LLx6;


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

    return-void
.end method


# virtual methods
.method public final j0()Lit3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;->B:Lit3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "operatorScannerPresenterDelegateImplFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k0()LIx6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;->C:LIx6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "wakeVehiclesPresenterImplFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;->E:LLx6;

    if-nez v0, :cond_0

    const-string v0, "ui"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, Lhm5;->n0()V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->e3()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 19

    move-object/from16 v14, p0

    invoke-super/range {p0 .. p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    sget-object v0, LH22;->a:LH22;

    invoke-virtual {v0, v14}, LH22;->G(Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Lb4;->c(Landroid/view/LayoutInflater;)Lb4;

    move-result-object v15

    const-string v0, "inflate(layoutInflater)"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v15, Lb4;->o:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v14, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->D()V

    new-instance v13, Lip2;

    iget-object v2, v15, Lb4;->p:Lco/bird/android/widget/QrCodeZXingScannerView;

    const-string v12, "binding.scannerView"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v15, Lb4;->i:Landroid/widget/ImageView;

    const-string v0, "binding.flashButton"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v15, Lb4;->u:Landroid/widget/ImageView;

    const-string v0, "binding.viewFinder"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v15, Lb4;->f:Landroidx/appcompat/widget/AppCompatEditText;

    const-string v0, "binding.codeEditor"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v15, Lb4;->e:Landroid/widget/ImageView;

    const-string v0, "binding.codeButton"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget v0, Lyg4;->ic_code_scooter:I

    invoke-static {v14, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    sget v0, Lyg4;->ic_qr_scooter:I

    invoke-static {v14, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    const/16 v16, 0x1c0

    const/16 v17, 0x0

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v18, v12

    move/from16 v12, v16

    move-object/from16 p1, v15

    move-object v15, v13

    move-object/from16 v13, v17

    invoke-direct/range {v0 .. v13}, Lip2;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lme/dm7/barcodescanner/zxing/ZXingScannerView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Lco/bird/android/widget/BirdActionView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, LMx6;

    invoke-direct {v0, v14, v15}, LMx6;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lhm5;)V

    iput-object v0, v14, Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;->E:LLx6;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;->j0()Lit3;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    iget-object v2, v14, Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;->E:LLx6;

    const-string v3, "ui"

    const/4 v4, 0x0

    if-nez v2, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object/from16 v5, p1

    move-object v2, v4

    goto :goto_0

    :cond_0
    move-object/from16 v5, p1

    :goto_0
    iget-object v5, v5, Lb4;->p:Lco/bird/android/widget/QrCodeZXingScannerView;

    move-object/from16 v6, v18

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2, v5}, Lit3;->a(Lcom/uber/autodispose/ScopeProvider;Lhm5;Lme/dm7/barcodescanner/zxing/ZXingScannerView;)Lht3;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;->k0()LIx6;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v2

    iget-object v5, v14, Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;->E:LLx6;

    if-nez v5, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v4

    :cond_1
    invoke-interface {v1, v2, v5, v0}, LIx6;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LLx6;Let3;)LHx6;

    move-result-object v0

    iput-object v0, v14, Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;->D:Lwx6;

    if-nez v0, :cond_2

    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v4, v0

    :goto_1
    invoke-interface {v4}, Let3;->a()V

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/mvp/BaseActivity;->onPause()V

    iget-object v0, p0, Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;->D:Lwx6;

    if-nez v0, :cond_0

    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, Let3;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    iget-object v0, p0, Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;->D:Lwx6;

    if-nez v0, :cond_0

    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, Let3;->onResume()V

    return-void
.end method
