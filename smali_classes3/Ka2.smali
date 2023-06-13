.class public final LKa2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/RadioButton;


# direct methods
.method public constructor <init>(Landroid/widget/RadioButton;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKa2;->a:Landroid/widget/RadioButton;

    return-void
.end method

.method public static a(Landroid/view/View;)LKa2;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, LKa2;

    check-cast p0, Landroid/widget/RadioButton;

    invoke-direct {v0, p0}, LKa2;-><init>(Landroid/widget/RadioButton;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "rootView"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LKa2;
    .locals 2

    sget v0, LVi4;->item_action_taken_option:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LKa2;->a(Landroid/view/View;)LKa2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroid/widget/RadioButton;
    .locals 1

    iget-object v0, p0, LKa2;->a:Landroid/widget/RadioButton;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LKa2;->b()Landroid/widget/RadioButton;

    move-result-object v0

    return-object v0
.end method
