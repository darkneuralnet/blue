.class public final Ld99;
.super LFa9;
.source "SourceFile"

# interfaces
.implements Lwg9;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Led9;->v()Led9;

    move-result-object v0

    invoke-direct {p0, v0}, LFa9;-><init>(Lub9;)V

    return-void
.end method

.method public synthetic constructor <init>(LH49;)V
    .locals 0

    invoke-static {}, Led9;->v()Led9;

    move-result-object p1

    invoke-direct {p0, p1}, LFa9;-><init>(Lub9;)V

    return-void
.end method


# virtual methods
.method public final p(I)Ld99;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, Led9;

    invoke-static {v0, p1}, Led9;->y(Led9;I)V

    return-object p0
.end method

.method public final t(J)Ld99;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, Led9;

    invoke-static {v0, p1, p2}, Led9;->x(Led9;J)V

    return-object p0
.end method

.method public final w(I)Ld99;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, Led9;

    invoke-static {v0, p1}, Led9;->w(Led9;I)V

    return-object p0
.end method

.method public final y(I)Ld99;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, Led9;

    invoke-static {v0, p1}, Led9;->z(Led9;I)V

    return-object p0
.end method

.method public final z(I)Ld99;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, Led9;

    invoke-static {v0, p1}, Led9;->A(Led9;I)V

    return-object p0
.end method
