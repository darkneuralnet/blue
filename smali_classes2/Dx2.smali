.class public LDx2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LWD2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxx2;

    invoke-direct {v0}, Lxx2;-><init>()V

    sput-object v0, LDx2;->a:LWD2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    sget-object v0, LDx2;->a:LWD2;

    invoke-interface {v0, p0}, LWD2;->debug(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, LDx2;->a:LWD2;

    invoke-interface {v0, p0, p1}, LWD2;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 1

    sget-object v0, LDx2;->a:LWD2;

    invoke-interface {v0, p0}, LWD2;->warning(Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, LDx2;->a:LWD2;

    invoke-interface {v0, p0, p1}, LWD2;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
