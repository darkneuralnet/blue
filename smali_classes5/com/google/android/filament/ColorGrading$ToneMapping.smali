.class public final enum Lcom/google/android/filament/ColorGrading$ToneMapping;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/ColorGrading;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ToneMapping"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/filament/ColorGrading$ToneMapping;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/android/filament/ColorGrading$ToneMapping;

.field public static final enum ACES:Lcom/google/android/filament/ColorGrading$ToneMapping;

.field public static final enum ACES_LEGACY:Lcom/google/android/filament/ColorGrading$ToneMapping;

.field public static final enum DISPLAY_RANGE:Lcom/google/android/filament/ColorGrading$ToneMapping;

.field public static final enum FILMIC:Lcom/google/android/filament/ColorGrading$ToneMapping;

.field public static final enum LINEAR:Lcom/google/android/filament/ColorGrading$ToneMapping;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/google/android/filament/ColorGrading$ToneMapping;

    const-string v1, "LINEAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/filament/ColorGrading$ToneMapping;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/filament/ColorGrading$ToneMapping;->LINEAR:Lcom/google/android/filament/ColorGrading$ToneMapping;

    new-instance v1, Lcom/google/android/filament/ColorGrading$ToneMapping;

    const-string v3, "ACES_LEGACY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/android/filament/ColorGrading$ToneMapping;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/android/filament/ColorGrading$ToneMapping;->ACES_LEGACY:Lcom/google/android/filament/ColorGrading$ToneMapping;

    new-instance v3, Lcom/google/android/filament/ColorGrading$ToneMapping;

    const-string v5, "ACES"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/google/android/filament/ColorGrading$ToneMapping;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/google/android/filament/ColorGrading$ToneMapping;->ACES:Lcom/google/android/filament/ColorGrading$ToneMapping;

    new-instance v5, Lcom/google/android/filament/ColorGrading$ToneMapping;

    const-string v7, "FILMIC"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/google/android/filament/ColorGrading$ToneMapping;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/google/android/filament/ColorGrading$ToneMapping;->FILMIC:Lcom/google/android/filament/ColorGrading$ToneMapping;

    new-instance v7, Lcom/google/android/filament/ColorGrading$ToneMapping;

    const-string v9, "DISPLAY_RANGE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/google/android/filament/ColorGrading$ToneMapping;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/google/android/filament/ColorGrading$ToneMapping;->DISPLAY_RANGE:Lcom/google/android/filament/ColorGrading$ToneMapping;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/google/android/filament/ColorGrading$ToneMapping;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lcom/google/android/filament/ColorGrading$ToneMapping;->$VALUES:[Lcom/google/android/filament/ColorGrading$ToneMapping;

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

.method public static valueOf(Ljava/lang/String;)Lcom/google/android/filament/ColorGrading$ToneMapping;
    .locals 1

    const-class v0, Lcom/google/android/filament/ColorGrading$ToneMapping;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/android/filament/ColorGrading$ToneMapping;

    return-object p0
.end method

.method public static values()[Lcom/google/android/filament/ColorGrading$ToneMapping;
    .locals 1

    sget-object v0, Lcom/google/android/filament/ColorGrading$ToneMapping;->$VALUES:[Lcom/google/android/filament/ColorGrading$ToneMapping;

    invoke-virtual {v0}, [Lcom/google/android/filament/ColorGrading$ToneMapping;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/filament/ColorGrading$ToneMapping;

    return-object v0
.end method
