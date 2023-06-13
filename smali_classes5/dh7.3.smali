.class public final Ldh7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final a:Ldh7;

.field public static final b:LSk1;

.field public static final c:LSk1;

.field public static final d:LSk1;

.field public static final e:LSk1;

.field public static final f:LSk1;

.field public static final g:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldh7;

    invoke-direct {v0}, Ldh7;-><init>()V

    sput-object v0, Ldh7;->a:Ldh7;

    const-string v0, "cameraSource"

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

    sput-object v0, Ldh7;->b:LSk1;

    const-string v0, "eventType"

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

    sput-object v0, Ldh7;->c:LSk1;

    const-string v0, "requestedPreviewHeight"

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

    sput-object v0, Ldh7;->d:LSk1;

    const-string v0, "requestedPreviewWidth"

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

    sput-object v0, Ldh7;->e:LSk1;

    const-string v0, "actualPreviewHeight"

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

    sput-object v0, Ldh7;->f:LSk1;

    const-string v0, "actualPreviewWidth"

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

    sput-object v0, Ldh7;->g:LSk1;

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

    check-cast p1, LUj7;

    check-cast p2, LPd3;

    const/4 p1, 0x0

    throw p1
.end method
