.class public final enum Lcom/google/android/filament/View$TargetBufferFlags;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TargetBufferFlags"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/filament/View$TargetBufferFlags;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/android/filament/View$TargetBufferFlags;

.field public static ALL:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/google/android/filament/View$TargetBufferFlags;",
            ">;"
        }
    .end annotation
.end field

.field public static ALL_COLOR:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/google/android/filament/View$TargetBufferFlags;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum COLOR0:Lcom/google/android/filament/View$TargetBufferFlags;

.field public static final enum COLOR1:Lcom/google/android/filament/View$TargetBufferFlags;

.field public static final enum COLOR2:Lcom/google/android/filament/View$TargetBufferFlags;

.field public static final enum COLOR3:Lcom/google/android/filament/View$TargetBufferFlags;

.field public static final enum DEPTH:Lcom/google/android/filament/View$TargetBufferFlags;

.field public static DEPTH_STENCIL:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/google/android/filament/View$TargetBufferFlags;",
            ">;"
        }
    .end annotation
.end field

.field public static NONE:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/google/android/filament/View$TargetBufferFlags;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum STENCIL:Lcom/google/android/filament/View$TargetBufferFlags;


# instance fields
.field private mFlags:I


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/google/android/filament/View$TargetBufferFlags;

    const-string v1, "COLOR0"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/filament/View$TargetBufferFlags;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/filament/View$TargetBufferFlags;->COLOR0:Lcom/google/android/filament/View$TargetBufferFlags;

    new-instance v1, Lcom/google/android/filament/View$TargetBufferFlags;

    const-string v4, "COLOR1"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lcom/google/android/filament/View$TargetBufferFlags;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/filament/View$TargetBufferFlags;->COLOR1:Lcom/google/android/filament/View$TargetBufferFlags;

    new-instance v4, Lcom/google/android/filament/View$TargetBufferFlags;

    const-string v6, "COLOR2"

    const/4 v7, 0x4

    invoke-direct {v4, v6, v5, v7}, Lcom/google/android/filament/View$TargetBufferFlags;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/filament/View$TargetBufferFlags;->COLOR2:Lcom/google/android/filament/View$TargetBufferFlags;

    new-instance v6, Lcom/google/android/filament/View$TargetBufferFlags;

    const/16 v8, 0x8

    const-string v9, "COLOR3"

    const/4 v10, 0x3

    invoke-direct {v6, v9, v10, v8}, Lcom/google/android/filament/View$TargetBufferFlags;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/filament/View$TargetBufferFlags;->COLOR3:Lcom/google/android/filament/View$TargetBufferFlags;

    new-instance v8, Lcom/google/android/filament/View$TargetBufferFlags;

    const-string v9, "DEPTH"

    const/16 v11, 0x10

    invoke-direct {v8, v9, v7, v11}, Lcom/google/android/filament/View$TargetBufferFlags;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/filament/View$TargetBufferFlags;->DEPTH:Lcom/google/android/filament/View$TargetBufferFlags;

    new-instance v9, Lcom/google/android/filament/View$TargetBufferFlags;

    const/16 v11, 0x20

    const-string v12, "STENCIL"

    const/4 v13, 0x5

    invoke-direct {v9, v12, v13, v11}, Lcom/google/android/filament/View$TargetBufferFlags;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/filament/View$TargetBufferFlags;->STENCIL:Lcom/google/android/filament/View$TargetBufferFlags;

    const/4 v11, 0x6

    new-array v11, v11, [Lcom/google/android/filament/View$TargetBufferFlags;

    aput-object v0, v11, v2

    aput-object v1, v11, v3

    aput-object v4, v11, v5

    aput-object v6, v11, v10

    aput-object v8, v11, v7

    aput-object v9, v11, v13

    sput-object v11, Lcom/google/android/filament/View$TargetBufferFlags;->$VALUES:[Lcom/google/android/filament/View$TargetBufferFlags;

    const-class v2, Lcom/google/android/filament/View$TargetBufferFlags;

    invoke-static {v2}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v2

    sput-object v2, Lcom/google/android/filament/View$TargetBufferFlags;->NONE:Ljava/util/EnumSet;

    invoke-static {v0, v1, v4, v6}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    sput-object v1, Lcom/google/android/filament/View$TargetBufferFlags;->ALL_COLOR:Ljava/util/EnumSet;

    invoke-static {v8, v9}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    sput-object v1, Lcom/google/android/filament/View$TargetBufferFlags;->DEPTH_STENCIL:Ljava/util/EnumSet;

    invoke-static {v0, v9}, Ljava/util/EnumSet;->range(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/google/android/filament/View$TargetBufferFlags;->ALL:Ljava/util/EnumSet;

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

    iput p3, p0, Lcom/google/android/filament/View$TargetBufferFlags;->mFlags:I

    return-void
.end method

.method public static flags(Ljava/util/EnumSet;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet<",
            "Lcom/google/android/filament/View$TargetBufferFlags;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/filament/View$TargetBufferFlags;

    iget v1, v1, Lcom/google/android/filament/View$TargetBufferFlags;->mFlags:I

    or-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/android/filament/View$TargetBufferFlags;
    .locals 1

    const-class v0, Lcom/google/android/filament/View$TargetBufferFlags;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/android/filament/View$TargetBufferFlags;

    return-object p0
.end method

.method public static values()[Lcom/google/android/filament/View$TargetBufferFlags;
    .locals 1

    sget-object v0, Lcom/google/android/filament/View$TargetBufferFlags;->$VALUES:[Lcom/google/android/filament/View$TargetBufferFlags;

    invoke-virtual {v0}, [Lcom/google/android/filament/View$TargetBufferFlags;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/filament/View$TargetBufferFlags;

    return-object v0
.end method
