.class public LHX2;
.super LGP5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LGP5<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, LGP5;-><init>(Ljava/lang/Object;Z)V

    return-void
.end method

.method public static h(Ljava/lang/Object;)LHX2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "LHX2<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LHX2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LHX2;-><init>(Ljava/lang/Object;Z)V

    return-object v0
.end method


# virtual methods
.method public g(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, LGP5;->e(Ljava/lang/Object;)V

    return-void
.end method
