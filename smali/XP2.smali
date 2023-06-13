.class public final synthetic LXP2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/i;


# instance fields
.field public final synthetic b:LYP2;

.field public final synthetic c:Landroidx/lifecycle/f$b;

.field public final synthetic d:LvQ2;


# direct methods
.method public synthetic constructor <init>(LYP2;Landroidx/lifecycle/f$b;LvQ2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXP2;->b:LYP2;

    iput-object p2, p0, LXP2;->c:Landroidx/lifecycle/f$b;

    iput-object p3, p0, LXP2;->d:LvQ2;

    return-void
.end method


# virtual methods
.method public final onStateChanged(LLifecycleOwner;Landroidx/lifecycle/f$a;)V
    .locals 3

    iget-object v0, p0, LXP2;->b:LYP2;

    iget-object v1, p0, LXP2;->c:Landroidx/lifecycle/f$b;

    iget-object v2, p0, LXP2;->d:LvQ2;

    invoke-static {v0, v1, v2, p1, p2}, LYP2;->a(LYP2;Landroidx/lifecycle/f$b;LvQ2;LLifecycleOwner;Landroidx/lifecycle/f$a;)V

    return-void
.end method
