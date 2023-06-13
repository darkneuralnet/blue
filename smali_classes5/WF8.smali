.class public final LWF8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final a:LWF8;

.field public static final b:LSk1;

.field public static final c:LSk1;

.field public static final d:LSk1;

.field public static final e:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LWF8;

    invoke-direct {v0}, LWF8;-><init>()V

    sput-object v0, LWF8;->a:LWF8;

    const-string v0, "inferenceCommonLogEvent"

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

    sput-object v0, LWF8;->b:LSk1;

    const-string v0, "imageInfo"

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

    sput-object v0, LWF8;->c:LSk1;

    const-string v0, "detectorOptions"

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

    sput-object v0, LWF8;->d:LSk1;

    const-string v0, "objectInfos"

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

    sput-object v0, LWF8;->e:LSk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, LL39;

    check-cast p2, LPd3;

    sget-object v0, LWF8;->b:LSk1;

    invoke-virtual {p1}, LL39;->c()LFU8;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LWF8;->c:LSk1;

    invoke-virtual {p1}, LL39;->b()LmT8;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LWF8;->d:LSk1;

    invoke-virtual {p1}, LL39;->d()LX29;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LWF8;->e:LSk1;

    invoke-virtual {p1}, LL39;->a()Lbw7;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    return-void
.end method
