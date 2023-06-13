.class public final Lfn5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcn5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn5;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lfn5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;)",
            "Lfn5;"
        }
    .end annotation

    new-instance v0, Lfn5;

    invoke-direct {v0, p0}, Lfn5;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LEa;)Lcn5;
    .locals 0

    invoke-static {p0}, Len5;->a(LEa;)Lcn5;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcn5;

    return-object p0
.end method


# virtual methods
.method public b()Lcn5;
    .locals 1

    iget-object v0, p0, Lfn5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {v0}, Lfn5;->c(LEa;)Lcn5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfn5;->b()Lcn5;

    move-result-object v0

    return-object v0
.end method
