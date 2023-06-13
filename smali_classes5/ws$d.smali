.class public final Lws$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lws;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LOd3<",
        "Lsx2;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lws$d;

.field public static final b:LSk1;

.field public static final c:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lws$d;

    invoke-direct {v0}, Lws$d;-><init>()V

    sput-object v0, Lws$d;->a:Lws$d;

    const-string v0, "logSource"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lws$d;->b:LSk1;

    const-string v0, "logEventDropped"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lws$d;->c:LSk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lsx2;LPd3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Lws$d;->b:LSk1;

    invoke-virtual {p1}, Lsx2;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lws$d;->c:LSk1;

    invoke-virtual {p1}, Lsx2;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lsx2;

    check-cast p2, LPd3;

    invoke-virtual {p0, p1, p2}, Lws$d;->a(Lsx2;LPd3;)V

    return-void
.end method
