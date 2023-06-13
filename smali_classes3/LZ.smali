.class public final LLZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroid/view/View;

.field public final c:Landroid/view/View;

.field public final d:Landroid/widget/Button;

.field public final e:Lco/bird/android/widget/PaymentButton;

.field public final f:Landroid/view/View;

.field public final g:Landroid/view/View;

.field public final h:Landroid/widget/LinearLayout;

.field public final i:Landroid/view/View;

.field public final j:Landroid/widget/ProgressBar;

.field public final k:Landroidx/constraintlayout/widget/Group;

.field public final l:Landroid/widget/Button;

.field public final m:Landroid/widget/TextView;

.field public final n:Landroid/widget/ImageView;

.field public final o:Landroid/widget/TextView;

.field public final p:Landroid/widget/TextView;

.field public final q:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/widget/Button;Lco/bird/android/widget/PaymentButton;Landroid/view/View;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/view/View;Landroid/widget/ProgressBar;Landroidx/constraintlayout/widget/Group;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, LLZ;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object v1, p2

    iput-object v1, v0, LLZ;->b:Landroid/view/View;

    move-object v1, p3

    iput-object v1, v0, LLZ;->c:Landroid/view/View;

    move-object v1, p4

    iput-object v1, v0, LLZ;->d:Landroid/widget/Button;

    move-object v1, p5

    iput-object v1, v0, LLZ;->e:Lco/bird/android/widget/PaymentButton;

    move-object v1, p6

    iput-object v1, v0, LLZ;->f:Landroid/view/View;

    move-object v1, p7

    iput-object v1, v0, LLZ;->g:Landroid/view/View;

    move-object v1, p8

    iput-object v1, v0, LLZ;->h:Landroid/widget/LinearLayout;

    move-object v1, p9

    iput-object v1, v0, LLZ;->i:Landroid/view/View;

    move-object v1, p10

    iput-object v1, v0, LLZ;->j:Landroid/widget/ProgressBar;

    move-object v1, p11

    iput-object v1, v0, LLZ;->k:Landroidx/constraintlayout/widget/Group;

    move-object v1, p12

    iput-object v1, v0, LLZ;->l:Landroid/widget/Button;

    move-object v1, p13

    iput-object v1, v0, LLZ;->m:Landroid/widget/TextView;

    move-object/from16 v1, p14

    iput-object v1, v0, LLZ;->n:Landroid/widget/ImageView;

    move-object/from16 v1, p15

    iput-object v1, v0, LLZ;->o:Landroid/widget/TextView;

    move-object/from16 v1, p16

    iput-object v1, v0, LLZ;->p:Landroid/widget/TextView;

    move-object/from16 v1, p17

    iput-object v1, v0, LLZ;->q:Landroid/widget/TextView;

    return-void
.end method

.method public static a(Landroid/view/View;)LLZ;
    .locals 20

    move-object/from16 v0, p0

    sget v1, LOh4;->bottomSpacer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_0

    sget v1, LOh4;->buttonsSpacer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_0

    sget v1, LOh4;->cancelButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/Button;

    if-eqz v6, :cond_0

    sget v1, LOh4;->defaultPayment:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lco/bird/android/widget/PaymentButton;

    if-eqz v7, :cond_0

    sget v1, LOh4;->divider:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v8

    if-eqz v8, :cond_0

    sget v1, LOh4;->lineItemSpacer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v9

    if-eqz v9, :cond_0

    sget v1, LOh4;->lineItemsContainer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/LinearLayout;

    if-eqz v10, :cond_0

    sget v1, LOh4;->loadingBackground:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v11

    if-eqz v11, :cond_0

    sget v1, LOh4;->loadingProgress:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/ProgressBar;

    if-eqz v12, :cond_0

    sget v1, LOh4;->loadingViews:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroidx/constraintlayout/widget/Group;

    if-eqz v13, :cond_0

    sget v1, LOh4;->payButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/Button;

    if-eqz v14, :cond_0

    sget v1, LOh4;->paymentInfoText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/widget/TextView;

    if-eqz v15, :cond_0

    sget v1, LOh4;->paymentMethodIcon:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/ImageView;

    if-eqz v16, :cond_0

    sget v1, LOh4;->title:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroid/widget/TextView;

    if-eqz v17, :cond_0

    sget v1, LOh4;->totalAmountText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Landroid/widget/TextView;

    if-eqz v18, :cond_0

    sget v1, LOh4;->totalLabel:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Landroid/widget/TextView;

    if-eqz v19, :cond_0

    new-instance v1, LLZ;

    move-object v2, v1

    move-object v3, v0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct/range {v2 .. v19}, LLZ;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/widget/Button;Lco/bird/android/widget/PaymentButton;Landroid/view/View;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/view/View;Landroid/widget/ProgressBar;Landroidx/constraintlayout/widget/Group;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

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

.method public static c(Landroid/view/LayoutInflater;)LLZ;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LLZ;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LLZ;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LLZ;
    .locals 2

    sget v0, LBj4;->bottom_sheet_confirm_purchase:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LLZ;->a(Landroid/view/View;)LLZ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, LLZ;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LLZ;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
