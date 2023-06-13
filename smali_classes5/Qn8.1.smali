.class public final LQn8;
.super LUS8;
.source "SourceFile"

# interfaces
.implements LA19;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lpo8;->C()Lpo8;

    move-result-object v0

    invoke-direct {p0, v0}, LUS8;-><init>(LpU8;)V

    return-void
.end method

.method public synthetic constructor <init>(LXh8;)V
    .locals 0

    invoke-static {}, Lpo8;->C()Lpo8;

    move-result-object p1

    invoke-direct {p0, p1}, LUS8;-><init>(LpU8;)V

    return-void
.end method


# virtual methods
.method public final y(LDk8;)LQn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpo8;

    invoke-virtual {p1}, LUS8;->q()LpU8;

    move-result-object p1

    check-cast p1, LPk8;

    invoke-static {v0, p1}, Lpo8;->D(Lpo8;LPk8;)V

    return-object p0
.end method
