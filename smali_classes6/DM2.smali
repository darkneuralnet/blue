.class public final synthetic LDM2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LEM2;


# direct methods
.method public synthetic constructor <init>(LEM2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDM2;->a:LEM2;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, LDM2;->a:LEM2;

    invoke-static {v0, p1}, LEM2;->a(LEM2;Landroid/animation/ValueAnimator;)V

    return-void
.end method
