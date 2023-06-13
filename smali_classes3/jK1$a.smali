.class public final enum LjK1$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LjK1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LjK1$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "LjK1$a;",
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
        "co.bird.android.feature.item-lease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:LjK1$a;

.field public static final enum c:LjK1$a;

.field public static final enum d:LjK1$a;

.field public static final enum e:LjK1$a;

.field public static final enum f:LjK1$a;

.field public static final enum g:LjK1$a;

.field public static final enum h:LjK1$a;

.field public static final enum i:LjK1$a;

.field public static final enum j:LjK1$a;

.field public static final synthetic k:[LjK1$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LjK1$a;

    const-string v1, "VERIFYING_CONNECTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LjK1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LjK1$a;->b:LjK1$a;

    new-instance v0, LjK1$a;

    const-string v1, "VERIFY_FAILED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LjK1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LjK1$a;->c:LjK1$a;

    new-instance v0, LjK1$a;

    const-string v1, "HELMET_STATE_INCORRECT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LjK1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LjK1$a;->d:LjK1$a;

    new-instance v0, LjK1$a;

    const-string v1, "LEASE_ACTION"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LjK1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LjK1$a;->e:LjK1$a;

    new-instance v0, LjK1$a;

    const-string v1, "LEASE_ACTION_ERROR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LjK1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LjK1$a;->f:LjK1$a;

    new-instance v0, LjK1$a;

    const-string v1, "OPENING_LOCK"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LjK1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LjK1$a;->g:LjK1$a;

    new-instance v0, LjK1$a;

    const-string v1, "LOCK_OPENED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LjK1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LjK1$a;->h:LjK1$a;

    new-instance v0, LjK1$a;

    const-string v1, "LEASE_ENDED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, LjK1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LjK1$a;->i:LjK1$a;

    new-instance v0, LjK1$a;

    const-string v1, "UNKNOWN_ERROR"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, LjK1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LjK1$a;->j:LjK1$a;

    invoke-static {}, LjK1$a;->a()[LjK1$a;

    move-result-object v0

    sput-object v0, LjK1$a;->k:[LjK1$a;

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

.method public static final synthetic a()[LjK1$a;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [LjK1$a;

    const/4 v1, 0x0

    sget-object v2, LjK1$a;->b:LjK1$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LjK1$a;->c:LjK1$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LjK1$a;->d:LjK1$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LjK1$a;->e:LjK1$a;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LjK1$a;->f:LjK1$a;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LjK1$a;->g:LjK1$a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LjK1$a;->h:LjK1$a;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, LjK1$a;->i:LjK1$a;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, LjK1$a;->j:LjK1$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LjK1$a;
    .locals 1

    const-class v0, LjK1$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LjK1$a;

    return-object p0
.end method

.method public static values()[LjK1$a;
    .locals 1

    sget-object v0, LjK1$a;->k:[LjK1$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LjK1$a;

    return-object v0
.end method
