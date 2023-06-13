.class public final enum LVt7;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum A:LVt7;

.field public static final enum B:LVt7;

.field public static final enum C:LVt7;

.field public static final enum D:LVt7;

.field public static final enum E:LVt7;

.field public static final enum F:LVt7;

.field public static final enum G:LVt7;

.field public static final enum H:LVt7;

.field public static final enum I:LVt7;

.field public static final enum J:LVt7;

.field public static final enum K:LVt7;

.field public static final enum P:LVt7;

.field public static final enum Q:LVt7;

.field public static final enum R:LVt7;

.field public static final enum S:LVt7;

.field public static final enum T:LVt7;

.field public static final enum U:LVt7;

.field public static final enum W:LVt7;

.field public static final enum X:LVt7;

.field public static final enum Y:LVt7;

.field public static final enum Z:LVt7;

.field public static final enum e:LVt7;

.field public static final enum f:LVt7;

.field public static final enum g:LVt7;

.field public static final enum h:LVt7;

.field public static final enum i:LVt7;

.field public static final enum j:LVt7;

.field public static final enum k:LVt7;

.field public static final enum l:LVt7;

.field public static final enum m:LVt7;

.field public static final enum n:LVt7;

.field public static final enum o:LVt7;

.field public static final enum p:LVt7;

.field public static final enum p0:LVt7;

.field public static final enum q:LVt7;

.field public static final enum q0:LVt7;

.field public static final enum r:LVt7;

.field public static final enum r0:LVt7;

.field public static final enum s:LVt7;

.field public static final enum s0:LVt7;

.field public static final enum t:LVt7;

.field public static final enum t0:LVt7;

.field public static final enum u:LVt7;

.field public static final enum u0:LVt7;

.field public static final enum v:LVt7;

.field public static final enum v0:LVt7;

.field public static final enum w:LVt7;

.field public static final enum w0:LVt7;

.field public static final enum x:LVt7;

