.class public abstract Lcom/michaelflisar/lumberjack/FileLoggingSetup;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/michaelflisar/lumberjack/interfaces/IFileLoggingSetup;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;,
        Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;,
        Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u0082\u0001\u0002\u0013\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/michaelflisar/lumberjack/FileLoggingSetup;",
        "Lcom/michaelflisar/lumberjack/interfaces/IFileLoggingSetup;",
        "",
        "a",
        "()Ljava/lang/String;",
        "folder",
        "",
        "b",
        "()Z",
        "logOnBackgroundThread",
        "Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;",
        "c",
        "()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;",
        "setup",
        "<init>",
        "()V",
        "DateFiles",
        "NumberedFiles",
        "Setup",
        "Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;",
        "Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;",
        "lumberjack-filelogger_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/michaelflisar/lumberjack/FileLoggingSetup;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract b()Z
.end method

.method public abstract c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;
.end method
