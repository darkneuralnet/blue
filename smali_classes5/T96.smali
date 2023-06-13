.class public abstract LT96;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT96$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LT96$a;
    .locals 2

    new-instance v0, Lqu$b;

    invoke-direct {v0}, Lqu$b;-><init>()V

    sget-object v1, LN24;->b:LN24;

    invoke-virtual {v0, v1}, Lqu$b;->d(LN24;)LT96$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()[B
.end method

.method public abstract d()LN24;
.end method

.method public e()Z
    .locals 1

    invoke-virtual {p0}, LT96;->c()[B

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f(LN24;)LT96;
    .locals 2

    invoke-static {}, LT96;->a()LT96$a;

    move-result-object v0

    invoke-virtual {p0}, LT96;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LT96$a;->b(Ljava/lang/String;)LT96$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LT96$a;->d(LN24;)LT96$a;

    move-result-object p1

    invoke-virtual {p0}, LT96;->c()[B

    move-result-object v0

    invoke-virtual {p1, v0}, LT96$a;->c([B)LT96$a;

    move-result-object p1

    invoke-virtual {p1}, LT96$a;->a()LT96;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, LT96;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, LT96;->d()LN24;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0}, LT96;->c()[B

    move-result-object v1

    const/4 v2, 0x2

    if-nez v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LT96;->c()[B

    move-result-object v1

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    :goto_0
    aput-object v1, v0, v2

    const-string v1, "TransportContext(%s, %s, %s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
