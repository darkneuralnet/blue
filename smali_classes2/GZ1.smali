.class public abstract LGZ1;
.super LqZ1;
.source "SourceFile"

# interfaces
.implements LLO1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGZ1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\'\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0016B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B\u0019\u0008\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u000f\u0010\u0014J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0017"
    }
    d2 = {
        "LGZ1;",
        "LqZ1;",
        "LLO1;",
        "",
        "",
        "f0",
        "Lorg/json/JSONObject;",
        "z",
        "D",
        "Ljava/lang/String;",
        "m0",
        "()Ljava/lang/String;",
        "u0",
        "(Ljava/lang/String;)V",
        "assetsZipRemoteUrl",
        "<init>",
        "()V",
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
.field public static final E:LGZ1$a;


# instance fields
.field public D:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LGZ1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LGZ1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LGZ1;->E:LGZ1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LqZ1;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;Lbo/app/y1;)V
    .locals 1

    const-string v0, "jsonObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brazeManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LqZ1;-><init>(Lorg/json/JSONObject;Lbo/app/y1;)V

    const-string p2, "zipped_assets_url"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "it"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, LGZ1;->u0(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
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

    invoke-virtual {p0}, LGZ1;->m0()Ljava/lang/String;

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

    invoke-virtual {p0}, LGZ1;->z()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public m0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LGZ1;->D:Ljava/lang/String;

    return-object v0
.end method

.method public u0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LGZ1;->D:Ljava/lang/String;

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
    const-string v1, "zipped_assets_url"

    invoke-virtual {p0}, LGZ1;->m0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0
.end method
