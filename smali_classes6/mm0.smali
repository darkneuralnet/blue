.class public Lmm0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lo96;

.field public b:Lom0;

.field public c:Lnm0;

.field public d:Lnm0;

.field public e:Z

.field public f:I


# direct methods
.method public constructor <init>(Lo96;Lnm0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lmm0;->f:I

    const-string v0, "Parameter \"transformProvider\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"localCollisionShape\" was null."

    invoke-static {p2, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lmm0;->a:Lo96;

    invoke-virtual {p0, p2}, Lmm0;->d(Lnm0;)V

    return-void
.end method


# virtual methods
.method public a()Lnm0;
    .locals 1

    iget-object v0, p0, Lmm0;->c:Lnm0;

    return-object v0
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lmm0;->e:Z

    return-void
.end method

.method public c(Lom0;)V
    .locals 1

    iget-object v0, p0, Lmm0;->b:Lom0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lom0;->b(Lmm0;)V

    :cond_0
    iput-object p1, p0, Lmm0;->b:Lom0;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Lom0;->a(Lmm0;)V

    :cond_1
    return-void
.end method

.method public d(Lnm0;)V
    .locals 1

    const-string v0, "Parameter \"localCollisionShape\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lmm0;->c:Lnm0;

    const/4 p1, 0x0

    iput-object p1, p0, Lmm0;->d:Lnm0;

    return-void
.end method
