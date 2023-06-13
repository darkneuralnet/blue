.class public final enum Ljw4$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljw4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljw4$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Ljw4$c;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
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
.field public static final enum b:Ljw4$c;

.field public static final enum c:Ljw4$c;

.field public static final enum d:Ljw4$c;

.field public static final synthetic e:[Ljw4$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Ljw4$c;

    new-instance v1, Ljw4$c;

    const-string v2, "OPERATION_SUCCESS"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ljw4$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ljw4$c;->b:Ljw4$c;

    aput-object v1, v0, v3

    new-instance v1, Ljw4$c;

    const-string v2, "SERVICE_NOT_AVAILABLE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljw4$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ljw4$c;->c:Ljw4$c;

    aput-object v1, v0, v3

    new-instance v1, Ljw4$c;

    const-string v2, "SERVICE_ERROR"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Ljw4$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ljw4$c;->d:Ljw4$c;

    aput-object v1, v0, v3

    sput-object v0, Ljw4$c;->e:[Ljw4$c;

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

.method public static valueOf(Ljava/lang/String;)Ljw4$c;
    .locals 1

    const-class v0, Ljw4$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljw4$c;

    return-object p0
.end method

.method public static values()[Ljw4$c;
    .locals 1

    sget-object v0, Ljw4$c;->e:[Ljw4$c;

    invoke-virtual {v0}, [Ljw4$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljw4$c;

    return-object v0
.end method
