.class public final LPx6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LPx6$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/common/api/Api;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api<",
            "LPx6$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/common/api/Api$ClientKey;

.field public static final c:Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;

.field public static final d:LQx6;

.field public static final e:Lvl9;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final f:Luy9;
    .annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/Api$ClientKey;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/Api$ClientKey;-><init>()V

    sput-object v0, LPx6;->b:Lcom/google/android/gms/common/api/Api$ClientKey;

    new-instance v1, LUs7;

    invoke-direct {v1}, LUs7;-><init>()V

    sput-object v1, LPx6;->c:Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;

    new-instance v2, Lcom/google/android/gms/common/api/Api;

    const-string v3, "Wallet.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/Api;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;Lcom/google/android/gms/common/api/Api$ClientKey;)V

    sput-object v2, LPx6;->a:Lcom/google/android/gms/common/api/Api;

    new-instance v0, Lvl9;

    invoke-direct {v0}, Lvl9;-><init>()V

    sput-object v0, LPx6;->e:Lvl9;

    new-instance v0, LCg7;

    invoke-direct {v0}, LCg7;-><init>()V

    sput-object v0, LPx6;->d:LQx6;

    new-instance v0, Luy9;

    invoke-direct {v0}, Luy9;-><init>()V

    sput-object v0, LPx6;->f:Luy9;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;LPx6$a;)LEP3;
    .locals 1

    new-instance v0, LEP3;

    invoke-direct {v0, p0, p1}, LEP3;-><init>(Landroid/app/Activity;LPx6$a;)V

    return-object v0
.end method

.method public static b(Landroid/content/Context;LPx6$a;)LEP3;
    .locals 1

    new-instance v0, LEP3;

    invoke-direct {v0, p0, p1}, LEP3;-><init>(Landroid/content/Context;LPx6$a;)V

    return-object v0
.end method
