.class public final LMb7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LLb7;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LRc7;Ljava/lang/Object;LRc7;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LLb7;

    invoke-direct {v0, p1, p2, p3, p4}, LLb7;-><init>(LRc7;Ljava/lang/Object;LRc7;Ljava/lang/Object;)V

    iput-object v0, p0, LMb7;->a:LLb7;

    iput-object p2, p0, LMb7;->b:Ljava/lang/Object;

    iput-object p4, p0, LMb7;->c:Ljava/lang/Object;

    return-void
.end method

.method public static b(LLb7;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, LLb7;->a:LRc7;

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, LTa7;->a(LRc7;ILjava/lang/Object;)I

    move-result p1

    iget-object p0, p0, LLb7;->c:LRc7;

    const/4 v0, 0x2

    invoke-static {p0, v0, p2}, LTa7;->a(LRc7;ILjava/lang/Object;)I

    move-result p0

    add-int/2addr p1, p0

    return p1
.end method

.method public static d(LRc7;Ljava/lang/Object;LRc7;Ljava/lang/Object;)LMb7;
    .locals 1

    new-instance v0, LMb7;

    invoke-direct {v0, p0, p1, p2, p3}, LMb7;-><init>(LRc7;Ljava/lang/Object;LRc7;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static e(LJa7;LLb7;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p1, LLb7;->a:LRc7;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, p2}, LTa7;->k(LJa7;LRc7;ILjava/lang/Object;)V

    iget-object p1, p1, LLb7;->c:LRc7;

    const/4 p2, 0x2

    invoke-static {p0, p1, p2, p3}, LTa7;->k(LJa7;LRc7;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    sget-object v0, LJa7;->b:Ljava/util/logging/Logger;

    iget-object v0, p0, LMb7;->a:LLb7;

    invoke-static {v0, p2, p3}, LMb7;->b(LLb7;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, LJa7;->a(I)I

    move-result p3

    add-int/2addr p3, p2

    shl-int/lit8 p1, p1, 0x3

    invoke-static {p1}, LJa7;->a(I)I

    move-result p1

    add-int/2addr p1, p3

    return p1
.end method

.method public final c()LLb7;
    .locals 1

    iget-object v0, p0, LMb7;->a:LLb7;

    return-object v0
.end method
