.class public LcL$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcL;->h()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/List<",
        "Lco/bird/android/model/persistence/Bird;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LHb5;

.field public final synthetic c:LcL;


# direct methods
.method public constructor <init>(LcL;LHb5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LcL$c;->c:LcL;

    iput-object p2, p0, LcL$c;->b:LHb5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 70
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    iget-object v0, v1, LcL$c;->c:LcL;

    invoke-static {v0}, LcL;->m(LcL;)LEb5;

    move-result-object v0

    iget-object v2, v1, LcL$c;->b:LHb5;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v5

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-eqz v5, :cond_3f

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v7, v4

    goto :goto_1

    :cond_0
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object v7, v5

    :goto_1
    const/4 v5, 0x1

    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_1

    move-object v8, v4

    goto :goto_2

    :cond_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object v8, v6

    :goto_2
    const/4 v6, 0x2

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_2

    move-object v9, v4

    goto :goto_3

    :cond_2
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object v9, v6

    :goto_3
    const/4 v6, 0x3

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v10

    const/4 v6, 0x4

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v11

    if-eqz v11, :cond_3

    move-object v11, v4

    goto :goto_4

    :cond_3
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object v11, v6

    :goto_4
    const/4 v6, 0x5

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    const/4 v6, 0x6

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_4

    move-object v6, v4

    goto :goto_5

    :cond_4
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_5
    invoke-static {v6}, Lco/bird/android/persistence/common/impl/Converters;->h(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v13

    const/4 v6, 0x7

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_5

    move-object v14, v4

    goto :goto_6

    :cond_5
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object v14, v6

    :goto_6
    const/16 v6, 0x8

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_6

    move-object v15, v4

    goto :goto_7

    :cond_6
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object v15, v6

    :goto_7
    const/16 v6, 0x9

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v16

    if-eqz v16, :cond_7

    move-object/from16 v16, v4

    goto :goto_8

    :cond_7
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v16, v6

    :goto_8
    const/16 v6, 0xa

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_8

    move/from16 v17, v5

    goto :goto_9

    :cond_8
    move/from16 v17, v3

    :goto_9
    const/16 v6, 0xb

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_9

    move/from16 v18, v5

    goto :goto_a

    :cond_9
    move/from16 v18, v3

    :goto_a
    const/16 v6, 0xc

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_a

    move/from16 v19, v5

    goto :goto_b

    :cond_a
    move/from16 v19, v3

    :goto_b
    const/16 v6, 0xd

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_b

    move/from16 v20, v5

    goto :goto_c

    :cond_b
    move/from16 v20, v3

    :goto_c
    const/16 v6, 0xe

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_c

    move/from16 v21, v5

    goto :goto_d

    :cond_c
    move/from16 v21, v3

    :goto_d
    const/16 v6, 0xf

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_d

    move/from16 v22, v5

    goto :goto_e

    :cond_d
    move/from16 v22, v3

    :goto_e
    const/16 v6, 0x10

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_e

    move/from16 v23, v5

    goto :goto_f

    :cond_e
    move/from16 v23, v3

    :goto_f
    const/16 v6, 0x11

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_f

    move/from16 v24, v5

    goto :goto_10

    :cond_f
    move/from16 v24, v3

    :goto_10
    const/16 v6, 0x12

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_10

    move/from16 v25, v5

    goto :goto_11

    :cond_10
    move/from16 v25, v3

    :goto_11
    const/16 v6, 0x13

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v26

    if-eqz v26, :cond_11

    move-object v6, v4

    goto :goto_12

    :cond_11
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_12
    invoke-static {v6}, LaL;->d(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    move-result-object v26

    const/16 v6, 0x14

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v27

    if-eqz v27, :cond_12

    move-object v6, v4

    goto :goto_13

    :cond_12
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_13
    invoke-static {v6}, LaL;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v27

    const/16 v6, 0x15

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v28

    if-eqz v28, :cond_13

    move-object/from16 v28, v4

    goto :goto_14

    :cond_13
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v28, v6

    :goto_14
    const/16 v6, 0x16

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v29

    if-eqz v29, :cond_14

    move-object/from16 v29, v4

    goto :goto_15

    :cond_14
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v29, v6

    :goto_15
    const/16 v6, 0x17

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v30

    if-eqz v30, :cond_15

    move-object/from16 v30, v4

    goto :goto_16

    :cond_15
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v30, v6

    :goto_16
    const/16 v6, 0x18

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_16

    move/from16 v31, v5

    goto :goto_17

    :cond_16
    move/from16 v31, v3

    :goto_17
    const/16 v6, 0x19

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_17

    move/from16 v32, v5

    goto :goto_18

    :cond_17
    move/from16 v32, v3

    :goto_18
    const/16 v6, 0x1a

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_18

    move-object v6, v4

    goto :goto_19

    :cond_18
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_19
    invoke-static {v6}, LaL;->g(Ljava/lang/String;)Lco/bird/android/model/constant/BountyKind;

    move-result-object v33

    const/16 v6, 0x1b

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v34

    if-eqz v34, :cond_19

    move-object/from16 v34, v4

    goto :goto_1a

    :cond_19
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v34, v6

    :goto_1a
    const/16 v6, 0x1c

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v35

    if-eqz v35, :cond_1a

    move-object v6, v4

    goto :goto_1b

    :cond_1a
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_1b
    invoke-static {v6}, LaL;->f(Ljava/lang/String;)Lco/bird/android/model/constant/BirdTaskKind;

    move-result-object v35

    const/16 v6, 0x1d

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v36

    if-eqz v36, :cond_1b

    move-object v6, v4

    goto :goto_1c

    :cond_1b
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_1c
    invoke-static {v6}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v36

    const/16 v6, 0x1e

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v37

    if-eqz v37, :cond_1c

    move-object v6, v4

    goto :goto_1d

    :cond_1c
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_1d
    invoke-static {v6}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v37

    const/16 v6, 0x1f

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v38

    if-eqz v38, :cond_1d

    move-object/from16 v38, v4

    goto :goto_1e

    :cond_1d
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v38, v6

    :goto_1e
    const/16 v6, 0x20

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_1e

    move/from16 v39, v5

    goto :goto_1f

    :cond_1e
    move/from16 v39, v3

    :goto_1f
    const/16 v6, 0x21

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_1f

    move/from16 v40, v5

    goto :goto_20

    :cond_1f
    move/from16 v40, v3

    :goto_20
    const/16 v6, 0x22

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v41

    if-eqz v41, :cond_20

    move-object v6, v4

    goto :goto_21

    :cond_20
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_21
    invoke-static {v6}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v41

    const/16 v6, 0x23

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_21

    move-object v6, v4

    goto :goto_22

    :cond_21
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_22
    invoke-static {v6}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v42

    const/16 v6, 0x24

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_22

    move/from16 v43, v5

    goto :goto_23

    :cond_22
    move/from16 v43, v3

    :goto_23
    const/16 v6, 0x25

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_23

    move-object/from16 v44, v4

    goto :goto_24

    :cond_23
    const/16 v6, 0x25

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v44, v6

    :goto_24
    const/16 v6, 0x26

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_24

    move-object/from16 v45, v4

    goto :goto_25

    :cond_24
    const/16 v6, 0x26

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v45, v6

    :goto_25
    const/16 v6, 0x27

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_25

    move-object v6, v4

    goto :goto_26

    :cond_25
    const/16 v6, 0x27

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_26
    invoke-static {v6}, LaL;->y(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    move-result-object v46

    const/16 v6, 0x28

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_26

    move-object v6, v4

    goto :goto_27

    :cond_26
    const/16 v6, 0x28

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_27
    invoke-static {v6}, LaL;->z(Ljava/lang/String;)Ljava/util/List;

    move-result-object v47

    const/16 v6, 0x29

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_27

    move/from16 v48, v5

    goto :goto_28

    :cond_27
    move/from16 v48, v3

    :goto_28
    const/16 v6, 0x2a

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_28

    move/from16 v49, v5

    goto :goto_29

    :cond_28
    move/from16 v49, v3

    :goto_29
    const/16 v6, 0x2b

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_29

    move/from16 v50, v5

    goto :goto_2a

    :cond_29
    move/from16 v50, v3

    :goto_2a
    const/16 v6, 0x2c

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2a

    move-object/from16 v51, v4

    goto :goto_2b

    :cond_2a
    const/16 v6, 0x2c

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v51, v6

    :goto_2b
    const/16 v6, 0x2d

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2b

    move-object/from16 v52, v4

    goto :goto_2c

    :cond_2b
    const/16 v6, 0x2d

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v52, v6

    :goto_2c
    const/16 v6, 0x2e

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2c

    move-object v6, v4

    goto :goto_2d

    :cond_2c
    const/16 v6, 0x2e

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_2d
    invoke-static {v6}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v53

    const/16 v6, 0x2f

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2d

    move-object v6, v4

    goto :goto_2e

    :cond_2d
    const/16 v6, 0x2f

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_2e
    invoke-static {v6}, LaL;->x(Ljava/lang/String;)Lco/bird/android/model/constant/PartnerBirdState;

    move-result-object v54

    const/16 v6, 0x30

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_2e

    move/from16 v55, v5

    goto :goto_2f

    :cond_2e
    move/from16 v55, v3

    :goto_2f
    const/16 v6, 0x31

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_2f

    move/from16 v56, v5

    goto :goto_30

    :cond_2f
    move/from16 v56, v3

    :goto_30
    const/16 v6, 0x32

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_30

    move-object v6, v4

    goto :goto_31

    :cond_30
    const/16 v6, 0x32

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_31
    invoke-static {v6}, LaL;->u(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-result-object v57

    const/16 v6, 0x33

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_31

    move/from16 v58, v5

    goto :goto_32

    :cond_31
    move/from16 v58, v3

    :goto_32
    const/16 v6, 0x34

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_32

    move-object v6, v4

    goto :goto_33

    :cond_32
    const/16 v6, 0x34

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_33
    invoke-static {v6}, LaL;->e(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

    move-result-object v59

    const/16 v6, 0x35

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_33

    move-object/from16 v60, v4

    goto :goto_34

    :cond_33
    const/16 v6, 0x35

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v60, v6

    :goto_34
    const/16 v6, 0x36

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_34

    move-object v6, v4

    goto :goto_35

    :cond_34
    const/16 v6, 0x36

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_35
    invoke-static {v6}, LaL;->w(Ljava/lang/String;)Lco/bird/android/model/constant/NestPurpose;

    move-result-object v61

    const/16 v6, 0x37

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_35

    move-object v6, v4

    goto :goto_36

    :cond_35
    const/16 v6, 0x37

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_36
    invoke-static {v6}, LaL;->A(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    move-result-object v62

    const/16 v6, 0x38

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_36

    move-object v6, v4

    goto :goto_37

    :cond_36
    const/16 v6, 0x38

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_37
    invoke-static {v6}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v63

    const/16 v6, 0x39

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_37

    move-object v6, v4

    goto :goto_38

    :cond_37
    const/16 v6, 0x39

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_38
    invoke-static {v6}, LaL;->v(Ljava/lang/String;)Lco/bird/android/model/constant/MapPinBadge;

    move-result-object v64

    const/16 v6, 0x3a

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_38

    move-object v6, v4

    goto :goto_39

    :cond_38
    const/16 v6, 0x3a

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_39
    invoke-static {v6}, LaL;->i(Ljava/lang/String;)Ljava/util/List;

    move-result-object v65

    const/16 v6, 0x3b

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_39

    move-object/from16 v66, v4

    goto :goto_3a

    :cond_39
    const/16 v6, 0x3b

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v66, v6

    :goto_3a
    const/16 v6, 0x3c

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_3a

    move-object/from16 v67, v4

    goto :goto_3b

    :cond_3a
    const/16 v6, 0x3c

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v67, v6

    :goto_3b
    const/16 v6, 0x3d

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_3b

    move-object v6, v4

    goto :goto_3c

    :cond_3b
    const/16 v6, 0x3d

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_3c
    if-nez v6, :cond_3c

    move-object/from16 v68, v4

    goto :goto_3e

    :cond_3c
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eqz v6, :cond_3d

    goto :goto_3d

    :cond_3d
    move v5, v3

    :goto_3d
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object/from16 v68, v5

    :goto_3e
    const/16 v5, 0x3e

    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_3e

    move-object v5, v4

    goto :goto_3f

    :cond_3e
    const/16 v5, 0x3e

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_3f
    invoke-static {v5}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v69

    new-instance v5, Lco/bird/android/model/persistence/Bird;

    move-object v6, v5

    invoke-direct/range {v6 .. v69}, Lco/bird/android/model/persistence/Bird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :cond_3f
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v0

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

    invoke-virtual {p0}, LcL$c;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public finalize()V
    .locals 1

    iget-object v0, p0, LcL$c;->b:LHb5;

    invoke-virtual {v0}, LHb5;->release()V

    return-void
.end method
