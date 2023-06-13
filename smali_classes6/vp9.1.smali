.class public final Lvp9;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ltp9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltp9<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LRs9;Ljava/lang/Object;LRs9;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRs9;",
            "TK;",
            "LRs9;",
            "TV;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ltp9;

    invoke-direct {v0, p1, p2, p3, p4}, Ltp9;-><init>(LRs9;Ljava/lang/Object;LRs9;Ljava/lang/Object;)V

    iput-object v0, p0, Lvp9;->a:Ltp9;

    iput-object p2, p0, Lvp9;->b:Ljava/lang/Object;

    iput-object p4, p0, Lvp9;->c:Ljava/lang/Object;

    return-void
.end method

.method public static b(Ltp9;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ltp9<",
            "TK;TV;>;TK;TV;)I"
        }
    .end annotation

    iget-object v0, p0, Ltp9;->a:LRs9;

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, LVk9;->a(LRs9;ILjava/lang/Object;)I

    move-result p1

    iget-object p0, p0, Ltp9;->c:LRs9;

    const/4 v0, 0x2

    invoke-static {p0, v0, p2}, LVk9;->a(LRs9;ILjava/lang/Object;)I

    move-result p0

    add-int/2addr p1, p0

    return p1
.end method

.method public static d(LRs9;Ljava/lang/Object;LRs9;Ljava/lang/Object;)Lvp9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "LRs9;",
            "TK;",
            "LRs9;",
            "TV;)",
            "Lvp9<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lvp9;

    invoke-direct {v0, p0, p1, p2, p3}, Lvp9;-><init>(LRs9;Ljava/lang/Object;LRs9;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static e(Lrj9;Ltp9;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lrj9;",
            "Ltp9<",
            "TK;TV;>;TK;TV;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p1, Ltp9;->a:LRs9;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, p2}, LVk9;->e(Lrj9;LRs9;ILjava/lang/Object;)V

    iget-object p1, p1, Ltp9;->c:LRs9;

    const/4 p2, 0x2

    invoke-static {p0, p1, p2, p3}, LVk9;->e(Lrj9;LRs9;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITK;TV;)I"
        }
    .end annotation

    invoke-static {p1}, Lrj9;->k(I)I

    move-result p1

    iget-object v0, p0, Lvp9;->a:Ltp9;

    invoke-static {v0, p2, p3}, Lvp9;->b(Ltp9;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Lrj9;->l(I)I

    move-result p3

    add-int/2addr p3, p2

    add-int/2addr p1, p3

    return p1
.end method

.method public final c()Ltp9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ltp9<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lvp9;->a:Ltp9;

    return-object v0
.end method
