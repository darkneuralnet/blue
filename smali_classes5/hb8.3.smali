.class public final Lhb8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final A:LSk1;

.field public static final A0:LSk1;

.field public static final B:LSk1;

.field public static final B0:LSk1;

.field public static final C:LSk1;

.field public static final C0:LSk1;

.field public static final D:LSk1;

.field public static final D0:LSk1;

.field public static final E:LSk1;

.field public static final E0:LSk1;

.field public static final F:LSk1;

.field public static final F0:LSk1;

.field public static final G:LSk1;

.field public static final G0:LSk1;

.field public static final H:LSk1;

.field public static final H0:LSk1;

.field public static final I:LSk1;

.field public static final I0:LSk1;

.field public static final J:LSk1;

.field public static final J0:LSk1;

.field public static final K:LSk1;

.field public static final K0:LSk1;

.field public static final L:LSk1;

.field public static final L0:LSk1;

.field public static final M:LSk1;

.field public static final M0:LSk1;

.field public static final N:LSk1;

.field public static final O:LSk1;

.field public static final P:LSk1;

.field public static final Q:LSk1;

.field public static final R:LSk1;

.field public static final S:LSk1;

.field public static final T:LSk1;

.field public static final U:LSk1;

.field public static final V:LSk1;

.field public static final W:LSk1;

.field public static final X:LSk1;

.field public static final Y:LSk1;

.field public static final Z:LSk1;

.field public static final a:Lhb8;

.field public static final a0:LSk1;

.field public static final b:LSk1;

.field public static final b0:LSk1;

.field public static final c:LSk1;

.field public static final c0:LSk1;

.field public static final d:LSk1;

.field public static final d0:LSk1;

.field public static final e:LSk1;

.field public static final e0:LSk1;

.field public static final f:LSk1;

.field public static final f0:LSk1;

.field public static final g:LSk1;

.field public static final g0:LSk1;

.field public static final h:LSk1;

.field public static final h0:LSk1;

.field public static final i:LSk1;

.field public static final i0:LSk1;

.field public static final j:LSk1;

.field public static final j0:LSk1;

.field public static final k:LSk1;

.field public static final k0:LSk1;

.field public static final l:LSk1;

.field public static final l0:LSk1;

.field public static final m:LSk1;

.field public static final m0:LSk1;

.field public static final n:LSk1;

.field public static final n0:LSk1;

.field public static final o:LSk1;

.field public static final o0:LSk1;

.field public static final p:LSk1;

.field public static final p0:LSk1;

.field public static final q:LSk1;

.field public static final q0:LSk1;

.field public static final r:LSk1;

.field public static final r0:LSk1;

.field public static final s:LSk1;

.field public static final s0:LSk1;

.field public static final t:LSk1;

.field public static final t0:LSk1;

.field public static final u:LSk1;

.field public static final u0:LSk1;

.field public static final v:LSk1;

.field public static final v0:LSk1;

.field public static final w:LSk1;

.field public static final w0:LSk1;

.field public static final x:LSk1;

.field public static final x0:LSk1;

.field public static final y:LSk1;

.field public static final y0:LSk1;

.field public static final z:LSk1;

