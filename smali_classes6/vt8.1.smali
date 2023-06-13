.class public final Lvt8;
.super Lk58;
.source "SourceFile"

# interfaces
.implements Lrj8;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LyA8;->I()LyA8;

    move-result-object v0

    invoke-direct {p0, v0}, Lk58;-><init>(LV78;)V

    return-void
.end method

.method public synthetic constructor <init>(Lum8;)V
    .locals 0

    invoke-static {}, LyA8;->I()LyA8;

    move-result-object p1

    invoke-direct {p0, p1}, Lk58;-><init>(LV78;)V

    return-void
.end method


# virtual methods
.method public final o(LB68;)Lvt8;
    .locals 1

    invoke-virtual {p0}, Lk58;->m()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LyA8;

    invoke-virtual {p1}, Lk58;->j()LV78;

    move-result-object p1

    check-cast p1, LHe8;

    invoke-static {v0, p1}, LyA8;->J(LyA8;LHe8;)V

    return-object p0
.end method

.method public final p(LgZ7;)Lvt8;
    .locals 1

    invoke-virtual {p0}, Lk58;->m()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LyA8;

    invoke-static {v0, p1}, LyA8;->K(LyA8;LgZ7;)V

    return-object p0
.end method
