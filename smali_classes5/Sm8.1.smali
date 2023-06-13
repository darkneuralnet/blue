.class public final LSm8;
.super LUS8;
.source "SourceFile"

# interfaces
.implements LA19;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lfn8;->C()Lfn8;

    move-result-object v0

    invoke-direct {p0, v0}, LUS8;-><init>(LpU8;)V

    return-void
.end method

.method public synthetic constructor <init>(LXh8;)V
    .locals 0

    invoke-static {}, Lfn8;->C()Lfn8;

    move-result-object p1

    invoke-direct {p0, p1}, LUS8;-><init>(LpU8;)V

    return-void
.end method


# virtual methods
.method public final y(Lqn8;)LSm8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lfn8;

    invoke-virtual {p1}, LUS8;->q()LpU8;

    move-result-object p1

    check-cast p1, LCn8;

    invoke-static {v0, p1}, Lfn8;->F(Lfn8;LCn8;)V

    return-object p0
.end method

.method public final z(I)LCn8;
    .locals 1

    iget-object p1, p0, LUS8;->c:LpU8;

    check-cast p1, Lfn8;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lfn8;->D(I)LCn8;

    move-result-object p1

    return-object p1
.end method
