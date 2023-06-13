.class public LIr2$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIr2;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LIr2;


# direct methods
.method public constructor <init>(LIr2;)V
    .locals 0

    iput-object p1, p0, LIr2$b;->a:LIr2;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p1, p0, LIr2$b;->a:LIr2;

    invoke-virtual {p1}, LIr2;->a()V

    iget-object p1, p0, LIr2$b;->a:LIr2;

    iget-object v0, p1, LIr2;->k:Loe;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lp12;->a:Lq12;

    invoke-virtual {v0, p1}, Loe;->onAnimationEnd(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method
