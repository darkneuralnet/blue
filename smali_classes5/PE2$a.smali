.class public final LPE2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPE2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "LPE2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)LPE2;
    .locals 2

    new-instance v0, LPE2;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, LPE2;-><init>(FF)V

    invoke-virtual {v0, p1}, LPE2;->e(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public b(I)[LPE2;
    .locals 0

    new-array p1, p1, [LPE2;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LPE2$a;->a(Landroid/os/Parcel;)LPE2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LPE2$a;->b(I)[LPE2;

    move-result-object p1

    return-object p1
.end method
