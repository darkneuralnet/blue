.class public final Lb4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Lco/bird/android/widget/BirdActionView;

.field public final c:Landroidx/constraintlayout/widget/Guideline;

.field public final d:Landroid/widget/FrameLayout;

.field public final e:Landroid/widget/ImageView;

.field public final f:Landroidx/appcompat/widget/AppCompatEditText;

.field public final g:Landroidx/constraintlayout/widget/Guideline;

.field public final h:Landroid/view/View;

.field public final i:Landroid/widget/ImageView;

.field public final j:Lco/bird/android/widget/FrequentFlyerScannerView;

.field public final k:Landroid/widget/TextView;

.field public final l:Landroid/widget/TextView;

.field public final m:Landroid/widget/TextView;

.field public final n:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

.field public final o:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final p:Lco/bird/android/widget/QrCodeZXingScannerView;

.field public final q:Landroid/widget/ImageView;

.field public final r:Landroidx/constraintlayout/widget/Guideline;

.field public final s:Landroid/view/View;

.field public final t:Landroidx/constraintlayout/widget/Guideline;

.field public final u:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lco/bird/android/widget/BirdActionView;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/constraintlayout/widget/Guideline;Landroid/view/View;Landroid/widget/ImageView;Lco/bird/android/widget/FrequentFlyerScannerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroidx/constraintlayout/widget/ConstraintLayout;Lco/bird/android/widget/QrCodeZXingScannerView;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/Guideline;Landroid/view/View;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/ImageView;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lb4;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object v1, p2

    iput-object v1, v0, Lb4;->b:Lco/bird/android/widget/BirdActionView;

    move-object v1, p3

    iput-object v1, v0, Lb4;->c:Landroidx/constraintlayout/widget/Guideline;

    move-object v1, p4

    iput-object v1, v0, Lb4;->d:Landroid/widget/FrameLayout;

    move-object v1, p5

    iput-object v1, v0, Lb4;->e:Landroid/widget/ImageView;

    move-object v1, p6

    iput-object v1, v0, Lb4;->f:Landroidx/appcompat/widget/AppCompatEditText;

    move-object v1, p7

    iput-object v1, v0, Lb4;->g:Landroidx/constraintlayout/widget/Guideline;

    move-object v1, p8

    iput-object v1, v0, Lb4;->h:Landroid/view/View;

    move-object v1, p9

    iput-object v1, v0, Lb4;->i:Landroid/widget/ImageView;

    move-object v1, p10

    iput-object v1, v0, Lb4;->j:Lco/bird/android/widget/FrequentFlyerScannerView;

    move-object v1, p11

    iput-object v1, v0, Lb4;->k:Landroid/widget/TextView;

    move-object v1, p12

    iput-object v1, v0, Lb4;->l:Landroid/widget/TextView;

    move-object v1, p13

    iput-object v1, v0, Lb4;->m:Landroid/widget/TextView;

    move-object/from16 v1, p14

    iput-object v1, v0, Lb4;->n:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    move-object/from16 v1, p15

    iput-object v1, v0, Lb4;->o:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object/from16 v1, p16

    iput-object v1, v0, Lb4;->p:Lco/bird/android/widget/QrCodeZXingScannerView;

    move-object/from16 v1, p17

    iput-object v1, v0, Lb4;->q:Landroid/widget/ImageView;

    move-object/from16 v1, p18

    iput-object v1, v0, Lb4;->r:Landroidx/constraintlayout/widget/Guideline;

    move-object/from16 v1, p19

    iput-object v1, v0, Lb4;->s:Landroid/view/View;

    move-object/from16 v1, p20

    iput-object v1, v0, Lb4;->t:Landroidx/constraintlayout/widget/Guideline;

    move-object/from16 v1, p21

    iput-object v1, v0, Lb4;->u:Landroid/widget/ImageView;

    return-void
.end method

.method public static a(Landroid/view/View;)Lb4;
    .locals 25

    move-object/from16 v0, p0

    sget v1, LVg4;->birdStatus:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lco/bird/android/widget/BirdActionView;

    if-eqz v5, :cond_0

    sget v1, LVg4;->bottomGutter:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v6, :cond_0

    sget v1, LVg4;->buttons:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/FrameLayout;

    if-eqz v7, :cond_0

    sget v1, LVg4;->codeButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/widget/ImageView;

    if-eqz v8, :cond_0

    sget v1, LVg4;->codeEditor:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroidx/appcompat/widget/AppCompatEditText;

    if-eqz v9, :cond_0

    sget v1, LVg4;->endGutter:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v10, :cond_0

    sget v1, LVg4;->endScrim:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v11

    if-eqz v11, :cond_0

    sget v1, LVg4;->flashButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/ImageView;

    if-eqz v12, :cond_0

    sget v1, LVg4;->frequentFlyerStatus:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lco/bird/android/widget/FrequentFlyerScannerView;

    if-eqz v13, :cond_0

    sget v1, LVg4;->infoText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/TextView;

    if-eqz v14, :cond_0

    sget v1, LVg4;->peripheralKeyboardScanQrTextView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/widget/TextView;

    if-eqz v15, :cond_0

    sget v1, LVg4;->pricing:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/TextView;

    if-eqz v16, :cond_0

    sget v1, LVg4;->progressBar:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    if-eqz v17, :cond_0

    move-object/from16 v18, v0

    check-cast v18, Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v1, LVg4;->scannerView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Lco/bird/android/widget/QrCodeZXingScannerView;

    if-eqz v19, :cond_0

    sget v1, LVg4;->scooter:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Landroid/widget/ImageView;

    if-eqz v20, :cond_0

    sget v1, LVg4;->startGutter:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v21, :cond_0

    sget v1, LVg4;->startScrim:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v22

    if-eqz v22, :cond_0

    sget v1, LVg4;->topGutter:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v23, :cond_0

    sget v1, LVg4;->viewFinder:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v24, v2

    check-cast v24, Landroid/widget/ImageView;

    if-eqz v24, :cond_0

    new-instance v0, Lb4;

    move-object v3, v0

    move-object/from16 v4, v18

    invoke-direct/range {v3 .. v24}, Lb4;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lco/bird/android/widget/BirdActionView;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/constraintlayout/widget/Guideline;Landroid/view/View;Landroid/widget/ImageView;Lco/bird/android/widget/FrequentFlyerScannerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroidx/constraintlayout/widget/ConstraintLayout;Lco/bird/android/widget/QrCodeZXingScannerView;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/Guideline;Landroid/view/View;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/ImageView;)V

    return-object v0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static c(Landroid/view/LayoutInflater;)Lb4;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lb4;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lb4;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lb4;
    .locals 2

    sget v0, Lcj4;->activity_legacy_bird_scan:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lb4;->a(Landroid/view/View;)Lb4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, Lb4;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lb4;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
