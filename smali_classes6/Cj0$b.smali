.class public LCj0$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCj0;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LCj0;


# direct methods
.method public constructor <init>(LCj0;)V
    .locals 0

    iput-object p1, p0, LCj0$b;->a:LCj0;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p1, p0, LCj0$b;->a:LCj0;

    invoke-virtual {p1}, LCj0;->a()V

    iget-object p1, p0, LCj0$b;->a:LCj0;

    iget-object v0, p1, LCj0;->k:Loe;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lp12;->a:Lq12;

    invoke-virtual {v0, p1}, Loe;->onAnimationEnd(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method
