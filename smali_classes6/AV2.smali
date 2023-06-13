.class public final LAV2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAV2$b;
    }
.end annotation


# static fields
.field public static final a:LyV2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LAV2$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LAV2$b;-><init>(LAV2$a;)V

    sput-object v0, LAV2;->a:LyV2$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LJ24;)LzV2;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "LJ24<",
            "TP;>;)",
            "LzV2;"
        }
    .end annotation

    invoke-static {}, LzV2;->a()LzV2$b;

    move-result-object v0

    invoke-virtual {p0}, LJ24;->d()LxV2;

    move-result-object v1

    invoke-virtual {v0, v1}, LzV2$b;->d(LxV2;)LzV2$b;

    invoke-virtual {p0}, LJ24;->c()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJ24$c;

    invoke-virtual {v3}, LJ24$c;->g()LIk2;

    move-result-object v4

    invoke-static {v4}, LAV2;->b(LIk2;)LHk2;

    move-result-object v4

    invoke-virtual {v3}, LJ24$c;->c()I

    move-result v5

    invoke-virtual {v3}, LJ24$c;->e()LJE3;

    move-result-object v3

    invoke-virtual {v0, v4, v5, v3}, LzV2$b;->a(LHk2;ILJE3;)LzV2$b;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LJ24;->e()LJ24$c;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LJ24;->e()LJ24$c;

    move-result-object p0

    invoke-virtual {p0}, LJ24$c;->c()I

    move-result p0

    invoke-virtual {v0, p0}, LzV2$b;->e(I)LzV2$b;

    :cond_2
    :try_start_0
    invoke-virtual {v0}, LzV2$b;->b()LzV2;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static b(LIk2;)LHk2;
    .locals 1

    sget-object v0, LAV2$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, LHk2;->d:LHk2;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown key status"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, LHk2;->c:LHk2;

    return-object p0

    :cond_2
    sget-object p0, LHk2;->b:LHk2;

    return-object p0
.end method
