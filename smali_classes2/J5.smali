.class public final LJ5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroid/widget/ImageView;

.field public final c:Landroidx/constraintlayout/widget/Barrier;

.field public final d:Landroid/view/View;

.field public final e:Lco/bird/android/widget/CameraxView;

.field public final f:Landroidx/constraintlayout/widget/Guideline;

.field public final g:Landroidx/constraintlayout/widget/Guideline;

.field public final h:Landroid/widget/LinearLayout;

.field public final i:Landroid/widget/ImageView;

.field public final j:Landroid/widget/FrameLayout;

.field public final k:Landroid/widget/RelativeLayout;

.field public final l:Landroid/widget/Button;

.field public final m:Landroid/widget/TextView;

.field public final n:Landroid/widget/ImageView;

.field public final o:Landroid/widget/TextView;

.field public final p:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

.field public final q:Landroid/widget/ImageView;

.field public final r:Landroid/widget/Button;

.field public final s:Landroid/widget/RelativeLayout;

.field public final t:Landroidx/constraintlayout/widget/Barrier;

.field public final u:Landroid/view/View;

.field public final v:Landroid/widget/ImageView;

.field public final w:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/Barrier;Landroid/view/View;Lco/bird/android/widget/CameraxView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroid/widget/RelativeLayout;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/ImageView;Landroid/widget/Button;Landroid/widget/RelativeLayout;Landroidx/constraintlayout/widget/Barrier;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/Button;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, LJ5;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object v1, p2

    iput-object v1, v0, LJ5;->b:Landroid/widget/ImageView;

    move-object v1, p3

    iput-object v1, v0, LJ5;->c:Landroidx/constraintlayout/widget/Barrier;

    move-object v1, p4

    iput-object v1, v0, LJ5;->d:Landroid/view/View;

    move-object v1, p5

    iput-object v1, v0, LJ5;->e:Lco/bird/android/widget/CameraxView;

    move-object v1, p6

    iput-object v1, v0, LJ5;->f:Landroidx/constraintlayout/widget/Guideline;

    move-object v1, p7

    iput-object v1, v0, LJ5;->g:Landroidx/constraintlayout/widget/Guideline;

    move-object v1, p8

    iput-object v1, v0, LJ5;->h:Landroid/widget/LinearLayout;

    move-object v1, p9

    iput-object v1, v0, LJ5;->i:Landroid/widget/ImageView;

    move-object v1, p10

    iput-object v1, v0, LJ5;->j:Landroid/widget/FrameLayout;

    move-object v1, p11

    iput-object v1, v0, LJ5;->k:Landroid/widget/RelativeLayout;

    move-object v1, p12

    iput-object v1, v0, LJ5;->l:Landroid/widget/Button;

    move-object v1, p13

    iput-object v1, v0, LJ5;->m:Landroid/widget/TextView;

    move-object/from16 v1, p14

    iput-object v1, v0, LJ5;->n:Landroid/widget/ImageView;

    move-object/from16 v1, p15

    iput-object v1, v0, LJ5;->o:Landroid/widget/TextView;

    move-object/from16 v1, p16

    iput-object v1, v0, LJ5;->p:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    move-object/from16 v1, p17

    iput-object v1, v0, LJ5;->q:Landroid/widget/ImageView;

    move-object/from16 v1, p18

    iput-object v1, v0, LJ5;->r:Landroid/widget/Button;

    move-object/from16 v1, p19

    iput-object v1, v0, LJ5;->s:Landroid/widget/RelativeLayout;

    move-object/from16 v1, p20

    iput-object v1, v0, LJ5;->t:Landroidx/constraintlayout/widget/Barrier;

    move-object/from16 v1, p21

    iput-object v1, v0, LJ5;->u:Landroid/view/View;

    move-object/from16 v1, p22

    iput-object v1, v0, LJ5;->v:Landroid/widget/ImageView;

    move-object/from16 v1, p23

    iput-object v1, v0, LJ5;->w:Landroid/widget/Button;

    return-void
.end method

.method public static a(Landroid/view/View;)LJ5;
    .locals 27

    move-object/from16 v0, p0

    sget v1, LVg4;->birdImageView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/ImageView;

    if-eqz v5, :cond_0

    sget v1, LVg4;->bottomBarrier:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroidx/constraintlayout/widget/Barrier;

    if-eqz v6, :cond_0

    sget v1, LVg4;->bottomOverlay:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_0

    sget v1, LVg4;->camera:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lco/bird/android/widget/CameraxView;

    if-eqz v8, :cond_0

    sget v1, LVg4;->centerHorizontalGuide:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v9, :cond_0

    sget v1, LVg4;->centerVerticalGuide:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v10, :cond_0

    sget v1, LVg4;->confirmPhotoFooterContainer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/LinearLayout;

    if-eqz v11, :cond_0

    sget v1, LVg4;->flashImageView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/ImageView;

    if-eqz v12, :cond_0

    sget v1, LVg4;->footerContainer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroid/widget/FrameLayout;

    if-eqz v13, :cond_0

    sget v1, LVg4;->instructionsLayout:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/RelativeLayout;

    if-eqz v14, :cond_0

    sget v1, LVg4;->noButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/widget/Button;

    if-eqz v15, :cond_0

    sget v1, LVg4;->parkingInstructions:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/TextView;

    if-eqz v16, :cond_0

    sget v1, LVg4;->parkingInstructionsImage:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroid/widget/ImageView;

    if-eqz v17, :cond_0

    sget v1, LVg4;->parkingInstructionsTitle:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Landroid/widget/TextView;

    if-eqz v18, :cond_0

    sget v1, LVg4;->progressBar:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    if-eqz v19, :cond_0

    sget v1, LVg4;->scooterIcon:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Landroid/widget/ImageView;

    if-eqz v20, :cond_0

    sget v1, LVg4;->takePhotoButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Landroid/widget/Button;

    if-eqz v21, :cond_0

    sget v1, LVg4;->takePhotoFooterContainer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v22, v2

    check-cast v22, Landroid/widget/RelativeLayout;

    if-eqz v22, :cond_0

    sget v1, LVg4;->topBarrier:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Landroidx/constraintlayout/widget/Barrier;

    if-eqz v23, :cond_0

    sget v1, LVg4;->topOverlay:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v24

    if-eqz v24, :cond_0

    sget v1, LVg4;->viewfinderFrame:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v25, v2

    check-cast v25, Landroid/widget/ImageView;

    if-eqz v25, :cond_0

    sget v1, LVg4;->yesButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v26, v2

    check-cast v26, Landroid/widget/Button;

    if-eqz v26, :cond_0

    new-instance v1, LJ5;

    move-object v3, v1

    move-object v4, v0

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct/range {v3 .. v26}, LJ5;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/Barrier;Landroid/view/View;Lco/bird/android/widget/CameraxView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroid/widget/RelativeLayout;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/ImageView;Landroid/widget/Button;Landroid/widget/RelativeLayout;Landroidx/constraintlayout/widget/Barrier;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/Button;)V

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

.method public static c(Landroid/view/LayoutInflater;)LJ5;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LJ5;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LJ5;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LJ5;
    .locals 2

    sget v0, Lcj4;->activity_ride_lock_photo:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LJ5;->a(Landroid/view/View;)LJ5;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, LJ5;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LJ5;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
