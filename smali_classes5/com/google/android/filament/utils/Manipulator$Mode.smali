.class public final enum Lcom/google/android/filament/utils/Manipulator$Mode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/utils/Manipulator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Mode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/filament/utils/Manipulator$Mode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/android/filament/utils/Manipulator$Mode;

.field public static final enum FREE_FLIGHT:Lcom/google/android/filament/utils/Manipulator$Mode;

.field public static final enum MAP:Lcom/google/android/filament/utils/Manipulator$Mode;

.field public static final enum ORBIT:Lcom/google/android/filament/utils/Manipulator$Mode;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/google/android/filament/utils/Manipulator$Mode;

    const-string v1, "ORBIT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/filament/utils/Manipulator$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/filament/utils/Manipulator$Mode;->ORBIT:Lcom/google/android/filament/utils/Manipulator$Mode;

    new-instance v1, Lcom/google/android/filament/utils/Manipulator$Mode;

    const-string v3, "MAP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/android/filament/utils/Manipulator$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/android/filament/utils/Manipulator$Mode;->MAP:Lcom/google/android/filament/utils/Manipulator$Mode;

    new-instance v3, Lcom/google/android/filament/utils/Manipulator$Mode;

    const-string v5, "FREE_FLIGHT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/google/android/filament/utils/Manipulator$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/google/android/filament/utils/Manipulator$Mode;->FREE_FLIGHT:Lcom/google/android/filament/utils/Manipulator$Mode;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/google/android/filament/utils/Manipulator$Mode;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/google/android/filament/utils/Manipulator$Mode;->$VALUES:[Lcom/google/android/filament/utils/Manipulator$Mode;

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

.method public static valueOf(Ljava/lang/String;)Lcom/google/android/filament/utils/Manipulator$Mode;
    .locals 1

    const-class v0, Lcom/google/android/filament/utils/Manipulator$Mode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/android/filament/utils/Manipulator$Mode;

    return-object p0
.end method

.method public static values()[Lcom/google/android/filament/utils/Manipulator$Mode;
    .locals 1

    sget-object v0, Lcom/google/android/filament/utils/Manipulator$Mode;->$VALUES:[Lcom/google/android/filament/utils/Manipulator$Mode;

    invoke-virtual {v0}, [Lcom/google/android/filament/utils/Manipulator$Mode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/filament/utils/Manipulator$Mode;

    return-object v0
.end method
