.class public final Lbo/app/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LaP1;
.implements Lbo/app/f2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/app/h0$a;,
        Lbo/app/h0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LaP1<",
        "Lorg/json/JSONObject;",
        ">;",
        "Lbo/app/f2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0002\u0019\u001aBs\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u001b"
    }
    d2 = {
        "Lbo/app/h0;",
        "LaP1;",
        "Lorg/json/JSONObject;",
        "Lbo/app/f2;",
        "w",
        "",
        "v",
        "e",
        "()Z",
        "isEmpty",
        "LX10;",
        "configurationProvider",
        "",
        "androidVersion",
        "carrier",
        "model",
        "localeAndLanguage",
        "timeZone",
        "resolution",
        "isNotificationsEnabled",
        "isBackgroundRestricted",
        "googleAdvertisingId",
        "isAdTrackingEnabled",
        "<init>",
        "(LX10;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V",
        "a",
        "b",
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
.field public static final m:Lbo/app/h0$b;


# instance fields
.field private final b:LX10;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/Boolean;

.field private final j:Ljava/lang/Boolean;

.field private final k:Ljava/lang/String;

.field private final l:Ljava/lang/Boolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbo/app/h0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbo/app/h0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbo/app/h0;->m:Lbo/app/h0$b;

    return-void
.end method

.method public constructor <init>(LX10;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "configurationProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo/app/h0;->b:LX10;

    iput-object p2, p0, Lbo/app/h0;->c:Ljava/lang/String;

    iput-object p3, p0, Lbo/app/h0;->d:Ljava/lang/String;

    iput-object p4, p0, Lbo/app/h0;->e:Ljava/lang/String;

    iput-object p5, p0, Lbo/app/h0;->f:Ljava/lang/String;

    iput-object p6, p0, Lbo/app/h0;->g:Ljava/lang/String;

    iput-object p7, p0, Lbo/app/h0;->h:Ljava/lang/String;

    iput-object p8, p0, Lbo/app/h0;->i:Ljava/lang/Boolean;

    iput-object p9, p0, Lbo/app/h0;->j:Ljava/lang/Boolean;

    iput-object p10, p0, Lbo/app/h0;->k:Ljava/lang/String;

    iput-object p11, p0, Lbo/app/h0;->l:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public e()Z
    .locals 1

    invoke-virtual {p0}, Lbo/app/h0;->w()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic forJsonPut()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbo/app/h0;->w()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final v()Z
    .locals 2

    invoke-virtual {p0}, Lbo/app/h0;->w()Lorg/json/JSONObject;

    move-result-object v0

    sget-object v1, Lcom/appboy/enums/DeviceKey;->NOTIFICATIONS_ENABLED:Lcom/appboy/enums/DeviceKey;

    invoke-virtual {v1}, Lcom/appboy/enums/DeviceKey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public w()Lorg/json/JSONObject;
    .locals 10

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    sget-object v1, Lbo/app/h0;->m:Lbo/app/h0$b;

    iget-object v2, p0, Lbo/app/h0;->b:LX10;

    sget-object v3, Lcom/appboy/enums/DeviceKey;->ANDROID_VERSION:Lcom/appboy/enums/DeviceKey;

    iget-object v4, p0, Lbo/app/h0;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, v3, v4}, Lbo/app/h0$b;->a(LX10;Lorg/json/JSONObject;Lcom/appboy/enums/DeviceKey;Ljava/lang/Object;)V

    iget-object v2, p0, Lbo/app/h0;->b:LX10;

    sget-object v3, Lcom/appboy/enums/DeviceKey;->CARRIER:Lcom/appboy/enums/DeviceKey;

    iget-object v4, p0, Lbo/app/h0;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, v3, v4}, Lbo/app/h0$b;->a(LX10;Lorg/json/JSONObject;Lcom/appboy/enums/DeviceKey;Ljava/lang/Object;)V

    iget-object v2, p0, Lbo/app/h0;->b:LX10;

    sget-object v3, Lcom/appboy/enums/DeviceKey;->MODEL:Lcom/appboy/enums/DeviceKey;

    iget-object v4, p0, Lbo/app/h0;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, v3, v4}, Lbo/app/h0$b;->a(LX10;Lorg/json/JSONObject;Lcom/appboy/enums/DeviceKey;Ljava/lang/Object;)V

    iget-object v2, p0, Lbo/app/h0;->b:LX10;

    sget-object v3, Lcom/appboy/enums/DeviceKey;->RESOLUTION:Lcom/appboy/enums/DeviceKey;

    iget-object v4, p0, Lbo/app/h0;->h:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, v3, v4}, Lbo/app/h0$b;->a(LX10;Lorg/json/JSONObject;Lcom/appboy/enums/DeviceKey;Ljava/lang/Object;)V

    iget-object v2, p0, Lbo/app/h0;->b:LX10;

    sget-object v3, Lcom/appboy/enums/DeviceKey;->LOCALE:Lcom/appboy/enums/DeviceKey;

    iget-object v4, p0, Lbo/app/h0;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, v3, v4}, Lbo/app/h0$b;->a(LX10;Lorg/json/JSONObject;Lcom/appboy/enums/DeviceKey;Ljava/lang/Object;)V

    iget-object v2, p0, Lbo/app/h0;->b:LX10;

    sget-object v3, Lcom/appboy/enums/DeviceKey;->NOTIFICATIONS_ENABLED:Lcom/appboy/enums/DeviceKey;

    iget-object v4, p0, Lbo/app/h0;->i:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v3, v4}, Lbo/app/h0$b;->a(LX10;Lorg/json/JSONObject;Lcom/appboy/enums/DeviceKey;Ljava/lang/Object;)V

    iget-object v2, p0, Lbo/app/h0;->b:LX10;

    sget-object v3, Lcom/appboy/enums/DeviceKey;->IS_BACKGROUND_RESTRICTED:Lcom/appboy/enums/DeviceKey;

    iget-object v4, p0, Lbo/app/h0;->j:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v3, v4}, Lbo/app/h0$b;->a(LX10;Lorg/json/JSONObject;Lcom/appboy/enums/DeviceKey;Ljava/lang/Object;)V

    iget-object v2, p0, Lbo/app/h0;->k:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v4

    :goto_1
    if-nez v2, :cond_2

    iget-object v2, p0, Lbo/app/h0;->b:LX10;

    sget-object v5, Lcom/appboy/enums/DeviceKey;->GOOGLE_ADVERTISING_ID:Lcom/appboy/enums/DeviceKey;

    iget-object v6, p0, Lbo/app/h0;->k:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, v5, v6}, Lbo/app/h0$b;->a(LX10;Lorg/json/JSONObject;Lcom/appboy/enums/DeviceKey;Ljava/lang/Object;)V

    :cond_2
    iget-object v2, p0, Lbo/app/h0;->l:Ljava/lang/Boolean;

    if-eqz v2, :cond_3

    iget-object v5, p0, Lbo/app/h0;->b:LX10;

    sget-object v6, Lcom/appboy/enums/DeviceKey;->AD_TRACKING_ENABLED:Lcom/appboy/enums/DeviceKey;

    invoke-virtual {v1, v5, v0, v6, v2}, Lbo/app/h0$b;->a(LX10;Lorg/json/JSONObject;Lcom/appboy/enums/DeviceKey;Ljava/lang/Object;)V

    :cond_3
    iget-object v2, p0, Lbo/app/h0;->g:Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    move v3, v4

    :cond_5
    if-nez v3, :cond_6

    iget-object v2, p0, Lbo/app/h0;->b:LX10;

    sget-object v3, Lcom/appboy/enums/DeviceKey;->TIMEZONE:Lcom/appboy/enums/DeviceKey;

    iget-object v4, p0, Lbo/app/h0;->g:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, v3, v4}, Lbo/app/h0$b;->a(LX10;Lorg/json/JSONObject;Lcom/appboy/enums/DeviceKey;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    move-object v5, v1

    sget-object v2, Lk20;->a:Lk20;

    sget-object v4, Lk20$a;->e:Lk20$a;

    sget-object v7, Lbo/app/h0$c;->b:Lbo/app/h0$c;

    const/4 v6, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v3, p0

    invoke-static/range {v2 .. v9}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_6
    :goto_2
    return-object v0
.end method
