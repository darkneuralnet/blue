.class public final LWE2;
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

.field public static final d:LOt4;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LVM1;

    invoke-direct {v0}, LVM1;-><init>()V

    invoke-virtual {v0}, LVM1;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, LWE2;->a:Ljava/lang/String;

    invoke-static {}, LOt4;->G()LOt4;

    move-result-object v0

    sput-object v0, LWE2;->b:LOt4;

    sput-object v0, LWE2;->c:LOt4;

    sput-object v0, LWE2;->d:LOt4;

    :try_start_0
    invoke-static {}, LWE2;->a()V
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
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, LWE2;->b()V

    return-void
.end method

.method public static b()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {}, LZE2;->f()V

    const/4 v0, 0x1

    invoke-static {v0}, LVM1;->p(Z)V

    invoke-static {}, LT46;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lv8;->o(Z)V

    return-void
.end method
