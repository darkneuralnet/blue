.class public final LPi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Lcom/google/android/material/chip/Chip;


# direct methods
.method public constructor <init>(Lcom/google/android/material/chip/Chip;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPi0;->a:Lcom/google/android/material/chip/Chip;

    return-void
.end method

.method public static a(Landroid/view/View;)LPi0;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, LPi0;

    check-cast p0, Lcom/google/android/material/chip/Chip;

    invoke-direct {v0, p0}, LPi0;-><init>(Lcom/google/android/material/chip/Chip;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "rootView"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Landroid/view/LayoutInflater;)LPi0;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LPi0;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LPi0;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LPi0;
    .locals 2

    sget v0, Lmk4;->chip_rating_tag:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LPi0;->a(Landroid/view/View;)LPi0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Lcom/google/android/material/chip/Chip;
    .locals 1

    iget-object v0, p0, LPi0;->a:Lcom/google/android/material/chip/Chip;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LPi0;->b()Lcom/google/android/material/chip/Chip;

    move-result-object v0

    return-object v0
.end method
