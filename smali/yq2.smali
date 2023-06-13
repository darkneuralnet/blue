.class public final synthetic Lyq2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/i;


# instance fields
.field public final synthetic b:Landroidx/lifecycle/g;

.field public final synthetic c:Lzh2;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/g;Lzh2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyq2;->b:Landroidx/lifecycle/g;

    iput-object p2, p0, Lyq2;->c:Lzh2;

    return-void
.end method


# virtual methods
.method public final onStateChanged(LLifecycleOwner;Landroidx/lifecycle/f$a;)V
    .locals 2

    iget-object v0, p0, Lyq2;->b:Landroidx/lifecycle/g;

    iget-object v1, p0, Lyq2;->c:Lzh2;

    invoke-static {v0, v1, p1, p2}, Landroidx/lifecycle/g;->a(Landroidx/lifecycle/g;Lzh2;LLifecycleOwner;Landroidx/lifecycle/f$a;)V

    return-void
.end method
