.class public final LwC7;
.super Lk58;
.source "SourceFile"

# interfaces
.implements Lrj8;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LiQ7;->I()LiQ7;

    move-result-object v0

    invoke-direct {p0, v0}, Lk58;-><init>(LV78;)V

    return-void
.end method

.method public synthetic constructor <init>(LZe7;)V
    .locals 0

    invoke-static {}, LiQ7;->I()LiQ7;

    move-result-object p1

    invoke-direct {p0, p1}, Lk58;-><init>(LV78;)V

    return-void
.end method


# virtual methods
.method public final o(F)LwC7;
    .locals 1

    invoke-virtual {p0}, Lk58;->m()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LiQ7;

    invoke-static {v0, p1}, LiQ7;->K(LiQ7;F)V

    return-object p0
.end method

.method public final p(F)LwC7;
    .locals 1

    invoke-virtual {p0}, Lk58;->m()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LiQ7;

    invoke-static {v0, p1}, LiQ7;->L(LiQ7;F)V

    return-object p0
.end method

.method public final r(I)LwC7;
    .locals 1

    invoke-virtual {p0}, Lk58;->m()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LiQ7;

    invoke-static {v0, p1}, LiQ7;->M(LiQ7;I)V

    return-object p0
.end method

.method public final t(I)LwC7;
    .locals 1

    invoke-virtual {p0}, Lk58;->m()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LiQ7;

    invoke-static {v0, p1}, LiQ7;->J(LiQ7;I)V

    return-object p0
.end method
