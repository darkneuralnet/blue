.class public final Lkc8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final a:Lkc8;

.field public static final b:LSk1;

.field public static final c:LSk1;

.field public static final d:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkc8;

    invoke-direct {v0}, Lkc8;-><init>()V

    sput-object v0, Lkc8;->a:Lkc8;

    const-string v0, "logEventKey"

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

    sput-object v0, Lkc8;->b:LSk1;

    const-string v0, "eventCount"

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

    sput-object v0, Lkc8;->c:LSk1;

    const-string v0, "inferenceDurationStats"

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

    sput-object v0, Lkc8;->d:LSk1;

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

    check-cast p1, Lm58;

    check-cast p2, LPd3;

    const/4 p1, 0x0

    throw p1
.end method