.class public final Lar6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/RelativeLayout;

.field public final b:Landroid/widget/Button;

.field public final c:Landroid/widget/Button;

.field public final d:Landroid/widget/LinearLayout;

.field public final e:Landroid/widget/RelativeLayout;

.field public final f:Landroid/widget/TextView;

.field public final g:Lco/bird/android/widget/progress/HorizontalRoundedProgressBar;


# direct methods
.method public constructor <init>(Landroid/widget/RelativeLayout;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Landroid/widget/TextView;Lco/bird/android/widget/progress/HorizontalRoundedProgressBar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lar6;->a:Landroid/widget/RelativeLayout;

    iput-object p2, p0, Lar6;->b:Landroid/widget/Button;

    iput-object p3, p0, Lar6;->c:Landroid/widget/Button;

    iput-object p4, p0, Lar6;->d:Landroid/widget/LinearLayout;

    iput-object p5, p0, Lar6;->e:Landroid/widget/RelativeLayout;

    iput-object p6, p0, Lar6;->f:Landroid/widget/TextView;

    iput-object p7, p0, Lar6;->g:Lco/bird/android/widget/progress/HorizontalRoundedProgressBar;

    return-void
.end method

.method public static a(Landroid/view/View;)Lar6;
    .locals 10

    sget v0, LNh4;->cancelUpdate:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/Button;

    if-eqz v4, :cond_0

    sget v0, LNh4;->continueUpdate:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/Button;

    if-eqz v5, :cond_0

    sget v0, LNh4;->firmwareUpdateContainer:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/LinearLayout;

    if-eqz v6, :cond_0

    move-object v7, p0

    check-cast v7, Landroid/widget/RelativeLayout;

    sget v0, LNh4;->firmwareUpdatingTitle:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/TextView;

    if-eqz v8, :cond_0

    sget v0, LNh4;->progressBar:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lco/bird/android/widget/progress/HorizontalRoundedProgressBar;

    if-eqz v9, :cond_0

    new-instance p0, Lar6;

    move-object v2, p0

    move-object v3, v7

    invoke-direct/range {v2 .. v9}, Lar6;-><init>(Landroid/widget/RelativeLayout;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Landroid/widget/TextView;Lco/bird/android/widget/progress/HorizontalRoundedProgressBar;)V

    return-object p0

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


# virtual methods
.method public b()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lar6;->a:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lar6;->b()Landroid/widget/RelativeLayout;

    move-result-object v0

    return-object v0
.end method
