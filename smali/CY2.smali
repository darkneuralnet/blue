.class public final synthetic LCY2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/i;


# instance fields
.field public final synthetic b:LDY2;


# direct methods
.method public synthetic constructor <init>(LDY2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCY2;->b:LDY2;

    return-void
.end method


# virtual methods
.method public final onStateChanged(LLifecycleOwner;Landroidx/lifecycle/f$a;)V
    .locals 1

    iget-object v0, p0, LCY2;->b:LDY2;

    invoke-static {v0, p1, p2}, LDY2;->a(LDY2;LLifecycleOwner;Landroidx/lifecycle/f$a;)V

    return-void
.end method
