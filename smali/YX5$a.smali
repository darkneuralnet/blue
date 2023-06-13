.class public LYX5$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYX5;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "LWX5;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LYX5;


# direct methods
.method public constructor <init>(LYX5;LEb5;)V
    .locals 0

    iput-object p1, p0, LYX5$a;->d:LYX5;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LWX5;

    invoke-virtual {p0, p1, p2}, LYX5$a;->p(LqV5;LWX5;)V

    return-void
.end method

.method public p(LqV5;LWX5;)V
    .locals 3

    iget-object v0, p2, LWX5;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, LWX5;->a()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, LoV5;->S0(IJ)V

    iget p2, p2, LWX5;->c:I

    int-to-long v0, p2

    const/4 p2, 0x3

    invoke-interface {p1, p2, v0, v1}, LoV5;->S0(IJ)V

    return-void
.end method
