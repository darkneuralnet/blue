.class public final enum Ljw4$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljw4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljw4$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Ljw4$a;",
        "",
        "",
        "toString",
        "b",
        "Ljava/lang/String;",
        "eventType",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
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
.field public static final enum c:Ljw4$a;

.field public static final enum d:Ljw4$a;

.field public static final synthetic e:[Ljw4$a;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljw4$a;

    new-instance v1, Ljw4$a;

    const-string v2, "MOBILE_APP_INSTALL"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v2}, Ljw4$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ljw4$a;->c:Ljw4$a;

    aput-object v1, v0, v3

    new-instance v1, Ljw4$a;

    const-string v2, "CUSTOM_APP_EVENTS"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, Ljw4$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ljw4$a;->d:Ljw4$a;

    aput-object v1, v0, v3

    sput-object v0, Ljw4$a;->e:[Ljw4$a;

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

    iput-object p3, p0, Ljw4$a;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ljw4$a;
    .locals 1

    const-class v0, Ljw4$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljw4$a;

    return-object p0
.end method

.method public static values()[Ljw4$a;
    .locals 1

    sget-object v0, Ljw4$a;->e:[Ljw4$a;

    invoke-virtual {v0}, [Ljw4$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljw4$a;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljw4$a;->b:Ljava/lang/String;

    return-object v0
.end method
