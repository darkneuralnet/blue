.class public final synthetic Lf20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appboy/events/IEventSubscriber;


# instance fields
.field public final synthetic a:Li20;


# direct methods
.method public synthetic constructor <init>(Li20;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf20;->a:Li20;

    return-void
.end method


# virtual methods
.method public final trigger(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lf20;->a:Li20;

    check-cast p1, Leq5;

    invoke-static {v0, p1}, Li20;->l(Li20;Leq5;)V

    return-void
.end method
