.class public final LW2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroidx/constraintlayout/widget/Guideline;

.field public final c:Landroidx/constraintlayout/widget/Guideline;

.field public final d:Landroid/view/View;

.field public final e:Landroid/widget/ImageView;

.field public final f:Landroid/widget/FrameLayout;

.field public final g:Lco/bird/android/widget/standardcomponents/OptionalImeEditText;

.field public final h:Landroid/widget/TextView;

.field public final i:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

.field public final j:Landroid/widget/ImageView;

.field public final k:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final l:Landroidx/constraintlayout/widget/Guideline;

.field public final m:Landroid/view/View;

.field public final n:Landroidx/constraintlayout/widget/Guideline;

.field public final o:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Lco/bird/android/widget/standardcomponents/OptionalImeEditText;Landroid/widget/TextView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/Guideline;Landroid/view/View;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW2;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, LW2;->b:Landroidx/constraintlayout/widget/Guideline;

    iput-object p3, p0, LW2;->c:Landroidx/constraintlayout/widget/Guideline;

    iput-object p4, p0, LW2;->d:Landroid/view/View;

    iput-object p5, p0, LW2;->e:Landroid/widget/ImageView;

    iput-object p6, p0, LW2;->f:Landroid/widget/FrameLayout;

    iput-object p7, p0, LW2;->g:Lco/bird/android/widget/standardcomponents/OptionalImeEditText;

    iput-object p8, p0, LW2;->h:Landroid/widget/TextView;

    iput-object p9, p0, LW2;->i:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    iput-object p10, p0, LW2;->j:Landroid/widget/ImageView;

    iput-object p11, p0, LW2;->k:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p12, p0, LW2;->l:Landroidx/constraintlayout/widget/Guideline;

    iput-object p13, p0, LW2;->m:Landroid/view/View;

    iput-object p14, p0, LW2;->n:Landroidx/constraintlayout/widget/Guideline;

    iput-object p15, p0, LW2;->o:Landroid/widget/ImageView;

    return-void
.end method

.method public static a(Landroid/view/View;)LW2;
    .locals 19

    move-object/from16 v0, p0

    sget v1, Lai4;->bottomGutter:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v5, :cond_0

    sget v1, Lai4;->endGutter:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v6, :cond_0

    sget v1, Lai4;->endScrim:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_0

    sget v1, Lai4;->flashButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/widget/ImageView;

    if-eqz v8, :cond_0

    sget v1, Lai4;->peripheralContainer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/FrameLayout;

    if-eqz v9, :cond_0

    sget v1, Lai4;->peripheralEditText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lco/bird/android/widget/standardcomponents/OptionalImeEditText;

    if-eqz v10, :cond_0

    sget v1, Lai4;->peripheralKeyboardScanQrTextView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/TextView;

    if-eqz v11, :cond_0

    sget v1, Lai4;->progressBar:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    if-eqz v12, :cond_0

    sget v1, Lai4;->qrImage:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroid/widget/ImageView;

    if-eqz v13, :cond_0

    move-object v14, v0

    check-cast v14, Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v1, Lai4;->startGutter:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v15, :cond_0

    sget v1, Lai4;->startScrim:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v16

    if-eqz v16, :cond_0

    sget v1, Lai4;->topGutter:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v17, :cond_0

    sget v1, Lai4;->viewFinder:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Landroid/widget/ImageView;

    if-eqz v18, :cond_0

    new-instance v0, LW2;

    move-object v3, v0

    move-object v4, v14

    invoke-direct/range {v3 .. v18}, LW2;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Lco/bird/android/widget/standardcomponents/OptionalImeEditText;Landroid/widget/TextView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/Guideline;Landroid/view/View;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/ImageView;)V

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

.method public static c(Landroid/view/LayoutInflater;)LW2;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LW2;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LW2;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LW2;
    .locals 2

    sget v0, LNj4;->activity_barcode_scanner:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LW2;->a(Landroid/view/View;)LW2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, LW2;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LW2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
