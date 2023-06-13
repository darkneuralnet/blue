.class public LpO2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwj0;


# instance fields
.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:LP31;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0xb

    const/16 v1, 0x32

    invoke-direct {p0, v0, v1}, LpO2;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LpO2;-><init>(IILP31;)V

    return-void
.end method

.method public constructor <init>(IILP31;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-lt p1, v0, :cond_3

    const/16 v1, 0x20

    if-gt p1, v1, :cond_2

    iput p1, p0, LpO2;->b:I

    shl-int/2addr v0, p1

    iput v0, p0, LpO2;->d:I

    if-ltz p2, :cond_1

    if-gt p2, v0, :cond_0

    iput p2, p0, LpO2;->c:I

    invoke-static {p1}, LUX3;->c(I)I

    move-result p1

    iput p1, p0, LpO2;->e:I

    iput-object p3, p0, LpO2;->f:LP31;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "t must be less than n = 2^m"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "t must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "m is too large"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "m must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
