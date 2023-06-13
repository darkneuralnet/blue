.class public abstract Li0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:I

.field public final b:[F

.field public c:F

.field public d:F

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Li0;->c:F

    iput v0, p0, Li0;->d:F

    const/4 v0, 0x0

    iput v0, p0, Li0;->e:I

    iput v0, p0, Li0;->f:I

    iput v0, p0, Li0;->a:I

    new-array p1, p1, [F

    iput-object p1, p0, Li0;->b:[F

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li0;->a:I

    return-void
.end method

.method public b(FF)V
    .locals 0

    iput p1, p0, Li0;->c:F

    iput p2, p0, Li0;->d:F

    return-void
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Li0;->b:[F

    array-length v0, v0

    return v0
.end method
