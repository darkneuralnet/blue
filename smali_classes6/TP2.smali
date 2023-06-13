.class public final enum LTP2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LTP2;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LTP2;

.field public static final enum d:LTP2;

.field public static final synthetic e:[LTP2;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, LTP2;

    const-string v1, "NO_CACHE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, LTP2;-><init>(Ljava/lang/String;II)V

    sput-object v0, LTP2;->c:LTP2;

    new-instance v1, LTP2;

    const-string v4, "NO_STORE"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, LTP2;-><init>(Ljava/lang/String;II)V

    sput-object v1, LTP2;->d:LTP2;

    new-array v4, v5, [LTP2;

    aput-object v0, v4, v2

    aput-object v1, v4, v3

    sput-object v4, LTP2;->e:[LTP2;

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

    iput p3, p0, LTP2;->b:I

    return-void
.end method

.method public static a(I)Z
    .locals 1

    sget-object v0, LTP2;->c:LTP2;

    iget v0, v0, LTP2;->b:I

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static b(I)Z
    .locals 1

    sget-object v0, LTP2;->d:LTP2;

    iget v0, v0, LTP2;->b:I

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static valueOf(Ljava/lang/String;)LTP2;
    .locals 1

    const-class v0, LTP2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LTP2;

    return-object p0
.end method

.method public static values()[LTP2;
    .locals 1

    sget-object v0, LTP2;->e:[LTP2;

    invoke-virtual {v0}, [LTP2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LTP2;

    return-object v0
.end method
