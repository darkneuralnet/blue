.class public final LJJ5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\"\u001c\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0003\"\u001c\u0010\u0008\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0003\u00a8\u0006\t"
    }
    d2 = {
        "Ljava/util/UUID;",
        "kotlin.jvm.PlatformType",
        "a",
        "Ljava/util/UUID;",
        "SMARTLOCK_NOKE_SERVICE_UUID",
        "b",
        "SMARTLOCK_NOKE_WRITE_COMMAND_CHARACTERISTIC",
        "c",
        "SMARTLOCK_NOKE_NOTIFICATION_CHARACTERISTIC",
        "impl_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Ljava/util/UUID;

.field public static final b:Ljava/util/UUID;

.field public static final c:Ljava/util/UUID;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "0000fee7-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, LJJ5;->a:Ljava/util/UUID;

    const-string v0, "000036f5-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, LJJ5;->b:Ljava/util/UUID;

    const-string v0, "000036f6-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, LJJ5;->c:Ljava/util/UUID;

    return-void
.end method

.method public static final synthetic access$getSMARTLOCK_NOKE_NOTIFICATION_CHARACTERISTIC$p()Ljava/util/UUID;
    .locals 1

    sget-object v0, LJJ5;->c:Ljava/util/UUID;

    return-object v0
.end method

.method public static final synthetic access$getSMARTLOCK_NOKE_SERVICE_UUID$p()Ljava/util/UUID;
    .locals 1

    sget-object v0, LJJ5;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public static final synthetic access$getSMARTLOCK_NOKE_WRITE_COMMAND_CHARACTERISTIC$p()Ljava/util/UUID;
    .locals 1

    sget-object v0, LJJ5;->b:Ljava/util/UUID;

    return-object v0
.end method
