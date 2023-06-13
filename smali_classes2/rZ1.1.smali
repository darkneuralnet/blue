.class public final LrZ1;
.super LGZ1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tB\u0019\u0008\u0016\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0008\u0010\rJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000e"
    }
    d2 = {
        "LrZ1;",
        "LGZ1;",
        "Lorg/json/JSONObject;",
        "z",
        "LzT2;",
        "h0",
        "()LzT2;",
        "messageType",
        "<init>",
        "()V",
        "jsonObject",
        "Lbo/app/y1;",
        "brazeManager",
        "(Lorg/json/JSONObject;Lbo/app/y1;)V",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LGZ1;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;Lbo/app/y1;)V
    .locals 1

    const-string v0, "jsonObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brazeManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LGZ1;-><init>(Lorg/json/JSONObject;Lbo/app/y1;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic forJsonPut()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LrZ1;->z()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public h0()LzT2;
    .locals 1

    sget-object v0, LzT2;->e:LzT2;

    return-object v0
.end method

.method public z()Lorg/json/JSONObject;
    .locals 3

    invoke-virtual {p0}, LhZ1;->C()Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, LGZ1;->z()Lorg/json/JSONObject;

    move-result-object v0

    :try_start_0
    const-string v1, "type"

    invoke-virtual {p0}, LrZ1;->h0()LzT2;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0
.end method
