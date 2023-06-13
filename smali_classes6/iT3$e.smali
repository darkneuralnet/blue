.class public final enum LiT3$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LiT3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LiT3$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LiT3$e;

.field public static final enum d:LiT3$e;

.field public static final enum e:LiT3$e;

.field public static final synthetic f:[LiT3$e;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, LiT3$e;

    const v1, -0xff0100

    const-string v2, "MEMORY"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LiT3$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, LiT3$e;->c:LiT3$e;

    new-instance v1, LiT3$e;

    const v2, -0xffff01

    const-string v4, "DISK"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LiT3$e;-><init>(Ljava/lang/String;II)V

    sput-object v1, LiT3$e;->d:LiT3$e;

    new-instance v2, LiT3$e;

    const/high16 v4, -0x10000

    const-string v6, "NETWORK"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LiT3$e;-><init>(Ljava/lang/String;II)V

    sput-object v2, LiT3$e;->e:LiT3$e;

    const/4 v4, 0x3

    new-array v4, v4, [LiT3$e;

    aput-object v0, v4, v3

    aput-object v1, v4, v5

    aput-object v2, v4, v7

    sput-object v4, LiT3$e;->f:[LiT3$e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LiT3$e;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LiT3$e;
    .locals 1

    const-class v0, LiT3$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LiT3$e;

    return-object p0
.end method

.method public static values()[LiT3$e;
    .locals 1

    sget-object v0, LiT3$e;->f:[LiT3$e;

    invoke-virtual {v0}, [LiT3$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LiT3$e;

    return-object v0
.end method
