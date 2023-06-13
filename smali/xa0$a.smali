.class public final Lxa0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxa0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxa0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static h()Lxa0;
    .locals 1

    new-instance v0, Lxa0$a;

    invoke-direct {v0}, Lxa0$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LxY5;
    .locals 1

    invoke-static {}, LxY5;->a()LxY5;

    move-result-object v0

    return-object v0
.end method

.method public c()Lua0;
    .locals 1

    sget-object v0, Lua0;->b:Lua0;

    return-object v0
.end method

.method public d()Lva0;
    .locals 1

    sget-object v0, Lva0;->b:Lva0;

    return-object v0
.end method

.method public e()Lsa0;
    .locals 1

    sget-object v0, Lsa0;->b:Lsa0;

    return-object v0
.end method

.method public f()Lwa0;
    .locals 1

    sget-object v0, Lwa0;->b:Lwa0;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method
