.class public final synthetic LM64;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/lifecycle/n;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM64;->b:Landroidx/lifecycle/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LM64;->b:Landroidx/lifecycle/n;

    invoke-static {v0}, Landroidx/lifecycle/n;->a(Landroidx/lifecycle/n;)V

    return-void
.end method
