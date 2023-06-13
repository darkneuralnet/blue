.class public final LM3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/CheckBox;

.field public final e:Landroid/widget/CheckBox;

.field public final f:Landroid/widget/CheckBox;

.field public final g:Landroid/widget/CheckBox;

.field public final h:Landroid/widget/Button;

.field public final i:Landroid/widget/Button;

.field public final j:Landroidx/cardview/widget/CardView;

.field public final k:Landroid/widget/Button;

.field public final l:Lcom/airbnb/lottie/LottieAnimationView;

.field public final m:Landroid/widget/ScrollView;

.field public final n:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/Button;Landroid/widget/Button;Landroidx/cardview/widget/CardView;Landroid/widget/Button;Lcom/airbnb/lottie/LottieAnimationView;Landroid/widget/ScrollView;Landroid/widget/Button;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM3;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, LM3;->b:Landroid/widget/TextView;

    iput-object p3, p0, LM3;->c:Landroid/widget/TextView;

    iput-object p4, p0, LM3;->d:Landroid/widget/CheckBox;

    iput-object p5, p0, LM3;->e:Landroid/widget/CheckBox;

    iput-object p6, p0, LM3;->f:Landroid/widget/CheckBox;

    iput-object p7, p0, LM3;->g:Landroid/widget/CheckBox;

    iput-object p8, p0, LM3;->h:Landroid/widget/Button;

    iput-object p9, p0, LM3;->i:Landroid/widget/Button;

    iput-object p10, p0, LM3;->j:Landroidx/cardview/widget/CardView;

    iput-object p11, p0, LM3;->k:Landroid/widget/Button;

    iput-object p12, p0, LM3;->l:Lcom/airbnb/lottie/LottieAnimationView;

    iput-object p13, p0, LM3;->m:Landroid/widget/ScrollView;

    iput-object p14, p0, LM3;->n:Landroid/widget/Button;

    return-void
.end method

.method public static a(Landroid/view/View;)LM3;
    .locals 18

    move-object/from16 v0, p0

    sget v1, Lvh4;->bluetoothUnavailableMessageText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    sget v1, Lvh4;->bluetoothUnavailableTitleText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/TextView;

    if-eqz v6, :cond_0

    sget v1, Lvh4;->checkbox1:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/CheckBox;

    if-eqz v7, :cond_0

    sget v1, Lvh4;->checkbox2:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/widget/CheckBox;

    if-eqz v8, :cond_0

    sget v1, Lvh4;->checkbox3:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/CheckBox;

    if-eqz v9, :cond_0

    sget v1, Lvh4;->checkbox4:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/CheckBox;

    if-eqz v10, :cond_0

    sget v1, Lvh4;->continueButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/Button;

    if-eqz v11, :cond_0

    sget v1, Lvh4;->continueWithoutHelmetButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/Button;

    if-eqz v12, :cond_0

    sget v1, Lvh4;->ctaContainer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroidx/cardview/widget/CardView;

    if-eqz v13, :cond_0

    sget v1, Lvh4;->helpButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/Button;

    if-eqz v14, :cond_0

    sget v1, Lvh4;->lottie:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lcom/airbnb/lottie/LottieAnimationView;

    if-eqz v15, :cond_0

    sget v1, Lvh4;->scrollableContent:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/ScrollView;

    if-eqz v16, :cond_0

    sget v1, Lvh4;->tryAgainButton:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroid/widget/Button;

    if-eqz v17, :cond_0

    new-instance v1, LM3;

    move-object v4, v0

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object v3, v1

    invoke-direct/range {v3 .. v17}, LM3;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/Button;Landroid/widget/Button;Landroidx/cardview/widget/CardView;Landroid/widget/Button;Lcom/airbnb/lottie/LottieAnimationView;Landroid/widget/ScrollView;Landroid/widget/Button;)V

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

.method public static c(Landroid/view/LayoutInflater;)LM3;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LM3;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LM3;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LM3;
    .locals 2

    sget v0, Lij4;->activity_helmet_lease_solebe_scanner:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LM3;->a(Landroid/view/View;)LM3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, LM3;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LM3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
