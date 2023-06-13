.class public final LxK2$y$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxK2$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxK2$y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LxK2$j<",
        "TK;TV;",
        "LxK2$y<",
        "TK;TV;>;",
        "LxK2$z<",
        "TK;TV;>;>;"
    }
.end annotation


# static fields
.field public static final a:LxK2$y$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LxK2$y$a<",
            "**>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LxK2$y$a;

    invoke-direct {v0}, LxK2$y$a;-><init>()V

    sput-object v0, LxK2$y$a;->a:LxK2$y$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static h()LxK2$y$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "LxK2$y$a<",
            "TK;TV;>;"
        }
    .end annotation

    sget-object v0, LxK2$y$a;->a:LxK2$y$a;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(LxK2$n;LxK2$i;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LxK2$z;

    check-cast p2, LxK2$y;

    invoke-virtual {p0, p1, p2, p3}, LxK2$y$a;->k(LxK2$z;LxK2$y;Ljava/lang/Object;)V

    return-void
.end method

.method public b()LxK2$p;
    .locals 1

    sget-object v0, LxK2$p;->c:LxK2$p;

    return-object v0
.end method

.method public bridge synthetic c(LxK2;II)LxK2$n;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LxK2$y$a;->j(LxK2;II)LxK2$z;

    move-result-object p1

    return-object p1
.end method

.method public d()LxK2$p;
    .locals 1

    sget-object v0, LxK2$p;->c:LxK2$p;

    return-object v0
.end method

.method public bridge synthetic e(LxK2$n;Ljava/lang/Object;ILxK2$i;)LxK2$i;
    .locals 0

    check-cast p1, LxK2$z;

    check-cast p4, LxK2$y;

    invoke-virtual {p0, p1, p2, p3, p4}, LxK2$y$a;->i(LxK2$z;Ljava/lang/Object;ILxK2$y;)LxK2$y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(LxK2$n;LxK2$i;LxK2$i;)LxK2$i;
    .locals 0

    check-cast p1, LxK2$z;

    check-cast p2, LxK2$y;

    check-cast p3, LxK2$y;

    invoke-virtual {p0, p1, p2, p3}, LxK2$y$a;->g(LxK2$z;LxK2$y;LxK2$y;)LxK2$y;

    move-result-object p1

    return-object p1
.end method

.method public g(LxK2$z;LxK2$y;LxK2$y;)LxK2$y;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2$z<",
            "TK;TV;>;",
            "LxK2$y<",
            "TK;TV;>;",
            "LxK2$y<",
            "TK;TV;>;)",
            "LxK2$y<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p2}, LxK2$d;->getKey()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {p2}, LxK2$n;->n(LxK2$i;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    invoke-static {p1}, LxK2$z;->H(LxK2$z;)Ljava/lang/ref/ReferenceQueue;

    move-result-object v0

    invoke-static {p1}, LxK2$z;->I(LxK2$z;)Ljava/lang/ref/ReferenceQueue;

    move-result-object p1

    invoke-virtual {p2, v0, p1, p3}, LxK2$y;->d(Ljava/lang/ref/ReferenceQueue;Ljava/lang/ref/ReferenceQueue;LxK2$y;)LxK2$y;

    move-result-object p1

    return-object p1
.end method

.method public i(LxK2$z;Ljava/lang/Object;ILxK2$y;)LxK2$y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2$z<",
            "TK;TV;>;TK;I",
            "LxK2$y<",
            "TK;TV;>;)",
            "LxK2$y<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LxK2$y;

    invoke-static {p1}, LxK2$z;->H(LxK2$z;)Ljava/lang/ref/ReferenceQueue;

    move-result-object p1

    invoke-direct {v0, p1, p2, p3, p4}, LxK2$y;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILxK2$y;)V

    return-object v0
.end method

.method public j(LxK2;II)LxK2$z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2<",
            "TK;TV;",
            "LxK2$y<",
            "TK;TV;>;",
            "LxK2$z<",
            "TK;TV;>;>;II)",
            "LxK2$z<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LxK2$z;

    invoke-direct {v0, p1, p2, p3}, LxK2$z;-><init>(LxK2;II)V

    return-object v0
.end method

.method public k(LxK2$z;LxK2$y;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2$z<",
            "TK;TV;>;",
            "LxK2$y<",
            "TK;TV;>;TV;)V"
        }
    .end annotation

    invoke-static {p1}, LxK2$z;->I(LxK2$z;)Ljava/lang/ref/ReferenceQueue;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, LxK2$y;->e(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    return-void
.end method
