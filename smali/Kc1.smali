.class public LKc1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/media/EncoderProfiles;)Llc1;
    .locals 3

    invoke-static {p0}, Lnc1;->a(Landroid/media/EncoderProfiles;)I

    move-result v0

    invoke-static {p0}, Lxc1;->a(Landroid/media/EncoderProfiles;)I

    move-result v1

    invoke-static {p0}, Lyc1;->a(Landroid/media/EncoderProfiles;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, LKc1;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-static {p0}, Lzc1;->a(Landroid/media/EncoderProfiles;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, LKc1;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-static {v0, v1, v2, p0}, Llc1$b;->e(IILjava/util/List;Ljava/util/List;)Llc1$b;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/EncoderProfiles$AudioProfile;",
            ">;)",
            "Ljava/util/List<",
            "Llc1$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lqc1;->a(Ljava/lang/Object;)Landroid/media/EncoderProfiles$AudioProfile;

    move-result-object v1

    invoke-static {v1}, Lrc1;->a(Landroid/media/EncoderProfiles$AudioProfile;)I

    move-result v2

    invoke-static {v1}, Lsc1;->a(Landroid/media/EncoderProfiles$AudioProfile;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Ltc1;->a(Landroid/media/EncoderProfiles$AudioProfile;)I

    move-result v4

    invoke-static {v1}, Luc1;->a(Landroid/media/EncoderProfiles$AudioProfile;)I

    move-result v5

    invoke-static {v1}, Lvc1;->a(Landroid/media/EncoderProfiles$AudioProfile;)I

    move-result v6

    invoke-static {v1}, Lwc1;->a(Landroid/media/EncoderProfiles$AudioProfile;)I

    move-result v7

    invoke-static/range {v2 .. v7}, Llc1$a;->a(ILjava/lang/String;IIII)Llc1$a;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static c(Ljava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/EncoderProfiles$VideoProfile;",
            ">;)",
            "Ljava/util/List<",
            "Llc1$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LAc1;->a(Ljava/lang/Object;)Landroid/media/EncoderProfiles$VideoProfile;

    move-result-object v1

    invoke-static {v1}, LBc1;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v2

    invoke-static {v1}, LCc1;->a(Landroid/media/EncoderProfiles$VideoProfile;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, LDc1;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v4

    invoke-static {v1}, LEc1;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v5

    invoke-static {v1}, LFc1;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v6

    invoke-static {v1}, Loc1;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v7

    invoke-static {v1}, Lpc1;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v8

    invoke-static {v1}, LIc1;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v9

    invoke-static {v1}, LJc1;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v10

    invoke-static {v1}, LHc1;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    move-result v11

    invoke-static/range {v2 .. v11}, Llc1$c;->a(ILjava/lang/String;IIIIIIII)Llc1$c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
