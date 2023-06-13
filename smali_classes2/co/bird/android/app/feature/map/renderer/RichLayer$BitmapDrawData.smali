.class public final Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/map/renderer/RichLayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BitmapDrawData"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008#\u0010$J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003J7\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u0006%"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;",
        "",
        "LU74;",
        "component1",
        "Landroid/graphics/Bitmap;",
        "component2",
        "Lcom/google/android/gms/maps/model/CameraPosition;",
        "component3",
        "",
        "LZO4;",
        "component4",
        "projection",
        "bitmap",
        "cameraPosition",
        "drawnShapes",
        "copy",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "LU74;",
        "getProjection",
        "()LU74;",
        "Landroid/graphics/Bitmap;",
        "getBitmap",
        "()Landroid/graphics/Bitmap;",
        "Lcom/google/android/gms/maps/model/CameraPosition;",
        "getCameraPosition",
        "()Lcom/google/android/gms/maps/model/CameraPosition;",
        "Ljava/util/List;",
        "getDrawnShapes",
        "()Ljava/util/List;",
        "<init>",
        "(LU74;Landroid/graphics/Bitmap;Lcom/google/android/gms/maps/model/CameraPosition;Ljava/util/List;)V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final bitmap:Landroid/graphics/Bitmap;

.field private final cameraPosition:Lcom/google/android/gms/maps/model/CameraPosition;

.field private final drawnShapes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LZO4;",
            ">;"
        }
    .end annotation
.end field

.field private final projection:LU74;


# direct methods
.method public constructor <init>(LU74;Landroid/graphics/Bitmap;Lcom/google/android/gms/maps/model/CameraPosition;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LU74;",
            "Landroid/graphics/Bitmap;",
            "Lcom/google/android/gms/maps/model/CameraPosition;",
            "Ljava/util/List<",
            "+",
            "LZO4;",
            ">;)V"
        }
    .end annotation

    const-string v0, "projection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraPosition"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "drawnShapes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->projection:LU74;

    iput-object p2, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->bitmap:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->cameraPosition:Lcom/google/android/gms/maps/model/CameraPosition;

    iput-object p4, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->drawnShapes:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;LU74;Landroid/graphics/Bitmap;Lcom/google/android/gms/maps/model/CameraPosition;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->projection:LU74;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->bitmap:Landroid/graphics/Bitmap;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->cameraPosition:Lcom/google/android/gms/maps/model/CameraPosition;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->drawnShapes:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->copy(LU74;Landroid/graphics/Bitmap;Lcom/google/android/gms/maps/model/CameraPosition;Ljava/util/List;)Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()LU74;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->projection:LU74;

    return-object v0
.end method

.method public final component2()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final component3()Lcom/google/android/gms/maps/model/CameraPosition;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->cameraPosition:Lcom/google/android/gms/maps/model/CameraPosition;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LZO4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->drawnShapes:Ljava/util/List;

    return-object v0
.end method

.method public final copy(LU74;Landroid/graphics/Bitmap;Lcom/google/android/gms/maps/model/CameraPosition;Ljava/util/List;)Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LU74;",
            "Landroid/graphics/Bitmap;",
            "Lcom/google/android/gms/maps/model/CameraPosition;",
            "Ljava/util/List<",
            "+",
            "LZO4;",
            ">;)",
            "Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;"
        }
    .end annotation

    const-string v0, "projection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraPosition"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "drawnShapes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;-><init>(LU74;Landroid/graphics/Bitmap;Lcom/google/android/gms/maps/model/CameraPosition;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->projection:LU74;

    iget-object v3, p1, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->projection:LU74;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->bitmap:Landroid/graphics/Bitmap;

    iget-object v3, p1, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->bitmap:Landroid/graphics/Bitmap;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->cameraPosition:Lcom/google/android/gms/maps/model/CameraPosition;

    iget-object v3, p1, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->cameraPosition:Lcom/google/android/gms/maps/model/CameraPosition;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->drawnShapes:Ljava/util/List;

    iget-object p1, p1, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->drawnShapes:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->cameraPosition:Lcom/google/android/gms/maps/model/CameraPosition;

    return-object v0
.end method

.method public final getDrawnShapes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LZO4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->drawnShapes:Ljava/util/List;

    return-object v0
.end method

.method public final getProjection()LU74;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->projection:LU74;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->projection:LU74;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->cameraPosition:Lcom/google/android/gms/maps/model/CameraPosition;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/CameraPosition;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->drawnShapes:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->projection:LU74;

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->bitmap:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->cameraPosition:Lcom/google/android/gms/maps/model/CameraPosition;

    iget-object v3, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;->drawnShapes:Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "BitmapDrawData(projection="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bitmap="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cameraPosition="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", drawnShapes="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
