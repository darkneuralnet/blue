.class public final enum LcW8;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LqP7;


# static fields
.field public static final enum A:LcW8;

.field public static final enum B:LcW8;

.field public static final enum C:LcW8;

.field public static final enum D:LcW8;

.field public static final enum E:LcW8;

.field public static final enum F:LcW8;

.field public static final enum G:LcW8;

.field public static final enum H:LcW8;

.field public static final enum I:LcW8;

.field public static final enum J:LcW8;

.field public static final enum K:LcW8;

.field public static final enum P:LcW8;

.field public static final enum Q:LcW8;

.field public static final enum R:LcW8;

.field public static final enum S:LcW8;

.field public static final enum T:LcW8;

.field public static final enum U:LcW8;

.field public static final enum W:LcW8;

.field public static final enum X:LcW8;

.field public static final enum Y:LcW8;

.field public static final enum Z:LcW8;

.field public static final enum c:LcW8;

.field public static final enum d:LcW8;

.field public static final enum e:LcW8;

.field public static final enum f:LcW8;

.field public static final enum g:LcW8;

.field public static final enum h:LcW8;

.field public static final enum i:LcW8;

.field public static final enum j:LcW8;

.field public static final enum k:LcW8;

.field public static final enum l:LcW8;

.field public static final enum m:LcW8;

.field public static final enum n:LcW8;

.field public static final enum o:LcW8;

.field public static final enum p:LcW8;

.field public static final enum p0:LcW8;

.field public static final enum q:LcW8;

.field public static final enum q0:LcW8;

.field public static final enum r:LcW8;

.field public static final enum r0:LcW8;

.field public static final enum s:LcW8;

