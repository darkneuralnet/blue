.class public Lsg5;
.super LM;
.source "SourceFile"


# instance fields
.field public final b:LK;

.field public final c:LG9;


# direct methods
.method public constructor <init>(LG9;)V
    .locals 3

    invoke-direct {p0}, LM;-><init>()V

    new-instance v0, LK;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, LK;-><init>(J)V

    iput-object v0, p0, Lsg5;->b:LK;

    iput-object p1, p0, Lsg5;->c:LG9;

    return-void
.end method

.method public constructor <init>(LU;)V
    .locals 1

    invoke-direct {p0}, LM;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v0

    invoke-static {v0}, LK;->A(Ljava/lang/Object;)LK;

    move-result-object v0

    iput-object v0, p0, Lsg5;->b:LK;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object p1

    invoke-static {p1}, LG9;->o(Ljava/lang/Object;)LG9;

    move-result-object p1

    iput-object p1, p0, Lsg5;->c:LG9;

    return-void
.end method

.method public static final j(Ljava/lang/Object;)Lsg5;
    .locals 1

    instance-of v0, p0, Lsg5;

    if-eqz v0, :cond_0

    check-cast p0, Lsg5;

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, Lsg5;

    invoke-static {p0}, LU;->z(Ljava/lang/Object;)LU;

    move-result-object p0

    invoke-direct {v0, p0}, Lsg5;-><init>(LU;)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public c()LS;
    .locals 2

    new-instance v0, LF;

    invoke-direct {v0}, LF;-><init>()V

    iget-object v1, p0, Lsg5;->b:LK;

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    iget-object v1, p0, Lsg5;->c:LG9;

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LZF0;

    invoke-direct {v1, v0}, LZF0;-><init>(LF;)V

    return-object v1
.end method

.method public o()LG9;
    .locals 1

    iget-object v0, p0, Lsg5;->c:LG9;

    return-object v0
.end method
