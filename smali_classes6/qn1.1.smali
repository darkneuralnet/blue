.class public Lqn1;
.super LmQ3;
.source "SourceFile"


# static fields
.field public static final b:Lad;


# instance fields
.field public final a:Ldm;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lad;->e()Lad;

    move-result-object v0

    sput-object v0, Lqn1;->b:Lad;

    return-void
.end method

.method public constructor <init>(Ldm;)V
    .locals 0

    invoke-direct {p0}, LmQ3;-><init>()V

    iput-object p1, p0, Lqn1;->a:Ldm;

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 2

    invoke-virtual {p0}, Lqn1;->g()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lqn1;->b:Lad;

    const-string v1, "ApplicationInfo is invalid"

    invoke-virtual {v0, v1}, Lad;->j(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final g()Z
    .locals 3

    iget-object v0, p0, Lqn1;->a:Ldm;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v0, Lqn1;->b:Lad;

    const-string v2, "ApplicationInfo is null"

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_0
    invoke-virtual {v0}, Ldm;->f0()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lqn1;->b:Lad;

    const-string v2, "GoogleAppId is null"

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_1
    iget-object v0, p0, Lqn1;->a:Ldm;

    invoke-virtual {v0}, Ldm;->d0()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lqn1;->b:Lad;

    const-string v2, "AppInstanceId is null"

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_2
    iget-object v0, p0, Lqn1;->a:Ldm;

    invoke-virtual {v0}, Ldm;->e0()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lqn1;->b:Lad;

    const-string v2, "ApplicationProcessState is null"

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_3
    iget-object v0, p0, Lqn1;->a:Ldm;

    invoke-virtual {v0}, Ldm;->c0()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lqn1;->a:Ldm;

    invoke-virtual {v0}, Ldm;->Z()Lmb;

    move-result-object v0

    invoke-virtual {v0}, Lmb;->Y()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lqn1;->b:Lad;

    const-string v2, "AndroidAppInfo.packageName is null"

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_4
    iget-object v0, p0, Lqn1;->a:Ldm;

    invoke-virtual {v0}, Ldm;->Z()Lmb;

    move-result-object v0

    invoke-virtual {v0}, Lmb;->Z()Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lqn1;->b:Lad;

    const-string v2, "AndroidAppInfo.sdkVersion is null"

    invoke-virtual {v0, v2}, Lad;->j(Ljava/lang/String;)V

    return v1

    :cond_5
    const/4 v0, 0x1

    return v0
.end method
