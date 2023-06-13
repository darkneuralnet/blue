.class public LTc0$a;
.super LTc0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTc0;->b(Ljava/util/UUID;LaD6;)LTc0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:LaD6;

.field public final synthetic d:Ljava/util/UUID;


# direct methods
.method public constructor <init>(LaD6;Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, LTc0$a;->c:LaD6;

    iput-object p2, p0, LTc0$a;->d:Ljava/util/UUID;

    invoke-direct {p0}, LTc0;-><init>()V

    return-void
.end method


# virtual methods
.method public g()V
    .locals 3

    iget-object v0, p0, LTc0$a;->c:LaD6;

    invoke-virtual {v0}, LaD6;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v1, p0, LTc0$a;->c:LaD6;

    iget-object v2, p0, LTc0$a;->d:Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, LTc0;->a(LaD6;Ljava/lang/String;)V

    invoke-virtual {v0}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, LEb5;->g()V

    iget-object v0, p0, LTc0$a;->c:LaD6;

    invoke-virtual {p0, v0}, LTc0;->f(LaD6;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, LEb5;->g()V

    throw v1
.end method
