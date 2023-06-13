.class public final enum Lka9;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum A:Lka9;

.field public static final enum B:Lka9;

.field public static final enum C:Lka9;

.field public static final enum D:Lka9;

.field public static final enum E:Lka9;

.field public static final enum F:Lka9;

.field public static final enum G:Lka9;

.field public static final enum H:Lka9;

.field public static final enum I:Lka9;

.field public static final enum J:Lka9;

.field public static final enum K:Lka9;

.field public static final enum P:Lka9;

.field public static final enum Q:Lka9;

.field public static final enum R:Lka9;

.field public static final enum S:Lka9;

.field public static final enum T:Lka9;

.field public static final enum U:Lka9;

.field public static final enum W:Lka9;

.field public static final enum X:Lka9;

.field public static final enum Y:Lka9;

.field public static final enum Z:Lka9;

.field public static final enum e:Lka9;

.field public static final enum f:Lka9;

.field public static final enum g:Lka9;

.field public static final enum h:Lka9;

.field public static final enum i:Lka9;

.field public static final enum j:Lka9;

.field public static final enum k:Lka9;

.field public static final enum l:Lka9;

.field public static final enum m:Lka9;

.field public static final enum n:Lka9;

.field public static final enum o:Lka9;

.field public static final enum p:Lka9;

.field public static final enum p0:Lka9;

.field public static final enum q:Lka9;

.field public static final enum q0:Lka9;

.field public static final enum r:Lka9;

.field public static final enum r0:Lka9;

.field public static final enum s:Lka9;

.field public static final enum s0:Lka9;

.field public static final enum t:Lka9;

.field public static final enum t0:Lka9;

.field public static final enum u:Lka9;

.field public static final enum u0:Lka9;

.field public static final enum v:Lka9;

.field public static final enum v0:Lka9;

.field public static final enum w:Lka9;

.field public static final enum w0:Lka9;

.field public static final enum x:Lka9;