.field public static final x0:[LVt7;

.field public static final enum y:LVt7;

.field public static final synthetic y0:[LVt7;

.field public static final enum z:LVt7;


# instance fields
.field public final b:Lpu7;

.field public final c:I

.field public final d:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 63

    new-instance v6, LVt7;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    sget-object v13, Lpu7;->i:Lpu7;

    move-object v0, v6

    move-object v5, v13

    invoke-direct/range {v0 .. v5}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v6, LVt7;->e:LVt7;

    new-instance v0, LVt7;

    const-string v8, "FLOAT"

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x1

    sget-object v1, Lpu7;->h:Lpu7;

    move-object v7, v0

    move-object v12, v1

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v0, LVt7;->f:LVt7;

    new-instance v2, LVt7;

    const-string v15, "INT64"

    const/16 v16, 0x2

    const/16 v17, 0x2

    const/16 v18, 0x1

    sget-object v3, Lpu7;->g:Lpu7;

    move-object v14, v2

    move-object/from16 v19, v3

    invoke-direct/range {v14 .. v19}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v2, LVt7;->g:LVt7;

    new-instance v4, LVt7;

    const-string v8, "UINT64"

    const/4 v9, 0x3

    const/4 v10, 0x3

    move-object v7, v4

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v4, LVt7;->h:LVt7;

    new-instance v5, LVt7;

    const-string v15, "INT32"

    const/16 v16, 0x4

    const/16 v17, 0x4

    sget-object v20, Lpu7;->f:Lpu7;

    move-object v14, v5

    move-object/from16 v19, v20

    invoke-direct/range {v14 .. v19}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v5, LVt7;->i:LVt7;

    new-instance v21, LVt7;

    const-string v8, "FIXED64"

    const/4 v9, 0x5

    const/4 v10, 0x5

    move-object/from16 v7, v21

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v21, LVt7;->j:LVt7;

    new-instance v22, LVt7;

    const-string v8, "FIXED32"

    const/4 v9, 0x6

    const/4 v10, 0x6

    move-object/from16 v7, v22

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v22, LVt7;->k:LVt7;

    new-instance v23, LVt7;

    const-string v15, "BOOL"

    const/16 v16, 0x7

    const/16 v17, 0x7

    sget-object v24, Lpu7;->j:Lpu7;

    move-object/from16 v14, v23

    move-object/from16 v19, v24

    invoke-direct/range {v14 .. v19}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v23, LVt7;->l:LVt7;

    new-instance v25, LVt7;

    const-string v8, "STRING"

    const/16 v9, 0x8

    const/16 v10, 0x8

    sget-object v26, Lpu7;->k:Lpu7;

    move-object/from16 v7, v25

    move-object/from16 v12, v26

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v25, LVt7;->m:LVt7;

    new-instance v27, LVt7;

    const-string v15, "MESSAGE"

    const/16 v16, 0x9

    const/16 v17, 0x9

    sget-object v28, Lpu7;->n:Lpu7;

    move-object/from16 v14, v27

    move-object/from16 v19, v28

    invoke-direct/range {v14 .. v19}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v27, LVt7;->n:LVt7;

    new-instance v29, LVt7;

    const-string v8, "BYTES"

    const/16 v9, 0xa

    const/16 v10, 0xa

    sget-object v30, Lpu7;->l:Lpu7;

    move-object/from16 v7, v29

    move-object/from16 v12, v30

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v29, LVt7;->o:LVt7;

    new-instance v31, LVt7;

    const-string v8, "UINT32"

    const/16 v9, 0xb

    const/16 v10, 0xb

    move-object/from16 v7, v31

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v31, LVt7;->p:LVt7;

    new-instance v32, LVt7;

    const-string v15, "ENUM"

    const/16 v16, 0xc

    const/16 v17, 0xc

    sget-object v33, Lpu7;->m:Lpu7;

    move-object/from16 v14, v32

    move-object/from16 v19, v33

    invoke-direct/range {v14 .. v19}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v32, LVt7;->q:LVt7;

    new-instance v34, LVt7;

    const-string v8, "SFIXED32"

    const/16 v9, 0xd

    const/16 v10, 0xd

    move-object/from16 v7, v34

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v34, LVt7;->r:LVt7;

    new-instance v35, LVt7;

    const-string v8, "SFIXED64"

    const/16 v9, 0xe

    const/16 v10, 0xe

    move-object/from16 v7, v35

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v35, LVt7;->s:LVt7;

    new-instance v36, LVt7;

    const-string v8, "SINT32"

    const/16 v9, 0xf

    const/16 v10, 0xf

    move-object/from16 v7, v36

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v36, LVt7;->t:LVt7;

    new-instance v37, LVt7;

    const-string v8, "SINT64"

    const/16 v9, 0x10

    const/16 v10, 0x10

    move-object/from16 v7, v37

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v37, LVt7;->u:LVt7;

    new-instance v38, LVt7;

    const-string v8, "GROUP"

    const/16 v9, 0x11

    const/16 v10, 0x11

    move-object/from16 v7, v38

    move-object/from16 v12, v28

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v38, LVt7;->v:LVt7;

    new-instance v39, LVt7;

    const-string v8, "DOUBLE_LIST"

    const/16 v9, 0x12

    const/16 v10, 0x12

    const/4 v11, 0x2

    move-object/from16 v7, v39

    move-object v12, v13

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v39, LVt7;->w:LVt7;

    new-instance v40, LVt7;

    const-string v15, "FLOAT_LIST"

    const/16 v16, 0x13

    const/16 v17, 0x13

    const/16 v18, 0x2

    move-object/from16 v14, v40

    move-object/from16 v19, v1

    invoke-direct/range {v14 .. v19}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v40, LVt7;->x:LVt7;

    new-instance v41, LVt7;

    const-string v8, "INT64_LIST"

    const/16 v9, 0x14

    const/16 v10, 0x14

    move-object/from16 v7, v41

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v41, LVt7;->y:LVt7;

    new-instance v42, LVt7;

    const-string v8, "UINT64_LIST"

    const/16 v9, 0x15

    const/16 v10, 0x15

    move-object/from16 v7, v42

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v42, LVt7;->z:LVt7;

    new-instance v43, LVt7;

    const-string v8, "INT32_LIST"

    const/16 v9, 0x16

    const/16 v10, 0x16

    move-object/from16 v7, v43

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v43, LVt7;->A:LVt7;

    new-instance v44, LVt7;

    const-string v8, "FIXED64_LIST"

    const/16 v9, 0x17

    const/16 v10, 0x17

    move-object/from16 v7, v44

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v44, LVt7;->B:LVt7;

    new-instance v45, LVt7;

    const-string v8, "FIXED32_LIST"

    const/16 v9, 0x18

    const/16 v10, 0x18

    move-object/from16 v7, v45

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v45, LVt7;->C:LVt7;

    new-instance v46, LVt7;

    const-string v8, "BOOL_LIST"

    const/16 v9, 0x19

    const/16 v10, 0x19

    move-object/from16 v7, v46

    move-object/from16 v12, v24

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v46, LVt7;->D:LVt7;

    new-instance v47, LVt7;

    const-string v15, "STRING_LIST"

    const/16 v16, 0x1a

    const/16 v17, 0x1a

    move-object/from16 v14, v47

    move-object/from16 v19, v26

    invoke-direct/range {v14 .. v19}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v47, LVt7;->E:LVt7;

    new-instance v26, LVt7;

    const-string v8, "MESSAGE_LIST"

    const/16 v9, 0x1b

    const/16 v10, 0x1b

    move-object/from16 v7, v26

    move-object/from16 v12, v28

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v26, LVt7;->F:LVt7;

    new-instance v48, LVt7;

    const-string v15, "BYTES_LIST"

    const/16 v16, 0x1c

    const/16 v17, 0x1c

    move-object/from16 v14, v48

    move-object/from16 v19, v30

    invoke-direct/range {v14 .. v19}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v48, LVt7;->G:LVt7;

    new-instance v30, LVt7;

    const-string v8, "UINT32_LIST"

    const/16 v9, 0x1d

    const/16 v10, 0x1d

    move-object/from16 v7, v30

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v30, LVt7;->H:LVt7;

    new-instance v49, LVt7;

    const-string v8, "ENUM_LIST"

    const/16 v9, 0x1e

    const/16 v10, 0x1e

    move-object/from16 v7, v49

    move-object/from16 v12, v33

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v49, LVt7;->I:LVt7;

    new-instance v50, LVt7;

    const-string v8, "SFIXED32_LIST"

    const/16 v9, 0x1f

    const/16 v10, 0x1f

    move-object/from16 v7, v50

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v50, LVt7;->J:LVt7;

    new-instance v51, LVt7;

    const-string v8, "SFIXED64_LIST"

    const/16 v9, 0x20

    const/16 v10, 0x20

    move-object/from16 v7, v51

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v51, LVt7;->K:LVt7;

    new-instance v52, LVt7;

    const-string v8, "SINT32_LIST"

    const/16 v9, 0x21

    const/16 v10, 0x21

    move-object/from16 v7, v52

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v52, LVt7;->P:LVt7;

    new-instance v53, LVt7;

    const-string v8, "SINT64_LIST"

    const/16 v9, 0x22

    const/16 v10, 0x22

    move-object/from16 v7, v53

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v53, LVt7;->Q:LVt7;

    new-instance v54, LVt7;

    const-string v8, "DOUBLE_LIST_PACKED"

    const/16 v9, 0x23

    const/16 v10, 0x23

    const/4 v11, 0x3

    move-object/from16 v7, v54

    move-object v12, v13

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v54, LVt7;->R:LVt7;

    new-instance v13, LVt7;

    const-string v15, "FLOAT_LIST_PACKED"

    const/16 v16, 0x24

    const/16 v17, 0x24

    const/16 v18, 0x3

    move-object v14, v13

    move-object/from16 v19, v1

    invoke-direct/range {v14 .. v19}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v13, LVt7;->S:LVt7;

    new-instance v1, LVt7;

    const-string v8, "INT64_LIST_PACKED"

    const/16 v9, 0x25

    const/16 v10, 0x25

    move-object v7, v1

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v1, LVt7;->T:LVt7;

    new-instance v14, LVt7;

    const-string v8, "UINT64_LIST_PACKED"

    const/16 v9, 0x26

    const/16 v10, 0x26

    move-object v7, v14

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v14, LVt7;->U:LVt7;

    new-instance v15, LVt7;

    const-string v8, "INT32_LIST_PACKED"

    const/16 v9, 0x27

    const/16 v10, 0x27

    move-object v7, v15

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v15, LVt7;->W:LVt7;

    new-instance v16, LVt7;

    const-string v8, "FIXED64_LIST_PACKED"

    const/16 v9, 0x28

    const/16 v10, 0x28

    move-object/from16 v7, v16

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v16, LVt7;->X:LVt7;

    new-instance v17, LVt7;

    const-string v8, "FIXED32_LIST_PACKED"

    const/16 v9, 0x29

    const/16 v10, 0x29

    move-object/from16 v7, v17

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v17, LVt7;->Y:LVt7;

    new-instance v18, LVt7;

    const-string v8, "BOOL_LIST_PACKED"

    const/16 v9, 0x2a

    const/16 v10, 0x2a

    move-object/from16 v7, v18

    move-object/from16 v12, v24

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v18, LVt7;->Z:LVt7;

    new-instance v19, LVt7;

    const-string v8, "UINT32_LIST_PACKED"

    const/16 v9, 0x2b

    const/16 v10, 0x2b

    move-object/from16 v7, v19

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v19, LVt7;->p0:LVt7;

    new-instance v24, LVt7;

    const-string v8, "ENUM_LIST_PACKED"

    const/16 v9, 0x2c

    const/16 v10, 0x2c

    move-object/from16 v7, v24

    move-object/from16 v12, v33

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v24, LVt7;->q0:LVt7;

    new-instance v33, LVt7;

    const-string v8, "SFIXED32_LIST_PACKED"

    const/16 v9, 0x2d

    const/16 v10, 0x2d

    move-object/from16 v7, v33

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v33, LVt7;->r0:LVt7;

    new-instance v55, LVt7;

    const-string v8, "SFIXED64_LIST_PACKED"

    const/16 v9, 0x2e

    const/16 v10, 0x2e

    move-object/from16 v7, v55

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v55, LVt7;->s0:LVt7;

    new-instance v56, LVt7;

    const-string v8, "SINT32_LIST_PACKED"

    const/16 v9, 0x2f

    const/16 v10, 0x2f

    move-object/from16 v7, v56

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v56, LVt7;->t0:LVt7;

    new-instance v20, LVt7;

    const-string v8, "SINT64_LIST_PACKED"

    const/16 v9, 0x30

    const/16 v10, 0x30

    move-object/from16 v7, v20

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v20, LVt7;->u0:LVt7;

    new-instance v3, LVt7;

    const-string v8, "GROUP_LIST"

    const/16 v9, 0x31

    const/16 v10, 0x31

    const/4 v11, 0x2

    move-object v7, v3

    move-object/from16 v12, v28

    invoke-direct/range {v7 .. v12}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v3, LVt7;->v0:LVt7;

    new-instance v7, LVt7;

    const-string v58, "MAP"

    const/16 v59, 0x32

    const/16 v60, 0x32

    const/16 v61, 0x4

    sget-object v62, Lpu7;->e:Lpu7;

    move-object/from16 v57, v7

    invoke-direct/range {v57 .. v62}, LVt7;-><init>(Ljava/lang/String;IIILpu7;)V

    sput-object v7, LVt7;->w0:LVt7;

    const/16 v8, 0x33

    new-array v8, v8, [LVt7;

    const/4 v9, 0x0

    aput-object v6, v8, v9

    const/4 v6, 0x1

    aput-object v0, v8, v6

    const/4 v0, 0x2

    aput-object v2, v8, v0

    const/4 v0, 0x3

    aput-object v4, v8, v0

    const/4 v0, 0x4

    aput-object v5, v8, v0

    const/4 v0, 0x5

    aput-object v21, v8, v0

    const/4 v0, 0x6

    aput-object v22, v8, v0

    const/4 v0, 0x7

    aput-object v23, v8, v0

    const/16 v0, 0x8

    aput-object v25, v8, v0

    const/16 v0, 0x9

    aput-object v27, v8, v0

    const/16 v0, 0xa

    aput-object v29, v8, v0

    const/16 v0, 0xb

    aput-object v31, v8, v0

    const/16 v0, 0xc

    aput-object v32, v8, v0

    const/16 v0, 0xd

    aput-object v34, v8, v0

    const/16 v0, 0xe

    aput-object v35, v8, v0

    const/16 v0, 0xf

    aput-object v36, v8, v0

    const/16 v0, 0x10

    aput-object v37, v8, v0

    const/16 v0, 0x11

    aput-object v38, v8, v0

    const/16 v0, 0x12

    aput-object v39, v8, v0

    const/16 v0, 0x13

    aput-object v40, v8, v0

    const/16 v0, 0x14

    aput-object v41, v8, v0

    const/16 v0, 0x15

    aput-object v42, v8, v0

    const/16 v0, 0x16

    aput-object v43, v8, v0

    const/16 v0, 0x17

    aput-object v44, v8, v0

    const/16 v0, 0x18

    aput-object v45, v8, v0

    const/16 v0, 0x19

    aput-object v46, v8, v0

    const/16 v0, 0x1a

    aput-object v47, v8, v0

    const/16 v0, 0x1b

    aput-object v26, v8, v0

    const/16 v0, 0x1c

    aput-object v48, v8, v0

    const/16 v0, 0x1d

    aput-object v30, v8, v0

    const/16 v0, 0x1e

    aput-object v49, v8, v0

    const/16 v0, 0x1f

    aput-object v50, v8, v0

    const/16 v0, 0x20

    aput-object v51, v8, v0

    const/16 v0, 0x21

    aput-object v52, v8, v0

    const/16 v0, 0x22

    aput-object v53, v8, v0

    const/16 v0, 0x23

    aput-object v54, v8, v0

    const/16 v0, 0x24

    aput-object v13, v8, v0

    const/16 v0, 0x25

    aput-object v1, v8, v0

    const/16 v0, 0x26

    aput-object v14, v8, v0

    const/16 v0, 0x27

    aput-object v15, v8, v0

    const/16 v0, 0x28

    aput-object v16, v8, v0

    const/16 v0, 0x29

    aput-object v17, v8, v0

    const/16 v0, 0x2a

    aput-object v18, v8, v0

    const/16 v0, 0x2b

    aput-object v19, v8, v0

    const/16 v0, 0x2c

    aput-object v24, v8, v0

    const/16 v0, 0x2d

    aput-object v33, v8, v0

    const/16 v0, 0x2e

    aput-object v55, v8, v0

    const/16 v0, 0x2f

    aput-object v56, v8, v0

    const/16 v0, 0x30

    aput-object v20, v8, v0

    const/16 v0, 0x31

    aput-object v3, v8, v0

    const/16 v0, 0x32

    aput-object v7, v8, v0

    sput-object v8, LVt7;->y0:[LVt7;

    invoke-static {}, LVt7;->values()[LVt7;

    move-result-object v0

    array-length v1, v0

    new-array v2, v1, [LVt7;

    sput-object v2, LVt7;->x0:[LVt7;

    :goto_0
    if-ge v9, v1, :cond_0

    aget-object v2, v0, v9

    sget-object v3, LVt7;->x0:[LVt7;

    iget v4, v2, LVt7;->c:I

    aput-object v2, v3, v4

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIILpu7;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LVt7;->c:I

    iput-object p5, p0, LVt7;->b:Lpu7;

    sget-object p1, Lpu7;->e:Lpu7;

    add-int/lit8 p1, p4, -0x1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p3, 0x3

    if-eq p1, p3, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, LVt7;->d:Ljava/lang/Class;

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Lpu7;->a()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, LVt7;->d:Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {p5}, Lpu7;->a()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, LVt7;->d:Ljava/lang/Class;

    :goto_0
    if-ne p4, p2, :cond_2

    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    :cond_2
    return-void
.end method

.method public static values()[LVt7;
    .locals 1

    sget-object v0, LVt7;->y0:[LVt7;

    invoke-virtual {v0}, [LVt7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LVt7;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, LVt7;->c:I

    return v0
.end method
