.class public final Lq8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;

.field public static final g:Ljava/lang/String;

.field public static final h:Ljava/lang/String;

.field public static final i:LOt4;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final j:LOt4;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final k:LOt4;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LF8;

    invoke-direct {v0}, LF8;-><init>()V

    invoke-virtual {v0}, LF8;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq8;->a:Ljava/lang/String;

    new-instance v0, LT8;

    invoke-direct {v0}, LT8;-><init>()V

    invoke-virtual {v0}, LT8;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq8;->b:Ljava/lang/String;

    new-instance v0, LX8;

    invoke-direct {v0}, LX8;-><init>()V

    invoke-virtual {v0}, LX8;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq8;->c:Ljava/lang/String;

    new-instance v0, LO8;

    invoke-direct {v0}, LO8;-><init>()V

    invoke-virtual {v0}, LO8;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq8;->d:Ljava/lang/String;

    new-instance v0, Lsl2;

    invoke-direct {v0}, Lsl2;-><init>()V

    invoke-virtual {v0}, Lsl2;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq8;->e:Ljava/lang/String;

    new-instance v0, Lyl2;

    invoke-direct {v0}, Lyl2;-><init>()V

    invoke-virtual {v0}, Lyl2;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq8;->f:Ljava/lang/String;

    new-instance v0, Lkh0;

    invoke-direct {v0}, Lkh0;-><init>()V

    invoke-virtual {v0}, Lkh0;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq8;->g:Ljava/lang/String;

    new-instance v0, LBH6;

    invoke-direct {v0}, LBH6;-><init>()V

    invoke-virtual {v0}, LBH6;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq8;->h:Ljava/lang/String;

    invoke-static {}, LOt4;->G()LOt4;

    move-result-object v0

    sput-object v0, Lq8;->i:LOt4;

    sput-object v0, Lq8;->j:LOt4;

    sput-object v0, Lq8;->k:LOt4;

    :try_start_0
    invoke-static {}, Lq8;->a()V
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

    invoke-static {}, Lq8;->b()V

    return-void
.end method

.method public static b()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-static {}, Lr8;->e()V

    invoke-static {}, LWE2;->b()V

    const/4 v0, 0x1

    invoke-static {v0}, LF8;->p(Z)V

    invoke-static {v0}, LT8;->o(Z)V

    invoke-static {}, LT46;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, LO8;->o(Z)V

    invoke-static {v0}, LX8;->p(Z)V

    invoke-static {v0}, Lkh0;->m(Z)V

    invoke-static {v0}, Lsl2;->m(Z)V

    invoke-static {v0}, Lyl2;->m(Z)V

    invoke-static {v0}, LBH6;->m(Z)V

    return-void
.end method
