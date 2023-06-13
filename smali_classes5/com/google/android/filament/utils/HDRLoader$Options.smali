.class public final Lcom/google/android/filament/utils/HDRLoader$Options;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/utils/HDRLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Options"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/google/android/filament/utils/HDRLoader$Options;",
        "",
        "()V",
        "desiredFormat",
        "Lcom/google/android/filament/Texture$InternalFormat;",
        "getDesiredFormat",
        "()Lcom/google/android/filament/Texture$InternalFormat;",
        "setDesiredFormat",
        "(Lcom/google/android/filament/Texture$InternalFormat;)V",
        "filament-utils-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private desiredFormat:Lcom/google/android/filament/Texture$InternalFormat;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/filament/Texture$InternalFormat;->RGB16F:Lcom/google/android/filament/Texture$InternalFormat;

    iput-object v0, p0, Lcom/google/android/filament/utils/HDRLoader$Options;->desiredFormat:Lcom/google/android/filament/Texture$InternalFormat;

    return-void
.end method


# virtual methods
.method public final getDesiredFormat()Lcom/google/android/filament/Texture$InternalFormat;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/HDRLoader$Options;->desiredFormat:Lcom/google/android/filament/Texture$InternalFormat;

    return-object v0
.end method

.method public final setDesiredFormat(Lcom/google/android/filament/Texture$InternalFormat;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/filament/utils/HDRLoader$Options;->desiredFormat:Lcom/google/android/filament/Texture$InternalFormat;

    return-void
.end method
