.class public Lb10;
.super Lnm0;
.source "SourceFile"


# instance fields
.field public final b:LQj6;

.field public final c:LQj6;

.field public final d:LjN2;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lnm0;-><init>()V

    invoke-static {}, LQj6;->x()LQj6;

    move-result-object v0

    iput-object v0, p0, Lb10;->b:LQj6;

    invoke-static {}, LQj6;->k()LQj6;

    move-result-object v0

    iput-object v0, p0, Lb10;->c:LQj6;

    new-instance v0, LjN2;

    invoke-direct {v0}, LjN2;-><init>()V

    iput-object v0, p0, Lb10;->d:LjN2;

    return-void
.end method

.method public constructor <init>(LQj6;LQj6;)V
    .locals 1

    invoke-direct {p0}, Lnm0;-><init>()V

    invoke-static {}, LQj6;->x()LQj6;

    move-result-object v0

    iput-object v0, p0, Lb10;->b:LQj6;

    invoke-static {}, LQj6;->k()LQj6;

    move-result-object v0

    iput-object v0, p0, Lb10;->c:LQj6;

    new-instance v0, LjN2;

    invoke-direct {v0}, LjN2;-><init>()V

    iput-object v0, p0, Lb10;->d:LjN2;

    const-string v0, "Parameter \"center\" was null."

    invoke-static {p2, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"size\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p2}, Lb10;->f(LQj6;)V

    invoke-virtual {p0, p1}, Lb10;->g(LQj6;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lnm0;
    .locals 1

    invoke-virtual {p0}, Lb10;->e()Lb10;

    move-result-object v0

    return-object v0
.end method

.method public c()LQj6;
    .locals 2

    new-instance v0, LQj6;

    iget-object v1, p0, Lb10;->b:LQj6;

    invoke-direct {v0, v1}, LQj6;-><init>(LQj6;)V

    return-object v0
.end method

.method public d()LQj6;
    .locals 2

    new-instance v0, LQj6;

    iget-object v1, p0, Lb10;->c:LQj6;

    invoke-direct {v0, v1}, LQj6;-><init>(LQj6;)V

    return-object v0
.end method

.method public e()Lb10;
    .locals 3

    new-instance v0, Lb10;

    invoke-virtual {p0}, Lb10;->d()LQj6;

    move-result-object v1

    invoke-virtual {p0}, Lb10;->c()LQj6;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lb10;-><init>(LQj6;LQj6;)V

    return-object v0
.end method

.method public f(LQj6;)V
    .locals 1

    const-string v0, "Parameter \"center\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lb10;->b:LQj6;

    invoke-virtual {v0, p1}, LQj6;->o(LQj6;)V

    invoke-virtual {p0}, Lnm0;->b()V

    return-void
.end method

.method public g(LQj6;)V
    .locals 1

    const-string v0, "Parameter \"size\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lb10;->c:LQj6;

    invoke-virtual {v0, p1}, LQj6;->o(LQj6;)V

    invoke-virtual {p0}, Lnm0;->b()V

    return-void
.end method
