.class public final Lbo/app/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0016\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lbo/app/i1;",
        "",
        "Lorg/json/JSONArray;",
        "geofenceJson",
        "",
        "Ld20;",
        "a",
        "<init>",
        "()V",
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
.field public static final a:Lbo/app/i1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbo/app/i1;

    invoke-direct {v0}, Lbo/app/i1;-><init>()V

    sput-object v0, Lbo/app/i1;->a:Lbo/app/i1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Ld20;",
            ">;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "geofenceJson"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    if-nez v2, :cond_0

    :try_start_0
    sget-object v4, Lk20;->a:Lk20;

    sget-object v5, Lbo/app/i1;->a:Lbo/app/i1;

    sget-object v6, Lk20$a;->g:Lk20$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    sget-object v9, Lbo/app/i1$a;->b:Lbo/app/i1$a;

    const/4 v10, 0x6

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance v4, Ld20;

    invoke-direct {v4, v2}, Ld20;-><init>(Lorg/json/JSONObject;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    move-object v8, v4

    sget-object v5, Lk20;->a:Lk20;

    sget-object v6, Lbo/app/i1;->a:Lbo/app/i1;

    sget-object v7, Lk20$a;->e:Lk20$a;

    new-instance v10, Lbo/app/i1$c;

    invoke-direct {v10, v2}, Lbo/app/i1$c;-><init>(Lorg/json/JSONObject;)V

    const/4 v9, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_1

    :catch_1
    move-exception v4

    move-object v8, v4

    sget-object v5, Lk20;->a:Lk20;

    sget-object v6, Lbo/app/i1;->a:Lbo/app/i1;

    sget-object v7, Lk20$a;->g:Lk20$a;

    new-instance v10, Lbo/app/i1$b;

    invoke-direct {v10, v2}, Lbo/app/i1$b;-><init>(Lorg/json/JSONObject;)V

    const/4 v9, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_1
    move v2, v3

    goto :goto_0

    :cond_1
    return-object v0
.end method
