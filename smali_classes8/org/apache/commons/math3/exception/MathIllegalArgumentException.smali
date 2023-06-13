.class public Lorg/apache/commons/math3/exception/MathIllegalArgumentException;
.super Ljava/lang/IllegalArgumentException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x539cc8a80344c4feL


# instance fields
.field public final b:LYg1;


# direct methods
.method public varargs constructor <init>(LHv2;[Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    new-instance v0, LYg1;

    invoke-direct {v0, p0}, LYg1;-><init>(Ljava/lang/Throwable;)V

    iput-object v0, p0, Lorg/apache/commons/math3/exception/MathIllegalArgumentException;->b:LYg1;

    invoke-virtual {v0, p1, p2}, LYg1;->a(LHv2;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getLocalizedMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/math3/exception/MathIllegalArgumentException;->b:LYg1;

    invoke-virtual {v0}, LYg1;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/math3/exception/MathIllegalArgumentException;->b:LYg1;

    invoke-virtual {v0}, LYg1;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
