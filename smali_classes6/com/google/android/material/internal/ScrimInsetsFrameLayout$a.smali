.class public Lcom/google/android/material/internal/ScrimInsetsFrameLayout$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUe3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/internal/ScrimInsetsFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/internal/ScrimInsetsFrameLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout$a;->b:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;LDB6;)LDB6;
    .locals 4

    iget-object p1, p0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout$a;->b:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;

    iget-object v0, p1, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->c:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p1, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->c:Landroid/graphics/Rect;

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout$a;->b:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;

    iget-object p1, p1, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->c:Landroid/graphics/Rect;

    invoke-virtual {p2}, LDB6;->k()I

    move-result v0

    invoke-virtual {p2}, LDB6;->m()I

    move-result v1

    invoke-virtual {p2}, LDB6;->l()I

    move-result v2

    invoke-virtual {p2}, LDB6;->j()I

    move-result v3

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    iget-object p1, p0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout$a;->b:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;

    invoke-virtual {p1, p2}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->a(LDB6;)V

    iget-object p1, p0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout$a;->b:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;

    invoke-virtual {p2}, LDB6;->n()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout$a;->b:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;

    iget-object v0, v0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->b:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-virtual {p1, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    iget-object p1, p0, Lcom/google/android/material/internal/ScrimInsetsFrameLayout$a;->b:Lcom/google/android/material/internal/ScrimInsetsFrameLayout;

    invoke-static {p1}, Lbq6;->m0(Landroid/view/View;)V

    invoke-virtual {p2}, LDB6;->c()LDB6;

    move-result-object p1

    return-object p1
.end method
