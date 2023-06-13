.class public final LS3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroid/view/View;

.field public final c:Landroid/view/View;

.field public final d:Landroidx/constraintlayout/widget/Group;

.field public final e:Landroid/widget/ImageView;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/view/View;

.field public final h:Landroid/view/View;

.field public final i:Landroid/widget/TextView;

.field public final j:Lco/bird/android/widget/scan/GraphicOverlay;

.field public final k:Landroid/view/View;

.field public final l:Landroid/widget/TextView;

.field public final m:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

.field public final n:Landroid/widget/Button;

.field public final o:Lco/bird/android/widget/scan/IdentificationScanView;

.field public final p:Landroid/widget/TextView;

.field public final q:Landroid/view/View;

.field public final r:Landroid/widget/Button;

.field public final s:Landroid/view/View;

.field public final t:Landroid/widget/Button;

.field public final u:Landroid/view/View;

.field public final v:Landroidx/constraintlayout/widget/Group;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroidx/constraintlayout/widget/Group;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Lco/bird/android/widget/scan/GraphicOverlay;Landroid/view/View;Landroid/widget/TextView;Lcom/google/android/material/progressindicator/CircularProgressIndicator;Landroid/widget/Button;Lco/bird/android/widget/scan/IdentificationScanView;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/Button;Landroid/view/View;Landroid/widget/Button;Landroid/view/View;Landroidx/constraintlayout/widget/Group;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, LS3;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object v1, p2

    iput-object v1, v0, LS3;->b:Landroid/view/View;

    move-object v1, p3

    iput-object v1, v0, LS3;->c:Landroid/view/View;

    move-object v1, p4

    iput-object v1, v0, LS3;->d:Landroidx/constraintlayout/widget/Group;

    move-object v1, p5

    iput-object v1, v0, LS3;->e:Landroid/widget/ImageView;

    move-object v1, p6

    iput-object v1, v0, LS3;->f:Landroid/widget/TextView;

    move-object v1, p7

    iput-object v1, v0, LS3;->g:Landroid/view/View;

    move-object v1, p8

    iput-object v1, v0, LS3;->h:Landroid/view/View;

    move-object v1, p9

    iput-object v1, v0, LS3;->i:Landroid/widget/TextView;

    move-object v1, p10

    iput-object v1, v0, LS3;->j:Lco/bird/android/widget/scan/GraphicOverlay;

    move-object v1, p11

    iput-object v1, v0, LS3;->k:Landroid/view/View;

    move-object v1, p12

    iput-object v1, v0, LS3;->l:Landroid/widget/TextView;

    move-object v1, p13

    iput-object v1, v0, LS3;->m:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    move-object/from16 v1, p14

    iput-object v1, v0, LS3;->n:Landroid/widget/Button;

    move-object/from16 v1, p15

    iput-object v1, v0, LS3;->o:Lco/bird/android/widget/scan/IdentificationScanView;

    move-object/from16 v1, p16

    iput-object v1, v0, LS3;->p:Landroid/widget/TextView;

    move-object/from16 v1, p17

    iput-object v1, v0, LS3;->q:Landroid/view/View;

    move-object/from16 v1, p18

    iput-object v1, v0, LS3;->r:Landroid/widget/Button;

    move-object/from16 v1, p19

    iput-object v1, v0, LS3;->s:Landroid/view/View;

    move-object/from16 v1, p20

    iput-object v1, v0, LS3;->t:Landroid/widget/Button;

    move-object/from16 v1, p21

    iput-object v1, v0, LS3;->u:Landroid/view/View;

    move-object/from16 v1, p22

    iput-object v1, v0, LS3;->v:Landroidx/constraintlayout/widget/Group;

    return-void
.end method

.method public static a(Landroid/view/View;)LS3;
    .locals 25

    move-object/from16 v0, p0

    sget v1, Luh4;->bottomGrayArea:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_0

    sget v1, Luh4;->buttonsBg:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_0

    sget v1, Luh4;->confirmImageGroup:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroidx/constraintlayout/widget/Group;

    if-eqz v6, :cond_0

    sget v1, Luh4;->confirmImageView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/ImageView;

    if-eqz v7, :cond_0

    sget v1, Luh4;->debugText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/widget/TextView;

    if-eqz v8, :cond_0

    sget v1, Luh4;->endGrayArea:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v9

    if-eqz v9, :cond_0

    sget v1, Luh4;->footerBackground:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v10

    if-eqz v10, :cond_0

    sget v1, Luh4;->frameText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/TextView;

    if-eqz v11, :cond_0

    sget v1, Luh4;->graphicOverlay:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lco/bird/android/widget/scan/GraphicOverlay;

    if-eqz v12, :cond_0

    sget v1, Luh4;->headerBackground:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v13

    if-eqz v13, :cond_0

    sget v1, Luh4;->headerText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/TextView;

    if-eqz v14, :cond_0

    sget v1, Luh4;->progressBar:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    if-eqz v15, :cond_0

    sget v1, Luh4;->retakeButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/Button;

    if-eqz v16, :cond_0

    sget v1, Luh4;->scanView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lco/bird/android/widget/scan/IdentificationScanView;

    if-eqz v17, :cond_0

    sget v1, Luh4;->secondaryText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Landroid/widget/TextView;

    if-eqz v18, :cond_0

    sget v1, Luh4;->startGrayArea:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v19

    if-eqz v19, :cond_0

    sget v1, Luh4;->takePhotoButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Landroid/widget/Button;

    if-eqz v20, :cond_0

    sget v1, Luh4;->topGrayArea:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v21

    if-eqz v21, :cond_0

    sget v1, Luh4;->usePhotoButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v22, v2

    check-cast v22, Landroid/widget/Button;

    if-eqz v22, :cond_0

    sget v1, Luh4;->viewfinderFrame:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v23

    if-eqz v23, :cond_0

    sget v1, Luh4;->viewfinderGroup:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v24, v2

    check-cast v24, Landroidx/constraintlayout/widget/Group;

    if-eqz v24, :cond_0

    new-instance v1, LS3;

    move-object v2, v1

    move-object v3, v0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct/range {v2 .. v24}, LS3;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroidx/constraintlayout/widget/Group;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Lco/bird/android/widget/scan/GraphicOverlay;Landroid/view/View;Landroid/widget/TextView;Lcom/google/android/material/progressindicator/CircularProgressIndicator;Landroid/widget/Button;Lco/bird/android/widget/scan/IdentificationScanView;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/Button;Landroid/view/View;Landroid/widget/Button;Landroid/view/View;Landroidx/constraintlayout/widget/Group;)V

    return-object v1

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

.method public static c(Landroid/view/LayoutInflater;)LS3;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LS3;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LS3;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LS3;
    .locals 2

    sget v0, Lhj4;->activity_identification_scanner:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LS3;->a(Landroid/view/View;)LS3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, LS3;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LS3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
