.class public Lorg/junit/internal/AssumptionViolatedException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"

# interfaces
.implements LXr5;


# static fields
.field private static final serialVersionUID:J = 0x2L


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Ljava/lang/Object;

.field public final e:LzM2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LzM2<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->putFields()Ljava/io/ObjectOutputStream$PutField;

    move-result-object v0

    const-string v1, "fAssumption"

    iget-object v2, p0, Lorg/junit/internal/AssumptionViolatedException;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/io/ObjectOutputStream$PutField;->put(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "fValueMatcher"

    iget-boolean v2, p0, Lorg/junit/internal/AssumptionViolatedException;->c:Z

    invoke-virtual {v0, v1, v2}, Ljava/io/ObjectOutputStream$PutField;->put(Ljava/lang/String;Z)V

    iget-object v1, p0, Lorg/junit/internal/AssumptionViolatedException;->e:LzM2;

    invoke-static {v1}, LXs5;->b(LzM2;)LzM2;

    move-result-object v1

    const-string v2, "fMatcher"

    invoke-virtual {v0, v2, v1}, Ljava/io/ObjectOutputStream$PutField;->put(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lorg/junit/internal/AssumptionViolatedException;->d:Ljava/lang/Object;

    invoke-static {v1}, LYs5;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "fValue"

    invoke-virtual {v0, v2, v1}, Ljava/io/ObjectOutputStream$PutField;->put(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->writeFields()V

    return-void
.end method


# virtual methods
.method public a(Lw01;)V
    .locals 1

    iget-object v0, p0, Lorg/junit/internal/AssumptionViolatedException;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lw01;->a(Ljava/lang/String;)Lw01;

    :cond_0
    iget-boolean v0, p0, Lorg/junit/internal/AssumptionViolatedException;->c:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/junit/internal/AssumptionViolatedException;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v0, ": "

    invoke-interface {p1, v0}, Lw01;->a(Ljava/lang/String;)Lw01;

    :cond_1
    const-string v0, "got: "

    invoke-interface {p1, v0}, Lw01;->a(Ljava/lang/String;)Lw01;

    iget-object v0, p0, Lorg/junit/internal/AssumptionViolatedException;->d:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lw01;->b(Ljava/lang/Object;)Lw01;

    iget-object v0, p0, Lorg/junit/internal/AssumptionViolatedException;->e:LzM2;

    if-eqz v0, :cond_2

    const-string v0, ", expected: "

    invoke-interface {p1, v0}, Lw01;->a(Ljava/lang/String;)Lw01;

    iget-object v0, p0, Lorg/junit/internal/AssumptionViolatedException;->e:LzM2;

    invoke-interface {p1, v0}, Lw01;->c(LXr5;)Lw01;

    :cond_2
    return-void
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LSR5;->k(LXr5;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
