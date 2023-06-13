.class public final LDk8;
.super LUS8;
.source "SourceFile"

# interfaces
.implements LA19;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LPk8;->C()LPk8;

    move-result-object v0

    invoke-direct {p0, v0}, LUS8;-><init>(LpU8;)V

    return-void
.end method

.method public synthetic constructor <init>(LXh8;)V
    .locals 0

    invoke-static {}, LPk8;->C()LPk8;

    move-result-object p1

    invoke-direct {p0, p1}, LUS8;-><init>(LpU8;)V

    return-void
.end method


# virtual methods
.method public final y(J)LDk8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LPk8;

    invoke-static {v0, p1, p2}, LPk8;->E(LPk8;J)V

    return-object p0
.end method

.method public final z(Ljava/lang/String;)LDk8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LPk8;

    invoke-static {v0, p1}, LPk8;->D(LPk8;Ljava/lang/String;)V

    return-object p0
.end method
