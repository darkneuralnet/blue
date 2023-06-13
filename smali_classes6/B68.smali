.class public final LB68;
.super Lk58;
.source "SourceFile"

# interfaces
.implements Lrj8;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LHe8;->I()LHe8;

    move-result-object v0

    invoke-direct {p0, v0}, Lk58;-><init>(LV78;)V

    return-void
.end method

.method public synthetic constructor <init>(LrY7;)V
    .locals 0

    invoke-static {}, LHe8;->I()LHe8;

    move-result-object p1

    invoke-direct {p0, p1}, Lk58;-><init>(LV78;)V

    return-void
.end method


# virtual methods
.method public final o(LwC7;)LB68;
    .locals 1

    invoke-virtual {p0}, Lk58;->m()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LHe8;

    invoke-virtual {p1}, Lk58;->j()LV78;

    move-result-object p1

    check-cast p1, LiQ7;

    invoke-static {v0, p1}, LHe8;->J(LHe8;LiQ7;)V

    return-object p0
.end method
