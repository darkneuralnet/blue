.class public final Ltt6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Lcom/google/android/material/card/MaterialCardView;

.field public final b:Landroid/widget/Button;

.field public final c:Landroidx/constraintlayout/widget/Barrier;

.field public final d:Lco/bird/android/feature/ridepass/v2/list/adapter/view/RidePassV2DetailsView;

.field public final e:Landroidx/constraintlayout/widget/Guideline;

.field public final f:Landroid/widget/ImageView;

.field public final g:Landroid/widget/ImageView;

.field public final h:Landroid/widget/TextView;

.field public final i:Landroid/widget/TextView;

.field public final j:Landroid/widget/Button;

.field public final k:Landroid/widget/TextView;

.field public final l:Landroid/widget/TextView;

.field public final m:Landroid/widget/TextView;

.field public final n:Landroidx/constraintlayout/widget/Guideline;

.field public final o:Landroid/widget/Button;

.field public final p:Landroid/widget/TextView;

.field public final q:Landroidx/constraintlayout/widget/Group;

.field public final r:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/card/MaterialCardView;Landroid/widget/Button;Landroidx/constraintlayout/widget/Barrier;Lco/bird/android/feature/ridepass/v2/list/adapter/view/RidePassV2DetailsView;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/Button;Landroid/widget/TextView;Landroidx/constraintlayout/widget/Group;Landroid/widget/TextView;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Ltt6;->a:Lcom/google/android/material/card/MaterialCardView;

    move-object v1, p2

    iput-object v1, v0, Ltt6;->b:Landroid/widget/Button;

    move-object v1, p3

    iput-object v1, v0, Ltt6;->c:Landroidx/constraintlayout/widget/Barrier;

    move-object v1, p4

    iput-object v1, v0, Ltt6;->d:Lco/bird/android/feature/ridepass/v2/list/adapter/view/RidePassV2DetailsView;

    move-object v1, p5

    iput-object v1, v0, Ltt6;->e:Landroidx/constraintlayout/widget/Guideline;

    move-object v1, p6

    iput-object v1, v0, Ltt6;->f:Landroid/widget/ImageView;

    move-object v1, p7

    iput-object v1, v0, Ltt6;->g:Landroid/widget/ImageView;

    move-object v1, p8

    iput-object v1, v0, Ltt6;->h:Landroid/widget/TextView;

    move-object v1, p9

    iput-object v1, v0, Ltt6;->i:Landroid/widget/TextView;

    move-object v1, p10

    iput-object v1, v0, Ltt6;->j:Landroid/widget/Button;

    move-object v1, p11

    iput-object v1, v0, Ltt6;->k:Landroid/widget/TextView;

    move-object v1, p12

    iput-object v1, v0, Ltt6;->l:Landroid/widget/TextView;

    move-object v1, p13

    iput-object v1, v0, Ltt6;->m:Landroid/widget/TextView;

    move-object/from16 v1, p14

    iput-object v1, v0, Ltt6;->n:Landroidx/constraintlayout/widget/Guideline;

    move-object/from16 v1, p15

    iput-object v1, v0, Ltt6;->o:Landroid/widget/Button;

    move-object/from16 v1, p16

    iput-object v1, v0, Ltt6;->p:Landroid/widget/TextView;

    move-object/from16 v1, p17

    iput-object v1, v0, Ltt6;->q:Landroidx/constraintlayout/widget/Group;

    move-object/from16 v1, p18

    iput-object v1, v0, Ltt6;->r:Landroid/widget/TextView;

    return-void
.end method

.method public static a(Landroid/view/View;)Ltt6;
    .locals 22

    move-object/from16 v0, p0

    sget v1, LTh4;->cancelButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/Button;

    if-eqz v5, :cond_0

    sget v1, LTh4;->chevronBarrier:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroidx/constraintlayout/widget/Barrier;

    if-eqz v6, :cond_0

    sget v1, LTh4;->details:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lco/bird/android/feature/ridepass/v2/list/adapter/view/RidePassV2DetailsView;

    if-eqz v7, :cond_0

    sget v1, LTh4;->endGuide:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v8, :cond_0

    sget v1, LTh4;->expand:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/ImageView;

    if-eqz v9, :cond_0

    sget v1, LTh4;->hide:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/ImageView;

    if-eqz v10, :cond_0

    sget v1, LTh4;->label:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/TextView;

    if-eqz v11, :cond_0

    sget v1, LTh4;->passBody:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/TextView;

    if-eqz v12, :cond_0

    sget v1, LTh4;->passBuy:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroid/widget/Button;

    if-eqz v13, :cond_0

    sget v1, LTh4;->passTitle:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/TextView;

    if-eqz v14, :cond_0

    sget v1, LTh4;->previousPrice:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/widget/TextView;

    if-eqz v15, :cond_0

    sget v1, LTh4;->price:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/TextView;

    if-eqz v16, :cond_0

    sget v1, LTh4;->startGuide:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v17, :cond_0

    sget v1, LTh4;->transferButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Landroid/widget/Button;

    if-eqz v18, :cond_0

    sget v1, LTh4;->transferDescription:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Landroid/widget/TextView;

    if-eqz v19, :cond_0

    sget v1, LTh4;->transferGroup:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Landroidx/constraintlayout/widget/Group;

    if-eqz v20, :cond_0

    sget v1, LTh4;->validityPeriod:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Landroid/widget/TextView;

    if-eqz v21, :cond_0

    new-instance v1, Ltt6;

    move-object v3, v1

    move-object v4, v0

    check-cast v4, Lcom/google/android/material/card/MaterialCardView;

    invoke-direct/range {v3 .. v21}, Ltt6;-><init>(Lcom/google/android/material/card/MaterialCardView;Landroid/widget/Button;Landroidx/constraintlayout/widget/Barrier;Lco/bird/android/feature/ridepass/v2/list/adapter/view/RidePassV2DetailsView;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/Button;Landroid/widget/TextView;Landroidx/constraintlayout/widget/Group;Landroid/widget/TextView;)V

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


# virtual methods
.method public b()Lcom/google/android/material/card/MaterialCardView;
    .locals 1

    iget-object v0, p0, Ltt6;->a:Lcom/google/android/material/card/MaterialCardView;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Ltt6;->b()Lcom/google/android/material/card/MaterialCardView;

    move-result-object v0

    return-object v0
.end method
