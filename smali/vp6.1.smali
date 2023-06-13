.class public abstract Lvp6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvp6$a;,
        Lvp6$c;,
        Lvp6$d;,
        Lvp6$b;
    }
.end annotation


# instance fields
.field public final a:LdA3;

.field public final b:LNs4;


# direct methods
.method public constructor <init>(LdA3;LNs4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LdA3;

    iput-object p1, p0, Lvp6;->a:LdA3;

    invoke-static {p2}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LNs4;

    iput-object p1, p0, Lvp6;->b:LNs4;

    return-void
.end method

.method public static a(LdA3;LNs4;LfA3;)Lvp6$a;
    .locals 7

    new-instance v6, Lvp6$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lvp6$a;-><init>(LdA3;LNs4;LfA3;ILjava/lang/Throwable;)V

    return-object v6
.end method

.method public static b(LdA3;LNs4;LfA3;ILjava/lang/Throwable;)Lvp6$a;
    .locals 8

    if-eqz p3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "An error type is required."

    invoke-static {v0, v1}, LHZ3;->b(ZLjava/lang/Object;)V

    new-instance v0, Lvp6$a;

    move-object v2, v0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lvp6$a;-><init>(LdA3;LNs4;LfA3;ILjava/lang/Throwable;)V

    return-object v0
.end method

.method public static d(LdA3;LNs4;)Lvp6$b;
    .locals 1

    new-instance v0, Lvp6$b;

    invoke-direct {v0, p0, p1}, Lvp6$b;-><init>(LdA3;LNs4;)V

    return-object v0
.end method

.method public static e(LdA3;LNs4;)Lvp6$c;
    .locals 1

    new-instance v0, Lvp6$c;

    invoke-direct {v0, p0, p1}, Lvp6$c;-><init>(LdA3;LNs4;)V

    return-object v0
.end method

.method public static f(LdA3;LNs4;)Lvp6$d;
    .locals 1

    new-instance v0, Lvp6$d;

    invoke-direct {v0, p0, p1}, Lvp6$d;-><init>(LdA3;LNs4;)V

    return-object v0
.end method


# virtual methods
.method public c()LdA3;
    .locals 1

    iget-object v0, p0, Lvp6;->a:LdA3;

    return-object v0
.end method
