.class public final Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType<",
        "*>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\n\u0012\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J#\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/facebook/GraphRequest$ParcelableResourceWithMimeType$a",
        "Landroid/os/Parcelable$Creator;",
        "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;",
        "Landroid/os/Parcel;",
        "source",
        "a",
        "",
        "size",
        "",
        "b",
        "(I)[Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")",
            "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType<",
            "*>;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;-><init>(Landroid/os/Parcel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public b(I)[Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType<",
            "*>;"
        }
    .end annotation

    new-array p1, p1, [Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$a;->a(Landroid/os/Parcel;)Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$a;->b(I)[Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;

    move-result-object p1

    return-object p1
.end method
