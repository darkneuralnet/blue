.class public LAy5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LzA0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAy5$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LAy5$a;

.field public final c:Lqe;

.field public final d:Lqe;

.field public final e:Lqe;

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;LAy5$a;Lqe;Lqe;Lqe;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAy5;->a:Ljava/lang/String;

    iput-object p2, p0, LAy5;->b:LAy5$a;

    iput-object p3, p0, LAy5;->c:Lqe;

    iput-object p4, p0, LAy5;->d:Lqe;

    iput-object p5, p0, LAy5;->e:Lqe;

    iput-boolean p6, p0, LAy5;->f:Z

    return-void
.end method


# virtual methods
.method public a(LRD2;LrD2;LqB;)LVz0;
    .locals 0

    new-instance p1, Lxa6;

    invoke-direct {p1, p3, p0}, Lxa6;-><init>(LqB;LAy5;)V

    return-object p1
.end method

.method public b()Lqe;
    .locals 1

    iget-object v0, p0, LAy5;->d:Lqe;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LAy5;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lqe;
    .locals 1

    iget-object v0, p0, LAy5;->e:Lqe;

    return-object v0
.end method

.method public e()Lqe;
    .locals 1

    iget-object v0, p0, LAy5;->c:Lqe;

    return-object v0
.end method

.method public f()LAy5$a;
    .locals 1

    iget-object v0, p0, LAy5;->b:LAy5$a;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, LAy5;->f:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Trim Path: {start: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LAy5;->c:Lqe;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", end: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LAy5;->d:Lqe;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offset: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LAy5;->e:Lqe;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
