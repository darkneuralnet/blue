.class public final Luj1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luj1$e;,
        Luj1$f;,
        Luj1$g;,
        Luj1$d;
    }
.end annotation


# static fields
.field public static final a:Luj1$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Luj1$g<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Luj1$a;

    invoke-direct {v0}, Luj1$a;-><init>()V

    sput-object v0, Luj1;->a:Luj1$g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LgY3;Luj1$d;)LgY3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Luj1$f;",
            ">(",
            "LgY3<",
            "TT;>;",
            "Luj1$d<",
            "TT;>;)",
            "LgY3<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Luj1;->c()Luj1$g;

    move-result-object v0

    invoke-static {p0, p1, v0}, Luj1;->b(LgY3;Luj1$d;Luj1$g;)LgY3;

    move-result-object p0

    return-object p0
.end method

.method public static b(LgY3;Luj1$d;Luj1$g;)LgY3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LgY3<",
            "TT;>;",
            "Luj1$d<",
            "TT;>;",
            "Luj1$g<",
            "TT;>;)",
            "LgY3<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Luj1$e;

    invoke-direct {v0, p0, p1, p2}, Luj1$e;-><init>(LgY3;Luj1$d;Luj1$g;)V

    return-object v0
.end method

.method public static c()Luj1$g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Luj1$g<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Luj1;->a:Luj1$g;

    return-object v0
.end method

.method public static d(ILuj1$d;)LgY3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Luj1$f;",
            ">(I",
            "Luj1$d<",
            "TT;>;)",
            "LgY3<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LkY3;

    invoke-direct {v0, p0}, LkY3;-><init>(I)V

    invoke-static {v0, p1}, Luj1;->a(LgY3;Luj1$d;)LgY3;

    move-result-object p0

    return-object p0
.end method

.method public static e()LgY3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "LgY3<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    const/16 v0, 0x14

    invoke-static {v0}, Luj1;->f(I)LgY3;

    move-result-object v0

    return-object v0
.end method

.method public static f(I)LgY3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I)",
            "LgY3<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, LkY3;

    invoke-direct {v0, p0}, LkY3;-><init>(I)V

    new-instance p0, Luj1$b;

    invoke-direct {p0}, Luj1$b;-><init>()V

    new-instance v1, Luj1$c;

    invoke-direct {v1}, Luj1$c;-><init>()V

    invoke-static {v0, p0, v1}, Luj1;->b(LgY3;Luj1$d;Luj1$g;)LgY3;

    move-result-object p0

    return-object p0
.end method
