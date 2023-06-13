.class public final enum LeM6;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LeM6;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LeM6;

.field public static final enum d:LeM6;

.field public static final enum e:LeM6;

.field public static final enum f:LeM6;

.field public static final enum g:LeM6;

.field public static final enum h:LeM6;

.field public static final enum i:LeM6;

.field public static final synthetic j:[LeM6;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LeM6;

    const-string v1, "conf_version"

    const-string v2, "CONF_VERSION"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LeM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LeM6;->c:LeM6;

    new-instance v1, LeM6;

    const-string v2, "endpoint_url"

    const-string v4, "CONF_ENDPOINT_URL"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LeM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LeM6;->d:LeM6;

    new-instance v2, LeM6;

    const-string v4, "conf_refresh_time_interval"

    const-string v6, "CONF_REFRESH_TIME_KEY"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LeM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, LeM6;->e:LeM6;

    new-instance v4, LeM6;

    const-string v6, "android_apps_to_check"

    const-string v8, "ANDROID_APPS_TO_CHECK"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, LeM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, LeM6;->f:LeM6;

    new-instance v6, LeM6;

    const-string v8, "nc"

    const-string v10, "NOT_COLLECTABLE"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, LeM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, LeM6;->g:LeM6;

    new-instance v8, LeM6;

    const-string v10, "m"

    const-string v12, "MG_ID"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, LeM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, LeM6;->h:LeM6;

    new-instance v10, LeM6;

    const-string v12, "s"

    const-string v14, "SENSOR_COLLECT_TIME"

    const/4 v15, 0x6

    invoke-direct {v10, v14, v15, v12}, LeM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, LeM6;->i:LeM6;

    const/4 v12, 0x7

    new-array v12, v12, [LeM6;

    aput-object v0, v12, v3

    aput-object v1, v12, v5

    aput-object v2, v12, v7

    aput-object v4, v12, v9

    aput-object v6, v12, v11

    aput-object v8, v12, v13

    aput-object v10, v12, v15

    sput-object v12, LeM6;->j:[LeM6;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LeM6;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LeM6;
    .locals 1

    const-class v0, LeM6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LeM6;

    return-object p0
.end method

.method public static values()[LeM6;
    .locals 1

    sget-object v0, LeM6;->j:[LeM6;

    invoke-virtual {v0}, [LeM6;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LeM6;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, LeM6;->b:Ljava/lang/String;

    return-object v0
.end method
