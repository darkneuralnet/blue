.class public final LSh7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final a:LSh7;

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

    new-instance v0, LSh7;

    invoke-direct {v0}, LSh7;-><init>()V

    sput-object v0, LSh7;->a:LSh7;

    const-string v0, "sdkVersion"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LF19;

    invoke-direct {v1}, LF19;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, LF19;->a(I)LF19;

    invoke-virtual {v1}, LF19;->b()Lt29;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LSh7;->b:LSk1;

    const-string v0, "osBuild"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LF19;

    invoke-direct {v1}, LF19;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, LF19;->a(I)LF19;

    invoke-virtual {v1}, LF19;->b()Lt29;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LSh7;->c:LSk1;

    const-string v0, "brand"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LF19;

    invoke-direct {v1}, LF19;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, LF19;->a(I)LF19;

    invoke-virtual {v1}, LF19;->b()Lt29;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LSh7;->d:LSk1;

    const-string v0, "device"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LF19;

    invoke-direct {v1}, LF19;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, LF19;->a(I)LF19;

    invoke-virtual {v1}, LF19;->b()Lt29;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LSh7;->e:LSk1;

    const-string v0, "hardware"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LF19;

    invoke-direct {v1}, LF19;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, LF19;->a(I)LF19;

    invoke-virtual {v1}, LF19;->b()Lt29;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LSh7;->f:LSk1;

    const-string v0, "manufacturer"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LF19;

    invoke-direct {v1}, LF19;-><init>()V

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, LF19;->a(I)LF19;

    invoke-virtual {v1}, LF19;->b()Lt29;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LSh7;->g:LSk1;

    const-string v0, "model"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LF19;

    invoke-direct {v1}, LF19;-><init>()V

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, LF19;->a(I)LF19;

    invoke-virtual {v1}, LF19;->b()Lt29;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LSh7;->h:LSk1;

    const-string v0, "product"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LF19;

    invoke-direct {v1}, LF19;-><init>()V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, LF19;->a(I)LF19;

    invoke-virtual {v1}, LF19;->b()Lt29;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LSh7;->i:LSk1;

    const-string v0, "soc"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LF19;

    invoke-direct {v1}, LF19;-><init>()V

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, LF19;->a(I)LF19;

    invoke-virtual {v1}, LF19;->b()Lt29;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LSh7;->j:LSk1;

    const-string v0, "socMetaBuildId"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LF19;

    invoke-direct {v1}, LF19;-><init>()V

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, LF19;->a(I)LF19;

    invoke-virtual {v1}, LF19;->b()Lt29;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LSh7;->k:LSk1;

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

    check-cast p1, LJm7;

    check-cast p2, LPd3;

    const/4 p1, 0x0

    throw p1
.end method
