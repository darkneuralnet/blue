.class public final Lhl8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final a:Lhl8;

.field public static final b:LSk1;

.field public static final c:LSk1;

.field public static final d:LSk1;

.field public static final e:LSk1;

.field public static final f:LSk1;

.field public static final g:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhl8;

    invoke-direct {v0}, Lhl8;-><init>()V

    sput-object v0, Lhl8;->a:Lhl8;

    const-string v0, "landmarkMode"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LjV7;

    invoke-direct {v1}, LjV7;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, LjV7;->a(I)LjV7;

    invoke-virtual {v1}, LjV7;->b()LmW7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhl8;->b:LSk1;

    const-string v0, "classificationMode"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LjV7;

    invoke-direct {v1}, LjV7;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, LjV7;->a(I)LjV7;

    invoke-virtual {v1}, LjV7;->b()LmW7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhl8;->c:LSk1;

    const-string v0, "performanceMode"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LjV7;

    invoke-direct {v1}, LjV7;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, LjV7;->a(I)LjV7;

    invoke-virtual {v1}, LjV7;->b()LmW7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhl8;->d:LSk1;

    const-string v0, "contourMode"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LjV7;

    invoke-direct {v1}, LjV7;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, LjV7;->a(I)LjV7;

    invoke-virtual {v1}, LjV7;->b()LmW7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhl8;->e:LSk1;

    const-string v0, "isTrackingEnabled"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LjV7;

    invoke-direct {v1}, LjV7;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, LjV7;->a(I)LjV7;

    invoke-virtual {v1}, LjV7;->b()LmW7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhl8;->f:LSk1;

    const-string v0, "minFaceSize"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LjV7;

    invoke-direct {v1}, LjV7;-><init>()V

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, LjV7;->a(I)LjV7;

    invoke-virtual {v1}, LjV7;->b()LmW7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lhl8;->g:LSk1;

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

    check-cast p1, LWJ8;

    check-cast p2, LPd3;

    sget-object v0, Lhl8;->b:LSk1;

    invoke-virtual {p1}, LWJ8;->c()LnJ8;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhl8;->c:LSk1;

    invoke-virtual {p1}, LWJ8;->a()LPI8;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhl8;->d:LSk1;

    invoke-virtual {p1}, LWJ8;->d()LzJ8;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhl8;->e:LSk1;

    invoke-virtual {p1}, LWJ8;->b()LbJ8;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhl8;->f:LSk1;

    invoke-virtual {p1}, LWJ8;->e()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lhl8;->g:LSk1;

    invoke-virtual {p1}, LWJ8;->f()Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    return-void
.end method
