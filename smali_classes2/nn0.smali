.class public final synthetic Lnn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lon0;


# direct methods
.method public synthetic constructor <init>(Lon0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnn0;->a:Lon0;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lnn0;->a:Lon0;

    invoke-static {v0, p1}, Lon0;->a5(Lon0;Landroid/animation/ValueAnimator;)V

    return-void
.end method
