.class public final LMq5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LMq5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LMq5;

    invoke-direct {v0}, LMq5;-><init>()V

    sput-object v0, LMq5;->a:LMq5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LMq5;
    .locals 1

    sget-object v0, LMq5;->a:LMq5;

    return-object v0
.end method

.method public static b(LMq5;)LMq5;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "SecretKeyAccess is required"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
