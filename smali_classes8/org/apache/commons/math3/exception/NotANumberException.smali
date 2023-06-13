.class public Lorg/apache/commons/math3/exception/NotANumberException;
.super Lorg/apache/commons/math3/exception/MathIllegalNumberException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x133054aL


# direct methods
.method public constructor <init>()V
    .locals 3

    sget-object v0, LJv2;->H3:LJv2;

    const-wide/high16 v1, 0x7ff8000000000000L    # Double.NaN

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1, v2}, Lorg/apache/commons/math3/exception/MathIllegalNumberException;-><init>(LHv2;Ljava/lang/Number;[Ljava/lang/Object;)V

    return-void
.end method
