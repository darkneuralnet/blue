.class public final enum Lcom/google/android/filament/ColorGrading$LutFormat;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/ColorGrading;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "LutFormat"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/filament/ColorGrading$LutFormat;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/android/filament/ColorGrading$LutFormat;

.field public static final enum FLOAT:Lcom/google/android/filament/ColorGrading$LutFormat;

.field public static final enum INTEGER:Lcom/google/android/filament/ColorGrading$LutFormat;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/filament/ColorGrading$LutFormat;

    const-string v1, "INTEGER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/filament/ColorGrading$LutFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/filament/ColorGrading$LutFormat;->INTEGER:Lcom/google/android/filament/ColorGrading$LutFormat;

    new-instance v1, Lcom/google/android/filament/ColorGrading$LutFormat;

    const-string v3, "FLOAT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/android/filament/ColorGrading$LutFormat;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/android/filament/ColorGrading$LutFormat;->FLOAT:Lcom/google/android/filament/ColorGrading$LutFormat;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/android/filament/ColorGrading$LutFormat;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/google/android/filament/ColorGrading$LutFormat;->$VALUES:[Lcom/google/android/filament/ColorGrading$LutFormat;

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

.method public static valueOf(Ljava/lang/String;)Lcom/google/android/filament/ColorGrading$LutFormat;
    .locals 1

    const-class v0, Lcom/google/android/filament/ColorGrading$LutFormat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/android/filament/ColorGrading$LutFormat;

    return-object p0
.end method

.method public static values()[Lcom/google/android/filament/ColorGrading$LutFormat;
    .locals 1

    sget-object v0, Lcom/google/android/filament/ColorGrading$LutFormat;->$VALUES:[Lcom/google/android/filament/ColorGrading$LutFormat;

    invoke-virtual {v0}, [Lcom/google/android/filament/ColorGrading$LutFormat;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/filament/ColorGrading$LutFormat;

    return-object v0
.end method
