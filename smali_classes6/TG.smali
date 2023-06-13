.class public final LTG;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LSG;

.field public b:LET;


# direct methods
.method public constructor <init>(LSG;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, LTG;->a:LSG;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Binarizer must be non-null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()LET;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    iget-object v0, p0, LTG;->b:LET;

    if-nez v0, :cond_0

    iget-object v0, p0, LTG;->a:LSG;

    invoke-virtual {v0}, LSG;->b()LET;

    move-result-object v0

    iput-object v0, p0, LTG;->b:LET;

    :cond_0
    iget-object v0, p0, LTG;->b:LET;

    return-object v0
.end method

.method public b(ILCT;)LCT;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    iget-object v0, p0, LTG;->a:LSG;

    invoke-virtual {v0, p1, p2}, LSG;->c(ILCT;)LCT;

    move-result-object p1

    return-object p1
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, LTG;->a:LSG;

    invoke-virtual {v0}, LSG;->d()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, LTG;->a:LSG;

    invoke-virtual {v0}, LSG;->f()I

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, LTG;->a:LSG;

    invoke-virtual {v0}, LSG;->e()LzE2;

    move-result-object v0

    invoke-virtual {v0}, LzE2;->f()Z

    move-result v0

    return v0
.end method

.method public f()LTG;
    .locals 3

    iget-object v0, p0, LTG;->a:LSG;

    invoke-virtual {v0}, LSG;->e()LzE2;

    move-result-object v0

    invoke-virtual {v0}, LzE2;->g()LzE2;

    move-result-object v0

    new-instance v1, LTG;

    iget-object v2, p0, LTG;->a:LSG;

    invoke-virtual {v2, v0}, LSG;->a(LzE2;)LSG;

    move-result-object v0

    invoke-direct {v1, v0}, LTG;-><init>(LSG;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, LTG;->a()LET;

    move-result-object v0

    invoke-virtual {v0}, LET;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/zxing/NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, ""

    return-object v0
.end method
