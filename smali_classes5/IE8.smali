.class public final LIE8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final a:LIE8;

.field public static final b:LSk1;

.field public static final c:LSk1;

.field public static final d:LSk1;

.field public static final e:LSk1;

.field public static final f:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LIE8;

    invoke-direct {v0}, LIE8;-><init>()V

    sput-object v0, LIE8;->a:LIE8;

    const-string v0, "inferenceCommonLogEvent"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lz08;

    invoke-direct {v1}, Lz08;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lz08;->a(I)Lz08;

    invoke-virtual {v1}, Lz08;->b()LD18;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LIE8;->b:LSk1;

    const-string v0, "options"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lz08;

    invoke-direct {v1}, Lz08;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lz08;->a(I)Lz08;

    invoke-virtual {v1}, Lz08;->b()LD18;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LIE8;->c:LSk1;

    const-string v0, "detectedBarcodeFormats"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lz08;

    invoke-direct {v1}, Lz08;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lz08;->a(I)Lz08;

    invoke-virtual {v1}, Lz08;->b()LD18;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LIE8;->d:LSk1;

    const-string v0, "detectedBarcodeValueTypes"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lz08;

    invoke-direct {v1}, Lz08;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lz08;->a(I)Lz08;

    invoke-virtual {v1}, Lz08;->b()LD18;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LIE8;->e:LSk1;

    const-string v0, "imageInfo"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    new-instance v1, Lz08;

    invoke-direct {v1}, Lz08;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lz08;->a(I)Lz08;

    invoke-virtual {v1}, Lz08;->b()LD18;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, LIE8;->f:LSk1;

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

    check-cast p1, LY79;

    check-cast p2, LPd3;

    sget-object v0, LIE8;->b:LSk1;

    invoke-virtual {p1}, LY79;->d()LY39;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LIE8;->c:LSk1;

    invoke-virtual {p1}, LY79;->e()LLk9;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LIE8;->d:LSk1;

    invoke-virtual {p1}, LY79;->a()LDR7;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LIE8;->e:LSk1;

    invoke-virtual {p1}, LY79;->b()LDR7;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, LIE8;->f:LSk1;

    invoke-virtual {p1}, LY79;->c()LJ29;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    return-void
.end method
