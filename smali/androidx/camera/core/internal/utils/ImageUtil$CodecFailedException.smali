.class public final Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/internal/utils/ImageUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CodecFailedException"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;
    }
.end annotation


# instance fields
.field public final b:Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException;->b:Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    return-void
.end method


# virtual methods
.method public a()Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException;->b:Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    return-object v0
.end method