.field public static final synthetic s0:[LcW8;

.field public static final enum t:LcW8;

.field public static final enum u:LcW8;

.field public static final enum v:LcW8;

.field public static final enum w:LcW8;

.field public static final enum x:LcW8;

.field public static final enum y:LcW8;

.field public static final enum z:LcW8;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 51

    new-instance v0, LcW8;

    const-string v1, "NO_ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v0, LcW8;->c:LcW8;

    new-instance v1, LcW8;

    const-string v3, "INCOMPATIBLE_INPUT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v1, LcW8;->d:LcW8;

    new-instance v3, LcW8;

    const-string v5, "INCOMPATIBLE_OUTPUT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v3, LcW8;->e:LcW8;

    new-instance v5, LcW8;

    const-string v7, "INCOMPATIBLE_TFLITE_VERSION"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v5, LcW8;->f:LcW8;

    new-instance v7, LcW8;

    const-string v9, "MISSING_OP"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v7, LcW8;->g:LcW8;

    new-instance v9, LcW8;

    const-string v11, "DATA_TYPE_ERROR"

    const/4 v12, 0x5

    const/4 v13, 0x6

    invoke-direct {v9, v11, v12, v13}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v9, LcW8;->h:LcW8;

    new-instance v11, LcW8;

    const-string v14, "TFLITE_INTERNAL_ERROR"

    const/4 v15, 0x7

    invoke-direct {v11, v14, v13, v15}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v11, LcW8;->i:LcW8;

    new-instance v14, LcW8;

    const-string v13, "TFLITE_UNKNOWN_ERROR"

    const/16 v10, 0x8

    invoke-direct {v14, v13, v15, v10}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v14, LcW8;->j:LcW8;

    new-instance v13, LcW8;

    const-string v15, "MEDIAPIPE_ERROR"

    const/16 v8, 0x9

    invoke-direct {v13, v15, v10, v8}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v13, LcW8;->k:LcW8;

    new-instance v15, LcW8;

    const-string v10, "TIME_OUT_FETCHING_MODEL_METADATA"

    invoke-direct {v15, v10, v8, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v15, LcW8;->l:LcW8;

    new-instance v10, LcW8;

    const/16 v8, 0x64

    const-string v12, "MODEL_NOT_DOWNLOADED"

    const/16 v6, 0xa

    invoke-direct {v10, v12, v6, v8}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v10, LcW8;->m:LcW8;

    new-instance v8, LcW8;

    const/16 v12, 0x65

    const-string v6, "URI_EXPIRED"

    const/16 v4, 0xb

    invoke-direct {v8, v6, v4, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v8, LcW8;->n:LcW8;

    new-instance v6, LcW8;

    const/16 v12, 0x66

    const-string v4, "NO_NETWORK_CONNECTION"

    const/16 v2, 0xc

    invoke-direct {v6, v4, v2, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v6, LcW8;->o:LcW8;

    new-instance v4, LcW8;

    const/16 v12, 0x67

    const-string v2, "METERED_NETWORK"

    move-object/from16 v16, v6

    const/16 v6, 0xd

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->p:LcW8;

    new-instance v2, LcW8;

    const/16 v12, 0x68

    const-string v6, "DOWNLOAD_FAILED"

    move-object/from16 v17, v4

    const/16 v4, 0xe

    invoke-direct {v2, v6, v4, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->q:LcW8;

    new-instance v6, LcW8;

    const/16 v12, 0x69

    const-string v4, "MODEL_INFO_DOWNLOAD_UNSUCCESSFUL_HTTP_STATUS"

    move-object/from16 v18, v2

    const/16 v2, 0xf

    invoke-direct {v6, v4, v2, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v6, LcW8;->r:LcW8;

    new-instance v4, LcW8;

    const/16 v12, 0x6a

    const-string v2, "MODEL_INFO_DOWNLOAD_NO_HASH"

    move-object/from16 v19, v6

    const/16 v6, 0x10

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->s:LcW8;

    new-instance v2, LcW8;

    const/16 v12, 0x6b

    const-string v6, "MODEL_INFO_DOWNLOAD_CONNECTION_FAILED"

    move-object/from16 v20, v4

    const/16 v4, 0x11

    invoke-direct {v2, v6, v4, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->t:LcW8;

    new-instance v6, LcW8;

    const/16 v12, 0x6c

    const-string v4, "NO_VALID_MODEL"

    move-object/from16 v21, v2

    const/16 v2, 0x12

    invoke-direct {v6, v4, v2, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v6, LcW8;->u:LcW8;

    new-instance v4, LcW8;

    const/16 v12, 0x6d

    const-string v2, "LOCAL_MODEL_INVALID"

    move-object/from16 v22, v6

    const/16 v6, 0x13

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->v:LcW8;

    new-instance v2, LcW8;

    const/16 v12, 0x6e

    const-string v6, "REMOTE_MODEL_INVALID"

    move-object/from16 v23, v4

    const/16 v4, 0x14

    invoke-direct {v2, v6, v4, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->w:LcW8;

    new-instance v6, LcW8;

    const/16 v12, 0x6f

    const-string v4, "REMOTE_MODEL_LOADER_ERROR"

    move-object/from16 v24, v2

    const/16 v2, 0x15

    invoke-direct {v6, v4, v2, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v6, LcW8;->x:LcW8;

    new-instance v4, LcW8;

    const/16 v12, 0x16

    const/16 v2, 0x70

    move-object/from16 v25, v6

    const-string v6, "REMOTE_MODEL_LOADER_LOADS_NO_MODEL"

    invoke-direct {v4, v6, v12, v2}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->y:LcW8;

    new-instance v2, LcW8;

    const/16 v6, 0x17

    const/16 v12, 0x71

    move-object/from16 v26, v4

    const-string v4, "SMART_REPLY_LANG_ID_DETECTAION_FAILURE"

    invoke-direct {v2, v4, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->z:LcW8;

    new-instance v4, LcW8;

    const/16 v6, 0x18

    const/16 v12, 0x72

    move-object/from16 v27, v2

    const-string v2, "MODEL_NOT_REGISTERED"

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->A:LcW8;

    new-instance v2, LcW8;

    const/16 v6, 0x19

    const/16 v12, 0x73

    move-object/from16 v28, v4

    const-string v4, "MODEL_TYPE_MISUSE"

    invoke-direct {v2, v4, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->B:LcW8;

    new-instance v4, LcW8;

    const/16 v6, 0x1a

    const/16 v12, 0x74

    move-object/from16 v29, v2

    const-string v2, "MODEL_HASH_MISMATCH"

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->C:LcW8;

    new-instance v2, LcW8;

    const/16 v6, 0x1b

    const/16 v12, 0xc9

    move-object/from16 v30, v4

    const-string v4, "OPTIONAL_MODULE_NOT_AVAILABLE"

    invoke-direct {v2, v4, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->D:LcW8;

    new-instance v4, LcW8;

    const/16 v6, 0x1c

    const/16 v12, 0xca

    move-object/from16 v31, v2

    const-string v2, "OPTIONAL_MODULE_INIT_ERROR"

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->E:LcW8;

    new-instance v2, LcW8;

    const/16 v6, 0x1d

    const/16 v12, 0xcb

    move-object/from16 v32, v4

    const-string v4, "OPTIONAL_MODULE_INFERENCE_ERROR"

    invoke-direct {v2, v4, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->F:LcW8;

    new-instance v4, LcW8;

    const/16 v6, 0x1e

    const/16 v12, 0xcc

    move-object/from16 v33, v2

    const-string v2, "OPTIONAL_MODULE_RELEASE_ERROR"

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->G:LcW8;

    new-instance v2, LcW8;

    const/16 v6, 0x1f

    const/16 v12, 0xcd

    move-object/from16 v34, v4

    const-string v4, "OPTIONAL_TFLITE_MODULE_INIT_ERROR"

    invoke-direct {v2, v4, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->H:LcW8;

    new-instance v4, LcW8;

    const/16 v6, 0x20

    const/16 v12, 0xce

    move-object/from16 v35, v2

    const-string v2, "NATIVE_LIBRARY_LOAD_ERROR"

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->I:LcW8;

    new-instance v2, LcW8;

    const/16 v6, 0x21

    const/16 v12, 0xcf

    move-object/from16 v36, v4

    const-string v4, "OPTIONAL_MODULE_CREATE_ERROR"

    invoke-direct {v2, v4, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->J:LcW8;

    new-instance v4, LcW8;

    const/16 v6, 0x22

    const/16 v12, 0x12d

    move-object/from16 v37, v2

    const-string v2, "CAMERAX_SOURCE_ERROR"

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->K:LcW8;

    new-instance v2, LcW8;

    const/16 v6, 0x23

    const/16 v12, 0x12e

    move-object/from16 v38, v4

    const-string v4, "CAMERA1_SOURCE_CANT_START_ERROR"

    invoke-direct {v2, v4, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->P:LcW8;

    new-instance v4, LcW8;

    const/16 v6, 0x24

    const/16 v12, 0x12f

    move-object/from16 v39, v2

    const-string v2, "CAMERA1_SOURCE_NO_SUITABLE_SIZE_ERROR"

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->Q:LcW8;

    new-instance v2, LcW8;

    const/16 v6, 0x25

    const/16 v12, 0x130

    move-object/from16 v40, v4

    const-string v4, "CAMERA1_SOURCE_NO_SUITABLE_FPS_ERROR"

    invoke-direct {v2, v4, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->R:LcW8;

    new-instance v4, LcW8;

    const/16 v6, 0x26

    const/16 v12, 0x131

    move-object/from16 v41, v2

    const-string v2, "CAMERA1_SOURCE_NO_BYTE_SOURCE_FOUND_ERROR"

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->S:LcW8;

    new-instance v2, LcW8;

    const/16 v6, 0x27

    const/16 v12, 0x190

    move-object/from16 v42, v4

    const-string v4, "CODE_SCANNER_UNAVAILABLE"

    invoke-direct {v2, v4, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->T:LcW8;

    new-instance v4, LcW8;

    const/16 v6, 0x28

    const/16 v12, 0x191

    move-object/from16 v43, v2

    const-string v2, "CODE_SCANNER_CANCELLED"

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->U:LcW8;

    new-instance v2, LcW8;

    const/16 v6, 0x29

    const/16 v12, 0x192

    move-object/from16 v44, v4

    const-string v4, "CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED"

    invoke-direct {v2, v4, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->W:LcW8;

    new-instance v4, LcW8;

    const/16 v6, 0x2a

    const/16 v12, 0x193

    move-object/from16 v45, v2

    const-string v2, "CODE_SCANNER_APP_NAME_UNAVAILABLE"

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->X:LcW8;

    new-instance v2, LcW8;

    const/16 v6, 0x2b

    const/16 v12, 0x194

    move-object/from16 v46, v4

    const-string v4, "CODE_SCANNER_TASK_IN_PROGRESS"

    invoke-direct {v2, v4, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->Y:LcW8;

    new-instance v4, LcW8;

    const/16 v6, 0x2c

    const/16 v12, 0x195

    move-object/from16 v47, v2

    const-string v2, "CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR"

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->Z:LcW8;

    new-instance v2, LcW8;

    const/16 v6, 0x2d

    const/16 v12, 0x196

    move-object/from16 v48, v4

    const-string v4, "CODE_SCANNER_PIPELINE_INFERENCE_ERROR"

    invoke-direct {v2, v4, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->p0:LcW8;

    new-instance v4, LcW8;

    const/16 v6, 0x2e

    const/16 v12, 0x197

    move-object/from16 v49, v2

    const-string v2, "CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD"

    invoke-direct {v4, v2, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v4, LcW8;->q0:LcW8;

    new-instance v2, LcW8;

    const/16 v6, 0x2f

    const/16 v12, 0x270f

    move-object/from16 v50, v4

    const-string v4, "UNKNOWN_ERROR"

    invoke-direct {v2, v4, v6, v12}, LcW8;-><init>(Ljava/lang/String;II)V

    sput-object v2, LcW8;->r0:LcW8;

    const/16 v4, 0x30

    new-array v4, v4, [LcW8;

    const/4 v6, 0x0

    aput-object v0, v4, v6

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v3, v4, v0

    const/4 v0, 0x3

    aput-object v5, v4, v0

    const/4 v0, 0x4

    aput-object v7, v4, v0

    const/4 v0, 0x5

    aput-object v9, v4, v0

    const/4 v0, 0x6

    aput-object v11, v4, v0

    const/4 v0, 0x7

    aput-object v14, v4, v0

    const/16 v0, 0x8

    aput-object v13, v4, v0

    const/16 v0, 0x9

    aput-object v15, v4, v0

    const/16 v0, 0xa

    aput-object v10, v4, v0

    const/16 v0, 0xb

    aput-object v8, v4, v0

    const/16 v0, 0xc

    aput-object v16, v4, v0

    const/16 v0, 0xd

    aput-object v17, v4, v0

    const/16 v0, 0xe

    aput-object v18, v4, v0

    const/16 v0, 0xf

    aput-object v19, v4, v0

    const/16 v0, 0x10

    aput-object v20, v4, v0

    const/16 v0, 0x11

    aput-object v21, v4, v0

    const/16 v0, 0x12

    aput-object v22, v4, v0

    const/16 v0, 0x13

    aput-object v23, v4, v0

    const/16 v0, 0x14

    aput-object v24, v4, v0

    const/16 v0, 0x15

    aput-object v25, v4, v0

    const/16 v0, 0x16

    aput-object v26, v4, v0

    const/16 v0, 0x17

    aput-object v27, v4, v0

    const/16 v0, 0x18

    aput-object v28, v4, v0

    const/16 v0, 0x19

    aput-object v29, v4, v0

    const/16 v0, 0x1a

    aput-object v30, v4, v0

    const/16 v0, 0x1b

    aput-object v31, v4, v0

    const/16 v0, 0x1c

    aput-object v32, v4, v0

    const/16 v0, 0x1d

    aput-object v33, v4, v0

    const/16 v0, 0x1e

    aput-object v34, v4, v0

    const/16 v0, 0x1f

    aput-object v35, v4, v0

    const/16 v0, 0x20

    aput-object v36, v4, v0

    const/16 v0, 0x21

    aput-object v37, v4, v0

    const/16 v0, 0x22

    aput-object v38, v4, v0

    const/16 v0, 0x23

    aput-object v39, v4, v0

    const/16 v0, 0x24

    aput-object v40, v4, v0

    const/16 v0, 0x25

    aput-object v41, v4, v0

    const/16 v0, 0x26

    aput-object v42, v4, v0

    const/16 v0, 0x27

    aput-object v43, v4, v0

    const/16 v0, 0x28

    aput-object v44, v4, v0

    const/16 v0, 0x29

    aput-object v45, v4, v0

    const/16 v0, 0x2a

    aput-object v46, v4, v0

    const/16 v0, 0x2b

    aput-object v47, v4, v0

    const/16 v0, 0x2c

    aput-object v48, v4, v0

    const/16 v0, 0x2d

    aput-object v49, v4, v0

    const/16 v0, 0x2e

    aput-object v50, v4, v0

    const/16 v0, 0x2f

    aput-object v2, v4, v0

    sput-object v4, LcW8;->s0:[LcW8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LcW8;->b:I

    return-void
.end method

.method public static values()[LcW8;
    .locals 1

    sget-object v0, LcW8;->s0:[LcW8;

    invoke-virtual {v0}, [LcW8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LcW8;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, LcW8;->b:I

    return v0
.end method
