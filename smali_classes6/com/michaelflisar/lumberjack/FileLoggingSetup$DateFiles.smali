.class public final Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;
.super Lcom/michaelflisar/lumberjack/FileLoggingSetup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/michaelflisar/lumberjack/FileLoggingSetup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DateFiles"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002H\u00d6\u0001J\u0019\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u00d6\u0001R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\n\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0010\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\t8\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u000b\u001a\u0004\u0008\u001a\u0010\r\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;",
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
        "Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;",
        "d",
        "Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;",
        "()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;",
        "setup",
        "e",
        "getPattern",
        "pattern",
        "<init>",
        "(Ljava/lang/String;ZLcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;)V",
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
            "Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

.field public final e:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles$a;

    invoke-direct {v0}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles$a;-><init>()V

    sput-object v0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;)V
    .locals 1

    const-string v0, "folder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setup"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/michaelflisar/lumberjack/FileLoggingSetup;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;->b:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;->c:Z

    iput-object p3, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;->d:Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    sget-object p1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 p1, 0x2

    new-array p2, p1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;->c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    move-result-object p3

    invoke-virtual {p3}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->b()Ljava/lang/String;

    move-result-object p3

    const/4 v0, 0x0

    aput-object p3, p2, v0

    invoke-virtual {p0}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;->c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    move-result-object p3

    invoke-virtual {p3}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->a()Ljava/lang/String;

    move-result-object p3

    const/4 v0, 0x1

    aput-object p3, p2, v0

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%s_\\d{8}.%s"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "java.lang.String.format(format, *args)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;->c:Z

    return v0
.end method

.method public c()Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;
    .locals 1

    iget-object v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;->d:Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;->c:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;->d:Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    invoke-virtual {v0, p1, p2}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
