.class public final LRd2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Lcom/google/android/material/chip/ChipGroup;


# direct methods
.method public constructor <init>(Lcom/google/android/material/chip/ChipGroup;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRd2;->a:Lcom/google/android/material/chip/ChipGroup;

    return-void
.end method

.method public static a(Landroid/view/View;)LRd2;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, LRd2;

    check-cast p0, Lcom/google/android/material/chip/ChipGroup;

    invoke-direct {v0, p0}, LRd2;-><init>(Lcom/google/android/material/chip/ChipGroup;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "rootView"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public b()Lcom/google/android/material/chip/ChipGroup;
    .locals 1

    iget-object v0, p0, LRd2;->a:Lcom/google/android/material/chip/ChipGroup;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LRd2;->b()Lcom/google/android/material/chip/ChipGroup;

    move-result-object v0

    return-object v0
.end method
