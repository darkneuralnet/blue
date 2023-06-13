.class public final LLN1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKN1;


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lbf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbf1<",
            "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lgz5;

.field public final e:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLN1;->a:LEb5;

    new-instance v0, LLN1$d;

    invoke-direct {v0, p0, p1}, LLN1$d;-><init>(LLN1;LEb5;)V

    iput-object v0, p0, LLN1;->b:Lcf1;

    new-instance v0, LLN1$e;

    invoke-direct {v0, p0, p1}, LLN1$e;-><init>(LLN1;LEb5;)V

    iput-object v0, p0, LLN1;->c:Lbf1;

    new-instance v0, LLN1$f;

    invoke-direct {v0, p0, p1}, LLN1$f;-><init>(LLN1;LEb5;)V

    iput-object v0, p0, LLN1;->d:Lgz5;

    new-instance v0, LLN1$g;

    invoke-direct {v0, p0, p1}, LLN1$g;-><init>(LLN1;LEb5;)V

    iput-object v0, p0, LLN1;->e:Lgz5;

    return-void
.end method

.method public static bridge synthetic j(LLN1;)LEb5;
    .locals 0

    iget-object p0, p0, LLN1;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic k(LLN1;)Lcf1;
    .locals 0

    iget-object p0, p0, LLN1;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic l(LLN1;)Lgz5;
    .locals 0

    iget-object p0, p0, LLN1;->d:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic m(LLN1;)Lgz5;
    .locals 0

    iget-object p0, p0, LLN1;->e:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic n(LLN1;)Lbf1;
    .locals 0

    iget-object p0, p0, LLN1;->c:Lbf1;

    return-object p0
.end method

