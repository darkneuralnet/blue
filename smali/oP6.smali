.class public final synthetic LoP6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appboy/events/IEventSubscriber;


# instance fields
.field public final synthetic a:Lbo/app/z0;


# direct methods
.method public synthetic constructor <init>(Lbo/app/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoP6;->a:Lbo/app/z0;

    return-void
.end method


# virtual methods
.method public final trigger(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LoP6;->a:Lbo/app/z0;

    check-cast p1, Lbo/app/n1;

    invoke-static {v0, p1}, Lbo/app/z0;->k(Lbo/app/z0;Lbo/app/n1;)V

    return-void
.end method
