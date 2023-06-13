.class public LgG4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LzA0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lqe;

.field public final c:Lqe;

.field public final d:LEe;

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lqe;Lqe;LEe;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LgG4;->a:Ljava/lang/String;

    iput-object p2, p0, LgG4;->b:Lqe;

    iput-object p3, p0, LgG4;->c:Lqe;

    iput-object p4, p0, LgG4;->d:LEe;

    iput-boolean p5, p0, LgG4;->e:Z

    return-void
.end method


# virtual methods
.method public a(LRD2;LrD2;LqB;)LVz0;
    .locals 0

    new-instance p2, LhG4;

    invoke-direct {p2, p1, p3, p0}, LhG4;-><init>(LRD2;LqB;LgG4;)V

    return-object p2
.end method

.method public b()Lqe;
    .locals 1

    iget-object v0, p0, LgG4;->b:Lqe;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LgG4;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lqe;
    .locals 1

    iget-object v0, p0, LgG4;->c:Lqe;

    return-object v0
.end method

.method public e()LEe;
    .locals 1

    iget-object v0, p0, LgG4;->d:LEe;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, LgG4;->e:Z

    return v0
.end method
