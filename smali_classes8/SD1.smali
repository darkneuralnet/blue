.class public abstract LSD1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LSl2;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LSD1;->b:Z

    iput-boolean v0, p0, LSD1;->c:Z

    iput-boolean v0, p0, LSD1;->d:Z

    iput-boolean v0, p0, LSD1;->e:Z

    return-void
.end method


# virtual methods
.method public abstract a(LP62;)V
.end method

.method public b()LSl2;
    .locals 1

    iget-object v0, p0, LSD1;->a:LSl2;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, LSD1;->c:Z

    return v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, LSD1;->d:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, LSD1;->b:Z

    return v0
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, LSD1;->c:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, LSD1;->d:Z

    return-void
.end method

.method public g(Z)V
    .locals 0

    iput-boolean p1, p0, LSD1;->b:Z

    return-void
.end method

.method public h(LP62;)V
    .locals 2

    iget-object v0, p0, LSD1;->a:LSl2;

    invoke-virtual {v0}, LSl2;->c()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "found partial label"

    invoke-static {v0, v1}, LKo;->d(ZLjava/lang/String;)V

    invoke-virtual {p0, p1}, LSD1;->a(LP62;)V

    return-void
.end method
