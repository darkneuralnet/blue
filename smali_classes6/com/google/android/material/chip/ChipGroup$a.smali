.class public Lcom/google/android/material/chip/ChipGroup$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpi0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/chip/ChipGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/material/chip/ChipGroup;


# direct methods
.method public constructor <init>(Lcom/google/android/material/chip/ChipGroup;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/chip/ChipGroup$a;->a:Lcom/google/android/material/chip/ChipGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/material/chip/ChipGroup$a;->a:Lcom/google/android/material/chip/ChipGroup;

    invoke-static {p1}, Lcom/google/android/material/chip/ChipGroup;->h(Lcom/google/android/material/chip/ChipGroup;)Lcom/google/android/material/chip/ChipGroup$d;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/material/chip/ChipGroup$a;->a:Lcom/google/android/material/chip/ChipGroup;

    invoke-static {p1}, Lcom/google/android/material/chip/ChipGroup;->h(Lcom/google/android/material/chip/ChipGroup;)Lcom/google/android/material/chip/ChipGroup$d;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/chip/ChipGroup$a;->a:Lcom/google/android/material/chip/ChipGroup;

    invoke-static {v0}, Lcom/google/android/material/chip/ChipGroup;->i(Lcom/google/android/material/chip/ChipGroup;)Lpi0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/material/chip/ChipGroup$a;->a:Lcom/google/android/material/chip/ChipGroup;

    invoke-virtual {v1, v2}, Lpi0;->j(Landroid/view/ViewGroup;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/google/android/material/chip/ChipGroup$d;->a(Lcom/google/android/material/chip/ChipGroup;Ljava/util/List;)V

    :cond_0
    return-void
.end method
