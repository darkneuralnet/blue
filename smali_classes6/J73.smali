.class public final enum LJ73;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LJ73;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LJ73;

.field public static final enum d:LJ73;

.field public static final enum e:LJ73;

.field public static final synthetic f:[LJ73;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, LJ73;

    const-string v1, "NO_CACHE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, LJ73;-><init>(Ljava/lang/String;II)V

    sput-object v0, LJ73;->c:LJ73;

    new-instance v1, LJ73;

    const-string v4, "NO_STORE"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, LJ73;-><init>(Ljava/lang/String;II)V

    sput-object v1, LJ73;->d:LJ73;

    new-instance v4, LJ73;

    const-string v6, "OFFLINE"

    const/4 v7, 0x4

    invoke-direct {v4, v6, v5, v7}, LJ73;-><init>(Ljava/lang/String;II)V

    sput-object v4, LJ73;->e:LJ73;

    const/4 v6, 0x3

    new-array v6, v6, [LJ73;

    aput-object v0, v6, v2

    aput-object v1, v6, v3

    aput-object v4, v6, v5

    sput-object v6, LJ73;->f:[LJ73;

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

    iput p3, p0, LJ73;->b:I

    return-void
.end method

.method public static a(I)Z
    .locals 1

    sget-object v0, LJ73;->e:LJ73;

    iget v0, v0, LJ73;->b:I

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static b(I)Z
    .locals 1

    sget-object v0, LJ73;->c:LJ73;

    iget v0, v0, LJ73;->b:I

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static c(I)Z
    .locals 1

    sget-object v0, LJ73;->d:LJ73;

    iget v0, v0, LJ73;->b:I

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static valueOf(Ljava/lang/String;)LJ73;
    .locals 1

    const-class v0, LJ73;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LJ73;

    return-object p0
.end method

.method public static values()[LJ73;
    .locals 1

    sget-object v0, LJ73;->f:[LJ73;

    invoke-virtual {v0}, [LJ73;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LJ73;

    return-object v0
.end method
