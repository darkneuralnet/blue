.class public final LoZ6;
.super Lab7;
.source "SourceFile"

# interfaces
.implements LUb7;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LuZ6;->G()LuZ6;

    move-result-object v0

    invoke-direct {p0, v0}, Lab7;-><init>(Lfb7;)V

    return-void
.end method

.method public synthetic constructor <init>(LmZ6;)V
    .locals 0

    invoke-static {}, LuZ6;->G()LuZ6;

    move-result-object p1

    invoke-direct {p0, p1}, Lab7;-><init>(Lfb7;)V

    return-void
.end method


# virtual methods
.method public final t(LQ07;)LoZ6;
    .locals 1

    invoke-virtual {p0}, Lab7;->q()V

    iget-object v0, p0, Lab7;->c:Lfb7;

    check-cast v0, LuZ6;

    invoke-virtual {p1}, Lab7;->o()Lfb7;

    move-result-object p1

    check-cast p1, LW07;

    invoke-static {v0, p1}, LuZ6;->I(LuZ6;LW07;)V

    return-object p0
.end method

.method public final w(LA27;)LoZ6;
    .locals 1

    invoke-virtual {p0}, Lab7;->q()V

    iget-object v0, p0, Lab7;->c:Lfb7;

    check-cast v0, LuZ6;

    invoke-virtual {p1}, Lab7;->o()Lfb7;

    move-result-object p1

    check-cast p1, LF27;

    invoke-static {v0, p1}, LuZ6;->H(LuZ6;LF27;)V

    return-object p0
.end method
