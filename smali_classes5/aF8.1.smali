.class public final LaF8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# static fields
.field public static final a:LaF8;

.field public static final b:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LaF8;

    invoke-direct {v0}, LaF8;-><init>()V

    sput-object v0, LaF8;->a:LaF8;

    const-string v0, "identifiedLanguage"

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

    sput-object v0, LaF8;->b:LSk1;

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

    check-cast p1, Ln19;

    check-cast p2, LPd3;

    const/4 p1, 0x0

    throw p1
.end method
