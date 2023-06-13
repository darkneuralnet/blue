.class public Llf0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llf0;->f(Lf74;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LCA1<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lf74;

.field public final synthetic b:Llf0;


# direct methods
.method public constructor <init>(Llf0;Lf74;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Llf0$a;->b:Llf0;

    iput-object p2, p0, Llf0$a;->a:Lf74;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    invoke-static {}, LO36;->a()V

    iget-object p1, p0, Llf0$a;->a:Lf74;

    iget-object v0, p0, Llf0$a;->b:Llf0;

    iget-object v1, v0, Llf0;->b:Lf74;

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    iput-object p1, v0, Llf0;->b:Lf74;

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Llf0$a;->a(Ljava/lang/Void;)V

    return-void
.end method
