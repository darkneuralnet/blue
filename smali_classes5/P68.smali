.class public final LP68;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LGB7;

.field public static volatile b:LGB7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LHY7;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LHY7;-><init>(LtP7;)V

    sput-object v0, LP68;->a:LGB7;

    sput-object v0, LP68;->b:LGB7;

    return-void
.end method

.method public static a()LGB7;
    .locals 1

    sget-object v0, LP68;->b:LGB7;

    return-object v0
.end method
