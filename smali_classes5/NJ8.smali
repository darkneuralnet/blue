.class public final LNJ8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final a:LNJ8;

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
    .locals 3

    new-instance v0, LNJ8;

    invoke-direct {v0}, LNJ8;-><init>()V

    sput-object v0, LNJ8;->a:LNJ8;

    const-string v0, "deviceInfo"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LMO7;

    invoke-direct {v1}, LMO7;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, LMO7;->a(I)LMO7;

    invoke-virtual {v1}, LMO7;->b()LfR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNJ8;->b:LSk1;

    const-string v0, "nnapiInfo"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LMO7;

    invoke-direct {v1}, LMO7;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, LMO7;->a(I)LMO7;

    invoke-virtual {v1}, LMO7;->b()LfR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNJ8;->c:LSk1;

    const-string v0, "gpuInfo"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LMO7;

    invoke-direct {v1}, LMO7;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, LMO7;->a(I)LMO7;

    invoke-virtual {v1}, LMO7;->b()LfR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNJ8;->d:LSk1;

    const-string v0, "pipelineIdentifier"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LMO7;

    invoke-direct {v1}, LMO7;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, LMO7;->a(I)LMO7;

    invoke-virtual {v1}, LMO7;->b()LfR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNJ8;->e:LSk1;

    const-string v0, "acceptedConfigurations"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LMO7;

    invoke-direct {v1}, LMO7;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, LMO7;->a(I)LMO7;

    invoke-virtual {v1}, LMO7;->b()LfR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNJ8;->f:LSk1;

    const-string v0, "action"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LMO7;

    invoke-direct {v1}, LMO7;-><init>()V

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, LMO7;->a(I)LMO7;

    invoke-virtual {v1}, LMO7;->b()LfR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNJ8;->g:LSk1;

    const-string v0, "status"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LMO7;

    invoke-direct {v1}, LMO7;-><init>()V

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, LMO7;->a(I)LMO7;

    invoke-virtual {v1}, LMO7;->b()LfR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNJ8;->h:LSk1;

    const-string v0, "customErrors"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LMO7;

    invoke-direct {v1}, LMO7;-><init>()V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, LMO7;->a(I)LMO7;

    invoke-virtual {v1}, LMO7;->b()LfR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNJ8;->i:LSk1;

    const-string v0, "benchmarkStatus"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LMO7;

    invoke-direct {v1}, LMO7;-><init>()V

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, LMO7;->a(I)LMO7;

    invoke-virtual {v1}, LMO7;->b()LfR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNJ8;->j:LSk1;

    const-string v0, "validationTestResult"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LMO7;

    invoke-direct {v1}, LMO7;-><init>()V

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, LMO7;->a(I)LMO7;

    invoke-virtual {v1}, LMO7;->b()LfR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNJ8;->k:LSk1;

    const-string v0, "timestampUs"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LMO7;

    invoke-direct {v1}, LMO7;-><init>()V

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, LMO7;->a(I)LMO7;

    invoke-virtual {v1}, LMO7;->b()LfR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNJ8;->l:LSk1;

    const-string v0, "elapsedUs"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LMO7;

    invoke-direct {v1}, LMO7;-><init>()V

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, LMO7;->a(I)LMO7;

    invoke-virtual {v1}, LMO7;->b()LfR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNJ8;->m:LSk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lfa9;

    check-cast p2, LPd3;

    const/4 p1, 0x0

    throw p1
.end method
