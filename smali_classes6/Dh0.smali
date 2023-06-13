.class public LDh0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LDh0;->a:I

    return-void
.end method


# virtual methods
.method public a(I)Z
    .locals 1

    iget v0, p0, LDh0;->a:I

    if-eq v0, p1, :cond_0

    invoke-virtual {p0}, LDh0;->c()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b()I
    .locals 1

    iget v0, p0, LDh0;->a:I

    return v0
.end method

.method public c()Z
    .locals 1

    iget v0, p0, LDh0;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()V
    .locals 1

    iget v0, p0, LDh0;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LDh0;->a:I

    if-nez v0, :cond_0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LDh0;->a:I

    :cond_0
    return-void
.end method
