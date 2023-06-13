.class public final enum Lr48;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum A:Lr48;

.field public static final enum B:Lr48;

.field public static final enum C:Lr48;

.field public static final enum D:Lr48;

.field public static final enum E:Lr48;

.field public static final enum F:Lr48;

.field public static final enum G:Lr48;

.field public static final enum H:Lr48;

.field public static final enum I:Lr48;

.field public static final enum J:Lr48;

.field public static final enum K:Lr48;

.field public static final enum P:Lr48;

.field public static final enum Q:Lr48;

.field public static final enum R:Lr48;

.field public static final enum S:Lr48;

.field public static final enum T:Lr48;

.field public static final enum U:Lr48;

.field public static final enum W:Lr48;

.field public static final enum X:Lr48;

.field public static final enum Y:Lr48;

.field public static final enum Z:Lr48;

.field public static final enum e:Lr48;

.field public static final enum f:Lr48;

.field public static final enum g:Lr48;

.field public static final enum h:Lr48;

.field public static final enum i:Lr48;

.field public static final enum j:Lr48;

.field public static final enum k:Lr48;

.field public static final enum l:Lr48;

.field public static final enum m:Lr48;

.field public static final enum n:Lr48;

.field public static final enum o:Lr48;

.field public static final enum p:Lr48;

.field public static final enum p0:Lr48;

.field public static final enum q:Lr48;

.field public static final enum q0:Lr48;

.field public static final enum r:Lr48;

.field public static final enum r0:Lr48;

.field public static final enum s:Lr48;

.field public static final enum s0:Lr48;

.field public static final enum t:Lr48;

.field public static final enum t0:Lr48;

.field public static final enum u:Lr48;

.field public static final enum u0:Lr48;

.field public static final enum v:Lr48;

.field public static final enum v0:Lr48;

.field public static final enum w:Lr48;

.field public static final enum w0:Lr48;

.field public static final enum x:Lr48;

