.class public LtO2;
.super LoO2;
.source "SourceFile"


# instance fields
.field public d:I

.field public e:I

.field public f:LOA1;


# direct methods
.method public constructor <init>(IILOA1;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LoO2;-><init>(ZLpO2;)V

    iput p1, p0, LtO2;->d:I

    iput p2, p0, LtO2;->e:I

    new-instance p1, LOA1;

    invoke-direct {p1, p3}, LOA1;-><init>(LOA1;)V

    iput-object p1, p0, LtO2;->f:LOA1;

    return-void
.end method


# virtual methods
.method public a()LOA1;
    .locals 1

    iget-object v0, p0, LtO2;->f:LOA1;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, LtO2;->d:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LtO2;->e:I

    return v0
.end method
