.class public Lorg/apache/commons/math3/exception/MathIllegalStateException;
.super Ljava/lang/IllegalStateException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x539cc8a80344c4feL


# instance fields
.field public final b:LYg1;


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, LJv2;->v5:LJv2;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lorg/apache/commons/math3/exception/MathIllegalStateException;-><init>(LHv2;[Ljava/lang/Object;)V

    return-void
.end method

.method public varargs constructor <init>(LHv2;[Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    new-instance v0, LYg1;

    invoke-direct {v0, p0}, LYg1;-><init>(Ljava/lang/Throwable;)V

    iput-object v0, p0, Lorg/apache/commons/math3/exception/MathIllegalStateException;->b:LYg1;

    invoke-virtual {v0, p1, p2}, LYg1;->a(LHv2;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()LYg1;
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/math3/exception/MathIllegalStateException;->b:LYg1;

    return-object v0
.end method

.method public getLocalizedMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/math3/exception/MathIllegalStateException;->b:LYg1;

    invoke-virtual {v0}, LYg1;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/math3/exception/MathIllegalStateException;->b:LYg1;

    invoke-virtual {v0}, LYg1;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
