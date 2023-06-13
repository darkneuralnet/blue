.class public final Lf21;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:LOt4;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:LOt4;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb9;

    invoke-direct {v0}, Lb9;-><init>()V

    invoke-virtual {v0}, Lb9;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lf21;->a:Ljava/lang/String;

    invoke-static {}, LOt4;->G()LOt4;

    move-result-object v0

    sput-object v0, Lf21;->b:LOt4;

    invoke-static {}, LOt4;->G()LOt4;

    move-result-object v0

    sput-object v0, Lf21;->c:LOt4;

    :try_start_0
    invoke-static {}, Lf21;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {}, Lg21;->e()V

    invoke-static {}, LT46;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Lb9;->m(Z)V

    return-void
.end method
