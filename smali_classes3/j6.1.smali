.class public final Lj6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/EditText;

.field public final d:Landroid/widget/ImageView;

.field public final e:Landroid/widget/EditText;

.field public final f:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/EditText;Landroid/widget/ImageView;Landroid/widget/EditText;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lj6;->b:Landroid/widget/TextView;

    iput-object p3, p0, Lj6;->c:Landroid/widget/EditText;

    iput-object p4, p0, Lj6;->d:Landroid/widget/ImageView;

    iput-object p5, p0, Lj6;->e:Landroid/widget/EditText;

    iput-object p6, p0, Lj6;->f:Landroid/widget/TextView;

    return-void
.end method

.method public static a(Landroid/view/View;)Lj6;
    .locals 9

    sget v0, Lbi4;->body:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_0

    sget v0, Lbi4;->hint:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/EditText;

    if-eqz v5, :cond_0

    sget v0, Lbi4;->illustration:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/ImageView;

    if-eqz v6, :cond_0

    sget v0, Lbi4;->input:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/EditText;

    if-eqz v7, :cond_0

    sget v0, Lbi4;->title:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/TextView;

    if-eqz v8, :cond_0

    new-instance v0, Lj6;

    move-object v3, p0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lj6;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/EditText;Landroid/widget/ImageView;Landroid/widget/EditText;Landroid/widget/TextView;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Landroid/view/LayoutInflater;)Lj6;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lj6;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lj6;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lj6;
    .locals 2

    sget v0, LOj4;->activity_sober_start:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lj6;->a(Landroid/view/View;)Lj6;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, Lj6;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lj6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
