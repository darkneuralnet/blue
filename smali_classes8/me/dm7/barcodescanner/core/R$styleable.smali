.class public final Lme/dm7/barcodescanner/core/R$styleable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/dm7/barcodescanner/core/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final BarcodeScannerView:[I

.field public static final BarcodeScannerView_borderAlpha:I = 0x0

.field public static final BarcodeScannerView_borderColor:I = 0x1

.field public static final BarcodeScannerView_borderLength:I = 0x2

.field public static final BarcodeScannerView_borderWidth:I = 0x3

.field public static final BarcodeScannerView_cornerRadius:I = 0x4

.field public static final BarcodeScannerView_finderOffset:I = 0x5

.field public static final BarcodeScannerView_laserColor:I = 0x6

.field public static final BarcodeScannerView_laserEnabled:I = 0x7

.field public static final BarcodeScannerView_maskColor:I = 0x8

.field public static final BarcodeScannerView_roundedCorner:I = 0x9

.field public static final BarcodeScannerView_shouldScaleToFill:I = 0xa

.field public static final BarcodeScannerView_squaredFinder:I = 0xb


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xc

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lme/dm7/barcodescanner/core/R$styleable;->BarcodeScannerView:[I

    return-void

    :array_0
    .array-data 4
        0x7f04008e
        0x7f04008f
        0x7f040090
        0x7f040093
        0x7f040197
        0x7f040260
        0x7f040315
        0x7f040316
        0x7f0403ab
        0x7f0404bb
        0x7f0404e2
        0x7f040512
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
