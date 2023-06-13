.class public final Lxs$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOd3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LOd3<",
        "LBT2;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lxs$a;

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

.field public static final l:LSk1;

.field public static final m:LSk1;

.field public static final n:LSk1;

.field public static final o:LSk1;

.field public static final p:LSk1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxs$a;

    invoke-direct {v0}, Lxs$a;-><init>()V

    sput-object v0, Lxs$a;->a:Lxs$a;

    const-string v0, "projectNumber"

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

    sput-object v0, Lxs$a;->b:LSk1;

    const-string v0, "messageId"

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

    sput-object v0, Lxs$a;->c:LSk1;

    const-string v0, "instanceId"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lxs$a;->d:LSk1;

    const-string v0, "messageType"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lxs$a;->e:LSk1;

    const-string v0, "sdkPlatform"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lxs$a;->f:LSk1;

    const-string v0, "packageName"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lxs$a;->g:LSk1;

    const-string v0, "collapseKey"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lxs$a;->h:LSk1;

    const-string v0, "priority"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lxs$a;->i:LSk1;

    const-string v0, "ttl"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lxs$a;->j:LSk1;

    const-string v0, "topic"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lxs$a;->k:LSk1;

    const-string v0, "bulkId"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lxs$a;->l:LSk1;

    const-string v0, "event"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lxs$a;->m:LSk1;

    const-string v0, "analyticsLabel"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lxs$a;->n:LSk1;

    const-string v0, "campaignId"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/16 v2, 0xe

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lxs$a;->o:LSk1;

    const-string v0, "composerLabel"

    invoke-static {v0}, LSk1;->a(Ljava/lang/String;)LSk1$b;

    move-result-object v0

    invoke-static {}, Lnp;->b()Lnp;

    move-result-object v1

    const/16 v2, 0xf

    invoke-virtual {v1, v2}, Lnp;->c(I)Lnp;

    move-result-object v1

    invoke-virtual {v1}, Lnp;->a()LK94;

    move-result-object v1

    invoke-virtual {v0, v1}, LSk1$b;->b(Ljava/lang/annotation/Annotation;)LSk1$b;

    move-result-object v0

    invoke-virtual {v0}, LSk1$b;->a()LSk1;

    move-result-object v0

    sput-object v0, Lxs$a;->p:LSk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LBT2;LPd3;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Lxs$a;->b:LSk1;

    invoke-virtual {p1}, LBT2;->l()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LPd3;->e(LSk1;J)LPd3;

    sget-object v0, Lxs$a;->c:LSk1;

    invoke-virtual {p1}, LBT2;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lxs$a;->d:LSk1;

    invoke-virtual {p1}, LBT2;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lxs$a;->e:LSk1;

    invoke-virtual {p1}, LBT2;->i()LBT2$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lxs$a;->f:LSk1;

    invoke-virtual {p1}, LBT2;->m()LBT2$d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lxs$a;->g:LSk1;

    invoke-virtual {p1}, LBT2;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lxs$a;->h:LSk1;

    invoke-virtual {p1}, LBT2;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lxs$a;->i:LSk1;

    invoke-virtual {p1}, LBT2;->k()I

    move-result v1

    invoke-interface {p2, v0, v1}, LPd3;->d(LSk1;I)LPd3;

    sget-object v0, Lxs$a;->j:LSk1;

    invoke-virtual {p1}, LBT2;->o()I

    move-result v1

    invoke-interface {p2, v0, v1}, LPd3;->d(LSk1;I)LPd3;

    sget-object v0, Lxs$a;->k:LSk1;

    invoke-virtual {p1}, LBT2;->n()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lxs$a;->l:LSk1;

    invoke-virtual {p1}, LBT2;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LPd3;->e(LSk1;J)LPd3;

    sget-object v0, Lxs$a;->m:LSk1;

    invoke-virtual {p1}, LBT2;->f()LBT2$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lxs$a;->n:LSk1;

    invoke-virtual {p1}, LBT2;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LPd3;->f(LSk1;Ljava/lang/Object;)LPd3;

    sget-object v0, Lxs$a;->o:LSk1;

    invoke-virtual {p1}, LBT2;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LPd3;->e(LSk1;J)LPd3;

    sget-object v0, Lxs$a;->p:LSk1;

    invoke-virtual {p1}, LBT2;->e()Ljava/lang/String;

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

    check-cast p1, LBT2;

    check-cast p2, LPd3;

    invoke-virtual {p0, p1, p2}, Lxs$a;->a(LBT2;LPd3;)V

    return-void
.end method
