.class public final LCb0;
.super LYW2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCb0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYW2<",
        "LBb0;",
        ">;"
    }
.end annotation


# direct methods
.method public varargs constructor <init>([LBb0;)V
    .locals 0

    invoke-direct {p0}, LYW2;-><init>()V

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LYW2;->a(Ljava/util/List;)V

    return-void
.end method

.method public static e()LCb0;
    .locals 2

    new-instance v0, LCb0;

    const/4 v1, 0x0

    new-array v1, v1, [LBb0;

    invoke-direct {v0, v1}, LCb0;-><init>([LBb0;)V

    return-object v0
.end method


# virtual methods
.method public b()LYW2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYW2<",
            "LBb0;",
            ">;"
        }
    .end annotation

    invoke-static {}, LCb0;->e()LCb0;

    move-result-object v0

    invoke-virtual {p0}, LYW2;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LYW2;->a(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LCb0;->b()LYW2;

    move-result-object v0

    return-object v0
.end method

.method public d()LCb0$a;
    .locals 2

    new-instance v0, LCb0$a;

    invoke-virtual {p0}, LYW2;->c()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, LCb0$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method
