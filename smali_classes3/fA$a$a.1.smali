.class public final enum LfA$a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LfA$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LfA$a$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "LfA$a$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "bulk-scanner_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LfA$a$a;

.field public static final enum c:LfA$a$a;

.field public static final enum d:LfA$a$a;

.field public static final enum e:LfA$a$a;

.field public static final synthetic f:[LfA$a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LfA$a$a;

    const-string v1, "QR_SCANNED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LfA$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LfA$a$a;->b:LfA$a$a;

    new-instance v0, LfA$a$a;

    const-string v1, "CODE_ENTERED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LfA$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LfA$a$a;->c:LfA$a$a;

    new-instance v0, LfA$a$a;

    const-string v1, "PERIPHERAL_SCANNER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LfA$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LfA$a$a;->d:LfA$a$a;

    new-instance v0, LfA$a$a;

    const-string v1, "BLUETOOTH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LfA$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LfA$a$a;->e:LfA$a$a;

    invoke-static {}, LfA$a$a;->a()[LfA$a$a;

    move-result-object v0

    sput-object v0, LfA$a$a;->f:[LfA$a$a;

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

.method public static final synthetic a()[LfA$a$a;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LfA$a$a;

    const/4 v1, 0x0

    sget-object v2, LfA$a$a;->b:LfA$a$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LfA$a$a;->c:LfA$a$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LfA$a$a;->d:LfA$a$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LfA$a$a;->e:LfA$a$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LfA$a$a;
    .locals 1

    const-class v0, LfA$a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LfA$a$a;

    return-object p0
.end method

.method public static values()[LfA$a$a;
    .locals 1

    sget-object v0, LfA$a$a;->f:[LfA$a$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LfA$a$a;

    return-object v0
.end method
