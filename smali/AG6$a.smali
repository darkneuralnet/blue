.class public LAG6$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAG6;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "LyG6;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LAG6;


# direct methods
.method public constructor <init>(LAG6;LEb5;)V
    .locals 0

    iput-object p1, p0, LAG6$a;->d:LAG6;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LyG6;

    invoke-virtual {p0, p1, p2}, LAG6$a;->p(LqV5;LyG6;)V

    return-void
.end method

.method public p(LqV5;LyG6;)V
    .locals 2

    invoke-virtual {p2}, LyG6;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LyG6;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, LyG6;->a()Landroidx/work/b;

    move-result-object p2

    invoke-static {p2}, Landroidx/work/b;->l(Landroidx/work/b;)[B

    move-result-object p2

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v0, p2}, LoV5;->X0(I[B)V

    :goto_1
    return-void
.end method
