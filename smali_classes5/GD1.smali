.class public LGD1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LGD1;->b:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, LGD1;->a:I

    return v0
.end method
