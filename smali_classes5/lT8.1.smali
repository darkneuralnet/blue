.class public final LlT8;
.super LES8;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, LES8;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)LlT8;
    .locals 0

    invoke-super {p0, p1}, LES8;->a(Ljava/lang/Object;)LES8;

    return-object p0
.end method

.method public final d()LvU8;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LES8;->c:Z

    iget-object v0, p0, LES8;->a:[Ljava/lang/Object;

    iget v1, p0, LES8;->b:I

    invoke-static {v0, v1}, LvU8;->o([Ljava/lang/Object;I)LvU8;

    move-result-object v0

    return-object v0
.end method
