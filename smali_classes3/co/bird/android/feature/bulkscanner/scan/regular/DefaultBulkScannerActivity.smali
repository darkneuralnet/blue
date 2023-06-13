.class public final Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity;
.super Lco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$a;,
        Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u00088\u0016@\u0016X\u0097.\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity;",
        "Lco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity;",
        "Lco/bird/android/model/constant/BulkScanPurpose;",
        "purpose",
        "",
        "enablePeripheralKeyboardSupport",
        "",
        "j0",
        "Lm40;",
        "D",
        "Lm40;",
        "m0",
        "()Lm40;",
        "setPresenter",
        "(Lm40;)V",
        "presenter",
        "<init>",
        "()V",
        "a",
        "b",
        "bulk-scanner_release"
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
        "SMAP\nDefaultBulkScannerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultBulkScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,136:1\n44#2:137\n*S KotlinDebug\n*F\n+ 1 DefaultBulkScannerActivity.kt\nco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity\n*L\n53#1:137\n*E\n"
    }
.end annotation


# instance fields
.field public D:Lm40;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public j0(Lco/bird/android/model/constant/BulkScanPurpose;Z)V
    .locals 21

    move-object/from16 v3, p1

    const-string v0, "purpose"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/constant/BulkScanPurpose;->ADD_TO_BATCH:Lco/bird/android/model/constant/BulkScanPurpose;

    if-ne v3, v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "batch"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBatch;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object/from16 v18, v0

    invoke-static {}, Lco/bird/android/feature/bulkscanner/scan/regular/a;->a()Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$a$a;

    move-result-object v1

    move-object v0, v1

    const-string v2, "factory()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LoG2;->a:LoG2;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v4, "applicationContext"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    new-instance v4, Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;

    move-object v2, v4

    move/from16 v5, p2

    invoke-direct {v4, v5}, Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;-><init>(Z)V

    invoke-static/range {p0 .. p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v5

    move-object v4, v5

    const-string v6, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity;->k0()Lv4;

    move-result-object v5

    iget-object v6, v5, Lv4;->A:Landroid/widget/ImageView;

    move-object v5, v6

    const-string v7, "binding.viewFinder"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity;->k0()Lv4;

    move-result-object v6

    iget-object v7, v6, Lv4;->l:Landroidx/appcompat/widget/AppCompatEditText;

    move-object v6, v7

    const-string v8, "binding.codeEditor"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity;->k0()Lv4;

    move-result-object v7

    iget-object v8, v7, Lv4;->k:Landroid/widget/ImageView;

    move-object v7, v8

    const-string v9, "binding.codeButton"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity;->k0()Lv4;

    move-result-object v8

    iget-object v9, v8, Lv4;->d:Landroid/widget/ImageView;

    move-object v8, v9

    const-string v10, "binding.bluetoothButton"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity;->k0()Lv4;

    move-result-object v9

    iget-object v10, v9, Lv4;->p:Landroid/widget/ImageView;

    move-object v9, v10

    const-string v11, "binding.flashButton"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity;->k0()Lv4;

    move-result-object v10

    iget-object v10, v10, Lv4;->t:Landroid/widget/TextView;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity;->k0()Lv4;

    move-result-object v14

    iget-object v15, v14, Lv4;->e:Landroid/widget/FrameLayout;

    move-object v14, v15

    const-string v11, "binding.bottom"

    invoke-static {v15, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity;->k0()Lv4;

    move-result-object v11

    iget-object v11, v11, Lv4;->h:Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;

    move-object v15, v11

    const-string v12, "binding.bulkActionView"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/feature/bulkscanner/scan/base/BaseBulkScannerActivity;->k0()Lv4;

    move-result-object v11

    iget-object v11, v11, Lv4;->v:Lco/bird/android/widget/QrCodeZXingScannerView;

    move-object/from16 v16, v11

    const-string v12, "binding.scannerView"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v19, 0x1c00

    const/16 v20, 0x0

    move-object/from16 v3, p0

    move-object/from16 v17, p1

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v0 .. v20}, Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$a$a$a;->create$default(Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$a$a;LlG2;Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$b;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Lco/bird/android/widget/BirdActionView;Landroid/view/View;Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;Lme/dm7/barcodescanner/zxing/ZXingScannerView;Lco/bird/android/model/constant/BulkScanPurpose;Lco/bird/android/model/wire/WireBatch;ILjava/lang/Object;)Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$a;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v0, v1}, Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity$a;->a(Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity;)V

    return-void
.end method

.method public m0()Lm40;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/bulkscanner/scan/regular/DefaultBulkScannerActivity;->D:Lm40;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
