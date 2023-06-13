.class public LjM2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LSO1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    :try_start_0
    invoke-static {}, LjM2;->a()LSO1;

    move-result-object v0

    sput-object v0, LjM2;->a:LSO1;
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Unexpected failure while binding MarkerFactory"

    invoke-static {v1, v0}, Lui6;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    new-instance v0, LNE;

    invoke-direct {v0}, LNE;-><init>()V

    sput-object v0, LjM2;->a:LSO1;

    :goto_0
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LSO1;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoClassDefFoundError;
        }
    .end annotation

    :try_start_0
    invoke-static {}, LiQ5;->b()LiQ5;

    move-result-object v0

    invoke-virtual {v0}, LiQ5;->a()LSO1;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, LiQ5;->b:LiQ5;

    invoke-virtual {v0}, LiQ5;->a()LSO1;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)LgM2;
    .locals 1

    sget-object v0, LjM2;->a:LSO1;

    invoke-interface {v0, p0}, LSO1;->a(Ljava/lang/String;)LgM2;

    move-result-object p0

    return-object p0
.end method
