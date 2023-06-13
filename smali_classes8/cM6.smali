.class public final enum LcM6;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LcM6;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LcM6;

.field public static final enum d:LcM6;

.field public static final enum e:LcM6;

.field public static final enum f:LcM6;

.field public static final enum g:LcM6;

.field public static final enum h:LcM6;

.field public static final enum i:LcM6;

.field public static final enum j:LcM6;

.field public static final enum k:LcM6;

.field public static final enum l:LcM6;

.field public static final enum m:LcM6;

.field public static final synthetic n:[LcM6;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LcM6;

    const-string v1, "https://c.paypal.com/r/v1/device/mg-audit"

    const-string v2, "AUDIT_JSON_URL"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LcM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LcM6;->c:LcM6;

    new-instance v1, LcM6;

    const-string v2, "https://c.paypal.com/r/v1/device/client-metadata"

    const-string v4, "DEVICE_INFO_URL"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LcM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LcM6;->d:LcM6;

    new-instance v2, LcM6;

    const-string v4, "https://b.stats.paypal.com/counter.cgi"

    const-string v6, "PRODUCTION_BEACON_URL"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LcM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, LcM6;->e:LcM6;

    new-instance v4, LcM6;

    const-string v6, "https://c.paypal.com/r/v1/device/mg"

    const-string v8, "PRODUCTION_JSON_URL"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, LcM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, LcM6;->f:LcM6;

    new-instance v6, LcM6;

    const-string v8, "https://www.paypalobjects.com/rdaAssets/magnes/magnes_android_rac.json"

    const-string v10, "RAMP_CONFIG_URL"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, LcM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, LcM6;->g:LcM6;

    new-instance v8, LcM6;

    const-string v10, "https://www.paypalobjects.com/rdaAssets/magnes/magnes_android_rec.json"

    const-string v12, "REMOTE_CONFIG_URL"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, LcM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, LcM6;->h:LcM6;

    new-instance v10, LcM6;

    const-string v12, "https://c.sandbox.paypal.com/r/v1/device/client-metadata"

    const-string v14, "SANDBOX_DEVICE_INFO_URL"

    const/4 v15, 0x6

    invoke-direct {v10, v14, v15, v12}, LcM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, LcM6;->i:LcM6;

    new-instance v12, LcM6;

    const-string v14, "https://c.sandbox.paypal.com/r/v1/device/s"

    const-string v15, "SANDBOX_S_URL"

    const/4 v13, 0x7

    invoke-direct {v12, v15, v13, v14}, LcM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, LcM6;->j:LcM6;

    new-instance v14, LcM6;

    const-string v15, "https://c.paypal.com/r/v1/device/s"

    const-string v13, "SENSOR_URL"

    const/16 v11, 0x8

    invoke-direct {v14, v13, v11, v15}, LcM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v14, LcM6;->k:LcM6;

    new-instance v13, LcM6;

    const-string v15, "https://www.stage2du13.stage.paypal.com/r/v1/device/mg-audit"

    const-string v11, "STAGE_AUDIT_JSON_URL"

    const/16 v9, 0x9

    invoke-direct {v13, v11, v9, v15}, LcM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, LcM6;->l:LcM6;

    new-instance v11, LcM6;

    const-string v15, "https://www.stage2du13.stage.paypal.com/r/v1/device/mg"

    const-string v9, "STAGE_PROD_JSON_URL"

    const/16 v7, 0xa

    invoke-direct {v11, v9, v7, v15}, LcM6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, LcM6;->m:LcM6;

    const/16 v9, 0xb

    new-array v9, v9, [LcM6;

    aput-object v0, v9, v3

    aput-object v1, v9, v5

    const/4 v0, 0x2

    aput-object v2, v9, v0

    const/4 v0, 0x3

    aput-object v4, v9, v0

    const/4 v0, 0x4

    aput-object v6, v9, v0

    const/4 v0, 0x5

    aput-object v8, v9, v0

    const/4 v0, 0x6

    aput-object v10, v9, v0

    const/4 v0, 0x7

    aput-object v12, v9, v0

    const/16 v0, 0x8

    aput-object v14, v9, v0

    const/16 v0, 0x9

    aput-object v13, v9, v0

    aput-object v11, v9, v7

    sput-object v9, LcM6;->n:[LcM6;

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

    iput-object p3, p0, LcM6;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LcM6;
    .locals 1

    const-class v0, LcM6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LcM6;

    return-object p0
.end method

.method public static values()[LcM6;
    .locals 1

    sget-object v0, LcM6;->n:[LcM6;

    invoke-virtual {v0}, [LcM6;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LcM6;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, LcM6;->b:Ljava/lang/String;

    return-object v0
.end method
