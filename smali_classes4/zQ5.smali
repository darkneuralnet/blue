.class public final synthetic LzQ5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LAQ5;


# direct methods
.method public synthetic constructor <init>(LAQ5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzQ5;->a:LAQ5;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, LzQ5;->a:LAQ5;

    invoke-static {v0, p1}, LAQ5;->Ql(LAQ5;Landroid/animation/ValueAnimator;)V

    return-void
.end method
