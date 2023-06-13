.class final enum Lcom/google/ar/core/ae;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum A:Lcom/google/ar/core/ae;

.field public static final enum B:Lcom/google/ar/core/ae;

.field public static final enum C:Lcom/google/ar/core/ae;

.field public static final enum D:Lcom/google/ar/core/ae;

.field public static final enum E:Lcom/google/ar/core/ae;

.field public static final enum F:Lcom/google/ar/core/ae;

.field private static final synthetic J:[Lcom/google/ar/core/ae;

.field public static final enum a:Lcom/google/ar/core/ae;

.field public static final enum b:Lcom/google/ar/core/ae;

.field public static final enum c:Lcom/google/ar/core/ae;

.field public static final enum d:Lcom/google/ar/core/ae;

.field public static final enum e:Lcom/google/ar/core/ae;

.field public static final enum f:Lcom/google/ar/core/ae;

.field public static final enum g:Lcom/google/ar/core/ae;

.field public static final enum h:Lcom/google/ar/core/ae;

.field public static final enum i:Lcom/google/ar/core/ae;

.field public static final enum j:Lcom/google/ar/core/ae;

.field public static final enum k:Lcom/google/ar/core/ae;

.field public static final enum l:Lcom/google/ar/core/ae;

.field public static final enum m:Lcom/google/ar/core/ae;

.field public static final enum n:Lcom/google/ar/core/ae;

.field public static final enum o:Lcom/google/ar/core/ae;

.field public static final enum p:Lcom/google/ar/core/ae;

.field public static final enum q:Lcom/google/ar/core/ae;

.field public static final enum r:Lcom/google/ar/core/ae;

.field public static final enum s:Lcom/google/ar/core/ae;

.field public static final enum t:Lcom/google/ar/core/ae;

.field public static final enum u:Lcom/google/ar/core/ae;

.field public static final enum v:Lcom/google/ar/core/ae;

.field public static final enum w:Lcom/google/ar/core/ae;

.field public static final enum x:Lcom/google/ar/core/ae;

.field public static final enum y:Lcom/google/ar/core/ae;

.field public static final enum z:Lcom/google/ar/core/ae;


# instance fields
.field final G:I

.field final H:Ljava/lang/Class;

.field final I:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 40

    new-instance v0, Lcom/google/ar/core/ae;

    const/4 v1, 0x0

    const-string v2, "SUCCESS"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v3, v1}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/ae;->a:Lcom/google/ar/core/ae;

    new-instance v1, Lcom/google/ar/core/ae;

    const/4 v2, -0x1

    const-string v4, "ERROR_INVALID_ARGUMENT"

    const/4 v5, 0x1

    const-class v6, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v4, v5, v2, v6}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v1, Lcom/google/ar/core/ae;->b:Lcom/google/ar/core/ae;

    new-instance v2, Lcom/google/ar/core/ae;

    const/4 v4, -0x2

    const-string v6, "ERROR_FATAL"

    const/4 v7, 0x2

    const-class v8, Lcom/google/ar/core/exceptions/FatalException;

    invoke-direct {v2, v6, v7, v4, v8}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v2, Lcom/google/ar/core/ae;->c:Lcom/google/ar/core/ae;

    new-instance v4, Lcom/google/ar/core/ae;

    const/4 v6, -0x3

    const-string v8, "ERROR_SESSION_PAUSED"

    const/4 v9, 0x3

    const-class v10, Lcom/google/ar/core/exceptions/SessionPausedException;

    invoke-direct {v4, v8, v9, v6, v10}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v4, Lcom/google/ar/core/ae;->d:Lcom/google/ar/core/ae;

    new-instance v6, Lcom/google/ar/core/ae;

    const/4 v8, -0x4

    const-string v10, "ERROR_SESSION_NOT_PAUSED"

    const/4 v11, 0x4

    const-class v12, Lcom/google/ar/core/exceptions/SessionNotPausedException;

    invoke-direct {v6, v10, v11, v8, v12}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v6, Lcom/google/ar/core/ae;->e:Lcom/google/ar/core/ae;

    new-instance v8, Lcom/google/ar/core/ae;

    const/4 v10, -0x5

    const-string v12, "ERROR_NOT_TRACKING"

    const/4 v13, 0x5

    const-class v14, Lcom/google/ar/core/exceptions/NotTrackingException;

    invoke-direct {v8, v12, v13, v10, v14}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v8, Lcom/google/ar/core/ae;->f:Lcom/google/ar/core/ae;

    new-instance v10, Lcom/google/ar/core/ae;

    const/4 v12, -0x6

    const-string v14, "ERROR_TEXTURE_NOT_SET"

    const/4 v15, 0x6

    const-class v13, Lcom/google/ar/core/exceptions/TextureNotSetException;

    invoke-direct {v10, v14, v15, v12, v13}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v10, Lcom/google/ar/core/ae;->g:Lcom/google/ar/core/ae;

    new-instance v12, Lcom/google/ar/core/ae;

    const/4 v13, -0x7

    const-string v14, "ERROR_MISSING_GL_CONTEXT"

    const/4 v15, 0x7

    const-class v11, Lcom/google/ar/core/exceptions/MissingGlContextException;

    invoke-direct {v12, v14, v15, v13, v11}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v12, Lcom/google/ar/core/ae;->h:Lcom/google/ar/core/ae;

    new-instance v11, Lcom/google/ar/core/ae;

    const/4 v13, -0x8

    const-class v14, Lcom/google/ar/core/exceptions/UnsupportedConfigurationException;

    const-string v15, "ERROR_UNSUPPORTED_CONFIGURATION"

    const/16 v9, 0x8

    invoke-direct {v11, v15, v9, v13, v14}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v11, Lcom/google/ar/core/ae;->i:Lcom/google/ar/core/ae;

    new-instance v13, Lcom/google/ar/core/ae;

    const/16 v14, -0x15

    const-class v15, Lcom/google/ar/core/exceptions/FineLocationPermissionNotGrantedException;

    const-string v9, "ERROR_FINE_LOCATION_PERMISSION_NOT_GRANTED"

    const/16 v7, 0x9

    invoke-direct {v13, v9, v7, v14, v15}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v13, Lcom/google/ar/core/ae;->j:Lcom/google/ar/core/ae;

    new-instance v9, Lcom/google/ar/core/ae;

    const/16 v14, -0x16

    const-class v15, Lcom/google/ar/core/exceptions/GooglePlayServicesLocationLibraryNotLinkedException;

    const-string v7, "ERROR_GOOGLE_PLAY_SERVICES_LOCATION_LIBRARY_NOT_LINKED"

    const/16 v5, 0xa

    invoke-direct {v9, v7, v5, v14, v15}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v9, Lcom/google/ar/core/ae;->k:Lcom/google/ar/core/ae;

    new-instance v7, Lcom/google/ar/core/ae;

    const-string v17, "ERROR_CAMERA_PERMISSION_NOT_GRANTED"

    const/16 v18, 0xb

    const/16 v19, -0x9

    const-class v20, Ljava/lang/SecurityException;

    const-string v21, "Camera permission is not granted"

    move-object/from16 v16, v7

    invoke-direct/range {v16 .. v21}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;Ljava/lang/String;)V

    sput-object v7, Lcom/google/ar/core/ae;->l:Lcom/google/ar/core/ae;

    new-instance v14, Lcom/google/ar/core/ae;

    const/16 v15, -0xa

    const-class v5, Lcom/google/ar/core/exceptions/DeadlineExceededException;

    const-string v3, "ERROR_DEADLINE_EXCEEDED"

    move-object/from16 v18, v7

    const/16 v7, 0xc

    invoke-direct {v14, v3, v7, v15, v5}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v14, Lcom/google/ar/core/ae;->m:Lcom/google/ar/core/ae;

    new-instance v3, Lcom/google/ar/core/ae;

    const/16 v5, -0xb

    const-class v15, Lcom/google/ar/core/exceptions/ResourceExhaustedException;

    const-string v7, "ERROR_RESOURCE_EXHAUSTED"

    move-object/from16 v20, v14

    const/16 v14, 0xd

    invoke-direct {v3, v7, v14, v5, v15}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v3, Lcom/google/ar/core/ae;->n:Lcom/google/ar/core/ae;

    new-instance v5, Lcom/google/ar/core/ae;

    const/16 v7, -0xc

    const-class v15, Lcom/google/ar/core/exceptions/NotYetAvailableException;

    const-string v14, "ERROR_NOT_YET_AVAILABLE"

    move-object/from16 v22, v3

    const/16 v3, 0xe

    invoke-direct {v5, v14, v3, v7, v15}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v5, Lcom/google/ar/core/ae;->o:Lcom/google/ar/core/ae;

    new-instance v7, Lcom/google/ar/core/ae;

    const/16 v14, -0xd

    const-class v15, Lcom/google/ar/core/exceptions/CameraNotAvailableException;

    const-string v3, "ERROR_CAMERA_NOT_AVAILABLE"

    move-object/from16 v23, v5

    const/16 v5, 0xf

    invoke-direct {v7, v3, v5, v14, v15}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v7, Lcom/google/ar/core/ae;->p:Lcom/google/ar/core/ae;

    new-instance v3, Lcom/google/ar/core/ae;

    const/16 v14, -0x10

    const-class v15, Lcom/google/ar/core/exceptions/AnchorNotSupportedForHostingException;

    const-string v5, "ERROR_ANCHOR_NOT_SUPPORTED_FOR_HOSTING"

    move-object/from16 v24, v7

    const/16 v7, 0x10

    invoke-direct {v3, v5, v7, v14, v15}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v3, Lcom/google/ar/core/ae;->q:Lcom/google/ar/core/ae;

    new-instance v5, Lcom/google/ar/core/ae;

    const/16 v14, -0x11

    const-class v15, Lcom/google/ar/core/exceptions/ImageInsufficientQualityException;

    const-string v7, "ERROR_IMAGE_INSUFFICIENT_QUALITY"

    move-object/from16 v25, v3

    const/16 v3, 0x11

    invoke-direct {v5, v7, v3, v14, v15}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v5, Lcom/google/ar/core/ae;->r:Lcom/google/ar/core/ae;

    new-instance v7, Lcom/google/ar/core/ae;

    const/16 v14, -0x12

    const-class v15, Lcom/google/ar/core/exceptions/DataInvalidFormatException;

    const-string v3, "ERROR_DATA_INVALID_FORMAT"

    move-object/from16 v26, v5

    const/16 v5, 0x12

    invoke-direct {v7, v3, v5, v14, v15}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v7, Lcom/google/ar/core/ae;->s:Lcom/google/ar/core/ae;

    new-instance v3, Lcom/google/ar/core/ae;

    const/16 v14, -0x13

    const-class v15, Lcom/google/ar/core/exceptions/DataUnsupportedVersionException;

    const-string v5, "ERROR_DATA_UNSUPPORTED_VERSION"

    move-object/from16 v27, v7

    const/16 v7, 0x13

    invoke-direct {v3, v5, v7, v14, v15}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v3, Lcom/google/ar/core/ae;->t:Lcom/google/ar/core/ae;

    new-instance v5, Lcom/google/ar/core/ae;

    const/16 v14, -0x14

    const-class v15, Ljava/lang/IllegalStateException;

    const-string v7, "ERROR_ILLEGAL_STATE"

    move-object/from16 v28, v3

    const/16 v3, 0x14

    invoke-direct {v5, v7, v3, v14, v15}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v5, Lcom/google/ar/core/ae;->u:Lcom/google/ar/core/ae;

    new-instance v7, Lcom/google/ar/core/ae;

    const/16 v14, -0x17

    const-class v15, Lcom/google/ar/core/exceptions/RecordingFailedException;

    const-string v3, "ERROR_RECORDING_FAILED"

    move-object/from16 v29, v5

    const/16 v5, 0x15

    invoke-direct {v7, v3, v5, v14, v15}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v7, Lcom/google/ar/core/ae;->v:Lcom/google/ar/core/ae;

    new-instance v3, Lcom/google/ar/core/ae;

    const/16 v14, -0x18

    const-class v15, Lcom/google/ar/core/exceptions/PlaybackFailedException;

    const-string v5, "ERROR_PLAYBACK_FAILED"

    move-object/from16 v30, v7

    const/16 v7, 0x16

    invoke-direct {v3, v5, v7, v14, v15}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v3, Lcom/google/ar/core/ae;->w:Lcom/google/ar/core/ae;

    new-instance v5, Lcom/google/ar/core/ae;

    const/16 v14, -0x19

    const-class v15, Lcom/google/ar/core/exceptions/SessionUnsupportedException;

    const-string v7, "ERROR_SESSION_UNSUPPORTED"

    move-object/from16 v31, v3

    const/16 v3, 0x17

    invoke-direct {v5, v7, v3, v14, v15}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v5, Lcom/google/ar/core/ae;->x:Lcom/google/ar/core/ae;

    new-instance v3, Lcom/google/ar/core/ae;

    const/16 v7, -0x1a

    const-class v14, Lcom/google/ar/core/exceptions/MetadataNotFoundException;

    const-string v15, "ERROR_METADATA_NOT_FOUND"

    move-object/from16 v32, v5

    const/16 v5, 0x18

    invoke-direct {v3, v15, v5, v7, v14}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v3, Lcom/google/ar/core/ae;->y:Lcom/google/ar/core/ae;

    new-instance v5, Lcom/google/ar/core/ae;

    const/16 v7, -0xe

    const-class v14, Lcom/google/ar/core/exceptions/CloudAnchorsNotConfiguredException;

    const-string v15, "ERROR_CLOUD_ANCHORS_NOT_CONFIGURED"

    move-object/from16 v33, v3

    const/16 v3, 0x19

    invoke-direct {v5, v15, v3, v7, v14}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v5, Lcom/google/ar/core/ae;->z:Lcom/google/ar/core/ae;

    new-instance v3, Lcom/google/ar/core/ae;

    const-string v35, "ERROR_INTERNET_PERMISSION_NOT_GRANTED"

    const/16 v36, 0x1a

    const/16 v37, -0xf

    const-class v38, Ljava/lang/SecurityException;

    const-string v39, "Internet permission is not granted"

    move-object/from16 v34, v3

    invoke-direct/range {v34 .. v39}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;Ljava/lang/String;)V

    sput-object v3, Lcom/google/ar/core/ae;->A:Lcom/google/ar/core/ae;

    new-instance v7, Lcom/google/ar/core/ae;

    const/16 v14, -0x64

    const-class v15, Lcom/google/ar/core/exceptions/UnavailableArcoreNotInstalledException;

    const-string v3, "UNAVAILABLE_ARCORE_NOT_INSTALLED"

    move-object/from16 v35, v5

    const/16 v5, 0x1b

    invoke-direct {v7, v3, v5, v14, v15}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v7, Lcom/google/ar/core/ae;->B:Lcom/google/ar/core/ae;

    new-instance v3, Lcom/google/ar/core/ae;

    const/16 v5, -0x65

    const-class v14, Lcom/google/ar/core/exceptions/UnavailableDeviceNotCompatibleException;

    const-string v15, "UNAVAILABLE_DEVICE_NOT_COMPATIBLE"

    move-object/from16 v36, v7

    const/16 v7, 0x1c

    invoke-direct {v3, v15, v7, v5, v14}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v3, Lcom/google/ar/core/ae;->C:Lcom/google/ar/core/ae;

    new-instance v5, Lcom/google/ar/core/ae;

    const/16 v7, -0x67

    const-class v14, Lcom/google/ar/core/exceptions/UnavailableApkTooOldException;

    const-string v15, "UNAVAILABLE_APK_TOO_OLD"

    move-object/from16 v37, v3

    const/16 v3, 0x1d

    invoke-direct {v5, v15, v3, v7, v14}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v5, Lcom/google/ar/core/ae;->D:Lcom/google/ar/core/ae;

    new-instance v3, Lcom/google/ar/core/ae;

    const/16 v7, -0x68

    const-class v14, Lcom/google/ar/core/exceptions/UnavailableSdkTooOldException;

    const-string v15, "UNAVAILABLE_SDK_TOO_OLD"

    move-object/from16 v38, v5

    const/16 v5, 0x1e

    invoke-direct {v3, v15, v5, v7, v14}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v3, Lcom/google/ar/core/ae;->E:Lcom/google/ar/core/ae;

    new-instance v5, Lcom/google/ar/core/ae;

    const/16 v7, -0x69

    const-class v14, Lcom/google/ar/core/exceptions/UnavailableUserDeclinedInstallationException;

    const-string v15, "UNAVAILABLE_USER_DECLINED_INSTALLATION"

    move-object/from16 v39, v3

    const/16 v3, 0x1f

    invoke-direct {v5, v15, v3, v7, v14}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v5, Lcom/google/ar/core/ae;->F:Lcom/google/ar/core/ae;

    const/16 v3, 0x20

    new-array v3, v3, [Lcom/google/ar/core/ae;

    const/4 v7, 0x0

    aput-object v0, v3, v7

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    const/4 v0, 0x3

    aput-object v4, v3, v0

    const/4 v0, 0x4

    aput-object v6, v3, v0

    const/4 v0, 0x5

    aput-object v8, v3, v0

    const/4 v0, 0x6

    aput-object v10, v3, v0

    const/4 v0, 0x7

    aput-object v12, v3, v0

    const/16 v0, 0x8

    aput-object v11, v3, v0

    const/16 v0, 0x9

    aput-object v13, v3, v0

    const/16 v0, 0xa

    aput-object v9, v3, v0

    const/16 v0, 0xb

    aput-object v18, v3, v0

    const/16 v0, 0xc

    aput-object v20, v3, v0

    const/16 v0, 0xd

    aput-object v22, v3, v0

    const/16 v0, 0xe

    aput-object v23, v3, v0

    const/16 v0, 0xf

    aput-object v24, v3, v0

    const/16 v0, 0x10

    aput-object v25, v3, v0

    const/16 v0, 0x11

    aput-object v26, v3, v0

    const/16 v0, 0x12

    aput-object v27, v3, v0

    const/16 v0, 0x13

    aput-object v28, v3, v0

    const/16 v0, 0x14

    aput-object v29, v3, v0

    const/16 v0, 0x15

    aput-object v30, v3, v0

    const/16 v0, 0x16

    aput-object v31, v3, v0

    const/16 v0, 0x17

    aput-object v32, v3, v0

    const/16 v0, 0x18

    aput-object v33, v3, v0

    const/16 v0, 0x19

    aput-object v35, v3, v0

    const/16 v0, 0x1a

    aput-object v34, v3, v0

    const/16 v0, 0x1b

    aput-object v36, v3, v0

    const/16 v0, 0x1c

    aput-object v37, v3, v0

    const/16 v0, 0x1d

    aput-object v38, v3, v0

    const/16 v0, 0x1e

    aput-object v39, v3, v0

    const/16 v0, 0x1f

    aput-object v5, v3, v0

    sput-object v3, Lcom/google/ar/core/ae;->J:[Lcom/google/ar/core/ae;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/Class;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/ar/core/ae;-><init>(Ljava/lang/String;IILjava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/Class;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/ar/core/ae;->G:I

    iput-object p4, p0, Lcom/google/ar/core/ae;->H:Ljava/lang/Class;

    iput-object p5, p0, Lcom/google/ar/core/ae;->I:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/google/ar/core/ae;
    .locals 1

    sget-object v0, Lcom/google/ar/core/ae;->J:[Lcom/google/ar/core/ae;

    invoke-virtual {v0}, [Lcom/google/ar/core/ae;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/ar/core/ae;

    return-object v0
.end method
