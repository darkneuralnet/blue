.class public final enum Lcom/google/android/filament/RenderableManager$PrimitiveType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/RenderableManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PrimitiveType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/filament/RenderableManager$PrimitiveType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/android/filament/RenderableManager$PrimitiveType;

.field public static final enum LINES:Lcom/google/android/filament/RenderableManager$PrimitiveType;

.field public static final enum LINE_STRIP:Lcom/google/android/filament/RenderableManager$PrimitiveType;

.field public static final enum POINTS:Lcom/google/android/filament/RenderableManager$PrimitiveType;

.field public static final enum TRIANGLES:Lcom/google/android/filament/RenderableManager$PrimitiveType;

.field public static final enum TRIANGLE_STRIP:Lcom/google/android/filament/RenderableManager$PrimitiveType;


# instance fields
.field private final mType:I


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/google/android/filament/RenderableManager$PrimitiveType;

    const-string v1, "POINTS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/filament/RenderableManager$PrimitiveType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/filament/RenderableManager$PrimitiveType;->POINTS:Lcom/google/android/filament/RenderableManager$PrimitiveType;

    new-instance v1, Lcom/google/android/filament/RenderableManager$PrimitiveType;

    const-string v3, "LINES"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/filament/RenderableManager$PrimitiveType;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/filament/RenderableManager$PrimitiveType;->LINES:Lcom/google/android/filament/RenderableManager$PrimitiveType;

    new-instance v3, Lcom/google/android/filament/RenderableManager$PrimitiveType;

    const-string v5, "LINE_STRIP"

    const/4 v6, 0x2

    const/4 v7, 0x3

    invoke-direct {v3, v5, v6, v7}, Lcom/google/android/filament/RenderableManager$PrimitiveType;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/filament/RenderableManager$PrimitiveType;->LINE_STRIP:Lcom/google/android/filament/RenderableManager$PrimitiveType;

    new-instance v5, Lcom/google/android/filament/RenderableManager$PrimitiveType;

    const-string v8, "TRIANGLES"

    const/4 v9, 0x4

    invoke-direct {v5, v8, v7, v9}, Lcom/google/android/filament/RenderableManager$PrimitiveType;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/filament/RenderableManager$PrimitiveType;->TRIANGLES:Lcom/google/android/filament/RenderableManager$PrimitiveType;

    new-instance v8, Lcom/google/android/filament/RenderableManager$PrimitiveType;

    const-string v10, "TRIANGLE_STRIP"

    const/4 v11, 0x5

    invoke-direct {v8, v10, v9, v11}, Lcom/google/android/filament/RenderableManager$PrimitiveType;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/filament/RenderableManager$PrimitiveType;->TRIANGLE_STRIP:Lcom/google/android/filament/RenderableManager$PrimitiveType;

    new-array v10, v11, [Lcom/google/android/filament/RenderableManager$PrimitiveType;

    aput-object v0, v10, v2

    aput-object v1, v10, v4

    aput-object v3, v10, v6

    aput-object v5, v10, v7

    aput-object v8, v10, v9

    sput-object v10, Lcom/google/android/filament/RenderableManager$PrimitiveType;->$VALUES:[Lcom/google/android/filament/RenderableManager$PrimitiveType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/filament/RenderableManager$PrimitiveType;->mType:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/android/filament/RenderableManager$PrimitiveType;
    .locals 1

    const-class v0, Lcom/google/android/filament/RenderableManager$PrimitiveType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/android/filament/RenderableManager$PrimitiveType;

    return-object p0
.end method

.method public static values()[Lcom/google/android/filament/RenderableManager$PrimitiveType;
    .locals 1

    sget-object v0, Lcom/google/android/filament/RenderableManager$PrimitiveType;->$VALUES:[Lcom/google/android/filament/RenderableManager$PrimitiveType;

    invoke-virtual {v0}, [Lcom/google/android/filament/RenderableManager$PrimitiveType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/filament/RenderableManager$PrimitiveType;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, Lcom/google/android/filament/RenderableManager$PrimitiveType;->mType:I

    return v0
.end method
