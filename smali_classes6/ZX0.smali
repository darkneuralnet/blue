.class public LZX0;
.super Lfj2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lfj2<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lej2;)V
    .locals 0

    invoke-direct {p0, p1}, Lfj2;-><init>(Lej2;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LHg2;

    invoke-virtual {p1, p2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    new-instance v0, LHg2;

    invoke-direct {v0}, LHg2;-><init>()V

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    new-instance v0, LLg2;

    invoke-direct {v0}, LLg2;-><init>()V

    return-object v0
.end method

.method public e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LLg2;

    invoke-virtual {p1, p2, p3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public f(Ljava/lang/String;)Lfj2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lfj2<",
            "LKg2;",
            ">;"
        }
    .end annotation

    iget-object p1, p0, Lfj2;->a:Lej2;

    iget-object p1, p1, Lej2;->b:Lfj2;

    return-object p1
.end method

.method public g(Ljava/lang/String;)Lfj2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lfj2<",
            "LKg2;",
            ">;"
        }
    .end annotation

    iget-object p1, p0, Lfj2;->a:Lej2;

    iget-object p1, p1, Lej2;->b:Lfj2;

    return-object p1
.end method
