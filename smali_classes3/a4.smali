.class public final La4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/LinearLayout;

.field public final b:Lco/bird/android/widget/standardcomponents/CheckableItemView;

.field public final c:Lco/bird/android/widget/standardcomponents/CheckableItemView;

.field public final d:Lco/bird/android/widget/standardcomponents/CheckableItemView;

.field public final e:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Lco/bird/android/widget/standardcomponents/CheckableItemView;Lco/bird/android/widget/standardcomponents/CheckableItemView;Lco/bird/android/widget/standardcomponents/CheckableItemView;Landroid/widget/Button;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4;->a:Landroid/widget/LinearLayout;

    iput-object p2, p0, La4;->b:Lco/bird/android/widget/standardcomponents/CheckableItemView;

    iput-object p3, p0, La4;->c:Lco/bird/android/widget/standardcomponents/CheckableItemView;

    iput-object p4, p0, La4;->d:Lco/bird/android/widget/standardcomponents/CheckableItemView;

    iput-object p5, p0, La4;->e:Landroid/widget/Button;

    return-void
.end method

.method public static a(Landroid/view/View;)La4;
    .locals 8

    sget v0, LRh4;->dispute:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lco/bird/android/widget/standardcomponents/CheckableItemView;

    if-eqz v4, :cond_0

    sget v0, LRh4;->open:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lco/bird/android/widget/standardcomponents/CheckableItemView;

    if-eqz v5, :cond_0

    sget v0, LRh4;->resolve:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lco/bird/android/widget/standardcomponents/CheckableItemView;

    if-eqz v6, :cond_0

    sget v0, LRh4;->update:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/Button;

    if-eqz v7, :cond_0

    new-instance v0, La4;

    move-object v3, p0

    check-cast v3, Landroid/widget/LinearLayout;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, La4;-><init>(Landroid/widget/LinearLayout;Lco/bird/android/widget/standardcomponents/CheckableItemView;Lco/bird/android/widget/standardcomponents/CheckableItemView;Lco/bird/android/widget/standardcomponents/CheckableItemView;Landroid/widget/Button;)V

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

.method public static c(Landroid/view/LayoutInflater;)La4;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, La4;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)La4;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)La4;
    .locals 2

    sget v0, LEj4;->activity_issue_status:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, La4;->a(Landroid/view/View;)La4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, La4;->a:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, La4;->b()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method