.class public final enum LZL6;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LZL6;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LZL6;

.field public static final enum d:LZL6;

.field public static final enum e:LZL6;

.field public static final synthetic f:[LZL6;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, LZL6;

    const-string v1, "HTTP_CONNECT_TIMEOUT"

    const/4 v2, 0x0

    const v3, 0xea60

    invoke-direct {v0, v1, v2, v3}, LZL6;-><init>(Ljava/lang/String;II)V

    sput-object v0, LZL6;->c:LZL6;

    new-instance v1, LZL6;

    const-string v4, "HTTP_READ_TIMEOUT"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v3}, LZL6;-><init>(Ljava/lang/String;II)V

    sput-object v1, LZL6;->d:LZL6;

    new-instance v3, LZL6;

    const/16 v4, 0x400

    const-string v6, "READ_BYTE"

    const/4 v7, 0x2

    invoke-direct {v3, v6, v7, v4}, LZL6;-><init>(Ljava/lang/String;II)V

    sput-object v3, LZL6;->e:LZL6;

    const/4 v4, 0x3

    new-array v4, v4, [LZL6;

    aput-object v0, v4, v2

    aput-object v1, v4, v5

    aput-object v3, v4, v7

    sput-object v4, LZL6;->f:[LZL6;

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

    iput p3, p0, LZL6;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LZL6;
    .locals 1

    const-class v0, LZL6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LZL6;

    return-object p0
.end method

.method public static values()[LZL6;
    .locals 1

    sget-object v0, LZL6;->f:[LZL6;

    invoke-virtual {v0}, [LZL6;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LZL6;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LZL6;->b:I

    return v0
.end method
