.class public final enum LgM6;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LgM6;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LgM6;

.field public static final enum d:LgM6;

.field public static final enum e:LgM6;

.field public static final synthetic f:[LgM6;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, LgM6;

    const-string v1, "ac"

    const-string v2, "AC"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LgM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LgM6;->c:LgM6;

    new-instance v1, LgM6;

    const-string v2, "gy"

    const-string v4, "GY"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LgM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LgM6;->d:LgM6;

    new-instance v2, LgM6;

    const-string v4, "mg"

    const-string v6, "MG"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LgM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, LgM6;->e:LgM6;

    const/4 v4, 0x3

    new-array v4, v4, [LgM6;

    aput-object v0, v4, v3

    aput-object v1, v4, v5

    aput-object v2, v4, v7

    sput-object v4, LgM6;->f:[LgM6;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LgM6;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LgM6;
    .locals 1

    const-class v0, LgM6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LgM6;

    return-object p0
.end method

.method public static values()[LgM6;
    .locals 1

    sget-object v0, LgM6;->f:[LgM6;

    invoke-virtual {v0}, [LgM6;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LgM6;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, LgM6;->b:Ljava/lang/String;

    return-object v0
.end method
