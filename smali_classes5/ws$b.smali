.class public final Lws$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LOd3<",
        "LSC1;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lws$b;

.field public static final b:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lws$b;

    invoke-direct {v0}, Lws$b;-><init>()V

    sput-object v0, Lws$b;->a:Lws$b;

    const-string v0, "storageMetrics"

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

    sput-object v0, Lws$b;->b:LSk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LSC1;LPd3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Lws$b;->b:LSk1;

    invoke-virtual {p1}, LSC1;->a()LdR5;

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

    check-cast p1, LSC1;

    check-cast p2, LPd3;

    invoke-virtual {p0, p1, p2}, Lws$b;->a(LSC1;LPd3;)V

    return-void
.end method
