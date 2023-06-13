.class public LTp3$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTp3;->c(Ljava/lang/String;Lco/bird/android/model/constant/OperatorOrderViewType;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lco/bird/android/model/persistence/OperatorOrderView;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LHb5;

.field public final synthetic c:LTp3;


# direct methods
.method public constructor <init>(LTp3;LHb5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LTp3$f;->c:LTp3;

    iput-object p2, p0, LTp3$f;->b:LHb5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lco/bird/android/model/persistence/OperatorOrderView;
    .locals 31
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    iget-object v0, v1, LTp3$f;->c:LTp3;

    invoke-static {v0}, LTp3;->f(LTp3;)LEb5;

    move-result-object v0

    iget-object v2, v1, LTp3$f;->b:LHb5;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "order_id"

    invoke-static {v2, v0}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "appointment_date"

    invoke-static {v2, v5}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "location_name"

    invoke-static {v2, v6}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "locationAddress"

    invoke-static {v2, v7}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "details"

    invoke-static {v2, v8}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "instructions"

    invoke-static {v2, v9}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "type"

    invoke-static {v2, v10}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "list_description"

    invoke-static {v2, v11}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "quantity"

    invoke-static {v2, v12}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "section"

    invoke-static {v2, v13}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "bol_status_text"

    invoke-static {v2, v14}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "bol_status_color"

    invoke-static {v2, v15}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v3, "bol_uploaded"

    invoke-static {v2, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v4, "container_order_id"

    invoke-static {v2, v4}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v16

    if-eqz v16, :cond_d

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v16

    if-eqz v16, :cond_0

    const/16 v17, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v0

    :goto_0
    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v18

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v19, 0x0

    goto :goto_2

    :cond_2
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v19, v0

    :goto_2
    invoke-interface {v2, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v20, 0x0

    goto :goto_3

    :cond_3
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v20, v0

    :goto_3
    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    goto :goto_4

    :cond_4
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-static {v0}, LRp3;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object v21

    invoke-interface {v2, v9}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v22, 0x0

    goto :goto_5

    :cond_5
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v22, v0

    :goto_5
    invoke-interface {v2, v10}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    goto :goto_6

    :cond_6
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-static {v0}, LRp3;->e(Ljava/lang/String;)Lco/bird/android/model/constant/OperatorOrderViewType;

    move-result-object v23

    invoke-interface {v2, v11}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_7

    const/16 v24, 0x0

    goto :goto_7

    :cond_7
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v24, v0

    :goto_7
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getInt(I)I

    move-result v25

    invoke-interface {v2, v13}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_8

    const/16 v26, 0x0

    goto :goto_8

    :cond_8
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v26, v0

    :goto_8
    invoke-interface {v2, v14}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_9

    const/16 v27, 0x0

    goto :goto_9

    :cond_9
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v27, v0

    :goto_9
    invoke-interface {v2, v15}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x0

    goto :goto_a

    :cond_a
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_a
    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->r(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v28

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_b

    const/4 v3, 0x1

    move/from16 v29, v3

    goto :goto_b

    :cond_b
    const/16 v29, 0x0

    :goto_b
    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_c

    const/16 v30, 0x0

    goto :goto_c

    :cond_c
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v30, v4

    :goto_c
    new-instance v4, Lco/bird/android/model/persistence/OperatorOrderView;

    move-object/from16 v16, v4

    invoke-direct/range {v16 .. v30}, Lco/bird/android/model/persistence/OperatorOrderView;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/constant/OperatorOrderViewType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_d

    :cond_d
    const/4 v4, 0x0

    :goto_d
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v4

    :catchall_0
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, LTp3$f;->a()Lco/bird/android/model/persistence/OperatorOrderView;

    move-result-object v0

    return-object v0
.end method

.method public finalize()V
    .locals 1

    iget-object v0, p0, LTp3$f;->b:LHb5;

    invoke-virtual {v0}, LHb5;->release()V

    return-void
.end method
