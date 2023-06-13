.class public final LFN8;
.super Lk58;
.source "SourceFile"

# interfaces
.implements Lrj8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk58<",
        "LBy;",
        "LFN8;",
        ">;",
        "Lrj8;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LBy;->I()LBy;

    move-result-object v0

    invoke-direct {p0, v0}, Lk58;-><init>(LV78;)V

    return-void
.end method

.method public synthetic constructor <init>(LdH8;)V
    .locals 0

    invoke-static {}, LBy;->I()LBy;

    move-result-object p1

    invoke-direct {p0, p1}, Lk58;-><init>(LV78;)V

    return-void
.end method


# virtual methods
.method public final o(Lvt8;)LFN8;
    .locals 1

    invoke-virtual {p0}, Lk58;->m()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LBy;

    invoke-virtual {p1}, Lk58;->j()LV78;

    move-result-object p1

    check-cast p1, LyA8;

    invoke-static {v0, p1}, LBy;->J(LBy;LyA8;)V

    return-object p0
.end method

.method public final p(LvZ8;)LFN8;
    .locals 1

    invoke-virtual {p0}, Lk58;->m()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LBy;

    invoke-virtual {p1}, Lk58;->j()LV78;

    move-result-object p1

    check-cast p1, LU49;

    invoke-static {v0, p1}, LBy;->K(LBy;LU49;)V

    return-object p0
.end method
