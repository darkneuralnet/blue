.class public final enum Lcom/google/android/filament/Texture$Sampler;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/Texture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Sampler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/filament/Texture$Sampler;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/android/filament/Texture$Sampler;

.field public static final enum SAMPLER_2D:Lcom/google/android/filament/Texture$Sampler;

.field public static final enum SAMPLER_2D_ARRAY:Lcom/google/android/filament/Texture$Sampler;

.field public static final enum SAMPLER_3D:Lcom/google/android/filament/Texture$Sampler;

.field public static final enum SAMPLER_CUBEMAP:Lcom/google/android/filament/Texture$Sampler;

.field public static final enum SAMPLER_EXTERNAL:Lcom/google/android/filament/Texture$Sampler;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/google/android/filament/Texture$Sampler;

    const-string v1, "SAMPLER_2D"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/filament/Texture$Sampler;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/filament/Texture$Sampler;->SAMPLER_2D:Lcom/google/android/filament/Texture$Sampler;

    new-instance v1, Lcom/google/android/filament/Texture$Sampler;

    const-string v3, "SAMPLER_2D_ARRAY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/android/filament/Texture$Sampler;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/android/filament/Texture$Sampler;->SAMPLER_2D_ARRAY:Lcom/google/android/filament/Texture$Sampler;

    new-instance v3, Lcom/google/android/filament/Texture$Sampler;

    const-string v5, "SAMPLER_CUBEMAP"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/google/android/filament/Texture$Sampler;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/google/android/filament/Texture$Sampler;->SAMPLER_CUBEMAP:Lcom/google/android/filament/Texture$Sampler;

    new-instance v5, Lcom/google/android/filament/Texture$Sampler;

    const-string v7, "SAMPLER_EXTERNAL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/google/android/filament/Texture$Sampler;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/google/android/filament/Texture$Sampler;->SAMPLER_EXTERNAL:Lcom/google/android/filament/Texture$Sampler;

    new-instance v7, Lcom/google/android/filament/Texture$Sampler;

    const-string v9, "SAMPLER_3D"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/google/android/filament/Texture$Sampler;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/google/android/filament/Texture$Sampler;->SAMPLER_3D:Lcom/google/android/filament/Texture$Sampler;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/google/android/filament/Texture$Sampler;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lcom/google/android/filament/Texture$Sampler;->$VALUES:[Lcom/google/android/filament/Texture$Sampler;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/android/filament/Texture$Sampler;
    .locals 1

    const-class v0, Lcom/google/android/filament/Texture$Sampler;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/android/filament/Texture$Sampler;

    return-object p0
.end method

.method public static values()[Lcom/google/android/filament/Texture$Sampler;
    .locals 1

    sget-object v0, Lcom/google/android/filament/Texture$Sampler;->$VALUES:[Lcom/google/android/filament/Texture$Sampler;

    invoke-virtual {v0}, [Lcom/google/android/filament/Texture$Sampler;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/filament/Texture$Sampler;

    return-object v0
.end method
