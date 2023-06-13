.class public final LiN1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LiN1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "LyB0;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/Random;

.field public final c:[LyB0;

.field public final d:[I

.field public e:I


# direct methods
.method public constructor <init>([LyB0;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Random;

    const-wide/16 v1, 0xd

    invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V

    iput-object v0, p0, LiN1$a;->b:Ljava/util/Random;

    iput-object p1, p0, LiN1$a;->c:[LyB0;

    array-length v0, p1

    new-array v0, v0, [I

    iput-object v0, p0, LiN1$a;->d:[I

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LiN1$a;->d:[I

    aput v0, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LiN1$a;->e:I

    return-void
.end method


# virtual methods
.method public a()LyB0;
    .locals 5

    iget-object v0, p0, LiN1$a;->b:Ljava/util/Random;

    iget v1, p0, LiN1$a;->e:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    iget-object v1, p0, LiN1$a;->c:[LyB0;

    iget-object v2, p0, LiN1$a;->d:[I

    aget v3, v2, v0

    aget-object v1, v1, v3

    iget v3, p0, LiN1$a;->e:I

    add-int/lit8 v4, v3, -0x1

    iput v4, p0, LiN1$a;->e:I

    aget v3, v2, v3

    aput v3, v2, v0

    return-object v1
.end method

.method public hasNext()Z
    .locals 1

    iget v0, p0, LiN1$a;->e:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LiN1$a;->a()LyB0;

    move-result-object v0

    return-object v0
.end method
