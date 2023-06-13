.class public final Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic create$default(Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$a$a;LlG2;Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Lco/bird/android/widget/BirdActionView;Landroid/view/View;Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;Lme/dm7/barcodescanner/zxing/ZXingScannerView;Lco/bird/android/model/constant/BulkScanPurpose;ILjava/lang/Object;)Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$a;
    .locals 21

    move/from16 v0, p18

    if-nez p19, :cond_4

    and-int/lit16 v1, v0, 0x200

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v13, v2

    goto :goto_0

    :cond_0
    move-object/from16 v13, p10

    :goto_0
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_1

    move-object v14, v2

    goto :goto_1

    :cond_1
    move-object/from16 v14, p11

    :goto_1
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_2

    move-object v15, v2

    goto :goto_2

    :cond_2
    move-object/from16 v15, p12

    :goto_2
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_3

    move-object/from16 v16, v2

    goto :goto_3

    :cond_3
    move-object/from16 v16, p13

    :goto_3
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v17, p14

    move-object/from16 v18, p15

    move-object/from16 v19, p16

    move-object/from16 v20, p17

    invoke-interface/range {v3 .. v20}, Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$a$a;->a(LlG2;Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$b;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Lco/bird/android/widget/BirdActionView;Landroid/view/View;Lco/bird/android/feature/bulkscanner/widgets/BulkScanListSheetView;Lme/dm7/barcodescanner/zxing/ZXingScannerView;Lco/bird/android/model/constant/BulkScanPurpose;)Lco/bird/android/feature/bulkscanner/scan/serviceprogress/BulkServiceProgressScannerActivity$a;

    move-result-object v0

    return-object v0

    :cond_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: create"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
