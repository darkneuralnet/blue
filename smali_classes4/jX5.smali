.class public final synthetic LjX5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LkX5;


# direct methods
.method public synthetic constructor <init>(LkX5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjX5;->a:LkX5;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, LjX5;->a:LkX5;

    invoke-static {v0, p1}, LkX5;->Pl(LkX5;Landroid/animation/ValueAnimator;)V

    return-void
.end method
