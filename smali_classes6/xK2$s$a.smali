.class public final LxK2$s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxK2$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxK2$s;
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
        "LxK2$s<",
        "TK;TV;>;",
        "LxK2$t<",
        "TK;TV;>;>;"
    }
.end annotation


# static fields
.field public static final a:LxK2$s$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LxK2$s$a<",
            "**>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LxK2$s$a;

    invoke-direct {v0}, LxK2$s$a;-><init>()V

    sput-object v0, LxK2$s$a;->a:LxK2$s$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static h()LxK2$s$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "LxK2$s$a<",
            "TK;TV;>;"
        }
    .end annotation

    sget-object v0, LxK2$s$a;->a:LxK2$s$a;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(LxK2$n;LxK2$i;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LxK2$t;

    check-cast p2, LxK2$s;

    invoke-virtual {p0, p1, p2, p3}, LxK2$s$a;->k(LxK2$t;LxK2$s;Ljava/lang/Object;)V

    return-void
.end method

.method public b()LxK2$p;
    .locals 1

    sget-object v0, LxK2$p;->b:LxK2$p;

    return-object v0
.end method

.method public bridge synthetic c(LxK2;II)LxK2$n;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LxK2$s$a;->j(LxK2;II)LxK2$t;

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

    check-cast p1, LxK2$t;

    check-cast p4, LxK2$s;

    invoke-virtual {p0, p1, p2, p3, p4}, LxK2$s$a;->i(LxK2$t;Ljava/lang/Object;ILxK2$s;)LxK2$s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(LxK2$n;LxK2$i;LxK2$i;)LxK2$i;
    .locals 0

    check-cast p1, LxK2$t;

    check-cast p2, LxK2$s;

    check-cast p3, LxK2$s;

    invoke-virtual {p0, p1, p2, p3}, LxK2$s$a;->g(LxK2$t;LxK2$s;LxK2$s;)LxK2$s;

    move-result-object p1

    return-object p1
.end method

.method public g(LxK2$t;LxK2$s;LxK2$s;)LxK2$s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2$t<",
            "TK;TV;>;",
            "LxK2$s<",
            "TK;TV;>;",
            "LxK2$s<",
            "TK;TV;>;)",
            "LxK2$s<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-static {p2}, LxK2$n;->n(LxK2$i;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1}, LxK2$t;->H(LxK2$t;)Ljava/lang/ref/ReferenceQueue;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, LxK2$s;->d(Ljava/lang/ref/ReferenceQueue;LxK2$s;)LxK2$s;

    move-result-object p1

    return-object p1
.end method

.method public i(LxK2$t;Ljava/lang/Object;ILxK2$s;)LxK2$s;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2$t<",
            "TK;TV;>;TK;I",
            "LxK2$s<",
            "TK;TV;>;)",
            "LxK2$s<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance p1, LxK2$s;

    invoke-direct {p1, p2, p3, p4}, LxK2$s;-><init>(Ljava/lang/Object;ILxK2$s;)V

    return-object p1
.end method

.method public j(LxK2;II)LxK2$t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2<",
            "TK;TV;",
            "LxK2$s<",
            "TK;TV;>;",
            "LxK2$t<",
            "TK;TV;>;>;II)",
            "LxK2$t<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LxK2$t;

    invoke-direct {v0, p1, p2, p3}, LxK2$t;-><init>(LxK2;II)V

    return-object v0
.end method

.method public k(LxK2$t;LxK2$s;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2$t<",
            "TK;TV;>;",
            "LxK2$s<",
            "TK;TV;>;TV;)V"
        }
    .end annotation

    invoke-static {p1}, LxK2$t;->H(LxK2$t;)Ljava/lang/ref/ReferenceQueue;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, LxK2$s;->e(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    return-void
.end method
