.class public final LqK2$b;
.super LP0$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LqK2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LP0$a<",
        "TK;TV;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, LP0$a;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(ILqK2$a;)V
    .locals 0

    invoke-direct {p0, p1}, LqK2$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public b()LqK2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LqK2<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LqK2;

    iget-object v1, p0, LP0$a;->a:Ljava/util/LinkedHashMap;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LqK2;-><init>(Ljava/util/Map;LqK2$a;)V

    return-object v0
.end method

.method public c(Ljava/lang/Object;LY94;)LqK2$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "LY94<",
            "TV;>;)",
            "LqK2$b<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, LP0$a;->a(Ljava/lang/Object;LY94;)LP0$a;

    return-object p0
.end method
