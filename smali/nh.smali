.class public final Lnh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/media/MediaCodecInfo$AudioCapabilities;)[Landroid/util/Range;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/MediaCodecInfo$AudioCapabilities;",
            ")[",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lgh;->a(Landroid/media/MediaCodecInfo$AudioCapabilities;)[Landroid/util/Range;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/media/MediaCodecInfo$AudioCapabilities;)I
    .locals 0

    invoke-static {p0}, Lkh;->a(Landroid/media/MediaCodecInfo$AudioCapabilities;)I

    move-result p0

    return p0
.end method

.method public static c(Landroid/media/AudioRecord$Builder;Landroid/content/Context;)V
    .locals 0

    invoke-static {p0, p1}, Lih;->a(Landroid/media/AudioRecord$Builder;Landroid/content/Context;)Landroid/media/AudioRecord$Builder;

    return-void
.end method
