.class public Lorg/apache/commons/math3/exception/ConvergenceException;
.super Lorg/apache/commons/math3/exception/MathIllegalStateException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x3c1742cdad69f2e7L


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, LJv2;->T:LJv2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lorg/apache/commons/math3/exception/ConvergenceException;-><init>(LHv2;[Ljava/lang/Object;)V

    return-void
.end method

.method public varargs constructor <init>(LHv2;[Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Lorg/apache/commons/math3/exception/MathIllegalStateException;-><init>()V

    invoke-virtual {p0}, Lorg/apache/commons/math3/exception/MathIllegalStateException;->a()LYg1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LYg1;->a(LHv2;[Ljava/lang/Object;)V

    return-void
.end method
