.class public final LU4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Lco/bird/android/widget/CallToActionLayout;

.field public final b:Landroidx/recyclerview/widget/RecyclerView;

.field public final c:Landroid/widget/EditText;

.field public final d:Landroid/widget/TextView;

.field public final e:Landroidx/recyclerview/widget/RecyclerView;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/widget/LinearLayout;

.field public final h:Landroid/widget/LinearLayout;

.field public final i:Landroid/widget/TextView;

.field public final j:Landroid/widget/TextView;

.field public final k:Landroid/widget/TextView;

.field public final l:Landroid/widget/TextView;

.field public final m:Landroid/widget/LinearLayout;

.field public final n:Landroid/widget/TextView;

.field public final o:Landroid/widget/LinearLayout;

.field public final p:Landroid/widget/TextView;

.field public final q:Landroid/widget/TextView;

.field public final r:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

.field public final s:Lco/bird/android/widget/CallToActionLayout;

.field public final t:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/CallToActionLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/EditText;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Lco/bird/android/widget/CallToActionLayout;Landroid/widget/TextView;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, LU4;->a:Lco/bird/android/widget/CallToActionLayout;

    move-object v1, p2

    iput-object v1, v0, LU4;->b:Landroidx/recyclerview/widget/RecyclerView;

    move-object v1, p3

    iput-object v1, v0, LU4;->c:Landroid/widget/EditText;

    move-object v1, p4

    iput-object v1, v0, LU4;->d:Landroid/widget/TextView;

    move-object v1, p5

    iput-object v1, v0, LU4;->e:Landroidx/recyclerview/widget/RecyclerView;

    move-object v1, p6

    iput-object v1, v0, LU4;->f:Landroid/widget/TextView;

    move-object v1, p7

    iput-object v1, v0, LU4;->g:Landroid/widget/LinearLayout;

    move-object v1, p8

    iput-object v1, v0, LU4;->h:Landroid/widget/LinearLayout;

    move-object v1, p9

    iput-object v1, v0, LU4;->i:Landroid/widget/TextView;

    move-object v1, p10

    iput-object v1, v0, LU4;->j:Landroid/widget/TextView;

    move-object v1, p11

    iput-object v1, v0, LU4;->k:Landroid/widget/TextView;

    move-object v1, p12

    iput-object v1, v0, LU4;->l:Landroid/widget/TextView;

    move-object v1, p13

    iput-object v1, v0, LU4;->m:Landroid/widget/LinearLayout;

    move-object/from16 v1, p14

    iput-object v1, v0, LU4;->n:Landroid/widget/TextView;

    move-object/from16 v1, p15

    iput-object v1, v0, LU4;->o:Landroid/widget/LinearLayout;

    move-object/from16 v1, p16

    iput-object v1, v0, LU4;->p:Landroid/widget/TextView;

    move-object/from16 v1, p17

    iput-object v1, v0, LU4;->q:Landroid/widget/TextView;

    move-object/from16 v1, p18

    iput-object v1, v0, LU4;->r:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    move-object/from16 v1, p19

    iput-object v1, v0, LU4;->s:Lco/bird/android/widget/CallToActionLayout;

    move-object/from16 v1, p20

    iput-object v1, v0, LU4;->t:Landroid/widget/TextView;

    return-void
.end method

.method public static a(Landroid/view/View;)LU4;
    .locals 24

    move-object/from16 v0, p0

    sget v1, LVg4;->actionsView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v5, :cond_0

    sget v1, LVg4;->issueTextBox:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/EditText;

    if-eqz v6, :cond_0

    sget v1, LVg4;->nextStepTextView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_0

    sget v1, LVg4;->nextStepView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v8, :cond_0

    sget v1, LVg4;->notesTitle:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/TextView;

    if-eqz v9, :cond_0

    sget v1, LVg4;->numBirdsDiscoveredContainer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/LinearLayout;

    if-eqz v10, :cond_0

    sget v1, LVg4;->numBirdsReportedContainer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/LinearLayout;

    if-eqz v11, :cond_0

    sget v1, LVg4;->numberBirdsDiscoveredTextView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/TextView;

    if-eqz v12, :cond_0

    sget v1, LVg4;->numberBirdsDiscoveredTitle:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroid/widget/TextView;

    if-eqz v13, :cond_0

    sget v1, LVg4;->numberBirdsReportedTextView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/TextView;

    if-eqz v14, :cond_0

    sget v1, LVg4;->numberBirdsReportedTitle:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/widget/TextView;

    if-eqz v15, :cond_0

    sget v1, LVg4;->photoContainer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/LinearLayout;

    if-eqz v16, :cond_0

    sget v1, LVg4;->photosTextView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroid/widget/TextView;

    if-eqz v17, :cond_0

    sget v1, LVg4;->previousNotesContainer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Landroid/widget/LinearLayout;

    if-eqz v18, :cond_0

    sget v1, LVg4;->previousNotesTextView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Landroid/widget/TextView;

    if-eqz v19, :cond_0

    sget v1, LVg4;->previousNotesTitle:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Landroid/widget/TextView;

    if-eqz v20, :cond_0

    sget v1, LVg4;->progressBar:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    if-eqz v21, :cond_0

    move-object/from16 v22, v0

    check-cast v22, Lco/bird/android/widget/CallToActionLayout;

    sget v1, LVg4;->selectActionTextView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Landroid/widget/TextView;

    if-eqz v23, :cond_0

    new-instance v0, LU4;

    move-object v3, v0

    move-object/from16 v4, v22

    invoke-direct/range {v3 .. v23}, LU4;-><init>(Lco/bird/android/widget/CallToActionLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/EditText;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Lco/bird/android/widget/CallToActionLayout;Landroid/widget/TextView;)V

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

.method public static c(Landroid/view/LayoutInflater;)LU4;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LU4;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LU4;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LU4;
    .locals 2

    sget v0, Lcj4;->activity_property_report:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LU4;->a(Landroid/view/View;)LU4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Lco/bird/android/widget/CallToActionLayout;
    .locals 1

    iget-object v0, p0, LU4;->a:Lco/bird/android/widget/CallToActionLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LU4;->b()Lco/bird/android/widget/CallToActionLayout;

    move-result-object v0

    return-object v0
.end method
