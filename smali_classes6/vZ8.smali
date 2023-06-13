.class public final LvZ8;
.super Lk58;
.source "SourceFile"

# interfaces
.implements Lrj8;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LU49;->I()LU49;

    move-result-object v0

    invoke-direct {p0, v0}, Lk58;-><init>(LV78;)V

    return-void
.end method

.method public synthetic constructor <init>(LGT8;)V
    .locals 0

    invoke-static {}, LU49;->I()LU49;

    move-result-object p1

    invoke-direct {p0, p1}, Lk58;-><init>(LV78;)V

    return-void
.end method


# virtual methods
.method public final o(LgZ7;)LvZ8;
    .locals 1

    invoke-virtual {p0}, Lk58;->m()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LU49;

    invoke-static {v0, p1}, LU49;->K(LU49;LgZ7;)V

    return-object p0
.end method

.method public final p(LgZ7;)LvZ8;
    .locals 1

    invoke-virtual {p0}, Lk58;->m()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LU49;

    invoke-static {v0, p1}, LU49;->J(LU49;LgZ7;)V

    return-object p0
.end method
