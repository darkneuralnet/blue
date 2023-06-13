.class public final enum LjJ4;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LjJ4;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LjJ4;

.field public static final enum c:LjJ4;

.field public static final synthetic d:[LjJ4;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LjJ4;

    const-string v1, "browser"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LjJ4;-><init>(Ljava/lang/String;I)V

    sput-object v0, LjJ4;->b:LjJ4;

    new-instance v1, LjJ4;

    const-string v3, "wallet"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LjJ4;-><init>(Ljava/lang/String;I)V

    sput-object v1, LjJ4;->c:LjJ4;

    const/4 v3, 0x2

    new-array v3, v3, [LjJ4;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, LjJ4;->d:[LjJ4;

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

.method public static valueOf(Ljava/lang/String;)LjJ4;
    .locals 1

    const-class v0, LjJ4;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LjJ4;

    return-object p0
.end method

.method public static values()[LjJ4;
    .locals 1

    sget-object v0, LjJ4;->d:[LjJ4;

    invoke-virtual {v0}, [LjJ4;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LjJ4;

    return-object v0
.end method
