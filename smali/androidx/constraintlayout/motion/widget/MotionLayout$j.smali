.class public Landroidx/constraintlayout/motion/widget/MotionLayout$j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "j"
.end annotation


# instance fields
.field public a:F

.field public b:F

.field public c:I

.field public d:I

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final synthetic i:Landroidx/constraintlayout/motion/widget/MotionLayout;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->i:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->a:F

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->b:F

    const/4 p1, -0x1

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->c:I

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->d:I

    const-string p1, "motion.progress"

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->e:Ljava/lang/String;

    const-string p1, "motion.velocity"

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->f:Ljava/lang/String;

    const-string p1, "motion.StartState"

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->g:Ljava/lang/String;

    const-string p1, "motion.EndState"

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->d:I

    if-eq v2, v1, :cond_3

    :cond_0
    if-ne v0, v1, :cond_1

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->i:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->d:I

    invoke-virtual {v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->q0(I)V

    goto :goto_0

    :cond_1
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->d:I

    if-ne v2, v1, :cond_2

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->i:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v2, v0, v1, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(III)V

    goto :goto_0

    :cond_2
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->i:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v3, v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setTransition(II)V

    :goto_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->i:Landroidx/constraintlayout/motion/widget/MotionLayout;

    sget-object v2, Landroidx/constraintlayout/motion/widget/MotionLayout$l;->c:Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    invoke-virtual {v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->i0(Landroidx/constraintlayout/motion/widget/MotionLayout$l;)V

    :cond_3
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->b:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->a:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->i:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->a:F

    invoke-virtual {v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    return-void

    :cond_5
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->i:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->a:F

    iget v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->b:F

    invoke-virtual {v0, v2, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(FF)V

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->a:F

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->b:F

    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->c:I

    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->d:I

    return-void
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->d:I

    return-void
.end method

.method public c(F)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->a:F

    return-void
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->c:I

    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "motion.progress"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->a:F

    const-string v0, "motion.velocity"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->b:F

    const-string v0, "motion.StartState"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->c:I

    const-string v0, "motion.EndState"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->d:I

    return-void
.end method

.method public f(F)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$j;->b:F

    return-void
.end method
