.class public LSE;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcr5;


# instance fields
.field public a:[LyB0;

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>([LyB0;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSE;->a:[LyB0;

    iput-object p2, p0, LSE;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LSE;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public h()[LyB0;
    .locals 1

    iget-object v0, p0, LSE;->a:[LyB0;

    return-object v0
.end method

.method public isClosed()Z
    .locals 3

    iget-object v0, p0, LSE;->a:[LyB0;

    const/4 v1, 0x0

    aget-object v1, v0, v1

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LSE;->a:[LyB0;

    array-length v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, LzB0;

    iget-object v1, p0, LSE;->a:[LyB0;

    invoke-direct {v0, v1}, LzB0;-><init>([LyB0;)V

    invoke-static {v0}, Lkw6;->B(LEB0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(I)LyB0;
    .locals 1

    iget-object v0, p0, LSE;->a:[LyB0;

    aget-object p1, v0, p1

    return-object p1
.end method
