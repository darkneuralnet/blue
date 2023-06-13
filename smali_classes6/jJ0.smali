.class public final LjJ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyn1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LjJ0$b;
    }
.end annotation


# instance fields
.field public a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LAm1;",
            ">;"
        }
    .end annotation
.end field

.field public b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LX94<",
            "LUv4;",
            ">;>;"
        }
    .end annotation
.end field

.field public c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LSm1;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LX94<",
            "LU96;",
            ">;>;"
        }
    .end annotation
.end field

.field public e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            ">;"
        }
    .end annotation
.end field

.field public f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LBv0;",
            ">;"
        }
    .end annotation
.end field

.field public g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ">;"
        }
    .end annotation
.end field

.field public h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lxn1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LAn1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, LjJ0;->c(LAn1;)V

    return-void
.end method

.method public synthetic constructor <init>(LAn1;LjJ0$a;)V
    .locals 0

    invoke-direct {p0, p1}, LjJ0;-><init>(LAn1;)V

    return-void
.end method

.method public static b()LjJ0$b;
    .locals 2

    new-instance v0, LjJ0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LjJ0$b;-><init>(LjJ0$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Lxn1;
    .locals 1

    iget-object v0, p0, LjJ0;->h:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxn1;

    return-object v0
.end method

.method public final c(LAn1;)V
    .locals 8

    invoke-static {p1}, LCn1;->a(LAn1;)LCn1;

    move-result-object v0

    iput-object v0, p0, LjJ0;->a:LY94;

    invoke-static {p1}, LEn1;->a(LAn1;)LEn1;

    move-result-object v0

    iput-object v0, p0, LjJ0;->b:LY94;

    invoke-static {p1}, LDn1;->a(LAn1;)LDn1;

    move-result-object v0

    iput-object v0, p0, LjJ0;->c:LY94;

    invoke-static {p1}, LHn1;->a(LAn1;)LHn1;

    move-result-object v0

    iput-object v0, p0, LjJ0;->d:LY94;

    invoke-static {p1}, LFn1;->a(LAn1;)LFn1;

    move-result-object v0

    iput-object v0, p0, LjJ0;->e:LY94;

    invoke-static {p1}, LBn1;->a(LAn1;)LBn1;

    move-result-object v0

    iput-object v0, p0, LjJ0;->f:LY94;

    invoke-static {p1}, LGn1;->a(LAn1;)LGn1;

    move-result-object v7

    iput-object v7, p0, LjJ0;->g:LY94;

    iget-object v1, p0, LjJ0;->a:LY94;

    iget-object v2, p0, LjJ0;->b:LY94;

    iget-object v3, p0, LjJ0;->c:LY94;

    iget-object v4, p0, LjJ0;->d:LY94;

    iget-object v5, p0, LjJ0;->e:LY94;

    iget-object v6, p0, LjJ0;->f:LY94;

    invoke-static/range {v1 .. v7}, LIn1;->a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LIn1;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LjJ0;->h:LY94;

    return-void
.end method
