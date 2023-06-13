.class public final LxK2$q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxK2$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxK2$q;
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
        "LxK2$q<",
        "TK;TV;>;",
        "LxK2$r<",
        "TK;TV;>;>;"
    }
.end annotation


# static fields
.field public static final a:LxK2$q$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LxK2$q$a<",
            "**>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LxK2$q$a;

    invoke-direct {v0}, LxK2$q$a;-><init>()V

    sput-object v0, LxK2$q$a;->a:LxK2$q$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static h()LxK2$q$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "LxK2$q$a<",
            "TK;TV;>;"
        }
    .end annotation

    sget-object v0, LxK2$q$a;->a:LxK2$q$a;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(LxK2$n;LxK2$i;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LxK2$r;

    check-cast p2, LxK2$q;

    invoke-virtual {p0, p1, p2, p3}, LxK2$q$a;->k(LxK2$r;LxK2$q;Ljava/lang/Object;)V

    return-void
.end method

.method public b()LxK2$p;
    .locals 1

    sget-object v0, LxK2$p;->b:LxK2$p;

    return-object v0
.end method

.method public bridge synthetic c(LxK2;II)LxK2$n;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LxK2$q$a;->j(LxK2;II)LxK2$r;

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

    check-cast p1, LxK2$r;

    check-cast p4, LxK2$q;

    invoke-virtual {p0, p1, p2, p3, p4}, LxK2$q$a;->i(LxK2$r;Ljava/lang/Object;ILxK2$q;)LxK2$q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(LxK2$n;LxK2$i;LxK2$i;)LxK2$i;
    .locals 0

    check-cast p1, LxK2$r;

    check-cast p2, LxK2$q;

    check-cast p3, LxK2$q;

    invoke-virtual {p0, p1, p2, p3}, LxK2$q$a;->g(LxK2$r;LxK2$q;LxK2$q;)LxK2$q;

    move-result-object p1

    return-object p1
.end method

.method public g(LxK2$r;LxK2$q;LxK2$q;)LxK2$q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2$r<",
            "TK;TV;>;",
            "LxK2$q<",
            "TK;TV;>;",
            "LxK2$q<",
            "TK;TV;>;)",
            "LxK2$q<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p2, p3}, LxK2$q;->d(LxK2$q;)LxK2$q;

    move-result-object p1

    return-object p1
.end method

.method public i(LxK2$r;Ljava/lang/Object;ILxK2$q;)LxK2$q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2$r<",
            "TK;TV;>;TK;I",
            "LxK2$q<",
            "TK;TV;>;)",
            "LxK2$q<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance p1, LxK2$q;

    invoke-direct {p1, p2, p3, p4}, LxK2$q;-><init>(Ljava/lang/Object;ILxK2$q;)V

    return-object p1
.end method

.method public j(LxK2;II)LxK2$r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2<",
            "TK;TV;",
            "LxK2$q<",
            "TK;TV;>;",
            "LxK2$r<",
            "TK;TV;>;>;II)",
            "LxK2$r<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LxK2$r;

    invoke-direct {v0, p1, p2, p3}, LxK2$r;-><init>(LxK2;II)V

    return-object v0
.end method

.method public k(LxK2$r;LxK2$q;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2$r<",
            "TK;TV;>;",
            "LxK2$q<",
            "TK;TV;>;TV;)V"
        }
    .end annotation

    invoke-virtual {p2, p3}, LxK2$q;->e(Ljava/lang/Object;)V

    return-void
.end method
