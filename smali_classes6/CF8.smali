.class public final enum LCF8;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LCF8;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum A:LCF8;

.field public static final A0:[Ljava/lang/reflect/Type;

.field public static final enum B:LCF8;

.field public static final synthetic B0:[LCF8;

.field public static final enum C:LCF8;

.field public static final enum D:LCF8;

.field public static final enum E:LCF8;

.field public static final enum F:LCF8;

.field public static final enum G:LCF8;

.field public static final enum H:LCF8;

.field public static final enum I:LCF8;

.field public static final enum J:LCF8;

.field public static final enum K:LCF8;

.field public static final enum P:LCF8;

.field public static final enum Q:LCF8;

.field public static final enum R:LCF8;

.field public static final enum S:LCF8;

.field public static final enum T:LCF8;

.field public static final enum U:LCF8;

.field public static final enum W:LCF8;

.field public static final enum X:LCF8;

.field public static final enum Y:LCF8;

.field public static final enum Z:LCF8;

.field public static final enum g:LCF8;

.field public static final enum h:LCF8;

.field public static final enum i:LCF8;

.field public static final enum j:LCF8;

.field public static final enum k:LCF8;

.field public static final enum l:LCF8;

.field public static final enum m:LCF8;

.field public static final enum n:LCF8;

.field public static final enum o:LCF8;

.field public static final enum p:LCF8;

.field public static final enum p0:LCF8;

.field public static final enum q:LCF8;

.field public static final enum q0:LCF8;

.field public static final enum r:LCF8;

.field public static final enum r0:LCF8;

.field public static final enum s:LCF8;

.field public static final enum s0:LCF8;

.field public static final enum t:LCF8;

.field public static final enum t0:LCF8;

.field public static final enum u:LCF8;

.field public static final enum u0:LCF8;

.field public static final enum v:LCF8;

.field public static final enum v0:LCF8;

.field public static final enum w:LCF8;

.field public static final enum w0:LCF8;

.field public static final enum x:LCF8;

.field public static final enum x0:LCF8;

.field public static final enum y:LCF8;

.field public static final enum y0:LCF8;

.field public static final enum z:LCF8;

.field public static final z0:[LCF8;


# instance fields
.field public final b:LdK8;

.field public final c:I

.field public final d:LaG8;

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

    new-instance v6, LCF8;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v13, LaG8;->c:LaG8;

    sget-object v14, LdK8;->i:LdK8;

    move-object v0, v6

    move-object v4, v13

    move-object v5, v14

    invoke-direct/range {v0 .. v5}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v6, LCF8;->g:LCF8;

    new-instance v0, LCF8;

    const-string v8, "FLOAT"

    const/4 v9, 0x1

    const/4 v10, 0x1

    sget-object v1, LdK8;->h:LdK8;

    move-object v7, v0

    move-object v11, v13

    move-object v12, v1

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v0, LCF8;->h:LCF8;

    new-instance v2, LCF8;

    const-string v8, "INT64"

    const/4 v9, 0x2

    const/4 v10, 0x2

    sget-object v3, LdK8;->g:LdK8;

    move-object v7, v2

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v2, LCF8;->i:LCF8;

    new-instance v4, LCF8;

    const-string v8, "UINT64"

    const/4 v9, 0x3

    const/4 v10, 0x3

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v4, LCF8;->j:LCF8;

    new-instance v5, LCF8;

    const-string v8, "INT32"

    const/4 v9, 0x4

    const/4 v10, 0x4

    sget-object v21, LdK8;->f:LdK8;

    move-object v7, v5

    move-object/from16 v12, v21

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v5, LCF8;->k:LCF8;

    new-instance v22, LCF8;

    const-string v8, "FIXED64"

    const/4 v9, 0x5

    const/4 v10, 0x5

    move-object/from16 v7, v22

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v22, LCF8;->l:LCF8;

    new-instance v23, LCF8;

    const-string v8, "FIXED32"

    const/4 v9, 0x6

    const/4 v10, 0x6

    move-object/from16 v7, v23

    move-object/from16 v12, v21

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v23, LCF8;->m:LCF8;

    new-instance v24, LCF8;

    const-string v8, "BOOL"

    const/4 v9, 0x7

    const/4 v10, 0x7

    sget-object v25, LdK8;->j:LdK8;

    move-object/from16 v7, v24

    move-object/from16 v12, v25

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v24, LCF8;->n:LCF8;

    new-instance v26, LCF8;

    const-string v8, "STRING"

    const/16 v9, 0x8

    const/16 v10, 0x8

    sget-object v27, LdK8;->k:LdK8;

    move-object/from16 v7, v26

    move-object/from16 v12, v27

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v26, LCF8;->o:LCF8;

    new-instance v28, LCF8;

    const-string v8, "MESSAGE"

    const/16 v9, 0x9

    const/16 v10, 0x9

    sget-object v29, LdK8;->n:LdK8;

    move-object/from16 v7, v28

    move-object/from16 v12, v29

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v28, LCF8;->p:LCF8;

    new-instance v30, LCF8;

    const-string v8, "BYTES"

    const/16 v9, 0xa

    const/16 v10, 0xa

    sget-object v31, LdK8;->l:LdK8;

    move-object/from16 v7, v30

    move-object/from16 v12, v31

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v30, LCF8;->q:LCF8;

    new-instance v32, LCF8;

    const-string v8, "UINT32"

    const/16 v9, 0xb

    const/16 v10, 0xb

    move-object/from16 v7, v32

    move-object/from16 v12, v21

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v32, LCF8;->r:LCF8;

    new-instance v33, LCF8;

    const-string v8, "ENUM"

    const/16 v9, 0xc

    const/16 v10, 0xc

    sget-object v34, LdK8;->m:LdK8;

    move-object/from16 v7, v33

    move-object/from16 v12, v34

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v33, LCF8;->s:LCF8;

    new-instance v35, LCF8;

    const-string v8, "SFIXED32"

    const/16 v9, 0xd

    const/16 v10, 0xd

    move-object/from16 v7, v35

    move-object/from16 v12, v21

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v35, LCF8;->t:LCF8;

    new-instance v36, LCF8;

    const-string v8, "SFIXED64"

    const/16 v9, 0xe

    const/16 v10, 0xe

    move-object/from16 v7, v36

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v36, LCF8;->u:LCF8;

    new-instance v37, LCF8;

    const-string v8, "SINT32"

    const/16 v9, 0xf

    const/16 v10, 0xf

    move-object/from16 v7, v37

    move-object/from16 v12, v21

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v37, LCF8;->v:LCF8;

    new-instance v38, LCF8;

    const-string v8, "SINT64"

    const/16 v9, 0x10

    const/16 v10, 0x10

    move-object/from16 v7, v38

    move-object v12, v3

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v38, LCF8;->w:LCF8;

    new-instance v39, LCF8;

    const-string v8, "GROUP"

    const/16 v9, 0x11

    const/16 v10, 0x11

    move-object/from16 v7, v39

    move-object/from16 v12, v29

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v39, LCF8;->x:LCF8;

    new-instance v13, LCF8;

    const-string v8, "DOUBLE_LIST"

    const/16 v9, 0x12

    const/16 v10, 0x12

    sget-object v40, LaG8;->d:LaG8;

    move-object v7, v13

    move-object/from16 v11, v40

    move-object v12, v14

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v13, LCF8;->y:LCF8;

    new-instance v41, LCF8;

    const-string v16, "FLOAT_LIST"

    const/16 v17, 0x13

    const/16 v18, 0x13

    move-object/from16 v15, v41

    move-object/from16 v19, v40

    move-object/from16 v20, v1

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v41, LCF8;->z:LCF8;

    new-instance v42, LCF8;

    const-string v16, "INT64_LIST"

    const/16 v17, 0x14

    const/16 v18, 0x14

    move-object/from16 v15, v42

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v42, LCF8;->A:LCF8;

    new-instance v43, LCF8;

    const-string v16, "UINT64_LIST"

    const/16 v17, 0x15

    const/16 v18, 0x15

    move-object/from16 v15, v43

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v43, LCF8;->B:LCF8;

    new-instance v44, LCF8;

    const-string v16, "INT32_LIST"

    const/16 v17, 0x16

    const/16 v18, 0x16

    move-object/from16 v15, v44

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v44, LCF8;->C:LCF8;

    new-instance v45, LCF8;

    const-string v16, "FIXED64_LIST"

    const/16 v17, 0x17

    const/16 v18, 0x17

    move-object/from16 v15, v45

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v45, LCF8;->D:LCF8;

    new-instance v46, LCF8;

    const-string v16, "FIXED32_LIST"

    const/16 v17, 0x18

    const/16 v18, 0x18

    move-object/from16 v15, v46

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v46, LCF8;->E:LCF8;

    new-instance v47, LCF8;

    const-string v16, "BOOL_LIST"

    const/16 v17, 0x19

    const/16 v18, 0x19

    move-object/from16 v15, v47

    move-object/from16 v20, v25

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v47, LCF8;->F:LCF8;

    new-instance v48, LCF8;

    const-string v16, "STRING_LIST"

    const/16 v17, 0x1a

    const/16 v18, 0x1a

    move-object/from16 v15, v48

    move-object/from16 v20, v27

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v48, LCF8;->G:LCF8;

    new-instance v27, LCF8;

    const-string v16, "MESSAGE_LIST"

    const/16 v17, 0x1b

    const/16 v18, 0x1b

    move-object/from16 v15, v27

    move-object/from16 v20, v29

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v27, LCF8;->H:LCF8;

    new-instance v49, LCF8;

    const-string v16, "BYTES_LIST"

    const/16 v17, 0x1c

    const/16 v18, 0x1c

    move-object/from16 v15, v49

    move-object/from16 v20, v31

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v49, LCF8;->I:LCF8;

    new-instance v31, LCF8;

    const-string v16, "UINT32_LIST"

    const/16 v17, 0x1d

    const/16 v18, 0x1d

    move-object/from16 v15, v31

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v31, LCF8;->J:LCF8;

    new-instance v50, LCF8;

    const-string v16, "ENUM_LIST"

    const/16 v17, 0x1e

    const/16 v18, 0x1e

    move-object/from16 v15, v50

    move-object/from16 v20, v34

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v50, LCF8;->K:LCF8;

    new-instance v51, LCF8;

    const-string v16, "SFIXED32_LIST"

    const/16 v17, 0x1f

    const/16 v18, 0x1f

    move-object/from16 v15, v51

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v51, LCF8;->P:LCF8;

    new-instance v52, LCF8;

    const-string v16, "SFIXED64_LIST"

    const/16 v17, 0x20

    const/16 v18, 0x20

    move-object/from16 v15, v52

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v52, LCF8;->Q:LCF8;

    new-instance v53, LCF8;

    const-string v16, "SINT32_LIST"

    const/16 v17, 0x21

    const/16 v18, 0x21

    move-object/from16 v15, v53

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v53, LCF8;->R:LCF8;

    new-instance v54, LCF8;

    const-string v16, "SINT64_LIST"

    const/16 v17, 0x22

    const/16 v18, 0x22

    move-object/from16 v15, v54

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v54, LCF8;->S:LCF8;

    new-instance v55, LCF8;

    const-string v8, "DOUBLE_LIST_PACKED"

    const/16 v9, 0x23

    const/16 v10, 0x23

    sget-object v56, LaG8;->e:LaG8;

    move-object/from16 v7, v55

    move-object/from16 v11, v56

    invoke-direct/range {v7 .. v12}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v55, LCF8;->T:LCF8;

    new-instance v7, LCF8;

    const-string v16, "FLOAT_LIST_PACKED"

    const/16 v17, 0x24

    const/16 v18, 0x24

    move-object v15, v7

    move-object/from16 v19, v56

    move-object/from16 v20, v1

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v7, LCF8;->U:LCF8;

    new-instance v1, LCF8;

    const-string v16, "INT64_LIST_PACKED"

    const/16 v17, 0x25

    const/16 v18, 0x25

    move-object v15, v1

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v1, LCF8;->W:LCF8;

    new-instance v8, LCF8;

    const-string v16, "UINT64_LIST_PACKED"

    const/16 v17, 0x26

    const/16 v18, 0x26

    move-object v15, v8

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v8, LCF8;->X:LCF8;

    new-instance v9, LCF8;

    const-string v16, "INT32_LIST_PACKED"

    const/16 v17, 0x27

    const/16 v18, 0x27

    move-object v15, v9

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v9, LCF8;->Y:LCF8;

    new-instance v10, LCF8;

    const-string v16, "FIXED64_LIST_PACKED"

    const/16 v17, 0x28

    const/16 v18, 0x28

    move-object v15, v10

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v10, LCF8;->Z:LCF8;

    new-instance v11, LCF8;

    const-string v16, "FIXED32_LIST_PACKED"

    const/16 v17, 0x29

    const/16 v18, 0x29

    move-object v15, v11

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v11, LCF8;->p0:LCF8;

    new-instance v12, LCF8;

    const-string v16, "BOOL_LIST_PACKED"

    const/16 v17, 0x2a

    const/16 v18, 0x2a

    move-object v15, v12

    move-object/from16 v20, v25

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v12, LCF8;->q0:LCF8;

    new-instance v14, LCF8;

    const-string v16, "UINT32_LIST_PACKED"

    const/16 v17, 0x2b

    const/16 v18, 0x2b

    move-object v15, v14

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v14, LCF8;->r0:LCF8;

    new-instance v25, LCF8;

    const-string v16, "ENUM_LIST_PACKED"

    const/16 v17, 0x2c

    const/16 v18, 0x2c

    move-object/from16 v15, v25

    move-object/from16 v20, v34

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v25, LCF8;->s0:LCF8;

    new-instance v34, LCF8;

    const-string v16, "SFIXED32_LIST_PACKED"

    const/16 v17, 0x2d

    const/16 v18, 0x2d

    move-object/from16 v15, v34

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v34, LCF8;->t0:LCF8;

    new-instance v57, LCF8;

    const-string v16, "SFIXED64_LIST_PACKED"

    const/16 v17, 0x2e

    const/16 v18, 0x2e

    move-object/from16 v15, v57

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v57, LCF8;->u0:LCF8;

    new-instance v58, LCF8;

    const-string v16, "SINT32_LIST_PACKED"

    const/16 v17, 0x2f

    const/16 v18, 0x2f

    move-object/from16 v15, v58

    move-object/from16 v20, v21

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v58, LCF8;->v0:LCF8;

    new-instance v21, LCF8;

    const-string v16, "SINT64_LIST_PACKED"

    const/16 v17, 0x30

    const/16 v18, 0x30

    move-object/from16 v15, v21

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v21, LCF8;->w0:LCF8;

    new-instance v3, LCF8;

    const-string v16, "GROUP_LIST"

    const/16 v17, 0x31

    const/16 v18, 0x31

    move-object v15, v3

    move-object/from16 v19, v40

    move-object/from16 v20, v29

    invoke-direct/range {v15 .. v20}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v3, LCF8;->x0:LCF8;

    new-instance v15, LCF8;

    const-string v60, "MAP"

    const/16 v61, 0x32

    const/16 v62, 0x32

    sget-object v63, LaG8;->f:LaG8;

    sget-object v64, LdK8;->e:LdK8;

    move-object/from16 v59, v15

    invoke-direct/range {v59 .. v64}, LCF8;-><init>(Ljava/lang/String;IILaG8;LdK8;)V

    sput-object v15, LCF8;->y0:LCF8;

    move-object/from16 v16, v15

    const/16 v15, 0x33

    new-array v15, v15, [LCF8;

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

    sput-object v15, LCF8;->B0:[LCF8;

    new-array v0, v3, [Ljava/lang/reflect/Type;

    sput-object v0, LCF8;->A0:[Ljava/lang/reflect/Type;

    invoke-static {}, LCF8;->values()[LCF8;

    move-result-object v0

    array-length v1, v0

    new-array v1, v1, [LCF8;

    sput-object v1, LCF8;->z0:[LCF8;

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v2, v0, v3

    sget-object v4, LCF8;->z0:[LCF8;

    iget v5, v2, LCF8;->c:I

    aput-object v2, v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILaG8;LdK8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LaG8;",
            "LdK8;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LCF8;->c:I

    iput-object p4, p0, LCF8;->d:LaG8;

    iput-object p5, p0, LCF8;->b:LdK8;

    sget-object p1, LmG8;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x2

    const/4 p3, 0x1

    if-eq p1, p3, :cond_1

    if-eq p1, p2, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, LCF8;->e:Ljava/lang/Class;

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, LdK8;->a()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, LCF8;->e:Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {p5}, LdK8;->a()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, LCF8;->e:Ljava/lang/Class;

    :goto_0
    sget-object p1, LaG8;->c:LaG8;

    if-ne p4, p1, :cond_2

    sget-object p1, LmG8;->b:[I

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
    iput-boolean p3, p0, LCF8;->f:Z

    return-void
.end method

.method public static values()[LCF8;
    .locals 1

    sget-object v0, LCF8;->B0:[LCF8;

    invoke-virtual {v0}, [LCF8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LCF8;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, LCF8;->c:I

    return v0
.end method
