.class public final LJQ7;
.super LqO7;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, LqO7;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)LGO7;
    .locals 0

    invoke-super {p0, p1}, LqO7;->b(Ljava/lang/Object;)LqO7;

    return-object p0
.end method

.method public final e(Ljava/lang/Object;)LJQ7;
    .locals 0

    invoke-super {p0, p1}, LqO7;->b(Ljava/lang/Object;)LqO7;

    return-object p0
.end method

.method public final f(Ljava/lang/Iterable;)LJQ7;
    .locals 0

    invoke-super {p0, p1}, LqO7;->c(Ljava/lang/Iterable;)LGO7;

    return-object p0
.end method

.method public final g()LDR7;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LqO7;->c:Z

    iget-object v0, p0, LqO7;->a:[Ljava/lang/Object;

    iget v1, p0, LqO7;->b:I

    invoke-static {v0, v1}, LDR7;->j([Ljava/lang/Object;I)LDR7;

    move-result-object v0

    return-object v0
.end method
