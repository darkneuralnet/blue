.class public LJ91;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LJ91;->c:Z

    iput v0, p0, LJ91;->d:I

    iput p1, p0, LJ91;->a:I

    const/4 p1, 0x1

    iput p1, p0, LJ91;->b:I

    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LJ91;->a:I

    const/4 p1, 0x2

    iput p1, p0, LJ91;->b:I

    iput p2, p0, LJ91;->d:I

    iput-boolean p3, p0, LJ91;->c:Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LJ91;->d:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, LJ91;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LJ91;->a:I

    return v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, LJ91;->c:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, LJ91;->a:I

    iget v1, p0, LJ91;->b:I

    iget-boolean v2, p0, LJ91;->c:Z

    iget v3, p0, LJ91;->d:I

    invoke-static {v0, v1, v2, v3}, Lr91;->h(IIZI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