.method public static o()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/LiveData;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/util/List<",
            "Lcom/chuckerteam/chucker/internal/data/entity/a;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error, graphQLDetected, graphQlOperationName FROM transactions WHERE responseCode LIKE ? AND (path LIKE ? OR graphQlOperationName LIKE ?) ORDER BY requestDate DESC"

    const/4 v1, 0x3

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    invoke-virtual {v0, v2}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    const/4 p1, 0x2

    if-nez p2, :cond_1

    invoke-virtual {v0, p1}, LHb5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1, p2}, LHb5;->G0(ILjava/lang/String;)V

    :goto_1
    if-nez p3, :cond_2

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1, p3}, LHb5;->G0(ILjava/lang/String;)V

    :goto_2
    iget-object p1, p0, LLN1;->a:LEb5;

    invoke-virtual {p1}, LEb5;->k()Lq72;

    move-result-object p1

    const-string p2, "transactions"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    new-instance p3, LLN1$a;

    invoke-direct {p3, p0, v0}, LLN1$a;-><init>(LLN1;LHb5;)V

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, p3}, Lq72;->e([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;

    move-result-object p1

    return-object p1
.end method

.method public b(J)Ljava/util/List;
    .locals 67
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "SELECT * FROM transactions WHERE requestDate >= ?"

    const/4 v2, 0x1

    invoke-static {v0, v2}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v3

    move-wide/from16 v4, p1

    invoke-virtual {v3, v2, v4, v5}, LHb5;->S0(IJ)V

    iget-object v0, v1, LLN1;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, v1, LLN1;->a:LEb5;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v0, v3, v4, v5}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v6

    :try_start_0
    const-string v0, "id"

    invoke-static {v6, v0}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v7, "requestDate"

    invoke-static {v6, v7}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "responseDate"

    invoke-static {v6, v8}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "tookMs"

    invoke-static {v6, v9}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "protocol"

    invoke-static {v6, v10}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "method"

    invoke-static {v6, v11}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "url"

    invoke-static {v6, v12}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "host"

    invoke-static {v6, v13}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "path"

    invoke-static {v6, v14}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "scheme"

    invoke-static {v6, v15}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v2, "responseTlsVersion"

    invoke-static {v6, v2}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v2

    const-string v4, "responseCipherSuite"

    invoke-static {v6, v4}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v5, "requestPayloadSize"

    invoke-static {v6, v5}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v1, "requestContentType"

    invoke-static {v6, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v16, v3

    :try_start_1
    const-string v3, "requestHeaders"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v17, v3

    const-string v3, "requestHeadersSize"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v18, v3

    const-string v3, "requestBody"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v19, v3

    const-string v3, "isRequestBodyEncoded"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v20, v3

    const-string v3, "responseCode"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v21, v3

    const-string v3, "responseMessage"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v22, v3

    const-string v3, "error"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v23, v3

    const-string v3, "responsePayloadSize"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v24, v3

    const-string v3, "responseContentType"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v25, v3

    const-string v3, "responseHeaders"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v26, v3

    const-string v3, "responseHeadersSize"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v27, v3

    const-string v3, "responseBody"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v28, v3

    const-string v3, "isResponseBodyEncoded"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v29, v3

    const-string v3, "responseImageData"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v30, v3

    const-string v3, "graphQlDetected"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v31, v3

    const-string v3, "graphQlOperationName"

    invoke-static {v6, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    move/from16 v32, v3

    new-instance v3, Ljava/util/ArrayList;

    move/from16 v33, v1

    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v35

    invoke-interface {v6, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v37, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v6, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v37

    invoke-static/range {v37 .. v38}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v37, v1

    :goto_1
    invoke-interface {v6, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v38, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v6, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v38

    invoke-static/range {v38 .. v39}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v38, v1

    :goto_2
    invoke-interface {v6, v9}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v39, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v6, v9}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v39

    invoke-static/range {v39 .. v40}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v39, v1

    :goto_3
    invoke-interface {v6, v10}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v40, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v6, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v40, v1

    :goto_4
    invoke-interface {v6, v11}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v41, 0x0

    goto :goto_5

    :cond_4
    invoke-interface {v6, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v41, v1

    :goto_5
    invoke-interface {v6, v12}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_5

    const/16 v42, 0x0

    goto :goto_6

    :cond_5
    invoke-interface {v6, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v42, v1

    :goto_6
    invoke-interface {v6, v13}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v43, 0x0

    goto :goto_7

    :cond_6
    invoke-interface {v6, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v43, v1

    :goto_7
    invoke-interface {v6, v14}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_7

    const/16 v44, 0x0

    goto :goto_8

    :cond_7
    invoke-interface {v6, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v44, v1

    :goto_8
    invoke-interface {v6, v15}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_8

    const/16 v45, 0x0

    goto :goto_9

    :cond_8
    invoke-interface {v6, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v45, v1

    :goto_9
    invoke-interface {v6, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_9

    const/16 v46, 0x0

    goto :goto_a

    :cond_9
    invoke-interface {v6, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v46, v1

    :goto_a
    invoke-interface {v6, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_a

    const/16 v47, 0x0

    goto :goto_b

    :cond_a
    invoke-interface {v6, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v47, v1

    :goto_b
    invoke-interface {v6, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_b

    move/from16 v1, v33

    const/16 v48, 0x0

    goto :goto_c

    :cond_b
    invoke-interface {v6, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v48

    invoke-static/range {v48 .. v49}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v48, v1

    move/from16 v1, v33

    :goto_c
    invoke-interface {v6, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_c

    const/16 v49, 0x0

    :goto_d
    move/from16 v66, v17

    move/from16 v17, v0

    move/from16 v0, v66

    goto :goto_e

    :cond_c
    invoke-interface {v6, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v49, v33

    goto :goto_d

    :goto_e
    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_d

    const/16 v50, 0x0

    :goto_f
    move/from16 v66, v18

    move/from16 v18, v0

    move/from16 v0, v66

    goto :goto_10

    :cond_d
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v50, v33

    goto :goto_f

    :goto_10
    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_e

    const/16 v51, 0x0

    :goto_11
    move/from16 v66, v19

    move/from16 v19, v0

    move/from16 v0, v66

    goto :goto_12

    :cond_e
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v33

    invoke-static/range {v33 .. v34}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v33

    move-object/from16 v51, v33

    goto :goto_11

    :goto_12
    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_f

    const/16 v52, 0x0

    :goto_13
    move/from16 v66, v20

    move/from16 v20, v0

    move/from16 v0, v66

    goto :goto_14

    :cond_f
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v52, v33

    goto :goto_13

    :goto_14
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v33

    if-eqz v33, :cond_10

    const/16 v53, 0x1

    goto :goto_15

    :cond_10
    const/16 v53, 0x0

    :goto_15
    move/from16 v66, v21

    move/from16 v21, v0

    move/from16 v0, v66

    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_11

    const/16 v54, 0x0

    :goto_16
    move/from16 v66, v22

    move/from16 v22, v0

    move/from16 v0, v66

    goto :goto_17

    :cond_11
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v33

    invoke-static/range {v33 .. v33}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v33

    move-object/from16 v54, v33

    goto :goto_16

    :goto_17
    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_12

    const/16 v55, 0x0

    :goto_18
    move/from16 v66, v23

    move/from16 v23, v0

    move/from16 v0, v66

    goto :goto_19

    :cond_12
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v55, v33

    goto :goto_18

    :goto_19
    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_13

    const/16 v56, 0x0

    :goto_1a
    move/from16 v66, v24

    move/from16 v24, v0

    move/from16 v0, v66

    goto :goto_1b

    :cond_13
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v56, v33

    goto :goto_1a

    :goto_1b
    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_14

    const/16 v57, 0x0

    :goto_1c
    move/from16 v66, v25

    move/from16 v25, v0

    move/from16 v0, v66

    goto :goto_1d

    :cond_14
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v33

    invoke-static/range {v33 .. v34}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v33

    move-object/from16 v57, v33

    goto :goto_1c

    :goto_1d
    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_15

    const/16 v58, 0x0

    :goto_1e
    move/from16 v66, v26

    move/from16 v26, v0

    move/from16 v0, v66

    goto :goto_1f

    :cond_15
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v58, v33

    goto :goto_1e

    :goto_1f
    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_16

    const/16 v59, 0x0

    :goto_20
    move/from16 v66, v27

    move/from16 v27, v0

    move/from16 v0, v66

    goto :goto_21

    :cond_16
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v59, v33

    goto :goto_20

    :goto_21
    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_17

    const/16 v60, 0x0

    :goto_22
    move/from16 v66, v28

    move/from16 v28, v0

    move/from16 v0, v66

    goto :goto_23

    :cond_17
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v33

    invoke-static/range {v33 .. v34}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v33

    move-object/from16 v60, v33

    goto :goto_22

    :goto_23
    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_18

    const/16 v61, 0x0

    :goto_24
    move/from16 v66, v29

    move/from16 v29, v0

    move/from16 v0, v66

    goto :goto_25

    :cond_18
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v61, v33

    goto :goto_24

    :goto_25
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v33

    if-eqz v33, :cond_19

    const/16 v62, 0x1

    goto :goto_26

    :cond_19
    const/16 v62, 0x0

    :goto_26
    move/from16 v66, v30

    move/from16 v30, v0

    move/from16 v0, v66

    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_1a

    const/16 v63, 0x0

    :goto_27
    move/from16 v66, v31

    move/from16 v31, v0

    move/from16 v0, v66

    goto :goto_28

    :cond_1a
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v33

    move-object/from16 v63, v33

    goto :goto_27

    :goto_28
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v33

    if-eqz v33, :cond_1b

    const/16 v64, 0x1

    goto :goto_29

    :cond_1b
    const/16 v64, 0x0

    :goto_29
    move/from16 v66, v32

    move/from16 v32, v0

    move/from16 v0, v66

    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_1c

    move/from16 v33, v0

    const/16 v65, 0x0

    goto :goto_2a

    :cond_1c
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v65, v33

    move/from16 v33, v0

    :goto_2a
    new-instance v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    move-object/from16 v34, v0

    invoke-direct/range {v34 .. v65}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;-><init>(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Z[BZLjava/lang/String;)V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move/from16 v0, v17

    move/from16 v17, v18

    move/from16 v18, v19

    move/from16 v19, v20

    move/from16 v20, v21

    move/from16 v21, v22

    move/from16 v22, v23

    move/from16 v23, v24

    move/from16 v24, v25

    move/from16 v25, v26

    move/from16 v26, v27

    move/from16 v27, v28

    move/from16 v28, v29

    move/from16 v29, v30

    move/from16 v30, v31

    move/from16 v31, v32

    move/from16 v32, v33

    move/from16 v33, v1

    goto/16 :goto_0

    :cond_1d
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    invoke-virtual/range {v16 .. v16}, LHb5;->release()V

    return-object v3

    :catchall_0
    move-exception v0

    goto :goto_2b

    :catchall_1
    move-exception v0

    move-object/from16 v16, v3

    :goto_2b
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    invoke-virtual/range {v16 .. v16}, LHb5;->release()V

    throw v0
.end method

.method public c()Landroidx/lifecycle/LiveData;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/util/List<",
            "Lcom/chuckerteam/chucker/internal/data/entity/a;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error, graphQLDetected, graphQlOperationName FROM transactions ORDER BY requestDate DESC"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, LLN1;->a:LEb5;

    invoke-virtual {v2}, LEb5;->k()Lq72;

    move-result-object v2

    const-string v3, "transactions"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LLN1$l;

    invoke-direct {v4, p0, v0}, LLN1$l;-><init>(LLN1;LHb5;)V

    invoke-virtual {v2, v3, v1, v4}, Lq72;->e([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;

    move-result-object v0

    return-object v0
.end method

.method public d(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LLN1;->a:LEb5;

    new-instance v1, LLN1$k;

    invoke-direct {v1, p0, p1, p2}, LLN1$k;-><init>(LLN1;J)V

    const/4 p1, 0x1

    invoke-static {v0, p1, v1, p3}, LdD0;->b(LEb5;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "SELECT * FROM transactions"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    invoke-static {}, LIF0;->a()Landroid/os/CancellationSignal;

    move-result-object v2

    iget-object v3, p0, LLN1;->a:LEb5;

    new-instance v4, LLN1$c;

    invoke-direct {v4, p0, v0}, LLN1$c;-><init>(LLN1;LHb5;)V

    invoke-static {v3, v1, v2, v4, p1}, LdD0;->a(LEb5;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LLN1;->a:LEb5;

    new-instance v1, LLN1$h;

    invoke-direct {v1, p0, p1}, LLN1$h;-><init>(LLN1;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V

    const/4 p1, 0x1

    invoke-static {v0, p1, v1, p2}, LdD0;->b(LEb5;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g(J)Landroidx/lifecycle/LiveData;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT * FROM transactions WHERE id = ?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    invoke-virtual {v0, v1, p1, p2}, LHb5;->S0(IJ)V

    iget-object p1, p0, LLN1;->a:LEb5;

    invoke-virtual {p1}, LEb5;->k()Lq72;

    move-result-object p1

    const-string p2, "transactions"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    new-instance v1, LLN1$b;

    invoke-direct {v1, p0, v0}, LLN1$b;-><init>(LLN1;LHb5;)V

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, v1}, Lq72;->e([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;

    move-result-object p1

    return-object p1
.end method

.method public h(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LLN1;->a:LEb5;

    new-instance v1, LLN1$i;

    invoke-direct {v1, p0, p1}, LLN1$i;-><init>(LLN1;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V

    const/4 p1, 0x1

    invoke-static {v0, p1, v1, p2}, LdD0;->b(LEb5;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LLN1;->a:LEb5;

    new-instance v1, LLN1$j;

    invoke-direct {v1, p0}, LLN1$j;-><init>(LLN1;)V

    const/4 v2, 0x1

    invoke-static {v0, v2, v1, p1}, LdD0;->b(LEb5;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
