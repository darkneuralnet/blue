.class public final enum Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

.field public static final enum c:Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

.field public static final enum d:Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

.field public static final synthetic e:[Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    const-string v1, "ENCODE_FAILED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;->b:Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    new-instance v0, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    const-string v1, "DECODE_FAILED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;->c:Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    new-instance v0, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;->d:Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    invoke-static {}, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;->a()[Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;->e:[Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;->b:Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;->c:Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;->d:Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;
    .locals 1

    const-class v0, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    return-object p0
.end method

.method public static values()[Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;
    .locals 1

    sget-object v0, Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;->e:[Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    invoke-virtual {v0}, [Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/internal/utils/ImageUtil$CodecFailedException$a;

    return-object v0
.end method
