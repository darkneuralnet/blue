.class public final enum LZk1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZk1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LZk1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum A:LZk1;

.field public static final A0:[Ljava/lang/reflect/Type;

.field public static final enum B:LZk1;

.field public static final synthetic B0:[LZk1;

.field public static final enum C:LZk1;

.field public static final enum D:LZk1;

.field public static final enum E:LZk1;

.field public static final enum F:LZk1;

.field public static final enum G:LZk1;

.field public static final enum H:LZk1;

.field public static final enum I:LZk1;

.field public static final enum J:LZk1;

.field public static final enum K:LZk1;

.field public static final enum P:LZk1;

.field public static final enum Q:LZk1;

.field public static final enum R:LZk1;

.field public static final enum S:LZk1;

.field public static final enum T:LZk1;

.field public static final enum U:LZk1;

.field public static final enum W:LZk1;

.field public static final enum X:LZk1;

.field public static final enum Y:LZk1;

.field public static final enum Z:LZk1;

.field public static final enum g:LZk1;

.field public static final enum h:LZk1;

.field public static final enum i:LZk1;

.field public static final enum j:LZk1;

.field public static final enum k:LZk1;

.field public static final enum l:LZk1;

.field public static final enum m:LZk1;

.field public static final enum n:LZk1;

.field public static final enum o:LZk1;

.field public static final enum p:LZk1;

.field public static final enum p0:LZk1;

.field public static final enum q:LZk1;

.field public static final enum q0:LZk1;

.field public static final enum r:LZk1;

.field public static final enum r0:LZk1;

.field public static final enum s:LZk1;

.field public static final enum s0:LZk1;

.field public static final enum t:LZk1;

.field public static final enum t0:LZk1;

.field public static final enum u:LZk1;

.field public static final enum u0:LZk1;

.field public static final enum v:LZk1;

.field public static final enum v0:LZk1;

.field public static final enum w:LZk1;

.field public static final enum w0:LZk1;

.field public static final enum x:LZk1;

.field public static final enum x0:LZk1;

.field public static final enum y:LZk1;

.field public static final enum y0:LZk1;

.field public static final enum z:LZk1;

.field public static final z0:[LZk1;


# instance fields
.field public final b:Lvh2;

.field public final c:I

.field public final d:LZk1$b;

.field public final e:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final f:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 65

    new-instance v6, LZk1;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v13, LZk1$b;->c:LZk1$b;

    sget-object v14, Lvh2;->i:Lvh2;

    move-object v0, v6

    move-object v4, v13

    move-object v5, v14

    invoke-direct/range {v0 .. v5}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v6, LZk1;->g:LZk1;

    new-instance v0, LZk1;

    const-string v8, "FLOAT"

    const/4 v9, 0x1

    const/4 v10, 0x1

    sget-object v1, Lvh2;->h:Lvh2;

    move-object v7, v0

    move-object v11, v13

    move-object v12, v1

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v0, LZk1;->h:LZk1;

    new-instance v2, LZk1;

    const-string v8, "INT64"

    const/4 v9, 0x2

    const/4 v10, 0x2

    sget-object v3, Lvh2;->g:Lvh2;

    move-object v7, v2

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v2, LZk1;->i:LZk1;

    new-instance v4, LZk1;

    const-string v8, "UINT64"

    const/4 v9, 0x3

    const/4 v10, 0x3

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v4, LZk1;->j:LZk1;

    new-instance v5, LZk1;

    const-string v8, "INT32"

    const/4 v9, 0x4

    const/4 v10, 0x4

    sget-object v21, Lvh2;->f:Lvh2;

    move-object v7, v5

    move-object/from16 v12, v21

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v5, LZk1;->k:LZk1;

    new-instance v22, LZk1;

    const-string v8, "FIXED64"

    const/4 v9, 0x5

    const/4 v10, 0x5

    move-object/from16 v7, v22

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v22, LZk1;->l:LZk1;

    new-instance v23, LZk1;

    const-string v8, "FIXED32"

    const/4 v9, 0x6

    const/4 v10, 0x6

    move-object/from16 v7, v23

    move-object/from16 v12, v21

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v23, LZk1;->m:LZk1;

    new-instance v24, LZk1;

    const-string v8, "BOOL"

    const/4 v9, 0x7

    const/4 v10, 0x7

    sget-object v25, Lvh2;->j:Lvh2;

    move-object/from16 v7, v24

    move-object/from16 v12, v25

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v24, LZk1;->n:LZk1;

    new-instance v26, LZk1;

    const-string v8, "STRING"

    const/16 v9, 0x8

    const/16 v10, 0x8

    sget-object v27, Lvh2;->k:Lvh2;

    move-object/from16 v7, v26

    move-object/from16 v12, v27

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v26, LZk1;->o:LZk1;

    new-instance v28, LZk1;

    const-string v8, "MESSAGE"

    const/16 v9, 0x9

    const/16 v10, 0x9

    sget-object v29, Lvh2;->n:Lvh2;

    move-object/from16 v7, v28

    move-object/from16 v12, v29

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v28, LZk1;->p:LZk1;

    new-instance v30, LZk1;

    const-string v8, "BYTES"

    const/16 v9, 0xa

    const/16 v10, 0xa

    sget-object v31, Lvh2;->l:Lvh2;

    move-object/from16 v7, v30

    move-object/from16 v12, v31

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v30, LZk1;->q:LZk1;

    new-instance v32, LZk1;

    const-string v8, "UINT32"

    const/16 v9, 0xb

    const/16 v10, 0xb

    move-object/from16 v7, v32

    move-object/from16 v12, v21

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v32, LZk1;->r:LZk1;

    new-instance v33, LZk1;

    const-string v8, "ENUM"

    const/16 v9, 0xc

    const/16 v10, 0xc

    sget-object v34, Lvh2;->m:Lvh2;

    move-object/from16 v7, v33

    move-object/from16 v12, v34

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v33, LZk1;->s:LZk1;

    new-instance v35, LZk1;

    const-string v8, "SFIXED32"

    const/16 v9, 0xd

    const/16 v10, 0xd

    move-object/from16 v7, v35

    move-object/from16 v12, v21

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v35, LZk1;->t:LZk1;

    new-instance v36, LZk1;

    const-string v8, "SFIXED64"

    const/16 v9, 0xe

    const/16 v10, 0xe

    move-object/from16 v7, v36

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v36, LZk1;->u:LZk1;

    new-instance v37, LZk1;

    const-string v8, "SINT32"

    const/16 v9, 0xf

    const/16 v10, 0xf

    move-object/from16 v7, v37

    move-object/from16 v12, v21

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v37, LZk1;->v:LZk1;

    new-instance v38, LZk1;

    const-string v8, "SINT64"

    const/16 v9, 0x10

    const/16 v10, 0x10

    move-object/from16 v7, v38

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v38, LZk1;->w:LZk1;

    new-instance v39, LZk1;

    const-string v8, "GROUP"

    const/16 v9, 0x11

    const/16 v10, 0x11

    move-object/from16 v7, v39

    move-object/from16 v12, v29

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v39, LZk1;->x:LZk1;

    new-instance v13, LZk1;

    const-string v8, "DOUBLE_LIST"

    const/16 v9, 0x12

    const/16 v10, 0x12

    sget-object v40, LZk1$b;->d:LZk1$b;

    move-object v7, v13

    move-object/from16 v11, v40

    move-object v12, v14

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v13, LZk1;->y:LZk1;

    new-instance v41, LZk1;

    const-string v16, "FLOAT_LIST"

    const/16 v17, 0x13

    const/16 v18, 0x13

    move-object/from16 v15, v41

    move-object/from16 v19, v40

    move-object/from16 v20, v1

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v41, LZk1;->z:LZk1;

    new-instance v42, LZk1;

    const-string v16, "INT64_LIST"

    const/16 v17, 0x14

    const/16 v18, 0x14

    move-object/from16 v15, v42

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v42, LZk1;->A:LZk1;

    new-instance v43, LZk1;

    const-string v16, "UINT64_LIST"

    const/16 v17, 0x15

    const/16 v18, 0x15

    move-object/from16 v15, v43

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v43, LZk1;->B:LZk1;

    new-instance v44, LZk1;

    const-string v16, "INT32_LIST"

    const/16 v17, 0x16

    const/16 v18, 0x16

    move-object/from16 v15, v44

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v44, LZk1;->C:LZk1;

    new-instance v45, LZk1;

    const-string v16, "FIXED64_LIST"

    const/16 v17, 0x17

    const/16 v18, 0x17

    move-object/from16 v15, v45

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v45, LZk1;->D:LZk1;

    new-instance v46, LZk1;

    const-string v16, "FIXED32_LIST"

    const/16 v17, 0x18

    const/16 v18, 0x18

    move-object/from16 v15, v46

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v46, LZk1;->E:LZk1;

    new-instance v47, LZk1;

    const-string v16, "BOOL_LIST"

    const/16 v17, 0x19

    const/16 v18, 0x19

    move-object/from16 v15, v47

    move-object/from16 v20, v25

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v47, LZk1;->F:LZk1;

    new-instance v48, LZk1;

    const-string v16, "STRING_LIST"

    const/16 v17, 0x1a

    const/16 v18, 0x1a

    move-object/from16 v15, v48

    move-object/from16 v20, v27

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v48, LZk1;->G:LZk1;

    new-instance v27, LZk1;

    const-string v16, "MESSAGE_LIST"

    const/16 v17, 0x1b

    const/16 v18, 0x1b

    move-object/from16 v15, v27

    move-object/from16 v20, v29

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v27, LZk1;->H:LZk1;

    new-instance v49, LZk1;

    const-string v16, "BYTES_LIST"

    const/16 v17, 0x1c

    const/16 v18, 0x1c

    move-object/from16 v15, v49

    move-object/from16 v20, v31

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v49, LZk1;->I:LZk1;

    new-instance v31, LZk1;

    const-string v16, "UINT32_LIST"

    const/16 v17, 0x1d

    const/16 v18, 0x1d

    move-object/from16 v15, v31

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v31, LZk1;->J:LZk1;

    new-instance v50, LZk1;

    const-string v16, "ENUM_LIST"

    const/16 v17, 0x1e

    const/16 v18, 0x1e

    move-object/from16 v15, v50

    move-object/from16 v20, v34

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v50, LZk1;->K:LZk1;

    new-instance v51, LZk1;

    const-string v16, "SFIXED32_LIST"

    const/16 v17, 0x1f

    const/16 v18, 0x1f

    move-object/from16 v15, v51

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v51, LZk1;->P:LZk1;

    new-instance v52, LZk1;

    const-string v16, "SFIXED64_LIST"

    const/16 v17, 0x20

    const/16 v18, 0x20

    move-object/from16 v15, v52

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v52, LZk1;->Q:LZk1;

    new-instance v53, LZk1;

    const-string v16, "SINT32_LIST"

    const/16 v17, 0x21

    const/16 v18, 0x21

    move-object/from16 v15, v53

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v53, LZk1;->R:LZk1;

    new-instance v54, LZk1;

    const-string v16, "SINT64_LIST"

    const/16 v17, 0x22

    const/16 v18, 0x22

    move-object/from16 v15, v54

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v54, LZk1;->S:LZk1;

    new-instance v55, LZk1;

    const-string v8, "DOUBLE_LIST_PACKED"

    const/16 v9, 0x23

    const/16 v10, 0x23

    sget-object v56, LZk1$b;->e:LZk1$b;

    move-object/from16 v7, v55

    move-object/from16 v11, v56

    invoke-direct/range {v7 .. v12}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v55, LZk1;->T:LZk1;

    new-instance v7, LZk1;

    const-string v16, "FLOAT_LIST_PACKED"

    const/16 v17, 0x24

    const/16 v18, 0x24

    move-object v15, v7

    move-object/from16 v19, v56

    move-object/from16 v20, v1

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v7, LZk1;->U:LZk1;

    new-instance v1, LZk1;

    const-string v16, "INT64_LIST_PACKED"

    const/16 v17, 0x25

    const/16 v18, 0x25

    move-object v15, v1

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v1, LZk1;->W:LZk1;

    new-instance v8, LZk1;

    const-string v16, "UINT64_LIST_PACKED"

    const/16 v17, 0x26

    const/16 v18, 0x26

    move-object v15, v8

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v8, LZk1;->X:LZk1;

    new-instance v9, LZk1;

    const-string v16, "INT32_LIST_PACKED"

    const/16 v17, 0x27

    const/16 v18, 0x27

    move-object v15, v9

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v9, LZk1;->Y:LZk1;

    new-instance v10, LZk1;

    const-string v16, "FIXED64_LIST_PACKED"

    const/16 v17, 0x28

    const/16 v18, 0x28

    move-object v15, v10

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v10, LZk1;->Z:LZk1;

    new-instance v11, LZk1;

    const-string v16, "FIXED32_LIST_PACKED"

    const/16 v17, 0x29

    const/16 v18, 0x29

    move-object v15, v11

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v11, LZk1;->p0:LZk1;

    new-instance v12, LZk1;

    const-string v16, "BOOL_LIST_PACKED"

    const/16 v17, 0x2a

    const/16 v18, 0x2a

    move-object v15, v12

    move-object/from16 v20, v25

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v12, LZk1;->q0:LZk1;

    new-instance v14, LZk1;

    const-string v16, "UINT32_LIST_PACKED"

    const/16 v17, 0x2b

    const/16 v18, 0x2b

    move-object v15, v14

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v14, LZk1;->r0:LZk1;

    new-instance v25, LZk1;

    const-string v16, "ENUM_LIST_PACKED"

    const/16 v17, 0x2c

    const/16 v18, 0x2c

    move-object/from16 v15, v25

    move-object/from16 v20, v34

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v25, LZk1;->s0:LZk1;

    new-instance v34, LZk1;

    const-string v16, "SFIXED32_LIST_PACKED"

    const/16 v17, 0x2d

    const/16 v18, 0x2d

    move-object/from16 v15, v34

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v34, LZk1;->t0:LZk1;

    new-instance v57, LZk1;

    const-string v16, "SFIXED64_LIST_PACKED"

    const/16 v17, 0x2e

    const/16 v18, 0x2e

    move-object/from16 v15, v57

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v57, LZk1;->u0:LZk1;

    new-instance v58, LZk1;

    const-string v16, "SINT32_LIST_PACKED"

    const/16 v17, 0x2f

    const/16 v18, 0x2f

    move-object/from16 v15, v58

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v58, LZk1;->v0:LZk1;

    new-instance v21, LZk1;

    const-string v16, "SINT64_LIST_PACKED"

    const/16 v17, 0x30

    const/16 v18, 0x30

    move-object/from16 v15, v21

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v21, LZk1;->w0:LZk1;

    new-instance v3, LZk1;

    const-string v16, "GROUP_LIST"

    const/16 v17, 0x31

    const/16 v18, 0x31

    move-object v15, v3

    move-object/from16 v19, v40

    move-object/from16 v20, v29

    invoke-direct/range {v15 .. v20}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v3, LZk1;->x0:LZk1;

    new-instance v15, LZk1;

    const-string v60, "MAP"

    const/16 v61, 0x32

    const/16 v62, 0x32

    sget-object v63, LZk1$b;->f:LZk1$b;

    sget-object v64, Lvh2;->e:Lvh2;

    move-object/from16 v59, v15

    invoke-direct/range {v59 .. v64}, LZk1;-><init>(Ljava/lang/String;IILZk1$b;Lvh2;)V

    sput-object v15, LZk1;->y0:LZk1;

    move-object/from16 v16, v15

    const/16 v15, 0x33

    new-array v15, v15, [LZk1;

    move-object/from16 v17, v3

    const/4 v3, 0x0

    aput-object v6, v15, v3

    const/4 v6, 0x1

    aput-object v0, v15, v6

    const/4 v0, 0x2

    aput-object v2, v15, v0

    const/4 v0, 0x3

    aput-object v4, v15, v0

    const/4 v0, 0x4

    aput-object v5, v15, v0

    const/4 v0, 0x5

    aput-object v22, v15, v0

    const/4 v0, 0x6

    aput-object v23, v15, v0

    const/4 v0, 0x7

    aput-object v24, v15, v0

    const/16 v0, 0x8

    aput-object v26, v15, v0

    const/16 v0, 0x9

    aput-object v28, v15, v0

    const/16 v0, 0xa

    aput-object v30, v15, v0

    const/16 v0, 0xb

    aput-object v32, v15, v0

    const/16 v0, 0xc

    aput-object v33, v15, v0

    const/16 v0, 0xd

    aput-object v35, v15, v0

    const/16 v0, 0xe

    aput-object v36, v15, v0

    const/16 v0, 0xf

    aput-object v37, v15, v0

    const/16 v0, 0x10

    aput-object v38, v15, v0

    const/16 v0, 0x11

    aput-object v39, v15, v0

    const/16 v0, 0x12

    aput-object v13, v15, v0

    const/16 v0, 0x13

    aput-object v41, v15, v0

    const/16 v0, 0x14

    aput-object v42, v15, v0

    const/16 v0, 0x15

    aput-object v43, v15, v0

    const/16 v0, 0x16

    aput-object v44, v15, v0

    const/16 v0, 0x17

    aput-object v45, v15, v0

    const/16 v0, 0x18

    aput-object v46, v15, v0

    const/16 v0, 0x19

    aput-object v47, v15, v0

    const/16 v0, 0x1a

    aput-object v48, v15, v0

    const/16 v0, 0x1b

    aput-object v27, v15, v0

    const/16 v0, 0x1c

    aput-object v49, v15, v0

    const/16 v0, 0x1d

    aput-object v31, v15, v0

    const/16 v0, 0x1e

    aput-object v50, v15, v0

    const/16 v0, 0x1f

    aput-object v51, v15, v0

    const/16 v0, 0x20

    aput-object v52, v15, v0

    const/16 v0, 0x21

    aput-object v53, v15, v0

    const/16 v0, 0x22

    aput-object v54, v15, v0

    const/16 v0, 0x23

    aput-object v55, v15, v0

    const/16 v0, 0x24

    aput-object v7, v15, v0

    const/16 v0, 0x25

    aput-object v1, v15, v0

    const/16 v0, 0x26

    aput-object v8, v15, v0

    const/16 v0, 0x27

    aput-object v9, v15, v0

    const/16 v0, 0x28

    aput-object v10, v15, v0

    const/16 v0, 0x29

    aput-object v11, v15, v0

    const/16 v0, 0x2a

    aput-object v12, v15, v0

    const/16 v0, 0x2b

    aput-object v14, v15, v0

    const/16 v0, 0x2c

    aput-object v25, v15, v0

    const/16 v0, 0x2d

    aput-object v34, v15, v0

    const/16 v0, 0x2e

    aput-object v57, v15, v0

    const/16 v0, 0x2f

    aput-object v58, v15, v0

    const/16 v0, 0x30

    aput-object v21, v15, v0

    const/16 v0, 0x31

    aput-object v17, v15, v0

    const/16 v0, 0x32

    aput-object v16, v15, v0

    sput-object v15, LZk1;->B0:[LZk1;

    new-array v0, v3, [Ljava/lang/reflect/Type;

    sput-object v0, LZk1;->A0:[Ljava/lang/reflect/Type;

    invoke-static {}, LZk1;->values()[LZk1;

    move-result-object v0

    array-length v1, v0

    new-array v1, v1, [LZk1;

    sput-object v1, LZk1;->z0:[LZk1;

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v2, v0, v3

    sget-object v4, LZk1;->z0:[LZk1;

    iget v5, v2, LZk1;->c:I

    aput-object v2, v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILZk1$b;Lvh2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LZk1$b;",
            "Lvh2;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LZk1;->c:I

    iput-object p4, p0, LZk1;->d:LZk1$b;

    iput-object p5, p0, LZk1;->b:Lvh2;

    sget-object p1, LZk1$a;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x2

    const/4 p3, 0x1

    if-eq p1, p3, :cond_1

    if-eq p1, p2, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, LZk1;->e:Ljava/lang/Class;

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Lvh2;->a()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, LZk1;->e:Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {p5}, Lvh2;->a()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, LZk1;->e:Ljava/lang/Class;

    :goto_0
    sget-object p1, LZk1$b;->c:LZk1$b;

    if-ne p4, p1, :cond_2

    sget-object p1, LZk1$a;->b:[I

    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p1, p1, p4

    if-eq p1, p3, :cond_2

    if-eq p1, p2, :cond_2

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    :goto_1
    iput-boolean p3, p0, LZk1;->f:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LZk1;
    .locals 1

    const-class v0, LZk1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LZk1;

    return-object p0
.end method

.method public static values()[LZk1;
    .locals 1

    sget-object v0, LZk1;->B0:[LZk1;

    invoke-virtual {v0}, [LZk1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LZk1;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LZk1;->c:I

    return v0
.end method
