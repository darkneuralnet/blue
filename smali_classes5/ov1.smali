.class public final enum Lov1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lov1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lov1;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:Lov1;

.field public static final enum c:Lov1;

.field public static final enum d:Lov1;

.field public static final enum e:Lov1;

.field public static final enum f:Lov1;

.field public static final enum g:Lov1;

.field public static final synthetic h:[Lov1;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x6

    new-array v0, v0, [Lov1;

    new-instance v1, Lov1;

    const-string v2, "EXPLICIT"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lov1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lov1;->b:Lov1;

    aput-object v1, v0, v3

    new-instance v1, Lov1;

    const-string v2, "TIMER"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lov1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lov1;->c:Lov1;

    aput-object v1, v0, v3

    new-instance v1, Lov1;

    const-string v2, "SESSION_CHANGE"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lov1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lov1;->d:Lov1;

    aput-object v1, v0, v3

    new-instance v1, Lov1;

    const-string v2, "PERSISTED_EVENTS"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lov1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lov1;->e:Lov1;

    aput-object v1, v0, v3

    new-instance v1, Lov1;

    const-string v2, "EVENT_THRESHOLD"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lov1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lov1;->f:Lov1;

    aput-object v1, v0, v3

    new-instance v1, Lov1;

    const-string v2, "EAGER_FLUSHING_EVENT"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Lov1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lov1;->g:Lov1;

    aput-object v1, v0, v3

    sput-object v0, Lov1;->h:[Lov1;

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

.method public static valueOf(Ljava/lang/String;)Lov1;
    .locals 1

    const-class v0, Lov1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lov1;

    return-object p0
.end method

.method public static values()[Lov1;
    .locals 1

    sget-object v0, Lov1;->h:[Lov1;

    invoke-virtual {v0}, [Lov1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lov1;

    return-object v0
.end method
