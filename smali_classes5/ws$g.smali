.class public final Lws$g;
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
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LOd3<",
        "Lq46;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lws$g;

.field public static final b:LSk1;

.field public static final c:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lws$g;

    invoke-direct {v0}, Lws$g;-><init>()V

    sput-object v0, Lws$g;->a:Lws$g;

    const-string v0, "startMs"

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

    sput-object v0, Lws$g;->b:LSk1;

    const-string v0, "endMs"

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

    sput-object v0, Lws$g;->c:LSk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lq46;LPd3;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Lws$g;->b:LSk1;

    invoke-virtual {p1}, Lq46;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LPd3;->e(LSk1;J)LPd3;

    sget-object v0, Lws$g;->c:LSk1;

    invoke-virtual {p1}, Lq46;->a()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LPd3;->e(LSk1;J)LPd3;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lq46;

    check-cast p2, LPd3;

    invoke-virtual {p0, p1, p2}, Lws$g;->a(Lq46;LPd3;)V

    return-void
.end method
