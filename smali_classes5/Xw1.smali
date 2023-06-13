.class public final LXw1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LR96;LN24;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DiscouragedApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR96<",
            "*>;",
            "LN24;",
            ")V"
        }
    .end annotation

    instance-of v0, p0, LX96;

    if-eqz v0, :cond_0

    check-cast p0, LX96;

    invoke-virtual {p0}, LX96;->d()LT96;

    move-result-object p0

    invoke-virtual {p0, p1}, LT96;->f(LN24;)LT96;

    move-result-object p0

    invoke-static {}, Lia6;->c()Lia6;

    move-result-object p1

    invoke-virtual {p1}, Lia6;->e()Lyf6;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Lyf6;->u(LT96;I)LXv;

    goto :goto_0

    :cond_0
    const-string p1, "ForcedSender"

    const-string v0, "Expected instance of `TransportImpl`, got `%s`."

    invoke-static {p1, v0, p0}, LRx2;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
