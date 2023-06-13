.class public final Lzm2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroid/widget/Space;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/ImageView;

.field public final e:Landroid/view/View;

.field public final f:Landroidx/constraintlayout/widget/Group;

.field public final g:Landroid/widget/ImageView;

.field public final h:Landroid/widget/TextView;

.field public final i:Landroid/widget/ImageView;

.field public final j:Landroid/view/View;

.field public final k:Landroidx/constraintlayout/widget/Group;

.field public final l:Landroid/widget/ImageView;

.field public final m:Landroid/widget/TextView;

.field public final n:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final o:Landroid/widget/ImageView;

.field public final p:Landroid/view/View;

.field public final q:Landroidx/constraintlayout/widget/Group;

.field public final r:Landroid/widget/ImageView;

.field public final s:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/Space;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/view/View;Landroidx/constraintlayout/widget/Group;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/view/View;Landroidx/constraintlayout/widget/Group;Landroid/widget/ImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/view/View;Landroidx/constraintlayout/widget/Group;Landroid/widget/ImageView;Landroid/widget/TextView;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lzm2;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object v1, p2

    iput-object v1, v0, Lzm2;->b:Landroid/widget/Space;

    move-object v1, p3

    iput-object v1, v0, Lzm2;->c:Landroid/widget/TextView;

    move-object v1, p4

    iput-object v1, v0, Lzm2;->d:Landroid/widget/ImageView;

    move-object v1, p5

    iput-object v1, v0, Lzm2;->e:Landroid/view/View;

    move-object v1, p6

    iput-object v1, v0, Lzm2;->f:Landroidx/constraintlayout/widget/Group;

    move-object v1, p7

    iput-object v1, v0, Lzm2;->g:Landroid/widget/ImageView;

    move-object v1, p8

    iput-object v1, v0, Lzm2;->h:Landroid/widget/TextView;

    move-object v1, p9

    iput-object v1, v0, Lzm2;->i:Landroid/widget/ImageView;

    move-object v1, p10

    iput-object v1, v0, Lzm2;->j:Landroid/view/View;

    move-object v1, p11

    iput-object v1, v0, Lzm2;->k:Landroidx/constraintlayout/widget/Group;

    move-object v1, p12

    iput-object v1, v0, Lzm2;->l:Landroid/widget/ImageView;

    move-object v1, p13

    iput-object v1, v0, Lzm2;->m:Landroid/widget/TextView;

    move-object/from16 v1, p14

    iput-object v1, v0, Lzm2;->n:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object/from16 v1, p15

    iput-object v1, v0, Lzm2;->o:Landroid/widget/ImageView;

    move-object/from16 v1, p16

    iput-object v1, v0, Lzm2;->p:Landroid/view/View;

    move-object/from16 v1, p17

    iput-object v1, v0, Lzm2;->q:Landroidx/constraintlayout/widget/Group;

    move-object/from16 v1, p18

    iput-object v1, v0, Lzm2;->r:Landroid/widget/ImageView;

    move-object/from16 v1, p19

    iput-object v1, v0, Lzm2;->s:Landroid/widget/TextView;

    return-void
.end method

.method public static a(Landroid/view/View;)Lzm2;
    .locals 23

    move-object/from16 v0, p0

    sget v1, LMh4;->headerSpace:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/Space;

    if-eqz v5, :cond_0

    sget v1, LMh4;->headerText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/TextView;

    if-eqz v6, :cond_0

    sget v1, LMh4;->incompleteArrow:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/ImageView;

    if-eqz v7, :cond_0

    sget v1, LMh4;->incompleteContainer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v8

    if-eqz v8, :cond_0

    sget v1, LMh4;->incompleteGroup:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroidx/constraintlayout/widget/Group;

    if-eqz v9, :cond_0

    sget v1, LMh4;->incompleteIcon:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/ImageView;

    if-eqz v10, :cond_0

    sget v1, LMh4;->incompleteText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/TextView;

    if-eqz v11, :cond_0

    sget v1, LMh4;->outOfStockArrow:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/ImageView;

    if-eqz v12, :cond_0

    sget v1, LMh4;->outOfStockContainer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v13

    if-eqz v13, :cond_0

    sget v1, LMh4;->outOfStockGroup:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroidx/constraintlayout/widget/Group;

    if-eqz v14, :cond_0

    sget v1, LMh4;->outOfStockIcon:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/widget/ImageView;

    if-eqz v15, :cond_0

    sget v1, LMh4;->outOfStockText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/TextView;

    if-eqz v16, :cond_0

    move-object/from16 v17, v0

    check-cast v17, Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v1, LMh4;->runningLowArrow:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Landroid/widget/ImageView;

    if-eqz v18, :cond_0

    sget v1, LMh4;->runningLowContainer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v19

    if-eqz v19, :cond_0

    sget v1, LMh4;->runningLowGroup:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Landroidx/constraintlayout/widget/Group;

    if-eqz v20, :cond_0

    sget v1, LMh4;->runningLowIcon:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Landroid/widget/ImageView;

    if-eqz v21, :cond_0

    sget v1, LMh4;->runningLowText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v22, v2

    check-cast v22, Landroid/widget/TextView;

    if-eqz v22, :cond_0

    new-instance v0, Lzm2;

    move-object v3, v0

    move-object/from16 v4, v17

    invoke-direct/range {v3 .. v22}, Lzm2;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/Space;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/view/View;Landroidx/constraintlayout/widget/Group;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/view/View;Landroidx/constraintlayout/widget/Group;Landroid/widget/ImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/view/View;Landroidx/constraintlayout/widget/Group;Landroid/widget/ImageView;Landroid/widget/TextView;)V

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


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, Lzm2;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lzm2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
