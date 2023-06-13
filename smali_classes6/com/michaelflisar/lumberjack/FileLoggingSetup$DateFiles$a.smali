.class public final Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;
    .locals 4

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    sget-object v3, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;

    invoke-direct {v0, v1, v2, p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;-><init>(Ljava/lang/String;ZLcom/michaelflisar/lumberjack/FileLoggingSetup$Setup;)V

    return-object v0
.end method

.method public final b(I)[Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;
    .locals 0

    new-array p1, p1, [Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles$a;->a(Landroid/os/Parcel;)Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles$a;->b(I)[Lcom/michaelflisar/lumberjack/FileLoggingSetup$DateFiles;

    move-result-object p1

    return-object p1
.end method