.field public static final x0:[Lka9;

.field public static final enum y:Lka9;

.field public static final synthetic y0:[Lka9;

.field public static final enum z:Lka9;


# instance fields
.field public final b:LDc9;

.field public final c:I

.field public final d:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 63

    new-instance v6, Lka9;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    sget-object v13, LDc9;->i:LDc9;

    move-object v0, v6

    move-object v5, v13

    invoke-direct/range {v0 .. v5}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v6, Lka9;->e:Lka9;

    new-instance v0, Lka9;

    const-string v8, "FLOAT"

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x1

    sget-object v1, LDc9;->h:LDc9;

    move-object v7, v0

    move-object v12, v1

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v0, Lka9;->f:Lka9;

    new-instance v2, Lka9;

    const-string v15, "INT64"

    const/16 v16, 0x2

    const/16 v17, 0x2

    const/16 v18, 0x1

    sget-object v3, LDc9;->g:LDc9;

    move-object v14, v2

    move-object/from16 v19, v3

    invoke-direct/range {v14 .. v19}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v2, Lka9;->g:Lka9;

    new-instance v4, Lka9;

    const-string v8, "UINT64"

    const/4 v9, 0x3

    const/4 v10, 0x3

    move-object v7, v4

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v4, Lka9;->h:Lka9;

    new-instance v5, Lka9;

    const-string v15, "INT32"

    const/16 v16, 0x4

    const/16 v17, 0x4

    sget-object v20, LDc9;->f:LDc9;

    move-object v14, v5

    move-object/from16 v19, v20

    invoke-direct/range {v14 .. v19}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v5, Lka9;->i:Lka9;

    new-instance v21, Lka9;

    const-string v8, "FIXED64"

    const/4 v9, 0x5

    const/4 v10, 0x5

    move-object/from16 v7, v21

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v21, Lka9;->j:Lka9;

    new-instance v22, Lka9;

    const-string v8, "FIXED32"

    const/4 v9, 0x6

    const/4 v10, 0x6

    move-object/from16 v7, v22

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v22, Lka9;->k:Lka9;

    new-instance v23, Lka9;

    const-string v15, "BOOL"

    const/16 v16, 0x7

    const/16 v17, 0x7

    sget-object v24, LDc9;->j:LDc9;

    move-object/from16 v14, v23

    move-object/from16 v19, v24

    invoke-direct/range {v14 .. v19}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v23, Lka9;->l:Lka9;

    new-instance v25, Lka9;

    const-string v8, "STRING"

    const/16 v9, 0x8

    const/16 v10, 0x8

    sget-object v26, LDc9;->k:LDc9;

    move-object/from16 v7, v25

    move-object/from16 v12, v26

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v25, Lka9;->m:Lka9;

    new-instance v27, Lka9;

    const-string v15, "MESSAGE"

    const/16 v16, 0x9

    const/16 v17, 0x9

    sget-object v28, LDc9;->n:LDc9;

    move-object/from16 v14, v27

    move-object/from16 v19, v28

    invoke-direct/range {v14 .. v19}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v27, Lka9;->n:Lka9;

    new-instance v29, Lka9;

    const-string v8, "BYTES"

    const/16 v9, 0xa

    const/16 v10, 0xa

    sget-object v30, LDc9;->l:LDc9;

    move-object/from16 v7, v29

    move-object/from16 v12, v30

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v29, Lka9;->o:Lka9;

    new-instance v31, Lka9;

    const-string v8, "UINT32"

    const/16 v9, 0xb

    const/16 v10, 0xb

    move-object/from16 v7, v31

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v31, Lka9;->p:Lka9;

    new-instance v32, Lka9;

    const-string v15, "ENUM"

    const/16 v16, 0xc

    const/16 v17, 0xc

    sget-object v33, LDc9;->m:LDc9;

    move-object/from16 v14, v32

    move-object/from16 v19, v33

    invoke-direct/range {v14 .. v19}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v32, Lka9;->q:Lka9;

    new-instance v34, Lka9;

    const-string v8, "SFIXED32"

    const/16 v9, 0xd

    const/16 v10, 0xd

    move-object/from16 v7, v34

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v34, Lka9;->r:Lka9;

    new-instance v35, Lka9;

    const-string v8, "SFIXED64"

    const/16 v9, 0xe

    const/16 v10, 0xe

    move-object/from16 v7, v35

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v35, Lka9;->s:Lka9;

    new-instance v36, Lka9;

    const-string v8, "SINT32"

    const/16 v9, 0xf

    const/16 v10, 0xf

    move-object/from16 v7, v36

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v36, Lka9;->t:Lka9;

    new-instance v37, Lka9;

    const-string v8, "SINT64"

    const/16 v9, 0x10

    const/16 v10, 0x10

    move-object/from16 v7, v37

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v37, Lka9;->u:Lka9;

    new-instance v38, Lka9;

    const-string v8, "GROUP"

    const/16 v9, 0x11

    const/16 v10, 0x11

    move-object/from16 v7, v38

    move-object/from16 v12, v28

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v38, Lka9;->v:Lka9;

    new-instance v39, Lka9;

    const-string v8, "DOUBLE_LIST"

    const/16 v9, 0x12

    const/16 v10, 0x12

    const/4 v11, 0x2

    move-object/from16 v7, v39

    move-object v12, v13

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v39, Lka9;->w:Lka9;

    new-instance v40, Lka9;

    const-string v15, "FLOAT_LIST"

    const/16 v16, 0x13

    const/16 v17, 0x13

    const/16 v18, 0x2

    move-object/from16 v14, v40

    move-object/from16 v19, v1

    invoke-direct/range {v14 .. v19}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v40, Lka9;->x:Lka9;

    new-instance v41, Lka9;

    const-string v8, "INT64_LIST"

    const/16 v9, 0x14

    const/16 v10, 0x14

    move-object/from16 v7, v41

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v41, Lka9;->y:Lka9;

    new-instance v42, Lka9;

    const-string v8, "UINT64_LIST"

    const/16 v9, 0x15

    const/16 v10, 0x15

    move-object/from16 v7, v42

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v42, Lka9;->z:Lka9;

    new-instance v43, Lka9;

    const-string v8, "INT32_LIST"

    const/16 v9, 0x16

    const/16 v10, 0x16

    move-object/from16 v7, v43

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v43, Lka9;->A:Lka9;

    new-instance v44, Lka9;

    const-string v8, "FIXED64_LIST"

    const/16 v9, 0x17

    const/16 v10, 0x17

    move-object/from16 v7, v44

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v44, Lka9;->B:Lka9;

    new-instance v45, Lka9;

    const-string v8, "FIXED32_LIST"

    const/16 v9, 0x18

    const/16 v10, 0x18

    move-object/from16 v7, v45

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v45, Lka9;->C:Lka9;

    new-instance v46, Lka9;

    const-string v8, "BOOL_LIST"

    const/16 v9, 0x19

    const/16 v10, 0x19

    move-object/from16 v7, v46

    move-object/from16 v12, v24

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v46, Lka9;->D:Lka9;

    new-instance v47, Lka9;

    const-string v15, "STRING_LIST"

    const/16 v16, 0x1a

    const/16 v17, 0x1a

    move-object/from16 v14, v47

    move-object/from16 v19, v26

    invoke-direct/range {v14 .. v19}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v47, Lka9;->E:Lka9;

    new-instance v26, Lka9;

    const-string v8, "MESSAGE_LIST"

    const/16 v9, 0x1b

    const/16 v10, 0x1b

    move-object/from16 v7, v26

    move-object/from16 v12, v28

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v26, Lka9;->F:Lka9;

    new-instance v48, Lka9;

    const-string v15, "BYTES_LIST"

    const/16 v16, 0x1c

    const/16 v17, 0x1c

    move-object/from16 v14, v48

    move-object/from16 v19, v30

    invoke-direct/range {v14 .. v19}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v48, Lka9;->G:Lka9;

    new-instance v30, Lka9;

    const-string v8, "UINT32_LIST"

    const/16 v9, 0x1d

    const/16 v10, 0x1d

    move-object/from16 v7, v30

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v30, Lka9;->H:Lka9;

    new-instance v49, Lka9;

    const-string v8, "ENUM_LIST"

    const/16 v9, 0x1e

    const/16 v10, 0x1e

    move-object/from16 v7, v49

    move-object/from16 v12, v33

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v49, Lka9;->I:Lka9;

    new-instance v50, Lka9;

    const-string v8, "SFIXED32_LIST"

    const/16 v9, 0x1f

    const/16 v10, 0x1f

    move-object/from16 v7, v50

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v50, Lka9;->J:Lka9;

    new-instance v51, Lka9;

    const-string v8, "SFIXED64_LIST"

    const/16 v9, 0x20

    const/16 v10, 0x20

    move-object/from16 v7, v51

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v51, Lka9;->K:Lka9;

    new-instance v52, Lka9;

    const-string v8, "SINT32_LIST"

    const/16 v9, 0x21

    const/16 v10, 0x21

    move-object/from16 v7, v52

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v52, Lka9;->P:Lka9;

    new-instance v53, Lka9;

    const-string v8, "SINT64_LIST"

    const/16 v9, 0x22

    const/16 v10, 0x22

    move-object/from16 v7, v53

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v53, Lka9;->Q:Lka9;

    new-instance v54, Lka9;

    const-string v8, "DOUBLE_LIST_PACKED"

    const/16 v9, 0x23

    const/16 v10, 0x23

    const/4 v11, 0x3

    move-object/from16 v7, v54

    move-object v12, v13

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v54, Lka9;->R:Lka9;

    new-instance v13, Lka9;

    const-string v15, "FLOAT_LIST_PACKED"

    const/16 v16, 0x24

    const/16 v17, 0x24

    const/16 v18, 0x3

    move-object v14, v13

    move-object/from16 v19, v1

    invoke-direct/range {v14 .. v19}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v13, Lka9;->S:Lka9;

    new-instance v1, Lka9;

    const-string v8, "INT64_LIST_PACKED"

    const/16 v9, 0x25

    const/16 v10, 0x25

    move-object v7, v1

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v1, Lka9;->T:Lka9;

    new-instance v14, Lka9;

    const-string v8, "UINT64_LIST_PACKED"

    const/16 v9, 0x26

    const/16 v10, 0x26

    move-object v7, v14

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v14, Lka9;->U:Lka9;

    new-instance v15, Lka9;

    const-string v8, "INT32_LIST_PACKED"

    const/16 v9, 0x27

    const/16 v10, 0x27

    move-object v7, v15

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v15, Lka9;->W:Lka9;

    new-instance v16, Lka9;

    const-string v8, "FIXED64_LIST_PACKED"

    const/16 v9, 0x28

    const/16 v10, 0x28

    move-object/from16 v7, v16

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v16, Lka9;->X:Lka9;

    new-instance v17, Lka9;

    const-string v8, "FIXED32_LIST_PACKED"

    const/16 v9, 0x29

    const/16 v10, 0x29

    move-object/from16 v7, v17

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v17, Lka9;->Y:Lka9;

    new-instance v18, Lka9;

    const-string v8, "BOOL_LIST_PACKED"

    const/16 v9, 0x2a

    const/16 v10, 0x2a

    move-object/from16 v7, v18

    move-object/from16 v12, v24

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v18, Lka9;->Z:Lka9;

    new-instance v19, Lka9;

    const-string v8, "UINT32_LIST_PACKED"

    const/16 v9, 0x2b

    const/16 v10, 0x2b

    move-object/from16 v7, v19

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v19, Lka9;->p0:Lka9;

    new-instance v24, Lka9;

    const-string v8, "ENUM_LIST_PACKED"

    const/16 v9, 0x2c

    const/16 v10, 0x2c

    move-object/from16 v7, v24

    move-object/from16 v12, v33

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v24, Lka9;->q0:Lka9;

    new-instance v33, Lka9;

    const-string v8, "SFIXED32_LIST_PACKED"

    const/16 v9, 0x2d

    const/16 v10, 0x2d

    move-object/from16 v7, v33

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v33, Lka9;->r0:Lka9;

    new-instance v55, Lka9;

    const-string v8, "SFIXED64_LIST_PACKED"

    const/16 v9, 0x2e

    const/16 v10, 0x2e

    move-object/from16 v7, v55

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v55, Lka9;->s0:Lka9;

    new-instance v56, Lka9;

    const-string v8, "SINT32_LIST_PACKED"

    const/16 v9, 0x2f

    const/16 v10, 0x2f

    move-object/from16 v7, v56

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v56, Lka9;->t0:Lka9;

    new-instance v20, Lka9;

    const-string v8, "SINT64_LIST_PACKED"

    const/16 v9, 0x30

    const/16 v10, 0x30

    move-object/from16 v7, v20

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v20, Lka9;->u0:Lka9;

    new-instance v3, Lka9;

    const-string v8, "GROUP_LIST"

    const/16 v9, 0x31

    const/16 v10, 0x31

    const/4 v11, 0x2

    move-object v7, v3

    move-object/from16 v12, v28

    invoke-direct/range {v7 .. v12}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v3, Lka9;->v0:Lka9;

    new-instance v7, Lka9;

    const-string v58, "MAP"

    const/16 v59, 0x32

    const/16 v60, 0x32

    const/16 v61, 0x4

    sget-object v62, LDc9;->e:LDc9;

    move-object/from16 v57, v7

    invoke-direct/range {v57 .. v62}, Lka9;-><init>(Ljava/lang/String;IIILDc9;)V

    sput-object v7, Lka9;->w0:Lka9;

    const/16 v8, 0x33

    new-array v8, v8, [Lka9;

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

    sput-object v8, Lka9;->y0:[Lka9;

    invoke-static {}, Lka9;->values()[Lka9;

    move-result-object v0

    array-length v1, v0

    new-array v2, v1, [Lka9;

    sput-object v2, Lka9;->x0:[Lka9;

    :goto_0
    if-ge v9, v1, :cond_0

    aget-object v2, v0, v9

    sget-object v3, Lka9;->x0:[Lka9;

    iget v4, v2, Lka9;->c:I

    aput-object v2, v3, v4

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIILDc9;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lka9;->c:I

    iput-object p5, p0, Lka9;->b:LDc9;

    sget-object p1, LDc9;->e:LDc9;

    add-int/lit8 p1, p4, -0x1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p3, 0x3

    if-eq p1, p3, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lka9;->d:Ljava/lang/Class;

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, LDc9;->a()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lka9;->d:Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {p5}, LDc9;->a()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lka9;->d:Ljava/lang/Class;

    :goto_0
    if-ne p4, p2, :cond_2

    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    :cond_2
    return-void
.end method

.method public static values()[Lka9;
    .locals 1

    sget-object v0, Lka9;->y0:[Lka9;

    invoke-virtual {v0}, [Lka9;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lka9;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lka9;->c:I

    return v0
.end method
