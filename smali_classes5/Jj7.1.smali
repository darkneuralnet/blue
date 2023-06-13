.class public final LJj7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final a:LJj7;

.field public static final b:LSk1;

.field public static final c:LSk1;

.field public static final d:LSk1;

.field public static final e:LSk1;

.field public static final f:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LJj7;

    invoke-direct {v0}, LJj7;-><init>()V

    sput-object v0, LJj7;->a:LJj7;

    const-string v0, "durationMs"

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

    sput-object v0, LJj7;->b:LSk1;

    const-string v0, "handledErrors"

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

    sput-object v0, LJj7;->c:LSk1;

    const-string v0, "partiallyHandledErrors"

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

    sput-object v0, LJj7;->d:LSk1;

    const-string v0, "unhandledErrors"

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

    sput-object v0, LJj7;->e:LSk1;

    const-string v0, "httpResponseCode"

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

    sput-object v0, LJj7;->f:LSk1;

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

    check-cast p1, LBm7;

    check-cast p2, LPd3;

    sget-object v0, LJj7;->b:LSk1;

    invoke-virtual {p1}, LBm7;->e()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LJj7;->c:LSk1;

    invoke-virtual {p1}, LBm7;->a()LvU8;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LJj7;->d:LSk1;

    invoke-virtual {p1}, LBm7;->b()LvU8;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LJj7;->e:LSk1;

    invoke-virtual {p1}, LBm7;->c()LvU8;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LJj7;->f:LSk1;

    invoke-virtual {p1}, LBm7;->d()Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    return-void
.end method
