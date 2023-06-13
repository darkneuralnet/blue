.class public Lorg/apache/commons/math3/exception/InsufficientDataException;
.super Lorg/apache/commons/math3/exception/MathIllegalArgumentException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x247d3cad13b56c7fL


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, LJv2;->m1:LJv2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lorg/apache/commons/math3/exception/InsufficientDataException;-><init>(LHv2;[Ljava/lang/Object;)V

    return-void
.end method

.method public varargs constructor <init>(LHv2;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/apache/commons/math3/exception/MathIllegalArgumentException;-><init>(LHv2;[Ljava/lang/Object;)V

    return-void
.end method
