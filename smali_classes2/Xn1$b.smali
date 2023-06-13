.class public final enum LXn1$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXn1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LXn1$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "LXn1$b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "core-interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LXn1$b;

.field public static final enum c:LXn1$b;

.field public static final enum d:LXn1$b;

.field public static final enum e:LXn1$b;

.field public static final enum f:LXn1$b;

.field public static final enum g:LXn1$b;

.field public static final enum h:LXn1$b;

.field public static final enum i:LXn1$b;

.field public static final enum j:LXn1$b;

.field public static final synthetic k:[LXn1$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LXn1$b;

    const-string v1, "CHALLENGE_INITIATED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LXn1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LXn1$b;->b:LXn1$b;

    new-instance v0, LXn1$b;

    const-string v1, "VERIFYING_PASSCODE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LXn1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LXn1$b;->c:LXn1$b;

    new-instance v0, LXn1$b;

    const-string v1, "PASSCODE_VERIFIED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LXn1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LXn1$b;->d:LXn1$b;

    new-instance v0, LXn1$b;

    const-string v1, "UPDATE_CONNECTED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LXn1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LXn1$b;->e:LXn1$b;

    new-instance v0, LXn1$b;

    const-string v1, "SYNC"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LXn1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LXn1$b;->f:LXn1$b;

    new-instance v0, LXn1$b;

    const-string v1, "FIRMWARE_UPDATING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LXn1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LXn1$b;->g:LXn1$b;

    new-instance v0, LXn1$b;

    const-string v1, "UPDATE_FAILED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LXn1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LXn1$b;->h:LXn1$b;

    new-instance v0, LXn1$b;

    const-string v1, "UPDATE_SUCCESS"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, LXn1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LXn1$b;->i:LXn1$b;

    new-instance v0, LXn1$b;

    const-string v1, "NONE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, LXn1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LXn1$b;->j:LXn1$b;

    invoke-static {}, LXn1$b;->a()[LXn1$b;

    move-result-object v0

    sput-object v0, LXn1$b;->k:[LXn1$b;

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

.method public static final synthetic a()[LXn1$b;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [LXn1$b;

    const/4 v1, 0x0

    sget-object v2, LXn1$b;->b:LXn1$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LXn1$b;->c:LXn1$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LXn1$b;->d:LXn1$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LXn1$b;->e:LXn1$b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LXn1$b;->f:LXn1$b;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LXn1$b;->g:LXn1$b;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LXn1$b;->h:LXn1$b;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, LXn1$b;->i:LXn1$b;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, LXn1$b;->j:LXn1$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LXn1$b;
    .locals 1

    const-class v0, LXn1$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LXn1$b;

    return-object p0
.end method

.method public static values()[LXn1$b;
    .locals 1

    sget-object v0, LXn1$b;->k:[LXn1$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LXn1$b;

    return-object v0
.end method
