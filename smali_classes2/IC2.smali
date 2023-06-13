.class public final LIC2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Lco/bird/android/widget/CallToActionLayout;

.field public final b:Lco/bird/android/widget/CallToActionLayout;

.field public final c:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/CallToActionLayout;Lco/bird/android/widget/CallToActionLayout;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIC2;->a:Lco/bird/android/widget/CallToActionLayout;

    iput-object p2, p0, LIC2;->b:Lco/bird/android/widget/CallToActionLayout;

    iput-object p3, p0, LIC2;->c:Landroid/widget/TextView;

    return-void
.end method

.method public static a(Landroid/view/View;)LIC2;
    .locals 3

    move-object v0, p0

    check-cast v0, Lco/bird/android/widget/CallToActionLayout;

    sget v1, LVg4;->message:I

    invoke-static {p0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_0

    new-instance p0, LIC2;

    invoke-direct {p0, v0, v0, v2}, LIC2;-><init>(Lco/bird/android/widget/CallToActionLayout;Lco/bird/android/widget/CallToActionLayout;Landroid/widget/TextView;)V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Landroid/view/LayoutInflater;)LIC2;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LIC2;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LIC2;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LIC2;
    .locals 2

    sget v0, Lcj4;->longterm_pickup_setup_confirmed:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LIC2;->a(Landroid/view/View;)LIC2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Lco/bird/android/widget/CallToActionLayout;
    .locals 1

    iget-object v0, p0, LIC2;->a:Lco/bird/android/widget/CallToActionLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LIC2;->b()Lco/bird/android/widget/CallToActionLayout;

    move-result-object v0

    return-object v0
.end method
