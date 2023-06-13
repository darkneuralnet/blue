.class public final synthetic LDq5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lj71;


# direct methods
.method public synthetic constructor <init>(Lj71;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDq5;->a:Lj71;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, LDq5;->a:Lj71;

    invoke-static {v0, p1}, Lcom/google/android/material/search/a;->a(Lj71;Landroid/animation/ValueAnimator;)V

    return-void
.end method
