.class public final synthetic Ls31;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/i;


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:LAY2;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;LAY2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls31;->b:Ljava/util/List;

    iput-object p2, p0, Ls31;->c:LAY2;

    return-void
.end method


# virtual methods
.method public final onStateChanged(LLifecycleOwner;Landroidx/lifecycle/f$a;)V
    .locals 2

    iget-object v0, p0, Ls31;->b:Ljava/util/List;

    iget-object v1, p0, Ls31;->c:LAY2;

    invoke-static {v0, v1, p1, p2}, Lr31$d;->a(Ljava/util/List;LAY2;LLifecycleOwner;Landroidx/lifecycle/f$a;)V

    return-void
.end method