.field public static final z0:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhb8;

    invoke-direct {v0}, Lhb8;-><init>()V

    sput-object v0, Lhb8;->a:Lhb8;

    const-string v0, "systemInfo"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->b:LSk1;

    const-string v0, "eventName"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->c:LSk1;

    const-string v0, "isThickClient"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x25

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->d:LSk1;

    const-string v0, "clientType"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x3d

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->e:LSk1;

    const-string v0, "modelDownloadLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->f:LSk1;

    const-string v0, "customModelLoadLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x14

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->g:LSk1;

    const-string v0, "customModelInferenceLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->h:LSk1;

    const-string v0, "customModelCreateLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x1d

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->i:LSk1;

    const-string v0, "onDeviceFaceDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->j:LSk1;

    const-string v0, "onDeviceFaceLoadLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x3b

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->k:LSk1;

    const-string v0, "onDeviceTextDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->l:LSk1;

    const-string v0, "onDeviceTextDetectionLoadLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x4f

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->m:LSk1;

    const-string v0, "onDeviceBarcodeDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->n:LSk1;

    const-string v0, "onDeviceBarcodeLoadLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->o:LSk1;

    const-string v0, "onDeviceImageLabelCreateLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x30

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->p:LSk1;

    const-string v0, "onDeviceImageLabelLoadLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x31

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->q:LSk1;

    const-string v0, "onDeviceImageLabelDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x12

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->r:LSk1;

    const-string v0, "onDeviceObjectCreateLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x1a

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->s:LSk1;

    const-string v0, "onDeviceObjectLoadLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x1b

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->t:LSk1;

    const-string v0, "onDeviceObjectInferenceLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x1c

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->u:LSk1;

    const-string v0, "onDevicePoseDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x2c

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->v:LSk1;

    const-string v0, "onDeviceSegmentationLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x2d

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->w:LSk1;

    const-string v0, "onDeviceSmartReplyLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x13

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->x:LSk1;

    const-string v0, "onDeviceLanguageIdentificationLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x15

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->y:LSk1;

    const-string v0, "onDeviceTranslationLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x16

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->z:LSk1;

    const-string v0, "cloudFaceDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->A:LSk1;

    const-string v0, "cloudCropHintDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->B:LSk1;

    const-string v0, "cloudDocumentTextDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->C:LSk1;

    const-string v0, "cloudImagePropertiesDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->D:LSk1;

    const-string v0, "cloudImageLabelDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->E:LSk1;

    const-string v0, "cloudLandmarkDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->F:LSk1;

    const-string v0, "cloudLogoDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0xe

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->G:LSk1;

    const-string v0, "cloudSafeSearchDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0xf

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->H:LSk1;

    const-string v0, "cloudTextDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->I:LSk1;

    const-string v0, "cloudWebSearchDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x11

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->J:LSk1;

    const-string v0, "automlImageLabelingCreateLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x17

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->K:LSk1;

    const-string v0, "automlImageLabelingLoadLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x18

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->L:LSk1;

    const-string v0, "automlImageLabelingInferenceLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x19

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->M:LSk1;

    const-string v0, "isModelDownloadedLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x27

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->N:LSk1;

    const-string v0, "deleteModelLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x28

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->O:LSk1;

    const-string v0, "aggregatedAutomlImageLabelingInferenceLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x1e

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->P:LSk1;

    const-string v0, "aggregatedCustomModelInferenceLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x1f

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->Q:LSk1;

    const-string v0, "aggregatedOnDeviceFaceDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->R:LSk1;

    const-string v0, "aggregatedOnDeviceBarcodeDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x21

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->S:LSk1;

    const-string v0, "aggregatedOnDeviceImageLabelDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->T:LSk1;

    const-string v0, "aggregatedOnDeviceObjectInferenceLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x23

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->U:LSk1;

    const-string v0, "aggregatedOnDeviceTextDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x24

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->V:LSk1;

    const-string v0, "aggregatedOnDevicePoseDetectionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->W:LSk1;

    const-string v0, "aggregatedOnDeviceSegmentationLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x2f

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->X:LSk1;

    const-string v0, "pipelineAccelerationInferenceEvents"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x45

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->Y:LSk1;

    const-string v0, "remoteConfigLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x2a

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->Z:LSk1;

    const-string v0, "inputImageConstructionLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x32

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->a0:LSk1;

    const-string v0, "leakedHandleEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x33

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->b0:LSk1;

    const-string v0, "cameraSourceLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x34

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->c0:LSk1;

    const-string v0, "imageLabelOptionalModuleLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x35

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->d0:LSk1;

    const-string v0, "languageIdentificationOptionalModuleLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x36

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->e0:LSk1;

    const-string v0, "faceDetectionOptionalModuleLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x3c

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->f0:LSk1;

    const-string v0, "documentDetectionOptionalModuleLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x55

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->g0:LSk1;

    const-string v0, "documentCroppingOptionalModuleLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x56

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->h0:LSk1;

    const-string v0, "documentEnhancementOptionalModuleLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x57

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->i0:LSk1;

    const-string v0, "nlClassifierOptionalModuleLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x37

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->j0:LSk1;

    const-string v0, "nlClassifierClientLibraryLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x38

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->k0:LSk1;

    const-string v0, "accelerationAllowlistLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x39

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->l0:LSk1;

    const-string v0, "toxicityDetectionCreateEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x3e

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->m0:LSk1;

    const-string v0, "toxicityDetectionLoadEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x3f

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->n0:LSk1;

    const-string v0, "toxicityDetectionInferenceEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x40

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->o0:LSk1;

    const-string v0, "barcodeDetectionOptionalModuleLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x41

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->p0:LSk1;

    const-string v0, "customImageLabelOptionalModuleLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x42

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->q0:LSk1;

    const-string v0, "codeScannerScanApiEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x43

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->r0:LSk1;

    const-string v0, "codeScannerOptionalModuleEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x44

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->s0:LSk1;

    const-string v0, "onDeviceExplicitContentCreateLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x46

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->t0:LSk1;

    const-string v0, "onDeviceExplicitContentLoadLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x47

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->u0:LSk1;

    const-string v0, "onDeviceExplicitContentInferenceLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x48

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->v0:LSk1;

    const-string v0, "aggregatedOnDeviceExplicitContentLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x49

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->w0:LSk1;

    const-string v0, "onDeviceFaceMeshCreateLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x4a

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->x0:LSk1;

    const-string v0, "onDeviceFaceMeshLoadLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x4b

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->y0:LSk1;

    const-string v0, "onDeviceFaceMeshLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x4c

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->z0:LSk1;

    const-string v0, "aggregatedOnDeviceFaceMeshLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x4d

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->A0:LSk1;

    const-string v0, "smartReplyOptionalModuleLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x4e

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->B0:LSk1;

    const-string v0, "textDetectionOptionalModuleLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x50

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->C0:LSk1;

    const-string v0, "onDeviceImageQualityAnalysisCreateLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x51

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->D0:LSk1;

    const-string v0, "onDeviceImageQualityAnalysisLoadLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x52

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->E0:LSk1;

    const-string v0, "onDeviceImageQualityAnalysisLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x53

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->F0:LSk1;

    const-string v0, "aggregatedOnDeviceImageQualityAnalysisLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x54

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->G0:LSk1;

    const-string v0, "imageQualityAnalysisOptionalModuleLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x58

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->H0:LSk1;

    const-string v0, "imageCaptioningOptionalModuleLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x59

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->I0:LSk1;

    const-string v0, "onDeviceImageCaptioningCreateLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x5a

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->J0:LSk1;

    const-string v0, "onDeviceImageCaptioningLoadLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->K0:LSk1;

    const-string v0, "onDeviceImageCaptioningInferenceLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x5c

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->L0:LSk1;

    const-string v0, "aggregatedOnDeviceImageCaptioningInferenceLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x5d

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhb8;->M0:LSk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, LqG8;

    check-cast p2, LPd3;

    sget-object v0, Lhb8;->b:LSk1;

    invoke-virtual {p1}, LqG8;->c()LVT8;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->c:LSk1;

    invoke-virtual {p1}, LqG8;->b()LGF8;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->d:LSk1;

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->e:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->f:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->g:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->h:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->i:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->j:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->k:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->l:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->m:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->n:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->o:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->p:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->q:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->r:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->s:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->t:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->u:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->v:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->w:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->x:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->y:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->z:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->A:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->B:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->C:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->D:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->E:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->F:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->G:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->H:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->I:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->J:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->K:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->L:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->M:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->N:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->O:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->P:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->Q:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->R:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->S:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->T:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->U:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->V:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->W:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->X:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->Y:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->Z:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhb8;->a0:LSk1;

    invoke-virtual {p1}, LqG8;->a()LzE8;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->b0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->c0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->d0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->e0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->f0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->g0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->h0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->i0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->j0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->k0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->l0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->m0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->n0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->o0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->p0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->q0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->r0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->s0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->t0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->u0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->v0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->w0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->x0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->y0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->z0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->A0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->B0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->C0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->D0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->E0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->F0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->G0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->H0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->I0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->J0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->K0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->L0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, Lhb8;->M0:LSk1;

    invoke-interface {p2, p1, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    return-void
.end method