.class public final LYx8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final a:LYx8;

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

    new-instance v0, LYx8;

    invoke-direct {v0}, LYx8;-><init>()V

    sput-object v0, LYx8;->a:LYx8;

    const-string v0, "durationMs"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LQW7;

    invoke-direct {v1}, LQW7;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, LQW7;->a(I)LQW7;

    invoke-virtual {v1}, LQW7;->b()LKY7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LYx8;->b:LSk1;

    const-string v0, "errorCode"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LQW7;

    invoke-direct {v1}, LQW7;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, LQW7;->a(I)LQW7;

    invoke-virtual {v1}, LQW7;->b()LKY7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LYx8;->c:LSk1;

    const-string v0, "isColdCall"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LQW7;

    invoke-direct {v1}, LQW7;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, LQW7;->a(I)LQW7;

    invoke-virtual {v1}, LQW7;->b()LKY7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LYx8;->d:LSk1;

    const-string v0, "autoManageModelOnBackground"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LQW7;

    invoke-direct {v1}, LQW7;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, LQW7;->a(I)LQW7;

    invoke-virtual {v1}, LQW7;->b()LKY7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LYx8;->e:LSk1;

    const-string v0, "autoManageModelOnLowMemory"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LQW7;

    invoke-direct {v1}, LQW7;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, LQW7;->a(I)LQW7;

    invoke-virtual {v1}, LQW7;->b()LKY7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LYx8;->f:LSk1;

    const-string v0, "isNnApiEnabled"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LQW7;

    invoke-direct {v1}, LQW7;-><init>()V

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, LQW7;->a(I)LQW7;

    invoke-virtual {v1}, LQW7;->b()LKY7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LYx8;->g:LSk1;

    const-string v0, "eventsCount"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LQW7;

    invoke-direct {v1}, LQW7;-><init>()V

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, LQW7;->a(I)LQW7;

    invoke-virtual {v1}, LQW7;->b()LKY7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LYx8;->h:LSk1;

    const-string v0, "otherErrors"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LQW7;

    invoke-direct {v1}, LQW7;-><init>()V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, LQW7;->a(I)LQW7;

    invoke-virtual {v1}, LQW7;->b()LKY7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LYx8;->i:LSk1;

    const-string v0, "remoteConfigValueForAcceleration"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LQW7;

    invoke-direct {v1}, LQW7;-><init>()V

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, LQW7;->a(I)LQW7;

    invoke-virtual {v1}, LQW7;->b()LKY7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LYx8;->j:LSk1;

    const-string v0, "isAccelerated"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, LQW7;

    invoke-direct {v1}, LQW7;-><init>()V

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, LQW7;->a(I)LQW7;

    invoke-virtual {v1}, LQW7;->b()LKY7;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LYx8;->k:LSk1;

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

    check-cast p1, Lv29;

    check-cast p2, LPd3;

    sget-object v0, LYx8;->b:LSk1;

    invoke-virtual {p1}, Lv29;->e()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LYx8;->c:LSk1;

    invoke-virtual {p1}, Lv29;->a()LV39;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LYx8;->d:LSk1;

    invoke-virtual {p1}, Lv29;->d()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LYx8;->e:LSk1;

    invoke-virtual {p1}, Lv29;->b()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LYx8;->f:LSk1;

    invoke-virtual {p1}, Lv29;->c()Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, LYx8;->g:LSk1;

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, LYx8;->h:LSk1;

    invoke-interface {p2, p1, v0}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, LYx8;->i:LSk1;

    invoke-interface {p2, p1, v0}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, LYx8;->j:LSk1;

    invoke-interface {p2, p1, v0}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object p1, LYx8;->k:LSk1;

    invoke-interface {p2, p1, v0}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    return-void
.end method
