.class public final LUl4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final LoadingImageView:[I

.field public static final LoadingImageView_circleCrop:I = 0x0

.field public static final LoadingImageView_imageAspectRatio:I = 0x1

.field public static final LoadingImageView_imageAspectRatioAdjust:I = 0x2

.field public static final SignInButton:[I

.field public static final SignInButton_buttonSize:I = 0x0

.field public static final SignInButton_colorScheme:I = 0x1

.field public static final SignInButton_scopeUris:I = 0x2


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x3

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, LUl4;->LoadingImageView:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, LUl4;->SignInButton:[I

    return-void

    :array_0
    .array-data 4
        0x7f040113
        0x7f0402c8
        0x7f0402c9
    .end array-data

    :array_1
    .array-data 4
        0x7f0400b4
        0x7f04015a
        0x7f0404c0
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
