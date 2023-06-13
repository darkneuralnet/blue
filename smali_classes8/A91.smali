.class public LA91;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public b:LyB0;

.field public c:I

.field public d:D


# direct methods
.method public constructor <init>(LyB0;ID)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LyB0;

    invoke-direct {v0, p1}, LyB0;-><init>(LyB0;)V

    iput-object v0, p0, LA91;->b:LyB0;

    iput p2, p0, LA91;->c:I

    iput-wide p3, p0, LA91;->d:D

    return-void
.end method


# virtual methods
.method public a(ID)I
    .locals 5

    iget v0, p0, LA91;->c:I

    const/4 v1, -0x1

    if-ge v0, p1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x1

    if-le v0, p1, :cond_1

    return v2

    :cond_1
    iget-wide v3, p0, LA91;->d:D

    cmpg-double p1, v3, p2

    if-gez p1, :cond_2

    return v1

    :cond_2
    cmpl-double p1, v3, p2

    if-lez p1, :cond_3

    return v2

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 3

    check-cast p1, LA91;

    iget v0, p1, LA91;->c:I

    iget-wide v1, p1, LA91;->d:D

    invoke-virtual {p0, v0, v1, v2}, LA91;->a(ID)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LA91;->b:LyB0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " seg # = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LA91;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " dist = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LA91;->d:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
