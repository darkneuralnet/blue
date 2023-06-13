.class public final LM4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Lco/bird/android/widget/CallToActionLayout;

.field public final b:Landroid/widget/TextView;

.field public final c:Lco/bird/android/widget/CallToActionLayout;

.field public final d:Landroid/view/ViewStub;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/CallToActionLayout;Landroid/widget/TextView;Lco/bird/android/widget/CallToActionLayout;Landroid/view/ViewStub;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM4;->a:Lco/bird/android/widget/CallToActionLayout;

    iput-object p2, p0, LM4;->b:Landroid/widget/TextView;

    iput-object p3, p0, LM4;->c:Lco/bird/android/widget/CallToActionLayout;

    iput-object p4, p0, LM4;->d:Landroid/view/ViewStub;

    return-void
.end method

.method public static a(Landroid/view/View;)LM4;
    .locals 4

    sget v0, LVg4;->physicalLockText:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_1

    move-object v0, p0

    check-cast v0, Lco/bird/android/widget/CallToActionLayout;

    sget v2, LVg4;->stepsViewStub:I

    invoke-static {p0, v2}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewStub;

    if-eqz v3, :cond_0

    new-instance p0, LM4;

    invoke-direct {p0, v0, v1, v0, v3}, LM4;-><init>(Lco/bird/android/widget/CallToActionLayout;Landroid/widget/TextView;Lco/bird/android/widget/CallToActionLayout;Landroid/view/ViewStub;)V

    return-object p0

    :cond_0
    move v0, v2

    :cond_1
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

.method public static c(Landroid/view/LayoutInflater;)LM4;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LM4;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LM4;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LM4;
    .locals 2

    sget v0, Lcj4;->activity_physical_lock_unlock:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LM4;->a(Landroid/view/View;)LM4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Lco/bird/android/widget/CallToActionLayout;
    .locals 1

    iget-object v0, p0, LM4;->a:Lco/bird/android/widget/CallToActionLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LM4;->b()Lco/bird/android/widget/CallToActionLayout;

    move-result-object v0

    return-object v0
.end method
