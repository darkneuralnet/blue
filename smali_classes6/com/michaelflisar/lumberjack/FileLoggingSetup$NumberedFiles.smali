.class public final Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;
.super Lcom/michaelflisar/lumberjack/FileLoggingSetup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/michaelflisar/lumberjack/FileLoggingSetup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NumberedFiles"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u00a2\u0006\u0004\u0008 \u0010!B9\u0008\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0017\u00a2\u0006\u0004\u0008 \u0010$J\t\u0010\u0003\u001a\u00020\u0002H\u00d6\u0001J\u0019\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u00d6\u0001R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\n\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000b\u001a\u0004\u0008\u0015\u0010\rR\u001a\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0018\u001a\u0004\u0008\u0010\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\t8\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u000b\u001a\u0004\u0008\u001c\u0010\rR\u0017\u0010\u001f\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u000b\u001a\u0004\u0008\u0014\u0010\r\u00a8\u0006%"
    }
    d2 = {
        "Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;",
        "Lcom/michaelflisar/lumberjack/FileLoggingSetup;",
        "",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "",
        "writeToParcel",
        "",
        "b",
        "Ljava/lang/String;",
        "a",
        "()Ljava/lang/String;",
        "folder",
        "",
        "c",
        "Z",
        "()Z",
        "logOnBackgroundThread",
        "d",
        "e",
        "sizeLimit",
        "Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;",
        "Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;",
        "()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;",
        "setup",
        "f",
        "getPattern",
        "pattern",
        "g",
        "baseFilePath",
        "<init>",
        "(Ljava/lang/String;ZLjava/lang/String;Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;)V",
        "Landroid/content/Context;",
        "context",
        "(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;)V",
        "lumberjack-filelogger_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles$a;

    invoke-direct {v0}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles$a;-><init>()V

    sput-object v0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "folder"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sizeLimit"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "setup"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;-><init>(Ljava/lang/String;ZLjava/lang/String;Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    const-string v0, ""

    move-object v1, p1

    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v2, "constructor(context: Context,\n                    folder: String = context.getFileStreamPath(\"\").absolutePath,\n                    logOnBackgroundThread: Boolean = true,\n                    sizeLimit: String = \"1MB\",\n                    setup: Setup = Setup()) : this(folder, logOnBackgroundThread, sizeLimit, setup)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v1, p1

    move-object v0, p2

    :goto_0
    and-int/lit8 v2, p6, 0x4

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    move v2, p3

    :goto_1
    and-int/lit8 v3, p6, 0x8

    if-eqz v3, :cond_2

    const-string v3, "1MB"

    goto :goto_2

    :cond_2
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, p6, 0x10

    if-eqz v4, :cond_3

    new-instance v4, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xf

    const/4 v11, 0x0

    move-object v5, v4

    invoke-direct/range {v5 .. v11}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_3
    move-object/from16 v4, p5

    :goto_3
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v0

    move/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    invoke-direct/range {p2 .. p7}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;-><init>(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;)V
    .locals 1

    const-string v0, "folder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sizeLimit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setup"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/michaelflisar/lumberjack/FileLoggingSetup;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->b:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->c:Z

    iput-object p3, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->e:Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    sget-object p1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 p1, 0x2

    new-array p2, p1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    move-result-object p3

    invoke-virtual {p3}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->b()Ljava/lang/String;

    move-result-object p3

    const/4 p4, 0x0

    aput-object p3, p2, p4

    invoke-virtual {p0}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    move-result-object p3

    invoke-virtual {p3}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->a()Ljava/lang/String;

    move-result-object p3

    const/4 p4, 0x1

    aput-object p3, p2, p4

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%s\\d*.%s"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "java.lang.String.format(format, *args)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->f:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x2f

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    move-result-object p2

    invoke-virtual {p2}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    move-result-object p2

    invoke-virtual {p2}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->c:Z

    return v0
.end method

.method public c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;
    .locals 1

    iget-object v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->e:Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->g:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->d:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->c:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$NumberedFiles;->e:Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    invoke-virtual {v0, p1, p2}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
