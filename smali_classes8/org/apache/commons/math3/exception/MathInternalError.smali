.class public Lorg/apache/commons/math3/exception/MathInternalError;
.super Lorg/apache/commons/math3/exception/MathIllegalStateException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x571b96fbd1838b3eL


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lorg/apache/commons/math3/exception/MathIllegalStateException;-><init>()V

    invoke-virtual {p0}, Lorg/apache/commons/math3/exception/MathIllegalStateException;->a()LYg1;

    move-result-object v0

    sget-object v1, LJv2;->t1:LJv2;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "https://issues.apache.org/jira/browse/MATH"

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, LYg1;->a(LHv2;[Ljava/lang/Object;)V

    return-void
.end method
