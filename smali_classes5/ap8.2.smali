.class public final Lap8;
.super LUS8;
.source "SourceFile"

# interfaces
.implements LA19;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lmp8;->F()Lmp8;

    move-result-object v0

    invoke-direct {p0, v0}, LUS8;-><init>(LpU8;)V

    return-void
.end method

.method public synthetic constructor <init>(LXh8;)V
    .locals 0

    invoke-static {}, Lmp8;->F()Lmp8;

    move-result-object p1

    invoke-direct {p0, p1}, LUS8;-><init>(LpU8;)V

    return-void
.end method


# virtual methods
.method public final y(Ljava/lang/Iterable;)Lap8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lmp8;

    invoke-static {v0, p1}, Lmp8;->I(Lmp8;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final z(I)Lap8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lmp8;

    invoke-static {v0, p1}, Lmp8;->H(Lmp8;I)V

    return-object p0
.end method