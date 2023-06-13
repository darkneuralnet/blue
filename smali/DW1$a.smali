.class public LDW1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDW1;->o(Landroidx/camera/core/i;)V
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
.field public final synthetic a:Landroidx/camera/core/i;

.field public final synthetic b:LDW1;


# direct methods
.method public constructor <init>(LDW1;Landroidx/camera/core/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LDW1$a;->b:LDW1;

    iput-object p2, p0, LDW1$a;->a:Landroidx/camera/core/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, LDW1$a;->a:Landroidx/camera/core/i;

    invoke-interface {p1}, Landroidx/camera/core/i;->close()V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, LDW1$a;->a(Ljava/lang/Void;)V

    return-void
.end method
