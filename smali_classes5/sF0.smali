.class public LsF0;
.super LyF0;
.source "SourceFile"


# static fields
.field public static b:LvF0;

.field public static c:LzF0;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LyF0;-><init>()V

    return-void
.end method

.method public static a()LzF0;
    .locals 2

    sget-object v0, LsF0;->c:LzF0;

    const/4 v1, 0x0

    sput-object v1, LsF0;->c:LzF0;

    return-object v0
.end method

.method public static b(Landroid/net/Uri;)V
    .locals 2

    sget-object v0, LsF0;->c:LzF0;

    if-nez v0, :cond_0

    invoke-static {}, LsF0;->c()V

    :cond_0
    sget-object v0, LsF0;->c:LzF0;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, v1}, LzF0;->f(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/List;)Z

    :cond_1
    return-void
.end method

.method public static c()V
    .locals 2

    sget-object v0, LsF0;->c:LzF0;

    if-nez v0, :cond_0

    sget-object v0, LsF0;->b:LvF0;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LvF0;->d(LuF0;)LzF0;

    move-result-object v0

    sput-object v0, LsF0;->c:LzF0;

    :cond_0
    return-void
.end method


# virtual methods
.method public onCustomTabsServiceConnected(Landroid/content/ComponentName;LvF0;)V
    .locals 2

    sput-object p2, LsF0;->b:LvF0;

    const-wide/16 v0, 0x0

    invoke-virtual {p2, v0, v1}, LvF0;->f(J)Z

    invoke-static {}, LsF0;->c()V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    return-void
.end method
