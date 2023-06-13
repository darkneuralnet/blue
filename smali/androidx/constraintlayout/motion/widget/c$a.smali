.class public Landroidx/constraintlayout/motion/widget/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Interpolator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/motion/widget/c;->f(Landroid/content/Context;)Landroid/view/animation/Interpolator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg91;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/motion/widget/c;Lg91;)V
    .locals 0

    iput-object p2, p0, Landroidx/constraintlayout/motion/widget/c$a;->a:Lg91;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 3

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/c$a;->a:Lg91;

    float-to-double v1, p1

    invoke-virtual {v0, v1, v2}, Lg91;->a(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1
.end method
