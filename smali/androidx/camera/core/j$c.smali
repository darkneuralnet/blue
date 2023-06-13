.class public final enum Landroidx/camera/core/j$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/core/j$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Landroidx/camera/core/j$c;

.field public static final enum c:Landroidx/camera/core/j$c;

.field public static final enum d:Landroidx/camera/core/j$c;

.field public static final enum e:Landroidx/camera/core/j$c;

.field public static final synthetic f:[Landroidx/camera/core/j$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/core/j$c;

    const-string v1, "FILE_IO_FAILED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/j$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/j$c;->b:Landroidx/camera/core/j$c;

    new-instance v0, Landroidx/camera/core/j$c;

    const-string v1, "ENCODE_FAILED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/j$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/j$c;->c:Landroidx/camera/core/j$c;

    new-instance v0, Landroidx/camera/core/j$c;

    const-string v1, "CROP_FAILED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/j$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/j$c;->d:Landroidx/camera/core/j$c;

    new-instance v0, Landroidx/camera/core/j$c;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/j$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/j$c;->e:Landroidx/camera/core/j$c;

    invoke-static {}, Landroidx/camera/core/j$c;->a()[Landroidx/camera/core/j$c;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/j$c;->f:[Landroidx/camera/core/j$c;

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

.method public static synthetic a()[Landroidx/camera/core/j$c;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Landroidx/camera/core/j$c;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/core/j$c;->b:Landroidx/camera/core/j$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/camera/core/j$c;->c:Landroidx/camera/core/j$c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/camera/core/j$c;->d:Landroidx/camera/core/j$c;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/camera/core/j$c;->e:Landroidx/camera/core/j$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/core/j$c;
    .locals 1

    const-class v0, Landroidx/camera/core/j$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/j$c;

    return-object p0
.end method

.method public static values()[Landroidx/camera/core/j$c;
    .locals 1

    sget-object v0, Landroidx/camera/core/j$c;->f:[Landroidx/camera/core/j$c;

    invoke-virtual {v0}, [Landroidx/camera/core/j$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/j$c;

    return-object v0
.end method
