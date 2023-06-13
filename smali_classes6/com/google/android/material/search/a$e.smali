.class public Lcom/google/android/material/search/a$e;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/search/a;->y(Z)Landroid/animation/AnimatorSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/google/android/material/search/a;


# direct methods
.method public constructor <init>(Lcom/google/android/material/search/a;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/search/a$e;->b:Lcom/google/android/material/search/a;

    iput-boolean p2, p0, Lcom/google/android/material/search/a$e;->a:Z

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/material/search/a$e;->b:Lcom/google/android/material/search/a;

    iget-boolean v0, p0, Lcom/google/android/material/search/a$e;->a:Z

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1, v0}, Lcom/google/android/material/search/a;->h(Lcom/google/android/material/search/a;F)V

    iget-boolean p1, p0, Lcom/google/android/material/search/a$e;->a:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/material/search/a$e;->b:Lcom/google/android/material/search/a;

    invoke-static {p1}, Lcom/google/android/material/search/a;->g(Lcom/google/android/material/search/a;)Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;->a()V

    :cond_1
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/material/search/a$e;->b:Lcom/google/android/material/search/a;

    iget-boolean v0, p0, Lcom/google/android/material/search/a$e;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_0
    invoke-static {p1, v0}, Lcom/google/android/material/search/a;->h(Lcom/google/android/material/search/a;F)V

    return-void
.end method
