.class public final synthetic Lap1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcp1;


# direct methods
.method public synthetic constructor <init>(Lcp1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lap1;->a:Lcp1;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lap1;->a:Lcp1;

    invoke-static {v0, p1}, Lcp1;->Pl(Lcp1;Landroid/animation/ValueAnimator;)V

    return-void
.end method
