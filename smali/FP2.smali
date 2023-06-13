.class public abstract LFP2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFP2$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LFP2$a;
    .locals 2

    new-instance v0, LOt$b;

    invoke-direct {v0}, LOt$b;-><init>()V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, LOt$b;->e(I)LFP2$a;

    move-result-object v0

    invoke-static {}, LFp;->a()LFp$a;

    move-result-object v1

    invoke-virtual {v1}, LFp$a;->a()LFp;

    move-result-object v1

    invoke-virtual {v0, v1}, LFP2$a;->d(LFp;)LFP2$a;

    move-result-object v0

    invoke-static {}, Lwp6;->a()Lwp6$a;

    move-result-object v1

    invoke-virtual {v1}, Lwp6$a;->a()Lwp6;

    move-result-object v1

    invoke-virtual {v0, v1}, LFP2$a;->f(Lwp6;)LFP2$a;

    move-result-object v0

    return-object v0
.end method

.method public static e(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const-string p0, "audio/mp4a-latm"

    return-object p0

    :cond_0
    const-string p0, "audio/vorbis"

    return-object p0
.end method

.method public static f(I)I
    .locals 1

    invoke-static {p0}, LFP2;->e(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "audio/mp4a-latm"

    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x2

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static g(I)I
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return v0
.end method

.method public static h(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const-string p0, "video/avc"

    return-object p0

    :cond_0
    const-string p0, "video/x-vnd.on2.vp8"

    return-object p0
.end method


# virtual methods
.method public abstract b()LFp;
.end method

.method public abstract c()I
.end method

.method public abstract d()Lwp6;
.end method

.method public abstract i()LFP2$a;
.end method
