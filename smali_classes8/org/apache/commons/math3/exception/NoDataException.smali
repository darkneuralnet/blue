.class public Lorg/apache/commons/math3/exception/NoDataException;
.super Lorg/apache/commons/math3/exception/MathIllegalArgumentException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x325df360bb1970cbL


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, LJv2;->z3:LJv2;

    invoke-direct {p0, v0}, Lorg/apache/commons/math3/exception/NoDataException;-><init>(LHv2;)V

    return-void
.end method

.method public constructor <init>(LHv2;)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/math3/exception/MathIllegalArgumentException;-><init>(LHv2;[Ljava/lang/Object;)V

    return-void
.end method
