.class public final LxK2$w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxK2$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxK2$w;
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
        "LxK2$w<",
        "TK;TV;>;",
        "LxK2$x<",
        "TK;TV;>;>;"
    }
.end annotation


# static fields
.field public static final a:LxK2$w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LxK2$w$a<",
            "**>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LxK2$w$a;

    invoke-direct {v0}, LxK2$w$a;-><init>()V

    sput-object v0, LxK2$w$a;->a:LxK2$w$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static h()LxK2$w$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "LxK2$w$a<",
            "TK;TV;>;"
        }
    .end annotation

    sget-object v0, LxK2$w$a;->a:LxK2$w$a;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(LxK2$n;LxK2$i;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LxK2$x;

    check-cast p2, LxK2$w;

    invoke-virtual {p0, p1, p2, p3}, LxK2$w$a;->k(LxK2$x;LxK2$w;Ljava/lang/Object;)V

    return-void
.end method

.method public b()LxK2$p;
    .locals 1

    sget-object v0, LxK2$p;->c:LxK2$p;

    return-object v0
.end method

.method public bridge synthetic c(LxK2;II)LxK2$n;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LxK2$w$a;->j(LxK2;II)LxK2$x;

    move-result-object p1

    return-object p1
.end method

.method public d()LxK2$p;
    .locals 1

    sget-object v0, LxK2$p;->b:LxK2$p;

    return-object v0
.end method

.method public bridge synthetic e(LxK2$n;Ljava/lang/Object;ILxK2$i;)LxK2$i;
    .locals 0

    check-cast p1, LxK2$x;

    check-cast p4, LxK2$w;

    invoke-virtual {p0, p1, p2, p3, p4}, LxK2$w$a;->i(LxK2$x;Ljava/lang/Object;ILxK2$w;)LxK2$w;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(LxK2$n;LxK2$i;LxK2$i;)LxK2$i;
    .locals 0

    check-cast p1, LxK2$x;

    check-cast p2, LxK2$w;

    check-cast p3, LxK2$w;

    invoke-virtual {p0, p1, p2, p3}, LxK2$w$a;->g(LxK2$x;LxK2$w;LxK2$w;)LxK2$w;

    move-result-object p1

    return-object p1
.end method

.method public g(LxK2$x;LxK2$w;LxK2$w;)LxK2$w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2$x<",
            "TK;TV;>;",
            "LxK2$w<",
            "TK;TV;>;",
            "LxK2$w<",
            "TK;TV;>;)",
            "LxK2$w<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p2}, LxK2$d;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1}, LxK2$x;->H(LxK2$x;)Ljava/lang/ref/ReferenceQueue;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, LxK2$w;->d(Ljava/lang/ref/ReferenceQueue;LxK2$w;)LxK2$w;

    move-result-object p1

    return-object p1
.end method

.method public i(LxK2$x;Ljava/lang/Object;ILxK2$w;)LxK2$w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2$x<",
            "TK;TV;>;TK;I",
            "LxK2$w<",
            "TK;TV;>;)",
            "LxK2$w<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LxK2$w;

    invoke-static {p1}, LxK2$x;->H(LxK2$x;)Ljava/lang/ref/ReferenceQueue;

    move-result-object p1

    invoke-direct {v0, p1, p2, p3, p4}, LxK2$w;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILxK2$w;)V

    return-object v0
.end method

.method public j(LxK2;II)LxK2$x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2<",
            "TK;TV;",
            "LxK2$w<",
            "TK;TV;>;",
            "LxK2$x<",
            "TK;TV;>;>;II)",
            "LxK2$x<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LxK2$x;

    invoke-direct {v0, p1, p2, p3}, LxK2$x;-><init>(LxK2;II)V

    return-object v0
.end method

.method public k(LxK2$x;LxK2$w;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2$x<",
            "TK;TV;>;",
            "LxK2$w<",
            "TK;TV;>;TV;)V"
        }
    .end annotation

    invoke-virtual {p2, p3}, LxK2$w;->e(Ljava/lang/Object;)V

    return-void
.end method
