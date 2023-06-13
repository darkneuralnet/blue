.class public final Lkt9;
.super Lbm9;
.source "SourceFile"

# interfaces
.implements LPp9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbm9<",
        "Lmt9;",
        "Lkt9;",
        ">;",
        "LPp9;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lmt9;->x()Lmt9;

    move-result-object v0

    invoke-direct {p0, v0}, Lbm9;-><init>(LEm9;)V

    return-void
.end method

.method public synthetic constructor <init>(Lit9;)V
    .locals 0

    invoke-static {}, Lmt9;->x()Lmt9;

    move-result-object p1

    invoke-direct {p0, p1}, Lbm9;-><init>(LEm9;)V

    return-void
.end method


# virtual methods
.method public final A(Z)Lkt9;
    .locals 1

    iget-boolean p1, p0, Lbm9;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbm9;->w()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lbm9;->d:Z

    :cond_0
    iget-object p1, p0, Lbm9;->c:LEm9;

    check-cast p1, Lmt9;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lmt9;->A(Lmt9;Z)V

    return-object p0
.end method

.method public final y(LAt9;)Lkt9;
    .locals 1

    iget-boolean v0, p0, Lbm9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbm9;->w()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbm9;->d:Z

    :cond_0
    iget-object v0, p0, Lbm9;->c:LEm9;

    check-cast v0, Lmt9;

    invoke-static {v0, p1}, Lmt9;->y(Lmt9;LAt9;)V

    return-object p0
.end method
