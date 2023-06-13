.class public LPE;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu73;


# instance fields
.field public final a:LJN1;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final b:LLA;

.field public final c:Lq70;


# direct methods
.method public constructor <init>(LLA;)V
    .locals 2

    new-instance v0, Lq70;

    const/16 v1, 0x1000

    invoke-direct {v0, v1}, Lq70;-><init>(I)V

    invoke-direct {p0, p1, v0}, LPE;-><init>(LLA;Lq70;)V

    return-void
.end method

.method public constructor <init>(LLA;Lq70;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPE;->b:LLA;

    iput-object p1, p0, LPE;->a:LJN1;

    iput-object p2, p0, LPE;->c:Lq70;

    return-void
.end method


# virtual methods
.method public a(LmI4;)LO73;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmI4<",
            "*>;)",
            "LO73;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/volley/VolleyError;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v8, p1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual/range {p1 .. p1}, LmI4;->getCacheEntry()LY70$a;

    move-result-object v0

    invoke-static {v0}, LEN1;->c(LY70$a;)Ljava/util/Map;

    move-result-object v0

    iget-object v3, v1, LPE;->b:LLA;

    invoke-virtual {v3, v8, v0}, LLA;->a(LmI4;Ljava/util/Map;)LGN1;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v3}, LGN1;->d()I

    move-result v12

    invoke-virtual {v3}, LGN1;->c()Ljava/util/List;

    move-result-object v0

    const/16 v4, 0x130

    if-ne v12, v4, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v4, v9

    invoke-static {v8, v4, v5, v0}, LU73;->b(LmI4;JLjava/util/List;)LO73;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v3}, LGN1;->a()Ljava/io/InputStream;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, LGN1;->b()I

    move-result v5

    iget-object v6, v1, LPE;->c:Lq70;

    invoke-static {v4, v5, v6}, LU73;->c(Ljava/io/InputStream;ILq70;)[B

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    new-array v2, v4, [B

    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v4, v9

    invoke-static {v4, v5, v8, v2, v12}, LU73;->d(JLmI4;[BI)V

    const/16 v4, 0xc8

    if-lt v12, v4, :cond_2

    const/16 v4, 0x12b

    if-gt v12, v4, :cond_2

    new-instance v4, LO73;

    const/4 v14, 0x0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    sub-long v15, v5, v9

    move-object v11, v4

    move-object v13, v2

    move-object/from16 v17, v0

    invoke-direct/range {v11 .. v17}, LO73;-><init>(I[BZJLjava/util/List;)V

    return-object v4

    :cond_2
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    move-object v7, v2

    move-object v6, v3

    move-object v3, v0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v3, v0

    move-object v6, v2

    move-object v7, v6

    :goto_2
    move-object/from16 v2, p1

    move-wide v4, v9

    invoke-static/range {v2 .. v7}, LU73;->e(LmI4;Ljava/io/IOException;JLGN1;[B)LU73$b;

    move-result-object v0

    invoke-static {v8, v0}, LU73;->a(LmI4;LU73$b;)V

    goto :goto_0
.end method
