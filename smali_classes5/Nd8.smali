.class public final LNd8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final a:LNd8;

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


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LNd8;

    invoke-direct {v0}, LNd8;-><init>()V

    sput-object v0, LNd8;->a:LNd8;

    const-string v0, "sdkVersion"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LoP7;

    invoke-direct {v1}, LoP7;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, LoP7;->a(I)LoP7;

    invoke-virtual {v1}, LoP7;->b()LHR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNd8;->b:LSk1;

    const-string v0, "osBuild"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LoP7;

    invoke-direct {v1}, LoP7;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, LoP7;->a(I)LoP7;

    invoke-virtual {v1}, LoP7;->b()LHR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNd8;->c:LSk1;

    const-string v0, "brand"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LoP7;

    invoke-direct {v1}, LoP7;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, LoP7;->a(I)LoP7;

    invoke-virtual {v1}, LoP7;->b()LHR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNd8;->d:LSk1;

    const-string v0, "device"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LoP7;

    invoke-direct {v1}, LoP7;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, LoP7;->a(I)LoP7;

    invoke-virtual {v1}, LoP7;->b()LHR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNd8;->e:LSk1;

    const-string v0, "hardware"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LoP7;

    invoke-direct {v1}, LoP7;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, LoP7;->a(I)LoP7;

    invoke-virtual {v1}, LoP7;->b()LHR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNd8;->f:LSk1;

    const-string v0, "manufacturer"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LoP7;

    invoke-direct {v1}, LoP7;-><init>()V

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, LoP7;->a(I)LoP7;

    invoke-virtual {v1}, LoP7;->b()LHR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNd8;->g:LSk1;

    const-string v0, "model"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LoP7;

    invoke-direct {v1}, LoP7;-><init>()V

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, LoP7;->a(I)LoP7;

    invoke-virtual {v1}, LoP7;->b()LHR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNd8;->h:LSk1;

    const-string v0, "product"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LoP7;

    invoke-direct {v1}, LoP7;-><init>()V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, LoP7;->a(I)LoP7;

    invoke-virtual {v1}, LoP7;->b()LHR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNd8;->i:LSk1;

    const-string v0, "soc"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LoP7;

    invoke-direct {v1}, LoP7;-><init>()V

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, LoP7;->a(I)LoP7;

    invoke-virtual {v1}, LoP7;->b()LHR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNd8;->j:LSk1;

    const-string v0, "socMetaBuildId"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LoP7;

    invoke-direct {v1}, LoP7;-><init>()V

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, LoP7;->a(I)LoP7;

    invoke-virtual {v1}, LoP7;->b()LHR7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LNd8;->k:LSk1;

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

    check-cast p1, LiS8;

    check-cast p2, LPd3;

    const/4 p1, 0x0

    throw p1
.end method