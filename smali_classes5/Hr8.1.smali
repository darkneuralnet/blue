.class public final LHr8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final a:LHr8;

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

.field public static final n:LSk1;

.field public static final o:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LHr8;

    invoke-direct {v0}, LHr8;-><init>()V

    sput-object v0, LHr8;->a:LHr8;

    const-string v0, "appId"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LHr8;->b:LSk1;

    const-string v0, "appVersion"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LHr8;->c:LSk1;

    const-string v0, "firebaseProjectId"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LHr8;->d:LSk1;

    const-string v0, "mlSdkVersion"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LHr8;->e:LSk1;

    const-string v0, "tfliteSchemaVersion"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LHr8;->f:LSk1;

    const-string v0, "gcmSenderId"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LHr8;->g:LSk1;

    const-string v0, "apiKey"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LHr8;->h:LSk1;

    const-string v0, "languages"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LHr8;->i:LSk1;

    const-string v0, "mlSdkInstanceId"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LHr8;->j:LSk1;

    const-string v0, "isClearcutClient"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LHr8;->k:LSk1;

    const-string v0, "isStandaloneMlkit"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LHr8;->l:LSk1;

    const-string v0, "isJsonLogging"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LHr8;->m:LSk1;

    const-string v0, "buildLevel"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LHr8;->n:LSk1;

    const-string v0, "optionalModuleVersion"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lyj7;

    invoke-direct {v1}, Lyj7;-><init>()V

    const/16 v2, 0xe

    invoke-virtual {v1, v2}, Lyj7;->a(I)Lyj7;

    invoke-virtual {v1}, Lyj7;->b()Lin7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LHr8;->o:LSk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, LVT8;

    check-cast p2, LPd3;

    sget-object v0, LHr8;->b:LSk1;

    invoke-virtual {p1}, LVT8;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LHr8;->c:LSk1;

    invoke-virtual {p1}, LVT8;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LHr8;->d:LSk1;

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LHr8;->e:LSk1;

    invoke-virtual {p1}, LVT8;->j()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v0, v2}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LHr8;->f:LSk1;

    invoke-virtual {p1}, LVT8;->k()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v0, v2}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LHr8;->g:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LHr8;->h:LSk1;

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LHr8;->i:LSk1;

    invoke-virtual {p1}, LVT8;->a()LEd9;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LHr8;->j:LSk1;

    invoke-virtual {p1}, LVT8;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LHr8;->k:LSk1;

    invoke-virtual {p1}, LVT8;->b()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LHr8;->l:LSk1;

    invoke-virtual {p1}, LVT8;->d()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LHr8;->m:LSk1;

    invoke-virtual {p1}, LVT8;->c()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LHr8;->n:LSk1;

    invoke-virtual {p1}, LVT8;->e()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LHr8;->o:LSk1;

    invoke-virtual {p1}, LVT8;->f()Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    return-void
.end method
