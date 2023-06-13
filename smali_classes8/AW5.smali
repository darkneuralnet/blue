.class public LAW5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public b:Ljava/lang/Object;

.field public c:D

.field public d:I

.field public e:LAW5;

.field public f:I

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(DLAW5;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, LAW5;->d:I

    iput-wide p1, p0, LAW5;->c:D

    iput-object p3, p0, LAW5;->e:LAW5;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;DLjava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LAW5;->e:LAW5;

    const/4 v0, 0x1

    iput v0, p0, LAW5;->d:I

    iput-object p1, p0, LAW5;->b:Ljava/lang/Object;

    iput-wide p2, p0, LAW5;->c:D

    iput-object p4, p0, LAW5;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LAW5;->f:I

    return v0
.end method

.method public b()LAW5;
    .locals 1

    iget-object v0, p0, LAW5;->e:LAW5;

    return-object v0
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LAW5;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 6

    check-cast p1, LAW5;

    iget-wide v0, p0, LAW5;->c:D

    iget-wide v2, p1, LAW5;->c:D

    cmpg-double v4, v0, v2

    const/4 v5, -0x1

    if-gez v4, :cond_0

    return v5

    :cond_0
    cmpl-double v0, v0, v2

    const/4 v1, 0x1

    if-lez v0, :cond_1

    return v1

    :cond_1
    iget v0, p0, LAW5;->d:I

    iget p1, p1, LAW5;->d:I

    if-ge v0, p1, :cond_2

    return v5

    :cond_2
    if-le v0, p1, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public d()Z
    .locals 2

    iget v0, p0, LAW5;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()Z
    .locals 2

    iget v0, p0, LAW5;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public f(LAW5;)Z
    .locals 2

    iget-object v0, p0, LAW5;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object p1, p1, LAW5;->b:Ljava/lang/Object;

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public g(I)V
    .locals 0

    iput p1, p0, LAW5;->f:I

    return-void
.end method
