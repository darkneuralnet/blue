.class public Lgq2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lfq2$c;

.field public c:F

.field public d:F

.field public e:Landroid/graphics/DashPathEffect;

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lfq2$c;->d:Lfq2$c;

    iput-object v0, p0, Lgq2;->b:Lfq2$c;

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Lgq2;->c:F

    iput v0, p0, Lgq2;->d:F

    const/4 v0, 0x0

    iput-object v0, p0, Lgq2;->e:Landroid/graphics/DashPathEffect;

    const v0, 0x112233

    iput v0, p0, Lgq2;->f:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lfq2$c;FFLandroid/graphics/DashPathEffect;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lfq2$c;->b:Lfq2$c;

    iput-object p1, p0, Lgq2;->a:Ljava/lang/String;

    iput-object p2, p0, Lgq2;->b:Lfq2$c;

    iput p3, p0, Lgq2;->c:F

    iput p4, p0, Lgq2;->d:F

    iput-object p5, p0, Lgq2;->e:Landroid/graphics/DashPathEffect;

    iput p6, p0, Lgq2;->f:I

    return-void
.end method
