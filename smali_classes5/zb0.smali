.class public final enum Lzb0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lp31;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzb0;",
        ">;",
        "Lp31;"
    }
.end annotation


# static fields
.field public static final enum c:Lzb0;

.field public static final synthetic d:[Lzb0;


# instance fields
.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lzb0;

    const v1, 0x133c6b1

    const-string v2, "SHARE_CAMERA_EFFECT"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lzb0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lzb0;->c:Lzb0;

    const/4 v1, 0x1

    new-array v1, v1, [Lzb0;

    aput-object v0, v1, v3

    sput-object v1, Lzb0;->d:[Lzb0;

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

    iput p3, p0, Lzb0;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lzb0;
    .locals 1

    const-class v0, Lzb0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzb0;

    return-object p0
.end method

.method public static values()[Lzb0;
    .locals 1

    sget-object v0, Lzb0;->d:[Lzb0;

    invoke-virtual {v0}, [Lzb0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzb0;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lzb0;->b:I

    return v0
.end method

.method public getAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.facebook.platform.action.request.CAMERA_EFFECT"

    return-object v0
.end method