.field public static final x0:[Lr48;

.field public static final enum y:Lr48;

.field public static final synthetic y0:[Lr48;

.field public static final enum z:Lr48;


# instance fields
.field public final b:Lvb8;

.field public final c:I

.field public final d:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 63

    new-instance v6, Lr48;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    sget-object v13, Lvb8;->i:Lvb8;

    move-object v0, v6

    move-object v5, v13

    invoke-direct/range {v0 .. v5}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v6, Lr48;->e:Lr48;

    new-instance v0, Lr48;

    sget-object v1, Lvb8;->h:Lvb8;

    const-string v8, "FLOAT"

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x1

    move-object v7, v0

    move-object v12, v1

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v0, Lr48;->f:Lr48;

    new-instance v2, Lr48;

    const-string v15, "INT64"

    const/16 v16, 0x2

    const/16 v17, 0x2

    const/16 v18, 0x1

    sget-object v3, Lvb8;->g:Lvb8;

    move-object v14, v2

    move-object/from16 v19, v3

    invoke-direct/range {v14 .. v19}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v2, Lr48;->g:Lr48;

    new-instance v4, Lr48;

    const-string v8, "UINT64"

    const/4 v9, 0x3

    const/4 v10, 0x3

    move-object v7, v4

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v4, Lr48;->h:Lr48;

    new-instance v5, Lr48;

    const-string v15, "INT32"

    const/16 v16, 0x4

    const/16 v17, 0x4

    sget-object v20, Lvb8;->f:Lvb8;

    move-object v14, v5

    move-object/from16 v19, v20

    invoke-direct/range {v14 .. v19}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v5, Lr48;->i:Lr48;

    new-instance v14, Lr48;

    const-string v8, "FIXED64"

    const/4 v9, 0x5

    const/4 v10, 0x5

    move-object v7, v14

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v14, Lr48;->j:Lr48;

    new-instance v15, Lr48;

    const-string v8, "FIXED32"

    const/4 v10, 0x6

    move-object v7, v15

    move v9, v10

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v15, Lr48;->k:Lr48;

    new-instance v16, Lr48;

    const-string v22, "BOOL"

    const/16 v24, 0x7

    const/16 v25, 0x1

    sget-object v17, Lvb8;->j:Lvb8;

    move-object/from16 v21, v16

    move/from16 v23, v24

    move-object/from16 v26, v17

    invoke-direct/range {v21 .. v26}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v16, Lr48;->l:Lr48;

    new-instance v18, Lr48;

    const-string v8, "STRING"

    const/16 v10, 0x8

    sget-object v26, Lvb8;->k:Lvb8;

    move-object/from16 v7, v18

    move v9, v10

    move-object/from16 v12, v26

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v18, Lr48;->m:Lr48;

    new-instance v19, Lr48;

    const-string v28, "MESSAGE"

    const/16 v30, 0x9

    const/16 v31, 0x1

    sget-object v33, Lvb8;->n:Lvb8;

    move-object/from16 v27, v19

    move/from16 v29, v30

    move-object/from16 v32, v33

    invoke-direct/range {v27 .. v32}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v19, Lr48;->n:Lr48;

    new-instance v27, Lr48;

    sget-object v28, Lvb8;->l:Lvb8;

    const-string v8, "BYTES"

    const/16 v10, 0xa

    move-object/from16 v7, v27

    move v9, v10

    move-object/from16 v12, v28

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v27, Lr48;->o:Lr48;

    new-instance v29, Lr48;

    const-string v8, "UINT32"

    const/16 v10, 0xb

    move-object/from16 v7, v29

    move v9, v10

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v29, Lr48;->p:Lr48;

    new-instance v30, Lr48;

    const-string v35, "ENUM"

    const/16 v37, 0xc

    const/16 v38, 0x1

    sget-object v31, Lvb8;->m:Lvb8;

    move-object/from16 v34, v30

    move/from16 v36, v37

    move-object/from16 v39, v31

    invoke-direct/range {v34 .. v39}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v30, Lr48;->q:Lr48;

    new-instance v32, Lr48;

    const-string v8, "SFIXED32"

    const/16 v10, 0xd

    move-object/from16 v7, v32

    move v9, v10

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v32, Lr48;->r:Lr48;

    new-instance v34, Lr48;

    const-string v8, "SFIXED64"

    const/16 v10, 0xe

    move-object/from16 v7, v34

    move v9, v10

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v34, Lr48;->s:Lr48;

    new-instance v35, Lr48;

    const-string v8, "SINT32"

    const/16 v10, 0xf

    move-object/from16 v7, v35

    move v9, v10

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v35, Lr48;->t:Lr48;

    new-instance v36, Lr48;

    const-string v8, "SINT64"

    const/16 v10, 0x10

    move-object/from16 v7, v36

    move v9, v10

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v36, Lr48;->u:Lr48;

    new-instance v37, Lr48;

    const-string v8, "GROUP"

    const/16 v10, 0x11

    move-object/from16 v7, v37

    move v9, v10

    move-object/from16 v12, v33

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v37, Lr48;->v:Lr48;

    new-instance v38, Lr48;

    const-string v8, "DOUBLE_LIST"

    const/16 v10, 0x12

    const/4 v11, 0x2

    move-object/from16 v7, v38

    move v9, v10

    move-object v12, v13

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v38, Lr48;->w:Lr48;

    new-instance v39, Lr48;

    const-string v8, "FLOAT_LIST"

    const/16 v10, 0x13

    move-object/from16 v7, v39

    move v9, v10

    move-object v12, v1

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v39, Lr48;->x:Lr48;

    new-instance v40, Lr48;

    const-string v8, "INT64_LIST"

    const/16 v10, 0x14

    move-object/from16 v7, v40

    move v9, v10

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v40, Lr48;->y:Lr48;

    new-instance v41, Lr48;

    const-string v8, "UINT64_LIST"

    const/16 v10, 0x15

    move-object/from16 v7, v41

    move v9, v10

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v41, Lr48;->z:Lr48;

    new-instance v42, Lr48;

    const-string v8, "INT32_LIST"

    const/16 v10, 0x16

    move-object/from16 v7, v42

    move v9, v10

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v42, Lr48;->A:Lr48;

    new-instance v43, Lr48;

    const-string v8, "FIXED64_LIST"

    const/16 v10, 0x17

    move-object/from16 v7, v43

    move v9, v10

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v43, Lr48;->B:Lr48;

    new-instance v44, Lr48;

    const-string v8, "FIXED32_LIST"

    const/16 v10, 0x18

    move-object/from16 v7, v44

    move v9, v10

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v44, Lr48;->C:Lr48;

    new-instance v45, Lr48;

    const-string v8, "BOOL_LIST"

    const/16 v10, 0x19

    move-object/from16 v7, v45

    move v9, v10

    move-object/from16 v12, v17

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v45, Lr48;->D:Lr48;

    new-instance v46, Lr48;

    const-string v22, "STRING_LIST"

    const/16 v24, 0x1a

    const/16 v25, 0x2

    move-object/from16 v21, v46

    move/from16 v23, v24

    invoke-direct/range {v21 .. v26}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v46, Lr48;->E:Lr48;

    new-instance v21, Lr48;

    const-string v8, "MESSAGE_LIST"

    const/16 v10, 0x1b

    move-object/from16 v7, v21

    move v9, v10

    move-object/from16 v12, v33

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v21, Lr48;->F:Lr48;

    new-instance v22, Lr48;

    const-string v8, "BYTES_LIST"

    const/16 v10, 0x1c

    move-object/from16 v7, v22

    move v9, v10

    move-object/from16 v12, v28

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v22, Lr48;->G:Lr48;

    new-instance v23, Lr48;

    const-string v8, "UINT32_LIST"

    const/16 v10, 0x1d

    move-object/from16 v7, v23

    move v9, v10

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v23, Lr48;->H:Lr48;

    new-instance v24, Lr48;

    const-string v8, "ENUM_LIST"

    const/16 v10, 0x1e

    move-object/from16 v7, v24

    move v9, v10

    move-object/from16 v12, v31

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v24, Lr48;->I:Lr48;

    new-instance v25, Lr48;

    const-string v8, "SFIXED32_LIST"

    const/16 v10, 0x1f

    move-object/from16 v7, v25

    move v9, v10

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v25, Lr48;->J:Lr48;

    new-instance v26, Lr48;

    const-string v8, "SFIXED64_LIST"

    const/16 v10, 0x20

    move-object/from16 v7, v26

    move v9, v10

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v26, Lr48;->K:Lr48;

    new-instance v28, Lr48;

    const-string v8, "SINT32_LIST"

    const/16 v10, 0x21

    move-object/from16 v7, v28

    move v9, v10

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v28, Lr48;->P:Lr48;

    new-instance v47, Lr48;

    const-string v8, "SINT64_LIST"

    const/16 v10, 0x22

    move-object/from16 v7, v47

    move v9, v10

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v47, Lr48;->Q:Lr48;

    new-instance v48, Lr48;

    const-string v8, "DOUBLE_LIST_PACKED"

    const/16 v10, 0x23

    const/4 v11, 0x3

    move-object/from16 v7, v48

    move v9, v10

    move-object v12, v13

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v48, Lr48;->R:Lr48;

    new-instance v13, Lr48;

    const-string v8, "FLOAT_LIST_PACKED"

    const/16 v10, 0x24

    move-object v7, v13

    move v9, v10

    move-object v12, v1

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v13, Lr48;->S:Lr48;

    new-instance v1, Lr48;

    const-string v8, "INT64_LIST_PACKED"

    const/16 v10, 0x25

    move-object v7, v1

    move v9, v10

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v1, Lr48;->T:Lr48;

    new-instance v49, Lr48;

    const-string v8, "UINT64_LIST_PACKED"

    const/16 v10, 0x26

    move-object/from16 v7, v49

    move v9, v10

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v49, Lr48;->U:Lr48;

    new-instance v50, Lr48;

    const-string v8, "INT32_LIST_PACKED"

    const/16 v10, 0x27

    move-object/from16 v7, v50

    move v9, v10

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v50, Lr48;->W:Lr48;

    new-instance v51, Lr48;

    const-string v8, "FIXED64_LIST_PACKED"

    const/16 v10, 0x28

    move-object/from16 v7, v51

    move v9, v10

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v51, Lr48;->X:Lr48;

    new-instance v52, Lr48;

    const-string v8, "FIXED32_LIST_PACKED"

    const/16 v10, 0x29

    move-object/from16 v7, v52

    move v9, v10

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v52, Lr48;->Y:Lr48;

    new-instance v53, Lr48;

    const-string v8, "BOOL_LIST_PACKED"

    const/16 v10, 0x2a

    move-object/from16 v7, v53

    move v9, v10

    move-object/from16 v12, v17

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v53, Lr48;->Z:Lr48;

    new-instance v17, Lr48;

    const-string v8, "UINT32_LIST_PACKED"

    const/16 v10, 0x2b

    move-object/from16 v7, v17

    move v9, v10

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v17, Lr48;->p0:Lr48;

    new-instance v54, Lr48;

    const-string v8, "ENUM_LIST_PACKED"

    const/16 v10, 0x2c

    move-object/from16 v7, v54

    move v9, v10

    move-object/from16 v12, v31

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v54, Lr48;->q0:Lr48;

    new-instance v31, Lr48;

    const-string v8, "SFIXED32_LIST_PACKED"

    const/16 v10, 0x2d

    move-object/from16 v7, v31

    move v9, v10

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v31, Lr48;->r0:Lr48;

    new-instance v55, Lr48;

    const-string v8, "SFIXED64_LIST_PACKED"

    const/16 v10, 0x2e

    move-object/from16 v7, v55

    move v9, v10

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v55, Lr48;->s0:Lr48;

    new-instance v56, Lr48;

    const-string v8, "SINT32_LIST_PACKED"

    const/16 v10, 0x2f

    move-object/from16 v7, v56

    move v9, v10

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v56, Lr48;->t0:Lr48;

    new-instance v20, Lr48;

    const-string v8, "SINT64_LIST_PACKED"

    const/16 v10, 0x30

    move-object/from16 v7, v20

    move v9, v10

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v20, Lr48;->u0:Lr48;

    new-instance v3, Lr48;

    const-string v8, "GROUP_LIST"

    const/16 v10, 0x31

    const/4 v11, 0x2

    move-object v7, v3

    move v9, v10

    move-object/from16 v12, v33

    invoke-direct/range {v7 .. v12}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v3, Lr48;->v0:Lr48;

    new-instance v7, Lr48;

    const-string v58, "MAP"

    const/16 v60, 0x32

    const/16 v61, 0x4

    sget-object v62, Lvb8;->e:Lvb8;

    move-object/from16 v57, v7

    move/from16 v59, v60

    invoke-direct/range {v57 .. v62}, Lr48;-><init>(Ljava/lang/String;IIILvb8;)V

    sput-object v7, Lr48;->w0:Lr48;

    const/16 v8, 0x33

    new-array v8, v8, [Lr48;

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

    aput-object v14, v8, v0

    const/4 v0, 0x6

    aput-object v15, v8, v0

    const/4 v0, 0x7

    aput-object v16, v8, v0

    const/16 v0, 0x8

    aput-object v18, v8, v0

    const/16 v0, 0x9

    aput-object v19, v8, v0

    const/16 v0, 0xa

    aput-object v27, v8, v0

    const/16 v0, 0xb

    aput-object v29, v8, v0

    const/16 v0, 0xc

    aput-object v30, v8, v0

    const/16 v0, 0xd

    aput-object v32, v8, v0

    const/16 v0, 0xe

    aput-object v34, v8, v0

    const/16 v0, 0xf

    aput-object v35, v8, v0

    const/16 v0, 0x10

    aput-object v36, v8, v0

    const/16 v0, 0x11

    aput-object v37, v8, v0

    const/16 v0, 0x12

    aput-object v38, v8, v0

    const/16 v0, 0x13

    aput-object v39, v8, v0

    const/16 v0, 0x14

    aput-object v40, v8, v0

    const/16 v0, 0x15

    aput-object v41, v8, v0

    const/16 v0, 0x16

    aput-object v42, v8, v0

    const/16 v0, 0x17

    aput-object v43, v8, v0

    const/16 v0, 0x18

    aput-object v44, v8, v0

    const/16 v0, 0x19

    aput-object v45, v8, v0

    const/16 v0, 0x1a

    aput-object v46, v8, v0

    const/16 v0, 0x1b

    aput-object v21, v8, v0

    const/16 v0, 0x1c

    aput-object v22, v8, v0

    const/16 v0, 0x1d

    aput-object v23, v8, v0

    const/16 v0, 0x1e

    aput-object v24, v8, v0

    const/16 v0, 0x1f

    aput-object v25, v8, v0

    const/16 v0, 0x20

    aput-object v26, v8, v0

    const/16 v0, 0x21

    aput-object v28, v8, v0

    const/16 v0, 0x22

    aput-object v47, v8, v0

    const/16 v0, 0x23

    aput-object v48, v8, v0

    const/16 v0, 0x24

    aput-object v13, v8, v0

    const/16 v0, 0x25

    aput-object v1, v8, v0

    const/16 v0, 0x26

    aput-object v49, v8, v0

    const/16 v0, 0x27

    aput-object v50, v8, v0

    const/16 v0, 0x28

    aput-object v51, v8, v0

    const/16 v0, 0x29

    aput-object v52, v8, v0

    const/16 v0, 0x2a

    aput-object v53, v8, v0

    const/16 v0, 0x2b

    aput-object v17, v8, v0

    const/16 v0, 0x2c

    aput-object v54, v8, v0

    const/16 v0, 0x2d

    aput-object v31, v8, v0

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

    sput-object v8, Lr48;->y0:[Lr48;

    invoke-static {}, Lr48;->values()[Lr48;

    move-result-object v0

    array-length v1, v0

    new-array v2, v1, [Lr48;

    sput-object v2, Lr48;->x0:[Lr48;

    :goto_0
    if-ge v9, v1, :cond_0

    aget-object v2, v0, v9

    sget-object v3, Lr48;->x0:[Lr48;

    iget v4, v2, Lr48;->c:I

    aput-object v2, v3, v4

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIILvb8;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lr48;->c:I

    iput-object p5, p0, Lr48;->b:Lvb8;

    sget-object p1, Lvb8;->e:Lvb8;

    add-int/lit8 p1, p4, -0x1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p3, 0x3

    if-eq p1, p3, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lr48;->d:Ljava/lang/Class;

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Lvb8;->a()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lr48;->d:Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {p5}, Lvb8;->a()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lr48;->d:Ljava/lang/Class;

    :goto_0
    if-ne p4, p2, :cond_2

    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    :cond_2
    return-void
.end method

.method public static values()[Lr48;
    .locals 1

    sget-object v0, Lr48;->y0:[Lr48;

    invoke-virtual {v0}, [Lr48;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr48;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lr48;->c:I

    return v0
.end method
