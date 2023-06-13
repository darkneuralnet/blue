.class public Lhi0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

.field public b:F

.field public c:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lhi0;->b:F

    iput v0, p0, Lhi0;->c:F

    return-void
.end method

.method public constructor <init>(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lhi0;->b:F

    iput v0, p0, Lhi0;->c:F

    iput-object p1, p0, Lhi0;->a:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, Lhi0;->c:F

    return v0
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lhi0;->b:F

    return v0
.end method
