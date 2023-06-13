.class public abstract Ldp6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldp6$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Ldp6$a;
    .locals 2

    new-instance v0, Lru$b;

    invoke-direct {v0}, Lru$b;-><init>()V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lru$b;->i(I)Ldp6$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ldp6$a;->e(I)Ldp6$a;

    move-result-object v0

    const v1, 0x7f000789

    invoke-virtual {v0, v1}, Ldp6$a;->c(I)Ldp6$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract b()Lr46;
.end method

.method public c()Landroid/media/MediaFormat;
    .locals 3

    invoke-virtual {p0}, Ldp6;->j()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p0}, Ldp6;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-static {v1, v2, v0}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v0

    const-string v1, "color-format"

    invoke-virtual {p0}, Ldp6;->f()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v1, "bitrate"

    invoke-virtual {p0}, Ldp6;->e()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v1, "frame-rate"

    invoke-virtual {p0}, Ldp6;->g()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v1, "i-frame-interval"

    invoke-virtual {p0}, Ldp6;->h()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    invoke-virtual {p0}, Ldp6;->i()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const-string v1, "profile"

    invoke-virtual {p0}, Ldp6;->i()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_0
    return-object v0
.end method

.method public abstract e()I
.end method

.method public abstract f()I
.end method

.method public abstract g()I
.end method

.method public abstract h()I
.end method

.method public abstract i()I
.end method

.method public abstract j()Landroid/util/Size;
.end method
