.class public final enum Lcom/google/android/filament/Colors$Conversion;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/Colors;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Conversion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/filament/Colors$Conversion;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/android/filament/Colors$Conversion;

.field public static final enum ACCURATE:Lcom/google/android/filament/Colors$Conversion;

.field public static final enum FAST:Lcom/google/android/filament/Colors$Conversion;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/filament/Colors$Conversion;

    const-string v1, "ACCURATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/filament/Colors$Conversion;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/filament/Colors$Conversion;->ACCURATE:Lcom/google/android/filament/Colors$Conversion;

    new-instance v1, Lcom/google/android/filament/Colors$Conversion;

    const-string v3, "FAST"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/android/filament/Colors$Conversion;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/android/filament/Colors$Conversion;->FAST:Lcom/google/android/filament/Colors$Conversion;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/android/filament/Colors$Conversion;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/google/android/filament/Colors$Conversion;->$VALUES:[Lcom/google/android/filament/Colors$Conversion;

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

.method public static valueOf(Ljava/lang/String;)Lcom/google/android/filament/Colors$Conversion;
    .locals 1

    const-class v0, Lcom/google/android/filament/Colors$Conversion;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/android/filament/Colors$Conversion;

    return-object p0
.end method

.method public static values()[Lcom/google/android/filament/Colors$Conversion;
    .locals 1

    sget-object v0, Lcom/google/android/filament/Colors$Conversion;->$VALUES:[Lcom/google/android/filament/Colors$Conversion;

    invoke-virtual {v0}, [Lcom/google/android/filament/Colors$Conversion;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/filament/Colors$Conversion;

    return-object v0
.end method
