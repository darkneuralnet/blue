.class public LLc1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/media/CamcorderProfile;)Llc1;
    .locals 3

    iget v0, p0, Landroid/media/CamcorderProfile;->duration:I

    iget v1, p0, Landroid/media/CamcorderProfile;->fileFormat:I

    invoke-static {p0}, LLc1;->e(Landroid/media/CamcorderProfile;)Ljava/util/List;

    move-result-object v2

    invoke-static {p0}, LLc1;->f(Landroid/media/CamcorderProfile;)Ljava/util/List;

    move-result-object p0

    invoke-static {v0, v1, v2, p0}, Llc1$b;->e(IILjava/util/List;Ljava/util/List;)Llc1$b;

    move-result-object p0

    return-object p0
.end method

.method public static b(I)Ljava/lang/String;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const-string p0, "audio/none"

    return-object p0

    :pswitch_0
    const-string p0, "audio/opus"

    return-object p0

    :pswitch_1
    const-string p0, "audio/vorbis"

    return-object p0

    :pswitch_2
    const-string p0, "audio/mp4a-latm"

    return-object p0

    :pswitch_3
    const-string p0, "audio/amr-wb"

    return-object p0

    :pswitch_4
    const-string p0, "audio/3gpp"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static c(I)I
    .locals 2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    const/4 v1, 0x5

    if-eq p0, v0, :cond_1

    if-eq p0, v1, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    const/16 p0, 0x27

    return p0

    :cond_1
    return v1

    :cond_2
    const/4 p0, 0x2

    return p0
.end method

.method public static d(I)Ljava/lang/String;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const-string p0, "video/none"

    return-object p0

    :pswitch_0
    const-string p0, "video/av01"

    return-object p0

    :pswitch_1
    const-string p0, "video/dolby-vision"

    return-object p0

    :pswitch_2
    const-string p0, "video/x-vnd.on2.vp9"

    return-object p0

    :pswitch_3
    const-string p0, "video/hevc"

    return-object p0

    :pswitch_4
    const-string p0, "video/x-vnd.on2.vp8"

    return-object p0

    :pswitch_5
    const-string p0, "video/mp4v-es"

    return-object p0

    :pswitch_6
    const-string p0, "video/avc"

    return-object p0

    :pswitch_7
    const-string p0, "video/3gpp"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static e(Landroid/media/CamcorderProfile;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/CamcorderProfile;",
            ")",
            "Ljava/util/List<",
            "Llc1$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget v1, p0, Landroid/media/CamcorderProfile;->audioCodec:I

    invoke-static {v1}, LLc1;->b(I)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Landroid/media/CamcorderProfile;->audioBitRate:I

    iget v4, p0, Landroid/media/CamcorderProfile;->audioSampleRate:I

    iget v5, p0, Landroid/media/CamcorderProfile;->audioChannels:I

    iget p0, p0, Landroid/media/CamcorderProfile;->audioCodec:I

    invoke-static {p0}, LLc1;->c(I)I

    move-result v6

    invoke-static/range {v1 .. v6}, Llc1$a;->a(ILjava/lang/String;IIII)Llc1$a;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static f(Landroid/media/CamcorderProfile;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/CamcorderProfile;",
            ")",
            "Ljava/util/List<",
            "Llc1$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget v1, p0, Landroid/media/CamcorderProfile;->videoCodec:I

    invoke-static {v1}, LLc1;->d(I)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Landroid/media/CamcorderProfile;->videoBitRate:I

    iget v4, p0, Landroid/media/CamcorderProfile;->videoFrameRate:I

    iget v5, p0, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    iget v6, p0, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    const/4 v7, -0x1

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v10}, Llc1$c;->a(ILjava/lang/String;IIIIIIII)Llc1$c;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
