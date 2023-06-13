.class public Lvq2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvq2$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lvq2$a;LOs0;)Ltq2;
    .locals 0

    invoke-static {p0, p1, p2}, Lvq2;->d(Ljava/lang/String;Lvq2$a;LOs0;)Ltq2;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)LEs0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "LEs0<",
            "*>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ltq2;->a(Ljava/lang/String;Ljava/lang/String;)Ltq2;

    move-result-object p0

    const-class p1, Ltq2;

    invoke-static {p0, p1}, LEs0;->l(Ljava/lang/Object;Ljava/lang/Class;)LEs0;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;Lvq2$a;)LEs0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lvq2$a<",
            "Landroid/content/Context;",
            ">;)",
            "LEs0<",
            "*>;"
        }
    .end annotation

    const-class v0, Ltq2;

    invoke-static {v0}, LEs0;->m(Ljava/lang/Class;)LEs0$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v1

    invoke-virtual {v0, v1}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v0

    new-instance v1, Luq2;

    invoke-direct {v1, p0, p1}, Luq2;-><init>(Ljava/lang/String;Lvq2$a;)V

    invoke-virtual {v0, v1}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object p0

    invoke-virtual {p0}, LEs0$b;->d()LEs0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Lvq2$a;LOs0;)Ltq2;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p2, v0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-interface {p1, p2}, Lvq2$a;->extract(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Ltq2;->a(Ljava/lang/String;Ljava/lang/String;)Ltq2;

    move-result-object p0

    return-object p0
.end method
