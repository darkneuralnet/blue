.class public final LK88;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lrc8;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lu88;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lrc8;

    invoke-direct {p2}, Lrc8;-><init>()V

    iput-object p2, p0, LK88;->b:Lrc8;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    const-string v1, "Context cannot be null"

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {v0, v1, p2}, LDf8;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LK88;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(LK88;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, LK88;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic c(LK88;)Lrc8;
    .locals 0

    iget-object p0, p0, LK88;->b:Lrc8;

    return-object p0
.end method


# virtual methods
.method public final b()LZ88;
    .locals 2

    new-instance v0, LZ88;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LZ88;-><init>(LK88;Lu88;)V

    return-object v0
.end method
