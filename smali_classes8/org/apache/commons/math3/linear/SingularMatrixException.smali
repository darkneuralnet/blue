.class public Lorg/apache/commons/math3/linear/SingularMatrixException;
.super Lorg/apache/commons/math3/exception/MathIllegalArgumentException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x3a608af6d6dc6c6eL


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, LJv2;->P4:LJv2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lorg/apache/commons/math3/exception/MathIllegalArgumentException;-><init>(LHv2;[Ljava/lang/Object;)V

    return-void
.end method
