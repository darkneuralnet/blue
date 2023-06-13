.class public abstract LFZ1;
.super LhZ1;
.source "SourceFile"

# interfaces
.implements LKO1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFZ1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\'\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001/B\t\u0008\u0014\u00a2\u0006\u0004\u0008)\u0010\u001cB\u0019\u0008\u0016\u0012\u0006\u0010*\u001a\u00020\n\u0012\u0006\u0010,\u001a\u00020+\u00a2\u0006\u0004\u0008)\u0010-J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0008H\u0016J\u0008\u0010\u000b\u001a\u00020\nH\u0016R$\u0010\u0013\u001a\u0004\u0018\u00010\u000c8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R(\u0010\u001d\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0015\u0010\u0016\u0012\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR$\u0010$\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R$\u0010(\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008%\u0010\u001f\u001a\u0004\u0008&\u0010!\"\u0004\u0008\'\u0010#\u00a8\u00060"
    }
    d2 = {
        "LFZ1;",
        "LhZ1;",
        "LKO1;",
        "",
        "",
        "remotePathToLocalAssetMap",
        "",
        "c0",
        "",
        "f0",
        "Lorg/json/JSONObject;",
        "z",
        "Landroid/graphics/Bitmap;",
        "A",
        "Landroid/graphics/Bitmap;",
        "getBitmap",
        "()Landroid/graphics/Bitmap;",
        "y",
        "(Landroid/graphics/Bitmap;)V",
        "bitmap",
        "",
        "B",
        "Z",
        "u0",
        "()Z",
        "x",
        "(Z)V",
        "getImageDownloadSuccessful$annotations",
        "()V",
        "imageDownloadSuccessful",
        "C",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "b",
        "(Ljava/lang/String;)V",
        "localImageUrl",
        "D",
        "w",
        "v0",
        "remoteImageUrl",
        "<init>",
        "jsonObject",
        "Lbo/app/y1;",
        "brazeManager",
        "(Lorg/json/JSONObject;Lbo/app/y1;)V",
        "E",
        "a",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final E:LFZ1$a;


# instance fields
.field public A:Landroid/graphics/Bitmap;

.field public B:Z

.field public C:Ljava/lang/String;

.field public D:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LFZ1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFZ1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LFZ1;->E:LFZ1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LhZ1;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;Lbo/app/y1;)V
    .locals 8

    const-string v0, "jsonObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brazeManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, LhZ1;-><init>(Lorg/json/JSONObject;Lbo/app/y1;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string p2, "image_url"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LFZ1;->v0(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LFZ1;->C:Ljava/lang/String;

    return-void
.end method

.method public c0(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "remotePathToLocalAssetMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, [Ljava/lang/String;

    aget-object p1, p1, v0

    invoke-virtual {p0, p1}, LFZ1;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LFZ1;->C:Ljava/lang/String;

    return-object v0
.end method

.method public f0()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LFZ1;->w()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-object v0
.end method

.method public bridge synthetic forJsonPut()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LFZ1;->z()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, LFZ1;->A:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public u0()Z
    .locals 1

    iget-boolean v0, p0, LFZ1;->B:Z

    return v0
.end method

.method public v0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LFZ1;->D:Ljava/lang/String;

    return-void
.end method

.method public w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LFZ1;->D:Ljava/lang/String;

    return-object v0
.end method

.method public x(Z)V
    .locals 0

    iput-boolean p1, p0, LFZ1;->B:Z

    return-void
.end method

.method public y(Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, LFZ1;->A:Landroid/graphics/Bitmap;

    return-void
.end method

.method public z()Lorg/json/JSONObject;
    .locals 3

    invoke-virtual {p0}, LhZ1;->C()Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, LhZ1;->z()Lorg/json/JSONObject;

    move-result-object v0

    :try_start_0
    const-string v1, "image_url"

    invoke-virtual {p0}, LFZ1;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0
.end method
