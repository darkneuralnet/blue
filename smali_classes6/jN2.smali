.class public LjN2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/lang/String; = "jN2"

.field public static final c:[F


# instance fields
.field public a:[F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, LjN2;->c:[F

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [F

    iput-object v0, p0, LjN2;->a:[F

    sget-object v0, LjN2;->c:[F

    invoke-virtual {p0, v0}, LjN2;->d([F)V

    return-void
.end method

.method public constructor <init>([F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [F

    iput-object v0, p0, LjN2;->a:[F

    invoke-virtual {p0, p1}, LjN2;->d([F)V

    return-void
.end method

.method public static b(LjN2;LjN2;)Z
    .locals 47

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "Parameter \"matrix\" was null."

    invoke-static {v0, v2}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "Parameter \"dest\" was null."

    invoke-static {v1, v2}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, LjN2;->a:[F

    const/4 v2, 0x0

    aget v3, v0, v2

    const/4 v4, 0x1

    aget v5, v0, v4

    const/4 v6, 0x2

    aget v7, v0, v6

    const/4 v8, 0x3

    aget v9, v0, v8

    const/4 v10, 0x4

    aget v11, v0, v10

    const/4 v12, 0x5

    aget v13, v0, v12

    const/4 v14, 0x6

    aget v15, v0, v14

    const/16 v16, 0x7

    aget v17, v0, v16

    const/16 v18, 0x8

    aget v19, v0, v18

    const/16 v20, 0x9

    aget v21, v0, v20

    const/16 v22, 0xa

    aget v23, v0, v22

    const/16 v24, 0xb

    aget v25, v0, v24

    const/16 v26, 0xc

    aget v27, v0, v26

    const/16 v28, 0xd

    aget v29, v0, v28

    const/16 v30, 0xe

    aget v31, v0, v30

    const/16 v32, 0xf

    aget v0, v0, v32

    iget-object v8, v1, LjN2;->a:[F

    mul-float v33, v13, v23

    mul-float v33, v33, v0

    mul-float v34, v13, v25

    mul-float v34, v34, v31

    sub-float v33, v33, v34

    mul-float v34, v21, v15

    mul-float v34, v34, v0

    sub-float v33, v33, v34

    mul-float v34, v21, v17

    mul-float v34, v34, v31

    add-float v33, v33, v34

    mul-float v34, v29, v15

    mul-float v34, v34, v25

    add-float v33, v33, v34

    mul-float v34, v29, v17

    mul-float v34, v34, v23

    sub-float v33, v33, v34

    aput v33, v8, v2

    neg-float v2, v11

    mul-float v35, v2, v23

    mul-float v35, v35, v0

    mul-float v36, v11, v25

    mul-float v37, v36, v31

    add-float v35, v35, v37

    mul-float v37, v19, v15

    mul-float v38, v37, v0

    add-float v35, v35, v38

    mul-float v38, v19, v17

    mul-float v39, v38, v31

    sub-float v35, v35, v39

    mul-float v39, v27, v15

    mul-float v40, v39, v25

    sub-float v35, v35, v40

    mul-float v40, v27, v17

    mul-float v41, v40, v23

    add-float v35, v35, v41

    aput v35, v8, v10

    mul-float v10, v11, v21

    mul-float/2addr v10, v0

    mul-float v36, v36, v29

    sub-float v10, v10, v36

    mul-float v36, v19, v13

    mul-float v41, v36, v0

    sub-float v10, v10, v41

    mul-float v38, v38, v29

    add-float v10, v10, v38

    mul-float v38, v27, v13

    mul-float v41, v38, v25

    add-float v10, v10, v41

    mul-float v40, v40, v21

    sub-float v10, v10, v40

    aput v10, v8, v18

    mul-float v2, v2, v21

    mul-float v2, v2, v31

    mul-float v18, v11, v23

    mul-float v18, v18, v29

    add-float v2, v2, v18

    mul-float v36, v36, v31

    add-float v2, v2, v36

    mul-float v37, v37, v29

    sub-float v2, v2, v37

    mul-float v38, v38, v23

    sub-float v2, v2, v38

    mul-float v39, v39, v21

    add-float v2, v2, v39

    aput v2, v8, v26

    neg-float v14, v5

    mul-float v26, v14, v23

    mul-float v26, v26, v0

    mul-float v36, v5, v25

    mul-float v36, v36, v31

    add-float v26, v26, v36

    mul-float v36, v21, v7

    mul-float v37, v36, v0

    add-float v26, v26, v37

    mul-float v37, v21, v9

    mul-float v38, v37, v31

    sub-float v26, v26, v38

    mul-float v38, v29, v7

    mul-float v39, v38, v25

    sub-float v26, v26, v39

    mul-float v39, v29, v9

    mul-float v40, v39, v23

    add-float v26, v26, v40

    aput v26, v8, v4

    mul-float v26, v3, v23

    mul-float v40, v26, v0

    mul-float v41, v3, v25

    mul-float v42, v41, v31

    sub-float v40, v40, v42

    mul-float v42, v19, v7

    mul-float v43, v42, v0

    sub-float v40, v40, v43

    mul-float v43, v19, v9

    mul-float v44, v43, v31

    add-float v40, v40, v44

    mul-float v44, v27, v7

    mul-float v45, v44, v25

    add-float v40, v40, v45

    mul-float v45, v27, v9

    mul-float v46, v45, v23

    sub-float v40, v40, v46

    aput v40, v8, v12

    neg-float v12, v3

    mul-float v40, v12, v21

    mul-float v40, v40, v0

    mul-float v41, v41, v29

    add-float v40, v40, v41

    mul-float v19, v19, v5

    mul-float v41, v19, v0

    add-float v40, v40, v41

    mul-float v41, v43, v29

    sub-float v40, v40, v41

    mul-float v27, v27, v5

    mul-float v41, v27, v25

    sub-float v40, v40, v41

    mul-float v41, v45, v21

    add-float v40, v40, v41

    aput v40, v8, v20

    mul-float v20, v3, v21

    mul-float v20, v20, v31

    mul-float v26, v26, v29

    sub-float v20, v20, v26

    mul-float v26, v19, v31

    sub-float v20, v20, v26

    mul-float v26, v42, v29

    add-float v20, v20, v26

    mul-float v26, v27, v23

    add-float v20, v20, v26

    mul-float v26, v44, v21

    sub-float v20, v20, v26

    aput v20, v8, v28

    mul-float v20, v5, v15

    mul-float v20, v20, v0

    mul-float v26, v5, v17

    mul-float v28, v26, v31

    sub-float v20, v20, v28

    mul-float v28, v13, v7

    mul-float v40, v28, v0

    sub-float v20, v20, v40

    mul-float v40, v13, v9

    mul-float v41, v40, v31

    add-float v20, v20, v41

    mul-float v38, v38, v17

    add-float v20, v20, v38

    mul-float v39, v39, v15

    sub-float v20, v20, v39

    aput v20, v8, v6

    mul-float v6, v12, v15

    mul-float/2addr v6, v0

    mul-float v20, v3, v17

    mul-float v38, v20, v31

    add-float v6, v6, v38

    mul-float v38, v11, v7

    mul-float v39, v38, v0

    add-float v6, v6, v39

    mul-float v39, v11, v9

    mul-float v41, v39, v31

    sub-float v6, v6, v41

    mul-float v41, v44, v17

    sub-float v6, v6, v41

    mul-float v41, v45, v15

    add-float v6, v6, v41

    const/16 v18, 0x6

    aput v6, v8, v18

    mul-float v6, v3, v13

    mul-float v18, v6, v0

    mul-float v41, v20, v29

    sub-float v18, v18, v41

    mul-float/2addr v11, v5

    mul-float/2addr v0, v11

    sub-float v18, v18, v0

    mul-float v0, v39, v29

    add-float v18, v18, v0

    mul-float v0, v27, v17

    add-float v18, v18, v0

    mul-float v45, v45, v13

    sub-float v18, v18, v45

    aput v18, v8, v22

    mul-float/2addr v12, v13

    mul-float v0, v12, v31

    mul-float v18, v3, v15

    mul-float v22, v18, v29

    add-float v0, v0, v22

    mul-float v31, v31, v11

    add-float v0, v0, v31

    mul-float v29, v29, v38

    sub-float v0, v0, v29

    mul-float v27, v27, v15

    sub-float v0, v0, v27

    mul-float v44, v44, v13

    add-float v0, v0, v44

    aput v0, v8, v30

    mul-float/2addr v14, v15

    mul-float v14, v14, v25

    mul-float v26, v26, v23

    add-float v14, v14, v26

    mul-float v28, v28, v25

    add-float v14, v14, v28

    mul-float v40, v40, v23

    sub-float v14, v14, v40

    mul-float v36, v36, v17

    sub-float v14, v14, v36

    mul-float v37, v37, v15

    add-float v14, v14, v37

    const/4 v0, 0x3

    aput v14, v8, v0

    mul-float v0, v18, v25

    mul-float v14, v20, v23

    sub-float/2addr v0, v14

    mul-float v14, v38, v25

    sub-float/2addr v0, v14

    mul-float v14, v39, v23

    add-float/2addr v0, v14

    mul-float v14, v42, v17

    add-float/2addr v0, v14

    mul-float v14, v43, v15

    sub-float/2addr v0, v14

    aput v0, v8, v16

    mul-float v12, v12, v25

    mul-float v20, v20, v21

    add-float v12, v12, v20

    mul-float v25, v25, v11

    add-float v12, v12, v25

    mul-float v39, v39, v21

    sub-float v12, v12, v39

    mul-float v17, v17, v19

    sub-float v12, v12, v17

    mul-float v43, v43, v13

    add-float v12, v12, v43

    aput v12, v8, v24

    mul-float v6, v6, v23

    mul-float v18, v18, v21

    sub-float v6, v6, v18

    mul-float v11, v11, v23

    sub-float/2addr v6, v11

    mul-float v38, v38, v21

    add-float v6, v6, v38

    mul-float v19, v19, v15

    add-float v6, v6, v19

    mul-float v42, v42, v13

    sub-float v6, v6, v42

    aput v6, v8, v32

    mul-float v3, v3, v33

    mul-float v5, v5, v35

    add-float/2addr v3, v5

    mul-float/2addr v7, v10

    add-float/2addr v3, v7

    mul-float/2addr v9, v2

    add-float/2addr v3, v9

    const/4 v0, 0x0

    cmpl-float v0, v3, v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    div-float/2addr v2, v3

    :goto_0
    const/16 v3, 0x10

    if-ge v0, v3, :cond_1

    iget-object v3, v1, LjN2;->a:[F

    aget v5, v3, v0

    mul-float/2addr v5, v2

    aput v5, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v4
.end method


# virtual methods
.method public a(LVc4;)V
    .locals 13

    iget-object v0, p0, LjN2;->a:[F

    const/4 v1, 0x0

    aget v1, v0, v1

    const/4 v2, 0x5

    aget v2, v0, v2

    add-float v3, v1, v2

    const/16 v4, 0xa

    aget v0, v0, v4

    add-float/2addr v3, v0

    const/4 v4, 0x0

    cmpl-float v4, v3, v4

    const/4 v5, 0x4

    const/4 v6, 0x1

    const/4 v7, 0x2

    const/16 v8, 0x8

    const/16 v9, 0x9

    const/4 v10, 0x6

    const/high16 v11, 0x3e800000    # 0.25f

    const/high16 v12, 0x40000000    # 2.0f

    if-lez v4, :cond_0

    float-to-double v0, v3

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v0, v12

    mul-float/2addr v11, v0

    iput v11, p1, LVc4;->d:F

    iget-object v1, p0, LjN2;->a:[F

    aget v2, v1, v10

    aget v3, v1, v9

    sub-float/2addr v2, v3

    div-float/2addr v2, v0

    iput v2, p1, LVc4;->a:F

    aget v2, v1, v8

    aget v3, v1, v7

    sub-float/2addr v2, v3

    div-float/2addr v2, v0

    iput v2, p1, LVc4;->b:F

    aget v2, v1, v6

    aget v1, v1, v5

    sub-float/2addr v2, v1

    div-float/2addr v2, v0

    iput v2, p1, LVc4;->c:F

    goto/16 :goto_0

    :cond_0
    cmpl-float v3, v1, v2

    const/high16 v4, 0x3f800000    # 1.0f

    if-lez v3, :cond_1

    cmpl-float v3, v1, v0

    if-lez v3, :cond_1

    add-float/2addr v1, v4

    sub-float/2addr v1, v2

    sub-float/2addr v1, v0

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v0, v12

    iget-object v1, p0, LjN2;->a:[F

    aget v2, v1, v10

    aget v3, v1, v9

    sub-float/2addr v2, v3

    div-float/2addr v2, v0

    iput v2, p1, LVc4;->d:F

    mul-float/2addr v11, v0

    iput v11, p1, LVc4;->a:F

    aget v2, v1, v5

    aget v3, v1, v6

    add-float/2addr v2, v3

    div-float/2addr v2, v0

    iput v2, p1, LVc4;->b:F

    aget v2, v1, v8

    aget v1, v1, v7

    add-float/2addr v2, v1

    div-float/2addr v2, v0

    iput v2, p1, LVc4;->c:F

    goto :goto_0

    :cond_1
    cmpl-float v3, v2, v0

    if-lez v3, :cond_2

    add-float/2addr v2, v4

    sub-float/2addr v2, v1

    sub-float/2addr v2, v0

    float-to-double v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v0, v12

    iget-object v1, p0, LjN2;->a:[F

    aget v2, v1, v8

    aget v3, v1, v7

    sub-float/2addr v2, v3

    div-float/2addr v2, v0

    iput v2, p1, LVc4;->d:F

    aget v2, v1, v5

    aget v3, v1, v6

    add-float/2addr v2, v3

    div-float/2addr v2, v0

    iput v2, p1, LVc4;->a:F

    mul-float/2addr v11, v0

    iput v11, p1, LVc4;->b:F

    aget v2, v1, v9

    aget v1, v1, v10

    add-float/2addr v2, v1

    div-float/2addr v2, v0

    iput v2, p1, LVc4;->c:F

    goto :goto_0

    :cond_2
    add-float/2addr v0, v4

    sub-float/2addr v0, v1

    sub-float/2addr v0, v2

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v0, v12

    iget-object v1, p0, LjN2;->a:[F

    aget v2, v1, v6

    aget v3, v1, v5

    sub-float/2addr v2, v3

    div-float/2addr v2, v0

    iput v2, p1, LVc4;->d:F

    aget v2, v1, v8

    aget v3, v1, v7

    add-float/2addr v2, v3

    div-float/2addr v2, v0

    iput v2, p1, LVc4;->a:F

    aget v2, v1, v9

    aget v1, v1, v10

    add-float/2addr v2, v1

    div-float/2addr v2, v0

    iput v2, p1, LVc4;->b:F

    mul-float/2addr v0, v11

    iput v0, p1, LVc4;->c:F

    :goto_0
    invoke-virtual {p1}, LVc4;->f()Z

    return-void
.end method

.method public c(F)V
    .locals 2

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const-string v1, "Parameter \"scale\" was null."

    invoke-static {v0, v1}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, LjN2;->c:[F

    invoke-virtual {p0, v0}, LjN2;->d([F)V

    iget-object v0, p0, LjN2;->a:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 v1, 0x5

    aput p1, v0, v1

    const/16 v1, 0xa

    aput p1, v0, v1

    return-void
.end method

.method public d([F)V
    .locals 3

    if-eqz p1, :cond_2

    array-length v0, p1

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LjN2;->a:[F

    aget v2, p1, v0

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_1
    sget-object p1, LjN2;->b:Ljava/lang/String;

    const-string v0, "Cannot set Matrix, invalid data."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public e(LQj6;)V
    .locals 3

    iget-object v0, p0, LjN2;->a:[F

    iget v1, p1, LQj6;->a:F

    const/16 v2, 0xc

    aput v1, v0, v2

    const/16 v1, 0xd

    iget v2, p1, LQj6;->b:F

    aput v2, v0, v1

    const/16 v1, 0xe

    iget p1, p1, LQj6;->c:F

    aput p1, v0, v1

    return-void
.end method
