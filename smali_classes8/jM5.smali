.class public LjM5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[LWB1;


# direct methods
.method public constructor <init>(LWB1;LWB1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [LWB1;

    iput-object v0, p0, LjM5;->a:[LWB1;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    return-void
.end method

.method public static b(LWB1;LWB1;I)LWB1;
    .locals 1

    new-instance v0, LjM5;

    invoke-direct {v0, p0, p1}, LjM5;-><init>(LWB1;LWB1;)V

    invoke-virtual {v0, p2}, LjM5;->a(I)LWB1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(I)LWB1;
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, LjM5;->a:[LWB1;

    aget-object v4, v3, v2

    aget-object v3, v3, v0

    invoke-static {v4, v3, p1}, LwA3;->v(LWB1;LWB1;I)LWB1;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move v4, v0

    goto :goto_0

    :catch_0
    move-exception v3

    move v4, v2

    move-object v5, v3

    move-object v3, v1

    move-object v1, v5

    :goto_0
    if-nez v4, :cond_0

    :try_start_1
    iget-object v3, p0, LjM5;->a:[LWB1;

    aget-object v2, v3, v2

    aget-object v0, v3, v0

    invoke-static {v2, v0, p1}, LkM5;->c(LWB1;LWB1;I)LWB1;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    throw v1

    :cond_0
    :goto_1
    return-object v3
.end method
