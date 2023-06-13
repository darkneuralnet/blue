.class public final Lwr7;
.super LFa9;
.source "SourceFile"

# interfaces
.implements Lwg9;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lls7;->v()Lls7;

    move-result-object v0

    invoke-direct {p0, v0}, LFa9;-><init>(Lub9;)V

    return-void
.end method

.method public synthetic constructor <init>(Lrl9;)V
    .locals 0

    invoke-static {}, Lls7;->v()Lls7;

    move-result-object p1

    invoke-direct {p0, p1}, LFa9;-><init>(Lub9;)V

    return-void
.end method


# virtual methods
.method public final p(LGu7;)Lwr7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, Lls7;

    invoke-static {v0, p1}, Lls7;->z(Lls7;LGu7;)V

    return-object p0
.end method

.method public final t(LGu7;)Lwr7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, Lls7;

    invoke-static {v0, p1}, Lls7;->w(Lls7;LGu7;)V

    return-object p0
.end method

.method public final w(LGu7;)Lwr7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, Lls7;

    invoke-static {v0, p1}, Lls7;->x(Lls7;LGu7;)V

    return-object p0
.end method

.method public final y(LGu7;)Lwr7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, Lls7;

    invoke-static {v0, p1}, Lls7;->y(Lls7;LGu7;)V

    return-object p0
.end method
