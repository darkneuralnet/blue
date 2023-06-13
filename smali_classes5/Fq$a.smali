.class public final LFq$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LOd3<",
        "Lcc;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:LFq$a;

.field public static final b:LSk1;

.field public static final c:LSk1;

.field public static final d:LSk1;

.field public static final e:LSk1;

.field public static final f:LSk1;

.field public static final g:LSk1;

.field public static final h:LSk1;

.field public static final i:LSk1;

.field public static final j:LSk1;

.field public static final k:LSk1;

.field public static final l:LSk1;

.field public static final m:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LFq$a;

    invoke-direct {v0}, LFq$a;-><init>()V

    sput-object v0, LFq$a;->a:LFq$a;

    const-string v0, "sdkVersion"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$a;->b:LSk1;

    const-string v0, "model"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$a;->c:LSk1;

    const-string v0, "hardware"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$a;->d:LSk1;

    const-string v0, "device"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$a;->e:LSk1;

    const-string v0, "product"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$a;->f:LSk1;

    const-string v0, "osBuild"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$a;->g:LSk1;

    const-string v0, "manufacturer"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$a;->h:LSk1;

    const-string v0, "fingerprint"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$a;->i:LSk1;

    const-string v0, "locale"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$a;->j:LSk1;

    const-string v0, "country"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$a;->k:LSk1;

    const-string v0, "mccMnc"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$a;->l:LSk1;

    const-string v0, "applicationBuild"

    invoke-static {v0}, LSk1;->d(Ljava/lang/String;)LSk1;

    move-result-object v0

    sput-object v0, LFq$a;->m:LSk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcc;LPd3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LFq$a;->b:LSk1;

    invoke-virtual {p1}, Lcc;->m()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$a;->c:LSk1;

    invoke-virtual {p1}, Lcc;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$a;->d:LSk1;

    invoke-virtual {p1}, Lcc;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$a;->e:LSk1;

    invoke-virtual {p1}, Lcc;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$a;->f:LSk1;

    invoke-virtual {p1}, Lcc;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$a;->g:LSk1;

    invoke-virtual {p1}, Lcc;->k()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$a;->h:LSk1;

    invoke-virtual {p1}, Lcc;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$a;->i:LSk1;

    invoke-virtual {p1}, Lcc;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$a;->j:LSk1;

    invoke-virtual {p1}, Lcc;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$a;->k:LSk1;

    invoke-virtual {p1}, Lcc;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$a;->l:LSk1;

    invoke-virtual {p1}, Lcc;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LFq$a;->m:LSk1;

    invoke-virtual {p1}, Lcc;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lcc;

    check-cast p2, LPd3;

    invoke-virtual {p0, p1, p2}, LFq$a;->a(Lcc;LPd3;)V

    return-void
.end method
